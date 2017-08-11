/*
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
grammar InternalPartialSerializationTestLanguage;

options {
	superClass=AbstractInternalContentAssistParser;
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
import org.eclipse.xtext.ide.tests.testlanguage.services.PartialSerializationTestLanguageGrammarAccess;

}
@parser::members {
	private PartialSerializationTestLanguageGrammarAccess grammarAccess;

	public void setGrammarAccess(PartialSerializationTestLanguageGrammarAccess grammarAccess) {
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

// Entry rule entryRuleModel
entryRuleModel
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getModelAccess().getAlternatives()); }
		(rule__Model__Alternatives)
		{ after(grammarAccess.getModelAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMandatoryValue
entryRuleMandatoryValue
:
{ before(grammarAccess.getMandatoryValueRule()); }
	 ruleMandatoryValue
{ after(grammarAccess.getMandatoryValueRule()); } 
	 EOF 
;

// Rule MandatoryValue
ruleMandatoryValue 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMandatoryValueAccess().getNameAssignment()); }
		(rule__MandatoryValue__NameAssignment)
		{ after(grammarAccess.getMandatoryValueAccess().getNameAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleOptionalValue
entryRuleOptionalValue
:
{ before(grammarAccess.getOptionalValueRule()); }
	 ruleOptionalValue
{ after(grammarAccess.getOptionalValueRule()); } 
	 EOF 
;

// Rule OptionalValue
ruleOptionalValue 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getOptionalValueAccess().getGroup()); }
		(rule__OptionalValue__Group__0)
		{ after(grammarAccess.getOptionalValueAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleManyOptionalValues
entryRuleManyOptionalValues
:
{ before(grammarAccess.getManyOptionalValuesRule()); }
	 ruleManyOptionalValues
{ after(grammarAccess.getManyOptionalValuesRule()); } 
	 EOF 
;

// Rule ManyOptionalValues
ruleManyOptionalValues 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getManyOptionalValuesAccess().getGroup()); }
		(rule__ManyOptionalValues__Group__0)
		{ after(grammarAccess.getManyOptionalValuesAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleManyMandatoryValues
entryRuleManyMandatoryValues
:
{ before(grammarAccess.getManyMandatoryValuesRule()); }
	 ruleManyMandatoryValues
{ after(grammarAccess.getManyMandatoryValuesRule()); } 
	 EOF 
;

// Rule ManyMandatoryValues
ruleManyMandatoryValues 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		(
			{ before(grammarAccess.getManyMandatoryValuesAccess().getNameAssignment()); }
			(rule__ManyMandatoryValues__NameAssignment)
			{ after(grammarAccess.getManyMandatoryValuesAccess().getNameAssignment()); }
		)
		(
			{ before(grammarAccess.getManyMandatoryValuesAccess().getNameAssignment()); }
			(rule__ManyMandatoryValues__NameAssignment)*
			{ after(grammarAccess.getManyMandatoryValuesAccess().getNameAssignment()); }
		)
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMandatoryChild
entryRuleMandatoryChild
:
{ before(grammarAccess.getMandatoryChildRule()); }
	 ruleMandatoryChild
{ after(grammarAccess.getMandatoryChildRule()); } 
	 EOF 
;

// Rule MandatoryChild
ruleMandatoryChild 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMandatoryChildAccess().getChildAssignment()); }
		(rule__MandatoryChild__ChildAssignment)
		{ after(grammarAccess.getMandatoryChildAccess().getChildAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleOptionalChild
entryRuleOptionalChild
:
{ before(grammarAccess.getOptionalChildRule()); }
	 ruleOptionalChild
{ after(grammarAccess.getOptionalChildRule()); } 
	 EOF 
;

// Rule OptionalChild
ruleOptionalChild 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getOptionalChildAccess().getGroup()); }
		(rule__OptionalChild__Group__0)
		{ after(grammarAccess.getOptionalChildAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMandatoryChildList
entryRuleMandatoryChildList
:
{ before(grammarAccess.getMandatoryChildListRule()); }
	 ruleMandatoryChildList
{ after(grammarAccess.getMandatoryChildListRule()); } 
	 EOF 
;

// Rule MandatoryChildList
ruleMandatoryChildList 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		(
			{ before(grammarAccess.getMandatoryChildListAccess().getChildrenAssignment()); }
			(rule__MandatoryChildList__ChildrenAssignment)
			{ after(grammarAccess.getMandatoryChildListAccess().getChildrenAssignment()); }
		)
		(
			{ before(grammarAccess.getMandatoryChildListAccess().getChildrenAssignment()); }
			(rule__MandatoryChildList__ChildrenAssignment)*
			{ after(grammarAccess.getMandatoryChildListAccess().getChildrenAssignment()); }
		)
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleOptionalChildList
entryRuleOptionalChildList
:
{ before(grammarAccess.getOptionalChildListRule()); }
	 ruleOptionalChildList
{ after(grammarAccess.getOptionalChildListRule()); } 
	 EOF 
;

// Rule OptionalChildList
ruleOptionalChildList 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getOptionalChildListAccess().getGroup()); }
		(rule__OptionalChildList__Group__0)
		{ after(grammarAccess.getOptionalChildListAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleImport
entryRuleImport
:
{ before(grammarAccess.getImportRule()); }
	 ruleImport
{ after(grammarAccess.getImportRule()); } 
	 EOF 
;

// Rule Import
ruleImport 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getImportAccess().getGroup()); }
		(rule__Import__Group__0)
		{ after(grammarAccess.getImportAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleNode
entryRuleNode
:
{ before(grammarAccess.getNodeRule()); }
	 ruleNode
{ after(grammarAccess.getNodeRule()); } 
	 EOF 
;

// Rule Node
ruleNode 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNodeAccess().getGroup()); }
		(rule__Node__Group__0)
		{ after(grammarAccess.getNodeAccess().getGroup()); }
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

// Entry rule entryRuleEClassDecl
entryRuleEClassDecl
:
{ before(grammarAccess.getEClassDeclRule()); }
	 ruleEClassDecl
{ after(grammarAccess.getEClassDeclRule()); } 
	 EOF 
;

// Rule EClassDecl
ruleEClassDecl 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEClassDeclAccess().getNameAssignment()); }
		(rule__EClassDecl__NameAssignment)
		{ after(grammarAccess.getEClassDeclAccess().getNameAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEClassRef
entryRuleEClassRef
:
{ before(grammarAccess.getEClassRefRule()); }
	 ruleEClassRef
{ after(grammarAccess.getEClassRefRule()); } 
	 EOF 
;

// Rule EClassRef
ruleEClassRef 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEClassRefAccess().getRefAssignment()); }
		(rule__EClassRef__RefAssignment)
		{ after(grammarAccess.getEClassRefAccess().getRefAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getGroup_0()); }
		(rule__Model__Group_0__0)
		{ after(grammarAccess.getModelAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getModelAccess().getGroup_1()); }
		(rule__Model__Group_1__0)
		{ after(grammarAccess.getModelAccess().getGroup_1()); }
	)
	|
	(
		{ before(grammarAccess.getModelAccess().getGroup_2()); }
		(rule__Model__Group_2__0)
		{ after(grammarAccess.getModelAccess().getGroup_2()); }
	)
	|
	(
		{ before(grammarAccess.getModelAccess().getGroup_3()); }
		(rule__Model__Group_3__0)
		{ after(grammarAccess.getModelAccess().getGroup_3()); }
	)
	|
	(
		{ before(grammarAccess.getModelAccess().getGroup_4()); }
		(rule__Model__Group_4__0)
		{ after(grammarAccess.getModelAccess().getGroup_4()); }
	)
	|
	(
		{ before(grammarAccess.getModelAccess().getGroup_5()); }
		(rule__Model__Group_5__0)
		{ after(grammarAccess.getModelAccess().getGroup_5()); }
	)
	|
	(
		{ before(grammarAccess.getModelAccess().getGroup_6()); }
		(rule__Model__Group_6__0)
		{ after(grammarAccess.getModelAccess().getGroup_6()); }
	)
	|
	(
		{ before(grammarAccess.getModelAccess().getGroup_7()); }
		(rule__Model__Group_7__0)
		{ after(grammarAccess.getModelAccess().getGroup_7()); }
	)
	|
	(
		{ before(grammarAccess.getModelAccess().getGroup_8()); }
		(rule__Model__Group_8__0)
		{ after(grammarAccess.getModelAccess().getGroup_8()); }
	)
	|
	(
		{ before(grammarAccess.getModelAccess().getGroup_9()); }
		(rule__Model__Group_9__0)
		{ after(grammarAccess.getModelAccess().getGroup_9()); }
	)
	|
	(
		{ before(grammarAccess.getModelAccess().getGroup_10()); }
		(rule__Model__Group_10__0)
		{ after(grammarAccess.getModelAccess().getGroup_10()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Alternatives_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNodeAccess().getGroup_4_0()); }
		(rule__Node__Group_4_0__0)
		{ after(grammarAccess.getNodeAccess().getGroup_4_0()); }
	)
	|
	(
		{ before(grammarAccess.getNodeAccess().getSemicolonKeyword_4_1()); }
		';'
		{ after(grammarAccess.getNodeAccess().getSemicolonKeyword_4_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group_0__0__Impl
	rule__Model__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getNumberSignDigitOneKeyword_0_0()); }
	'#1'
	{ after(grammarAccess.getModelAccess().getNumberSignDigitOneKeyword_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getNodeParserRuleCall_0_1()); }
	ruleNode
	{ after(grammarAccess.getModelAccess().getNodeParserRuleCall_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Model__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group_1__0__Impl
	rule__Model__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getNumberSignDigitTwoKeyword_1_0()); }
	'#2'
	{ after(grammarAccess.getModelAccess().getNumberSignDigitTwoKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getMandatoryValueParserRuleCall_1_1()); }
	ruleMandatoryValue
	{ after(grammarAccess.getModelAccess().getMandatoryValueParserRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Model__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group_2__0__Impl
	rule__Model__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getNumberSignDigitThreeKeyword_2_0()); }
	'#3'
	{ after(grammarAccess.getModelAccess().getNumberSignDigitThreeKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getOptionalValueParserRuleCall_2_1()); }
	ruleOptionalValue
	{ after(grammarAccess.getModelAccess().getOptionalValueParserRuleCall_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Model__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group_3__0__Impl
	rule__Model__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getNumberSignDigitFourKeyword_3_0()); }
	'#4'
	{ after(grammarAccess.getModelAccess().getNumberSignDigitFourKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getMandatoryChildParserRuleCall_3_1()); }
	ruleMandatoryChild
	{ after(grammarAccess.getModelAccess().getMandatoryChildParserRuleCall_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Model__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group_4__0__Impl
	rule__Model__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getNumberSignDigitFiveKeyword_4_0()); }
	'#5'
	{ after(grammarAccess.getModelAccess().getNumberSignDigitFiveKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getOptionalChildParserRuleCall_4_1()); }
	ruleOptionalChild
	{ after(grammarAccess.getModelAccess().getOptionalChildParserRuleCall_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Model__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group_5__0__Impl
	rule__Model__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getNumberSignDigitOneDigitZeroKeyword_5_0()); }
	'#10'
	{ after(grammarAccess.getModelAccess().getNumberSignDigitOneDigitZeroKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getManyOptionalValuesParserRuleCall_5_1()); }
	ruleManyOptionalValues
	{ after(grammarAccess.getModelAccess().getManyOptionalValuesParserRuleCall_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Model__Group_6__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group_6__0__Impl
	rule__Model__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group_6__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getNumberSignDigitOneDigitOneKeyword_6_0()); }
	'#11'
	{ after(grammarAccess.getModelAccess().getNumberSignDigitOneDigitOneKeyword_6_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group_6__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group_6__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group_6__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getManyMandatoryValuesParserRuleCall_6_1()); }
	ruleManyMandatoryValues
	{ after(grammarAccess.getModelAccess().getManyMandatoryValuesParserRuleCall_6_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Model__Group_7__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group_7__0__Impl
	rule__Model__Group_7__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group_7__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getNumberSignDigitOneDigitTwoKeyword_7_0()); }
	'#12'
	{ after(grammarAccess.getModelAccess().getNumberSignDigitOneDigitTwoKeyword_7_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group_7__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group_7__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group_7__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getMandatoryChildListParserRuleCall_7_1()); }
	ruleMandatoryChildList
	{ after(grammarAccess.getModelAccess().getMandatoryChildListParserRuleCall_7_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Model__Group_8__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group_8__0__Impl
	rule__Model__Group_8__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group_8__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getNumberSignDigitOneDigitThreeKeyword_8_0()); }
	'#13'
	{ after(grammarAccess.getModelAccess().getNumberSignDigitOneDigitThreeKeyword_8_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group_8__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group_8__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group_8__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getOptionalChildListParserRuleCall_8_1()); }
	ruleOptionalChildList
	{ after(grammarAccess.getModelAccess().getOptionalChildListParserRuleCall_8_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Model__Group_9__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group_9__0__Impl
	rule__Model__Group_9__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group_9__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getNumberSignDigitTwoDigitZeroKeyword_9_0()); }
	'#20'
	{ after(grammarAccess.getModelAccess().getNumberSignDigitTwoDigitZeroKeyword_9_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group_9__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group_9__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group_9__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getModelAccess().getClazzAssignment_9_1()); }
		(rule__Model__ClazzAssignment_9_1)
		{ after(grammarAccess.getModelAccess().getClazzAssignment_9_1()); }
	)
	(
		{ before(grammarAccess.getModelAccess().getClazzAssignment_9_1()); }
		(rule__Model__ClazzAssignment_9_1)*
		{ after(grammarAccess.getModelAccess().getClazzAssignment_9_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Model__Group_10__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group_10__0__Impl
	rule__Model__Group_10__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group_10__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getNumberSignDigitTwoDigitOneKeyword_10_0()); }
	'#21'
	{ after(grammarAccess.getModelAccess().getNumberSignDigitTwoDigitOneKeyword_10_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group_10__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group_10__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group_10__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getEClassRefParserRuleCall_10_1()); }
	ruleEClassRef
	{ after(grammarAccess.getModelAccess().getEClassRefParserRuleCall_10_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__OptionalValue__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OptionalValue__Group__0__Impl
	rule__OptionalValue__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OptionalValue__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOptionalValueAccess().getOptionalValueAction_0()); }
	()
	{ after(grammarAccess.getOptionalValueAccess().getOptionalValueAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OptionalValue__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OptionalValue__Group__1__Impl
	rule__OptionalValue__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__OptionalValue__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOptionalValueAccess().getKw1Keyword_1()); }
	('kw1')?
	{ after(grammarAccess.getOptionalValueAccess().getKw1Keyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OptionalValue__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OptionalValue__Group__2__Impl
	rule__OptionalValue__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__OptionalValue__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOptionalValueAccess().getNameAssignment_2()); }
	(rule__OptionalValue__NameAssignment_2)?
	{ after(grammarAccess.getOptionalValueAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OptionalValue__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OptionalValue__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OptionalValue__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOptionalValueAccess().getKw2Keyword_3()); }
	('kw2')?
	{ after(grammarAccess.getOptionalValueAccess().getKw2Keyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ManyOptionalValues__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ManyOptionalValues__Group__0__Impl
	rule__ManyOptionalValues__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ManyOptionalValues__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getManyOptionalValuesAccess().getManyValuesAction_0()); }
	()
	{ after(grammarAccess.getManyOptionalValuesAccess().getManyValuesAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ManyOptionalValues__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ManyOptionalValues__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ManyOptionalValues__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getManyOptionalValuesAccess().getNameAssignment_1()); }
	(rule__ManyOptionalValues__NameAssignment_1)*
	{ after(grammarAccess.getManyOptionalValuesAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__OptionalChild__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OptionalChild__Group__0__Impl
	rule__OptionalChild__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OptionalChild__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOptionalChildAccess().getOptionalChildAction_0()); }
	()
	{ after(grammarAccess.getOptionalChildAccess().getOptionalChildAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OptionalChild__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OptionalChild__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OptionalChild__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOptionalChildAccess().getChildAssignment_1()); }
	(rule__OptionalChild__ChildAssignment_1)?
	{ after(grammarAccess.getOptionalChildAccess().getChildAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__OptionalChildList__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OptionalChildList__Group__0__Impl
	rule__OptionalChildList__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OptionalChildList__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOptionalChildListAccess().getOptionalChildListAction_0()); }
	()
	{ after(grammarAccess.getOptionalChildListAccess().getOptionalChildListAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OptionalChildList__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OptionalChildList__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OptionalChildList__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOptionalChildListAccess().getChildrenAssignment_1()); }
	(rule__OptionalChildList__ChildrenAssignment_1)*
	{ after(grammarAccess.getOptionalChildListAccess().getChildrenAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Import__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Import__Group__0__Impl
	rule__Import__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Import__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImportAccess().getImportKeyword_0()); }
	'import'
	{ after(grammarAccess.getImportAccess().getImportKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Import__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Import__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Import__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); }
	(rule__Import__ImportedNamespaceAssignment_1)
	{ after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Node__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Node__Group__0__Impl
	rule__Node__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNodeAccess().getNodeAction_0()); }
	()
	{ after(grammarAccess.getNodeAccess().getNodeAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Node__Group__1__Impl
	rule__Node__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNodeAccess().getImportsAssignment_1()); }
	(rule__Node__ImportsAssignment_1)*
	{ after(grammarAccess.getNodeAccess().getImportsAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Node__Group__2__Impl
	rule__Node__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNodeAccess().getNameAssignment_2()); }
	(rule__Node__NameAssignment_2)?
	{ after(grammarAccess.getNodeAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Node__Group__3__Impl
	rule__Node__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNodeAccess().getGroup_3()); }
	(rule__Node__Group_3__0)?
	{ after(grammarAccess.getNodeAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Node__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNodeAccess().getAlternatives_4()); }
	(rule__Node__Alternatives_4)
	{ after(grammarAccess.getNodeAccess().getAlternatives_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Node__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Node__Group_3__0__Impl
	rule__Node__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNodeAccess().getRefsKeyword_3_0()); }
	'refs'
	{ after(grammarAccess.getNodeAccess().getRefsKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Node__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNodeAccess().getRefsAssignment_3_1()); }
	(rule__Node__RefsAssignment_3_1)*
	{ after(grammarAccess.getNodeAccess().getRefsAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Node__Group_4_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Node__Group_4_0__0__Impl
	rule__Node__Group_4_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group_4_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_4_0_0()); }
	'{'
	{ after(grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_4_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group_4_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Node__Group_4_0__1__Impl
	rule__Node__Group_4_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group_4_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNodeAccess().getChildrenAssignment_4_0_1()); }
	(rule__Node__ChildrenAssignment_4_0_1)*
	{ after(grammarAccess.getNodeAccess().getChildrenAssignment_4_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group_4_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Node__Group_4_0__2__Impl
	rule__Node__Group_4_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group_4_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNodeAccess().getGroup_4_0_2()); }
	(rule__Node__Group_4_0_2__0)?
	{ after(grammarAccess.getNodeAccess().getGroup_4_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group_4_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Node__Group_4_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group_4_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_4_0_3()); }
	'}'
	{ after(grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_4_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Node__Group_4_0_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Node__Group_4_0_2__0__Impl
	rule__Node__Group_4_0_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group_4_0_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNodeAccess().getRefKeyword_4_0_2_0()); }
	'ref'
	{ after(grammarAccess.getNodeAccess().getRefKeyword_4_0_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group_4_0_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Node__Group_4_0_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__Group_4_0_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNodeAccess().getRefAssignment_4_0_2_1()); }
	(rule__Node__RefAssignment_4_0_2_1)
	{ after(grammarAccess.getNodeAccess().getRefAssignment_4_0_2_1()); }
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


rule__Model__ClazzAssignment_9_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getClazzEClassDeclParserRuleCall_9_1_0()); }
		ruleEClassDecl
		{ after(grammarAccess.getModelAccess().getClazzEClassDeclParserRuleCall_9_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MandatoryValue__NameAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMandatoryValueAccess().getNameIDTerminalRuleCall_0()); }
		RULE_ID
		{ after(grammarAccess.getMandatoryValueAccess().getNameIDTerminalRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__OptionalValue__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOptionalValueAccess().getNameIDTerminalRuleCall_2_0()); }
		RULE_ID
		{ after(grammarAccess.getOptionalValueAccess().getNameIDTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ManyOptionalValues__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getManyOptionalValuesAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getManyOptionalValuesAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ManyMandatoryValues__NameAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getManyMandatoryValuesAccess().getNameIDTerminalRuleCall_0()); }
		RULE_ID
		{ after(grammarAccess.getManyMandatoryValuesAccess().getNameIDTerminalRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MandatoryChild__ChildAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMandatoryChildAccess().getChildMandatoryValueParserRuleCall_0()); }
		ruleMandatoryValue
		{ after(grammarAccess.getMandatoryChildAccess().getChildMandatoryValueParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__OptionalChild__ChildAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOptionalChildAccess().getChildMandatoryValueParserRuleCall_1_0()); }
		ruleMandatoryValue
		{ after(grammarAccess.getOptionalChildAccess().getChildMandatoryValueParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MandatoryChildList__ChildrenAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMandatoryChildListAccess().getChildrenMandatoryValueParserRuleCall_0()); }
		ruleMandatoryValue
		{ after(grammarAccess.getMandatoryChildListAccess().getChildrenMandatoryValueParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__OptionalChildList__ChildrenAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOptionalChildListAccess().getChildrenMandatoryValueParserRuleCall_1_0()); }
		ruleMandatoryValue
		{ after(grammarAccess.getOptionalChildListAccess().getChildrenMandatoryValueParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Import__ImportedNamespaceAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameParserRuleCall_1_0()); }
		ruleQualifiedName
		{ after(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__ImportsAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNodeAccess().getImportsImportParserRuleCall_1_0()); }
		ruleImport
		{ after(grammarAccess.getNodeAccess().getImportsImportParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_2_0()); }
		RULE_ID
		{ after(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__RefsAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNodeAccess().getRefsNodeCrossReference_3_1_0()); }
		(
			{ before(grammarAccess.getNodeAccess().getRefsNodeQualifiedNameParserRuleCall_3_1_0_1()); }
			ruleQualifiedName
			{ after(grammarAccess.getNodeAccess().getRefsNodeQualifiedNameParserRuleCall_3_1_0_1()); }
		)
		{ after(grammarAccess.getNodeAccess().getRefsNodeCrossReference_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__ChildrenAssignment_4_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNodeAccess().getChildrenNodeParserRuleCall_4_0_1_0()); }
		ruleNode
		{ after(grammarAccess.getNodeAccess().getChildrenNodeParserRuleCall_4_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Node__RefAssignment_4_0_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNodeAccess().getRefNodeCrossReference_4_0_2_1_0()); }
		(
			{ before(grammarAccess.getNodeAccess().getRefNodeQualifiedNameParserRuleCall_4_0_2_1_0_1()); }
			ruleQualifiedName
			{ after(grammarAccess.getNodeAccess().getRefNodeQualifiedNameParserRuleCall_4_0_2_1_0_1()); }
		)
		{ after(grammarAccess.getNodeAccess().getRefNodeCrossReference_4_0_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EClassDecl__NameAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEClassDeclAccess().getNameIDTerminalRuleCall_0()); }
		RULE_ID
		{ after(grammarAccess.getEClassDeclAccess().getNameIDTerminalRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EClassRef__RefAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEClassRefAccess().getRefEClassCrossReference_0()); }
		(
			{ before(grammarAccess.getEClassRefAccess().getRefEClassQualifiedNameParserRuleCall_0_1()); }
			ruleQualifiedName
			{ after(grammarAccess.getEClassRefAccess().getRefEClassQualifiedNameParserRuleCall_0_1()); }
		)
		{ after(grammarAccess.getEClassRefAccess().getRefEClassCrossReference_0()); }
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
