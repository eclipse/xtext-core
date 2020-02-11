/*******************************************************************************
 * Copyright (c) 2008 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.parser;

import org.antlr.runtime.CommonToken;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.parser.impl.DatatypeRuleToken;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public class AntlrDatatypeRuleTokenTest extends Assert {
	
	private static final int TOKEN_TYPE = Integer.MIN_VALUE;
	
	@Test public void testConstructor() {
		DatatypeRuleToken token = new AntlrDatatypeRuleToken();
		assertNull(token.getText());
		assertEquals(DatatypeRuleToken.INITIAL_OFFSET, token.getStartOffset());
		assertEquals(DatatypeRuleToken.INITIAL_OFFSET, token.getExpectedOffset());
		assertEquals("AntlrDatatypeRuleToken{\n\tstartOffset: -1\n\texpectedOffset: -1\n\tbufferValue: ''\n}", token.toString());
	}
	
	@Test public void testSetText() {
		DatatypeRuleToken token = new AntlrDatatypeRuleToken();
		token.setText("text");
		assertEquals("text", token.getText());
		token.setText("longerText");
		assertEquals("longerText", token.getText());
		token.setText("text");
		assertEquals("text", token.getText());
		token.setText("");
		assertNull(token.getText());
	}
	
	@Test public void testMergeFirstToken() {
		CommonToken commonToken = new CommonToken(TOKEN_TYPE, "text");
		commonToken.setStartIndex(4);
		AntlrDatatypeRuleToken token = new AntlrDatatypeRuleToken();
		token.merge(commonToken);
		assertEquals("text", token.getText());
		assertEquals(8, token.getExpectedOffset());
	}
	
	@Test public void testMergeFirstDatatypeRuleToken() {
		AntlrDatatypeRuleToken tokenToMerge = new AntlrDatatypeRuleToken();
		tokenToMerge.setText("text");
		tokenToMerge.setStartOffset(6);
		AntlrDatatypeRuleToken token = new AntlrDatatypeRuleToken();
		token.merge(tokenToMerge);
		assertEquals("text", token.getText());
		assertEquals(10, token.getExpectedOffset());
	}
	
	@Test public void testMergeSecondToken() {
		CommonToken tokenToMerge = new CommonToken(TOKEN_TYPE, "ext");
		tokenToMerge.setStartIndex(6);
		AntlrDatatypeRuleToken token = new AntlrDatatypeRuleToken();
		token.setStartOffset(tokenToMerge.getStartIndex() - 1);
		token.setExpectedOffset(tokenToMerge.getStartIndex());
		token.setText("t");
		token.merge(tokenToMerge);
		assertEquals("text", token.getText());
		assertEquals(9, token.getExpectedOffset());
	}
	
	@Test public void testMergeSecondDatatypeRuleToken() {
		AntlrDatatypeRuleToken tokenToMerge = new AntlrDatatypeRuleToken();
		tokenToMerge.setText("ext");
		tokenToMerge.setStartOffset(9);
		AntlrDatatypeRuleToken token = new AntlrDatatypeRuleToken();
		token.setStartOffset(tokenToMerge.getStartOffset() - 1);
		token.setExpectedOffset(tokenToMerge.getStartOffset());
		token.setText("t");
		token.merge(tokenToMerge);
		assertEquals("text", token.getText());
		assertEquals(12, token.getExpectedOffset());
	}
	
	@Test public void testMergeSecondTokenUnmatched() {
		CommonToken tokenToMerge = new CommonToken(TOKEN_TYPE, "ext");
		tokenToMerge.setStartIndex(6);
		AntlrDatatypeRuleToken token = new AntlrDatatypeRuleToken();
		token.setStartOffset(tokenToMerge.getStartIndex() - 4);
		token.setExpectedOffset(tokenToMerge.getStartIndex() - 3);
		token.setText("t");
		token.merge(tokenToMerge);
		assertEquals("t ext", token.getText());
		assertEquals(9, token.getExpectedOffset());
	}
	
	@Test public void testMergeSecondDatatypeRuleTokenUnmatched() {
		AntlrDatatypeRuleToken tokenToMerge = new AntlrDatatypeRuleToken();
		tokenToMerge.setText("ext");
		tokenToMerge.setStartOffset(9);
		AntlrDatatypeRuleToken token = new AntlrDatatypeRuleToken();
		token.setStartOffset(tokenToMerge.getStartOffset() - 4);
		token.setExpectedOffset(tokenToMerge.getStartOffset() - 3);
		token.setText("t");
		token.merge(tokenToMerge);
		assertEquals("t ext", token.getText());
		assertEquals(12, token.getExpectedOffset());
	}
	
	@Test public void testMergeEmptyToken() {
		AntlrDatatypeRuleToken emptyToken = new AntlrDatatypeRuleToken();
		AntlrDatatypeRuleToken token = new AntlrDatatypeRuleToken();
		token.setStartOffset(1);
		token.setExpectedOffset(2);
		token.setText("t");
		token.merge(emptyToken);
		assertEquals("t", token.getText());
		assertEquals(2, token.getExpectedOffset());
	}
	
	@Test public void testMergeEmptyTokenWithOffset() {
		AntlrDatatypeRuleToken emptyToken = new AntlrDatatypeRuleToken();
		emptyToken.setStartOffset(9);
		AntlrDatatypeRuleToken token = new AntlrDatatypeRuleToken();
		token.setStartOffset(1);
		token.setExpectedOffset(2);
		token.setText("t");
		token.merge(emptyToken);
		assertEquals("t", token.getText());
		assertEquals(2, token.getExpectedOffset());
	}

}
