/*******************************************************************************
 * Copyright (c) 2021 TypeFox GmbH (http://www.typefox.io) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.ide.editor.quickfix;

import org.eclipse.lsp4j.Diagnostic;
import org.eclipse.xtext.ide.server.codeActions.ICodeActionService2.Options;

/**
 * Lightweight quickfix identifier
 * 
 * @author Heinrich Weichert
 *
 * @since 2.26
 */
public class DiagnosticResolutionInfo {

	private String label;

	private int relevance;

	private Diagnostic issue;

	private String id;

	private Options options;

	public DiagnosticResolutionInfo(String label, String id) {
		this(label, id, 0);
	}

	public DiagnosticResolutionInfo(String label, String id, int relevance) {
		this.label = label;
		this.id = id;
		this.relevance = relevance;
	}

	public int getRelevance() {
		return relevance;
	}

	public String getLabel() {
		return label;
	}
	
	public String getId() {
		return id;
	}
	
	public Diagnostic getIssue() {
		return issue;
	}
	
	public void setIssue(Diagnostic issue) {
		this.issue = issue;
	}

	public Options getOptions() {
		return options;
	}
	
	public void setOptions(Options options) {
		this.options = options;
	}
}
