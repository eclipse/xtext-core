/**
 * Copyright (c) 2017 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.xtext.generator;

import com.google.inject.Inject;
import org.eclipse.xtext.xtext.generator.AbstractXtextGeneratorFragment;
import org.eclipse.xtext.xtext.generator.CodeConfig;
import org.eclipse.xtext.xtext.generator.model.IXtextGeneratorFileSystemAccess;
import org.eclipse.xtext.xtext.generator.parser.antlr.Antlr4ToolFacade;
import org.eclipse.xtext.xtext.generator.parser.antlr.AntlrOptions;
import org.eclipse.xtext.xtext.generator.parser.antlr.CodebuffAntlrGrammarGenerator;
import org.eclipse.xtext.xtext.generator.parser.antlr.CodebuffGrammarNaming;

/**
 * @author Holger Schill - Initial contribution and API
 */
@SuppressWarnings("all")
public class CodebuffGrammarGeneratorFragment extends AbstractXtextGeneratorFragment {
  @Inject
  private CodebuffAntlrGrammarGenerator generator;
  
  @Inject
  private Antlr4ToolFacade antlrTool;
  
  @Inject
  private CodebuffGrammarNaming naming;
  
  @Inject
  private CodeConfig codeConfig;
  
  @Override
  public void generate() {
    final IXtextGeneratorFileSystemAccess fsa = this.getProjectConfig().getRuntime().getSrcGen();
    AntlrOptions _antlrOptions = new AntlrOptions();
    this.generator.generate(this.getGrammar(), _antlrOptions, fsa);
    String _path = fsa.getPath();
    String _plus = (_path + "/");
    String _grammarFileName = this.naming.getParserGrammar(this.getGrammar()).getGrammarFileName();
    final String fileName = (_plus + _grammarFileName);
    this.antlrTool.runWithEncodingAndParams(fileName, this.codeConfig.getEncoding());
  }
}
