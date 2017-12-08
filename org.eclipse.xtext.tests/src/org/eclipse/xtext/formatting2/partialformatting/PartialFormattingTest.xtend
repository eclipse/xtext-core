/*******************************************************************************
 * Copyright (c) 2017 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.formatting2.partialformatting

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.junit.Test
import org.junit.runner.RunWith
import org.eclipse.xtext.formatting2.internal.GenericFormatterTester

import org.eclipse.xtext.util.TextRegion
import org.eclipse.xtext.formatting2.internal.GenericFormatter
import org.eclipse.xtext.formatting2.regionaccess.ITextRegionExtensions
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Model
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Unit

/**
 * @author cwehrheim - Initial contribution and API
 */
@RunWith(XtextRunner)
@InjectWith(MyPartialFormattingTestLanguageInjectorProvider)
class PartialFormattingTest {
	@Inject extension GenericFormatterTester

	@Test
	def void testFormatting1() {
		
		val expected = '''
		unit unitname {
			source : /a/b/c/;
			output : /d/e/f/;
		}
		'''.toString
		
		val source = '''
		unit unitname {
				source : /a/b/c/;
			output : /d/e/f/;
		}
		'''.toString
		val part = "		source : /a/b/c/;"
		val offset = source.indexOf(part)
		val length = part.length
		
		assertFormatted [
			toBeFormatted = source

			formatter = new TestFormatter()
			
			request.regions += new TextRegion(offset, length)
			
			expectation = expected
		]
	}

	static class TestFormatter extends GenericFormatter<Model>
	{
		def dispatch void format(Unit unit, extension IFormattableDocument document) {
			unit.regionFor.keyword("{").prepend[newLine]
			unit.regionFor.keyword("{").append[newLine]
			unit.regionFor.keyword("}").prepend[newLine]
	 		interior(
				unit.regionFor.keyword("{"),
				unit.regionFor.keyword("}")
			) [indent]
		}
		
		override protected format(Model model, ITextRegionExtensions regionAccess, IFormattableDocument document) {
			for (Unit unit : model.units) {
				unit.format(document);
			}
		}
	}
}
