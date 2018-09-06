/*
 * Copyright (c) 2016, 2017 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
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
public class Core861_ContentAssistLookAheadTestLanguageGrammarAccess extends AbstractGrammarElementFinder {
	
	public class MemberElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ide.tests.testlanguage.Core861_ContentAssistLookAheadTestLanguage.Member");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cFieldDeclParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cMethodDeclParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Member:
		//	FieldDecl | MethodDecl;
		@Override public ParserRule getRule() { return rule; }
		
		//FieldDecl | MethodDecl
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//FieldDecl
		public RuleCall getFieldDeclParserRuleCall_0() { return cFieldDeclParserRuleCall_0; }
		
		//MethodDecl
		public RuleCall getMethodDeclParserRuleCall_1() { return cMethodDeclParserRuleCall_1; }
	}
	public class FieldDeclElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ide.tests.testlanguage.Core861_ContentAssistLookAheadTestLanguage.FieldDecl");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cAnnotationsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cAnnotationsAnnotationParserRuleCall_0_0 = (RuleCall)cAnnotationsAssignment_0.eContents().get(0);
		private final Assignment cModifierAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Alternatives cModifierAlternatives_1_0 = (Alternatives)cModifierAssignment_1.eContents().get(0);
		private final Keyword cModifierPrivateKeyword_1_0_0 = (Keyword)cModifierAlternatives_1_0.eContents().get(0);
		private final Keyword cModifierPublicKeyword_1_0_1 = (Keyword)cModifierAlternatives_1_0.eContents().get(1);
		private final Assignment cTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTypeTypeParserRuleCall_2_0 = (RuleCall)cTypeAssignment_2.eContents().get(0);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameIDTerminalRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cEqualsSignKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cInitValAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cInitValINTTerminalRuleCall_4_1_0 = (RuleCall)cInitValAssignment_4_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//FieldDecl:
		//	annotations+=Annotation* modifier=('private' | 'public')? type=Type name=ID ('=' initVal=INT)? ';';
		@Override public ParserRule getRule() { return rule; }
		
		//annotations+=Annotation* modifier=('private' | 'public')? type=Type name=ID ('=' initVal=INT)? ';'
		public Group getGroup() { return cGroup; }
		
		//annotations+=Annotation*
		public Assignment getAnnotationsAssignment_0() { return cAnnotationsAssignment_0; }
		
		//Annotation
		public RuleCall getAnnotationsAnnotationParserRuleCall_0_0() { return cAnnotationsAnnotationParserRuleCall_0_0; }
		
		//modifier=('private' | 'public')?
		public Assignment getModifierAssignment_1() { return cModifierAssignment_1; }
		
		//('private' | 'public')
		public Alternatives getModifierAlternatives_1_0() { return cModifierAlternatives_1_0; }
		
		//'private'
		public Keyword getModifierPrivateKeyword_1_0_0() { return cModifierPrivateKeyword_1_0_0; }
		
		//'public'
		public Keyword getModifierPublicKeyword_1_0_1() { return cModifierPublicKeyword_1_0_1; }
		
		//type=Type
		public Assignment getTypeAssignment_2() { return cTypeAssignment_2; }
		
		//Type
		public RuleCall getTypeTypeParserRuleCall_2_0() { return cTypeTypeParserRuleCall_2_0; }
		
		//name=ID
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_3_0() { return cNameIDTerminalRuleCall_3_0; }
		
		//('=' initVal=INT)?
		public Group getGroup_4() { return cGroup_4; }
		
		//'='
		public Keyword getEqualsSignKeyword_4_0() { return cEqualsSignKeyword_4_0; }
		
		//initVal=INT
		public Assignment getInitValAssignment_4_1() { return cInitValAssignment_4_1; }
		
		//INT
		public RuleCall getInitValINTTerminalRuleCall_4_1_0() { return cInitValINTTerminalRuleCall_4_1_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}
	public class MethodDeclElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ide.tests.testlanguage.Core861_ContentAssistLookAheadTestLanguage.MethodDecl");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cAnnotationsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cAnnotationsAnnotationParserRuleCall_0_0 = (RuleCall)cAnnotationsAssignment_0.eContents().get(0);
		private final Assignment cModifierAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Alternatives cModifierAlternatives_1_0 = (Alternatives)cModifierAssignment_1.eContents().get(0);
		private final Keyword cModifierPrivateKeyword_1_0_0 = (Keyword)cModifierAlternatives_1_0.eContents().get(0);
		private final Keyword cModifierPublicKeyword_1_0_1 = (Keyword)cModifierAlternatives_1_0.eContents().get(1);
		private final Assignment cTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTypeTypeParserRuleCall_2_0 = (RuleCall)cTypeAssignment_2.eContents().get(0);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameIDTerminalRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cRightParenthesisKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cLeftCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cDeclsAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cDeclsFieldDeclParserRuleCall_7_0 = (RuleCall)cDeclsAssignment_7.eContents().get(0);
		private final Assignment cStatementsAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cStatementsStatementParserRuleCall_8_0 = (RuleCall)cStatementsAssignment_8.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_9 = (Keyword)cGroup.eContents().get(9);
		
		//MethodDecl:
		//	annotations+=Annotation* modifier=('private' | 'public')? type=Type name=ID '(' ')' '{'
		//	decls+=FieldDecl*
		//	statements+=Statement*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//annotations+=Annotation* modifier=('private' | 'public')? type=Type name=ID '(' ')' '{' decls+=FieldDecl*
		//statements+=Statement* '}'
		public Group getGroup() { return cGroup; }
		
		//annotations+=Annotation*
		public Assignment getAnnotationsAssignment_0() { return cAnnotationsAssignment_0; }
		
		//Annotation
		public RuleCall getAnnotationsAnnotationParserRuleCall_0_0() { return cAnnotationsAnnotationParserRuleCall_0_0; }
		
		//modifier=('private' | 'public')?
		public Assignment getModifierAssignment_1() { return cModifierAssignment_1; }
		
		//('private' | 'public')
		public Alternatives getModifierAlternatives_1_0() { return cModifierAlternatives_1_0; }
		
		//'private'
		public Keyword getModifierPrivateKeyword_1_0_0() { return cModifierPrivateKeyword_1_0_0; }
		
		//'public'
		public Keyword getModifierPublicKeyword_1_0_1() { return cModifierPublicKeyword_1_0_1; }
		
		//type=Type
		public Assignment getTypeAssignment_2() { return cTypeAssignment_2; }
		
		//Type
		public RuleCall getTypeTypeParserRuleCall_2_0() { return cTypeTypeParserRuleCall_2_0; }
		
		//name=ID
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_3_0() { return cNameIDTerminalRuleCall_3_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_4() { return cLeftParenthesisKeyword_4; }
		
		//')'
		public Keyword getRightParenthesisKeyword_5() { return cRightParenthesisKeyword_5; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_6() { return cLeftCurlyBracketKeyword_6; }
		
		//decls+=FieldDecl*
		public Assignment getDeclsAssignment_7() { return cDeclsAssignment_7; }
		
		//FieldDecl
		public RuleCall getDeclsFieldDeclParserRuleCall_7_0() { return cDeclsFieldDeclParserRuleCall_7_0; }
		
		//statements+=Statement*
		public Assignment getStatementsAssignment_8() { return cStatementsAssignment_8; }
		
		//Statement
		public RuleCall getStatementsStatementParserRuleCall_8_0() { return cStatementsStatementParserRuleCall_8_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_9() { return cRightCurlyBracketKeyword_9; }
	}
	public class TypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ide.tests.testlanguage.Core861_ContentAssistLookAheadTestLanguage.Type");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Action cIntTypeAction_0_0 = (Action)cGroup_0.eContents().get(0);
		private final Keyword cIntKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Action cTypeRefAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cTypeAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final CrossReference cTypeTypeCrossReference_1_1_0 = (CrossReference)cTypeAssignment_1_1.eContents().get(0);
		private final RuleCall cTypeTypeQualifiedNameParserRuleCall_1_1_0_1 = (RuleCall)cTypeTypeCrossReference_1_1_0.eContents().get(1);
		
		//Type:
		//	{IntType} "int" | {TypeRef} type=[Type|QualifiedName];
		@Override public ParserRule getRule() { return rule; }
		
		//{IntType} "int" | {TypeRef} type=[Type|QualifiedName]
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//{IntType} "int"
		public Group getGroup_0() { return cGroup_0; }
		
		//{IntType}
		public Action getIntTypeAction_0_0() { return cIntTypeAction_0_0; }
		
		//"int"
		public Keyword getIntKeyword_0_1() { return cIntKeyword_0_1; }
		
		//{TypeRef} type=[Type|QualifiedName]
		public Group getGroup_1() { return cGroup_1; }
		
		//{TypeRef}
		public Action getTypeRefAction_1_0() { return cTypeRefAction_1_0; }
		
		//type=[Type|QualifiedName]
		public Assignment getTypeAssignment_1_1() { return cTypeAssignment_1_1; }
		
		//[Type|QualifiedName]
		public CrossReference getTypeTypeCrossReference_1_1_0() { return cTypeTypeCrossReference_1_1_0; }
		
		//QualifiedName
		public RuleCall getTypeTypeQualifiedNameParserRuleCall_1_1_0_1() { return cTypeTypeQualifiedNameParserRuleCall_1_1_0_1; }
	}
	public class QualifiedNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ide.tests.testlanguage.Core861_ContentAssistLookAheadTestLanguage.QualifiedName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//QualifiedName:
		//	ID ('.' ID)*;
		@Override public ParserRule getRule() { return rule; }
		
		//ID ('.' ID)*
		public Group getGroup() { return cGroup; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }
		
		//('.' ID)*
		public Group getGroup_1() { return cGroup_1; }
		
		//'.'
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}
	public class StatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ide.tests.testlanguage.Core861_ContentAssistLookAheadTestLanguage.Statement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cAssignmentStatementParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Action cReturnAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Keyword cReturnKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Keyword cSemicolonKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		
		//Statement:
		//	AssignmentStatement
		//	| {Return} 'return' ';';
		@Override public ParserRule getRule() { return rule; }
		
		//AssignmentStatement | {Return} 'return' ';'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//AssignmentStatement
		public RuleCall getAssignmentStatementParserRuleCall_0() { return cAssignmentStatementParserRuleCall_0; }
		
		//{Return} 'return' ';'
		public Group getGroup_1() { return cGroup_1; }
		
		//{Return}
		public Action getReturnAction_1_0() { return cReturnAction_1_0; }
		
		//'return'
		public Keyword getReturnKeyword_1_1() { return cReturnKeyword_1_1; }
		
		//';'
		public Keyword getSemicolonKeyword_1_2() { return cSemicolonKeyword_1_2; }
	}
	public class AssignmentStatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ide.tests.testlanguage.Core861_ContentAssistLookAheadTestLanguage.AssignmentStatement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cFeatureCallParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cAssignmentFeatureAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Keyword cEqualsSignKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cRhsAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRhsINTTerminalRuleCall_1_2_0 = (RuleCall)cRhsAssignment_1_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//AssignmentStatement:
		//	FeatureCall ({Assignment.feature=current} '=' rhs=INT)? ';';
		@Override public ParserRule getRule() { return rule; }
		
		//FeatureCall ({Assignment.feature=current} '=' rhs=INT)? ';'
		public Group getGroup() { return cGroup; }
		
		//FeatureCall
		public RuleCall getFeatureCallParserRuleCall_0() { return cFeatureCallParserRuleCall_0; }
		
		//({Assignment.feature=current} '=' rhs=INT)?
		public Group getGroup_1() { return cGroup_1; }
		
		//{Assignment.feature=current}
		public Action getAssignmentFeatureAction_1_0() { return cAssignmentFeatureAction_1_0; }
		
		//'='
		public Keyword getEqualsSignKeyword_1_1() { return cEqualsSignKeyword_1_1; }
		
		//rhs=INT
		public Assignment getRhsAssignment_1_2() { return cRhsAssignment_1_2; }
		
		//INT
		public RuleCall getRhsINTTerminalRuleCall_1_2_0() { return cRhsINTTerminalRuleCall_1_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_2() { return cSemicolonKeyword_2; }
	}
	public class FeatureCallElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ide.tests.testlanguage.Core861_ContentAssistLookAheadTestLanguage.FeatureCall");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cFeatureAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cFeatureMemberCrossReference_0_0 = (CrossReference)cFeatureAssignment_0.eContents().get(0);
		private final RuleCall cFeatureMemberIDTerminalRuleCall_0_0_1 = (RuleCall)cFeatureMemberCrossReference_0_0.eContents().get(1);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cMemberCallOwnerAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Keyword cFullStopKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cMemberAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final CrossReference cMemberMemberCrossReference_1_2_0 = (CrossReference)cMemberAssignment_1_2.eContents().get(0);
		private final RuleCall cMemberMemberIDTerminalRuleCall_1_2_0_1 = (RuleCall)cMemberMemberCrossReference_1_2_0.eContents().get(1);
		
		//FeatureCall:
		//	feature=[Member] ({MemberCall.owner=current} -> "." member=[Member])*;
		@Override public ParserRule getRule() { return rule; }
		
		//feature=[Member] ({MemberCall.owner=current} -> "." member=[Member])*
		public Group getGroup() { return cGroup; }
		
		//feature=[Member]
		public Assignment getFeatureAssignment_0() { return cFeatureAssignment_0; }
		
		//[Member]
		public CrossReference getFeatureMemberCrossReference_0_0() { return cFeatureMemberCrossReference_0_0; }
		
		//ID
		public RuleCall getFeatureMemberIDTerminalRuleCall_0_0_1() { return cFeatureMemberIDTerminalRuleCall_0_0_1; }
		
		//({MemberCall.owner=current} -> "." member=[Member])*
		public Group getGroup_1() { return cGroup_1; }
		
		//{MemberCall.owner=current}
		public Action getMemberCallOwnerAction_1_0() { return cMemberCallOwnerAction_1_0; }
		
		//-> "."
		public Keyword getFullStopKeyword_1_1() { return cFullStopKeyword_1_1; }
		
		//member=[Member]
		public Assignment getMemberAssignment_1_2() { return cMemberAssignment_1_2; }
		
		//[Member]
		public CrossReference getMemberMemberCrossReference_1_2_0() { return cMemberMemberCrossReference_1_2_0; }
		
		//ID
		public RuleCall getMemberMemberIDTerminalRuleCall_1_2_0_1() { return cMemberMemberIDTerminalRuleCall_1_2_0_1; }
	}
	public class AnnotationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.ide.tests.testlanguage.Core861_ContentAssistLookAheadTestLanguage.Annotation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCommercialAtKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cKeyAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cKeyIDTerminalRuleCall_1_0 = (RuleCall)cKeyAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cLeftParenthesisKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cValuesAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cValuesSTRINGTerminalRuleCall_2_1_0 = (RuleCall)cValuesAssignment_2_1.eContents().get(0);
		private final Group cGroup_2_2 = (Group)cGroup_2.eContents().get(2);
		private final Keyword cCommaKeyword_2_2_0 = (Keyword)cGroup_2_2.eContents().get(0);
		private final Assignment cValuesAssignment_2_2_1 = (Assignment)cGroup_2_2.eContents().get(1);
		private final RuleCall cValuesSTRINGTerminalRuleCall_2_2_1_0 = (RuleCall)cValuesAssignment_2_2_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_2_3 = (Keyword)cGroup_2.eContents().get(3);
		
		//Annotation:
		//	'@' key=ID ('(' values+=STRING (',' values+=STRING)* ')')?;
		@Override public ParserRule getRule() { return rule; }
		
		//'@' key=ID ('(' values+=STRING (',' values+=STRING)* ')')?
		public Group getGroup() { return cGroup; }
		
		//'@'
		public Keyword getCommercialAtKeyword_0() { return cCommercialAtKeyword_0; }
		
		//key=ID
		public Assignment getKeyAssignment_1() { return cKeyAssignment_1; }
		
		//ID
		public RuleCall getKeyIDTerminalRuleCall_1_0() { return cKeyIDTerminalRuleCall_1_0; }
		
		//('(' values+=STRING (',' values+=STRING)* ')')?
		public Group getGroup_2() { return cGroup_2; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_2_0() { return cLeftParenthesisKeyword_2_0; }
		
		//values+=STRING
		public Assignment getValuesAssignment_2_1() { return cValuesAssignment_2_1; }
		
		//STRING
		public RuleCall getValuesSTRINGTerminalRuleCall_2_1_0() { return cValuesSTRINGTerminalRuleCall_2_1_0; }
		
		//(',' values+=STRING)*
		public Group getGroup_2_2() { return cGroup_2_2; }
		
		//','
		public Keyword getCommaKeyword_2_2_0() { return cCommaKeyword_2_2_0; }
		
		//values+=STRING
		public Assignment getValuesAssignment_2_2_1() { return cValuesAssignment_2_2_1; }
		
		//STRING
		public RuleCall getValuesSTRINGTerminalRuleCall_2_2_1_0() { return cValuesSTRINGTerminalRuleCall_2_2_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_2_3() { return cRightParenthesisKeyword_2_3; }
	}
	
	
	private final MemberElements pMember;
	private final FieldDeclElements pFieldDecl;
	private final MethodDeclElements pMethodDecl;
	private final TypeElements pType;
	private final QualifiedNameElements pQualifiedName;
	private final StatementElements pStatement;
	private final AssignmentStatementElements pAssignmentStatement;
	private final FeatureCallElements pFeatureCall;
	private final AnnotationElements pAnnotation;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public Core861_ContentAssistLookAheadTestLanguageGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pMember = new MemberElements();
		this.pFieldDecl = new FieldDeclElements();
		this.pMethodDecl = new MethodDeclElements();
		this.pType = new TypeElements();
		this.pQualifiedName = new QualifiedNameElements();
		this.pStatement = new StatementElements();
		this.pAssignmentStatement = new AssignmentStatementElements();
		this.pFeatureCall = new FeatureCallElements();
		this.pAnnotation = new AnnotationElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.ide.tests.testlanguage.Core861_ContentAssistLookAheadTestLanguage".equals(grammar.getName())) {
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

	
	//Member:
	//	FieldDecl | MethodDecl;
	public MemberElements getMemberAccess() {
		return pMember;
	}
	
	public ParserRule getMemberRule() {
		return getMemberAccess().getRule();
	}
	
	//FieldDecl:
	//	annotations+=Annotation* modifier=('private' | 'public')? type=Type name=ID ('=' initVal=INT)? ';';
	public FieldDeclElements getFieldDeclAccess() {
		return pFieldDecl;
	}
	
	public ParserRule getFieldDeclRule() {
		return getFieldDeclAccess().getRule();
	}
	
	//MethodDecl:
	//	annotations+=Annotation* modifier=('private' | 'public')? type=Type name=ID '(' ')' '{'
	//	decls+=FieldDecl*
	//	statements+=Statement*
	//	'}';
	public MethodDeclElements getMethodDeclAccess() {
		return pMethodDecl;
	}
	
	public ParserRule getMethodDeclRule() {
		return getMethodDeclAccess().getRule();
	}
	
	//Type:
	//	{IntType} "int" | {TypeRef} type=[Type|QualifiedName];
	public TypeElements getTypeAccess() {
		return pType;
	}
	
	public ParserRule getTypeRule() {
		return getTypeAccess().getRule();
	}
	
	//QualifiedName:
	//	ID ('.' ID)*;
	public QualifiedNameElements getQualifiedNameAccess() {
		return pQualifiedName;
	}
	
	public ParserRule getQualifiedNameRule() {
		return getQualifiedNameAccess().getRule();
	}
	
	//Statement:
	//	AssignmentStatement
	//	| {Return} 'return' ';';
	public StatementElements getStatementAccess() {
		return pStatement;
	}
	
	public ParserRule getStatementRule() {
		return getStatementAccess().getRule();
	}
	
	//AssignmentStatement:
	//	FeatureCall ({Assignment.feature=current} '=' rhs=INT)? ';';
	public AssignmentStatementElements getAssignmentStatementAccess() {
		return pAssignmentStatement;
	}
	
	public ParserRule getAssignmentStatementRule() {
		return getAssignmentStatementAccess().getRule();
	}
	
	//FeatureCall:
	//	feature=[Member] ({MemberCall.owner=current} -> "." member=[Member])*;
	public FeatureCallElements getFeatureCallAccess() {
		return pFeatureCall;
	}
	
	public ParserRule getFeatureCallRule() {
		return getFeatureCallAccess().getRule();
	}
	
	//Annotation:
	//	'@' key=ID ('(' values+=STRING (',' values+=STRING)* ')')?;
	public AnnotationElements getAnnotationAccess() {
		return pAnnotation;
	}
	
	public ParserRule getAnnotationRule() {
		return getAnnotationAccess().getRule();
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
