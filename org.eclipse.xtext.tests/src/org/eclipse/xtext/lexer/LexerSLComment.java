/*******************************************************************************
 * Copyright (c) 2008 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 *******************************************************************************/
package org.eclipse.xtext.lexer;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.CommonTokenStream;
import org.eclipse.xtext.testlanguages.parser.antlr.internal.InternalSimpleExpressionsTestLanguageLexer;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Dennis H�bner - Initial contribution and API
 * 
 */
public class LexerSLComment extends Assert {
	@Test public void testSlComment() {
		String model = "//sl comment\na";
		InternalSimpleExpressionsTestLanguageLexer lexer = new InternalSimpleExpressionsTestLanguageLexer();
		lexer.setCharStream(new ANTLRStringStream(model));
		CommonTokenStream stream = new CommonTokenStream(lexer);
		Object inLineComment = stream.getTokens().get(0);
		assertTrue(inLineComment instanceof CommonToken);
		assertEquals(InternalSimpleExpressionsTestLanguageLexer.RULE_SL_COMMENT, ((CommonToken) inLineComment).getType());
	}

	/**
	 * see BUG 234135: Comments on EOF not detected
	 * https://bugs.eclipse.org/bugs/show_bug.cgi?id=234135
	 */
	@Test public void testSlCommentEOF() {
		String model = "a\n//sl comment";
		InternalSimpleExpressionsTestLanguageLexer lexer = new InternalSimpleExpressionsTestLanguageLexer();
		lexer.setCharStream(new ANTLRStringStream(model));
		CommonTokenStream stream = new CommonTokenStream(lexer);
		Object eofLineComment = stream.getTokens().get(2);
		assertTrue(eofLineComment instanceof CommonToken);
		CommonToken commonToken = (CommonToken) eofLineComment;
		int type = commonToken.getType();
		assertEquals(InternalSimpleExpressionsTestLanguageLexer.RULE_SL_COMMENT, type);
	}
}
