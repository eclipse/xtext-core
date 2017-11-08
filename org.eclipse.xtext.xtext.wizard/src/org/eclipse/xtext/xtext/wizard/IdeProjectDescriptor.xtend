/*******************************************************************************
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.xtext.wizard

import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor

import static org.eclipse.xtext.xtext.wizard.ExternalDependency.*

@FinalFieldsConstructor
class IdeProjectDescriptor extends ProjectDescriptor {
	
	override getNameQualifier() {
		".ide"
	}

	override getUpstreamProjects() {
		#{config.runtimeProject}
	}
	
	override isEclipsePluginProject() {
		config.preferredBuildSystem == BuildSystem.NONE || config.uiProject.enabled
	}
	
	override isPartOfGradleBuild() {
		true
	}
	
	override isPartOfMavenBuild() {
		true
	}
	
	override getExternalDependencies() {
		val deps = newLinkedHashSet
		deps += super.externalDependencies
		deps += createXtextDependency("org.eclipse.xtext.ide")
		deps += createXtextDependency("org.eclipse.xtext.xbase.ide")
		deps
	}
	
	override pom() {
		super.pom => [
			buildSection = '''
				�IF config.languageServer!=LanguageServer.NONE && isEclipsePluginProject�
					<dependencies>
						<dependency>
							<groupId>log4j</groupId>
							<artifactId>log4j</artifactId>
							<version>1.2.16</version>
						</dependency>
						<dependency>
							<groupId>org.eclipse.lsp4j</groupId>
							<artifactId>org.eclipse.lsp4j</artifactId>
							<version>0.2.1</version>
						</dependency>
						<dependency>
							<groupId>org.ow2.asm</groupId>
							<artifactId>asm</artifactId>
							<version>5.0.1</version>
						</dependency>
						<dependency>
							<groupId>org.ow2.asm</groupId>
							<artifactId>asm-commons</artifactId>
							<version>5.0.1</version>
						</dependency>
						<dependency>
							<groupId>org.ow2.asm</groupId>
							<artifactId>asm-tree</artifactId>
							<version>5.0.1</version>
						</dependency>
					</dependencies>
				�ENDIF�
				<build>
					�IF !isEclipsePluginProject && config.sourceLayout == SourceLayout.PLAIN�
						<sourceDirectory>�Outlet.MAIN_JAVA.sourceFolder�</sourceDirectory>
						<resources>
							<resource>
								<directory>�Outlet.MAIN_RESOURCES.sourceFolder�</directory>
								<excludes>
									<exclude>**/*.java</exclude>
									<exclude>**/*.xtend</exclude>
								</excludes>
							</resource>
						</resources>
					�ENDIF�
					<plugins>
						<plugin>
							<groupId>org.eclipse.xtend</groupId>
							<artifactId>xtend-maven-plugin</artifactId>
						</plugin>
						�IF !isEclipsePluginProject�
							<plugin>
								<groupId>org.codehaus.mojo</groupId>
								<artifactId>build-helper-maven-plugin</artifactId>
								<version>1.9.1</version>
								<executions>
									<execution>
										<id>add-source</id>
										<phase>initialize</phase>
										<goals>
											<goal>add-source</goal>
											<goal>add-resource</goal>
										</goals>
										<configuration>
											<sources>
												<source>�Outlet.MAIN_SRC_GEN.sourceFolder�</source>
											</sources>
											<resources>
												<resource>
													<directory>�Outlet.MAIN_SRC_GEN.sourceFolder�</directory>
													<excludes>
														<exclude>**/*.java</exclude>
														<exclude>**/*.g</exclude>
													</excludes>
												</resource>
											</resources>
										</configuration>
									</execution>
								</executions>
							</plugin>
						�ENDIF�
						�IF config.languageServer!=LanguageServer.NONE�
							�IF isEclipsePluginProject�
								<plugin>
									<groupId>org.eclipse.tycho</groupId>
									<artifactId>target-platform-configuration</artifactId>
									<configuration>
										<pomDependencies>consider</pomDependencies>
									</configuration>
								</plugin>
								<plugin>
									<groupId>org.apache.maven.plugins</groupId>
									<artifactId>maven-dependency-plugin</artifactId>
									<version>3.0.1</version>
									<executions>
										<execution>
											<id>copy-dependencies</id>
											<phase>package</phase>
											<goals>
												<goal>copy-dependencies</goal>
											</goals>
											<configuration>
												<outputDirectory>${project.build.directory}/libs</outputDirectory>
												<overWriteReleases>false</overWriteReleases>
												<overWriteSnapshots>false</overWriteSnapshots>
												<overWriteIfNewer>true</overWriteIfNewer>
												<excludeTransitive>true</excludeTransitive>
												<excludeArtifactIds>
													com.ibm.icu,
													org.apache.ant,
													org.apache.commons.lang,
													org.apache.commons.logging,
													org.eclipse.core.commands,
													org.eclipse.core.contenttype,
													org.eclipse.core.expressions,
													org.eclipse.core.filesystem,
													org.eclipse.core.jobs,
													org.eclipse.core.resources,
													org.eclipse.core.runtime,
													org.eclipse.core.variables,
													org.eclipse.debug.core,
													org.eclipse.emf.codegen.ecore,
													org.eclipse.emf.codegen,
													org.eclipse.emf.mwe.core,
													org.eclipse.emf.mwe.utils,
													org.eclipse.emf.mwe2.lib,
													org.eclipse.emf.mwe2.runtime,
													org.eclipse.equinox.app,
													org.eclipse.equinox.preferences,
													org.eclipse.equinox.registry,
													org.eclipse.jdt.core,
													org.eclipse.jdt.debug,
													org.eclipse.jdt.launching,
													org.eclipse.text,
													org.eclipse.xtend.typesystem.emf,
													org.eclipse.xtend,
												</excludeArtifactIds>
											</configuration>
										</execution>
									</executions>
								</plugin>
								<plugin>
									<groupId>com.googlecode.addjars-maven-plugin</groupId>
									<artifactId>addjars-maven-plugin</artifactId>
									<version>1.0.5</version>
									<executions>
										<execution>
											<phase>package</phase>
											<goals>
												<goal>add-jars</goal>
											</goals>
											<configuration>
												<resources>
													<resource>
														<directory>${project.build.directory}/libs</directory>
													</resource>
												</resources>
											</configuration>
										</execution>
									</executions>
								</plugin>
							�ENDIF�
							�IF config.languageServer==LanguageServer.FATJAR�
								<plugin>
									<groupId>org.apache.maven.plugins</groupId>
									<artifactId>maven-shade-plugin</artifactId>
									<version>3.0.0</version>
									<configuration>
										<transformers>
											<transformer
												implementation="org.apache.maven.plugins.shade.resource.ManifestResourceTransformer">
												<mainClass>org.eclipse.xtext.ide.server.ServerLauncher</mainClass>
											</transformer>
											<transformer
												implementation="org.apache.maven.plugins.shade.resource.AppendingTransformer">
												<resource>plugin.properties</resource>
											</transformer>
										</transformers>
										�IF isEclipsePluginProject�
											<artifactSet>
												<excludes><!-- avoid duplicate inclusion due to addjars plugin -->
													<exclude>*:�config.ideProject.name�-org.eclipse.lsp4j*</exclude>
													<exclude>*:�config.ideProject.name�-org.eclipse.xtext.xbase.lib*</exclude>
													<exclude>*:�config.ideProject.name�-org.eclipse.xtend.lib*</exclude>
													<exclude>*:�config.ideProject.name�-com.google.guava*</exclude>
													<exclude>*:�config.ideProject.name�-asm*</exclude>
													<exclude>*:�config.ideProject.name�-log4j*</exclude>
													<exclude>*:�config.ideProject.name�-org.objectweb.asm*</exclude>
													<exclude>*:�config.ideProject.name�-org.apache.log4j*</exclude>
												</excludes>
											</artifactSet>
										�ENDIF�
										<filters>
											<filter>
												<artifact>*:*</artifact>
												<excludes>
													<exclude>META-INF/INDEX.LIST</exclude>
													<exclude>META-INF/*.SF</exclude>
													<exclude>META-INF/*.DSA</exclude>
													<exclude>META-INF/*.RSA</exclude>
													<exclude>.options</exclude>
													<exclude>.api_description</exclude>
													<exclude>*.profile</exclude>
													<exclude>*.html</exclude>
													<exclude>about.*</exclude>
													<exclude>about_files/*</exclude>
													<exclude>plugin.xml</exclude>
													<exclude>modeling32.png</exclude>
													<exclude>systembundle.properties</exclude>
													<exclude>profile.list</exclude>
													<exclude>**/*._trace</exclude>
													<exclude>**/*.g</exclude>
													<exclude>**/*.mwe2</exclude>
													<exclude>**/*.xtext</exclude>
												</excludes>
											</filter>
										</filters>
										<shadedArtifactAttached>true</shadedArtifactAttached>
										<shadedClassifierName>ls</shadedClassifierName>
										<minimizeJar>false</minimizeJar>
									</configuration>
									<executions>
										<execution>
											<phase>package</phase>
											<goals>
												<goal>shade</goal>
											</goals>
										</execution>
									</executions>
								</plugin>
							�ENDIF�
						�ENDIF�
						�IF config.languageServer==LanguageServer.APP�
							<plugin>
								<groupId>org.codehaus.mojo</groupId>
								<artifactId>appassembler-maven-plugin</artifactId>
								<version>1.10</version>
								<executions>
									<execution>
										<phase>package</phase>
										<goals>
											<goal>assemble</goal>
										</goals>
										<configuration>
											<assembleDirectory>${project.build.directory}/languageserver</assembleDirectory>
											<repositoryLayout>flat</repositoryLayout>
											<useWildcardClassPath>true</useWildcardClassPath>
											<!-- uncomment to enable remote debugging
											<extraJvmArguments>-Xdebug -Xnoagent -Djava.compiler=NONE -Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=8000</extraJvmArguments>
											-->
											<programs>
												<program>
													<id>mydsl-ls</id>
													<mainClass>org.eclipse.xtext.ide.server.ServerLauncher</mainClass>
													<!-- uncomment to enable options
													<commandLineArguments>
														<commandLineArgument>-trace</commandLineArgument>
														<commandLineArgument>-log</commandLineArgument>
														<commandLineArgument>-noValidate</commandLineArgument>
													</commandLineArguments>
													-->
												</program>
											</programs>
										</configuration>
									</execution>
								</executions>
							</plugin>
						�ENDIF�
					</plugins>
				</build>
			'''
			packaging = if (isEclipsePluginProject) "eclipse-plugin" else "jar"
		]
	}

	override buildGradle() {
		super.buildGradle => [
			pluginsSection = '''
				�IF config.languageServer === LanguageServer.FATJAR�
					plugins {
						id 'com.github.johnrengelman.shadow' version '2.0.0'
					}
					
				�ENDIF�
			'''
			additionalContent = '''
				�IF config.languageServer !== LanguageServer.NONE�
					
					apply plugin: 'application'
					�IF config.languageServer === LanguageServer.FATJAR�
						apply plugin: 'com.github.johnrengelman.shadow'
					�ENDIF�
					mainClassName = "org.eclipse.xtext.ide.server.ServerLauncher"
					
					�IF config.languageServer === LanguageServer.FATJAR�
						shadowJar {
							from(project.convention.getPlugin(JavaPluginConvention).sourceSets.main.output)
							configurations = [project.configurations.runtime]
							exclude('META-INF/INDEX.LIST', 'META-INF/*.SF', 'META-INF/*.DSA', 'META-INF/*.RSA','schema/*',
								'.options', '.api_description', '*.profile', '*.html', 'about.*', 'about_files/*',
								'plugin.xml', 'modeling32.png', 'systembundle.properties', 'profile.list')
							classifier = 'ls'
							append('plugin.properties')
						}
					�ENDIF�
				�ENDIF�
			'''
		]
	}

}