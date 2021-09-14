/*******************************************************************************
 * Copyright (c) 2020 TypeFox GmbH (http://www.typefox.io) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.ide.editor.quickfix;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ide.serializer.IChangeSerializer.IModification;
import org.eclipse.xtext.ide.server.codeActions.ICodeActionService2.Options;

import com.google.inject.Inject;

/**
 * @author Heinrich Weichert
 *
 * @since 2.24
 * 
 */
public class DiagnosticResolutionAcceptor {

	private List<DiagnosticResolution> resourceIssueResolutions = new ArrayList<>();

	private DiagnosticModificationContext.Factory modificationContextFactory;

	private String currentId;

	@Inject
	public DiagnosticResolutionAcceptor(DiagnosticModificationContext.Factory modificationContextFactory) {
		this.modificationContextFactory = modificationContextFactory;
	}

	public void accept(String label, IModification<EObject> modification) {
		resourceIssueResolutions.add(new DiagnosticResolution(label, modificationContextFactory, modification));
	}

	public List<DiagnosticResolutionInfo> getDiagnosticResolutionInfos() {
		List<DiagnosticResolutionInfo> infos = new ArrayList<>();
		for (DiagnosticResolution issueResolution : resourceIssueResolutions) {
			DiagnosticResolutionInfo info = new DiagnosticResolutionInfo(issueResolution.getLabel(), currentId, issueResolution.getRelevance());
			infos.add(info);
		}
		return infos;
	}

	public List<DiagnosticResolution> getDiagnosticResolutions(Options options) {
		resourceIssueResolutions.forEach(issue -> issue.configure(options));
		return resourceIssueResolutions;
	}

	/**
	 * Sets the current context ID (current QuickFix method)
	 */
	public void setCurrentId(String id) {
		this.currentId=id;
	}

}
