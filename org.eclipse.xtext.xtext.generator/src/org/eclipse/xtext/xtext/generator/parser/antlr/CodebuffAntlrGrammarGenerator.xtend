/*******************************************************************************
 * Copyright (c) 2017 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.xtext.generator.parser.antlr

import com.google.inject.Inject
import org.eclipse.xtext.AbstractElement
import org.eclipse.xtext.Grammar
import org.eclipse.xtext.TerminalRule
import static extension org.eclipse.xtext.xtext.generator.parser.antlr.CodebuffTerminalRuleToLexerBody.*

/**
 * @author Holger Schill - Initial contribution and API
 */
class CodebuffAntlrGrammarGenerator extends AbstractAntlrGrammarGenerator {
	@Inject CodebuffGrammarNaming naming

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
	
	protected override String ebnfPredicate(AbstractElement it, AntlrOptions options) ''''''
	
	protected override String dataTypeEbnfPredicate(AbstractElement it) ''''''
	
	protected override dispatch compileRule(TerminalRule it, Grammar grammar, AntlrOptions options) '''
		«IF options.isBacktrackLexer»
			«IF !isSyntheticTerminalRule(it)»
				«IF fragment»
					fragment «ruleName» : «toLexerBody»;
				«ELSE»
					fragment «ruleName» : FRAGMENT_«ruleName»;
					fragment FRAGMENT_«ruleName» : «toLexerBody»;
				«ENDIF»
			«ENDIF»
		«ELSE»
			«IF isSyntheticTerminalRule(it)»
				fragment «ruleName» : ;
			«ELSE»
				«IF fragment»fragment «ENDIF»«ruleName» : «toLexerBody»«IF shouldBeSkipped(grammar)» -> channel(HIDDEN)«ENDIF»;
			«ENDIF»
		«ENDIF»
	'''
}