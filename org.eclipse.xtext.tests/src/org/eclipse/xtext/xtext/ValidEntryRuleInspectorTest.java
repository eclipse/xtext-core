/*******************************************************************************
 * Copyright (c) 2009 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.xtext;

import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.util.Pair;
import org.junit.Test;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public class ValidEntryRuleInspectorTest extends AbstractXtextRuleInspectorTest<Pair<Boolean, Boolean>, ParserRule>{

	@Override
	protected XtextRuleInspector<Pair<Boolean, Boolean>, ParserRule> createInspector() {
		return new ValidEntryRuleInspector(this);
	}
	
	@Test public void testDatatypes() throws Exception {
		String grammarAsString = "grammar org.foo with org.eclipse.xtext.common.Terminals\n" +
				"generate metamodel 'foo.sample'\n" +
				"X: 'x';\n";
		Grammar grammar = getGrammar(grammarAsString);
		ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(grammar, "X");
		validateRule(rule);
		assertTrue(warnings.toString(), warnings.isEmpty());
	}

	@Test public void testAssignment_01() throws Exception {
		String grammarAsString = "grammar org.foo with org.eclipse.xtext.common.Terminals\n" +
				"generate metamodel 'foo.sample'\n" +
				"X: x=ID;\n";
		Grammar grammar = getGrammar(grammarAsString);
		ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(grammar, "X");
		validateRule(rule);
		assertTrue(warnings.toString(), warnings.isEmpty());
	}
	
	@Test public void testAssignment_02() throws Exception {
		String grammarAsString = "grammar org.foo with org.eclipse.xtext.common.Terminals\n" +
				"generate metamodel 'foo.sample'\n" +
				"X : (x+='x')+;";
		Grammar grammar = getGrammar(grammarAsString);
		ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(grammar, "X");
		validateRule(rule);
		assertTrue(warnings.toString(), warnings.isEmpty());
	}
	
	@Test public void testAssignment_03() throws Exception {
		String grammarAsString = "grammar org.foo with org.eclipse.xtext.common.Terminals\n" +
				"generate metamodel 'foo.sample'\n" +
				"X : (x+='x')*;";
		Grammar grammar = getGrammar(grammarAsString);
		ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(grammar, "X");
		validateRule(rule);
		assertTrue(warnings.toString(), warnings.isEmpty());
	}
	
	@Test public void testAssignment_05() throws Exception {
		String grammarAsString = "grammar org.foo with org.eclipse.xtext.common.Terminals\n" +
				"generate metamodel 'foo.sample'\n" +
				"X : ID (x+='x')+;";
		Grammar grammar = getGrammar(grammarAsString);
		ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(grammar, "X");
		validateRule(rule);
		assertTrue(warnings.toString(), warnings.isEmpty());
	}
	
	@Test public void testAssignment_06() throws Exception {
		String grammarAsString = "grammar org.foo with org.eclipse.xtext.common.Terminals\n" +
				"generate metamodel 'foo.sample'\n" +
				"X : ID (x+='x')*;";
		Grammar grammar = getGrammar(grammarAsString);
		ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(grammar, "X");
		validateRule(rule);
		assertEquals(warnings.toString(), 1, warnings.size());
		String message = warnings.get(0).getFirst();
		assertTrue(message, message.contains("{X}"));
	}
	
	@Test public void testIgnoreSecondRule_01() throws Exception {
		String grammarAsString = "grammar org.foo with org.eclipse.xtext.common.Terminals\n" +
				"generate metamodel 'foo.sample'\n" +
				"Model: x=X;\n" +
				"X : ID (x+='x')*;";
		Grammar grammar = getGrammar(grammarAsString);
		ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(grammar, "X");
		validateRule(rule);
		assertTrue(warnings.toString(), warnings.isEmpty());
	}
	
	@Test public void testAction_01() throws Exception {
		String grammarAsString = "grammar org.foo with org.eclipse.xtext.common.Terminals\n" +
				"generate metamodel 'foo.sample'\n" +
				"X : {X} ID?;";
		Grammar grammar = getGrammar(grammarAsString);
		ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(grammar, "X");
		validateRule(rule);
		assertTrue(warnings.toString(), warnings.isEmpty());
	}
	
	@Test public void testAction_02() throws Exception {
		String grammarAsString = "grammar org.foo with org.eclipse.xtext.common.Terminals\n" +
				"generate metamodel 'foo.sample'\n" +
				"X : {X} | ID;";
		Grammar grammar = getGrammar(grammarAsString);
		ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(grammar, "X");
		validateRule(rule);
		assertEquals(warnings.toString(), 1, warnings.size());
	}
	
	@Test public void testAction_03() throws Exception {
		String grammarAsString = "grammar org.foo with org.eclipse.xtext.common.Terminals\n" +
				"generate metamodel 'foo.sample'\n" +
				"X : {X} | ID?;";
		Grammar grammar = getGrammar(grammarAsString);
		ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(grammar, "X");
		validateRule(rule);
		assertEquals(warnings.toString(), 1, warnings.size());
	}
	
	@Test public void testAction_04() throws Exception {
		String grammarAsString = "grammar org.foo with org.eclipse.xtext.common.Terminals\n" +
				"generate metamodel 'foo.sample'\n" +
				"X : {X} | (ID name=ID)?;";
		Grammar grammar = getGrammar(grammarAsString);
		ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(grammar, "X");
		validateRule(rule);
		assertTrue(warnings.toString(), warnings.isEmpty());
	}
	
	@Test public void testRuleCall_01() throws Exception {
		String grammarAsString = "grammar org.foo with org.eclipse.xtext.common.Terminals\n" +
				"generate metamodel 'foo.sample'\n" +
				"X : Y;\n" +
				"Y : name=ID;";
		Grammar grammar = getGrammar(grammarAsString);
		ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(grammar, "X");
		validateRule(rule);
		assertTrue(warnings.toString(), warnings.isEmpty());
	}
	
	@Test public void testRuleCall_02() throws Exception {
		String grammarAsString = "grammar org.foo with org.eclipse.xtext.common.Terminals\n" +
				"generate metamodel 'foo.sample'\n" +
				"X : Y | name=ID;\n" +
				"Y : ID;";
		Grammar grammar = getGrammar(grammarAsString);
		ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(grammar, "X");
		validateRule(rule);
		assertEquals(warnings.toString(), 1, warnings.size());
	}
	
	@Test public void testRuleCall_03() throws Exception {
		String grammarAsString = "grammar org.foo with org.eclipse.xtext.common.Terminals\n" +
				"generate metamodel 'foo.sample'\n" +
				"X : INT (ID? {X} ID?);\n";
		Grammar grammar = getGrammar(grammarAsString);
		ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(grammar, "X");
		validateRule(rule);
		assertTrue(warnings.toString(), warnings.isEmpty());
	}
	
	@Test public void testGroup_01() throws Exception {
		String grammarAsString = "grammar org.foo with org.eclipse.xtext.common.Terminals\n" +
				"generate metamodel 'foo.sample'\n" +
				"X : 'x' x=ID 'x';\n";
		Grammar grammar = getGrammar(grammarAsString);
		ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(grammar, "X");
		validateRule(rule);
		assertTrue(warnings.toString(), warnings.isEmpty());
	}
	
	@Test public void testGroup_02() throws Exception {
		String grammarAsString = "grammar org.foo with org.eclipse.xtext.common.Terminals\n" +
				"generate metamodel 'foo.sample'\n" +
				"X : 'x' x=ID? 'x';\n";
		Grammar grammar = getGrammar(grammarAsString);
		ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(grammar, "X");
		validateRule(rule);
		assertEquals(warnings.toString(), 1, warnings.size());
	}
	
	@Test public void testGroup_03() throws Exception {
		String grammarAsString = "grammar org.foo with org.eclipse.xtext.common.Terminals\n" +
				"generate metamodel 'foo.sample'\n" +
				"X : ('x' x=ID? 'x')?;\n";
		Grammar grammar = getGrammar(grammarAsString);
		ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(grammar, "X");
		validateRule(rule);
		assertEquals(warnings.toString(), 1, warnings.size());
	}
	
	@Test public void testGroup_04() throws Exception {
		String grammarAsString = "grammar org.foo with org.eclipse.xtext.common.Terminals\n" +
				"generate metamodel 'foo.sample'\n" +
				"X : ('x' x=ID 'x')?;\n";
		Grammar grammar = getGrammar(grammarAsString);
		ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(grammar, "X");
		validateRule(rule);
		assertTrue(warnings.toString(), warnings.isEmpty());
	}
	
	@Test public void testGroup_05() throws Exception {
		String grammarAsString = "grammar org.foo with org.eclipse.xtext.common.Terminals\n" +
				"generate metamodel 'foo.sample'\n" +
				"X : 'x' ('x' x=ID 'x')?;\n";
		Grammar grammar = getGrammar(grammarAsString);
		ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(grammar, "X");
		validateRule(rule);
		assertEquals(warnings.toString(), 1, warnings.size());
	}
	
	@Test public void testGroup_06() throws Exception {
		String grammarAsString = "grammar org.foo with org.eclipse.xtext.common.Terminals\n" +
				"generate metamodel 'foo.sample'\n" +
				"X : 'x'? ('x' x=ID 'x')?;\n";
		Grammar grammar = getGrammar(grammarAsString);
		ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(grammar, "X");
		validateRule(rule);
		assertEquals(warnings.toString(), 1, warnings.size());
	}
	
	@Test public void testGroup_07() throws Exception {
		String grammarAsString = "grammar org.foo with org.eclipse.xtext.common.Terminals\n" +
				"generate metamodel 'foo.sample'\n" +
				"X : 'x' ('x' x=ID 'x')+;\n";
		Grammar grammar = getGrammar(grammarAsString);
		ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(grammar, "X");
		validateRule(rule);
		assertTrue(warnings.toString(), warnings.isEmpty());
	}
	
	@Test public void testGroup_08() throws Exception {
		String grammarAsString = "grammar org.foo with org.eclipse.xtext.common.Terminals\n" +
				"generate metamodel 'foo.sample'\n" +
				"X : 'x'? ('x' x=ID 'x')+;\n";
		Grammar grammar = getGrammar(grammarAsString);
		ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(grammar, "X");
		validateRule(rule);
		assertTrue(warnings.toString(), warnings.isEmpty());
	}
	
	@Test public void testGroup_09() throws Exception {
		String grammarAsString = "grammar org.foo with org.eclipse.xtext.common.Terminals\n" +
				"generate metamodel 'foo.sample'\n" +
				"X : ID? x+=ID*;\n";
		Grammar grammar = getGrammar(grammarAsString);
		ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(grammar, "X");
		validateRule(rule);
		assertEquals(warnings.toString(), 1, warnings.size());
	}
	
	@Test public void testAlternatives_01() throws Exception {
		String grammarAsString = "grammar org.foo with org.eclipse.xtext.common.Terminals\n" +
				"generate metamodel 'foo.sample'\n" +
				"X : x=ID | y=INT;\n";
		Grammar grammar = getGrammar(grammarAsString);
		ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(grammar, "X");
		validateRule(rule);
		assertTrue(warnings.toString(), warnings.isEmpty());
	}
	
	@Test public void testAlternatives_02() throws Exception {
		String grammarAsString = "grammar org.foo with org.eclipse.xtext.common.Terminals\n" +
				"generate metamodel 'foo.sample'\n" +
				"X : (x=ID | y=INT)?;\n";
		Grammar grammar = getGrammar(grammarAsString);
		ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(grammar, "X");
		validateRule(rule);
		assertTrue(warnings.toString(), warnings.isEmpty());
	}
	
	@Test public void testAlternatives_03() throws Exception {
		String grammarAsString = "grammar org.foo with org.eclipse.xtext.common.Terminals\n" +
				"generate metamodel 'foo.sample'\n" +
				"X : x=ID? | y=INT*;\n";
		Grammar grammar = getGrammar(grammarAsString);
		ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(grammar, "X");
		validateRule(rule);
		assertTrue(warnings.toString(), warnings.isEmpty());
	}
	
	@Test public void testAlternatives_05() throws Exception {
		String grammarAsString = "grammar org.foo with org.eclipse.xtext.common.Terminals\n" +
				"generate metamodel 'foo.sample'\n" +
				"X : 'x' (x=ID | y=INT);\n";
		Grammar grammar = getGrammar(grammarAsString);
		ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(grammar, "X");
		validateRule(rule);
		assertTrue(warnings.toString(), warnings.isEmpty());
	}
	
	@Test public void testAlternatives_06() throws Exception {
		String grammarAsString = "grammar org.foo with org.eclipse.xtext.common.Terminals\n" +
				"generate metamodel 'foo.sample'\n" +
				"X : (x=ID* | y=INT)?;\n";
		Grammar grammar = getGrammar(grammarAsString);
		ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(grammar, "X");
		validateRule(rule);
		assertTrue(warnings.toString(), warnings.isEmpty());
	}
	
	@Test public void testAlternatives_07() throws Exception {
		String grammarAsString = "grammar org.foo with org.eclipse.xtext.common.Terminals\n" +
				"generate metamodel 'foo.sample'\n" +
				"X : x=ID? | 'x';\n";
		Grammar grammar = getGrammar(grammarAsString);
		ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(grammar, "X");
		validateRule(rule);
		assertEquals(warnings.toString(), 1, warnings.size());
	}
	
	@Test public void testAlternatives_08() throws Exception {
		String grammarAsString = "grammar org.foo with org.eclipse.xtext.common.Terminals\n" +
				"generate metamodel 'foo.sample'\n" +
				"X : x=ID? | 'x' {X};\n";
		Grammar grammar = getGrammar(grammarAsString);
		ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(grammar, "X");
		validateRule(rule);
		assertTrue(warnings.toString(), warnings.isEmpty());
	}
	
	@Test public void testUnorderedGroup_01() throws Exception {
		String grammarAsString = "grammar org.foo with org.eclipse.xtext.common.Terminals\n" +
				"generate metamodel 'foo.sample'\n" +
				"X : 'x' & x=ID & 'x';\n";
		Grammar grammar = getGrammar(grammarAsString);
		ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(grammar, "X");
		validateRule(rule);
		assertTrue(warnings.toString(), warnings.isEmpty());
	}
	
	@Test public void testUnorderedGroup_02() throws Exception {
		String grammarAsString = "grammar org.foo with org.eclipse.xtext.common.Terminals\n" +
				"generate metamodel 'foo.sample'\n" +
				"X : 'x' & x=ID? & 'x';\n";
		Grammar grammar = getGrammar(grammarAsString);
		ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(grammar, "X");
		validateRule(rule);
		assertEquals(warnings.toString(), 1, warnings.size());
	}
	
	@Test public void testUnorderedGroup_03() throws Exception {
		String grammarAsString = "grammar org.foo with org.eclipse.xtext.common.Terminals\n" +
				"generate metamodel 'foo.sample'\n" +
				"X : ('x' & x=ID? & 'x')?;\n";
		Grammar grammar = getGrammar(grammarAsString);
		ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(grammar, "X");
		validateRule(rule);
		assertEquals(warnings.toString(), 1, warnings.size());
	}
	
	@Test public void testUnorderedGroup_04() throws Exception {
		String grammarAsString = "grammar org.foo with org.eclipse.xtext.common.Terminals\n" +
				"generate metamodel 'foo.sample'\n" +
				"X : ('x' & x=ID & 'x')?;\n";
		Grammar grammar = getGrammar(grammarAsString);
		ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(grammar, "X");
		validateRule(rule);
		assertTrue(warnings.toString(), warnings.isEmpty());
	}
	
	@Test public void testUnorderedGroup_05() throws Exception {
		String grammarAsString = "grammar org.foo with org.eclipse.xtext.common.Terminals\n" +
				"generate metamodel 'foo.sample'\n" +
				"X : 'x' ('x' & x=ID & 'x')?;\n";
		Grammar grammar = getGrammar(grammarAsString);
		ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(grammar, "X");
		validateRule(rule);
		assertEquals(warnings.toString(), 1, warnings.size());
	}
	
	@Test public void testUnorderedGroup_06() throws Exception {
		String grammarAsString = "grammar org.foo with org.eclipse.xtext.common.Terminals\n" +
				"generate metamodel 'foo.sample'\n" +
				"X : 'x'? ('x' & x=ID & 'x')?;\n";
		Grammar grammar = getGrammar(grammarAsString);
		ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(grammar, "X");
		validateRule(rule);
		assertEquals(warnings.toString(), 1, warnings.size());
	}
	
	@Test public void testUnorderedGroup_07() throws Exception {
		String grammarAsString = "grammar org.foo with org.eclipse.xtext.common.Terminals\n" +
				"generate metamodel 'foo.sample'\n" +
				"X : 'x' ('x' & x=ID & 'x')+;\n";
		Grammar grammar = getGrammar(grammarAsString);
		ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(grammar, "X");
		validateRule(rule);
		assertTrue(warnings.toString(), warnings.isEmpty());
	}
	
	@Test public void testUnorderedGroup_08() throws Exception {
		String grammarAsString = "grammar org.foo with org.eclipse.xtext.common.Terminals\n" +
				"generate metamodel 'foo.sample'\n" +
				"X : 'x'? ('x' & x=ID & 'x')+;\n";
		Grammar grammar = getGrammar(grammarAsString);
		ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(grammar, "X");
		validateRule(rule);
		assertTrue(warnings.toString(), warnings.isEmpty());
	}
	
	@Test public void testUnorderedGroup_09() throws Exception {
		String grammarAsString = "grammar org.foo with org.eclipse.xtext.common.Terminals\n" +
				"generate metamodel 'foo.sample'\n" +
				"X : STRING? & x+=ID*;\n";
		Grammar grammar = getGrammar(grammarAsString);
		ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(grammar, "X");
		validateRule(rule);
		assertEquals(warnings.toString(), 1, warnings.size());
	}
	
	@Test public void testUnorderedGroup_10() throws Exception {
		String grammarAsString = "grammar org.foo with org.eclipse.xtext.common.Terminals\n" +
				"generate metamodel 'foo.sample'\n" +
				"X : x=ID & y=INT;\n";
		Grammar grammar = getGrammar(grammarAsString);
		ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(grammar, "X");
		validateRule(rule);
		assertTrue(warnings.toString(), warnings.isEmpty());
	}
	
	@Test public void testUnorderedGroup_11() throws Exception {
		String grammarAsString = "grammar org.foo with org.eclipse.xtext.common.Terminals\n" +
				"generate metamodel 'foo.sample'\n" +
				"X : (x=ID & y=INT);\n";
		Grammar grammar = getGrammar(grammarAsString);
		ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(grammar, "X");
		validateRule(rule);
		assertTrue(warnings.toString(), warnings.isEmpty());
	}
	
	@Test public void testUnorderedGroup_12() throws Exception {
		String grammarAsString = "grammar org.foo with org.eclipse.xtext.common.Terminals\n" +
				"generate metamodel 'foo.sample'\n" +
				"X : (x=ID? & y=INT*);\n";
		Grammar grammar = getGrammar(grammarAsString);
		ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(grammar, "X");
		validateRule(rule);
		assertTrue(warnings.toString(), warnings.isEmpty());
	}
	
	@Test public void testUnorderedGroup_13() throws Exception {
		String grammarAsString = "grammar org.foo with org.eclipse.xtext.common.Terminals\n" +
				"generate metamodel 'foo.sample'\n" +
				"X : 'x' (x=ID & y=INT);\n";
		Grammar grammar = getGrammar(grammarAsString);
		ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(grammar, "X");
		validateRule(rule);
		assertTrue(warnings.toString(), warnings.isEmpty());
	}
	
	@Test public void testUnorderedGroup_14() throws Exception {
		String grammarAsString = "grammar org.foo with org.eclipse.xtext.common.Terminals\n" +
				"generate metamodel 'foo.sample'\n" +
				"X : (x=ID* & y=INT)?;\n";
		Grammar grammar = getGrammar(grammarAsString);
		ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(grammar, "X");
		validateRule(rule);
		assertTrue(warnings.toString(), warnings.isEmpty());
	}
	
	@Test public void testUnorderedGroup_15() throws Exception {
		String grammarAsString = "grammar org.foo with org.eclipse.xtext.common.Terminals\n" +
				"generate metamodel 'foo.sample'\n" +
				"X : x=ID? & 'x';\n";
		Grammar grammar = getGrammar(grammarAsString);
		ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(grammar, "X");
		validateRule(rule);
		assertEquals(warnings.toString(), 1, warnings.size());
	}
	
	@Test public void testUnorderedGroup_16() throws Exception {
		String grammarAsString = "grammar org.foo with org.eclipse.xtext.common.Terminals\n" +
				"generate metamodel 'foo.sample'\n" +
				"X : {X} (x=ID? & 'x');\n";
		Grammar grammar = getGrammar(grammarAsString);
		ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(grammar, "X");
		validateRule(rule);
		assertTrue(warnings.toString(), warnings.isEmpty());
	}
	
	@Test public void testBug_287735_01() throws Exception {
		String grammarAsString = "grammar org.foo with org.eclipse.xtext.common.Terminals\n" +
				"generate metamodel 'foo.sample'\n" +
				"X : 'x' Y;\n";
		Grammar grammar = getGrammarWithErrors(grammarAsString, 1);
		ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(grammar, "X");
		validateRule(rule);
		assertTrue(warnings.toString(), warnings.isEmpty());
	}
}
