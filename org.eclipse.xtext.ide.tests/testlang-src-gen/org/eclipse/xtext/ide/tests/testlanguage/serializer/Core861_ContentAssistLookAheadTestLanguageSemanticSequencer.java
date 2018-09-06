/*
 * Copyright (c) 2016, 2017 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.ide.tests.testlanguage.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.Annotation;
import org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.Assignment;
import org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.Core861_contentAssistLookAheadTestLanguagePackage;
import org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.FeatureCall;
import org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.FieldDecl;
import org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.IntType;
import org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.MemberCall;
import org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.MethodDecl;
import org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.Return;
import org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.TypeRef;
import org.eclipse.xtext.ide.tests.testlanguage.services.Core861_ContentAssistLookAheadTestLanguageGrammarAccess;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class Core861_ContentAssistLookAheadTestLanguageSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private Core861_ContentAssistLookAheadTestLanguageGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == Core861_contentAssistLookAheadTestLanguagePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case Core861_contentAssistLookAheadTestLanguagePackage.ANNOTATION:
				sequence_Annotation(context, (Annotation) semanticObject); 
				return; 
			case Core861_contentAssistLookAheadTestLanguagePackage.ASSIGNMENT:
				sequence_AssignmentStatement(context, (Assignment) semanticObject); 
				return; 
			case Core861_contentAssistLookAheadTestLanguagePackage.FEATURE_CALL:
				sequence_FeatureCall(context, (FeatureCall) semanticObject); 
				return; 
			case Core861_contentAssistLookAheadTestLanguagePackage.FIELD_DECL:
				sequence_FieldDecl(context, (FieldDecl) semanticObject); 
				return; 
			case Core861_contentAssistLookAheadTestLanguagePackage.INT_TYPE:
				sequence_Type(context, (IntType) semanticObject); 
				return; 
			case Core861_contentAssistLookAheadTestLanguagePackage.MEMBER_CALL:
				sequence_FeatureCall(context, (MemberCall) semanticObject); 
				return; 
			case Core861_contentAssistLookAheadTestLanguagePackage.METHOD_DECL:
				sequence_MethodDecl(context, (MethodDecl) semanticObject); 
				return; 
			case Core861_contentAssistLookAheadTestLanguagePackage.RETURN:
				sequence_Statement(context, (Return) semanticObject); 
				return; 
			case Core861_contentAssistLookAheadTestLanguagePackage.TYPE_REF:
				sequence_Type(context, (TypeRef) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Annotation returns Annotation
	 *
	 * Constraint:
	 *     (key=ID (values+=STRING values+=STRING*)?)
	 */
	protected void sequence_Annotation(ISerializationContext context, Annotation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns Assignment
	 *     AssignmentStatement returns Assignment
	 *
	 * Constraint:
	 *     (feature=AssignmentStatement_Assignment_1_0 rhs=INT)
	 */
	protected void sequence_AssignmentStatement(ISerializationContext context, Assignment semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Core861_contentAssistLookAheadTestLanguagePackage.Literals.ASSIGNMENT__FEATURE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Core861_contentAssistLookAheadTestLanguagePackage.Literals.ASSIGNMENT__FEATURE));
			if (transientValues.isValueTransient(semanticObject, Core861_contentAssistLookAheadTestLanguagePackage.Literals.ASSIGNMENT__RHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Core861_contentAssistLookAheadTestLanguagePackage.Literals.ASSIGNMENT__RHS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAssignmentStatementAccess().getAssignmentFeatureAction_1_0(), semanticObject.getFeature());
		feeder.accept(grammarAccess.getAssignmentStatementAccess().getRhsINTTerminalRuleCall_1_2_0(), semanticObject.getRhs());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns FeatureCall
	 *     AssignmentStatement returns FeatureCall
	 *     AssignmentStatement.Assignment_1_0 returns FeatureCall
	 *     FeatureCall returns FeatureCall
	 *     FeatureCall.MemberCall_1_0 returns FeatureCall
	 *
	 * Constraint:
	 *     feature=[Member|ID]
	 */
	protected void sequence_FeatureCall(ISerializationContext context, FeatureCall semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Core861_contentAssistLookAheadTestLanguagePackage.Literals.FEATURE_CALL__FEATURE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Core861_contentAssistLookAheadTestLanguagePackage.Literals.FEATURE_CALL__FEATURE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFeatureCallAccess().getFeatureMemberIDTerminalRuleCall_0_0_1(), semanticObject.eGet(Core861_contentAssistLookAheadTestLanguagePackage.Literals.FEATURE_CALL__FEATURE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns MemberCall
	 *     AssignmentStatement returns MemberCall
	 *     AssignmentStatement.Assignment_1_0 returns MemberCall
	 *     FeatureCall returns MemberCall
	 *     FeatureCall.MemberCall_1_0 returns MemberCall
	 *
	 * Constraint:
	 *     (owner=FeatureCall_MemberCall_1_0 member=[Member|ID])
	 */
	protected void sequence_FeatureCall(ISerializationContext context, MemberCall semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Core861_contentAssistLookAheadTestLanguagePackage.Literals.MEMBER_CALL__OWNER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Core861_contentAssistLookAheadTestLanguagePackage.Literals.MEMBER_CALL__OWNER));
			if (transientValues.isValueTransient(semanticObject, Core861_contentAssistLookAheadTestLanguagePackage.Literals.MEMBER_CALL__MEMBER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Core861_contentAssistLookAheadTestLanguagePackage.Literals.MEMBER_CALL__MEMBER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFeatureCallAccess().getMemberCallOwnerAction_1_0(), semanticObject.getOwner());
		feeder.accept(grammarAccess.getFeatureCallAccess().getMemberMemberIDTerminalRuleCall_1_2_0_1(), semanticObject.eGet(Core861_contentAssistLookAheadTestLanguagePackage.Literals.MEMBER_CALL__MEMBER, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Member returns FieldDecl
	 *     FieldDecl returns FieldDecl
	 *
	 * Constraint:
	 *     (annotations+=Annotation* (modifier='private' | modifier='public')? type=Type name=ID initVal=INT?)
	 */
	protected void sequence_FieldDecl(ISerializationContext context, FieldDecl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Member returns MethodDecl
	 *     MethodDecl returns MethodDecl
	 *
	 * Constraint:
	 *     (
	 *         annotations+=Annotation* 
	 *         (modifier='private' | modifier='public')? 
	 *         type=Type 
	 *         name=ID 
	 *         decls+=FieldDecl* 
	 *         statements+=Statement*
	 *     )
	 */
	protected void sequence_MethodDecl(ISerializationContext context, MethodDecl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns Return
	 *
	 * Constraint:
	 *     {Return}
	 */
	protected void sequence_Statement(ISerializationContext context, Return semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Type returns IntType
	 *
	 * Constraint:
	 *     {IntType}
	 */
	protected void sequence_Type(ISerializationContext context, IntType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Type returns TypeRef
	 *
	 * Constraint:
	 *     type=[Type|QualifiedName]
	 */
	protected void sequence_Type(ISerializationContext context, TypeRef semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Core861_contentAssistLookAheadTestLanguagePackage.Literals.TYPE_REF__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Core861_contentAssistLookAheadTestLanguagePackage.Literals.TYPE_REF__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTypeAccess().getTypeTypeQualifiedNameParserRuleCall_1_1_0_1(), semanticObject.eGet(Core861_contentAssistLookAheadTestLanguagePackage.Literals.TYPE_REF__TYPE, false));
		feeder.finish();
	}
	
	
}
