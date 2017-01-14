/*******************************************************************************
 * Copyright (c) 2017 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.formatting2.internal

import com.google.inject.Inject
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.eclipse.xtext.formatting2.IHiddenRegionFormatting
import org.eclipse.xtext.formatting2.ITextReplacer
import org.eclipse.xtext.formatting2.ITextReplacerContext
import org.eclipse.xtext.formatting2.internal.formattertestlanguage.IDList
import org.eclipse.xtext.formatting2.internal.tests.FormatterTestLanguageInjectorProvider
import org.eclipse.xtext.formatting2.regionaccess.ITextRegionExtensions
import org.eclipse.xtext.formatting2.regionaccess.ITextSegment
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.junit.Test
import org.junit.runner.RunWith

/**
 * @author Moritz Eysholdt - Initial contribution and API
 */
@RunWith(XtextRunner)
@InjectWith(FormatterTestLanguageInjectorProvider)
class CommentWithSpacesFormatterTest {

	@Inject extension GenericFormatterTester

	static class TabsAndSpacesSupportingFormatter extends GenericFormatter<IDList> {
		override format(IDList model, ITextRegionExtensions regionAccess, extension IFormattableDocument document) {
			model.regionFor.keyword("idlist").append[oneSpace].append[newLines = 0 highPriority]
		}

		override ITextReplacer createWhitespaceReplacer(ITextSegment hiddens, IHiddenRegionFormatting formatting) {
			return new TabAndSpacesSupportingWhiteSpaceReplacer(hiddens, formatting);
		}
	}

	@Test def void SL_inline() {
		assertFormatted[
			toBeFormatted = '''
				idlist  //x
				a
			'''
			formatter = new TabsAndSpacesSupportingFormatter()
			// space before a because we replace by newline + indentation + space
			// in the TabAndSpacesSupportingWhiteSpaceReplacer
			expectation = '''
				idlist //x
				 a
			'''
		]
	}

	@Test def void SL_multiline() {
		assertFormatted[
			toBeFormatted = '''
				idlist  
				
				//x
				
				
				a
			'''
			formatter = new TabsAndSpacesSupportingFormatter()
			expectation = '''
				idlist //x
				a
			'''
		]
	}

	@Test def void MLSL_inline() {
		assertFormatted[
			toBeFormatted = '''
				idlist  /*x*/  a
			'''
			formatter = new TabsAndSpacesSupportingFormatter()
			expectation = '''
				idlist /*x*/ a
			'''
		]
	}

	@Test def void MLSL_paragraph() {
		assertFormatted[
			toBeFormatted = '''
				idlist
				
				
				/*x*/
				
				
				a
			'''
			formatter = new TabsAndSpacesSupportingFormatter()
			expectation = '''
				idlist /*x*/
				a
			'''
		]
	}

	@Test def void MLML_inline() {
		assertFormatted[
			toBeFormatted = '''
				idlist  /*
				x
				*/  a
			'''
			formatter = new TabsAndSpacesSupportingFormatter()
			expectation = '''
				idlist
				/*
				 * x
				 */ a
			'''
		]
	}

	@Test def void MLML_paragraph() {
		assertFormatted[
			toBeFormatted = '''
				idlist
				
				
				/*
				x
				*/
				
				
				a
				b
			'''
			formatter = new TabsAndSpacesSupportingFormatter()

			expectation = '''
				idlist /*
				 * x
				 */
				a
				b
			'''
		]
	}

	private static class TabAndSpacesSupportingWhiteSpaceReplacer extends WhitespaceReplacer {

		new(ITextSegment whitespace, IHiddenRegionFormatting formatting) {
			super(whitespace, formatting)
		}

		/**
		 * Copied from {@link WhitespaceReplacer}
		 */
		override ITextReplacerContext createReplacements(ITextReplacerContext context) {
			if (formatting.getAutowrap() !== null && formatting.getAutowrap() >= 0)
				context.setCanAutowrap(formatting.getAutowrap());
			val space = formatting.getSpace();
			val trailingNewLinesOfPreviousRegion = trailingNewLinesOfPreviousRegion();
			val computedNewLineCount = computeNewLineCount(context);
			var newLineCount = Math.max(computedNewLineCount - trailingNewLinesOfPreviousRegion, 0);

			if (newLineCount == 0 && context.isAutowrap()) {
				val onAutowrap = formatting.getOnAutowrap();
				if (onAutowrap !== null) {
					onAutowrap.format(region, formatting, context.getDocument());
				}
				newLineCount = 1;
			}
			val indentationCount = computeNewIndentation(context);
			if (newLineCount == 0 && trailingNewLinesOfPreviousRegion == 0) {
				if (space !== null)
					context.addReplacement(region.replaceWith(space));
			} else {
				val noIndentation = formatting.getNoIndentation() == Boolean.TRUE;
				val newLines = context.getNewLinesString(newLineCount);
				val indentation = if(noIndentation) "" else context.getIndentationString(indentationCount);
				// START CHANGE
				// Added "+ space" on the next line
				context.addReplacement(region.replaceWith(newLines + indentation + (space ?: "")));
			// END CHANGE
			}
			return context.withIndentation(indentationCount)
		}
	}
}
