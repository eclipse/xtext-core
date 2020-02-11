/*******************************************************************************
 * Copyright (c) 2009 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.enumrules;

import org.eclipse.xtext.enumrules.enumRulesTestLanguage.EnumRulesTestLanguageFactory;
import org.eclipse.xtext.enumrules.enumRulesTestLanguage.GeneratedEnum;
import org.eclipse.xtext.enumrules.enumRulesTestLanguage.Model;
import org.eclipse.xtext.enumrules.enums.ExistingEnum;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.junit.Test;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public class SerializationTest extends AbstractEnumRulesTest {
	
	private XtextResource resource;
	private XtextResourceSet resourceSet;
	private Model model;

	@Override
	public void setUp() throws Exception {
		super.setUp();
		with(EnumRulesTestLanguageStandaloneSetup.class);
		resourceSet = get(XtextResourceSet.class);
		resource = get(XtextResource.class);
		resourceSet.getResources().add(resource);
		model = EnumRulesTestLanguageFactory.eINSTANCE.createModel();
		resource.getContents().add(model);
	}
	
	@Override
	public void tearDown() throws Exception {
		model = null;
		resource = null;
		resourceSet = null;
		super.tearDown();
	}
	
	// FIXME: (Moritz to Sebastian) This fails since both "generated SameName"
	// and "existing SameName"
	// lead to the same semantic model -- which is empty, since SameName is the
	// EAttribute's default value.
	// Therefore, the serializer returns the first match, which should not be
	// relied on, since the order is not defined.
	public void _testSerialize_01() throws Exception {
		String result = serialize(model);
		assertEquals("generated SameName", result);
	}
	
	@Test public void testSerialize_02() throws Exception {
		model.setExisting(ExistingEnum.DIFFERENT_NAME);
		String result = serialize(model);
		assertEquals("existing DifferentLiteral", result);
	}
	
	// FIXME: This depends on https://bugs.eclipse.org/bugs/show_bug.cgi?id=275855
	public void _testSerialize_03() throws Exception {
		model.setGenerated(GeneratedEnum.DIFFERENT_NAME);
		String result = serialize(model);
		assertEquals("generated DifferentLiteral", result);
	}

}
