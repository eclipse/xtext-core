/*******************************************************************************
 * Copyright (c) 2017 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.formatting2.partialformatting

import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.partialformatting.partialformattingtestlanguage.Model
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.eclipse.xtext.formatting2.partialformatting.partialformattingtestlanguage.Entity
import org.eclipse.xtext.formatting2.partialformatting.partialformattingtestlanguage.Attribute
import org.eclipse.xtext.formatting2.partialformatting.partialformattingtestlanguage.Property
import org.eclipse.xtext.formatting2.partialformatting.partialformattingtestlanguage.Reference

/**
 * @author cwehrheim - Initial contribution and API
 */
class PartialFormattingFormatter extends AbstractFormatter2 {
	def dispatch void format(Model model, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Entity entities : model.getEntities()) {
			entities.format;
		}
	}

	def dispatch void format(Entity entity, extension IFormattableDocument document) {
		entity.regionFor.keyword("entity").prepend[newLine]
		entity.regionFor.keyword("{").append[newLine]
		entity.regionFor.keyword("}").prepend[newLine]
		 interior(
            entity.regionFor.keyword("{"),
            entity.regionFor.keyword("}")
           ) [indent]
		
		for (Property properties : entity.getProperties()) {
			properties.format;
		}
	}
	
	def dispatch void format(Attribute attr, extension IFormattableDocument document) {
		attr.regionFor.keyword("attr").prepend[newLine]
	}
	
	def dispatch void format(Reference ref, extension IFormattableDocument document) {
		ref.regionFor.keyword("ref").prepend[newLine]
	}
}
