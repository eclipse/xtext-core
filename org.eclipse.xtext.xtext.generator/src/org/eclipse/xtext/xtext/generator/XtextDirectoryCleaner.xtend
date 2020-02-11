/*******************************************************************************
 * Copyright (c) 2015, 2017 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.xtext.generator

import com.google.inject.Inject
import com.google.inject.Injector
import java.io.File
import java.util.List
import org.eclipse.emf.mwe.utils.DirectoryCleaner
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtext.xtext.generator.model.project.IXtextProjectConfig

/**
 * This component cleans all directories for generated code according to the project configuration
 * (usually 'src-gen' for plain layout and 'src/main/xtext-gen' for Maven/Gradle layout).
 * 
 * @noextend This class should not be extended by clients.
 */
class XtextDirectoryCleaner implements IGuiceAwareGeneratorComponent {
	
	@Inject IXtextProjectConfig config

	@Accessors(PUBLIC_SETTER)
	boolean enabled = true
	
	@Accessors(PUBLIC_SETTER)
	boolean useDefaultExcludes = true
	
	List<String> excludes = newArrayList
	List<String> extraDirectories = newArrayList

	def void addExtraDirectory(String directory) {
		extraDirectories += directory
	}

	def void addExclude(String exclude) {
		excludes += exclude
	}

	def void clean() {
		if (!enabled)
			return;
			
		val directories = newArrayList
		directories += (config.enabledProjects.map[srcGen] + #[config.runtime.ecoreModel]).filterNull.map[path].filter[new File(it).isDirectory]
		directories += extraDirectories
		
		val delegate = new DirectoryCleaner
		delegate.useDefaultExcludes = useDefaultExcludes
		excludes.forEach[delegate.addExclude(it)]

		directories.forEach[delegate.cleanFolder(it)]
	}
	
	override initialize(Injector injector) {
		injector.injectMembers(this)
	}
	
}
