/*******************************************************************************
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.ide.tests.server

import java.lang.reflect.InvocationTargetException
import org.eclipse.lsp4j.DidOpenTextDocumentParams
import org.eclipse.lsp4j.TextDocumentItem
import org.eclipse.lsp4j.jsonrpc.ResponseErrorException
import org.eclipse.lsp4j.jsonrpc.messages.ResponseErrorCode
import org.eclipse.lsp4j.jsonrpc.services.ServiceEndpoints
import org.eclipse.xtext.ide.tests.testlanguage.ide.TestLangLSPExtension
import org.eclipse.xtext.ide.tests.testlanguage.ide.TestLangLSPExtension.BuildNotification
import org.eclipse.xtext.ide.tests.testlanguage.ide.TestLangLSPExtension.TextOfLineParam
import org.junit.Assert
import org.junit.Test

/**
 * @author efftinge - Initial contribution and API
 */
class LspExtensionTest extends AbstractTestLangLanguageServerTest {
	
	@Test def void testExtension() {
		val fileURI = "mydoc.testlang".writeFile("")
		initialize
		val ext = ServiceEndpoints.toServiceObject(languageServer, TestLangLSPExtension)
		languageServer.didOpen(new DidOpenTextDocumentParams => [
			it.textDocument = new TextDocumentItem => [
				uri = fileURI
				text = '''
					foo bar
					baz test
						bla blubb
				'''
			]
		])
		val result = ext.getTextOfLine(new TextOfLineParam => [
			uri = fileURI
			line = 1
		]).get
		Assert.assertEquals("baz test", result.text)
		Assert.assertEquals(2, notifications.map[value].filter(BuildNotification).size)
	}
	
	@Test def void testMissingInitialize() {
		try {
			val fileURI = "mydoc.testlang".writeFile("")
			val ext = ServiceEndpoints.toServiceObject(languageServer, TestLangLSPExtension)
			ext.getTextOfLine(new TextOfLineParam => [
				uri = fileURI
				line = 1
			]).get
			Assert.fail("Expected an exception")
		} catch (Exception exception) {
			var Throwable t = exception
			while (t instanceof InvocationTargetException || t.class == RuntimeException) {
				t = t.cause
			}
			Assert.assertTrue(t instanceof IllegalStateException)
			Assert.assertTrue(t.cause instanceof ResponseErrorException)
			Assert.assertEquals(ResponseErrorCode.serverNotInitialized.value, (t.cause as ResponseErrorException).responseError.code)
		}
	}
	
}