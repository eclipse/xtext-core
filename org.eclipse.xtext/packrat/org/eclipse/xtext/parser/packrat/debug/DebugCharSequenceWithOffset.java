/*******************************************************************************
 * Copyright (c) 2008 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.parser.packrat.debug;

import org.apache.log4j.Logger;
import org.eclipse.xtext.parser.packrat.ICharSequenceWithOffset;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public class DebugCharSequenceWithOffset extends DebugCharSequence implements ICharSequenceWithOffset {

	private static final Logger log = Logger.getLogger(DebugCharSequenceWithOffset.class);

	private final ICharSequenceWithOffset delegate;

	public DebugCharSequenceWithOffset(ICharSequenceWithOffset delegate) {
		super(delegate);
		this.delegate = delegate;
	}

	@Override
	public int getOffset() {
		int result = delegate.getOffset();
		if (log.isTraceEnabled()) {
			log.trace("getOffset() = " + result);
		}
		return result;
	}

	@Override
	public void incOffset() {
		if (log.isTraceEnabled()) {
			log.trace("incOffset()");
		}
		delegate.incOffset();
	}

	@Override
	public void incOffset(int amount) {
		if (log.isTraceEnabled()) {
			log.trace("incOffset(" + amount + ")");
		}
		delegate.incOffset(amount);
	}

	@Override
	public void setOffset(int offset) {
		if (log.isTraceEnabled()) {
			log.trace("setOffset(" + offset + ")");
		}
		delegate.setOffset(offset);
	}

}
