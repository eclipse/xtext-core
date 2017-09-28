/*******************************************************************************
 * Copyright (c) 2017 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.ide.tests.server

import org.eclipse.lsp4j.Position
import org.eclipse.lsp4j.RenameParams
import org.eclipse.lsp4j.TextDocumentIdentifier
import org.junit.Test
import org.junit.Before

/**
 * @author koehnlein - Initial contribution and API
 */
class RenameTest extends AbstractTestLangLanguageServerTest {
	
	String firstFile
	String secondFile
	
	@Before
	def void setUp() {
		val first = '''
            type Test {
                Test foo
            }
        '''
		firstFile = 'MyType1.testlang'.writeFile(first)
		val second = '''
            type Test2 {
                Test foo
            }
        '''
		secondFile = 'MyType2.testlang'.writeFile(second)
        initialize
	}
	
	@Test
	def void testRenameOnDeclaration() {
		doTest(firstFile, new Position(0,5))
	}

	@Test
	def void testRenameOnReference() {
		doTest(firstFile, new Position(1,5))
	}
	
	@Test
	def void testRenameOnReferenceInOtherFile() {
		doTest(secondFile, new Position(1, 5))
	}
	
	protected def doTest(String fileName, Position position) {
        val params = new RenameParams(new TextDocumentIdentifier(fileName), position, 'Tescht')
        val workspaceEdit = languageServer.rename(params).get
        assertEquals('''
			changes :
				MyType1.testlang : Tescht [[0, 5] .. [0, 9]]
				Tescht [[1, 4] .. [1, 8]]
				MyType2.testlang : Test [[1, 4] .. [1, 8]]
			documentChanges : 
        '''.toString, toExpectation(workspaceEdit))			
	}
	
	
}