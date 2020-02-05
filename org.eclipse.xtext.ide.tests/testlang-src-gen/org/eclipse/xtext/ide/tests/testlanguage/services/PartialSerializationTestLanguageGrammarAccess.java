/*
 * Copyright (c) 2016, 2017 TypeFox GmbH (http://www.typefox.io) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.ide.tests.testlanguage.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class PartialSerializationTestLanguageGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ide.tests.testlanguage.PartialSerializationTestLanguage.Model");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cNumberSignDigitOneKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final RuleCall cNodeParserRuleCall_0_1 = (RuleCall)cGroup_0.eContents().get(1);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cNumberSignDigitTwoKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cMandatoryValueParserRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final Keyword cNumberSignDigitThreeKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final RuleCall cOptionalValueParserRuleCall_2_1 = (RuleCall)cGroup_2.eContents().get(1);
		private final Group cGroup_3 = (Group)cAlternatives.eContents().get(3);
		private final Keyword cNumberSignDigitFourKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final RuleCall cMandatoryChildParserRuleCall_3_1 = (RuleCall)cGroup_3.eContents().get(1);
		private final Group cGroup_4 = (Group)cAlternatives.eContents().get(4);
		private final Keyword cNumberSignDigitFiveKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final RuleCall cOptionalChildParserRuleCall_4_1 = (RuleCall)cGroup_4.eContents().get(1);
		private final Group cGroup_5 = (Group)cAlternatives.eContents().get(5);
		private final Keyword cNumberSignDigitOneDigitZeroKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final RuleCall cManyOptionalValuesParserRuleCall_5_1 = (RuleCall)cGroup_5.eContents().get(1);
		private final Group cGroup_6 = (Group)cAlternatives.eContents().get(6);
		private final Keyword cNumberSignDigitOneDigitOneKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final RuleCall cManyMandatoryValuesParserRuleCall_6_1 = (RuleCall)cGroup_6.eContents().get(1);
		private final Group cGroup_7 = (Group)cAlternatives.eContents().get(7);
		private final Keyword cNumberSignDigitOneDigitTwoKeyword_7_0 = (Keyword)cGroup_7.eContents().get(0);
		private final RuleCall cMandatoryChildListParserRuleCall_7_1 = (RuleCall)cGroup_7.eContents().get(1);
		private final Group cGroup_8 = (Group)cAlternatives.eContents().get(8);
		private final Keyword cNumberSignDigitOneDigitThreeKeyword_8_0 = (Keyword)cGroup_8.eContents().get(0);
		private final RuleCall cOptionalChildListParserRuleCall_8_1 = (RuleCall)cGroup_8.eContents().get(1);
		private final Group cGroup_9 = (Group)cAlternatives.eContents().get(9);
		private final Keyword cNumberSignDigitTwoDigitZeroKeyword_9_0 = (Keyword)cGroup_9.eContents().get(0);
		private final Assignment cClazzAssignment_9_1 = (Assignment)cGroup_9.eContents().get(1);
		private final RuleCall cClazzEClassDeclParserRuleCall_9_1_0 = (RuleCall)cClazzAssignment_9_1.eContents().get(0);
		private final Group cGroup_10 = (Group)cAlternatives.eContents().get(10);
		private final Keyword cNumberSignDigitTwoDigitOneKeyword_10_0 = (Keyword)cGroup_10.eContents().get(0);
		private final RuleCall cEClassRefParserRuleCall_10_1 = (RuleCall)cGroup_10.eContents().get(1);
		private final Group cGroup_11 = (Group)cAlternatives.eContents().get(11);
		private final Keyword cNumberSignDigitTwoDigitTwoKeyword_11_0 = (Keyword)cGroup_11.eContents().get(0);
		private final RuleCall cTwoChildListsParserRuleCall_11_1 = (RuleCall)cGroup_11.eContents().get(1);
		private final Group cGroup_12 = (Group)cAlternatives.eContents().get(12);
		private final Keyword cNumberSignDigitTwoDigitThreeKeyword_12_0 = (Keyword)cGroup_12.eContents().get(0);
		private final RuleCall cChildWithSubChildsParserRuleCall_12_1 = (RuleCall)cGroup_12.eContents().get(1);
		private final Group cGroup_13 = (Group)cAlternatives.eContents().get(13);
		private final Keyword cNumberSignDigitTwoDigitFourKeyword_13_0 = (Keyword)cGroup_13.eContents().get(0);
		private final RuleCall cTwoChildsParserRuleCall_13_1 = (RuleCall)cGroup_13.eContents().get(1);
		private final Group cGroup_14 = (Group)cAlternatives.eContents().get(14);
		private final Keyword cNumberSignDigitThreeDigitZeroKeyword_14_0 = (Keyword)cGroup_14.eContents().get(0);
		private final RuleCall cWithTransientContainerParserRuleCall_14_1 = (RuleCall)cGroup_14.eContents().get(1);
		
		//Model:
		//	"#1" Node |
		//	"#2" MandatoryValue |
		//	"#3" OptionalValue |
		//	"#4" MandatoryChild |
		//	"#5" OptionalChild |
		//	"#10" ManyOptionalValues |
		//	"#11" ManyMandatoryValues |
		//	"#12" MandatoryChildList |
		//	"#13" OptionalChildList |
		//	//	"#14" Imports |
		//	"#20" clazz+=EClassDecl+ |
		//	"#21" EClassRef |
		//	"#22" TwoChildLists |
		//	"#23" ChildWithSubChilds |
		//	"#24" TwoChilds |
		//	"#30" WithTransientContainer;
		@Override public ParserRule getRule() { return rule; }
		
		//"#1" Node | "#2" MandatoryValue | "#3" OptionalValue | "#4" MandatoryChild | "#5" OptionalChild | "#10"
		//ManyOptionalValues | "#11" ManyMandatoryValues | "#12" MandatoryChildList | "#13" OptionalChildList | //	"#14" Imports |
		//"#20" clazz+=EClassDecl+ | "#21" EClassRef | "#22" TwoChildLists | "#23" ChildWithSubChilds | "#24" TwoChilds | "#30"
		//WithTransientContainer
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//"#1" Node
		public Group getGroup_0() { return cGroup_0; }
		
		//"#1"
		public Keyword getNumberSignDigitOneKeyword_0_0() { return cNumberSignDigitOneKeyword_0_0; }
		
		//Node
		public RuleCall getNodeParserRuleCall_0_1() { return cNodeParserRuleCall_0_1; }
		
		//"#2" MandatoryValue
		public Group getGroup_1() { return cGroup_1; }
		
		//"#2"
		public Keyword getNumberSignDigitTwoKeyword_1_0() { return cNumberSignDigitTwoKeyword_1_0; }
		
		//MandatoryValue
		public RuleCall getMandatoryValueParserRuleCall_1_1() { return cMandatoryValueParserRuleCall_1_1; }
		
		//"#3" OptionalValue
		public Group getGroup_2() { return cGroup_2; }
		
		//"#3"
		public Keyword getNumberSignDigitThreeKeyword_2_0() { return cNumberSignDigitThreeKeyword_2_0; }
		
		//OptionalValue
		public RuleCall getOptionalValueParserRuleCall_2_1() { return cOptionalValueParserRuleCall_2_1; }
		
		//"#4" MandatoryChild
		public Group getGroup_3() { return cGroup_3; }
		
		//"#4"
		public Keyword getNumberSignDigitFourKeyword_3_0() { return cNumberSignDigitFourKeyword_3_0; }
		
		//MandatoryChild
		public RuleCall getMandatoryChildParserRuleCall_3_1() { return cMandatoryChildParserRuleCall_3_1; }
		
		//"#5" OptionalChild
		public Group getGroup_4() { return cGroup_4; }
		
		//"#5"
		public Keyword getNumberSignDigitFiveKeyword_4_0() { return cNumberSignDigitFiveKeyword_4_0; }
		
		//OptionalChild
		public RuleCall getOptionalChildParserRuleCall_4_1() { return cOptionalChildParserRuleCall_4_1; }
		
		//"#10" ManyOptionalValues
		public Group getGroup_5() { return cGroup_5; }
		
		//"#10"
		public Keyword getNumberSignDigitOneDigitZeroKeyword_5_0() { return cNumberSignDigitOneDigitZeroKeyword_5_0; }
		
		//ManyOptionalValues
		public RuleCall getManyOptionalValuesParserRuleCall_5_1() { return cManyOptionalValuesParserRuleCall_5_1; }
		
		//"#11" ManyMandatoryValues
		public Group getGroup_6() { return cGroup_6; }
		
		//"#11"
		public Keyword getNumberSignDigitOneDigitOneKeyword_6_0() { return cNumberSignDigitOneDigitOneKeyword_6_0; }
		
		//ManyMandatoryValues
		public RuleCall getManyMandatoryValuesParserRuleCall_6_1() { return cManyMandatoryValuesParserRuleCall_6_1; }
		
		//"#12" MandatoryChildList
		public Group getGroup_7() { return cGroup_7; }
		
		//"#12"
		public Keyword getNumberSignDigitOneDigitTwoKeyword_7_0() { return cNumberSignDigitOneDigitTwoKeyword_7_0; }
		
		//MandatoryChildList
		public RuleCall getMandatoryChildListParserRuleCall_7_1() { return cMandatoryChildListParserRuleCall_7_1; }
		
		//"#13" OptionalChildList
		public Group getGroup_8() { return cGroup_8; }
		
		//"#13"
		public Keyword getNumberSignDigitOneDigitThreeKeyword_8_0() { return cNumberSignDigitOneDigitThreeKeyword_8_0; }
		
		//OptionalChildList
		public RuleCall getOptionalChildListParserRuleCall_8_1() { return cOptionalChildListParserRuleCall_8_1; }
		
		////	"#14" Imports |
		//"#20" clazz+=EClassDecl+
		public Group getGroup_9() { return cGroup_9; }
		
		////	"#14" Imports |
		//"#20"
		public Keyword getNumberSignDigitTwoDigitZeroKeyword_9_0() { return cNumberSignDigitTwoDigitZeroKeyword_9_0; }
		
		//clazz+=EClassDecl+
		public Assignment getClazzAssignment_9_1() { return cClazzAssignment_9_1; }
		
		//EClassDecl
		public RuleCall getClazzEClassDeclParserRuleCall_9_1_0() { return cClazzEClassDeclParserRuleCall_9_1_0; }
		
		//"#21" EClassRef
		public Group getGroup_10() { return cGroup_10; }
		
		//"#21"
		public Keyword getNumberSignDigitTwoDigitOneKeyword_10_0() { return cNumberSignDigitTwoDigitOneKeyword_10_0; }
		
		//EClassRef
		public RuleCall getEClassRefParserRuleCall_10_1() { return cEClassRefParserRuleCall_10_1; }
		
		//"#22" TwoChildLists
		public Group getGroup_11() { return cGroup_11; }
		
		//"#22"
		public Keyword getNumberSignDigitTwoDigitTwoKeyword_11_0() { return cNumberSignDigitTwoDigitTwoKeyword_11_0; }
		
		//TwoChildLists
		public RuleCall getTwoChildListsParserRuleCall_11_1() { return cTwoChildListsParserRuleCall_11_1; }
		
		//"#23" ChildWithSubChilds
		public Group getGroup_12() { return cGroup_12; }
		
		//"#23"
		public Keyword getNumberSignDigitTwoDigitThreeKeyword_12_0() { return cNumberSignDigitTwoDigitThreeKeyword_12_0; }
		
		//ChildWithSubChilds
		public RuleCall getChildWithSubChildsParserRuleCall_12_1() { return cChildWithSubChildsParserRuleCall_12_1; }
		
		//"#24" TwoChilds
		public Group getGroup_13() { return cGroup_13; }
		
		//"#24"
		public Keyword getNumberSignDigitTwoDigitFourKeyword_13_0() { return cNumberSignDigitTwoDigitFourKeyword_13_0; }
		
		//TwoChilds
		public RuleCall getTwoChildsParserRuleCall_13_1() { return cTwoChildsParserRuleCall_13_1; }
		
		//"#30" WithTransientContainer
		public Group getGroup_14() { return cGroup_14; }
		
		//"#30"
		public Keyword getNumberSignDigitThreeDigitZeroKeyword_14_0() { return cNumberSignDigitThreeDigitZeroKeyword_14_0; }
		
		//WithTransientContainer
		public RuleCall getWithTransientContainerParserRuleCall_14_1() { return cWithTransientContainerParserRuleCall_14_1; }
	}
	public class MandatoryValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ide.tests.testlanguage.PartialSerializationTestLanguage.MandatoryValue");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//MandatoryValue:
		//	name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0() { return cNameIDTerminalRuleCall_0; }
	}
	public class OptionalValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ide.tests.testlanguage.PartialSerializationTestLanguage.OptionalValue");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cOptionalValueAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cKw1Keyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cKw2Keyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//OptionalValue:
		//	{OptionalValue} "kw1"? name=ID? "kw2"?;
		@Override public ParserRule getRule() { return rule; }
		
		//{OptionalValue} "kw1"? name=ID? "kw2"?
		public Group getGroup() { return cGroup; }
		
		//{OptionalValue}
		public Action getOptionalValueAction_0() { return cOptionalValueAction_0; }
		
		//"kw1"?
		public Keyword getKw1Keyword_1() { return cKw1Keyword_1; }
		
		//name=ID?
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//"kw2"?
		public Keyword getKw2Keyword_3() { return cKw2Keyword_3; }
	}
	public class ManyOptionalValuesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ide.tests.testlanguage.PartialSerializationTestLanguage.ManyOptionalValues");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cManyValuesAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//ManyOptionalValues:
		//	{ManyValues} name+=ID*;
		@Override public ParserRule getRule() { return rule; }
		
		//{ManyValues} name+=ID*
		public Group getGroup() { return cGroup; }
		
		//{ManyValues}
		public Action getManyValuesAction_0() { return cManyValuesAction_0; }
		
		//name+=ID*
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	public class ManyMandatoryValuesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ide.tests.testlanguage.PartialSerializationTestLanguage.ManyMandatoryValues");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//ManyMandatoryValues:
		//	name+=ID+;
		@Override public ParserRule getRule() { return rule; }
		
		//name+=ID+
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0() { return cNameIDTerminalRuleCall_0; }
	}
	public class MandatoryChildElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ide.tests.testlanguage.PartialSerializationTestLanguage.MandatoryChild");
		private final Assignment cChildAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cChildMandatoryValueParserRuleCall_0 = (RuleCall)cChildAssignment.eContents().get(0);
		
		//MandatoryChild:
		//	child=MandatoryValue;
		@Override public ParserRule getRule() { return rule; }
		
		//child=MandatoryValue
		public Assignment getChildAssignment() { return cChildAssignment; }
		
		//MandatoryValue
		public RuleCall getChildMandatoryValueParserRuleCall_0() { return cChildMandatoryValueParserRuleCall_0; }
	}
	public class OptionalChildElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ide.tests.testlanguage.PartialSerializationTestLanguage.OptionalChild");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cOptionalChildAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cChildAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cChildMandatoryValueParserRuleCall_1_0 = (RuleCall)cChildAssignment_1.eContents().get(0);
		
		//OptionalChild:
		//	{OptionalChild} child=MandatoryValue?;
		@Override public ParserRule getRule() { return rule; }
		
		//{OptionalChild} child=MandatoryValue?
		public Group getGroup() { return cGroup; }
		
		//{OptionalChild}
		public Action getOptionalChildAction_0() { return cOptionalChildAction_0; }
		
		//child=MandatoryValue?
		public Assignment getChildAssignment_1() { return cChildAssignment_1; }
		
		//MandatoryValue
		public RuleCall getChildMandatoryValueParserRuleCall_1_0() { return cChildMandatoryValueParserRuleCall_1_0; }
	}
	public class TwoChildListsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ide.tests.testlanguage.PartialSerializationTestLanguage.TwoChildLists");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cDirectChildrenAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cDirectChildrenMandatoryValueParserRuleCall_1_0 = (RuleCall)cDirectChildrenAssignment_1.eContents().get(0);
		private final Keyword cChildren1Keyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cChildsListAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cChildsListMandatoryChildListParserRuleCall_4_0 = (RuleCall)cChildsListAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//TwoChildLists:
		//	"{"
		//	directChildren+=MandatoryValue+
		//	"children1" "{"
		//	childsList=MandatoryChildList
		//	"}"
		//	"}";
		@Override public ParserRule getRule() { return rule; }
		
		//"{" directChildren+=MandatoryValue+ "children1" "{" childsList=MandatoryChildList "}" "}"
		public Group getGroup() { return cGroup; }
		
		//"{"
		public Keyword getLeftCurlyBracketKeyword_0() { return cLeftCurlyBracketKeyword_0; }
		
		//directChildren+=MandatoryValue+
		public Assignment getDirectChildrenAssignment_1() { return cDirectChildrenAssignment_1; }
		
		//MandatoryValue
		public RuleCall getDirectChildrenMandatoryValueParserRuleCall_1_0() { return cDirectChildrenMandatoryValueParserRuleCall_1_0; }
		
		//"children1"
		public Keyword getChildren1Keyword_2() { return cChildren1Keyword_2; }
		
		//"{"
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//childsList=MandatoryChildList
		public Assignment getChildsListAssignment_4() { return cChildsListAssignment_4; }
		
		//MandatoryChildList
		public RuleCall getChildsListMandatoryChildListParserRuleCall_4_0() { return cChildsListMandatoryChildListParserRuleCall_4_0; }
		
		//"}"
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
		
		//"}"
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class TwoChildsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ide.tests.testlanguage.PartialSerializationTestLanguage.TwoChilds");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cTwoChildsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cDirectKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cDirectChildAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cDirectChildMandatoryValueParserRuleCall_3_0 = (RuleCall)cDirectChildAssignment_3.eContents().get(0);
		private final Keyword cChildKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cColonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cOptChildAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cOptChildOptionalChildParserRuleCall_6_0 = (RuleCall)cOptChildAssignment_6.eContents().get(0);
		
		//TwoChilds:
		//	{TwoChilds}
		//	"direct" ":" directChild=MandatoryValue?
		//	"child" ":" optChild=OptionalChild;
		@Override public ParserRule getRule() { return rule; }
		
		//{TwoChilds} "direct" ":" directChild=MandatoryValue? "child" ":" optChild=OptionalChild
		public Group getGroup() { return cGroup; }
		
		//{TwoChilds}
		public Action getTwoChildsAction_0() { return cTwoChildsAction_0; }
		
		//"direct"
		public Keyword getDirectKeyword_1() { return cDirectKeyword_1; }
		
		//":"
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//directChild=MandatoryValue?
		public Assignment getDirectChildAssignment_3() { return cDirectChildAssignment_3; }
		
		//MandatoryValue
		public RuleCall getDirectChildMandatoryValueParserRuleCall_3_0() { return cDirectChildMandatoryValueParserRuleCall_3_0; }
		
		//"child"
		public Keyword getChildKeyword_4() { return cChildKeyword_4; }
		
		//":"
		public Keyword getColonKeyword_5() { return cColonKeyword_5; }
		
		//optChild=OptionalChild
		public Assignment getOptChildAssignment_6() { return cOptChildAssignment_6; }
		
		//OptionalChild
		public RuleCall getOptChildOptionalChildParserRuleCall_6_0() { return cOptChildOptionalChildParserRuleCall_6_0; }
	}
	public class ChildWithSubChildsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ide.tests.testlanguage.PartialSerializationTestLanguage.ChildWithSubChilds");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cChildWithSubChildsAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cChildrenAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cChildrenChildWithSubChildParserRuleCall_1_0 = (RuleCall)cChildrenAssignment_1.eContents().get(0);
		
		//ChildWithSubChilds:
		//	{ChildWithSubChilds} children+=ChildWithSubChild*;
		@Override public ParserRule getRule() { return rule; }
		
		//{ChildWithSubChilds} children+=ChildWithSubChild*
		public Group getGroup() { return cGroup; }
		
		//{ChildWithSubChilds}
		public Action getChildWithSubChildsAction_0() { return cChildWithSubChildsAction_0; }
		
		//children+=ChildWithSubChild*
		public Assignment getChildrenAssignment_1() { return cChildrenAssignment_1; }
		
		//ChildWithSubChild
		public RuleCall getChildrenChildWithSubChildParserRuleCall_1_0() { return cChildrenChildWithSubChildParserRuleCall_1_0; }
	}
	public class ChildWithSubChildElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ide.tests.testlanguage.PartialSerializationTestLanguage.ChildWithSubChild");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cChildWithSubChildAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cSubsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSubChildsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSubChildsSubChildParserRuleCall_2_0 = (RuleCall)cSubChildsAssignment_2.eContents().get(0);
		
		//ChildWithSubChild:
		//	{ChildWithSubChild} "subs"
		//	subChilds+=SubChild*;
		@Override public ParserRule getRule() { return rule; }
		
		//{ChildWithSubChild} "subs" subChilds+=SubChild*
		public Group getGroup() { return cGroup; }
		
		//{ChildWithSubChild}
		public Action getChildWithSubChildAction_0() { return cChildWithSubChildAction_0; }
		
		//"subs"
		public Keyword getSubsKeyword_1() { return cSubsKeyword_1; }
		
		//subChilds+=SubChild*
		public Assignment getSubChildsAssignment_2() { return cSubChildsAssignment_2; }
		
		//SubChild
		public RuleCall getSubChildsSubChildParserRuleCall_2_0() { return cSubChildsSubChildParserRuleCall_2_0; }
	}
	public class SubChildElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ide.tests.testlanguage.PartialSerializationTestLanguage.SubChild");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//SubChild:
		//	name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0() { return cNameIDTerminalRuleCall_0; }
	}
	public class MandatoryChildListElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ide.tests.testlanguage.PartialSerializationTestLanguage.MandatoryChildList");
		private final Assignment cChildrenAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cChildrenMandatoryValueParserRuleCall_0 = (RuleCall)cChildrenAssignment.eContents().get(0);
		
		//MandatoryChildList:
		//	children+=MandatoryValue+;
		@Override public ParserRule getRule() { return rule; }
		
		//children+=MandatoryValue+
		public Assignment getChildrenAssignment() { return cChildrenAssignment; }
		
		//MandatoryValue
		public RuleCall getChildrenMandatoryValueParserRuleCall_0() { return cChildrenMandatoryValueParserRuleCall_0; }
	}
	public class OptionalChildListElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ide.tests.testlanguage.PartialSerializationTestLanguage.OptionalChildList");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cOptionalChildListAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cChildrenAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cChildrenMandatoryValueParserRuleCall_1_0 = (RuleCall)cChildrenAssignment_1.eContents().get(0);
		
		//OptionalChildList:
		//	{OptionalChildList} children+=MandatoryValue*;
		@Override public ParserRule getRule() { return rule; }
		
		//{OptionalChildList} children+=MandatoryValue*
		public Group getGroup() { return cGroup; }
		
		//{OptionalChildList}
		public Action getOptionalChildListAction_0() { return cOptionalChildListAction_0; }
		
		//children+=MandatoryValue*
		public Assignment getChildrenAssignment_1() { return cChildrenAssignment_1; }
		
		//MandatoryValue
		public RuleCall getChildrenMandatoryValueParserRuleCall_1_0() { return cChildrenMandatoryValueParserRuleCall_1_0; }
	}
	public class ImportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ide.tests.testlanguage.PartialSerializationTestLanguage.Import");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cImportKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cImportedNamespaceAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cImportedNamespaceQualifiedNameParserRuleCall_1_0 = (RuleCall)cImportedNamespaceAssignment_1.eContents().get(0);
		
		//Import:
		//	"import" importedNamespace=QualifiedName;
		@Override public ParserRule getRule() { return rule; }
		
		//"import" importedNamespace=QualifiedName
		public Group getGroup() { return cGroup; }
		
		//"import"
		public Keyword getImportKeyword_0() { return cImportKeyword_0; }
		
		//importedNamespace=QualifiedName
		public Assignment getImportedNamespaceAssignment_1() { return cImportedNamespaceAssignment_1; }
		
		//QualifiedName
		public RuleCall getImportedNamespaceQualifiedNameParserRuleCall_1_0() { return cImportedNamespaceQualifiedNameParserRuleCall_1_0; }
	}
	public class NodeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ide.tests.testlanguage.PartialSerializationTestLanguage.Node");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cNodeAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cImportsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cImportsImportParserRuleCall_1_0 = (RuleCall)cImportsAssignment_1.eContents().get(0);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cRefsKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cRefsAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final CrossReference cRefsNodeCrossReference_3_1_0 = (CrossReference)cRefsAssignment_3_1.eContents().get(0);
		private final RuleCall cRefsNodeQualifiedNameParserRuleCall_3_1_0_1 = (RuleCall)cRefsNodeCrossReference_3_1_0.eContents().get(1);
		private final Alternatives cAlternatives_4 = (Alternatives)cGroup.eContents().get(4);
		private final Group cGroup_4_0 = (Group)cAlternatives_4.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_4_0_0 = (Keyword)cGroup_4_0.eContents().get(0);
		private final Assignment cChildrenAssignment_4_0_1 = (Assignment)cGroup_4_0.eContents().get(1);
		private final RuleCall cChildrenNodeParserRuleCall_4_0_1_0 = (RuleCall)cChildrenAssignment_4_0_1.eContents().get(0);
		private final Group cGroup_4_0_2 = (Group)cGroup_4_0.eContents().get(2);
		private final Keyword cRefKeyword_4_0_2_0 = (Keyword)cGroup_4_0_2.eContents().get(0);
		private final Assignment cRefAssignment_4_0_2_1 = (Assignment)cGroup_4_0_2.eContents().get(1);
		private final CrossReference cRefNodeCrossReference_4_0_2_1_0 = (CrossReference)cRefAssignment_4_0_2_1.eContents().get(0);
		private final RuleCall cRefNodeQualifiedNameParserRuleCall_4_0_2_1_0_1 = (RuleCall)cRefNodeCrossReference_4_0_2_1_0.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_4_0_3 = (Keyword)cGroup_4_0.eContents().get(3);
		private final Keyword cSemicolonKeyword_4_1 = (Keyword)cAlternatives_4.eContents().get(1);
		
		////Imports:
		////	{ManyReferences} imports+=Import* "refs" refs+=[ecore::EObject|QualifiedName]*;
		//Node:
		//	{Node} imports+=Import*
		//	name=ID? ("refs" refs+=[Node|QualifiedName]*)? ("{" children+=Node* ("ref" ref=[Node|QualifiedName])? "}" | ";");
		@Override public ParserRule getRule() { return rule; }
		
		//{Node} imports+=Import* name=ID? ("refs" refs+=[Node|QualifiedName]*)? ("{" children+=Node* ("ref"
		//ref=[Node|QualifiedName])? "}" | ";")
		public Group getGroup() { return cGroup; }
		
		//{Node}
		public Action getNodeAction_0() { return cNodeAction_0; }
		
		//imports+=Import*
		public Assignment getImportsAssignment_1() { return cImportsAssignment_1; }
		
		//Import
		public RuleCall getImportsImportParserRuleCall_1_0() { return cImportsImportParserRuleCall_1_0; }
		
		//name=ID?
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//("refs" refs+=[Node|QualifiedName]*)?
		public Group getGroup_3() { return cGroup_3; }
		
		//"refs"
		public Keyword getRefsKeyword_3_0() { return cRefsKeyword_3_0; }
		
		//refs+=[Node|QualifiedName]*
		public Assignment getRefsAssignment_3_1() { return cRefsAssignment_3_1; }
		
		//[Node|QualifiedName]
		public CrossReference getRefsNodeCrossReference_3_1_0() { return cRefsNodeCrossReference_3_1_0; }
		
		//QualifiedName
		public RuleCall getRefsNodeQualifiedNameParserRuleCall_3_1_0_1() { return cRefsNodeQualifiedNameParserRuleCall_3_1_0_1; }
		
		//("{" children+=Node* ("ref" ref=[Node|QualifiedName])? "}" | ";")
		public Alternatives getAlternatives_4() { return cAlternatives_4; }
		
		//"{" children+=Node* ("ref" ref=[Node|QualifiedName])? "}"
		public Group getGroup_4_0() { return cGroup_4_0; }
		
		//"{"
		public Keyword getLeftCurlyBracketKeyword_4_0_0() { return cLeftCurlyBracketKeyword_4_0_0; }
		
		//children+=Node*
		public Assignment getChildrenAssignment_4_0_1() { return cChildrenAssignment_4_0_1; }
		
		//Node
		public RuleCall getChildrenNodeParserRuleCall_4_0_1_0() { return cChildrenNodeParserRuleCall_4_0_1_0; }
		
		//("ref" ref=[Node|QualifiedName])?
		public Group getGroup_4_0_2() { return cGroup_4_0_2; }
		
		//"ref"
		public Keyword getRefKeyword_4_0_2_0() { return cRefKeyword_4_0_2_0; }
		
		//ref=[Node|QualifiedName]
		public Assignment getRefAssignment_4_0_2_1() { return cRefAssignment_4_0_2_1; }
		
		//[Node|QualifiedName]
		public CrossReference getRefNodeCrossReference_4_0_2_1_0() { return cRefNodeCrossReference_4_0_2_1_0; }
		
		//QualifiedName
		public RuleCall getRefNodeQualifiedNameParserRuleCall_4_0_2_1_0_1() { return cRefNodeQualifiedNameParserRuleCall_4_0_2_1_0_1; }
		
		//"}"
		public Keyword getRightCurlyBracketKeyword_4_0_3() { return cRightCurlyBracketKeyword_4_0_3; }
		
		//";"
		public Keyword getSemicolonKeyword_4_1() { return cSemicolonKeyword_4_1; }
	}
	public class QualifiedNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ide.tests.testlanguage.PartialSerializationTestLanguage.QualifiedName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//QualifiedName:
		//	ID ("." ID)*;
		@Override public ParserRule getRule() { return rule; }
		
		//ID ("." ID)*
		public Group getGroup() { return cGroup; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }
		
		//("." ID)*
		public Group getGroup_1() { return cGroup_1; }
		
		//"."
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}
	public class EClassDeclElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ide.tests.testlanguage.PartialSerializationTestLanguage.EClassDecl");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//EClassDecl ecore::EClass:
		//	name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0() { return cNameIDTerminalRuleCall_0; }
	}
	public class EClassRefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ide.tests.testlanguage.PartialSerializationTestLanguage.EClassRef");
		private final Assignment cRefAssignment = (Assignment)rule.eContents().get(1);
		private final CrossReference cRefEClassCrossReference_0 = (CrossReference)cRefAssignment.eContents().get(0);
		private final RuleCall cRefEClassQualifiedNameParserRuleCall_0_1 = (RuleCall)cRefEClassCrossReference_0.eContents().get(1);
		
		//EClassRef:
		//	ref=[ecore::EClass|QualifiedName];
		@Override public ParserRule getRule() { return rule; }
		
		//ref=[ecore::EClass|QualifiedName]
		public Assignment getRefAssignment() { return cRefAssignment; }
		
		//[ecore::EClass|QualifiedName]
		public CrossReference getRefEClassCrossReference_0() { return cRefEClassCrossReference_0; }
		
		//QualifiedName
		public RuleCall getRefEClassQualifiedNameParserRuleCall_0_1() { return cRefEClassQualifiedNameParserRuleCall_0_1; }
	}
	public class WithTransientContainerElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ide.tests.testlanguage.PartialSerializationTestLanguage.WithTransientContainer");
		private final Assignment cChildAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cChildWithTransientParserRuleCall_0 = (RuleCall)cChildAssignment.eContents().get(0);
		
		//WithTransientContainer:
		//	child=WithTransient;
		@Override public ParserRule getRule() { return rule; }
		
		//child=WithTransient
		public Assignment getChildAssignment() { return cChildAssignment; }
		
		//WithTransient
		public RuleCall getChildWithTransientParserRuleCall_0() { return cChildWithTransientParserRuleCall_0; }
	}
	public class WithTransientElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ide.tests.testlanguage.PartialSerializationTestLanguage.WithTransient");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//WithTransient withtransient::WithTransient:
		//	name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0() { return cNameIDTerminalRuleCall_0; }
	}
	
	
	private final ModelElements pModel;
	private final MandatoryValueElements pMandatoryValue;
	private final OptionalValueElements pOptionalValue;
	private final ManyOptionalValuesElements pManyOptionalValues;
	private final ManyMandatoryValuesElements pManyMandatoryValues;
	private final MandatoryChildElements pMandatoryChild;
	private final OptionalChildElements pOptionalChild;
	private final TwoChildListsElements pTwoChildLists;
	private final TwoChildsElements pTwoChilds;
	private final ChildWithSubChildsElements pChildWithSubChilds;
	private final ChildWithSubChildElements pChildWithSubChild;
	private final SubChildElements pSubChild;
	private final MandatoryChildListElements pMandatoryChildList;
	private final OptionalChildListElements pOptionalChildList;
	private final ImportElements pImport;
	private final NodeElements pNode;
	private final QualifiedNameElements pQualifiedName;
	private final EClassDeclElements pEClassDecl;
	private final EClassRefElements pEClassRef;
	private final WithTransientContainerElements pWithTransientContainer;
	private final WithTransientElements pWithTransient;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public PartialSerializationTestLanguageGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pMandatoryValue = new MandatoryValueElements();
		this.pOptionalValue = new OptionalValueElements();
		this.pManyOptionalValues = new ManyOptionalValuesElements();
		this.pManyMandatoryValues = new ManyMandatoryValuesElements();
		this.pMandatoryChild = new MandatoryChildElements();
		this.pOptionalChild = new OptionalChildElements();
		this.pTwoChildLists = new TwoChildListsElements();
		this.pTwoChilds = new TwoChildsElements();
		this.pChildWithSubChilds = new ChildWithSubChildsElements();
		this.pChildWithSubChild = new ChildWithSubChildElements();
		this.pSubChild = new SubChildElements();
		this.pMandatoryChildList = new MandatoryChildListElements();
		this.pOptionalChildList = new OptionalChildListElements();
		this.pImport = new ImportElements();
		this.pNode = new NodeElements();
		this.pQualifiedName = new QualifiedNameElements();
		this.pEClassDecl = new EClassDeclElements();
		this.pEClassRef = new EClassRefElements();
		this.pWithTransientContainer = new WithTransientContainerElements();
		this.pWithTransient = new WithTransientElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.ide.tests.testlanguage.PartialSerializationTestLanguage".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	"#1" Node |
	//	"#2" MandatoryValue |
	//	"#3" OptionalValue |
	//	"#4" MandatoryChild |
	//	"#5" OptionalChild |
	//	"#10" ManyOptionalValues |
	//	"#11" ManyMandatoryValues |
	//	"#12" MandatoryChildList |
	//	"#13" OptionalChildList |
	//	//	"#14" Imports |
	//	"#20" clazz+=EClassDecl+ |
	//	"#21" EClassRef |
	//	"#22" TwoChildLists |
	//	"#23" ChildWithSubChilds |
	//	"#24" TwoChilds |
	//	"#30" WithTransientContainer;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//MandatoryValue:
	//	name=ID;
	public MandatoryValueElements getMandatoryValueAccess() {
		return pMandatoryValue;
	}
	
	public ParserRule getMandatoryValueRule() {
		return getMandatoryValueAccess().getRule();
	}
	
	//OptionalValue:
	//	{OptionalValue} "kw1"? name=ID? "kw2"?;
	public OptionalValueElements getOptionalValueAccess() {
		return pOptionalValue;
	}
	
	public ParserRule getOptionalValueRule() {
		return getOptionalValueAccess().getRule();
	}
	
	//ManyOptionalValues:
	//	{ManyValues} name+=ID*;
	public ManyOptionalValuesElements getManyOptionalValuesAccess() {
		return pManyOptionalValues;
	}
	
	public ParserRule getManyOptionalValuesRule() {
		return getManyOptionalValuesAccess().getRule();
	}
	
	//ManyMandatoryValues:
	//	name+=ID+;
	public ManyMandatoryValuesElements getManyMandatoryValuesAccess() {
		return pManyMandatoryValues;
	}
	
	public ParserRule getManyMandatoryValuesRule() {
		return getManyMandatoryValuesAccess().getRule();
	}
	
	//MandatoryChild:
	//	child=MandatoryValue;
	public MandatoryChildElements getMandatoryChildAccess() {
		return pMandatoryChild;
	}
	
	public ParserRule getMandatoryChildRule() {
		return getMandatoryChildAccess().getRule();
	}
	
	//OptionalChild:
	//	{OptionalChild} child=MandatoryValue?;
	public OptionalChildElements getOptionalChildAccess() {
		return pOptionalChild;
	}
	
	public ParserRule getOptionalChildRule() {
		return getOptionalChildAccess().getRule();
	}
	
	//TwoChildLists:
	//	"{"
	//	directChildren+=MandatoryValue+
	//	"children1" "{"
	//	childsList=MandatoryChildList
	//	"}"
	//	"}";
	public TwoChildListsElements getTwoChildListsAccess() {
		return pTwoChildLists;
	}
	
	public ParserRule getTwoChildListsRule() {
		return getTwoChildListsAccess().getRule();
	}
	
	//TwoChilds:
	//	{TwoChilds}
	//	"direct" ":" directChild=MandatoryValue?
	//	"child" ":" optChild=OptionalChild;
	public TwoChildsElements getTwoChildsAccess() {
		return pTwoChilds;
	}
	
	public ParserRule getTwoChildsRule() {
		return getTwoChildsAccess().getRule();
	}
	
	//ChildWithSubChilds:
	//	{ChildWithSubChilds} children+=ChildWithSubChild*;
	public ChildWithSubChildsElements getChildWithSubChildsAccess() {
		return pChildWithSubChilds;
	}
	
	public ParserRule getChildWithSubChildsRule() {
		return getChildWithSubChildsAccess().getRule();
	}
	
	//ChildWithSubChild:
	//	{ChildWithSubChild} "subs"
	//	subChilds+=SubChild*;
	public ChildWithSubChildElements getChildWithSubChildAccess() {
		return pChildWithSubChild;
	}
	
	public ParserRule getChildWithSubChildRule() {
		return getChildWithSubChildAccess().getRule();
	}
	
	//SubChild:
	//	name=ID;
	public SubChildElements getSubChildAccess() {
		return pSubChild;
	}
	
	public ParserRule getSubChildRule() {
		return getSubChildAccess().getRule();
	}
	
	//MandatoryChildList:
	//	children+=MandatoryValue+;
	public MandatoryChildListElements getMandatoryChildListAccess() {
		return pMandatoryChildList;
	}
	
	public ParserRule getMandatoryChildListRule() {
		return getMandatoryChildListAccess().getRule();
	}
	
	//OptionalChildList:
	//	{OptionalChildList} children+=MandatoryValue*;
	public OptionalChildListElements getOptionalChildListAccess() {
		return pOptionalChildList;
	}
	
	public ParserRule getOptionalChildListRule() {
		return getOptionalChildListAccess().getRule();
	}
	
	//Import:
	//	"import" importedNamespace=QualifiedName;
	public ImportElements getImportAccess() {
		return pImport;
	}
	
	public ParserRule getImportRule() {
		return getImportAccess().getRule();
	}
	
	////Imports:
	////	{ManyReferences} imports+=Import* "refs" refs+=[ecore::EObject|QualifiedName]*;
	//Node:
	//	{Node} imports+=Import*
	//	name=ID? ("refs" refs+=[Node|QualifiedName]*)? ("{" children+=Node* ("ref" ref=[Node|QualifiedName])? "}" | ";");
	public NodeElements getNodeAccess() {
		return pNode;
	}
	
	public ParserRule getNodeRule() {
		return getNodeAccess().getRule();
	}
	
	//QualifiedName:
	//	ID ("." ID)*;
	public QualifiedNameElements getQualifiedNameAccess() {
		return pQualifiedName;
	}
	
	public ParserRule getQualifiedNameRule() {
		return getQualifiedNameAccess().getRule();
	}
	
	//EClassDecl ecore::EClass:
	//	name=ID;
	public EClassDeclElements getEClassDeclAccess() {
		return pEClassDecl;
	}
	
	public ParserRule getEClassDeclRule() {
		return getEClassDeclAccess().getRule();
	}
	
	//EClassRef:
	//	ref=[ecore::EClass|QualifiedName];
	public EClassRefElements getEClassRefAccess() {
		return pEClassRef;
	}
	
	public ParserRule getEClassRefRule() {
		return getEClassRefAccess().getRule();
	}
	
	//WithTransientContainer:
	//	child=WithTransient;
	public WithTransientContainerElements getWithTransientContainerAccess() {
		return pWithTransientContainer;
	}
	
	public ParserRule getWithTransientContainerRule() {
		return getWithTransientContainerAccess().getRule();
	}
	
	//WithTransient withtransient::WithTransient:
	//	name=ID;
	public WithTransientElements getWithTransientAccess() {
		return pWithTransient;
	}
	
	public ParserRule getWithTransientRule() {
		return getWithTransientAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
