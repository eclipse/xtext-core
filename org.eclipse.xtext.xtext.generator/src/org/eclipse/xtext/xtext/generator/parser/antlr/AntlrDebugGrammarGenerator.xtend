/*******************************************************************************
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.xtext.generator.parser.antlr

import com.google.inject.Inject
import org.eclipse.xtext.Grammar

class AntlrDebugGrammarGenerator extends AbstractAntlrGrammarGenerator {

	@Inject DebugGrammarNaming naming

	override protected getGrammarNaming() {
		naming
	}
	
	override protected compileParserOptions(Grammar it, AntlrOptions options) {
		""
	}

	override protected compileParserHeader(Grammar it, AntlrOptions options) {
		""
	}

	override protected compileLexerHeader(Grammar it, AntlrOptions options) {
		""
	}

}