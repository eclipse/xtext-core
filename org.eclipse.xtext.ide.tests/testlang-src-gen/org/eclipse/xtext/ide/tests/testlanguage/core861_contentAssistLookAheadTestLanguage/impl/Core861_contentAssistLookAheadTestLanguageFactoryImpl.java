/**
 * Copyright (c) 2016, 2017 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Core861_contentAssistLookAheadTestLanguageFactoryImpl extends EFactoryImpl implements Core861_contentAssistLookAheadTestLanguageFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Core861_contentAssistLookAheadTestLanguageFactory init()
  {
    try
    {
      Core861_contentAssistLookAheadTestLanguageFactory theCore861_contentAssistLookAheadTestLanguageFactory = (Core861_contentAssistLookAheadTestLanguageFactory)EPackage.Registry.INSTANCE.getEFactory(Core861_contentAssistLookAheadTestLanguagePackage.eNS_URI);
      if (theCore861_contentAssistLookAheadTestLanguageFactory != null)
      {
        return theCore861_contentAssistLookAheadTestLanguageFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new Core861_contentAssistLookAheadTestLanguageFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Core861_contentAssistLookAheadTestLanguageFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case Core861_contentAssistLookAheadTestLanguagePackage.MEMBER: return createMember();
      case Core861_contentAssistLookAheadTestLanguagePackage.FIELD_DECL: return createFieldDecl();
      case Core861_contentAssistLookAheadTestLanguagePackage.METHOD_DECL: return createMethodDecl();
      case Core861_contentAssistLookAheadTestLanguagePackage.TYPE: return createType();
      case Core861_contentAssistLookAheadTestLanguagePackage.STATEMENT: return createStatement();
      case Core861_contentAssistLookAheadTestLanguagePackage.ASSIGNMENT_STATEMENT: return createAssignmentStatement();
      case Core861_contentAssistLookAheadTestLanguagePackage.FEATURE_CALL: return createFeatureCall();
      case Core861_contentAssistLookAheadTestLanguagePackage.ANNOTATION: return createAnnotation();
      case Core861_contentAssistLookAheadTestLanguagePackage.INT_TYPE: return createIntType();
      case Core861_contentAssistLookAheadTestLanguagePackage.TYPE_REF: return createTypeRef();
      case Core861_contentAssistLookAheadTestLanguagePackage.RETURN: return createReturn();
      case Core861_contentAssistLookAheadTestLanguagePackage.ASSIGNMENT: return createAssignment();
      case Core861_contentAssistLookAheadTestLanguagePackage.MEMBER_CALL: return createMemberCall();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Member createMember()
  {
    MemberImpl member = new MemberImpl();
    return member;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FieldDecl createFieldDecl()
  {
    FieldDeclImpl fieldDecl = new FieldDeclImpl();
    return fieldDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodDecl createMethodDecl()
  {
    MethodDeclImpl methodDecl = new MethodDeclImpl();
    return methodDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssignmentStatement createAssignmentStatement()
  {
    AssignmentStatementImpl assignmentStatement = new AssignmentStatementImpl();
    return assignmentStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureCall createFeatureCall()
  {
    FeatureCallImpl featureCall = new FeatureCallImpl();
    return featureCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Annotation createAnnotation()
  {
    AnnotationImpl annotation = new AnnotationImpl();
    return annotation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntType createIntType()
  {
    IntTypeImpl intType = new IntTypeImpl();
    return intType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeRef createTypeRef()
  {
    TypeRefImpl typeRef = new TypeRefImpl();
    return typeRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Return createReturn()
  {
    ReturnImpl return_ = new ReturnImpl();
    return return_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assignment createAssignment()
  {
    AssignmentImpl assignment = new AssignmentImpl();
    return assignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MemberCall createMemberCall()
  {
    MemberCallImpl memberCall = new MemberCallImpl();
    return memberCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Core861_contentAssistLookAheadTestLanguagePackage getCore861_contentAssistLookAheadTestLanguagePackage()
  {
    return (Core861_contentAssistLookAheadTestLanguagePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static Core861_contentAssistLookAheadTestLanguagePackage getPackage()
  {
    return Core861_contentAssistLookAheadTestLanguagePackage.eINSTANCE;
  }

} //Core861_contentAssistLookAheadTestLanguageFactoryImpl
