/*******************************************************************************
 * Copyright (c) 2009 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.parser.packrat.consumers;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public interface IElementConsumer {

	/**
	 * Scan the configured input source for a consumable element at the current offset.
	 */
	int consume() throws Exception;

}
