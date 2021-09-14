/*******************************************************************************
 * Copyright (c) 2021 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.ide.server.codeActions;

import java.util.List;

import javax.inject.Inject;

import org.eclipse.lsp4j.ExecuteCommandParams;
import org.eclipse.lsp4j.ResourceOperation;
import org.eclipse.lsp4j.TextDocumentEdit;
import org.eclipse.lsp4j.WorkspaceEdit;
import org.eclipse.lsp4j.jsonrpc.messages.Either;
import org.eclipse.xtext.ide.editor.quickfix.DiagnosticModificationContext;
import org.eclipse.xtext.ide.editor.quickfix.DiagnosticResolution;
import org.eclipse.xtext.ide.editor.quickfix.DiagnosticResolutionInfo;
import org.eclipse.xtext.ide.editor.quickfix.IQuickFixProvider;
import org.eclipse.xtext.ide.server.ILanguageServerAccess;
import org.eclipse.xtext.ide.server.codeActions.ICodeActionService2.Options;
import org.eclipse.xtext.ide.server.commands.IExecutableCommandService;
import org.eclipse.xtext.util.CancelIndicator;

import com.google.common.annotations.Beta;
import com.google.common.collect.Lists;

/**
 * Command service that handles quickfixes as commands
 * 
 * @author Heinrich Weichert
 * 
 * @since 2.26
 */
@Beta	
public class QuickFixExecutableCommandService implements IExecutableCommandService {

	@Inject
	protected DiagnosticModificationContext.Factory modificationContextFactory;

	@Inject
	protected IQuickFixProvider quickfixes;

	@Override
	public List<String> initialize() {
		return Lists.newArrayList(quickfixes.getCommandProviderId());
	}

	@Override
	public Object execute(ExecuteCommandParams params, ILanguageServerAccess access, CancelIndicator cancelIndicator) {
		if (!cancelIndicator.isCanceled() && quickfixes.getCommandProviderId().equals(params.getCommand())) {
			executeQuickFix(params);
		}
		return null;
	}

	private void executeQuickFix(ExecuteCommandParams params) {
		DiagnosticResolutionInfo resolution = (DiagnosticResolutionInfo) params.getArguments().get(0);
		Options options = resolution.getOptions();
		List<DiagnosticResolution> applyableQuickFixes = quickfixes.resolveResolution(resolution);
		for (DiagnosticResolution quickfix: applyableQuickFixes) {
			WorkspaceEdit edit = quickfix.apply();
			for (Either<TextDocumentEdit, ResourceOperation> change : edit.getDocumentChanges()) {
				options.getDocument().applyChanges(change.getLeft().getEdits());
			}
		}
	}

}