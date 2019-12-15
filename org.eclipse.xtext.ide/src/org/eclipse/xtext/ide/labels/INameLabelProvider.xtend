/*******************************************************************************
 * Copyright (c) 2015, 2019 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.ide.labels

import com.google.inject.ImplementedBy
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.util.SimpleAttributeResolver

/**
 * @author Jan Koehnlein - Initial contribution and API
 */
@ImplementedBy(SimpleNameLabelProvider)
interface INameLabelProvider {
	def String getNameLabel(Object element)
}

class SimpleNameLabelProvider implements INameLabelProvider {

	override getNameLabel(Object element) {
		switch element {
			EObject:
				SimpleAttributeResolver.NAME_RESOLVER.apply(element)
			IEObjectDescription:
				element.name.lastSegment
			default:
				null
		}
	}
}