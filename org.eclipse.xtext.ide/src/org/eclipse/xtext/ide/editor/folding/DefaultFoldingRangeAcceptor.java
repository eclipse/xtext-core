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

/**
 * @author Michael Clay - Initial contribution and API
 * @author Sebastian Zarnekow - Introduced FoldedPosition
 * @author Mark Sujew - Ported to IDE project
 * 
 * @since 2.26
 */
public class DefaultFoldingRangeAcceptor implements IFoldingRangeAcceptor {
	private final Collection<FoldingRange> result;

	public DefaultFoldingRangeAcceptor(Collection<FoldingRange> result) {
		this.result = result;
	}

	public Collection<FoldingRange> getFoldingRanges() {
		return result;
	}

	protected FoldingRange createFoldingRange(int offset, int length, FoldingRangeKind kind) {
		return new FoldingRange(offset, length, kind);
	}
	
	@Override
	public void accept(int offset, int length, FoldingRangeKind kind) {
		result.add(createFoldingRange(offset, length, kind));
	}
}
