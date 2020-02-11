/*******************************************************************************
 * Copyright (c) 2015, 2017 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.xtext.generator.model

import com.google.common.base.Splitter
import java.util.Collections
import java.util.List
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.EqualsHashCode
import org.eclipse.xtext.xtext.generator.IXtextGeneratorLanguage
import org.eclipse.xtext.xtext.generator.util.GenModelUtil2
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor

/**
 * Reference to a Java type. Use this for automatic import of types in {@link JavaFileAccess}
 * and {@link XtendFileAccess}.
 */
@Accessors
@EqualsHashCode
class TypeReference {
	
	static def TypeReference typeRef(String name, TypeReference... arguments) {
		new TypeReference(name, arguments)
	}

	/**
	 * @deprecated this method is available for backwards compatibility reasons
	 */
	@Deprecated
	static def TypeReference guessTypeRef(String name, TypeReference... arguments) {
		new TypeReference(name, arguments, false)
	}
	
	static def TypeReference typeRef(Class<?> clazz, TypeReference... arguments) {
		new TypeReference(clazz, arguments)
	}
	
	static def TypeReference typeRef(EClass clazz, IXtextGeneratorLanguage language) {
		new TypeReference(clazz, language.resourceSet)
	}
	
	val String packageName
	
	val List<String> simpleNames
	
	val List<TypeReference> typeArguments
	
	new(String qualifiedName) {
		this(qualifiedName, null as List<TypeReference>)
	}

	new(String qualifiedName, List<TypeReference> arguments) {
		this(qualifiedName, arguments, true)
	}
	
	private new(String qualifiedName, List<TypeReference> arguments, boolean strict) {
		this(getPackageName(qualifiedName, strict), getClassName(qualifiedName, strict), arguments)
	}
	
	new(String packageName, String className) {
		this(packageName, className, null)
	}
	
	new(String packageName, String className, List<TypeReference> arguments) {
		if (packageName === null)
			throw new IllegalArgumentException('Invalid package name: ' + packageName)
		if (className === null)
			throw new IllegalArgumentException('Invalid class name: ' + className)
		this.packageName = packageName
		this.simpleNames = className.split('\\.')
		this.typeArguments = arguments ?: Collections.emptyList
	}
	
	new(Class<?> clazz) {
		this(clazz, null)
	}
	
	new(Class<?> clazz, List<TypeReference> arguments) {
		if (clazz.primitive)
			throw new IllegalArgumentException('Type is primitive: ' + clazz.name)
		if (clazz.anonymousClass)
			throw new IllegalArgumentException('Class is anonymous: ' + clazz.name)
		if (clazz.localClass)
			throw new IllegalArgumentException('Class is local: ' + clazz.name)
		this.packageName = clazz.package.name
		this.simpleNames = newArrayList
		this.typeArguments = arguments ?: Collections.emptyList
		var c = clazz
		do {
			simpleNames.add(0, c.simpleName)
			c = c.declaringClass
		} while (c !== null)
	}
	
	new(EClass clazz, ResourceSet resourceSet) {
		// the qualified name might be a nested type, e.g. jav.util.Map.Entry
		// see https://bugs.eclipse.org/bugs/show_bug.cgi?id=483088
		this(getQualifiedName(clazz, resourceSet))
	}
	
	new(QualifiedClassName qualifiedClazzName) {
		this(qualifiedClazzName.packageName, qualifiedClazzName.className, null)
	}
	
	new(EPackage epackage, ResourceSet resourceSet) {
		this(getQualifiedName(epackage, resourceSet))
	}
	
	private static def getPackageName(String qualifiedName, boolean strict) {
		val segments = Splitter.on('.').split(qualifiedName).toList
		if (segments.size == 1)
			return ""
		if (strict) {
			val packageSegments = segments.subList(0, segments.length -1)
			if (!packageSegments.filter[Character.isUpperCase(charAt(0))].isEmpty)
				throw new IllegalArgumentException("Cannot determine the package name of '" + qualifiedName + "'. Please use the TypeReference(packageName, className) constructor")
			return packageSegments.join(".")
		} else {
			var packageSegments = segments.subList(0, segments.length -1)
			while(!packageSegments.isEmpty) {
				if (Character.isUpperCase(packageSegments.last.charAt(0))) {
					packageSegments = packageSegments.subList(0, packageSegments.length -1)
				} else {
					return packageSegments.join(".") 
				}
			}
			return ""
		}
	}
	
	private static def getClassName(String qualifiedName, boolean strict) {
		val packageName = qualifiedName.getPackageName(strict)
		if (packageName.isEmpty)
			qualifiedName
		else
			qualifiedName.substring(packageName.length + 1, qualifiedName.length)
	}
	
	private static def QualifiedClassName getQualifiedName(EClass clazz, ResourceSet resourceSet) {
		if (clazz.EPackage.nsURI == 'http://www.eclipse.org/2008/Xtext') {
			new QualifiedClassName('org.eclipse.xtext', clazz.name)
		} else if (clazz.EPackage.nsURI == 'http://www.eclipse.org/emf/2002/Ecore') {
			if (clazz.instanceTypeName !== null) {
				val itn = clazz.instanceTypeName;
				new QualifiedClassName(itn.substring(0, itn.lastIndexOf('.')),
					itn.substring(itn.lastIndexOf(".") + 1).replace("$", "."))
			} else {
				new QualifiedClassName('org.eclipse.emf.ecore', clazz.name)
			}
		} else {
			if (clazz.instanceTypeName !== null) {
				val itn = clazz.instanceTypeName;
				new QualifiedClassName(itn.substring(0, itn.lastIndexOf('.')),
					itn.substring(itn.lastIndexOf(".") + 1).replace("$", "."))
			} else {
				val genClass = GenModelUtil2.getGenClass(clazz, resourceSet)
				val packageName = genClass.genPackage.getInterfacePackageName();
				new QualifiedClassName(packageName,
					genClass.interfaceName)
			}
		}
	}

	private static def QualifiedClassName getQualifiedName(EPackage epackage, ResourceSet resourceSet) {
		val genPackage = GenModelUtil2.getGenPackage(epackage, resourceSet)
		val packageName = if (genPackage.getGenModel().isSuppressEMFMetaData()) genPackage.getQualifiedPackageClassName() else genPackage.getReflectionPackageName()
		new QualifiedClassName(packageName,
			genPackage.packageInterfaceName)
	}
	
	override toString() {
		name + typeArguments.join('<', ', ', '>', [toString])
	}
	
	def String getName() {
		packageName + '.' + simpleNames.join('.')
	}
	
	def String getSimpleName() {
		simpleNames.last
	}
	
	def String getPath() {
		return packageName.replace('.', '/') + '/' + simpleNames.head
	}
	
	def String getJavaPath() {
		path + ".java"
	}
	
	def String getXtendPath() {
		path + ".xtend"
	}
	
	@FinalFieldsConstructor
	static class QualifiedClassName {
		@Accessors(PUBLIC_GETTER)
		val String packageName
		@Accessors(PUBLIC_GETTER)
		val String className
	}
	
}
