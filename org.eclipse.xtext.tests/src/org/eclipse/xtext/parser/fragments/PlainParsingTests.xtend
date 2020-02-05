/*******************************************************************************
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.parser.fragments

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
class FragmentsPlainParsingTest extends AbstractFragmentsPlainParsingTest {
	override void setUp() throws Exception {
		super.setUp();
		with(new FragmentTestLanguageStandaloneSetup());
	}
}

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
class FragmentExsPlainParsingTest extends AbstractFragmentsPlainParsingTest {
	override void setUp() throws Exception {
		super.setUp();
		with(new FragmentTestLanguageExStandaloneSetup());
	}
}