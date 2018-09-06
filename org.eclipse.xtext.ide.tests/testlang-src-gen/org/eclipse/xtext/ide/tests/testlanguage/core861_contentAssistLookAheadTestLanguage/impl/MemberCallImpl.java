/**
 * Copyright (c) 2016, 2017 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.Core861_contentAssistLookAheadTestLanguagePackage;
import org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.FeatureCall;
import org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.Member;
import org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.MemberCall;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Member Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl.MemberCallImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.impl.MemberCallImpl#getMember <em>Member</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MemberCallImpl extends FeatureCallImpl implements MemberCall
{
  /**
   * The cached value of the '{@link #getOwner() <em>Owner</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwner()
   * @generated
   * @ordered
   */
  protected FeatureCall owner;

  /**
   * The cached value of the '{@link #getMember() <em>Member</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMember()
   * @generated
   * @ordered
   */
  protected Member member;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MemberCallImpl()
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
    return Core861_contentAssistLookAheadTestLanguagePackage.Literals.MEMBER_CALL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureCall getOwner()
  {
    return owner;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOwner(FeatureCall newOwner, NotificationChain msgs)
  {
    FeatureCall oldOwner = owner;
    owner = newOwner;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Core861_contentAssistLookAheadTestLanguagePackage.MEMBER_CALL__OWNER, oldOwner, newOwner);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOwner(FeatureCall newOwner)
  {
    if (newOwner != owner)
    {
      NotificationChain msgs = null;
      if (owner != null)
        msgs = ((InternalEObject)owner).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Core861_contentAssistLookAheadTestLanguagePackage.MEMBER_CALL__OWNER, null, msgs);
      if (newOwner != null)
        msgs = ((InternalEObject)newOwner).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Core861_contentAssistLookAheadTestLanguagePackage.MEMBER_CALL__OWNER, null, msgs);
      msgs = basicSetOwner(newOwner, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Core861_contentAssistLookAheadTestLanguagePackage.MEMBER_CALL__OWNER, newOwner, newOwner));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Member getMember()
  {
    if (member != null && member.eIsProxy())
    {
      InternalEObject oldMember = (InternalEObject)member;
      member = (Member)eResolveProxy(oldMember);
      if (member != oldMember)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, Core861_contentAssistLookAheadTestLanguagePackage.MEMBER_CALL__MEMBER, oldMember, member));
      }
    }
    return member;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Member basicGetMember()
  {
    return member;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMember(Member newMember)
  {
    Member oldMember = member;
    member = newMember;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Core861_contentAssistLookAheadTestLanguagePackage.MEMBER_CALL__MEMBER, oldMember, member));
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
      case Core861_contentAssistLookAheadTestLanguagePackage.MEMBER_CALL__OWNER:
        return basicSetOwner(null, msgs);
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
      case Core861_contentAssistLookAheadTestLanguagePackage.MEMBER_CALL__OWNER:
        return getOwner();
      case Core861_contentAssistLookAheadTestLanguagePackage.MEMBER_CALL__MEMBER:
        if (resolve) return getMember();
        return basicGetMember();
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
      case Core861_contentAssistLookAheadTestLanguagePackage.MEMBER_CALL__OWNER:
        setOwner((FeatureCall)newValue);
        return;
      case Core861_contentAssistLookAheadTestLanguagePackage.MEMBER_CALL__MEMBER:
        setMember((Member)newValue);
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
      case Core861_contentAssistLookAheadTestLanguagePackage.MEMBER_CALL__OWNER:
        setOwner((FeatureCall)null);
        return;
      case Core861_contentAssistLookAheadTestLanguagePackage.MEMBER_CALL__MEMBER:
        setMember((Member)null);
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
      case Core861_contentAssistLookAheadTestLanguagePackage.MEMBER_CALL__OWNER:
        return owner != null;
      case Core861_contentAssistLookAheadTestLanguagePackage.MEMBER_CALL__MEMBER:
        return member != null;
    }
    return super.eIsSet(featureID);
  }

} //MemberCallImpl
