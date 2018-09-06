/**
 * Copyright (c) 2016, 2017 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.Core861_contentAssistLookAheadTestLanguageFactory
 * @model kind="package"
 * @generated
 */
public interface Core861_contentAssistLookAheadTestLanguagePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "core861_contentAssistLookAheadTestLanguage";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.eclipse.org/xtext/ide/tests/testlanguage/Core861_ContentAssistLookAheadTestLanguage";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "core861_contentAssistLookAheadTestLanguage";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  Core861_contentAssistLookAheadTestLanguagePackage eINSTANCE = org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl.Core861_contentAssistLookAheadTestLanguagePackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl.MemberImpl <em>Member</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl.MemberImpl
   * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl.Core861_contentAssistLookAheadTestLanguagePackageImpl#getMember()
   * @generated
   */
  int MEMBER = 0;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER__ANNOTATIONS = 0;

  /**
   * The feature id for the '<em><b>Modifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER__MODIFIER = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER__TYPE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER__NAME = 3;

  /**
   * The number of structural features of the '<em>Member</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl.FieldDeclImpl <em>Field Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl.FieldDeclImpl
   * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl.Core861_contentAssistLookAheadTestLanguagePackageImpl#getFieldDecl()
   * @generated
   */
  int FIELD_DECL = 1;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_DECL__ANNOTATIONS = MEMBER__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Modifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_DECL__MODIFIER = MEMBER__MODIFIER;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_DECL__TYPE = MEMBER__TYPE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_DECL__NAME = MEMBER__NAME;

  /**
   * The feature id for the '<em><b>Init Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_DECL__INIT_VAL = MEMBER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Field Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_DECL_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl.MethodDeclImpl <em>Method Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl.MethodDeclImpl
   * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl.Core861_contentAssistLookAheadTestLanguagePackageImpl#getMethodDecl()
   * @generated
   */
  int METHOD_DECL = 2;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DECL__ANNOTATIONS = MEMBER__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Modifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DECL__MODIFIER = MEMBER__MODIFIER;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DECL__TYPE = MEMBER__TYPE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DECL__NAME = MEMBER__NAME;

  /**
   * The feature id for the '<em><b>Decls</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DECL__DECLS = MEMBER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DECL__STATEMENTS = MEMBER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Method Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DECL_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl.TypeImpl
   * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl.Core861_contentAssistLookAheadTestLanguagePackageImpl#getType()
   * @generated
   */
  int TYPE = 3;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl.StatementImpl <em>Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl.StatementImpl
   * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl.Core861_contentAssistLookAheadTestLanguagePackageImpl#getStatement()
   * @generated
   */
  int STATEMENT = 4;

  /**
   * The number of structural features of the '<em>Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl.AssignmentStatementImpl <em>Assignment Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl.AssignmentStatementImpl
   * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl.Core861_contentAssistLookAheadTestLanguagePackageImpl#getAssignmentStatement()
   * @generated
   */
  int ASSIGNMENT_STATEMENT = 5;

  /**
   * The number of structural features of the '<em>Assignment Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl.FeatureCallImpl <em>Feature Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl.FeatureCallImpl
   * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl.Core861_contentAssistLookAheadTestLanguagePackageImpl#getFeatureCall()
   * @generated
   */
  int FEATURE_CALL = 6;

  /**
   * The feature id for the '<em><b>Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_CALL__FEATURE = ASSIGNMENT_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Feature Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_CALL_FEATURE_COUNT = ASSIGNMENT_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl.AnnotationImpl <em>Annotation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl.AnnotationImpl
   * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl.Core861_contentAssistLookAheadTestLanguagePackageImpl#getAnnotation()
   * @generated
   */
  int ANNOTATION = 7;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__KEY = 0;

  /**
   * The feature id for the '<em><b>Values</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__VALUES = 1;

  /**
   * The number of structural features of the '<em>Annotation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl.IntTypeImpl <em>Int Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl.IntTypeImpl
   * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl.Core861_contentAssistLookAheadTestLanguagePackageImpl#getIntType()
   * @generated
   */
  int INT_TYPE = 8;

  /**
   * The number of structural features of the '<em>Int Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl.TypeRefImpl <em>Type Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl.TypeRefImpl
   * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl.Core861_contentAssistLookAheadTestLanguagePackageImpl#getTypeRef()
   * @generated
   */
  int TYPE_REF = 9;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_REF__TYPE = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Type Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_REF_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl.ReturnImpl <em>Return</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl.ReturnImpl
   * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl.Core861_contentAssistLookAheadTestLanguagePackageImpl#getReturn()
   * @generated
   */
  int RETURN = 10;

  /**
   * The number of structural features of the '<em>Return</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl.AssignmentImpl <em>Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl.AssignmentImpl
   * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl.Core861_contentAssistLookAheadTestLanguagePackageImpl#getAssignment()
   * @generated
   */
  int ASSIGNMENT = 11;

  /**
   * The feature id for the '<em><b>Feature</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT__FEATURE = ASSIGNMENT_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Rhs</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT__RHS = ASSIGNMENT_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_FEATURE_COUNT = ASSIGNMENT_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl.MemberCallImpl <em>Member Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl.MemberCallImpl
   * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl.Core861_contentAssistLookAheadTestLanguagePackageImpl#getMemberCall()
   * @generated
   */
  int MEMBER_CALL = 12;

  /**
   * The feature id for the '<em><b>Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER_CALL__FEATURE = FEATURE_CALL__FEATURE;

  /**
   * The feature id for the '<em><b>Owner</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER_CALL__OWNER = FEATURE_CALL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Member</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER_CALL__MEMBER = FEATURE_CALL_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Member Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER_CALL_FEATURE_COUNT = FEATURE_CALL_FEATURE_COUNT + 2;


  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.Member <em>Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Member</em>'.
   * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.Member
   * @generated
   */
  EClass getMember();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.Member#getAnnotations <em>Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotations</em>'.
   * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.Member#getAnnotations()
   * @see #getMember()
   * @generated
   */
  EReference getMember_Annotations();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.Member#getModifier <em>Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Modifier</em>'.
   * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.Member#getModifier()
   * @see #getMember()
   * @generated
   */
  EAttribute getMember_Modifier();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.Member#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.Member#getType()
   * @see #getMember()
   * @generated
   */
  EReference getMember_Type();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.Member#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.Member#getName()
   * @see #getMember()
   * @generated
   */
  EAttribute getMember_Name();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.FieldDecl <em>Field Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field Decl</em>'.
   * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.FieldDecl
   * @generated
   */
  EClass getFieldDecl();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.FieldDecl#getInitVal <em>Init Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Init Val</em>'.
   * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.FieldDecl#getInitVal()
   * @see #getFieldDecl()
   * @generated
   */
  EAttribute getFieldDecl_InitVal();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.MethodDecl <em>Method Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method Decl</em>'.
   * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.MethodDecl
   * @generated
   */
  EClass getMethodDecl();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.MethodDecl#getDecls <em>Decls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Decls</em>'.
   * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.MethodDecl#getDecls()
   * @see #getMethodDecl()
   * @generated
   */
  EReference getMethodDecl_Decls();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.MethodDecl#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.MethodDecl#getStatements()
   * @see #getMethodDecl()
   * @generated
   */
  EReference getMethodDecl_Statements();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement</em>'.
   * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.Statement
   * @generated
   */
  EClass getStatement();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.AssignmentStatement <em>Assignment Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignment Statement</em>'.
   * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.AssignmentStatement
   * @generated
   */
  EClass getAssignmentStatement();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.FeatureCall <em>Feature Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature Call</em>'.
   * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.FeatureCall
   * @generated
   */
  EClass getFeatureCall();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.FeatureCall#getFeature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Feature</em>'.
   * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.FeatureCall#getFeature()
   * @see #getFeatureCall()
   * @generated
   */
  EReference getFeatureCall_Feature();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.Annotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation</em>'.
   * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.Annotation
   * @generated
   */
  EClass getAnnotation();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.Annotation#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key</em>'.
   * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.Annotation#getKey()
   * @see #getAnnotation()
   * @generated
   */
  EAttribute getAnnotation_Key();

  /**
   * Returns the meta object for the attribute list '{@link org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.Annotation#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Values</em>'.
   * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.Annotation#getValues()
   * @see #getAnnotation()
   * @generated
   */
  EAttribute getAnnotation_Values();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.IntType <em>Int Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int Type</em>'.
   * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.IntType
   * @generated
   */
  EClass getIntType();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.TypeRef <em>Type Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Ref</em>'.
   * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.TypeRef
   * @generated
   */
  EClass getTypeRef();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.TypeRef#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.TypeRef#getType()
   * @see #getTypeRef()
   * @generated
   */
  EReference getTypeRef_Type();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.Return <em>Return</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Return</em>'.
   * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.Return
   * @generated
   */
  EClass getReturn();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.Assignment <em>Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignment</em>'.
   * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.Assignment
   * @generated
   */
  EClass getAssignment();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.Assignment#getFeature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Feature</em>'.
   * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.Assignment#getFeature()
   * @see #getAssignment()
   * @generated
   */
  EReference getAssignment_Feature();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.Assignment#getRhs <em>Rhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rhs</em>'.
   * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.Assignment#getRhs()
   * @see #getAssignment()
   * @generated
   */
  EAttribute getAssignment_Rhs();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.MemberCall <em>Member Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Member Call</em>'.
   * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.MemberCall
   * @generated
   */
  EClass getMemberCall();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.MemberCall#getOwner <em>Owner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Owner</em>'.
   * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.MemberCall#getOwner()
   * @see #getMemberCall()
   * @generated
   */
  EReference getMemberCall_Owner();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.MemberCall#getMember <em>Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Member</em>'.
   * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.MemberCall#getMember()
   * @see #getMemberCall()
   * @generated
   */
  EReference getMemberCall_Member();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  Core861_contentAssistLookAheadTestLanguageFactory getCore861_contentAssistLookAheadTestLanguageFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl.MemberImpl <em>Member</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl.MemberImpl
     * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl.Core861_contentAssistLookAheadTestLanguagePackageImpl#getMember()
     * @generated
     */
    EClass MEMBER = eINSTANCE.getMember();

    /**
     * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEMBER__ANNOTATIONS = eINSTANCE.getMember_Annotations();

    /**
     * The meta object literal for the '<em><b>Modifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MEMBER__MODIFIER = eINSTANCE.getMember_Modifier();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEMBER__TYPE = eINSTANCE.getMember_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MEMBER__NAME = eINSTANCE.getMember_Name();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl.FieldDeclImpl <em>Field Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl.FieldDeclImpl
     * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl.Core861_contentAssistLookAheadTestLanguagePackageImpl#getFieldDecl()
     * @generated
     */
    EClass FIELD_DECL = eINSTANCE.getFieldDecl();

    /**
     * The meta object literal for the '<em><b>Init Val</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD_DECL__INIT_VAL = eINSTANCE.getFieldDecl_InitVal();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl.MethodDeclImpl <em>Method Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl.MethodDeclImpl
     * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl.Core861_contentAssistLookAheadTestLanguagePackageImpl#getMethodDecl()
     * @generated
     */
    EClass METHOD_DECL = eINSTANCE.getMethodDecl();

    /**
     * The meta object literal for the '<em><b>Decls</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_DECL__DECLS = eINSTANCE.getMethodDecl_Decls();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_DECL__STATEMENTS = eINSTANCE.getMethodDecl_Statements();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl.TypeImpl
     * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl.Core861_contentAssistLookAheadTestLanguagePackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl.StatementImpl <em>Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl.StatementImpl
     * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl.Core861_contentAssistLookAheadTestLanguagePackageImpl#getStatement()
     * @generated
     */
    EClass STATEMENT = eINSTANCE.getStatement();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl.AssignmentStatementImpl <em>Assignment Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl.AssignmentStatementImpl
     * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl.Core861_contentAssistLookAheadTestLanguagePackageImpl#getAssignmentStatement()
     * @generated
     */
    EClass ASSIGNMENT_STATEMENT = eINSTANCE.getAssignmentStatement();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl.FeatureCallImpl <em>Feature Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl.FeatureCallImpl
     * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl.Core861_contentAssistLookAheadTestLanguagePackageImpl#getFeatureCall()
     * @generated
     */
    EClass FEATURE_CALL = eINSTANCE.getFeatureCall();

    /**
     * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_CALL__FEATURE = eINSTANCE.getFeatureCall_Feature();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl.AnnotationImpl <em>Annotation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl.AnnotationImpl
     * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl.Core861_contentAssistLookAheadTestLanguagePackageImpl#getAnnotation()
     * @generated
     */
    EClass ANNOTATION = eINSTANCE.getAnnotation();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANNOTATION__KEY = eINSTANCE.getAnnotation_Key();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANNOTATION__VALUES = eINSTANCE.getAnnotation_Values();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl.IntTypeImpl <em>Int Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl.IntTypeImpl
     * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl.Core861_contentAssistLookAheadTestLanguagePackageImpl#getIntType()
     * @generated
     */
    EClass INT_TYPE = eINSTANCE.getIntType();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl.TypeRefImpl <em>Type Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl.TypeRefImpl
     * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl.Core861_contentAssistLookAheadTestLanguagePackageImpl#getTypeRef()
     * @generated
     */
    EClass TYPE_REF = eINSTANCE.getTypeRef();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_REF__TYPE = eINSTANCE.getTypeRef_Type();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl.ReturnImpl <em>Return</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl.ReturnImpl
     * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl.Core861_contentAssistLookAheadTestLanguagePackageImpl#getReturn()
     * @generated
     */
    EClass RETURN = eINSTANCE.getReturn();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl.AssignmentImpl <em>Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl.AssignmentImpl
     * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl.Core861_contentAssistLookAheadTestLanguagePackageImpl#getAssignment()
     * @generated
     */
    EClass ASSIGNMENT = eINSTANCE.getAssignment();

    /**
     * The meta object literal for the '<em><b>Feature</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNMENT__FEATURE = eINSTANCE.getAssignment_Feature();

    /**
     * The meta object literal for the '<em><b>Rhs</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSIGNMENT__RHS = eINSTANCE.getAssignment_Rhs();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl.MemberCallImpl <em>Member Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl.MemberCallImpl
     * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl.Core861_contentAssistLookAheadTestLanguagePackageImpl#getMemberCall()
     * @generated
     */
    EClass MEMBER_CALL = eINSTANCE.getMemberCall();

    /**
     * The meta object literal for the '<em><b>Owner</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEMBER_CALL__OWNER = eINSTANCE.getMemberCall_Owner();

    /**
     * The meta object literal for the '<em><b>Member</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEMBER_CALL__MEMBER = eINSTANCE.getMemberCall_Member();

  }

} //Core861_contentAssistLookAheadTestLanguagePackage
