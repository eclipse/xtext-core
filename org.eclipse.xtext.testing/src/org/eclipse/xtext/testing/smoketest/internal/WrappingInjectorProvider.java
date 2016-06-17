/*******************************************************************************
 * Copyright (c) 2014 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.testing.smoketest.internal;

import java.lang.reflect.Type;
import java.util.Map;
import java.util.logging.Logger;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.parser.IParser;
import org.eclipse.xtext.resource.FileExtensionProvider;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.testing.GlobalRegistries;
import org.eclipse.xtext.testing.GlobalRegistries.GlobalStateMemento;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.eclipse.xtext.testing.IRegistryConfigurator;

import com.google.common.annotations.Beta;
import com.google.inject.Binder;
import com.google.inject.Binding;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.Module;
import com.google.inject.util.Modules;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
@Beta
public class WrappingInjectorProvider implements IInjectorProvider, IRegistryConfigurator {

	private final IInjectorProvider delegate;
	private final Injector injector;
	private final GlobalStateMemento stateBeforeInjectorCreation;
	private final GlobalStateMemento stateAfterInjectorCreation;

	public WrappingInjectorProvider(IInjectorProvider delegate) {
		this.delegate = delegate;
		stateBeforeInjectorCreation = GlobalRegistries.makeCopyOfGlobalState();
		this.injector = createInjector();
		registerFactory(injector);
		stateAfterInjectorCreation = GlobalRegistries.makeCopyOfGlobalState();
	}
	
	private void registerFactory(Injector injector) {
		IResourceFactory factory = injector.getInstance(IResourceFactory.class);
		IResourceServiceProvider serviceProvider = injector.getInstance(IResourceServiceProvider.class);
		FileExtensionProvider fileExtensionProvider = injector.getInstance(FileExtensionProvider.class);
		for(String ext: fileExtensionProvider.getFileExtensions()) {
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(ext, factory);
			IResourceServiceProvider.Registry.INSTANCE.getExtensionToFactoryMap().put(ext, serviceProvider);
		}
	}

	protected Injector createInjector() {
		Injector delegateInjector = delegate.getInjector();
		final Map<Key<?>, Binding<?>> bindings = delegateInjector.getBindings();
		Injector injector = Guice.createInjector(Modules.override(new Module() {
			@Override
			public void configure(Binder binder) {
				for(Binding<?> binding: bindings.values()) {
					Type typeLiteral = binding.getKey().getTypeLiteral().getType();
					if (!Injector.class.equals(typeLiteral) && !Logger.class.equals(typeLiteral)) {
						binding.applyTo(binder);
					}
				}
			}
		}).with(new Module() {
			@Override
			public void configure(Binder binder) {
				binder.bind(IParser.class).toInstance(new TestDataProvider());
			}
		}));
		return injector;
	}
	
	public IInjectorProvider getDelegate() {
		return delegate;
	}

	@Override
	public void restoreRegistry() {
		stateBeforeInjectorCreation.restoreGlobalState();
	}

	@Override
	public void setupRegistry() {
		stateAfterInjectorCreation.restoreGlobalState();
	}

	@Override
	public Injector getInjector() {
		return injector;
	}
}