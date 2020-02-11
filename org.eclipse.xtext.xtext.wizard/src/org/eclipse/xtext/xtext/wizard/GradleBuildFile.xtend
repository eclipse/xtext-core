/*******************************************************************************
 * Copyright (c) 2015, 2016 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.xtext.wizard

import org.eclipse.xtext.xtext.wizard.TextFile
import org.eclipse.xtend.lib.annotations.Accessors

class GradleBuildFile extends TextFile {
	@Accessors String pluginsSection = ""
	@Accessors String additionalContent = ""
	
	new(ProjectDescriptor project) {
		super(Outlet.ROOT, "build.gradle", project)
	}
	
	override getContent() {
		'''
			�pluginsSection�
			�IF !allDependencies.isEmpty�
				dependencies {
					�FOR p : project.upstreamProjects�
						compile project(':�p.name�')
					�ENDFOR�
					�FOR dep : mavenDependencies�
						�IF dep.version !== null�
							�dep.scope.gradleNotation� "�dep.groupId�:�dep.artifactId�:�dep.version�"
						�ELSE�
							�dep.scope.gradleNotation� '�dep.groupId�:�dep.artifactId�'
						�ENDIF�
					�ENDFOR�
				}
			�ENDIF�
			�additionalContent�
			�IF project.isEclipsePluginProject�
				//this is an eclipse plugin project
				eclipseClasspath.enabled=false
				cleanEclipseClasspath.enabled=false
			�ENDIF�
		'''
	}
	
	private def getMavenDependencies() {
		project.externalDependencies.map[maven].filter[artifactId !== null]
	}
	
	private def getAllDependencies() {
		project.upstreamProjects + mavenDependencies
	}
	
}
