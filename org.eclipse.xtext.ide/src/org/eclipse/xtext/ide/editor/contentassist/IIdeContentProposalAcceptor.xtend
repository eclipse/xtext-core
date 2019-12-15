/*******************************************************************************
 * Copyright (c) 2015, 2019 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.ide.editor.contentassist

/**
 * @noreference
 */
interface IIdeContentProposalAcceptor {
	
	/**
	 * Handle the given content assist entry. The entry may be {@code null}.
	 */
	def void accept(ContentAssistEntry entry, int priority)
	
	def boolean canAcceptMoreProposals()
	
}
