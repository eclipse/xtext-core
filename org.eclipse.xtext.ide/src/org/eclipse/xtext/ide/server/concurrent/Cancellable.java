/*******************************************************************************
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.ide.server.concurrent;

/**
 * A functional interface that indicates something that can be cancelled.
 * 
 * @author kosyakov - Initial contribution and API
 * @since 2.11
 */
public interface Cancellable {
	/**
	 * Attempt to cancel.
	 */
	void cancel();
}