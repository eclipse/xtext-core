/*******************************************************************************
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.xtext.generator

import com.google.inject.Guice
import com.google.inject.Injector
import org.eclipse.xtext.xtext.generator.model.project.StandardProjectConfig
import org.junit.Assert
import org.junit.Before
import org.junit.Test

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
class WizardConfigTest {
	
	var Injector injector
	
	@Before def void createInjector() {
		injector = Guice.createInjector(new DefaultGeneratorModule)
	}
	
	@Test def void testMavenProjectNames() {
		val cfg = new StandardProjectConfig() => [
			baseName = 'com.acme'
			mavenLayout = true
			runtimeTest.enabled = true
			eclipsePlugin.enabled = true
			eclipsePluginTest.enabled = true
		]
		cfg.initialize(injector)
		Assert.assertEquals('com.acme', cfg.runtimeTest.name)
		Assert.assertEquals('com.acme.ui', cfg.eclipsePluginTest.name)
	}
	
	@Test def void testPlainProjectNames() {
		val cfg = new StandardProjectConfig() => [
			baseName = 'com.acme'
			runtimeTest.enabled = true
			eclipsePlugin.enabled = true
			eclipsePluginTest.enabled = true
		]
		cfg.initialize(injector)
		Assert.assertEquals('com.acme.tests', cfg.runtimeTest.name)
		Assert.assertEquals('com.acme.ui.tests', cfg.eclipsePluginTest.name)
	}
	
}