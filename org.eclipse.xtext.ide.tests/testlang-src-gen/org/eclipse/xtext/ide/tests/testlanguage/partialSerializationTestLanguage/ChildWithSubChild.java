/**
 * Copyright (c) 2016, 2017 TypeFox GmbH (http://www.typefox.io) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Child With Sub Child</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.ChildWithSubChild#getSubChilds <em>Sub Childs</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.PartialSerializationTestLanguagePackage#getChildWithSubChild()
 * @model
 * @generated
 */
public interface ChildWithSubChild extends EObject
{
  /**
   * Returns the value of the '<em><b>Sub Childs</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.SubChild}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Childs</em>' containment reference list.
   * @see org.eclipse.xtext.ide.tests.testlanguage.partialSerializationTestLanguage.PartialSerializationTestLanguagePackage#getChildWithSubChild_SubChilds()
   * @model containment="true"
   * @generated
   */
  EList<SubChild> getSubChilds();

} // ChildWithSubChild
