package org.eclipse.xtext.ide.editor.quickfix;

/*******************************************************************************
 * Copyright (c) 2020 TypeFox GmbH (http://www.typefox.io) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;
import org.eclipse.lsp4j.Diagnostic;
import org.eclipse.xtext.Constants;
import org.eclipse.xtext.ide.server.codeActions.ICodeActionService2.Options;

import com.google.common.annotations.Beta;
import com.google.common.base.Strings;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.name.Named;

/**
 * @author Heinrich Weichert
 * 
 * @since 2.24
 */
@Beta
public abstract class AbstractDeclarativeIdeQuickfixProvider implements IQuickFixProvider {

	@Inject
	private Provider<DiagnosticResolutionAcceptor> issueResolutionAcceptorProvider;

	@Inject
	@Named(Constants.LANGUAGE_NAME)
	private String languageName;

	private static final Logger LOG = Logger.getLogger(AbstractDeclarativeIdeQuickfixProvider.class);

	protected boolean isQuickMethodForIssueCode(Method input, String issueCode) {
		for (QuickFix annotation : input.getAnnotationsByType(QuickFix.class)) {
			boolean result = annotation != null && Objects.equals(issueCode, annotation.value())
					&& input.getParameterTypes().length == 1 && Void.TYPE == input.getReturnType()
					&& input.getParameterTypes()[0].isAssignableFrom(DiagnosticResolutionAcceptor.class);
			if (result) {
				return true;
			}
		}
		return false;
	}

	private List<DiagnosticResolution> getQuickFixes(DiagnosticResolutionInfo info) {
		DiagnosticResolutionAcceptor issueResolutionAcceptor = issueResolutionAcceptorProvider.get();

		Method method = findMethodById(info);
		try {
			// will throw if this is not a public method, but it should be
			method.invoke(this, issueResolutionAcceptor);
		} catch (Exception e) {
			LOG.error("Error executing fix method", e);
		}
		return issueResolutionAcceptor.getDiagnosticResolutions(info.getOptions());
	}

	private Method findMethodById(DiagnosticResolutionInfo info) {
		return getQuickFixMethodsForIssue(info.getIssue()).stream()
				.filter(method -> calculateMethodId(method).equals(info.getId())).findFirst()
				.orElseThrow(IllegalArgumentException::new);
	}

	private List<DiagnosticResolutionInfo> collectPossibleQuickFixes(Iterable<Method> methods) {
		DiagnosticResolutionAcceptor issueResolutionAcceptor = issueResolutionAcceptorProvider.get();
		for (Method method : methods) {
			issueResolutionAcceptor.setCurrentId(calculateMethodId(method));
			try {
				// will throw if this is not a public method, but it should be
				method.invoke(this, issueResolutionAcceptor);
			} catch (Exception e) {
				LOG.error("Error executing fix method", e);
			}
		}
		return issueResolutionAcceptor.getDiagnosticResolutionInfos();
	}

	protected String calculateMethodId(Method method) {
		return method.getName();
	}

	private List<Method> collectQuickMethodsForIssueCode(Class<?> clazz, String issueCode) {
		return Arrays.stream(clazz.getMethods()).filter(method -> isQuickMethodForIssueCode(method, issueCode))
				.collect(Collectors.toList());
	}

	private List<Method> getQuickFixMethodsForIssue(Diagnostic issue) {
		if (Strings.isNullOrEmpty(issue.getCode().getLeft())) {
			return Collections.emptyList();
		}
		return collectQuickMethodsForIssueCode(getClass(), issue.getCode().getLeft());
	}

	@Override
	public List<DiagnosticResolutionInfo> getResolutions(Diagnostic issue, Options options) {
		if (issue == null || issue.getCode() == null || issue.getMessage() == null || issue.getSeverity() == null) {
			return Collections.emptyList();
		}
		List<DiagnosticResolutionInfo> resolutions = collectPossibleQuickFixes(getQuickFixMethodsForIssue(issue));
		for (DiagnosticResolutionInfo info : resolutions) {
			info.setIssue(issue);
			info.setOptions(options);
		}
		return resolutions;
	}

	@Override
	public List<DiagnosticResolution> resolveResolution(DiagnosticResolutionInfo info) {
		return getQuickFixes(info);
	}

	@Override
	public String getCommandProviderId() {
		return "quickfix:" + languageName;
	}

}
