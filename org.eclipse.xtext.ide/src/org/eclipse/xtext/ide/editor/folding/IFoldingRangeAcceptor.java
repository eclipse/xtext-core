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

/**
 * @author Michael Clay - Initial contribution and API
 * @author Sebastian Zarnekow - Distinguish between total and identifying region
 * @author Mark Sujew - Ported to IDE project
 * 
 * @since 2.26
 */
public interface IFoldingRangeAcceptor {

	void accept(int offset, int length, FoldingRangeKind kind);
}
