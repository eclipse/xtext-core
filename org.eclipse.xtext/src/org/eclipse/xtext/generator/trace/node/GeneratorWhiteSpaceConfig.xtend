/*******************************************************************************
 * Copyright (c) 2017 TypeFox GmbH (http://www.typefox.io) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.generator.trace.node

/**
 * @author Sven Efftinge - Initial contribution and API
 */
class GeneratorWhiteSpaceConfig {
	
	def String getIndentationString() {
		'  '
	}
	
	def String getLineDelimiter() {
		'\n'
	}
}