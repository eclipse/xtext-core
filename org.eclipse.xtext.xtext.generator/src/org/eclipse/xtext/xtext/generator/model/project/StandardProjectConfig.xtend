/*******************************************************************************
 * Copyright (c) 2015, 2017 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.xtext.generator.model.project

import org.eclipse.emf.mwe2.runtime.Mandatory
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtext.xtext.generator.Issues

/**
 * Specialized project configuration that uses standard names and paths. Usually it is sufficient to
 * set the {@code baseName} and {@code rootPath} properties and to enable the required subprojects.
 * 
 * @noextend This class should not be extended by clients.
 */
@Accessors
class StandardProjectConfig extends XtextProjectConfig {

	/** set to {@code true} by the project wizard(s) in case "Maven/Gradle" source layout is selected. */
	boolean mavenLayout
	boolean createEclipseMetaData
	String rootPath
	String baseName

	/**
	 * The base name of the project, which is usually equal to the runtime subproject.
	 */
	@Mandatory
	def setBaseName(String baseName) {
		this.baseName = baseName
	}

	/**
	 * The root path, usually {@code ".."}.
	 */
	@Mandatory
	def setRootPath(String rootPath) {
		this.rootPath = rootPath
	}
	
	override checkConfiguration(Issues issues) {
		super.checkConfiguration(issues)
		if (rootPath === null)
			issues.addError("The property 'rootPath' must be set", this)
		if (baseName === null)
			issues.addError("The property 'baseName' must be set", this)
	}

	override setDefaults() {
		super.setDefaults
		enabledProjects.forEach [
			if (name === null)
				name = computeName
			if (it.rootPath === null)
				root = computeRoot
			if (metaInfPath === null)
				metaInf = computeMetaInf
			if (srcPath === null)
				src = computeSrc
			if (srcGenPath === null)
				srcGen = computeSrcGen
			if (iconsPath === null)
				icons = computeIcons
			if (it instanceof BundleProjectConfig) {
				if (createEclipseMetaData) {
					if (manifest === null)
						manifest = newManifestAccess
					if (pluginXml === null)
						pluginXml = newPluginXmlAccess
				}
			}
			if (it instanceof RuntimeProjectConfig) {
				if (ecoreModelPath === null)
					ecoreModel = computeEcoreModel
			}
			if (it instanceof WebProjectConfig) {
				if (assetsPath === null)
					assets = computeAssets
			}
		]
	}

	protected def computeName(SubProjectConfig project) {
		switch project {
			case runtime: baseName
			case runtimeTest: if (!mavenLayout) baseName + '.tests' else baseName
			case genericIde: baseName + '.ide'
			case eclipsePlugin: baseName + '.ui'
			case eclipsePluginTest: if (!mavenLayout) baseName + '.ui.tests' else baseName + '.ui'
			case ideaPlugin: baseName + '.idea'
			case web: baseName + '.web'
		}
	}

	protected def computeRoot(SubProjectConfig project) {
		rootPath + '/' + project.name
	}

	/**
	 * In case of "Maven/Gradle" source layout the src outlet is named 'src/main/java',
	 * test classes go into 'src/test/java' instead of any dedicated '...tests' project.
	 */
	protected def computeSrc(SubProjectConfig project) {
		project.rootPath + '/' + if(mavenLayout) 'src/' + project.computeSourceSet + '/java' else 'src'
	}

	/**
	 * In case of "Maven/Gradle" source layout the srcGen outlet is named 'src/main/xtext-gen',
	 * test-related srcGen classes go into 'src/test/xtext-gen' instead of any dedicated '...tests' project.
	 * Don't confuse it with 'src/main/xtend-gen'!
	 */
	protected def computeSrcGen(SubProjectConfig project) {
		project.rootPath + '/' + if(mavenLayout) 'src/' + project.computeSourceSet + '/xtext-gen' else 'src-gen'
	}

	protected def computeMetaInf(SubProjectConfig project) {
		project.rootPath + '/' + if(mavenLayout) 'src/' + project.computeSourceSet + '/resources/META-INF' else 'META-INF'
	}

	protected def computeEcoreModel(RuntimeProjectConfig project) {
		project.rootPath + '/' + 'model/generated'
	}

	protected def computeAssets(WebProjectConfig project) {
		project.rootPath + '/' + if(mavenLayout) 'src/' + project.computeSourceSet + '/webapp' else 'WebRoot'
	}

	protected def computeSourceSet(SubProjectConfig project) {
		if(testProjects.contains(project)) 'test' else 'main'
	}
	
	protected def computeIcons(SubProjectConfig project) {
		project.rootPath + '/' + 'icons'
	}

}
		
