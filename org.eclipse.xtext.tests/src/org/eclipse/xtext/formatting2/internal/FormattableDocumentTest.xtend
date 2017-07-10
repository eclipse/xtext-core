/*******************************************************************************
 * Copyright (c) 2014 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.formatting2.internal

import com.google.inject.Inject
import org.eclipse.xtext.formatting2.internal.formattertestlanguage.IDList
import org.eclipse.xtext.formatting2.internal.formattertestlanguage.KWList
import org.eclipse.xtext.formatting2.internal.services.FormatterTestLanguageGrammarAccess
import org.eclipse.xtext.formatting2.internal.tests.FormatterTestLanguageInjectorProvider
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.util.TextRegion
import org.junit.Test
import org.junit.runner.RunWith

import static org.eclipse.xtext.formatting2.FormatterPreferenceKeys.*
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.formatting2.regionaccess.ITextRegionExtensions
import org.eclipse.xtext.formatting2.IFormattableDocument

/**
 * @author Moritz Eysholdt - Initial contribution and API
 */
@RunWith(XtextRunner)
@InjectWith(FormatterTestLanguageInjectorProvider)
class FormattableDocumentTest {
	@Inject extension GenericFormatterTester
	@Inject extension FormatterTestLanguageGrammarAccess

	@Test def void simple() {
		assertFormatted[
			toBeFormatted = '''
				idlist  a
			'''
			formatter = [ IDList model, extension regions, extension document |
				model.regionFor.keyword("idlist").append[oneSpace]
			]
			expectation = '''
				idlist a
			'''
		]
	}

	@Test def void autowrap() {
		assertFormatted[
			preferences[
				put(maxLineWidth, 10)
			]
			toBeFormatted = '''
				idlist  aaa  bbb  ccc  ddd  eee  fff
			'''
			formatter = [ IDList model, extension regions, extension document |
				model.regionFor.ruleCallsTo(IDRule).forEach[prepend[autowrap; oneSpace]]
			]
			expectation = '''
				idlist aaa
				bbb ccc
				ddd eee fff
			'''
		]
	}
	
	@Test def void autowrapNotInPreviousLineBetweenFormattedRegions() {
		assertFormatted[
			preferences[
				put(maxLineWidth, 5)
			]
			toBeFormatted = '''
				kwlist kw1
				kw2 kw3 kw4  kw5
			'''
			formatter = [ KWList model, extension regions, extension document |
				model.regionFor.keyword("kwlist").append[autowrap; oneSpace]
				model.regionFor.keyword("kw4").append[oneSpace]
			]
			expectation = '''
				kwlist kw1
				kw2 kw3 kw4 kw5
			'''
		]
	}
	
	@Test def void autowrapNotInPreviousLineInFormattedRegion() {
		assertFormatted[
			preferences[
				put(maxLineWidth, 10)
			]
			toBeFormatted = '''
				kwlist kw1 kw2 kw3 kw4  kw5
			'''
			formatter = [ KWList model, extension regions, extension document |
				model.regionFor.keyword("kwlist").append[autowrap; oneSpace]
				model.regionFor.keyword("kw1").append[newLine]
				model.regionFor.keyword("kw4").append[oneSpace]
			]
			expectation = '''
				kwlist kw1
				kw2 kw3 kw4 kw5
			'''
		]
	}

	@Test def void autoWrapWithSpan() {
		assertFormatted[
			preferences[
				put(maxLineWidth, 10)
			]
			toBeFormatted = '''
				kwlist  kw1  kw2  kw3  kw4
			'''
			formatter = [ KWList model, extension regions, extension document |
				model.regionFor.keyword("kwlist").append[autowrap(6); oneSpace]
				model.regionFor.keyword("kw1").append[autowrap; oneSpace]
				model.regionFor.keyword("kw2").append[autowrap; oneSpace]
				model.regionFor.keyword("kw3").append[autowrap; oneSpace]
				model.regionFor.keyword("kw4").append[autowrap; newLine]
			]
			expectation = '''
				kwlist
				kw1 kw2
				kw3 kw4
			'''
		]
	}
	
