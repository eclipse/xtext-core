/**
 * Copyright (c) 2020 TypeFox GmbH (http://www.typefox.io) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.ide.tests.editor.quickfix;

import static org.eclipse.xtext.util.Strings.*;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.lsp4j.CodeActionContext;
import org.eclipse.lsp4j.CodeActionParams;
import org.eclipse.lsp4j.Diagnostic;
import org.eclipse.lsp4j.DiagnosticSeverity;
import org.eclipse.lsp4j.InitializeParams;
import org.eclipse.lsp4j.InitializeResult;
import org.eclipse.lsp4j.Position;
import org.eclipse.lsp4j.Range;
import org.eclipse.lsp4j.TextDocumentIdentifier;
import org.eclipse.lsp4j.TextEdit;
import org.eclipse.lsp4j.WorkspaceEdit;
import org.eclipse.lsp4j.services.LanguageClient;
import org.eclipse.xtext.ide.editor.quickfix.DiagnosticResolution;
import org.eclipse.xtext.ide.editor.quickfix.DiagnosticResolutionInfo;
import org.eclipse.xtext.ide.editor.quickfix.IQuickFixProvider;
import org.eclipse.xtext.ide.server.Document;
import org.eclipse.xtext.ide.server.ILanguageServerAccess;
import org.eclipse.xtext.ide.server.codeActions.ICodeActionService2;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.FileExtensionProvider;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.impl.ChunkedResourceDescriptions;
import org.eclipse.xtext.resource.impl.ResourceDescriptionsData;
import org.eclipse.xtext.testing.util.InMemoryURIHandler;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.util.LineAndColumn;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Pair;

import com.google.inject.Inject;

/**
 * @author Heinrich Weichert
 * 
 * @since 2.24
 */
public abstract class AbstractIdeQuickfixTest {

	protected static class QuickfixExpectation {

		private final String label;
		private final String description;
		private final String expectedResult;

		public QuickfixExpectation(String label, String description, String expectedResult) {
			this.label = label;
			this.description = description;
			this.expectedResult = expectedResult;
		}

		public String getLabel() {
			return label;
		}

		public String getDescription() {
			return description;
		}

		public String getExpectedResult() {
			return expectedResult;
		}
	}

	@Inject
	private IQuickFixProvider quickFixProvider;
	@Inject
	private QuickFixTestHelper quickFixTestHelper;
	@Inject
	private FileExtensionProvider fileExtensionProvider;

	/**
	 * Test that the expected quickfixes are offered on a given validation issue
	 * in a given DSL text.
	 *
	 * @param fileContents The initial DSL text.
	 * @param issueCode The code of the validation issue the offered quickfixes
	 * to test.
	 * @param quickfixes The quickfixes that are expected to be offered on the
	 * given <code>issueCode</code>. Each expected quickfix should be described
	 * by the following triple:
	 * <ol>
	 * <li>the quickfix label</li>
	 * <li>the quickfix description</li>
	 * <li>the DSL text after the quickfix application</li>
	 * </ol>
	 */
	protected void assertQuickfixesOn(String fileContents, String issueCode, EClass type, QuickfixExpectation... quickfixes) {
		String normalizedContents = toUnixLineSeparator(fileContents);
		quickfixesAreOffered(createInMemoryFile(normalizedContents, type), issueCode, normalizedContents, quickfixes);
	}

	protected void assertQuickFixOn(String fileContents, String expected, String quickFixLabel, String issueCode, EClass elementType) {
		QuickfixExpectation quickfix = new QuickfixExpectation(quickFixLabel, quickFixLabel, expected);
		assertQuickfixesOn(fileContents.toString(), issueCode, elementType, quickfix);
	}

	@SuppressWarnings("unchecked")
	private <T> T createInMemoryFile(CharSequence content, EClass type) {
		InMemoryURIHandler fs = new InMemoryURIHandler();
		String fileName = "inmemory:/file1." + fileExtensionProvider.getPrimaryFileExtension();
		Pair<String, String> _mappedTo = Pair.of(fileName, content.toString());
		quickFixTestHelper.operator_add(fs, _mappedTo);
		ResourceSet rs = quickFixTestHelper.createResourceSet(fs);
		Map<String, ResourceDescriptionsData> dataMap = new HashMap<>();
		dataMap.put("project", ResourceDescriptionsData.ResourceSetAdapter.findResourceDescriptionsData(rs));
		new ChunkedResourceDescriptions(dataMap, rs);
		return (T) quickFixTestHelper.findFirstOfTypeInFile(rs, fileName, type.getInstanceClass());
	}

