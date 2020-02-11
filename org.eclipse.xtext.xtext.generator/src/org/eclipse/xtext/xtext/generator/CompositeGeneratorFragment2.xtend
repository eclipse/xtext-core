/*******************************************************************************
 * Copyright (c) 2015, 2017 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.xtext.generator

import com.google.inject.Injector
import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * A generator fragment that delegates to a list of contained fragments. This can be
 * useful for extracting parts of a language configuration to a separate mwe2 file,
 * for example.
 */
class CompositeGeneratorFragment2 implements IXtextGeneratorFragment {

	@Accessors(PROTECTED_GETTER)
	val List<IXtextGeneratorFragment> fragments = newArrayList

	def void addFragment(IXtextGeneratorFragment fragment) {
		if (fragment === this)
			throw new IllegalArgumentException
		this.fragments.add(fragment)
	}

	override checkConfiguration(Issues issues) {
		for (fragment : fragments) {
			fragment.checkConfiguration(issues)
		}
	}

	override generate() {
		val composite = new CompositeGeneratorException
		for (fragment : fragments) {
			try {
				fragment.generate
			} catch (Exception e) {
				composite.addException(e)
			}
		}
		if (composite.hasExceptions) {
			throw composite
		}
	}

	override initialize(Injector injector) {
		for (fragment : fragments) {
			fragment.initialize(injector)
		}
	}
}
