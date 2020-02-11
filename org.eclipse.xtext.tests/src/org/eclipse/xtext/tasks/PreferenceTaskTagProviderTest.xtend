/*******************************************************************************
 * Copyright (c) 2014 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.tasks

import org.eclipse.xtext.preferences.IPreferenceValuesProvider.SingletonPreferenceValuesProvider
import org.junit.Test

import static org.junit.Assert.*

/**
 * @author Stefan Oehme - Initial contribution and API
 */
class PreferenceTaskTagProviderTest {
	@Test
	def void test() {
		val tags = #[
			new TaskTag => [
				name = "Foo"
				priority = Priority.LOW
			],
			new TaskTag => [
				name = "BAR"
				priority = Priority.NORMAL
			],
			new TaskTag => [
				name = "baZ"
				priority = Priority.HIGH
			]
		]
		val names = PreferenceTaskTagProvider.serializeTags(tags)
		val prios = PreferenceTaskTagProvider.serializePriorities(tags)
		
		val valueProvider = new SingletonPreferenceValuesProvider
		val values = valueProvider.getPreferenceValues(null)

		values.put(PreferenceTaskTagProvider.TAGS_KEY.id, names)
		values.put(PreferenceTaskTagProvider.PRIORITIES_KEY.id, prios)
		values.put(PreferenceTaskTagProvider.CASE_SENSITIVE_KEY.id, "false")

		val tagProvider = new PreferenceTaskTagProvider
		tagProvider.preferenceValuesProvider = valueProvider

		val parsedTags = tagProvider.getTaskTags(null)

		assertEquals(false, parsedTags.caseSensitive)
		assertEquals(tags.size, parsedTags.size)
		for (i : 0 ..< tags.size) {
			assertEquals(tags.get(i), parsedTags.get(i))
		}
	}
}
