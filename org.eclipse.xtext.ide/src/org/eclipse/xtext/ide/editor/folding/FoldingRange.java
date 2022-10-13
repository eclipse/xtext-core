/*******************************************************************************
 * Copyright (c) 2021 TypeFox GmbH (http://www.typefox.io) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.ide.editor.folding;

import com.google.common.base.Objects;

/**
 * Represents an abstraction for different folding implementations.
 * Specifically Eclipse's <code>FoldingRegion</code> and the <code>FoldingRange</code> of the LSP specification.
 * 
 * @author Mark Sujew - Initial contribution and API
 * 
 * @since 2.26
 */
public class FoldingRange {

	private final int offset;
	private final int length;
	private final FoldingRangeKind kind;

	public FoldingRange(int offset, int length) {
		this(offset, length, null);
	}

	public FoldingRange(int offset, int length, FoldingRangeKind kind) {
		this.offset = offset;
		this.length = length;
		this.kind = kind;
	}

	public FoldingRangeKind getKind() {
		return kind;
	}

	public int getOffset() {
		return offset;
	}

	public int getLength() {
		return length;
	}

	@Override
	public boolean equals(Object other) {
		if (other instanceof FoldingRange) {
			FoldingRange range = (FoldingRange) other;
			return offset == range.offset && length == range.length
					&& Objects.equal(kind, range.kind);
		}
		return false;
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(offset, length, kind);
	}
	
	@Override
	public String toString() {
		StringBuilder content = new StringBuilder();
		content.append("offset=").append(offset);
		content.append(", length=").append(length);
		content.append(", kind=").append(kind);
		return content.toString();
	}
}
