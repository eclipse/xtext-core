/*
 * Copyright (c) 2016, 2017 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
grammar InternalCore861_ContentAssistLookAheadTestLanguage;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.eclipse.xtext.ide.tests.testlanguage.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.eclipse.xtext.ide.tests.testlanguage.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.ide.tests.testlanguage.services.Core861_ContentAssistLookAheadTestLanguageGrammarAccess;

}

@parser::members {

 	private Core861_ContentAssistLookAheadTestLanguageGrammarAccess grammarAccess;

    public InternalCore861_ContentAssistLookAheadTestLanguageParser(TokenStream input, Core861_ContentAssistLookAheadTestLanguageGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Member";
   	}

   	@Override
   	protected Core861_ContentAssistLookAheadTestLanguageGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleMember
entryRuleMember returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMemberRule()); }
	iv_ruleMember=ruleMember
	{ $current=$iv_ruleMember.current; }
	EOF;

// Rule Member
ruleMember returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getMemberAccess().getFieldDeclParserRuleCall_0());
		}
		this_FieldDecl_0=ruleFieldDecl
		{
			$current = $this_FieldDecl_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getMemberAccess().getMethodDeclParserRuleCall_1());
		}
		this_MethodDecl_1=ruleMethodDecl
		{
			$current = $this_MethodDecl_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleFieldDecl
entryRuleFieldDecl returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFieldDeclRule()); }
	iv_ruleFieldDecl=ruleFieldDecl
	{ $current=$iv_ruleFieldDecl.current; }
	EOF;

// Rule FieldDecl
ruleFieldDecl returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getFieldDeclAccess().getAnnotationsAnnotationParserRuleCall_0_0());
				}
				lv_annotations_0_0=ruleAnnotation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFieldDeclRule());
					}
					add(
						$current,
						"annotations",
						lv_annotations_0_0,
						"org.eclipse.xtext.ide.tests.testlanguage.Core861_ContentAssistLookAheadTestLanguage.Annotation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				(
					lv_modifier_1_1='private'
					{
						newLeafNode(lv_modifier_1_1, grammarAccess.getFieldDeclAccess().getModifierPrivateKeyword_1_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getFieldDeclRule());
						}
						setWithLastConsumed($current, "modifier", lv_modifier_1_1, null);
					}
					    |
					lv_modifier_1_2='public'
					{
						newLeafNode(lv_modifier_1_2, grammarAccess.getFieldDeclAccess().getModifierPublicKeyword_1_0_1());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getFieldDeclRule());
						}
						setWithLastConsumed($current, "modifier", lv_modifier_1_2, null);
					}
				)
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getFieldDeclAccess().getTypeTypeParserRuleCall_2_0());
				}
				lv_type_2_0=ruleType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFieldDeclRule());
					}
					set(
						$current,
						"type",
						lv_type_2_0,
						"org.eclipse.xtext.ide.tests.testlanguage.Core861_ContentAssistLookAheadTestLanguage.Type");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_name_3_0=RULE_ID
				{
					newLeafNode(lv_name_3_0, grammarAccess.getFieldDeclAccess().getNameIDTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFieldDeclRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_3_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_4='='
			{
				newLeafNode(otherlv_4, grammarAccess.getFieldDeclAccess().getEqualsSignKeyword_4_0());
			}
			(
				(
					lv_initVal_5_0=RULE_INT
					{
						newLeafNode(lv_initVal_5_0, grammarAccess.getFieldDeclAccess().getInitValINTTerminalRuleCall_4_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getFieldDeclRule());
						}
						setWithLastConsumed(
							$current,
							"initVal",
							lv_initVal_5_0,
							"org.eclipse.xtext.common.Terminals.INT");
					}
				)
			)
		)?
		otherlv_6=';'
		{
			newLeafNode(otherlv_6, grammarAccess.getFieldDeclAccess().getSemicolonKeyword_5());
		}
	)
;

// Entry rule entryRuleMethodDecl
entryRuleMethodDecl returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMethodDeclRule()); }
	iv_ruleMethodDecl=ruleMethodDecl
	{ $current=$iv_ruleMethodDecl.current; }
	EOF;

// Rule MethodDecl
ruleMethodDecl returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getMethodDeclAccess().getAnnotationsAnnotationParserRuleCall_0_0());
				}
				lv_annotations_0_0=ruleAnnotation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMethodDeclRule());
					}
					add(
						$current,
						"annotations",
						lv_annotations_0_0,
						"org.eclipse.xtext.ide.tests.testlanguage.Core861_ContentAssistLookAheadTestLanguage.Annotation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				(
					lv_modifier_1_1='private'
					{
						newLeafNode(lv_modifier_1_1, grammarAccess.getMethodDeclAccess().getModifierPrivateKeyword_1_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getMethodDeclRule());
						}
						setWithLastConsumed($current, "modifier", lv_modifier_1_1, null);
					}
					    |
					lv_modifier_1_2='public'
					{
						newLeafNode(lv_modifier_1_2, grammarAccess.getMethodDeclAccess().getModifierPublicKeyword_1_0_1());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getMethodDeclRule());
						}
						setWithLastConsumed($current, "modifier", lv_modifier_1_2, null);
					}
				)
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getMethodDeclAccess().getTypeTypeParserRuleCall_2_0());
				}
				lv_type_2_0=ruleType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMethodDeclRule());
					}
					set(
						$current,
						"type",
						lv_type_2_0,
						"org.eclipse.xtext.ide.tests.testlanguage.Core861_ContentAssistLookAheadTestLanguage.Type");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_name_3_0=RULE_ID
				{
					newLeafNode(lv_name_3_0, grammarAccess.getMethodDeclAccess().getNameIDTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMethodDeclRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_3_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_4='('
		{
			newLeafNode(otherlv_4, grammarAccess.getMethodDeclAccess().getLeftParenthesisKeyword_4());
		}
		otherlv_5=')'
		{
			newLeafNode(otherlv_5, grammarAccess.getMethodDeclAccess().getRightParenthesisKeyword_5());
		}
		otherlv_6='{'
		{
			newLeafNode(otherlv_6, grammarAccess.getMethodDeclAccess().getLeftCurlyBracketKeyword_6());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMethodDeclAccess().getDeclsFieldDeclParserRuleCall_7_0());
				}
				lv_decls_7_0=ruleFieldDecl
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMethodDeclRule());
					}
					add(
						$current,
						"decls",
						lv_decls_7_0,
						"org.eclipse.xtext.ide.tests.testlanguage.Core861_ContentAssistLookAheadTestLanguage.FieldDecl");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getMethodDeclAccess().getStatementsStatementParserRuleCall_8_0());
				}
				lv_statements_8_0=ruleStatement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMethodDeclRule());
					}
					add(
						$current,
						"statements",
						lv_statements_8_0,
						"org.eclipse.xtext.ide.tests.testlanguage.Core861_ContentAssistLookAheadTestLanguage.Statement");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_9='}'
		{
			newLeafNode(otherlv_9, grammarAccess.getMethodDeclAccess().getRightCurlyBracketKeyword_9());
		}
	)
;

// Entry rule entryRuleType
entryRuleType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTypeRule()); }
	iv_ruleType=ruleType
	{ $current=$iv_ruleType.current; }
	EOF;

// Rule Type
ruleType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getTypeAccess().getIntTypeAction_0_0(),
						$current);
				}
			)
			otherlv_1='int'
			{
				newLeafNode(otherlv_1, grammarAccess.getTypeAccess().getIntKeyword_0_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getTypeAccess().getTypeRefAction_1_0(),
						$current);
				}
			)
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTypeRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getTypeAccess().getTypeTypeCrossReference_1_1_0());
					}
					ruleQualifiedName
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
	)
;

// Entry rule entryRuleQualifiedName
entryRuleQualifiedName returns [String current=null]:
	{ newCompositeNode(grammarAccess.getQualifiedNameRule()); }
	iv_ruleQualifiedName=ruleQualifiedName
	{ $current=$iv_ruleQualifiedName.current.getText(); }
	EOF;

// Rule QualifiedName
ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ID_0=RULE_ID
		{
			$current.merge(this_ID_0);
		}
		{
			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
		}
		(
			kw='.'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
			}
			this_ID_2=RULE_ID
			{
				$current.merge(this_ID_2);
			}
			{
				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
			}
		)*
	)
;

// Entry rule entryRuleStatement
entryRuleStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStatementRule()); }
	iv_ruleStatement=ruleStatement
	{ $current=$iv_ruleStatement.current; }
	EOF;

// Rule Statement
ruleStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getStatementAccess().getAssignmentStatementParserRuleCall_0());
		}
		this_AssignmentStatement_0=ruleAssignmentStatement
		{
			$current = $this_AssignmentStatement_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getStatementAccess().getReturnAction_1_0(),
						$current);
				}
			)
			otherlv_2='return'
			{
				newLeafNode(otherlv_2, grammarAccess.getStatementAccess().getReturnKeyword_1_1());
			}
			otherlv_3=';'
			{
				newLeafNode(otherlv_3, grammarAccess.getStatementAccess().getSemicolonKeyword_1_2());
			}
		)
	)
;

// Entry rule entryRuleAssignmentStatement
entryRuleAssignmentStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAssignmentStatementRule()); }
	iv_ruleAssignmentStatement=ruleAssignmentStatement
	{ $current=$iv_ruleAssignmentStatement.current; }
	EOF;

// Rule AssignmentStatement
ruleAssignmentStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAssignmentStatementAccess().getFeatureCallParserRuleCall_0());
		}
		this_FeatureCall_0=ruleFeatureCall
		{
			$current = $this_FeatureCall_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getAssignmentStatementAccess().getAssignmentFeatureAction_1_0(),
						$current);
				}
			)
			otherlv_2='='
			{
				newLeafNode(otherlv_2, grammarAccess.getAssignmentStatementAccess().getEqualsSignKeyword_1_1());
			}
			(
				(
					lv_rhs_3_0=RULE_INT
					{
						newLeafNode(lv_rhs_3_0, grammarAccess.getAssignmentStatementAccess().getRhsINTTerminalRuleCall_1_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getAssignmentStatementRule());
						}
						setWithLastConsumed(
							$current,
							"rhs",
							lv_rhs_3_0,
							"org.eclipse.xtext.common.Terminals.INT");
					}
				)
			)
		)?
		otherlv_4=';'
		{
			newLeafNode(otherlv_4, grammarAccess.getAssignmentStatementAccess().getSemicolonKeyword_2());
		}
	)
;

// Entry rule entryRuleFeatureCall
entryRuleFeatureCall returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFeatureCallRule()); }
	iv_ruleFeatureCall=ruleFeatureCall
	{ $current=$iv_ruleFeatureCall.current; }
	EOF;

// Rule FeatureCall
ruleFeatureCall returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFeatureCallRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getFeatureCallAccess().getFeatureMemberCrossReference_0_0());
				}
			)
		)
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getFeatureCallAccess().getMemberCallOwnerAction_1_0(),
						$current);
				}
			)
			(
				('.')=>
				otherlv_2='.'
				{
					newLeafNode(otherlv_2, grammarAccess.getFeatureCallAccess().getFullStopKeyword_1_1());
				}
			)
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getFeatureCallRule());
						}
					}
					otherlv_3=RULE_ID
					{
						newLeafNode(otherlv_3, grammarAccess.getFeatureCallAccess().getMemberMemberCrossReference_1_2_0());
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleAnnotation
entryRuleAnnotation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAnnotationRule()); }
	iv_ruleAnnotation=ruleAnnotation
	{ $current=$iv_ruleAnnotation.current; }
	EOF;

// Rule Annotation
ruleAnnotation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='@'
		{
			newLeafNode(otherlv_0, grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0());
		}
		(
			(
				lv_key_1_0=RULE_ID
				{
					newLeafNode(lv_key_1_0, grammarAccess.getAnnotationAccess().getKeyIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAnnotationRule());
					}
					setWithLastConsumed(
						$current,
						"key",
						lv_key_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_2='('
			{
				newLeafNode(otherlv_2, grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_2_0());
			}
			(
				(
					lv_values_3_0=RULE_STRING
					{
						newLeafNode(lv_values_3_0, grammarAccess.getAnnotationAccess().getValuesSTRINGTerminalRuleCall_2_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getAnnotationRule());
						}
						addWithLastConsumed(
							$current,
							"values",
							lv_values_3_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
			(
				otherlv_4=','
				{
					newLeafNode(otherlv_4, grammarAccess.getAnnotationAccess().getCommaKeyword_2_2_0());
				}
				(
					(
						lv_values_5_0=RULE_STRING
						{
							newLeafNode(lv_values_5_0, grammarAccess.getAnnotationAccess().getValuesSTRINGTerminalRuleCall_2_2_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getAnnotationRule());
							}
							addWithLastConsumed(
								$current,
								"values",
								lv_values_5_0,
								"org.eclipse.xtext.common.Terminals.STRING");
						}
					)
				)
			)*
			otherlv_6=')'
			{
				newLeafNode(otherlv_6, grammarAccess.getAnnotationAccess().getRightParenthesisKeyword_2_3());
			}
		)?
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
