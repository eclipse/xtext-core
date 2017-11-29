/**
 * Copyright (c) 2017 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.xtext.generator;

import com.google.inject.Inject;
import java.io.File;
import org.eclipse.xtext.util.Files;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xtext.generator.AbstractXtextGeneratorFragment;
import org.eclipse.xtext.xtext.generator.CodeConfig;
import org.eclipse.xtext.xtext.generator.model.IXtextGeneratorFileSystemAccess;
import org.eclipse.xtext.xtext.generator.parser.antlr.Antlr4ToolFacade;
import org.eclipse.xtext.xtext.generator.parser.antlr.AntlrOptions;
import org.eclipse.xtext.xtext.generator.parser.antlr.CodebuffAntlrGrammarGenerator;
import org.eclipse.xtext.xtext.generator.parser.antlr.CodebuffGrammarNaming;
import org.eclipse.xtext.xtext.generator.parser.antlr.CodebuffToolFacade;

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
  private CodebuffToolFacade codebuffTool;
  
  @Inject
  private CodebuffGrammarNaming naming;
  
  @Inject
  private CodeConfig codeConfig;
  
  @Override
  public void generate() {
    try {
      final IXtextGeneratorFileSystemAccess fsa = this.getProjectConfig().getRuntime().getSrcGen();
      AntlrOptions _antlrOptions = new AntlrOptions();
      this.generator.generate(this.getGrammar(), _antlrOptions, fsa);
      String _path = fsa.getPath();
      final File file = new File(_path);
      final IXtextGeneratorFileSystemAccess root = this.getProjectConfig().getRuntime().getRoot();
      String _path_1 = root.getPath();
      String _plus = (_path_1 + "/antlr4gen/");
      final File antlr4gen = new File(_plus);
      boolean _exists = antlr4gen.exists();
      if (_exists) {
        Files.cleanFolder(antlr4gen, null, true, true);
      }
      antlr4gen.mkdir();
      String _path_2 = root.getPath();
      String _plus_1 = (_path_2 + "/antlr4gen/target/");
      new File(_plus_1).mkdirs();
      String _path_3 = root.getPath();
      String _plus_2 = (_path_3 + "/antlr4gen/src-gen/");
      new File(_plus_2).mkdirs();
      boolean _exists_1 = file.exists();
      if (_exists_1) {
        String _absolutePath = file.getAbsolutePath();
        String _plus_3 = (_absolutePath + "/");
        String _grammarFileName = this.naming.getParserGrammar(this.getGrammar()).getGrammarFileName();
        final String fileName = (_plus_3 + _grammarFileName);
        this.antlrTool.runWithEncodingAndParams(fileName, this.codeConfig.getEncoding());
        this.codebuffTool.initializeCodebuff();
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
