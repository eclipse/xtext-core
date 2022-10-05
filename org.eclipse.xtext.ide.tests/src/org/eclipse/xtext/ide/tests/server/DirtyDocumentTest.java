/*******************************************************************************
 * Copyright (c) 2022 Avaloq Group AG (http://www.avaloq.com).
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.ide.tests.server;

import org.eclipse.lsp4j.Position;
import org.junit.Assert;
import org.junit.Test;

import com.google.common.collect.Iterables;

/**
 * @author Andrew Lamb - Initial contribution and API
 * @since 2.29
 */
public class DirtyDocumentTest extends AbstractTestLangLanguageServerTest {
	@Test
	public void testClose() {
		String testSource = 
				"type Test {\n" +
						"    NonExisting foo\n" +
						"    Test bar\n" +
				"}\n";
		String testFile = writeFile("MyType1.testlang",
				testSource);
		initialize();
		assertEquals("Couldn't resolve reference to TypeDeclaration 'NonExisting'.",
				Iterables.getFirst(getDiagnostics().get(testFile), null).getMessage());
		open(testFile, testSource);
		edit(testFile, 2, new Position(1, 4), new Position(1, 15), "Test");
		edit(testFile, 3, new Position(2, 4), new Position(2, 8), "Foo");
		assertEquals("Couldn't resolve reference to TypeDeclaration 'Foo'.",
				Iterables.getFirst(getDiagnostics().get(testFile), null).getMessage());
		
		// diagnostics revert after a dirty source is closed without saving.
		close(testFile);
		assertEquals("Couldn't resolve reference to TypeDeclaration 'NonExisting'.",
				Iterables.getFirst(getDiagnostics().get(testFile), null).getMessage());
	}

	@Test
	public void testReferenceInPersistedDocument() {
		String testSource = 
				"type Test {\n" +
						"    Foo foo\n" +
				"}\n";
		String testFile = writeFile("MyType1.testlang",
				testSource);
		String fooBarSource = "type Foo {}\n";
		String fooBarFile = writeFile("MyType2.testlang", fooBarSource);
		initialize();
		Assert.assertNull(Iterables.getFirst(getDiagnostics().get(testFile), null));
		Assert.assertNull(Iterables.getFirst(getDiagnostics().get(fooBarFile), null));
		open(fooBarFile, fooBarSource);
		
		// break reference in persisted source - diagnostic doesn't appear until after save.
		edit(fooBarFile, 2, new Position(0, 5), new Position(0, 8), "Bar");
		Assert.assertNull(Iterables.getFirst(getDiagnostics().get(testFile), null));
		save(fooBarFile);
		assertEquals("Couldn't resolve reference to TypeDeclaration 'Foo'.",
				Iterables.getFirst(getDiagnostics().get(testFile), null).getMessage());
		
		// fix reference in persisted source - diagnostic doesn't disappear until after save.
		edit(fooBarFile, 3, new Position(0, 5), new Position(0, 8), "Foo");
		assertEquals("Couldn't resolve reference to TypeDeclaration 'Foo'.",
				Iterables.getFirst(getDiagnostics().get(testFile), null).getMessage());
		save(fooBarFile);
		Assert.assertNull(Iterables.getFirst(getDiagnostics().get(testFile), null));
	}

	@Test
	public void testReferenceInDirtyDocument() {
		String testSource = 
				"type Test {\n" +
						"    Foo foo\n" +
				"}\n";
		String testFile = writeFile("MyType1.testlang",
				testSource);
		String fooBarSource = "type Foo {}\n";
		String fooBarFile = writeFile("MyType2.testlang", fooBarSource);
		initialize();
		Assert.assertNull(Iterables.getFirst(getDiagnostics().get(testFile), null));
		Assert.assertNull(Iterables.getFirst(getDiagnostics().get(fooBarFile), null));
		open(testFile, testSource);
		open(fooBarFile, fooBarSource);
		
		// create new type and refer to it from other source - no diagnostic for dirty source.
		edit(fooBarFile, 2, new Position(0, 5), new Position(0, 8), "Bar");
		edit(testFile, 2, new Position(1, 4), new Position(1, 7), "Bar");
		Assert.assertNull(Iterables.getFirst(getDiagnostics().get(testFile), null));
		
		// save the reference only - diagnostic because the new type is not persisted yet.
		save(testFile);
		assertEquals("Couldn't resolve reference to TypeDeclaration 'Bar'.",
				Iterables.getFirst(getDiagnostics().get(testFile), null).getMessage());
		
		// save the new type - diagnostic disappears.
		save(fooBarFile);
		Assert.assertNull(Iterables.getFirst(getDiagnostics().get(testFile), null));
	}

	@Test
	public void testReferenceToPersistedDocument() {
		String testSource = 
				"type Test {\n" +
						"    Foo foo\n" +
				"}\n";
		String testFile = writeFile("MyType1.testlang",
				testSource);
		String fooBarSource = "type Foo {}\n";
		String fooBarFile = writeFile("MyType2.testlang", fooBarSource);
		initialize();
		Assert.assertNull(Iterables.getFirst(getDiagnostics().get(testFile), null));
		Assert.assertNull(Iterables.getFirst(getDiagnostics().get(fooBarFile), null));
		open(testFile, testSource);
		open(fooBarFile, fooBarSource);
		
		// create new type and refer to it from other source - no diagnostic for dirty source.
		edit(fooBarFile, 2, new Position(0, 5), new Position(0, 8), "Bar");
		edit(testFile, 2, new Position(1, 4), new Position(1, 7), "Bar");
		Assert.assertNull(Iterables.getFirst(getDiagnostics().get(testFile), null));
		
		// save the new type only - no diagnostic for dirty source even though persisted version now refers to a non-existent type.
		save(fooBarFile);
		Assert.assertNull(Iterables.getFirst(getDiagnostics().get(testFile), null));
		
		// close the dirty source without saving - diagnostic appears.
		close(testFile);
		assertEquals("Couldn't resolve reference to TypeDeclaration 'Foo'.",
				Iterables.getFirst(getDiagnostics().get(testFile), null).getMessage());
	}
}
