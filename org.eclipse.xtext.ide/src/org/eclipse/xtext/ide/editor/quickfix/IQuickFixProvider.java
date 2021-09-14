/*******************************************************************************
 * Copyright (c) 2020 TypeFox GmbH (http://www.typefox.io) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.ide.editor.quickfix;

import java.util.List;

import org.eclipse.lsp4j.Diagnostic;
import org.eclipse.xtext.ide.server.codeActions.ICodeActionService2.Options;

import com.google.common.annotations.Beta;

/**
 * Quickfix for code actions in files.<br>
 * The quickfix itself is applied to a temporary resource.<br>
 * The textual edit can be composed by calling DiagnosticResolution#apply().
 *
 * @author Heinrich Weichert
 * 
 * @since 2.24
 */
@Beta
public interface IQuickFixProvider {

	/**
	 *
	 * Collects all possible quickfixes for the given issue. If there are none, returns an empty list
	 *
	 * @param options
	 *            Contextual action options
	 * @param issue
	 *            EMF diagnostic issue
	 * @param options
	 * @return 0..n resolutions for the given issue
	 */
	List<DiagnosticResolutionInfo> getResolutions(Diagnostic issue, Options options);

	/**
	 * Resolves the given handle to a concrete quickfix that manipulates local resources.
	 * 
	 * @param info
	 *            Quickfix information handle
	 * @return Quickfix that can be applied by the client
	 */
	List<DiagnosticResolution> resolveResolution(DiagnosticResolutionInfo info);

	/**
	 * @return an ID that identifies this provider. Used to distinguish the appropriate provider when applying
	 *         quickfixes.
	 */
	String getCommandProviderId();

}
