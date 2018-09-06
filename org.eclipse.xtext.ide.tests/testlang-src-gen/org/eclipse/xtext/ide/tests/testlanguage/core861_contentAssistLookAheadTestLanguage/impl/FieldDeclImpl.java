/**
 * Copyright (c) 2016, 2017 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.Core861_contentAssistLookAheadTestLanguagePackage;
import org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.FieldDecl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl.FieldDeclImpl#getInitVal <em>Init Val</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FieldDeclImpl extends MemberImpl implements FieldDecl
{
  /**
   * The default value of the '{@link #getInitVal() <em>Init Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitVal()
   * @generated
   * @ordered
   */
  protected static final int INIT_VAL_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getInitVal() <em>Init Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitVal()
   * @generated
   * @ordered
   */
  protected int initVal = INIT_VAL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FieldDeclImpl()
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
    return Core861_contentAssistLookAheadTestLanguagePackage.Literals.FIELD_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getInitVal()
  {
    return initVal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInitVal(int newInitVal)
  {
    int oldInitVal = initVal;
    initVal = newInitVal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Core861_contentAssistLookAheadTestLanguagePackage.FIELD_DECL__INIT_VAL, oldInitVal, initVal));
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
      case Core861_contentAssistLookAheadTestLanguagePackage.FIELD_DECL__INIT_VAL:
        return getInitVal();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case Core861_contentAssistLookAheadTestLanguagePackage.FIELD_DECL__INIT_VAL:
        setInitVal((Integer)newValue);
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
      case Core861_contentAssistLookAheadTestLanguagePackage.FIELD_DECL__INIT_VAL:
        setInitVal(INIT_VAL_EDEFAULT);
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
      case Core861_contentAssistLookAheadTestLanguagePackage.FIELD_DECL__INIT_VAL:
        return initVal != INIT_VAL_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (initVal: ");
    result.append(initVal);
    result.append(')');
    return result.toString();
  }

} //FieldDeclImpl