	@Test def void autoWrapRewrite() {
		assertFormatted[
			preferences[
				put(maxLineWidth, 10)
			]
			toBeFormatted = '''
				kwlist  kw1  kw2
			'''
			formatter = [ KWList model, extension regions, extension document |
				model.regionFor.keyword("kwlist").append [
					autowrap;
					onAutowrap = [ region, wrapped, extension doc |
						model.regionFor.keyword("kw1").append[space = "!"]
					]
					model.regionFor.keyword("kw1").append[space = "@"; lowPriority]
				]
			]
			expectation = '''
				kwlist
				kw1!kw2
			'''
		]
	}
	
	@Test def void autoWrapInsert() {
		assertFormatted[
			preferences[
				put(maxLineWidth, 10)
			]
			toBeFormatted = '''
				kwlist  kw1  kw2
			'''
			formatter = [ KWList model, extension regions, extension document |
				model.regionFor.keyword("kwlist").append [
					autowrap;
					onAutowrap = [ region, wrapped, extension doc |
						model.regionFor.keyword("kw1").append[space = "!"]
					]
					model.regionFor.keyword("kw2").append[space = "@\n"]
				]
			]
			expectation = '''
				kwlist
				kw1!kw2@
			'''
		]
	}

	@Test def void conditionalFormatting1() {
		assertFormatted[
			preferences[
				put(maxLineWidth, 10)
			]
			toBeFormatted = '''
				kwlist  kw1  kw2
			'''
			formatter = [ KWList model, extension regions, extension document |
				model.formatConditionally(
					[ doc |
						val extension fits = doc.requireFitsInLine
						model.regionFor.keyword("kwlist").append[oneSpace]
						model.regionFor.keyword("kw1").append[oneSpace]
					],
					[ extension doc |
						model.regionFor.keyword("kwlist").append[newLine]
						model.regionFor.keyword("kw1").append[newLine]
					])
			]
			expectation = '''
				kwlist
				kw1
				kw2
			'''
		]
	}

	@Test def void conditionalFormatting2() {
		assertFormatted[
			preferences[
				put(maxLineWidth, 30)
			]
			toBeFormatted = '''
				kwlist  kw1  kw2
			'''
			formatter = [ KWList model, extension regions, extension document |
				model.formatConditionally(
					[ doc |
						val extension fits = doc.requireFitsInLine
						model.regionFor.keyword("kwlist").append[oneSpace]
						model.regionFor.keyword("kw1").append[oneSpace]
					],
					[ extension doc |
						model.regionFor.keyword("kwlist").append[newLine]
						model.regionFor.keyword("kw1").append[newLine]
					])
			]
			expectation = '''
				kwlist kw1 kw2
			'''
		]
	}
	
	// see https://bugs.eclipse.org/bugs/show_bug.cgi?id=482665
	@Test def void aroundDocument() {
		assertFormatted[
			request.regions += new TextRegion(0, 6)
			toBeFormatted = '''idlist'''
			formatter = [ IDList model, extension regions, extension document |
				model.regionFor.keyword("idlist").surround[space = "!"]
			]
			expectation = '''!idlist!'''
		]
	}
	
	// see https://bugs.eclipse.org/bugs/show_bug.cgi?id=482110
	@Test def void shouldFormat() {
		assertFormatted[
			request.regions += new TextRegion(0, 6)
			toBeFormatted = '''idlist'''
			formatter = new GenericFormatter {
				override protected format(EObject model, ITextRegionExtensions regionAccess, IFormattableDocument document) {
					throw new IllegalStateException("this method should never be called")
				}
				override shouldFormat(Object obj, IFormattableDocument document) {
					false
				}
			}
			expectation = '''idlist'''
		]
	}
	
	// see https://bugs.eclipse.org/bugs/show_bug.cgi?id=482110
	@Test(expected=IllegalStateException) def void shouldFormat_02() {
		assertFormatted[
			request.regions += new TextRegion(0, 6)
			toBeFormatted = '''idlist'''
			formatter = new GenericFormatter {
				override protected format(EObject model, ITextRegionExtensions regionAccess, IFormattableDocument document) {
					throw new IllegalStateException("this method should never be called")
				}
				override shouldFormat(Object obj, IFormattableDocument document) {
					true
				}
			}
			expectation = '''idlist'''
		]
	}
	
	
}
