/*******************************************************************************
 * Copyright (c) 2009 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.linking.lazy;

import org.apache.log4j.Level;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.XtextStandaloneSetup;
import org.eclipse.xtext.linking.lazy.lazyLinking.Model;
import org.eclipse.xtext.linking.lazy.lazyLinking.Type;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.testing.logging.LoggingTester;
import org.eclipse.xtext.testing.logging.LoggingTester.LogCapture;
import org.eclipse.xtext.tests.AbstractXtextTests;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Test;

import com.google.inject.Binder;
import com.google.inject.name.Names;

/**
 * @author Sven Efftinge - Initial contribution and API
 */
public class Bug281990Test extends AbstractXtextTests {

	public static class RecursiveScopeProvider extends LazyLinkingTestLanguageScopeProvider {
		public IScope scope_Type_extends(Type t, EReference ref) {
			t.getParentId();
			throw new AssertionError("Should never be thrown, because the call to ParentId will throw a CyclicLinkingException already.");
		}
	}

	@Override
	public void setUp() throws Exception {
		super.setUp();
		XtextStandaloneSetup.doSetup();
		with(new LazyLinkingTestLanguageRuntimeModule() {
			@Override
			public Class<? extends IScopeProvider> bindIScopeProvider() {
				return org.eclipse.xtext.linking.lazy.Bug281990Test.RecursiveScopeProvider.class;
			}
			
			@Override
			public void configure(Binder binder) {
				super.configure(binder);
				binder.bindConstant().annotatedWith(Names.named(LazyLinkingResource.CYCLIC_LINKING_DECTECTION_COUNTER_LIMIT)).to(0);
			}
			
		});
		new LazyLinkingTestLanguageStandaloneSetup().register(getInjector());
	}

	@Test public void testRecursionErrorMessage() throws Exception {
		LogCapture loggings = LoggingTester.captureLogging(Level.ERROR, LazyLinkingResource.class, new Runnable() {
			@Override
			public void run() {
				try {
					EObject model = getModelAndExpect("type Foo extends Foo.bar { Foo foo; }", 2);
					assertTrue(((Model)model).getTypes().get(0).getParentId().eIsProxy());
					assertTrue(model.eResource().getErrors().get(0).getMessage().contains("Couldn't"));
				} catch (Exception e) {
					throw Exceptions.sneakyThrow(e);
				}
			}
		});
		loggings.assertNumberOfLogEntries(1);
	}
}
