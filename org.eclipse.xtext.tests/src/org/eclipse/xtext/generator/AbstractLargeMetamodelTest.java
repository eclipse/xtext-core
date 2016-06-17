/*******************************************************************************
 * Copyright (c) 2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.generator;

import org.eclipse.xtext.tests.AbstractXtextTests;
import org.junit.Ignore;
import org.junit.Test;

/**
 * You'll have to regenerate the test languages with the org.eclipse.xtext.generator.GeneratorTestLanguage
 * enabled in the workflow.
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public abstract class AbstractLargeMetamodelTest extends AbstractXtextTests {

	@Override
	public void setUp() throws Exception {
		super.setUp();
//		with(GeneratorTestLanguageStandaloneSetup.class);
	}

	@Test
	@Ignore("see class comment")
	public void testRuleClass() {
//		Class<Rule> ruleClass = Rule.class;
//		assertNotNull(ruleClass);
	}

	@Test
	@Ignore("see class comment")
	public void testEPackage() {
//		GeneratorTestLanguagePackage instance = GeneratorTestLanguagePackage.eINSTANCE;
//		assertNotNull(instance);
	}
}
