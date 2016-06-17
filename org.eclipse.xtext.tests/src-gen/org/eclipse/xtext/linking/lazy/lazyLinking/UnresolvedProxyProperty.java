/**
 */
package org.eclipse.xtext.linking.lazy.lazyLinking;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unresolved Proxy Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.linking.lazy.lazyLinking.UnresolvedProxyProperty#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.xtext.linking.lazy.lazyLinking.UnresolvedProxyProperty#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xtext.linking.lazy.lazyLinking.LazyLinkingPackage#getUnresolvedProxyProperty()
 * @model
 * @generated
 */
public interface UnresolvedProxyProperty extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' reference list.
   * The list contents are of type {@link org.eclipse.xtext.linking.lazy.lazyLinking.Type}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference list.
   * @see org.eclipse.xtext.linking.lazy.lazyLinking.LazyLinkingPackage#getUnresolvedProxyProperty_Type()
   * @model resolveProxies="false"
   * @generated
   */
  EList<Type> getType();

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipse.xtext.linking.lazy.lazyLinking.LazyLinkingPackage#getUnresolvedProxyProperty_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.linking.lazy.lazyLinking.UnresolvedProxyProperty#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // UnresolvedProxyProperty
