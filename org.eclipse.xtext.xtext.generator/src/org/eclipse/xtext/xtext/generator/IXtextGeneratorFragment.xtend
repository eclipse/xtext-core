/*******************************************************************************
 * Copyright (c) 2015, 2017 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.xtext.generator

/**
 * A fragment that contributes to the {@link XtextGenerator}. Use {@link AbstractXtextGeneratorFragment}
 * for implementing new fragments.
 */
interface IXtextGeneratorFragment extends IGuiceAwareGeneratorComponent {
	
	def void checkConfiguration(Issues issues)
	
	def void generate()
	
}
