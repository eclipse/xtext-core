/*******************************************************************************
 * Copyright (c) 2009 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.parser.packrat.debug;

import org.apache.log4j.Logger;
import org.eclipse.xtext.parser.packrat.IBacktracker;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public class DebugBacktracker implements IBacktracker {

	static final Logger log = Logger.getLogger(DebugBacktracker.class);

	private final IBacktracker delegate;

	public DebugBacktracker(IBacktracker delegate) {
		this.delegate = delegate;
	}

	@Override
	public IBacktrackingResult skipPreviousToken() {
		if (log.isDebugEnabled()) {
			log.debug("Trying to skip recently parsed optional token.");
		}
		final IBacktrackingResult result = delegate.skipPreviousToken();
		if (log.isDebugEnabled()) {
			log.debug("Skipping tokens returned '" + result + "'");
		}
		return result;
	}

}
