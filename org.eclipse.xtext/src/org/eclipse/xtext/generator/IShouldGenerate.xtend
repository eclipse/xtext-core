/*******************************************************************************
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.generator

import com.google.common.annotations.Beta
import com.google.inject.ImplementedBy
import com.google.inject.Inject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.diagnostics.Severity
import org.eclipse.xtext.util.CancelIndicator
import org.eclipse.xtext.validation.CheckMode
import org.eclipse.xtext.validation.IResourceValidator
import com.google.inject.Singleton

/**
 * @author Sven Efftinge - Initial contribution and API
 * 
 * @since 2.9
 */
@Beta
@ImplementedBy(OnlyWithoutErrors)
interface IShouldGenerate {
	
	/**
	 * whether code should be generated for this resource.
	 */
	def boolean shouldGenerate(Resource resource, CancelIndicator cancelIndicator);
	
	@Beta
	@Singleton
	static class OnlyWithoutErrors implements IShouldGenerate {
		
		@Inject IResourceValidator resourceValidator
		
		override shouldGenerate(Resource resource, CancelIndicator cancelIndicator) {
			if (!resource.errors.isEmpty)
				return false
			val issues = resourceValidator.validate(resource, CheckMode.NORMAL_AND_FAST, cancelIndicator)
			return !issues.exists[severity == Severity.ERROR]
		}
		
	}
	@Beta
	@Singleton
	static class Always implements IShouldGenerate {
		
		override shouldGenerate(Resource resource, CancelIndicator cancelIndicator) {
			return true
		}
		
	}
}