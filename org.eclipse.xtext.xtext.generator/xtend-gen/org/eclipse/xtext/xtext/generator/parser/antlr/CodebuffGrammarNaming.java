/**
 * Copyright (c) 2017 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.xtext.generator.parser.antlr;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.xtext.generator.model.TypeReference;
import org.eclipse.xtext.xtext.generator.parser.antlr.Antlr4Grammar;
import org.eclipse.xtext.xtext.generator.parser.antlr.AntlrGrammar;
import org.eclipse.xtext.xtext.generator.parser.antlr.GrammarNaming;

/**
 * @author Holger Schill - Initial contribution and API
 */
@SuppressWarnings("all")
public class CodebuffGrammarNaming extends GrammarNaming {
  @Override
  public TypeReference getInternalParserSuperClass(final Grammar it) {
    return null;
  }
  
  @Override
  public boolean isCombinedGrammar(final Grammar it) {
    return true;
  }
  
  @Override
  protected String getGrammarNamePrefix(final Grammar it) {
    return "Codebuff";
  }
  
  @Override
  public AntlrGrammar getParserGrammar(final Grammar it) {
    String _internalParserPackage = this.getInternalParserPackage(it);
    StringConcatenation _builder = new StringConcatenation();
    String _grammarNamePrefix = this.getGrammarNamePrefix(it);
    _builder.append(_grammarNamePrefix);
    {
      boolean _isCombinedGrammar = this.isCombinedGrammar(it);
      boolean _not = (!_isCombinedGrammar);
      if (_not) {
        _builder.append("Parser");
      }
    }
    return new Antlr4Grammar(_internalParserPackage, _builder.toString());
  }
}
