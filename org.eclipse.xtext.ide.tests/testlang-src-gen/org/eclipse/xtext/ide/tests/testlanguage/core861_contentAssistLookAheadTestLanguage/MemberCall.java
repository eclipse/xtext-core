/**
 * Copyright (c) 2016, 2017 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Member Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.MemberCall#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.MemberCall#getMember <em>Member</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.Core861_contentAssistLookAheadTestLanguagePackage#getMemberCall()
 * @model
 * @generated
 */
public interface MemberCall extends FeatureCall
{
  /**
   * Returns the value of the '<em><b>Owner</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owner</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owner</em>' containment reference.
   * @see #setOwner(FeatureCall)
   * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.Core861_contentAssistLookAheadTestLanguagePackage#getMemberCall_Owner()
   * @model containment="true"
   * @generated
   */
  FeatureCall getOwner();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.MemberCall#getOwner <em>Owner</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Owner</em>' containment reference.
   * @see #getOwner()
   * @generated
   */
  void setOwner(FeatureCall value);

  /**
   * Returns the value of the '<em><b>Member</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Member</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Member</em>' reference.
   * @see #setMember(Member)
   * @see org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.Core861_contentAssistLookAheadTestLanguagePackage#getMemberCall_Member()
   * @model
   * @generated
   */
  Member getMember();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.ide.tests.testlanguage.core861_contentAssistLookAheadTestLanguage.MemberCall#getMember <em>Member</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Member</em>' reference.
   * @see #getMember()
   * @generated
   */
  void setMember(Member value);

} // MemberCall
