/*******************************************************************************
 * Copyright (c) 2008 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.diagnostics;

/**
 * A specialized {@link org.eclipse.emf.ecore.resource.Resource.Diagnostic} that knows 
 * about the region in the document, e.g. the {@link #getOffset()} and {@link #getLength()}
 * of the issue source.
 * 
 * Implementors should inherit from {@link AbstractDiagnostic} instead of implementing this 
 * interface directly.
 * 
 * @see org.eclipse.xtext.linking.impl.XtextLinkingDiagnostic
 * @see org.eclipse.xtext.resource.XtextSyntaxDiagnostic
 * @see ExceptionDiagnostic
 * 
 * @author Sebastian Zarnekow - Initial contribution and API
 * @noimplement This interface is not intended to be implemented by clients.
 */
public interface Diagnostic extends org.eclipse.emf.ecore.resource.Resource.Diagnostic {

	/**
	 * @since 2.1
	 */
	final String SYNTAX_DIAGNOSTIC = "org.eclipse.xtext.diagnostics.Diagnostic.Syntax";
	
	/**
	 * @since 2.7
	 */
	final String SYNTAX_DIAGNOSTIC_WITH_RANGE = "org.eclipse.xtext.diagnostics.Diagnostic.Syntax.Range";
	
	/**
	 * @deprecated use {@link #SYNTAX_DIAGNOSTIC} instead.
	 */
	@Deprecated
	final String SYNTAX_DIAGNOSITC = SYNTAX_DIAGNOSTIC;
	
	final String LINKING_DIAGNOSTIC = "org.eclipse.xtext.diagnostics.Diagnostic.Linking";

	/**
	 * Returns the offset of this diagnostic.
	 * @return the offset of this diagnostic.
	 */
	int getOffset();

	/**
	 * Returns the length of this diagnostic.
	 * @return the length of this diagnostic.
	 */
	int getLength();

    /**
     * Returns the end line location of the issue within the source.
     * Line <code>1</code> is the first line.
     * @return the end line location of the issue.
     */
    int getLineEnd();

    /**
     * Returns the end column location of the issue within the source.
     * Column <code>1</code> is the first column.
     * @return the end column location of the issue.
     */
    int getColumnEnd();

}