/*******************************************************************************
 * Copyright (c) 2016, 2019 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.resource

import com.google.inject.Provider
import com.google.inject.Singleton
import java.util.ServiceLoader
import org.eclipse.xtext.ISetup
import org.eclipse.xtext.resource.impl.ResourceServiceProviderRegistryImpl

/**
 * @author Sven Efftinge - Initial contribution and API
 * @since 2.11
 */
@Singleton
class ResourceServiceProviderServiceLoader implements Provider<IResourceServiceProvider.Registry> {

    ServiceLoader<ISetup> setupLoader = ServiceLoader.load(ISetup)

    IResourceServiceProvider.Registry registry = loadRegistry
    
    private def IResourceServiceProvider.Registry loadRegistry() {
        val registry = new ResourceServiceProviderRegistryImpl()
        for (ISetup cp : setupLoader) {
            val injector = cp.createInjectorAndDoEMFRegistration();
            val resourceServiceProvider = injector.getInstance(IResourceServiceProvider)
            val extensionProvider = injector.getInstance(FileExtensionProvider)
            for (ext : extensionProvider.fileExtensions) {
                if (registry.extensionToFactoryMap.containsKey(ext)) {
                    if (extensionProvider.primaryFileExtension == ext) {
                        registry.extensionToFactoryMap.put(ext, resourceServiceProvider)
                    }
                } else {
                    registry.extensionToFactoryMap.put(ext, resourceServiceProvider)
                }
            }
        }
        return registry;
    }

    override get() {
        return registry
    }

}
