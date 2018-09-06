/*
 * Copyright (c) 2016, 2017 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
grammar InternalCore861_ContentAssistLookAheadTestLanguage;

options {
	superClass=AbstractInternalContentAssistParser;
	backtrack=true;
}

@lexer::header {
package org.eclipse.xtext.ide.tests.testlanguage.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.eclipse.xtext.ide.tests.testlanguage.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.eclipse.xtext.ide.tests.testlanguage.services.Core861_ContentAssistLookAheadTestLanguageGrammarAccess;

}
@parser::members {
	private Core861_ContentAssistLookAheadTestLanguageGrammarAccess grammarAccess;

	public void setGrammarAccess(Core861_ContentAssistLookAheadTestLanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleMember
entryRuleMember
:
{ before(grammarAccess.getMemberRule()); }
	 ruleMember
{ after(grammarAccess.getMemberRule()); } 
	 EOF 
;

// Rule Member
ruleMember 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMemberAccess().getAlternatives()); }
		(rule__Member__Alternatives)
		{ after(grammarAccess.getMemberAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFieldDecl
entryRuleFieldDecl
:
{ before(grammarAccess.getFieldDeclRule()); }
	 ruleFieldDecl
{ after(grammarAccess.getFieldDeclRule()); } 
	 EOF 
;

// Rule FieldDecl
ruleFieldDecl 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFieldDeclAccess().getGroup()); }
		(rule__FieldDecl__Group__0)
		{ after(grammarAccess.getFieldDeclAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMethodDecl
entryRuleMethodDecl
:
{ before(grammarAccess.getMethodDeclRule()); }
	 ruleMethodDecl
{ after(grammarAccess.getMethodDeclRule()); } 
	 EOF 
;

// Rule MethodDecl
ruleMethodDecl 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMethodDeclAccess().getGroup()); }
		(rule__MethodDecl__Group__0)
		{ after(grammarAccess.getMethodDeclAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleType
entryRuleType
:
{ before(grammarAccess.getTypeRule()); }
	 ruleType
{ after(grammarAccess.getTypeRule()); } 
	 EOF 
;

// Rule Type
ruleType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTypeAccess().getAlternatives()); }
		(rule__Type__Alternatives)
		{ after(grammarAccess.getTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleQualifiedName
entryRuleQualifiedName
:
{ before(grammarAccess.getQualifiedNameRule()); }
	 ruleQualifiedName
{ after(grammarAccess.getQualifiedNameRule()); } 
	 EOF 
;

// Rule QualifiedName
ruleQualifiedName 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getQualifiedNameAccess().getGroup()); }
		(rule__QualifiedName__Group__0)
		{ after(grammarAccess.getQualifiedNameAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleStatement
entryRuleStatement
:
{ before(grammarAccess.getStatementRule()); }
	 ruleStatement
{ after(grammarAccess.getStatementRule()); } 
	 EOF 
;

// Rule Statement
ruleStatement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStatementAccess().getAlternatives()); }
		(rule__Statement__Alternatives)
		{ after(grammarAccess.getStatementAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAssignmentStatement
entryRuleAssignmentStatement
:
{ before(grammarAccess.getAssignmentStatementRule()); }
	 ruleAssignmentStatement
{ after(grammarAccess.getAssignmentStatementRule()); } 
	 EOF 
;

// Rule AssignmentStatement
ruleAssignmentStatement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAssignmentStatementAccess().getGroup()); }
		(rule__AssignmentStatement__Group__0)
		{ after(grammarAccess.getAssignmentStatementAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFeatureCall
entryRuleFeatureCall
:
{ before(grammarAccess.getFeatureCallRule()); }
	 ruleFeatureCall
{ after(grammarAccess.getFeatureCallRule()); } 
	 EOF 
;

// Rule FeatureCall
ruleFeatureCall 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFeatureCallAccess().getGroup()); }
		(rule__FeatureCall__Group__0)
		{ after(grammarAccess.getFeatureCallAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAnnotation
entryRuleAnnotation
:
{ before(grammarAccess.getAnnotationRule()); }
	 ruleAnnotation
{ after(grammarAccess.getAnnotationRule()); } 
	 EOF 
;

// Rule Annotation
ruleAnnotation 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAnnotationAccess().getGroup()); }
		(rule__Annotation__Group__0)
		{ after(grammarAccess.getAnnotationAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Member__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMemberAccess().getFieldDeclParserRuleCall_0()); }
		ruleFieldDecl
		{ after(grammarAccess.getMemberAccess().getFieldDeclParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getMemberAccess().getMethodDeclParserRuleCall_1()); }
		ruleMethodDecl
		{ after(grammarAccess.getMemberAccess().getMethodDeclParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldDecl__ModifierAlternatives_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFieldDeclAccess().getModifierPrivateKeyword_1_0_0()); }
		'private'
		{ after(grammarAccess.getFieldDeclAccess().getModifierPrivateKeyword_1_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getFieldDeclAccess().getModifierPublicKeyword_1_0_1()); }
		'public'
		{ after(grammarAccess.getFieldDeclAccess().getModifierPublicKeyword_1_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MethodDecl__ModifierAlternatives_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMethodDeclAccess().getModifierPrivateKeyword_1_0_0()); }
		'private'
		{ after(grammarAccess.getMethodDeclAccess().getModifierPrivateKeyword_1_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getMethodDeclAccess().getModifierPublicKeyword_1_0_1()); }
		'public'
		{ after(grammarAccess.getMethodDeclAccess().getModifierPublicKeyword_1_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeAccess().getGroup_0()); }
		(rule__Type__Group_0__0)
		{ after(grammarAccess.getTypeAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getTypeAccess().getGroup_1()); }
		(rule__Type__Group_1__0)
		{ after(grammarAccess.getTypeAccess().getGroup_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Statement__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStatementAccess().getAssignmentStatementParserRuleCall_0()); }
		ruleAssignmentStatement
		{ after(grammarAccess.getStatementAccess().getAssignmentStatementParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getStatementAccess().getGroup_1()); }
		(rule__Statement__Group_1__0)
		{ after(grammarAccess.getStatementAccess().getGroup_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldDecl__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FieldDecl__Group__0__Impl
	rule__FieldDecl__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldDecl__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFieldDeclAccess().getAnnotationsAssignment_0()); }
	(rule__FieldDecl__AnnotationsAssignment_0)*
	{ after(grammarAccess.getFieldDeclAccess().getAnnotationsAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldDecl__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FieldDecl__Group__1__Impl
	rule__FieldDecl__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldDecl__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFieldDeclAccess().getModifierAssignment_1()); }
	(rule__FieldDecl__ModifierAssignment_1)?
	{ after(grammarAccess.getFieldDeclAccess().getModifierAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldDecl__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FieldDecl__Group__2__Impl
	rule__FieldDecl__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldDecl__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFieldDeclAccess().getTypeAssignment_2()); }
	(rule__FieldDecl__TypeAssignment_2)
	{ after(grammarAccess.getFieldDeclAccess().getTypeAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldDecl__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FieldDecl__Group__3__Impl
	rule__FieldDecl__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldDecl__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFieldDeclAccess().getNameAssignment_3()); }
	(rule__FieldDecl__NameAssignment_3)
	{ after(grammarAccess.getFieldDeclAccess().getNameAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldDecl__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FieldDecl__Group__4__Impl
	rule__FieldDecl__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldDecl__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFieldDeclAccess().getGroup_4()); }
	(rule__FieldDecl__Group_4__0)?
	{ after(grammarAccess.getFieldDeclAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldDecl__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FieldDecl__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldDecl__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFieldDeclAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getFieldDeclAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__FieldDecl__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FieldDecl__Group_4__0__Impl
	rule__FieldDecl__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldDecl__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFieldDeclAccess().getEqualsSignKeyword_4_0()); }
	'='
	{ after(grammarAccess.getFieldDeclAccess().getEqualsSignKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldDecl__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FieldDecl__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldDecl__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFieldDeclAccess().getInitValAssignment_4_1()); }
	(rule__FieldDecl__InitValAssignment_4_1)
	{ after(grammarAccess.getFieldDeclAccess().getInitValAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MethodDecl__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MethodDecl__Group__0__Impl
	rule__MethodDecl__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MethodDecl__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMethodDeclAccess().getAnnotationsAssignment_0()); }
	(rule__MethodDecl__AnnotationsAssignment_0)*
	{ after(grammarAccess.getMethodDeclAccess().getAnnotationsAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MethodDecl__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MethodDecl__Group__1__Impl
	rule__MethodDecl__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MethodDecl__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMethodDeclAccess().getModifierAssignment_1()); }
	(rule__MethodDecl__ModifierAssignment_1)?
	{ after(grammarAccess.getMethodDeclAccess().getModifierAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MethodDecl__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MethodDecl__Group__2__Impl
	rule__MethodDecl__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MethodDecl__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMethodDeclAccess().getTypeAssignment_2()); }
	(rule__MethodDecl__TypeAssignment_2)
	{ after(grammarAccess.getMethodDeclAccess().getTypeAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MethodDecl__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MethodDecl__Group__3__Impl
	rule__MethodDecl__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MethodDecl__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMethodDeclAccess().getNameAssignment_3()); }
	(rule__MethodDecl__NameAssignment_3)
	{ after(grammarAccess.getMethodDeclAccess().getNameAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MethodDecl__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MethodDecl__Group__4__Impl
	rule__MethodDecl__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MethodDecl__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMethodDeclAccess().getLeftParenthesisKeyword_4()); }
	'('
	{ after(grammarAccess.getMethodDeclAccess().getLeftParenthesisKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MethodDecl__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MethodDecl__Group__5__Impl
	rule__MethodDecl__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__MethodDecl__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMethodDeclAccess().getRightParenthesisKeyword_5()); }
	')'
	{ after(grammarAccess.getMethodDeclAccess().getRightParenthesisKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MethodDecl__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MethodDecl__Group__6__Impl
	rule__MethodDecl__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__MethodDecl__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMethodDeclAccess().getLeftCurlyBracketKeyword_6()); }
	'{'
	{ after(grammarAccess.getMethodDeclAccess().getLeftCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MethodDecl__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MethodDecl__Group__7__Impl
	rule__MethodDecl__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__MethodDecl__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMethodDeclAccess().getDeclsAssignment_7()); }
	(rule__MethodDecl__DeclsAssignment_7)*
	{ after(grammarAccess.getMethodDeclAccess().getDeclsAssignment_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MethodDecl__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MethodDecl__Group__8__Impl
	rule__MethodDecl__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__MethodDecl__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMethodDeclAccess().getStatementsAssignment_8()); }
	(rule__MethodDecl__StatementsAssignment_8)*
	{ after(grammarAccess.getMethodDeclAccess().getStatementsAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MethodDecl__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MethodDecl__Group__9__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MethodDecl__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMethodDeclAccess().getRightCurlyBracketKeyword_9()); }
	'}'
	{ after(grammarAccess.getMethodDeclAccess().getRightCurlyBracketKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Type__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_0__0__Impl
	rule__Type__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getIntTypeAction_0_0()); }
	()
	{ after(grammarAccess.getTypeAccess().getIntTypeAction_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getIntKeyword_0_1()); }
	'int'
	{ after(grammarAccess.getTypeAccess().getIntKeyword_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Type__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_1__0__Impl
	rule__Type__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getTypeRefAction_1_0()); }
	()
	{ after(grammarAccess.getTypeAccess().getTypeRefAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getTypeAssignment_1_1()); }
	(rule__Type__TypeAssignment_1_1)
	{ after(grammarAccess.getTypeAccess().getTypeAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QualifiedName__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedName__Group__0__Impl
	rule__QualifiedName__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); }
	RULE_ID
	{ after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedName__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedNameAccess().getGroup_1()); }
	(rule__QualifiedName__Group_1__0)*
	{ after(grammarAccess.getQualifiedNameAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QualifiedName__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedName__Group_1__0__Impl
	rule__QualifiedName__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); }
	'.'
	{ after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedName__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); }
	RULE_ID
	{ after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Statement__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Statement__Group_1__0__Impl
	rule__Statement__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Statement__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStatementAccess().getReturnAction_1_0()); }
	()
	{ after(grammarAccess.getStatementAccess().getReturnAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Statement__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Statement__Group_1__1__Impl
	rule__Statement__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Statement__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStatementAccess().getReturnKeyword_1_1()); }
	'return'
	{ after(grammarAccess.getStatementAccess().getReturnKeyword_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Statement__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Statement__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Statement__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStatementAccess().getSemicolonKeyword_1_2()); }
	';'
	{ after(grammarAccess.getStatementAccess().getSemicolonKeyword_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AssignmentStatement__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AssignmentStatement__Group__0__Impl
	rule__AssignmentStatement__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AssignmentStatement__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAssignmentStatementAccess().getFeatureCallParserRuleCall_0()); }
	ruleFeatureCall
	{ after(grammarAccess.getAssignmentStatementAccess().getFeatureCallParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AssignmentStatement__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AssignmentStatement__Group__1__Impl
	rule__AssignmentStatement__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AssignmentStatement__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAssignmentStatementAccess().getGroup_1()); }
	(rule__AssignmentStatement__Group_1__0)?
	{ after(grammarAccess.getAssignmentStatementAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AssignmentStatement__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AssignmentStatement__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AssignmentStatement__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAssignmentStatementAccess().getSemicolonKeyword_2()); }
	';'
	{ after(grammarAccess.getAssignmentStatementAccess().getSemicolonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AssignmentStatement__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AssignmentStatement__Group_1__0__Impl
	rule__AssignmentStatement__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AssignmentStatement__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAssignmentStatementAccess().getAssignmentFeatureAction_1_0()); }
	()
	{ after(grammarAccess.getAssignmentStatementAccess().getAssignmentFeatureAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AssignmentStatement__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AssignmentStatement__Group_1__1__Impl
	rule__AssignmentStatement__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AssignmentStatement__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAssignmentStatementAccess().getEqualsSignKeyword_1_1()); }
	'='
	{ after(grammarAccess.getAssignmentStatementAccess().getEqualsSignKeyword_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AssignmentStatement__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AssignmentStatement__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AssignmentStatement__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAssignmentStatementAccess().getRhsAssignment_1_2()); }
	(rule__AssignmentStatement__RhsAssignment_1_2)
	{ after(grammarAccess.getAssignmentStatementAccess().getRhsAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__FeatureCall__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FeatureCall__Group__0__Impl
	rule__FeatureCall__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FeatureCall__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeatureCallAccess().getFeatureAssignment_0()); }
	(rule__FeatureCall__FeatureAssignment_0)
	{ after(grammarAccess.getFeatureCallAccess().getFeatureAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FeatureCall__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FeatureCall__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FeatureCall__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeatureCallAccess().getGroup_1()); }
	(rule__FeatureCall__Group_1__0)*
	{ after(grammarAccess.getFeatureCallAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__FeatureCall__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FeatureCall__Group_1__0__Impl
	rule__FeatureCall__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FeatureCall__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeatureCallAccess().getMemberCallOwnerAction_1_0()); }
	()
	{ after(grammarAccess.getFeatureCallAccess().getMemberCallOwnerAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FeatureCall__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FeatureCall__Group_1__1__Impl
	rule__FeatureCall__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__FeatureCall__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeatureCallAccess().getFullStopKeyword_1_1()); }
	('.')
	{ after(grammarAccess.getFeatureCallAccess().getFullStopKeyword_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FeatureCall__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FeatureCall__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FeatureCall__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeatureCallAccess().getMemberAssignment_1_2()); }
	(rule__FeatureCall__MemberAssignment_1_2)
	{ after(grammarAccess.getFeatureCallAccess().getMemberAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Annotation__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Annotation__Group__0__Impl
	rule__Annotation__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0()); }
	'@'
	{ after(grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Annotation__Group__1__Impl
	rule__Annotation__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnotationAccess().getKeyAssignment_1()); }
	(rule__Annotation__KeyAssignment_1)
	{ after(grammarAccess.getAnnotationAccess().getKeyAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Annotation__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnotationAccess().getGroup_2()); }
	(rule__Annotation__Group_2__0)?
	{ after(grammarAccess.getAnnotationAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Annotation__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Annotation__Group_2__0__Impl
	rule__Annotation__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_2_0()); }
	'('
	{ after(grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Annotation__Group_2__1__Impl
	rule__Annotation__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnotationAccess().getValuesAssignment_2_1()); }
	(rule__Annotation__ValuesAssignment_2_1)
	{ after(grammarAccess.getAnnotationAccess().getValuesAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Annotation__Group_2__2__Impl
	rule__Annotation__Group_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnotationAccess().getGroup_2_2()); }
	(rule__Annotation__Group_2_2__0)*
	{ after(grammarAccess.getAnnotationAccess().getGroup_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group_2__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Annotation__Group_2__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group_2__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnotationAccess().getRightParenthesisKeyword_2_3()); }
	')'
	{ after(grammarAccess.getAnnotationAccess().getRightParenthesisKeyword_2_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Annotation__Group_2_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Annotation__Group_2_2__0__Impl
	rule__Annotation__Group_2_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group_2_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnotationAccess().getCommaKeyword_2_2_0()); }
	','
	{ after(grammarAccess.getAnnotationAccess().getCommaKeyword_2_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group_2_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Annotation__Group_2_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__Group_2_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnnotationAccess().getValuesAssignment_2_2_1()); }
	(rule__Annotation__ValuesAssignment_2_2_1)
	{ after(grammarAccess.getAnnotationAccess().getValuesAssignment_2_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__FieldDecl__AnnotationsAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFieldDeclAccess().getAnnotationsAnnotationParserRuleCall_0_0()); }
		ruleAnnotation
		{ after(grammarAccess.getFieldDeclAccess().getAnnotationsAnnotationParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldDecl__ModifierAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFieldDeclAccess().getModifierAlternatives_1_0()); }
		(rule__FieldDecl__ModifierAlternatives_1_0)
		{ after(grammarAccess.getFieldDeclAccess().getModifierAlternatives_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldDecl__TypeAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFieldDeclAccess().getTypeTypeParserRuleCall_2_0()); }
		ruleType
		{ after(grammarAccess.getFieldDeclAccess().getTypeTypeParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldDecl__NameAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFieldDeclAccess().getNameIDTerminalRuleCall_3_0()); }
		RULE_ID
		{ after(grammarAccess.getFieldDeclAccess().getNameIDTerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FieldDecl__InitValAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFieldDeclAccess().getInitValINTTerminalRuleCall_4_1_0()); }
		RULE_INT
		{ after(grammarAccess.getFieldDeclAccess().getInitValINTTerminalRuleCall_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MethodDecl__AnnotationsAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMethodDeclAccess().getAnnotationsAnnotationParserRuleCall_0_0()); }
		ruleAnnotation
		{ after(grammarAccess.getMethodDeclAccess().getAnnotationsAnnotationParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MethodDecl__ModifierAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMethodDeclAccess().getModifierAlternatives_1_0()); }
		(rule__MethodDecl__ModifierAlternatives_1_0)
		{ after(grammarAccess.getMethodDeclAccess().getModifierAlternatives_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MethodDecl__TypeAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMethodDeclAccess().getTypeTypeParserRuleCall_2_0()); }
		ruleType
		{ after(grammarAccess.getMethodDeclAccess().getTypeTypeParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MethodDecl__NameAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMethodDeclAccess().getNameIDTerminalRuleCall_3_0()); }
		RULE_ID
		{ after(grammarAccess.getMethodDeclAccess().getNameIDTerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MethodDecl__DeclsAssignment_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMethodDeclAccess().getDeclsFieldDeclParserRuleCall_7_0()); }
		ruleFieldDecl
		{ after(grammarAccess.getMethodDeclAccess().getDeclsFieldDeclParserRuleCall_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MethodDecl__StatementsAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMethodDeclAccess().getStatementsStatementParserRuleCall_8_0()); }
		ruleStatement
		{ after(grammarAccess.getMethodDeclAccess().getStatementsStatementParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__TypeAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeAccess().getTypeTypeCrossReference_1_1_0()); }
		(
			{ before(grammarAccess.getTypeAccess().getTypeTypeQualifiedNameParserRuleCall_1_1_0_1()); }
			ruleQualifiedName
			{ after(grammarAccess.getTypeAccess().getTypeTypeQualifiedNameParserRuleCall_1_1_0_1()); }
		)
		{ after(grammarAccess.getTypeAccess().getTypeTypeCrossReference_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AssignmentStatement__RhsAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAssignmentStatementAccess().getRhsINTTerminalRuleCall_1_2_0()); }
		RULE_INT
		{ after(grammarAccess.getAssignmentStatementAccess().getRhsINTTerminalRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FeatureCall__FeatureAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFeatureCallAccess().getFeatureMemberCrossReference_0_0()); }
		(
			{ before(grammarAccess.getFeatureCallAccess().getFeatureMemberIDTerminalRuleCall_0_0_1()); }
			RULE_ID
			{ after(grammarAccess.getFeatureCallAccess().getFeatureMemberIDTerminalRuleCall_0_0_1()); }
		)
		{ after(grammarAccess.getFeatureCallAccess().getFeatureMemberCrossReference_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FeatureCall__MemberAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFeatureCallAccess().getMemberMemberCrossReference_1_2_0()); }
		(
			{ before(grammarAccess.getFeatureCallAccess().getMemberMemberIDTerminalRuleCall_1_2_0_1()); }
			RULE_ID
			{ after(grammarAccess.getFeatureCallAccess().getMemberMemberIDTerminalRuleCall_1_2_0_1()); }
		)
		{ after(grammarAccess.getFeatureCallAccess().getMemberMemberCrossReference_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__KeyAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAnnotationAccess().getKeyIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getAnnotationAccess().getKeyIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__ValuesAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAnnotationAccess().getValuesSTRINGTerminalRuleCall_2_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getAnnotationAccess().getValuesSTRINGTerminalRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Annotation__ValuesAssignment_2_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAnnotationAccess().getValuesSTRINGTerminalRuleCall_2_2_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getAnnotationAccess().getValuesSTRINGTerminalRuleCall_2_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
