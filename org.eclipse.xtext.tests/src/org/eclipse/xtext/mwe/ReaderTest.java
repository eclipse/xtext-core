/*******************************************************************************
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.mwe;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.xtext.index.IndexTestLanguageStandaloneSetup;
import org.eclipse.xtext.index.indexTestLanguage.Datatype;
import org.eclipse.xtext.index.indexTestLanguage.Entity;
import org.junit.Test;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;

/**
 * @author Jan Koehnlein - Initial contribution and API
 */
public class ReaderTest extends AbstractReaderTest {

	@Override
	protected SlotEntry createSlotEntry() {
		return new SlotEntry();
	}
	
	@Test public void testLoadOne() throws Exception {
		Reader reader = getReader();
		reader.addPath(pathTo("emptyFolder"));
		reader.addPath(pathTo("nonemptyFolder"));
		reader.addRegister(new IndexTestLanguageStandaloneSetup());

		SlotEntry entry = createSlotEntry();
		entry.setName("foo:bar:Person");
		entry.setFirstOnly(true);
		entry.setNamespaceDelimiter(":");

		reader.addLoad(entry);
		WorkflowContext ctx = ctx();
		reader.invoke(ctx, monitor(), issues());
		assertEquals("Person", ((Entity) ctx.get("model")).getName());
	}

	@Test public void testLoadTwo() throws Exception {
		Reader reader = getReader();
		reader.addPath(pathTo("emptyFolder"));
		reader.addPath(pathTo("nonemptyFolder"));
		reader.addRegister(new IndexTestLanguageStandaloneSetup());
		SlotEntry entry = createSlotEntry();
		entry.setSlot("person");
		entry.setName("foo.bar.Person");
		entry.setNamespaceDelimiter(".");
		entry.setFirstOnly(true);
		SlotEntry entry2 = createSlotEntry();
		entry2.setSlot("string");
		entry2.setName("foo.bar.sub.String");
		entry2.setNamespaceDelimiter(".");
		entry2.setFirstOnly(true);
		reader.addLoad(entry);
		reader.addLoad(entry2);
		WorkflowContext ctx = ctx();
		Issues issues = issues();
		try {
			reader.invoke(ctx, monitor(), issues);
		} catch (Exception e) {
			System.out.println(issues);
			throw e;
		}
		assertEquals("Person", ((Entity) ctx.get("person")).getName());
		assertEquals("String", ((Datatype) ctx.get("string")).getName());
	}

	@SuppressWarnings("unchecked")
	@Test public void testLoadAll() throws Exception {
		Reader reader = getReader();
		reader.addPath(pathTo("emptyFolder"));
		reader.addPath(pathTo("nonemptyFolder"));
		reader.addRegister(new IndexTestLanguageStandaloneSetup());
		SlotEntry entry = createSlotEntry();
		reader.addLoad(entry);
		
		WorkflowContext ctx = ctx();
		reader.invoke(ctx, monitor(), issues());
		List<EObject> elements = (List<EObject>) ctx.get("model");
		assertEquals(8,elements.size());
	}

	@SuppressWarnings("unchecked")
	@Test public void testShadowingPathes() throws Exception {
		Reader reader = getReader();
		// also test adding multiple paths as comma-separated list, see bug#356750
		reader.addPath(
			       pathTo("shadowingtest/folder 1")
			+","  +pathTo("shadowingtest/folder 2")
			+" , "+pathTo("shadowingtest/folder 3"));
		reader.addRegister(new IndexTestLanguageStandaloneSetup());
		SlotEntry entry = createSlotEntry();
		entry.setType("Entity");
		reader.addLoad(entry);
		SlotEntry entry2 = createSlotEntry();
		entry2.setType("Datatype");
		entry2.setSlot("stringTypes");
		entry2.setName("String");
		reader.addLoad(entry2);
		SlotEntry entry3 = createSlotEntry();
		entry3.setType("Datatype");
		entry3.setSlot("booleanTypes");
		entry3.setName("Boolean");
		reader.addLoad(entry3);
		
		WorkflowContext ctx = ctx();
		Issues issues = issues();
		try {
			reader.invoke(ctx, monitor(), issues);
		} catch (Exception e) {
			System.out.println(issues);
			throw e;
		}
		List<Entity> entities = (List<Entity>) ctx.get(entry.getSlot());
		List<Datatype> stringTypes = (List<Datatype>) ctx.get(entry2.getSlot());
		List<Datatype> booleanTypes = (List<Datatype>) ctx.get(entry3.getSlot());
		
		assertEquals(3,entities.size());
		assertEquals(2,stringTypes.size());
		assertEquals(2,booleanTypes.size());
		
		Entity ent1 = Iterables.find(entities, getPredicate("1"));
		Entity ent2 = Iterables.find(entities, getPredicate("2"));
		Entity ent3 = Iterables.find(entities, getPredicate("3"));
		Datatype string2 = Iterables.find(stringTypes, getPredicate("2"));
		Datatype string3 = Iterables.find(stringTypes, getPredicate("3"));
		Datatype bool1 = Iterables.find(booleanTypes, getPredicate("1"));
		Datatype bool2 = Iterables.find(booleanTypes, getPredicate("2"));
		
		assertEquals(string2,ent1.getProperties().get(0).getType());
		assertEquals(bool1, ent1.getProperties().get(1).getType());
		assertEquals(ent1,ent1.getProperties().get(2).getType());

		assertEquals(string2,ent2.getProperties().get(0).getType());
		assertEquals(bool2, ent2.getProperties().get(1).getType());
		assertEquals(ent2,ent2.getProperties().get(2).getType());
		
		assertEquals(string3,ent3.getProperties().get(0).getType());
		assertEquals(bool1, ent3.getProperties().get(1).getType());
		assertEquals(ent3,ent3.getProperties().get(2).getType());
		
	}
	
	protected Predicate<EObject> getPredicate(final String uriContains) {
		return new Predicate<EObject>() {
			@Override
			public boolean apply(EObject input) {
				return input.eResource().getURI().toString().contains("folder%20"+uriContains);
			}
		};
	}
}
