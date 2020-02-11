/*******************************************************************************
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.xtext.generator.types

import com.google.inject.Inject
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtext.scoping.IGlobalScopeProvider
import org.eclipse.xtext.xtext.generator.AbstractXtextGeneratorFragment
import org.eclipse.xtext.xtext.generator.model.GuiceModuleAccess
import org.eclipse.xtext.xtext.generator.util.BooleanGeneratorOption
import org.eclipse.xtext.xtext.generator.xbase.XbaseUsageDetector

import static extension org.eclipse.xtext.xtext.generator.model.TypeReference.*

class TypesGeneratorFragment2 extends AbstractXtextGeneratorFragment {
	
	@Inject XbaseUsageDetector xbaseUsageDetector
	
	@Accessors(PUBLIC_GETTER)
	val onlyEnabledIfGrammarIsUsed = new BooleanGeneratorOption(false)
	
	def void setOnlyEnabledIfGrammarIsUsed(boolean onlyEnabledIfGrammarIsUsed) {
		this.onlyEnabledIfGrammarIsUsed.set(onlyEnabledIfGrammarIsUsed)
	}
	
	override generate() {
		if (onlyEnabledIfGrammarIsUsed.get && !xbaseUsageDetector.inheritsXtype(language.grammar)) {
			return;
		}
		new GuiceModuleAccess.BindingFactory()
			.addTypeToType(IGlobalScopeProvider.typeRef,
					'org.eclipse.xtext.common.types.xtext.TypesAwareDefaultGlobalScopeProvider'.typeRef)
			.contributeTo(language.runtimeGenModule)
		language.runtimeGenModule.superClass = 'org.eclipse.xtext.common.types.DefaultCommonTypesRuntimeModule'.typeRef
		
		new GuiceModuleAccess.BindingFactory()
			// overrides binding from org.eclipse.xtext.xtext.generator.exporting.QualifiedNamesFragment2
			.addTypeToType("org.eclipse.xtext.ui.editor.contentassist.PrefixMatcher".typeRef,
		 			'org.eclipse.xtext.ui.editor.contentassist.FQNPrefixMatcher'.typeRef)
			.contributeTo(language.eclipsePluginGenModule)
		language.eclipsePluginGenModule.superClass = 'org.eclipse.xtext.common.types.ui.DefaultCommonTypesUiModule'.typeRef
		
		if (projectConfig.runtime.manifest !== null) {
			projectConfig.runtime.manifest.requiredBundles.addAll(
				'org.eclipse.xtext.common.types',
				'org.objectweb.asm;bundle-version="[7.2.0,7.3.0)";resolution:=optional'
			)
		}
		
		if (projectConfig.runtimeTest.manifest !== null) {
			projectConfig.runtimeTest.manifest.requiredBundles.add(
				'org.objectweb.asm;bundle-version="[7.2.0,7.3.0)";resolution:=optional'
			)
		}
		
		if (projectConfig.eclipsePlugin.manifest !== null) {
			projectConfig.eclipsePlugin.manifest.requiredBundles.add(
				'org.eclipse.xtext.common.types.ui'
			)
		}
	}
	
}