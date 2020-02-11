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
import org.eclipse.xtext.parser.packrat.IMarkerFactory;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public class DebugMarkerFactory implements IMarkerFactory {

	private static final Logger log = Logger.getLogger(DebugMarkerFactory.class);
	
	private final IMarkerFactory delegate;
	
	public DebugMarkerFactory(IMarkerFactory delegate) {
		this.delegate = delegate;
	}
	
	@Override
	public IMarker mark() {
		if (log.isDebugEnabled()) {
			log.debug("mark()");
		}
		IMarker result = delegate.mark();
		if (log.isDebugEnabled()) {
			log.debug("mark() = " + result);
		}
		return new DebuggingMarker(result);
	}
	
	private static class DebuggingMarker implements IMarker {
		
		private final IMarker delegate;
		
		public DebuggingMarker(IMarker delegate) {
			this.delegate = delegate;
		}

		@Override
		public void rollback() {
			if (log.isDebugEnabled()) {
				log.debug("rollback(" + delegate + ")");
			}
			delegate.rollback();
		}

		@Override
		public void commit() {
			if (log.isDebugEnabled()) {
				log.debug("commit(" + delegate + ")");
			}
			delegate.commit();
		}

		@Override
		public void flush() {
			if (log.isDebugEnabled()) {
				log.debug("flush(" + delegate + ")");
			}
			delegate.flush();
		}
		
		@Override
		public IMarker fork() {
			if (log.isDebugEnabled()) {
				log.debug("fork(" + delegate + ")");
			}
			return new DebuggingMarker(delegate.fork());
		}

		@Override
		public IMarker join(IMarker forkedMarker) {
			IMarker join = forkedMarker instanceof DebuggingMarker ? ((DebuggingMarker)forkedMarker).delegate : forkedMarker;
			if (log.isDebugEnabled()) {
				log.debug("join(" + join + ")");
			}
			IMarker result = delegate.join(forkedMarker);
			if (delegate != result)
				return new DebuggingMarker(result);
			return this;
		}

		@Override
		public boolean equals(Object obj) {
			return obj == this || obj != null && (obj instanceof DebuggingMarker) && delegate.equals(((DebuggingMarker)obj).delegate);
		}

		@Override
		public int hashCode() {
			return delegate.hashCode() * 37;
		}

		@Override
		public String toString() {
			return getClass().getSimpleName() + " with delegate: " + delegate;
		}
	}
}
