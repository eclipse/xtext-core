/*******************************************************************************
 * Copyright (c) 2009, 2016 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.ide.tests.editor.contentassist.antlr;

import static org.junit.Assert.*;

import java.util.Collection;
import java.util.Set;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testlanguages.xtextgrammar.ide.XtextGrammarTestLanguageIdeInjectorProvider;
import org.eclipse.xtext.testlanguages.xtextgrammar.services.XtextGrammarTestLanguageGrammarAccess;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.google.common.base.Function;
import com.google.common.collect.Iterables;
import com.google.common.collect.Sets;
import com.google.inject.Inject;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
@RunWith(XtextRunner.class)
@InjectWith(XtextGrammarTestLanguageIdeInjectorProvider.class)
public abstract class AbstractParserTest  {
	
	protected abstract Collection<FollowElement> getFollowSet(String input) throws RecognitionException;

	@Inject
	protected XtextGrammarTestLanguageGrammarAccess grammarAccess;

	@Test public void testEmptyGrammar() throws RecognitionException {
		String input = "";
		Set<AbstractElement> expected = Sets.<AbstractElement>newHashSet(grammarAccess.getGrammarAccess().getGrammarKeyword_0());
		assertFollowers(input, expected);
	}

	@Test public void testGrammarKeyword() throws RecognitionException {
		String input = "grammar";
		Set<AbstractElement> expected = Sets.<AbstractElement>newHashSet(grammarAccess.getGrammarIDAccess().getIDTerminalRuleCall_0());
		assertFollowers(input, expected);
	}

	@Test public void testGrammarKeywordAndName_01() throws RecognitionException {
		String input = "grammar org";
		Set<AbstractElement> expected = Sets.newHashSet(
				grammarAccess.getGrammarIDAccess().getGroup_1(),
				grammarAccess.getGrammarAccess().getGroup_2(),
				grammarAccess.getGrammarAccess().getGroup_3(),
				grammarAccess.getGrammarAccess().getMetamodelDeclarationsAssignment_4(),
				grammarAccess.getAbstractRuleAccess().getAlternatives()
		);
		assertFollowers(input, expected);
	}

	@Test public void testGrammarKeywordAndName_02() throws RecognitionException {
		String input = "grammar org.";
		Set<AbstractElement> expected = Sets.<AbstractElement>newHashSet(
				grammarAccess.getGrammarIDAccess().getIDTerminalRuleCall_1_1()
		);
		assertFollowers(input, expected);
	}

	@Test public void testGrammarKeywordAndName_03() throws RecognitionException {
		String input = "grammar org.foo";
		Set<AbstractElement> expected = Sets.<AbstractElement>newHashSet(
				grammarAccess.getGrammarIDAccess().getGroup_1(),
				grammarAccess.getGrammarAccess().getGroup_2(),
				grammarAccess.getGrammarAccess().getGroup_3(),
				grammarAccess.getGrammarAccess().getMetamodelDeclarationsAssignment_4(),
				grammarAccess.getAbstractRuleAccess().getAlternatives()
		);
		assertFollowers(input, expected);
	}

	@Test public void testGrammarWith_01() throws RecognitionException {
		String input = "grammar org.foo with";
		Set<AbstractElement> expected = Sets.<AbstractElement>newHashSet(
				grammarAccess.getGrammarIDAccess().getIDTerminalRuleCall_0()
		);
		assertFollowers(input, expected);
	}

	@Test public void testGrammarWith_02() throws RecognitionException {
		String input = "grammar with";
		Set<AbstractElement> expected = Sets.<AbstractElement>newHashSet(
				grammarAccess.getGrammarIDAccess().getIDTerminalRuleCall_0()
		);
		assertFollowers(input, expected);
	}

	@Test public void testGrammarWithUsed_02() throws RecognitionException {
		String input = "grammar with org"; // default error recovery simply skips the keyword 'with'
		Set<AbstractElement> expected = Sets.<AbstractElement>newHashSet(
				grammarAccess.getGrammarIDAccess().getGroup_1(),
				grammarAccess.getGrammarAccess().getGroup_2(),
				grammarAccess.getGrammarAccess().getGroup_3(),
				grammarAccess.getGrammarAccess().getMetamodelDeclarationsAssignment_4(),
				grammarAccess.getAbstractRuleAccess().getAlternatives(),
				grammarAccess.getGrammarAccess().getRulesAssignment_5()
		);
		assertFollowers(input, expected);
	}

	@Test public void testGrammarWithUsed_03() throws RecognitionException {
		String input = "grammar with org."; // default error recovery simply skips the keyword 'with'
		Set<AbstractElement> expected = Sets.<AbstractElement>newHashSet(
				grammarAccess.getGrammarIDAccess().getIDTerminalRuleCall_1_1()
		);
		assertFollowers(input, expected);
	}

	@Test public void testGrammarWithUsed_04() throws RecognitionException {
		String input = "grammar with org.foo"; // default error recovery simply skips the keyword 'with'
		Set<AbstractElement> expected = Sets.<AbstractElement>newHashSet(
				grammarAccess.getGrammarIDAccess().getGroup_1(),
				grammarAccess.getGrammarAccess().getGroup_2(),
				grammarAccess.getGrammarAccess().getGroup_3(),
				grammarAccess.getGrammarAccess().getMetamodelDeclarationsAssignment_4(),
				grammarAccess.getAbstractRuleAccess().getAlternatives()
		);
		assertFollowers(input, expected);
	}

	@Test public void testGrammarWith_05() throws RecognitionException {
		String input = "grammar org. with";
		Set<AbstractElement> expected = Sets.<AbstractElement>newHashSet(
				grammarAccess.getGrammarIDAccess().getIDTerminalRuleCall_0()
		);
		assertFollowers(input, expected);
	}

	@Test public void testRule_01() throws RecognitionException {
		String input = "grammar org.^grammar.name ruleName";
		Set<AbstractElement> expected = Sets.<AbstractElement>newHashSet(
				grammarAccess.getParserRuleAccess().getGroup_1(),
				grammarAccess.getParserRuleAccess().getGroup_2(),
				grammarAccess.getParserRuleAccess().getColonKeyword_3()
		);
		assertFollowers(input, expected);
	}

	@Test public void testRule_02() throws RecognitionException {
		String input = "grammar org.^grammar.name ruleName returns";
		Set<AbstractElement> expected = Sets.<AbstractElement>newHashSet(
				grammarAccess.getTypeRefAccess().getGroup_0(),
				grammarAccess.getTypeRefAccess().getClassifierEClassifierIDTerminalRuleCall_1_0_1()
		);
		assertFollowers(input, expected);
	}

	@Test public void testRule_03() throws RecognitionException {
		String input = "grammar org.^grammar.name ruleName returns id";
		Set<AbstractElement> expected = Sets.<AbstractElement>newHashSet(
				grammarAccess.getTypeRefAccess().getGroup_0(),
				grammarAccess.getParserRuleAccess().getGroup_2(),
				grammarAccess.getParserRuleAccess().getColonKeyword_3()
		);
		assertFollowers(input, expected);
	}
	
	@Test public void testRule_04() throws RecognitionException {
		String input = "grammar org.^grammar.name ruleName r";
		Set<AbstractElement> expected = Sets.<AbstractElement>newHashSet(
//				grammarAccess.getTypeRefAccess().getGroup_0(),
//				grammarAccess.getParserRuleAccess().getGroup_2(),
//				grammarAccess.getParserRuleAccess().getColonKeyword_3()
		);
		assertFollowers(input, expected);
	}
	
	@Test public void testRuleBody_01() throws RecognitionException {
		String input = "grammar org.name ruleName: foo+=";
		Set<AbstractElement> expected = Sets.<AbstractElement>newHashSet(
				grammarAccess.getAssignableTerminalAccess().getAlternatives()
		);
		assertFollowers(input, expected);
	}

	private void assertFollowers(String input, Set<AbstractElement> expected) throws RecognitionException {
		Collection<FollowElement> followSet = getFollowSet(input);
//		Collection<FollowElement> followList = com.google.common.collect.Lists.newArrayList(getFollowSet(input));
		assertEquals(expected.size(), followSet.size());
		Set<AbstractElement> grammarElements = computeSearchElements(followSet);
//		Collection<AbstractElement> followElementList = com.google.common.collect.Lists.newArrayList(grammarElements);
		assertEquals(expected, grammarElements);
	}

	private Set<AbstractElement> computeSearchElements(Collection<FollowElement> followSet) {
		return  Sets.newHashSet(
				Iterables.transform(followSet, new Function<FollowElement, AbstractElement>(){
					@Override
					public AbstractElement apply(FollowElement from) {
						return from.getGrammarElement();
					}
				}));
	}

}
