/*******************************************************************************
 * Copyright (c) 2018 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.naming

import com.google.inject.Inject
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.naming.IQualifiedNameConverter
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.naming.QualifiedName

/**
 * Default implementation for {@link ICopyQualifiedNameService}. Clients might use this implementation as base class.
 * 
 * @author Anton Kosyakov - Initial contribution and API
 * @author Arne Deutsch - Moved to new package
 * @since 2.14
 */
class DefaultCopyQualifiedNameService implements ICopyQualifiedNameService {

	@Inject
	IQualifiedNameProvider qualifiedNameProvider

	@Inject
	IQualifiedNameConverter qualifiedNameConverter

	def dispatch getQualifiedName(EObject it, EObject context) {
		toFullyQualifiedName
	}

	def dispatch getQualifiedName(EObject it, Void context) {
		toFullyQualifiedName
	}

	def protected dispatch getQualifiedName(Void it, EObject context) {
		null
	}

	def protected dispatch getQualifiedName(Void it, Void context) {
		null
	}

	def protected <T> toQualifiedNames(List<T> it, (T)=>String toQualifiedNameFunction) {
		if (it === null || size == 0) {
			return ""
		}
		'''�FOR element : it SEPARATOR ', '��toQualifiedNameFunction.apply(element)��ENDFOR�'''
	}

	def protected toFullyQualifiedName(EObject it) {
		if (eIsProxy) {
			return null
		}
		toString(fullyQualifiedName)
	}

	def protected getFullyQualifiedName(EObject it) {
		if (it === null) {
			return null
		}
		qualifiedNameProvider.getFullyQualifiedName(it)
	}

	def protected toString(EObject it, QualifiedName fullyQualifiedName) {
		if (fullyQualifiedName === null) {
			return null
		}
		qualifiedNameConverter.toString(fullyQualifiedName)
	}

}
