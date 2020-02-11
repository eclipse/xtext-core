/*******************************************************************************
 * Copyright (c) 2009 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.validation;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.util.CancelIndicator;

import com.google.inject.Inject;

/**
 * <p>
 * An {@link org.eclipse.emf.ecore.EValidator} implementation, that can be used via {@link ComposedChecks} generically
 * to validate for duplicated exported objects.
 * </p>
 * <p>
 * It validates <b>only</b> the objects, that will be publicly available via an {@link IResourceDescription}. Local
 * variables and similar objects have to be validated on their own. The {@link INamesAreUniqueValidationHelper} provides
 * a convenient way to apply this kind of constraints.
 * </p>
 * 
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public class NamesAreUniqueValidator extends AbstractDeclarativeValidator {

	@Inject
	private IResourceServiceProvider.Registry resourceServiceProviderRegistry = IResourceServiceProvider.Registry.INSTANCE;
	
	@Inject
	private INamesAreUniqueValidationHelper helper;

	@Override
	public void register(EValidatorRegistrar registrar) {
		// library validator is not registered for a specific language
	}

	@Check
	public void checkUniqueNamesInResourceOf(EObject eObject) {
		Map<Object, Object> context = getContext();
		Resource resource = eObject.eResource();
		if (resource==null)
			return;
		CancelIndicator cancelIndicator = null;
		if (context != null) {
			if (context.containsKey(resource))
				return; // resource was already validated
			context.put(resource, this);
			cancelIndicator = (CancelIndicator) context.get(CancelableDiagnostician.CANCEL_INDICATOR);
		}
		doCheckUniqueNames(resource, cancelIndicator);
	}

	public void doCheckUniqueNames(Resource resource, CancelIndicator cancelIndicator) {
		final IResourceServiceProvider resourceServiceProvider = resourceServiceProviderRegistry.getResourceServiceProvider(resource.getURI());
		if (resourceServiceProvider==null)
			return;
		IResourceDescription.Manager manager = resourceServiceProvider.getResourceDescriptionManager();
		if (manager != null) {
			IResourceDescription description = manager.getResourceDescription(resource);
			if (description != null) {
				Iterable<IEObjectDescription> descriptions = description.getExportedObjects();
				helper.checkUniqueNames(descriptions, cancelIndicator, this);
			}
		}
	}

	public void setHelper(INamesAreUniqueValidationHelper helper) {
		this.helper = helper;
	}

	public INamesAreUniqueValidationHelper getHelper() {
		return helper;
	}

	public void setResourceServiceProviderRegistry(IResourceServiceProvider.Registry resourceDescriptionManagerRegistry) {
		this.resourceServiceProviderRegistry = resourceDescriptionManagerRegistry;
	}

	public IResourceServiceProvider.Registry getResourceServiceProviderRegistry() {
		return resourceServiceProviderRegistry;
	}

}
