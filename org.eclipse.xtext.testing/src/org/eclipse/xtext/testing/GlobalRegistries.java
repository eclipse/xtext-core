/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.testing;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.XtextPackage;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.validation.CompositeEValidator;

/**
 * 
 * Utility for tests to avoid being based on and doing any side effects to the global registries from EMF.
 * 
 * @author Sven Efftinge - Initial contribution and API
 */
public class GlobalRegistries {
	
	public static class GlobalStateMemento {
		private HashMap<EPackage, Object> validatorReg;
		private HashMap<String, Object> epackageReg;
		private HashMap<String, Object> protocolToFactoryMap;
		private HashMap<String, Object> extensionToFactoryMap;
		private HashMap<String, Object> contentTypeIdentifierToFactoryMap;
		private HashMap<String, Object> protocolToServiceProviderMap;
		private HashMap<String, Object> extensionToServiceProviderMap;
		private HashMap<String, Object> contentTypeIdentifierToServiceProviderMap;
	
		public void restoreGlobalState() {
			clearGlobalRegistries();
			EValidator.Registry.INSTANCE.putAll(validatorReg);
			EPackage.Registry.INSTANCE.putAll(epackageReg);
			
			Resource.Factory.Registry.INSTANCE.getProtocolToFactoryMap().putAll(protocolToFactoryMap);
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().putAll(extensionToFactoryMap);
			Resource.Factory.Registry.INSTANCE.getContentTypeToFactoryMap().putAll(contentTypeIdentifierToFactoryMap);
			
			IResourceServiceProvider.Registry.INSTANCE.getProtocolToFactoryMap().putAll(protocolToServiceProviderMap);
			IResourceServiceProvider.Registry.INSTANCE.getExtensionToFactoryMap().putAll(extensionToServiceProviderMap);
			IResourceServiceProvider.Registry.INSTANCE.getContentTypeToFactoryMap().putAll(contentTypeIdentifierToServiceProviderMap);
		}
	}

	
	public static GlobalStateMemento makeCopyOfGlobalState() {
		GlobalStateMemento memento = new GlobalStateMemento();
		memento.validatorReg = new HashMap<EPackage, Object>(EValidator.Registry.INSTANCE);
		for(Map.Entry<EPackage, Object> validatorEntry: memento.validatorReg.entrySet()) {
			Object existingValue = validatorEntry.getValue();
			if (existingValue instanceof CompositeEValidator) {
				validatorEntry.setValue(((CompositeEValidator) existingValue).getCopyAndClearContents());
			}
		}
		memento.epackageReg = new HashMap<String, Object>(EPackage.Registry.INSTANCE);
		memento.protocolToFactoryMap = new HashMap<String, Object>(Resource.Factory.Registry.INSTANCE.getProtocolToFactoryMap());
		memento.extensionToFactoryMap = new HashMap<String, Object>(Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap());
		memento.contentTypeIdentifierToFactoryMap = new HashMap<String, Object>(Resource.Factory.Registry.INSTANCE.getContentTypeToFactoryMap());

		memento.protocolToServiceProviderMap = new HashMap<String, Object>(IResourceServiceProvider.Registry.INSTANCE.getProtocolToFactoryMap());
		memento.extensionToServiceProviderMap = new HashMap<String, Object>(IResourceServiceProvider.Registry.INSTANCE.getExtensionToFactoryMap());
		memento.contentTypeIdentifierToServiceProviderMap = new HashMap<String, Object>(IResourceServiceProvider.Registry.INSTANCE.getContentTypeToFactoryMap());
		return memento;
	}
	
	public static void clearGlobalRegistries() {
		EValidator.Registry.INSTANCE.clear();
		EPackage.Registry.INSTANCE.clear();
		Resource.Factory.Registry.INSTANCE.getProtocolToFactoryMap().clear();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().clear();
		Resource.Factory.Registry.INSTANCE.getContentTypeToFactoryMap().clear();
		
		IResourceServiceProvider.Registry.INSTANCE.getProtocolToFactoryMap().clear();
		IResourceServiceProvider.Registry.INSTANCE.getExtensionToFactoryMap().clear();
		IResourceServiceProvider.Registry.INSTANCE.getContentTypeToFactoryMap().clear();
		initializeDefaults();
	}
	
	public static void initializeDefaults() {
		//EMF Standalone setup
		if (!Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().containsKey("ecore"))
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
				"ecore", new EcoreResourceFactoryImpl());
		if (!Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().containsKey("xmi"))
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
				"xmi", new XMIResourceFactoryImpl());
		if (!EPackage.Registry.INSTANCE.containsKey(EcorePackage.eNS_URI))
			EPackage.Registry.INSTANCE.put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE);
		if (!EPackage.Registry.INSTANCE.containsKey(XtextPackage.eNS_URI))
			EPackage.Registry.INSTANCE.put(XtextPackage.eNS_URI, XtextPackage.eINSTANCE);
	}
	
}