	private void quickfixesAreOffered(EObject target, String issueCode, String originalText, QuickfixExpectation... expected) {
		List<QuickfixExpectation> expectedSorted = IterableExtensions.sortBy(Arrays.asList(expected), it -> it.label);
		ICompositeNode elementNode = NodeModelUtils.getNode(target);
		LineAndColumn elementStartPosition = NodeModelUtils.getLineAndColumn(elementNode, elementNode.getOffset());
		LineAndColumn elementEndPosition = NodeModelUtils.getLineAndColumn(elementNode, elementNode.getEndOffset());
		Position startPos = new Position(elementStartPosition.getLine() - 1, elementStartPosition.getColumn() - 1);
		Position endPos = new Position(elementEndPosition.getLine() - 1, elementEndPosition.getColumn() - 1);
		Diagnostic issue = new Diagnostic();
		issue.setCode(issueCode);
		issue.setMessage("error");
		issue.setSeverity(DiagnosticSeverity.Error);
		issue.setSource("source");
		issue.setRange(new Range(startPos, endPos));

		ICodeActionService2.Options options = new ICodeActionService2.Options();
		options.setCancelIndicator(CancelIndicator.NullImpl);
		options.setDocument(new Document(Integer.valueOf(0), originalText));
		options.setResource((XtextResource) target.eResource());
		options.setLanguageServerAccess(new ILanguageServerAccess() {
			@Override
			public void addBuildListener(ILanguageServerAccess.IBuildListener listener) {
				throw new UnsupportedOperationException();
			}

			@Override
			public <T extends Object> CompletableFuture<T> doRead(String uri, Function<ILanguageServerAccess.Context, T> function) {
				ILanguageServerAccess.Context ctx = new ILanguageServerAccess.Context(options.getResource(), options.getDocument(), true, CancelIndicator.NullImpl);
				return CompletableFuture.completedFuture(function.apply(ctx));
			}

			@Override
			public <T extends Object> CompletableFuture<T> doReadIndex(Function<? super ILanguageServerAccess.IndexContext, ? extends T> function) {
				return null;
			}

			@Override
			public InitializeParams getInitializeParams() {
				return null;
			}

			@Override
			public InitializeResult getInitializeResult() {
				return null;
			}

			@Override
			public LanguageClient getLanguageClient() {
				return null;
			}

			@Override
			public ResourceSet newLiveScopeResourceSet(URI uri) {
				// re-using the existing ResourceSet because it contains the URI
				// protocol mapping for "inmemory" resources.
				ResourceSet resourceSet = options.getResource().getResourceSet();
				return resourceSet;
			}
		});
		CodeActionParams codeActionParams = new CodeActionParams();
		codeActionParams.setRange(new Range(startPos, endPos));
		codeActionParams.setTextDocument(new TextDocumentIdentifier(target.eResource().getURI().toString()));

		CodeActionContext codeActionContext = new CodeActionContext();
		codeActionContext.setDiagnostics(Collections.singletonList(issue));
		codeActionParams.setContext(codeActionContext);

		options.setCodeActionParams(codeActionParams);

		List<DiagnosticResolutionInfo> actualIssueResolutions = IterableExtensions.sortBy(quickFixProvider.getResolutions(issue, options), DiagnosticResolutionInfo::getLabel);
		assertEquals("The number of quickfixes does not match!", expectedSorted.size(), actualIssueResolutions.size());

		for (int i = 0; i < actualIssueResolutions.size(); i++) {
			DiagnosticResolutionInfo resolutionInfo = actualIssueResolutions.get(i);
			QuickfixExpectation expectedIssueResolution = expectedSorted.get(i);

			assertEquals(expectedIssueResolution.label, resolutionInfo.getLabel());
			assertEquals(expectedIssueResolution.description, resolutionInfo.getLabel());

			List<DiagnosticResolution> allResolutions = quickFixProvider.resolveResolution(resolutionInfo);

			assertIssueResolutionResult(toUnixLineSeparator(expectedIssueResolution.getExpectedResult()), allResolutions.get(0), originalText, options.getDocument());
		}
	}

	private void assertIssueResolutionResult(String expectedResult, DiagnosticResolution actualIssueResolution, String originalText, Document doc) {
		WorkspaceEdit edit = actualIssueResolution.apply();
		List<TextEdit> edits = edit.getChanges().values().stream().flatMap(List::stream).collect(Collectors.toList());
		Document changedDocument = doc.applyChanges(edits);

		assertEquals(expectedResult, changedDocument.getContents());
	}
}
