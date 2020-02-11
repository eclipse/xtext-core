/*******************************************************************************
 * Copyright (c) 2009 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.parser;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.parser.partialParsingTestUtil.CrossResourceContainerManyChildren;
import org.eclipse.xtext.parser.partialParsingTestUtil.PartialParsingTestUtilFactory;
import org.eclipse.xtext.resource.XtextResource;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public class PartialParserCrossContainmentMultiTest extends AbstractPartialParserCrossContainmentTest {
	
	@Override
	protected void setCrossResourceContainer(XtextResource resource) {
		ResourceSet resourceSet = resource.getResourceSet();
		Resource containerResource = resourceSet.createResource(URI.createFileURI("sample.xmi"));
		CrossResourceContainerManyChildren container = PartialParsingTestUtilFactory.eINSTANCE.createCrossResourceContainerManyChildren();
		containerResource.getContents().add(container);
		container.getChildren().addAll(resource.getContents());
	}
	
}
