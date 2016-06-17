/**
 */
package org.eclipse.xtext.parser.terminalrules.xtextTerminalsTestLanguage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.parser.terminalrules.xtextTerminalsTestLanguage.Group#getTokens <em>Tokens</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xtext.parser.terminalrules.xtextTerminalsTestLanguage.XtextTerminalsTestLanguagePackage#getGroup()
 * @model
 * @generated
 */
public interface Group extends AbstractElement
{
  /**
   * Returns the value of the '<em><b>Tokens</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.parser.terminalrules.xtextTerminalsTestLanguage.AbstractElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tokens</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tokens</em>' containment reference list.
   * @see org.eclipse.xtext.parser.terminalrules.xtextTerminalsTestLanguage.XtextTerminalsTestLanguagePackage#getGroup_Tokens()
   * @model containment="true"
   * @generated
   */
  EList<AbstractElement> getTokens();

} // Group
