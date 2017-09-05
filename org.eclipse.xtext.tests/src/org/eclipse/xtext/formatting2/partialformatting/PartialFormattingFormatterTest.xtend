/*******************************************************************************
 * Copyright (c) 2017 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.formatting2.partialformatting

import javax.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.formatter.FormatterTestHelper
import org.eclipse.xtext.util.TextRegion
import org.junit.Test
import org.junit.runner.RunWith

import static org.eclipse.xtext.formatting2.FormatterPreferenceKeys.*
import org.eclipse.xtext.formatting2.partialformatting.tests.PartialFormattingTestLanguageInjectorProvider

/**
 * @author cwehrheim - Initial contribution and API
 */
@RunWith(XtextRunner)
@InjectWith(PartialFormattingTestLanguageInjectorProvider)
class PartialFormattingFormatterTest {
	
	@Inject protected FormatterTestHelper tester
	
	@Test
	def void testFormatting1() {
		
		val exp = '''
		entity A {
			attr a : String
			attr b : Int
		}
		'''.toString
		
		val source = '''
		entity A {
					attr a : String
			attr b : Int
		}
		'''.toString
		val part = "			attr a : String"
		val offset = source.indexOf(part)
		val length = part.length
		
		// does work
		 tester.assertFormatted [
			it.preferences = [
				put(maxLineWidth, 80)
			]
			it.expectation = exp
			it.toBeFormatted = source
			it.request.regions += new TextRegion(offset-1, length+1)
			it.allowSyntaxErrors = false
		]
	}
	
	@Test
	def void testFormatting2() {
		
		val exp = '''
		entity A {
			attr a : String
			attr b : Int
		}
		'''.toString
		
		val source = '''
		entity A {
					attr a : String
			attr b : Int
		}
		'''.toString
		val part = "			attr a : String"
		val offset = source.indexOf(part)
		val length = part.length
		
		// does not work
		 tester.assertFormatted [
			it.preferences = [
				put(maxLineWidth, 80)
			]
			it.expectation = exp
			it.toBeFormatted = source
			it.request.regions += new TextRegion(offset, length)
			it.allowSyntaxErrors = false
		]
	}

	@Test
	def void testFormatting3() {
		
		val exp = '''
		
		entity A {
			attr a : String
			attr b : Int
		}
		entity B {
			attr c : String
			attr d : Int
		}
		entity C {
			attr e : String
			attr f : Int
			ref g : A
		}
		'''.toString
		
		val source = '''
		entity A {attr a : String    attr b : Int   }  entity B {
			attr c : String
			attr d : Int
		}
		entity C {  		attr e : String  		attr f : Int 			ref g : A	}
		'''.toString
		
		// does not work
		 tester.assertFormatted [
			it.preferences = [
				put(maxLineWidth, 80)
			]
			it.expectation = exp
			it.toBeFormatted = source
			it.allowSyntaxErrors = false
		]
	}
	
	@Test
	def void testFormatting4() {
		
		val exp = '''
		entity A {attr a : String    attr b : Int   }  entity B {
			attr c : String
			attr d : Int
		}
		entity C {  		attr e : String  		attr f : Int 			ref g : A	}
		'''.toString
		
		val source = '''
		entity A {attr a : String    attr b : Int   }  entity B {
					attr c : String
							attr d : Int
		}
		entity C {  		attr e : String  		attr f : Int 			ref g : A	}
		'''.toString
		val part1 = "		attr c : String"
		val offset1 = source.indexOf(part1)
		val length1 = part1.length
		val part2 = "				attr d : Int"
		val offset2 = source.indexOf(part2)
		val length2 = part2.length
		
		// does not work
		 tester.assertFormatted [
			it.preferences = [
				put(maxLineWidth, 80)
			]
			it.expectation = exp
			it.toBeFormatted = source
			it.request.regions += new TextRegion(offset1, length1)
			it.request.regions += new TextRegion(offset2, length2)
			it.allowSyntaxErrors = false
		]
	}

	@Test
	def void testFormatting5() {
		
		val exp = '''
		entity A {
			attr a : String
			attr b : Int
		}
		entity B {
			attr c : String
			attr d : Int
		}
		entity C {
			attr e : String
			attr f : Int
			ref g : A
		}
		'''.toString
		
		val source = '''
		entity A {attr a : String    attr b : Int   }  entity B {
					attr c : String
							attr d : Int
		}
		entity C {  		attr e : String  		attr f : Int 			ref g : A	}
		'''.toString
		
		// does not work
		 tester.assertFormatted [
			it.preferences = [
				put(maxLineWidth, 80)
			]
			it.expectation = exp
			it.toBeFormatted = source
			it.request.regions += new TextRegion(10, 82)
			it.request.regions += new TextRegion(107, 49)
			it.allowSyntaxErrors = false
		]
	}
}