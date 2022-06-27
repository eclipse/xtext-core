/*******************************************************************************
 * Copyright (c) 2020 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.ide.server.codeActions;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import javax.inject.Inject;

import org.eclipse.lsp4j.CodeAction;
import org.eclipse.lsp4j.CodeActionKind;
import org.eclipse.lsp4j.CodeActionParams;
import org.eclipse.lsp4j.Command;
import org.eclipse.lsp4j.Diagnostic;
import org.eclipse.lsp4j.jsonrpc.messages.Either;
import org.eclipse.xtext.ide.editor.quickfix.AbstractDeclarativeIdeQuickfixProvider;
import org.eclipse.xtext.ide.editor.quickfix.DiagnosticResolution;
import org.eclipse.xtext.ide.editor.quickfix.IQuickFixProvider;
import org.eclipse.xtext.ide.editor.quickfix.QuickFix;

import com.google.common.annotations.Beta;

/**
 * {@link ICodeActionService2} handling quick-fixes annotated with {@link CodeActionKind#QuickFix}.
 *
 * @author Heinrich Weichert
 *
 * @see AbstractDeclarativeIdeQuickfixProvider
 * @see QuickFix
 *
 * @since 2.24
 */
@Beta
public class QuickFixCodeActionService implements ICodeActionService2 {

	@Inject
	private IQuickFixProvider quickfixes;

	@Override
	public List<Either<Command, CodeAction>> getCodeActions(Options options, List<Method> fixMethods) {
		boolean handleQuickfixes = options.getCodeActionParams().getContext().getOnly() == null
				|| options.getCodeActionParams().getContext().getOnly().isEmpty()
				|| options.getCodeActionParams().getContext().getOnly().contains(CodeActionKind.QuickFix);

		if (!handleQuickfixes) {
			return Collections.emptyList();
		}

		List<Either<Command, CodeAction>> result = new ArrayList<>();
		for (Diagnostic diagnostic : options.getCodeActionParams().getContext().getDiagnostics()) {
			List<DiagnosticResolution> resolutions = quickfixes.getResolutions(options, fixMethods).stream()
					.sorted(Comparator.nullsLast(Comparator.comparing(DiagnosticResolution::getLabel)))
					.collect(Collectors.toList());
			for (DiagnosticResolution resolution : resolutions) {
				result.add(Either.forRight(createFix(resolution, diagnostic)));
			}
		}
		return result;
	}

	@Override
	public List<Method> getFixMethods(CodeActionParams codeActionParams) {
		List<Method> methods =  new ArrayList<>();
		for (Diagnostic diagnostic : codeActionParams.getContext().getDiagnostics()) {
			methods.addAll(quickfixes.getFixMethods(diagnostic));
		}
		return methods;
	}

	private CodeAction createFix(DiagnosticResolution resolution, Diagnostic diagnostic) {
		CodeAction codeAction = new CodeAction();
		codeAction.setDiagnostics(Collections.singletonList(diagnostic));
		codeAction.setTitle(resolution.getLabel());
		codeAction.setEdit(resolution.apply());
		codeAction.setKind(CodeActionKind.QuickFix);

		return codeAction;
	}

}
