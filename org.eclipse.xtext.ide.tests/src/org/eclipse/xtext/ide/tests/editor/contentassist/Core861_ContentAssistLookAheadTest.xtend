/*******************************************************************************
 * Copyright (c) 2018 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.ide.tests.editor.contentassist

import com.google.common.base.Preconditions
import com.google.inject.Inject
import java.util.concurrent.Executors
import org.eclipse.emf.common.util.URI
import org.eclipse.xtext.grammaranalysis.impl.GrammarElementTitleSwitch
import org.eclipse.xtext.ide.editor.contentassist.antlr.ContentAssistContextFactory
import org.eclipse.xtext.ide.tests.testlanguage.Core861_ContentAssistLookAheadTestLanguageIdeInjectorProvider
import org.eclipse.xtext.resource.FileExtensionProvider
import org.eclipse.xtext.resource.IResourceFactory
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.util.StringInputStream
import org.eclipse.xtext.util.TextRegion
import org.junit.Test
import org.junit.runner.RunWith

import static extension org.junit.Assert.*

/**
 * @author Christian Schneider - Initial contribution and API
 */
@RunWith(XtextRunner)
@InjectWith(Core861_ContentAssistLookAheadTestLanguageIdeInjectorProvider)
class Core861_ContentAssistLookAheadTest {

	@Test
	def void test() {
		val good1 = '''
			int y() {
				bar<|>
			}
		'''.toString.firstSetGrammarElementsToString
		
		val good2 = '''
			public int y () {
				bar<|>
			}
		'''.toString.firstSetGrammarElementsToString

		
		val bad = '''
			public int y() {
				bar<|>
			}
		'''.toString.firstSetGrammarElementsToString
		
		good1.assertEquals(good2)
		good2.assertEquals(bad)
	}
	
	@Inject ContentAssistContextFactory factory
	val cursor = "<|>"

	def String firstSetGrammarElementsToString(String input) {
		val offset = input.indexOf(cursor)
		Preconditions.checkArgument(offset >= 0, "you forgot to provide a cursor")
		val doc = input.replace(cursor, "")
		val res = parse(doc)
		
		factory.pool = Executors.newSingleThreadExecutor
		val ctxs = factory.create(doc, new TextRegion(0, 0), offset, res)
		val f = new GrammarElementTitleSwitch().showAssignments.showQualified.showRule
		return '''
			«FOR ctx : ctxs.indexed»
				context«ctx.key» {
					«FOR ele:ctx.value.firstSetGrammarElements»
						«ele.eClass.name»: «f.apply(ele)»
					«ENDFOR»
				}
			«ENDFOR»
		'''
	}

	@Inject FileExtensionProvider fileExtension
	@Inject IResourceFactory resFactory

	def private XtextResource parse(String doc) {
		val uri = URI.createURI("dummy." + fileExtension.primaryFileExtension)
		val res = resFactory.createResource(uri) as XtextResource
		new XtextResourceSet().resources += res
		res.load(new StringInputStream(doc), emptyMap)
		return res
	}
}