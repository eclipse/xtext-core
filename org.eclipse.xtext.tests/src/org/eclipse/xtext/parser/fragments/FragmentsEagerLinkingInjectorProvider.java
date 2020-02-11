/*******************************************************************************
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.parser.fragments;

import org.eclipse.xtext.linking.ILinker;
import org.eclipse.xtext.linking.impl.Linker;
import org.eclipse.xtext.parser.fragments.tests.FragmentTestLanguageInjectorProvider;
import org.eclipse.xtext.resource.XtextResource;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public class FragmentsEagerLinkingInjectorProvider extends FragmentTestLanguageInjectorProvider {

	@Override
	protected Injector internalCreateInjector() {
		return new FragmentTestLanguageStandaloneSetup() {
			@Override
			public Injector createInjector() {
				return Guice.createInjector(new FragmentTestLanguageRuntimeModule() {
					@Override
					public Class<? extends XtextResource> bindXtextResource() {
						return XtextResource.class;
					}
					@Override
					public Class<? extends ILinker> bindILinker() {
						return Linker.class;
					}
				});
			}
		}.createInjectorAndDoEMFRegistration();
	}
	
}
