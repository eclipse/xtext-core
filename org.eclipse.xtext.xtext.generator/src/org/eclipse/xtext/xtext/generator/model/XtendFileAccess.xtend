/*******************************************************************************
 * Copyright (c) 2015, 2017 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.xtext.generator.model

import org.eclipse.xtext.xtext.generator.CodeConfig

/**
 * A utility class for generating Xtend files.
 */
class XtendFileAccess extends JavaFileAccess {
	
	/**
	 * A list of keywords in the Xtend language. Use this to avoid illegal variable names.
	 */
	public static val XTEND_KEYWORDS = #{
		'abstract', 'for', 'new', 'switch', 'default', 'package', 'synchronized', 'boolean',
		'do', 'if', 'private', 'this', 'double', 'implements', 'protected', 'throw', 'byte',
		'else', 'import', 'public', 'throws', 'case', 'enum', 'instanceof', 'return', 'transient',
		'catch', 'extends', 'int', 'short', 'try', 'char', 'final', 'interface', 'static',
		'void', 'class', 'finally', 'long', 'strictfp', 'volatile', 'float', 'native', 'super',
		'while', 'val', 'var', 'def', 'override', 'annotation', 'extension', 'create', 'dispatch'
	}
	
	protected new(TypeReference typeRef, CodeConfig codeConfig) {
		super(typeRef, codeConfig)
	}
	
	override protected getFileExtension() {
		'xtend'
	}
	
	override protected appendSemicolons() {
		false
	}
	
}
