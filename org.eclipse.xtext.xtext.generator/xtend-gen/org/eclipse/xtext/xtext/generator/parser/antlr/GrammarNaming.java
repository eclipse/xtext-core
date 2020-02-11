/**
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.xtext.generator.parser.antlr;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xtext.generator.XtextGeneratorNaming;
import org.eclipse.xtext.xtext.generator.model.TypeReference;
import org.eclipse.xtext.xtext.generator.parser.antlr.AntlrGrammar;
import org.eclipse.xtext.xtext.generator.parser.antlr.CombinedGrammarMarker;

@Singleton
@SuppressWarnings("all")
public class GrammarNaming {
  @Inject
  @Extension
  private XtextGeneratorNaming _xtextGeneratorNaming;
  
  public boolean isCombinedGrammar(final Grammar it) {
    return CombinedGrammarMarker.findInEmfObject(it).isCombinedGrammar();
  }
  
  protected String getParserPackage(final Grammar it) {
    String _runtimeBasePackage = this._xtextGeneratorNaming.getRuntimeBasePackage(it);
    return (_runtimeBasePackage + ".parser.antlr");
  }
  
  protected String getInternalParserPackage(final Grammar it) {
    String _parserPackage = this.getParserPackage(it);
    return (_parserPackage + ".internal");
  }
  
  protected String getInternalLexerPackage(final Grammar it) {
    String _parserPackage = this.getParserPackage(it);
    return (_parserPackage + ".lexer");
  }
  
  public AntlrGrammar getParserGrammar(final Grammar it) {
    String _internalParserPackage = this.getInternalParserPackage(it);
    StringConcatenation _builder = new StringConcatenation();
    String _grammarNamePrefix = this.getGrammarNamePrefix(it);
    _builder.append(_grammarNamePrefix);
    _builder.append("Internal");
    String _simpleName = GrammarUtil.getSimpleName(it);
    _builder.append(_simpleName);
    {
      boolean _isCombinedGrammar = this.isCombinedGrammar(it);
      boolean _not = (!_isCombinedGrammar);
      if (_not) {
        _builder.append("Parser");
      }
    }
    return new AntlrGrammar(_internalParserPackage, _builder.toString());
  }
  
  public AntlrGrammar getLexerGrammar(final Grammar it) {
    AntlrGrammar _xifexpression = null;
    boolean _isCombinedGrammar = this.isCombinedGrammar(it);
    if (_isCombinedGrammar) {
      _xifexpression = this.getParserGrammar(it);
    } else {
      String _internalLexerPackage = this.getInternalLexerPackage(it);
      StringConcatenation _builder = new StringConcatenation();
      String _grammarNamePrefix = this.getGrammarNamePrefix(it);
      _builder.append(_grammarNamePrefix);
      _builder.append("Internal");
      String _simpleName = GrammarUtil.getSimpleName(it);
      _builder.append(_simpleName);
      _builder.append("Lexer");
      _xifexpression = new AntlrGrammar(_internalLexerPackage, _builder.toString());
    }
    return _xifexpression;
  }
  
  protected String getGrammarNamePrefix(final Grammar it) {
    return "";
  }
  
  public TypeReference getLexerClass(final Grammar it) {
    String _packageName = this.getLexerGrammar(it).getPackageName();
    StringConcatenation _builder = new StringConcatenation();
    String _simpleName = this.getLexerGrammar(it).getSimpleName();
    _builder.append(_simpleName);
    {
      boolean _isCombinedGrammar = this.isCombinedGrammar(it);
      if (_isCombinedGrammar) {
        _builder.append("Lexer");
      }
    }
    return new TypeReference(_packageName, _builder.toString());
  }
  
  public TypeReference getLexerSuperClass(final Grammar it) {
    return new TypeReference("org.eclipse.xtext.parser.antlr.Lexer");
  }
  
  public TypeReference getParserClass(final Grammar it) {
    String _parserPackage = this.getParserPackage(it);
    StringConcatenation _builder = new StringConcatenation();
    String _simpleName = GrammarUtil.getSimpleName(it);
    _builder.append(_simpleName);
    _builder.append("Parser");
    return new TypeReference(_parserPackage, _builder.toString());
  }
  
  public TypeReference getParserSuperClass(final Grammar it, final boolean partialParsing) {
    return new TypeReference("org.eclipse.xtext.parser.antlr.AbstractAntlrParser");
  }
  
  public TypeReference getInternalParserClass(final Grammar it) {
    String _packageName = this.getParserGrammar(it).getPackageName();
    StringConcatenation _builder = new StringConcatenation();
    String _simpleName = this.getParserGrammar(it).getSimpleName();
    _builder.append(_simpleName);
    {
      boolean _isCombinedGrammar = this.isCombinedGrammar(it);
      if (_isCombinedGrammar) {
        _builder.append("Parser");
      }
    }
    return new TypeReference(_packageName, _builder.toString());
  }
  
  public TypeReference getInternalParserSuperClass(final Grammar it) {
    return new TypeReference("org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser");
  }
  
  public TypeReference getAntlrTokenFileProviderClass(final Grammar it) {
    String _parserPackage = this.getParserPackage(it);
    StringConcatenation _builder = new StringConcatenation();
    String _simpleName = GrammarUtil.getSimpleName(it);
    _builder.append(_simpleName);
    _builder.append("AntlrTokenFileProvider");
    return new TypeReference(_parserPackage, _builder.toString());
  }
  
  public TypeReference getTokenSourceClass(final Grammar it) {
    String _parserPackage = this.getParserPackage(it);
    String _simpleName = GrammarUtil.getSimpleName(it);
    String _plus = (_simpleName + "TokenSource");
    return new TypeReference(_parserPackage, _plus);
  }
}
