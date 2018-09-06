/**
 * Copyright (c) 2016, 2017 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.Annotation;
import org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.Assignment;
import org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.AssignmentStatement;
import org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.Core861_contentAssistLookAheadTestLanguageFactory;
import org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.Core861_contentAssistLookAheadTestLanguagePackage;
import org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.FeatureCall;
import org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.FieldDecl;
import org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.IntType;
import org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.Member;
import org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.MemberCall;
import org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.MethodDecl;
import org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.Return;
import org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.Statement;
import org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.Type;
import org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.TypeRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Core861_contentAssistLookAheadTestLanguagePackageImpl extends EPackageImpl implements Core861_contentAssistLookAheadTestLanguagePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass memberEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fieldDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass methodDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass assignmentStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass featureCallEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass annotationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass intTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeRefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass returnEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass assignmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass memberCallEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.Core861_contentAssistLookAheadTestLanguagePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private Core861_contentAssistLookAheadTestLanguagePackageImpl()
  {
    super(eNS_URI, Core861_contentAssistLookAheadTestLanguageFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link Core861_contentAssistLookAheadTestLanguagePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static Core861_contentAssistLookAheadTestLanguagePackage init()
  {
    if (isInited) return (Core861_contentAssistLookAheadTestLanguagePackage)EPackage.Registry.INSTANCE.getEPackage(Core861_contentAssistLookAheadTestLanguagePackage.eNS_URI);

    // Obtain or create and register package
    Core861_contentAssistLookAheadTestLanguagePackageImpl theCore861_contentAssistLookAheadTestLanguagePackage = (Core861_contentAssistLookAheadTestLanguagePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Core861_contentAssistLookAheadTestLanguagePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Core861_contentAssistLookAheadTestLanguagePackageImpl());

    isInited = true;

    // Initialize simple dependencies
    EcorePackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theCore861_contentAssistLookAheadTestLanguagePackage.createPackageContents();

    // Initialize created meta-data
    theCore861_contentAssistLookAheadTestLanguagePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theCore861_contentAssistLookAheadTestLanguagePackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(Core861_contentAssistLookAheadTestLanguagePackage.eNS_URI, theCore861_contentAssistLookAheadTestLanguagePackage);
    return theCore861_contentAssistLookAheadTestLanguagePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMember()
  {
    return memberEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMember_Annotations()
  {
    return (EReference)memberEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMember_Modifier()
  {
    return (EAttribute)memberEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMember_Type()
  {
    return (EReference)memberEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMember_Name()
  {
    return (EAttribute)memberEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFieldDecl()
  {
    return fieldDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldDecl_InitVal()
  {
    return (EAttribute)fieldDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMethodDecl()
  {
    return methodDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethodDecl_Decls()
  {
    return (EReference)methodDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethodDecl_Statements()
  {
    return (EReference)methodDeclEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getType()
  {
    return typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStatement()
  {
    return statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAssignmentStatement()
  {
    return assignmentStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFeatureCall()
  {
    return featureCallEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFeatureCall_Feature()
  {
    return (EReference)featureCallEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnnotation()
  {
    return annotationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAnnotation_Key()
  {
    return (EAttribute)annotationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAnnotation_Values()
  {
    return (EAttribute)annotationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntType()
  {
    return intTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeRef()
  {
    return typeRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeRef_Type()
  {
    return (EReference)typeRefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReturn()
  {
    return returnEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAssignment()
  {
    return assignmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssignment_Feature()
  {
    return (EReference)assignmentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAssignment_Rhs()
  {
    return (EAttribute)assignmentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMemberCall()
  {
    return memberCallEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMemberCall_Owner()
  {
    return (EReference)memberCallEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMemberCall_Member()
  {
    return (EReference)memberCallEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Core861_contentAssistLookAheadTestLanguageFactory getCore861_contentAssistLookAheadTestLanguageFactory()
  {
    return (Core861_contentAssistLookAheadTestLanguageFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    memberEClass = createEClass(MEMBER);
    createEReference(memberEClass, MEMBER__ANNOTATIONS);
    createEAttribute(memberEClass, MEMBER__MODIFIER);
    createEReference(memberEClass, MEMBER__TYPE);
    createEAttribute(memberEClass, MEMBER__NAME);

    fieldDeclEClass = createEClass(FIELD_DECL);
    createEAttribute(fieldDeclEClass, FIELD_DECL__INIT_VAL);

    methodDeclEClass = createEClass(METHOD_DECL);
    createEReference(methodDeclEClass, METHOD_DECL__DECLS);
    createEReference(methodDeclEClass, METHOD_DECL__STATEMENTS);

    typeEClass = createEClass(TYPE);

    statementEClass = createEClass(STATEMENT);

    assignmentStatementEClass = createEClass(ASSIGNMENT_STATEMENT);

    featureCallEClass = createEClass(FEATURE_CALL);
    createEReference(featureCallEClass, FEATURE_CALL__FEATURE);

    annotationEClass = createEClass(ANNOTATION);
    createEAttribute(annotationEClass, ANNOTATION__KEY);
    createEAttribute(annotationEClass, ANNOTATION__VALUES);

    intTypeEClass = createEClass(INT_TYPE);

    typeRefEClass = createEClass(TYPE_REF);
    createEReference(typeRefEClass, TYPE_REF__TYPE);

    returnEClass = createEClass(RETURN);

    assignmentEClass = createEClass(ASSIGNMENT);
    createEReference(assignmentEClass, ASSIGNMENT__FEATURE);
    createEAttribute(assignmentEClass, ASSIGNMENT__RHS);

    memberCallEClass = createEClass(MEMBER_CALL);
    createEReference(memberCallEClass, MEMBER_CALL__OWNER);
    createEReference(memberCallEClass, MEMBER_CALL__MEMBER);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    fieldDeclEClass.getESuperTypes().add(this.getMember());
    methodDeclEClass.getESuperTypes().add(this.getMember());
    assignmentStatementEClass.getESuperTypes().add(this.getStatement());
    featureCallEClass.getESuperTypes().add(this.getAssignmentStatement());
    intTypeEClass.getESuperTypes().add(this.getType());
    typeRefEClass.getESuperTypes().add(this.getType());
    returnEClass.getESuperTypes().add(this.getStatement());
    assignmentEClass.getESuperTypes().add(this.getAssignmentStatement());
    memberCallEClass.getESuperTypes().add(this.getFeatureCall());

    // Initialize classes and features; add operations and parameters
    initEClass(memberEClass, Member.class, "Member", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMember_Annotations(), this.getAnnotation(), null, "annotations", null, 0, -1, Member.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMember_Modifier(), theEcorePackage.getEString(), "modifier", null, 0, 1, Member.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMember_Type(), this.getType(), null, "type", null, 0, 1, Member.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMember_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Member.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fieldDeclEClass, FieldDecl.class, "FieldDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFieldDecl_InitVal(), theEcorePackage.getEInt(), "initVal", null, 0, 1, FieldDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(methodDeclEClass, MethodDecl.class, "MethodDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMethodDecl_Decls(), this.getFieldDecl(), null, "decls", null, 0, -1, MethodDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMethodDecl_Statements(), this.getStatement(), null, "statements", null, 0, -1, MethodDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(statementEClass, Statement.class, "Statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(assignmentStatementEClass, AssignmentStatement.class, "AssignmentStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(featureCallEClass, FeatureCall.class, "FeatureCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFeatureCall_Feature(), this.getMember(), null, "feature", null, 0, 1, FeatureCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(annotationEClass, Annotation.class, "Annotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAnnotation_Key(), theEcorePackage.getEString(), "key", null, 0, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAnnotation_Values(), theEcorePackage.getEString(), "values", null, 0, -1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(intTypeEClass, IntType.class, "IntType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(typeRefEClass, TypeRef.class, "TypeRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTypeRef_Type(), this.getType(), null, "type", null, 0, 1, TypeRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(returnEClass, Return.class, "Return", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(assignmentEClass, Assignment.class, "Assignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAssignment_Feature(), this.getFeatureCall(), null, "feature", null, 0, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAssignment_Rhs(), theEcorePackage.getEInt(), "rhs", null, 0, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(memberCallEClass, MemberCall.class, "MemberCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMemberCall_Owner(), this.getFeatureCall(), null, "owner", null, 0, 1, MemberCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMemberCall_Member(), this.getMember(), null, "member", null, 0, 1, MemberCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //Core861_contentAssistLookAheadTestLanguagePackageImpl
