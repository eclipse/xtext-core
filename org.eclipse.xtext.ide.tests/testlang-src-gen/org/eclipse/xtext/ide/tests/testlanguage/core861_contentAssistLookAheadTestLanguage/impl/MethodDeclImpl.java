/**
 * Copyright (c) 2016, 2017 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.Core861_contentAssistLookAheadTestLanguagePackage;
import org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.FieldDecl;
import org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.MethodDecl;
import org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.Statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl.MethodDeclImpl#getDecls <em>Decls</em>}</li>
 *   <li>{@link org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl.MethodDeclImpl#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodDeclImpl extends MemberImpl implements MethodDecl
{
  /**
   * The cached value of the '{@link #getDecls() <em>Decls</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecls()
   * @generated
   * @ordered
   */
  protected EList<FieldDecl> decls;

  /**
   * The cached value of the '{@link #getStatements() <em>Statements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatements()
   * @generated
   * @ordered
   */
  protected EList<Statement> statements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MethodDeclImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return Core861_contentAssistLookAheadTestLanguagePackage.Literals.METHOD_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FieldDecl> getDecls()
  {
    if (decls == null)
    {
      decls = new EObjectContainmentEList<FieldDecl>(FieldDecl.class, this, Core861_contentAssistLookAheadTestLanguagePackage.METHOD_DECL__DECLS);
    }
    return decls;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Statement> getStatements()
  {
    if (statements == null)
    {
      statements = new EObjectContainmentEList<Statement>(Statement.class, this, Core861_contentAssistLookAheadTestLanguagePackage.METHOD_DECL__STATEMENTS);
    }
    return statements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case Core861_contentAssistLookAheadTestLanguagePackage.METHOD_DECL__DECLS:
        return ((InternalEList<?>)getDecls()).basicRemove(otherEnd, msgs);
      case Core861_contentAssistLookAheadTestLanguagePackage.METHOD_DECL__STATEMENTS:
        return ((InternalEList<?>)getStatements()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case Core861_contentAssistLookAheadTestLanguagePackage.METHOD_DECL__DECLS:
        return getDecls();
      case Core861_contentAssistLookAheadTestLanguagePackage.METHOD_DECL__STATEMENTS:
        return getStatements();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case Core861_contentAssistLookAheadTestLanguagePackage.METHOD_DECL__DECLS:
        getDecls().clear();
        getDecls().addAll((Collection<? extends FieldDecl>)newValue);
        return;
      case Core861_contentAssistLookAheadTestLanguagePackage.METHOD_DECL__STATEMENTS:
        getStatements().clear();
        getStatements().addAll((Collection<? extends Statement>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case Core861_contentAssistLookAheadTestLanguagePackage.METHOD_DECL__DECLS:
        getDecls().clear();
        return;
      case Core861_contentAssistLookAheadTestLanguagePackage.METHOD_DECL__STATEMENTS:
        getStatements().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case Core861_contentAssistLookAheadTestLanguagePackage.METHOD_DECL__DECLS:
        return decls != null && !decls.isEmpty();
      case Core861_contentAssistLookAheadTestLanguagePackage.METHOD_DECL__STATEMENTS:
        return statements != null && !statements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //MethodDeclImpl
