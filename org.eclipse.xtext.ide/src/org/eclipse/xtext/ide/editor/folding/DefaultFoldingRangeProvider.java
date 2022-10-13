/*******************************************************************************
 * Copyright (c) 2010, 2021 Michael Clay and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 *******************************************************************************/
package org.eclipse.xtext.ide.editor.folding;

import java.util.Collection;
import java.util.SortedSet;
import java.util.TreeSet;

import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.documentation.impl.AbstractMultiLineCommentProvider;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.ILocationInFileProvider;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.util.ITextRegion;

import com.google.inject.Inject;
import com.google.inject.name.Named;

/**
 * @author Michael Clay - Initial contribution and API
 * @author Sebastian Zarnekow - Introduced FoldedRegion, use ILocationInFileProvider
 * @author Mark Sujew - Ported to IDE project
 * 
 * @since 2.26
 */
public class DefaultFoldingRangeProvider implements IFoldingRangeProvider {

	@Inject
	private ILocationInFileProvider locationInFileProvider;

	@Inject(optional = true)
	@Named(AbstractMultiLineCommentProvider.RULE)
	private String ruleName = "ML_COMMENT";

	@Override
	public SortedSet<FoldingRange> getFoldingRanges(XtextResource xtextDocument, CancelIndicator cancelIndicator) {
		SortedSet<FoldingRange> result = new TreeSet<>((a, b) -> Integer.compare(a.getOffset(), b.getOffset()));
		IFoldingRangeAcceptor foldingRegionAcceptor = createAcceptor(xtextDocument, result);
		computeObjectFolding(xtextDocument, foldingRegionAcceptor, cancelIndicator);
		computeCommentFolding(xtextDocument, foldingRegionAcceptor);
		return result;
	}

	protected void computeObjectFolding(XtextResource resource, IFoldingRangeAcceptor foldingRangeAcceptor,
			CancelIndicator cancelIndicator) {
		IParseResult parseResult = resource.getParseResult();
		if (parseResult != null) {
			EObject rootASTElement = parseResult.getRootASTElement();
			if (rootASTElement != null) {
				if (cancelIndicator.isCanceled())
					throw new OperationCanceledException();
				if (isHandled(rootASTElement)) {
					acceptObjectFolding(rootASTElement, foldingRangeAcceptor);
				}
				if (shouldProcessContent(rootASTElement)) {
					TreeIterator<EObject> allContents = rootASTElement.eAllContents();
					while (allContents.hasNext()) {
						if (cancelIndicator.isCanceled())
							throw new OperationCanceledException();
						EObject eObject = allContents.next();
						if (isHandled(eObject)) {
							acceptObjectFolding(eObject, foldingRangeAcceptor);
						}
						if (!shouldProcessContent(eObject)) {
							allContents.prune();
						}
					}
				}
			}
		}
	}

	protected void acceptObjectFolding(EObject eObject, IFoldingRangeAcceptor foldingRangeAcceptor) {
		ITextRegion region = locationInFileProvider.getFullTextRegion(eObject);
		if (region != null) {
			foldingRangeAcceptor.accept(region.getOffset(), region.getLength(), null);
		}
	}

	protected void computeCommentFolding(XtextResource resource, IFoldingRangeAcceptor foldingRangeAcceptor) {
		IParseResult parseResult = resource.getParseResult();
		if (parseResult != null) {
			EObject rootASTElement = parseResult.getRootASTElement();
			acceptCommentNodes(rootASTElement, foldingRangeAcceptor);
		}
	}

	protected void acceptCommentNodes(EObject eObject, IFoldingRangeAcceptor foldingRangeAcceptor) {
		ICompositeNode node = NodeModelUtils.getNode(eObject);
		if (node != null) {
			for (INode leafNode : node.getAsTreeIterable()) {
				if (leafNode.getGrammarElement() instanceof TerminalRule
						&& ruleName.equalsIgnoreCase(((TerminalRule) leafNode.getGrammarElement()).getName())) {
					acceptCommentFolding(leafNode, foldingRangeAcceptor);
				}
			}
		}
	}

	protected void acceptCommentFolding(INode commentNode, IFoldingRangeAcceptor foldingRangeAcceptor) {
		int offset = commentNode.getOffset();
		int length = commentNode.getLength();
		foldingRangeAcceptor.accept(offset, length, FoldingRangeKind.COMMENT);
	}

	protected IFoldingRangeAcceptor createAcceptor(XtextResource resource, Collection<FoldingRange> foldingRanges) {
		return new DefaultFoldingRangeAcceptor(foldingRanges);
	}

	protected ILocationInFileProvider getLocationInFileProvider() {
		return locationInFileProvider;
	}

	protected String getMultilineCommentRuleName() {
		return ruleName;
	}

	/**
	 * @return <code>true</code> if the object should be folded if it spans more than one line. Default is
	 *         <code>false</code> if and only if the object is the root object of the resource.
	 */
	protected boolean isHandled(EObject eObject) {
		return eObject.eContainer() != null;
	}

	/**
	 * @return clients should return <code>false</code> to abort the traversal of the model.
	 */
	protected boolean shouldProcessContent(EObject object) {
		return true;
	}
}
