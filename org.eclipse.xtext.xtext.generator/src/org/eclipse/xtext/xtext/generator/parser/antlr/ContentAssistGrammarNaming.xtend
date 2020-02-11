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
import org.eclipse.xtext.xtext.generator.XtextGeneratorNaming
import org.eclipse.xtext.xtext.generator.model.TypeReference

class ContentAssistGrammarNaming extends GrammarNaming {

	@Inject
	extension XtextGeneratorNaming

	protected override String getParserPackage(Grammar it) '''�genericIdeBasePackage�.contentassist.antlr'''

	override getLexerSuperClass(Grammar it) {
		new TypeReference("org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer")
	}
	
	override getInternalParserSuperClass(Grammar it) {
		new TypeReference("org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser")
	}
	
	override getParserSuperClass(Grammar it, boolean partialParsing) {
		if (partialParsing)
			new TypeReference("org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractPartialContentAssistParser")
		else
			new TypeReference("org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser")
	}
}