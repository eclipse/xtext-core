/*******************************************************************************
 * Copyright (c) 2017 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.xtext.generator

import com.google.inject.Inject
import org.eclipse.xtext.xtext.generator.parser.antlr.Antlr4ToolFacade
import org.eclipse.xtext.xtext.generator.parser.antlr.AntlrOptions
import org.eclipse.xtext.xtext.generator.parser.antlr.CodebuffAntlrGrammarGenerator
import org.eclipse.xtext.xtext.generator.parser.antlr.CodebuffGrammarNaming

/**
 * @author Holger Schill - Initial contribution and API
 */
class CodebuffGrammarGeneratorFragment extends AbstractXtextGeneratorFragment {

	@Inject CodebuffAntlrGrammarGenerator generator
	@Inject Antlr4ToolFacade antlrTool
	@Inject CodebuffGrammarNaming naming
	@Inject CodeConfig codeConfig

	override generate() {
		val fsa = projectConfig.runtime.srcGen
		generator.generate(grammar, new AntlrOptions(), fsa)
		val fileName = fsa.path + "/" + naming.getParserGrammar(grammar).grammarFileName
		antlrTool.runWithEncodingAndParams(fileName,codeConfig.encoding)
	}

}
