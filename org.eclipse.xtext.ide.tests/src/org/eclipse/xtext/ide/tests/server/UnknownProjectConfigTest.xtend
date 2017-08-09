/*******************************************************************************
 * Copyright (c) 2017 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.ide.tests.server

import org.eclipse.lsp4j.DidOpenTextDocumentParams
import org.eclipse.lsp4j.Position
import org.eclipse.lsp4j.TextDocumentIdentifier
import org.eclipse.lsp4j.TextDocumentItem
import org.eclipse.lsp4j.TextDocumentPositionParams
import org.junit.Test

class UnknownProjectConfigTest extends AbstractTestLangLanguageServerTest {
	
	@Test
	def void testCompletionWithInmemoryScheme_01() {
		initialize[rootUri = null]
		val inmemoryUri = 'inmemory:/mydoc.testlang'
		languageServer.didOpen(new DidOpenTextDocumentParams => [
			textDocument = new TextDocumentItem => [
				uri = inmemoryUri
				text = '''
					type Foo {}
				'''
			]
		])
		checkCompletion(inmemoryUri)
	}
	
	@Test
	def void testCompletionWithInmemoryScheme_02() {
		initialize
		val inmemoryUri = 'inmemory:/mydoc.testlang'
		languageServer.didOpen(new DidOpenTextDocumentParams => [
			textDocument = new TextDocumentItem => [
				uri = inmemoryUri
				text = '''
					type Foo {}
				'''
			]
		])
		checkCompletion(inmemoryUri)
	}
	
	@Test
	def void testCompletionWithFileScheme_01() {
		initialize[rootUri = null]
		val fileUri = 'file:/home/test/workspace/mydoc.testlang'
		languageServer.didOpen(new DidOpenTextDocumentParams => [
			textDocument = new TextDocumentItem => [
				uri = fileUri
				text = '''
					type Foo {}
				'''
			]
		])
		checkCompletion(fileUri)
	}

	@Test
	def void testCompletionWithFileScheme_02() {
		initialize
		val fileUri = 'file:/home/test/workspace/mydoc.testlang'
		languageServer.didOpen(new DidOpenTextDocumentParams => [
			textDocument = new TextDocumentItem => [
				uri = fileUri
				text = '''
					type Foo {}
				'''
			]
		])
		checkCompletion(fileUri)
	}
	
	protected def checkCompletion(String uri) {
		val completionItems = languageServer.completion(new TextDocumentPositionParams => [
			textDocument = new TextDocumentIdentifier(uri)
			position = new Position(0, 10)
		])
		val result = completionItems.get
		val items = if (result.isLeft) result.getLeft else result.getRight.items 
		val actualCompletionItems = items.toExpectation
		val expectedCompletionItems = '''
			Foo (TypeDeclaration) -> Foo [[0, 10] .. [0, 10]]
			boolean -> boolean [[0, 10] .. [0, 10]]
			int -> int [[0, 10] .. [0, 10]]
			op -> op [[0, 10] .. [0, 10]]
			string -> string [[0, 10] .. [0, 10]]
			void -> void [[0, 10] .. [0, 10]]
			} -> } [[0, 10] .. [0, 10]]
			{ -> { [[0, 9] .. [0, 10]]
		'''
		assertEquals(expectedCompletionItems, actualCompletionItems)
	}
	
}