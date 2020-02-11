/*******************************************************************************
 * Copyright (c) 2009 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.generator.parser.ex.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.xtext.xtext.generator.parser.antlr.KeywordHelper;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Heiko Behrens - Initial contribution and API
 */
public class KeywordHelperTest extends Assert {

	@Test public void testKeywordComparatorOnList() throws Exception {
		List<String> keywords = new ArrayList<String>();
		keywords.add("AAA");
		keywords.add("BBBB");
		keywords.add("AAAA");
		keywords.add("CC");
		Collections.sort(keywords, KeywordHelper.keywordComparator);
		assertEquals("AAAA", keywords.get(0));
		assertEquals("BBBB", keywords.get(1));
		assertEquals("AAA", keywords.get(2));
		assertEquals("CC", keywords.get(3));
	}
	
	@Test public void testKeyComparatorIsolated() throws Exception {
		assertTrue( KeywordHelper.keywordComparator.compare("A", "B")  < 0);
		assertTrue( KeywordHelper.keywordComparator.compare("B", "A")  > 0);
		assertTrue( KeywordHelper.keywordComparator.compare("AA", "A") < 0);
		assertTrue( KeywordHelper.keywordComparator.compare("A", "AA") > 0);
	}
}
