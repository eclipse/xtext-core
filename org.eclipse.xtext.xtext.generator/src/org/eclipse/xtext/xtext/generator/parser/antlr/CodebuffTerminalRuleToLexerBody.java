/*******************************************************************************
 * Copyright (c) 2017 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.xtext.generator.parser.antlr;

import org.eclipse.xtext.NegatedToken;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.UntilToken;
import org.eclipse.xtext.util.Strings;

/**
 * @author Holger Schill - Initial contribution and API
 */
public class CodebuffTerminalRuleToLexerBody extends TerminalRuleToLexerBody {
	
	public CodebuffTerminalRuleToLexerBody() {
		super();
	}
	
	public static String toLexerBody(TerminalRule rule) {
		return new CodebuffTerminalRuleToLexerBody().print(rule);
	}
	
	@Override
	public String caseNegatedToken(NegatedToken object) {
		result.append("~");
		doSwitch(object.getTerminal());
		result.append(Strings.emptyIfNull(object.getCardinality()));
		return "";
	}
	
	@Override
	public String caseUntilToken(UntilToken object) {
		result.append("*?");
		doSwitch(object.getTerminal());
		return "";
	}
}
