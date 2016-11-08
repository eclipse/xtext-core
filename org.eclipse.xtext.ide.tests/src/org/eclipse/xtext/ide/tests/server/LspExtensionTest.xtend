/*******************************************************************************
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.ide.tests.server

import com.google.common.base.Splitter
import org.eclipse.lsp4j.DidOpenTextDocumentParams
import org.eclipse.lsp4j.TextDocumentItem
import org.eclipse.lsp4j.jsonrpc.services.ServiceEndpoints
import org.eclipse.xtext.ide.tests.testlanguage.ide.TestLangLSPExtension
import org.eclipse.xtext.ide.tests.testlanguage.ide.TestLangLSPExtension.BuildNotification
import org.eclipse.xtext.ide.tests.testlanguage.ide.TestLangLSPExtension.TextOfLineParam
import org.junit.Assert
import org.junit.Rule
import org.junit.Test
import org.junit.rules.ErrorCollector

import static org.hamcrest.CoreMatchers.*

/**
 * @author efftinge - Initial contribution and API
 */
class LspExtensionTest extends AbstractTestLangLanguageServerTest {
	
	@Rule
    public ErrorCollector collector = new ErrorCollector();
	
	
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
		notifications.map[value].filter(BuildNotification).map[message].forEach[ message |
			collector.checkThat(message, startsWith('Built '));
			val builtResources = Splitter.on('Built ').omitEmptyStrings.split(message);
			collector.checkThat(builtResources.size, is(1));
			collector.checkThat(builtResources.head, endsWith('/org.eclipse.xtext.ide.tests/test-data/test-project/mydoc.testlang'))
		]
	}
	
}