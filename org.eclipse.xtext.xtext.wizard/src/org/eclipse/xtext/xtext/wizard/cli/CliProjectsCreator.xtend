/*******************************************************************************
 * Copyright (c) 2019 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.xtext.wizard.cli

import com.google.common.io.Files
import com.google.common.io.Resources
import java.io.File
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtext.util.Strings
import org.eclipse.xtext.xtext.wizard.BinaryFile
import org.eclipse.xtext.xtext.wizard.ProjectDescriptor
import org.eclipse.xtext.xtext.wizard.ProjectsCreator
import org.eclipse.xtext.xtext.wizard.TextFile
import org.eclipse.xtext.xtext.wizard.WizardConfiguration

class CliProjectsCreator implements ProjectsCreator {
	
	@Accessors String lineDelimiter

	override createProjects(WizardConfiguration config) {
		config.enabledProjects.forEach [
			createProject
		]
	}

	def createProject(ProjectDescriptor project) {
		val projectRoot = new File(project.location)
		projectRoot.mkdirs
		project.files.forEach [
			val projectRelativePath = project.config.sourceLayout.getPathFor(outlet) + "/" + relativePath
			val file = new File(projectRoot, projectRelativePath)
			file.parentFile.mkdirs
			switch(it) {
				TextFile : {
					val normalizedContent = content.replace(Strings.newLine, lineDelimiter)
					Files.asCharSink(file, project.config.encoding).write(normalizedContent)
				}
				BinaryFile: {
					Files.write(Resources.toByteArray(content), file)
				}
			}
			if(executable) {
				file.executable = true
			}
		]
		project.sourceFolders.forEach [
			new File(projectRoot, it.path).mkdirs
		]
	}

}