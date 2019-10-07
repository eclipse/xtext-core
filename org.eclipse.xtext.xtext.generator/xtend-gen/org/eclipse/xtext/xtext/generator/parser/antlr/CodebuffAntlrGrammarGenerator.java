/**
 * Copyright (c) 2017 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.xtext.generator.parser.antlr;

import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.xtext.generator.parser.antlr.AbstractAntlrGrammarGenerator;
import org.eclipse.xtext.xtext.generator.parser.antlr.AntlrOptions;
import org.eclipse.xtext.xtext.generator.parser.antlr.CodebuffGrammarNaming;
import org.eclipse.xtext.xtext.generator.parser.antlr.CodebuffTerminalRuleToLexerBody;
import org.eclipse.xtext.xtext.generator.parser.antlr.GrammarNaming;

/**
 * @author Holger Schill - Initial contribution and API
 */
@SuppressWarnings("all")
public class CodebuffAntlrGrammarGenerator extends AbstractAntlrGrammarGenerator {
  @Inject
  private CodebuffGrammarNaming naming;
  
  @Override
  protected GrammarNaming getGrammarNaming() {
    return this.naming;
  }
  
  @Override
  protected CharSequence compileParserOptions(final Grammar it, final AntlrOptions options) {
    return "";
  }
  
  @Override
  protected CharSequence compileParserHeader(final Grammar it, final AntlrOptions options) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  @Override
  protected CharSequence compileLexerHeader(final Grammar it, final AntlrOptions options) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  @Override
  protected String ebnfPredicate(final AbstractElement it, final AntlrOptions options) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder.toString();
  }
  
  @Override
  protected String dataTypeEbnfPredicate(final AbstractElement it) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder.toString();
  }
  
  @Override
  protected CharSequence _compileRule(final TerminalRule it, final Grammar grammar, final AntlrOptions options) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isBacktrackLexer = options.isBacktrackLexer();
      if (_isBacktrackLexer) {
        {
          boolean _isSyntheticTerminalRule = this._syntheticTerminalDetector.isSyntheticTerminalRule(it);
          boolean _not = (!_isSyntheticTerminalRule);
          if (_not) {
            {
              boolean _isFragment = it.isFragment();
              if (_isFragment) {
                _builder.append("fragment ");
                String _ruleName = this._grammarAccessExtensions.ruleName(it);
                _builder.append(_ruleName);
                _builder.append(" : ");
                String _lexerBody = CodebuffTerminalRuleToLexerBody.toLexerBody(it);
                _builder.append(_lexerBody);
                _builder.append(";");
                _builder.newLineIfNotEmpty();
              } else {
                _builder.append("fragment ");
                String _ruleName_1 = this._grammarAccessExtensions.ruleName(it);
                _builder.append(_ruleName_1);
                _builder.append(" : FRAGMENT_");
                String _ruleName_2 = this._grammarAccessExtensions.ruleName(it);
                _builder.append(_ruleName_2);
                _builder.append(";");
                _builder.newLineIfNotEmpty();
                _builder.append("fragment FRAGMENT_");
                String _ruleName_3 = this._grammarAccessExtensions.ruleName(it);
                _builder.append(_ruleName_3);
                _builder.append(" : ");
                String _lexerBody_1 = CodebuffTerminalRuleToLexerBody.toLexerBody(it);
                _builder.append(_lexerBody_1);
                _builder.append(";");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      } else {
        {
          boolean _isSyntheticTerminalRule_1 = this._syntheticTerminalDetector.isSyntheticTerminalRule(it);
          if (_isSyntheticTerminalRule_1) {
            _builder.append("fragment ");
            String _ruleName_4 = this._grammarAccessExtensions.ruleName(it);
            _builder.append(_ruleName_4);
            _builder.append(" : ;");
            _builder.newLineIfNotEmpty();
          } else {
            {
              boolean _isFragment_1 = it.isFragment();
              if (_isFragment_1) {
                _builder.append("fragment ");
              }
            }
            String _ruleName_5 = this._grammarAccessExtensions.ruleName(it);
            _builder.append(_ruleName_5);
            _builder.append(" : ");
            String _lexerBody_2 = CodebuffTerminalRuleToLexerBody.toLexerBody(it);
            _builder.append(_lexerBody_2);
            {
              boolean _shouldBeSkipped = this.shouldBeSkipped(it, grammar);
              if (_shouldBeSkipped) {
                _builder.append(" -> channel(HIDDEN)");
              }
            }
            _builder.append(";");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }
  
  @Override
  protected CharSequence compileRule(final Object it, final Grammar grammar, final AntlrOptions options) {
    if (it instanceof EnumRule) {
      return _compileRule((EnumRule)it, grammar, options);
    } else if (it instanceof ParserRule) {
      return _compileRule((ParserRule)it, grammar, options);
    } else if (it instanceof TerminalRule) {
      return _compileRule((TerminalRule)it, grammar, options);
    } else if (it instanceof String) {
      return _compileRule((String)it, grammar, options);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it, grammar, options).toString());
    }
  }
}
