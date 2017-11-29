/*******************************************************************************
 * Copyright (c) 2017 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.xtext.generator

import com.google.inject.Inject
import java.io.File
import org.eclipse.xtext.util.Files
import org.eclipse.xtext.xtext.generator.parser.antlr.Antlr4ToolFacade
import org.eclipse.xtext.xtext.generator.parser.antlr.AntlrOptions
import org.eclipse.xtext.xtext.generator.parser.antlr.CodebuffAntlrGrammarGenerator
import org.eclipse.xtext.xtext.generator.parser.antlr.CodebuffGrammarNaming
import org.eclipse.xtext.xtext.generator.parser.antlr.CodebuffToolFacade

/**
 * @author Holger Schill - Initial contribution and API
 */
class CodebuffGrammarGeneratorFragment extends AbstractXtextGeneratorFragment {

	@Inject CodebuffAntlrGrammarGenerator generator
	@Inject Antlr4ToolFacade antlrTool
	@Inject CodebuffToolFacade codebuffTool
	@Inject CodebuffGrammarNaming naming
	@Inject CodeConfig codeConfig

	override generate() {
		val fsa = projectConfig.runtime.srcGen	
		generator.generate(grammar, new AntlrOptions(), fsa)
		val file = new File(fsa.path)
		val root = projectConfig.runtime.root
		
//		val antlr4gen = new File(root.path + "/antlr4gen/");
//		if(antlr4gen.exists)
//			Files.cleanFolder(antlr4gen,null,true,true)
//		antlr4gen.mkdir
//		new File(root.path + "/antlr4gen/target/").mkdirs;
//		new File(root.path + "/antlr4gen/src-gen/").mkdirs
		if (file.exists) {
			val fileName = file.absolutePath + "/" + naming.getParserGrammar(grammar).grammarFileName
			antlrTool.runWithEncodingAndParams(fileName, codeConfig.encoding)
			codebuffTool.initializeCodebuff()
			
		}
	}
}
