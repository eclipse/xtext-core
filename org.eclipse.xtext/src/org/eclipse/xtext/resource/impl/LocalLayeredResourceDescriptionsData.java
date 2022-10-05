/*******************************************************************************
 * Copyright (c) 2022 Avaloq Group AG (http://www.avaloq.com).
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.resource.impl;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;

import com.google.common.collect.Iterables;

/**
 * @author Andrew Lamb - Initial contribution and API
 * @since 2.29
 */
public class LocalLayeredResourceDescriptionsData extends ResourceDescriptionsData {

	  private final ResourceDescriptionsData globalData;

	  private final Set<URI> addedDescriptions = new LinkedHashSet<>();
	  private final Set<URI> removedDescriptions = new LinkedHashSet<>();

	  public LocalLayeredResourceDescriptionsData(ResourceDescriptionsData globalData) {
	    super(Collections.emptyList());
	    this.globalData = globalData;
	  }

	  protected LocalLayeredResourceDescriptionsData(ResourceDescriptionsData globalData, Map<URI, IResourceDescription> resourceDescriptionMap, Map<QualifiedName, Object> lookupMap, Set<URI> removedDescriptions) {
	    super(resourceDescriptionMap, lookupMap);
	    this.globalData = globalData;
	    addedDescriptions.addAll(resourceDescriptionMap.keySet());
	    this.removedDescriptions.addAll(removedDescriptions);
	  }

	  protected ResourceDescriptionsData getGlobalData() {
	    return globalData;
	  }

	  protected Map<URI, IResourceDescription> copyLocalDescriptionsMap() {
	    Map<URI, IResourceDescription> descriptionsMap = new LinkedHashMap<>(addedDescriptions.size());
	    addedDescriptions.forEach(addedUri -> descriptionsMap.computeIfAbsent(addedUri, this::getResourceDescription));
	    return descriptionsMap;
	  }

	  protected Set<URI> copyRemovedDescriptions() {
	    return new LinkedHashSet<>(removedDescriptions);
	  }

	  @Override
	  public ResourceDescriptionsData copy() {
	    return new LocalLayeredResourceDescriptionsData(globalData, copyLocalDescriptionsMap(), copyLookupMap(), copyRemovedDescriptions());
	  }

	  @Override
	  public Iterable<IResourceDescription> getAllResourceDescriptions() {
	    return Iterables.concat(super.getAllResourceDescriptions(), Iterables.filter(globalData.getAllResourceDescriptions(), description -> {
	      return !isLocal(description.getURI());
	    }));
	  }

	  @Override
	  public IResourceDescription getResourceDescription(URI uri) {
	    if (addedDescriptions.contains(uri)) {
	      return super.getResourceDescription(uri);
	    }
	    if (!removedDescriptions.contains(uri)) {
	      return globalData.getResourceDescription(uri);
	    }
	    return null;
	  }

	  @Override
	  public void addDescription(URI uri, IResourceDescription newDescription) {
	    super.addDescription(uri, newDescription);
	    removedDescriptions.remove(uri);
	    addedDescriptions.add(uri);
	  }

	  @Override
	  public void removeDescription(URI uri) {
	    super.removeDescription(uri);
	    addedDescriptions.remove(uri);
	    if (globalData.getResourceDescription(uri) != null) {
	      removedDescriptions.add(uri);
	    }
	  }

	  protected Iterable<IEObjectDescription> joinIterables(Iterable<IEObjectDescription> localDescriptions, Iterable<IEObjectDescription> globalDescriptions) {
	    return Iterables.concat(localDescriptions, Iterables.filter(globalDescriptions, description -> {
	      return !isLocal(description.getEObjectURI().trimFragment());
	    }));
	  }

	  /**
	   * Test if the given uri is part of the local layer.
	   *
	   * @param uri
	   *          the uri to test.
	   * @return {@code true} if the local layer contains the given uri, {@code false} otherwise.
	   */
	  public boolean isLocal(URI uri) {
	    return addedDescriptions.contains(uri) || removedDescriptions.contains(uri);
	  }

	  /**
	   * Get the resource descriptions from the local layer only.
	   *
	   * @return the resource descriptions from the local layer.
	   */
	  public Iterable<IResourceDescription> getLocalResourceDescriptions() {
	    return Iterables.transform(addedDescriptions, this::getResourceDescription);
	  }

	  @Override
	  public Iterable<IEObjectDescription> getExportedObjects(EClass type, QualifiedName qualifiedName, boolean ignoreCase) {
	    return joinIterables(super.getExportedObjects(type, qualifiedName, ignoreCase), globalData.getExportedObjects(type, qualifiedName, ignoreCase));
	  }

	  @Override
	  public boolean isEmpty() {
	    return super.isEmpty() && globalData.getAllURIs().size() <= removedDescriptions.size();
	  }

	  @Override
	  public Iterable<IEObjectDescription> getExportedObjects() {
	    return joinIterables(super.getExportedObjects(), globalData.getExportedObjects());
	  }

	  @Override
	  public Iterable<IEObjectDescription> getExportedObjectsByType(EClass type) {
	    return joinIterables(super.getExportedObjectsByType(type), globalData.getExportedObjectsByType(type));
	  }

	  @Override
	  public Iterable<IEObjectDescription> getExportedObjectsByObject(EObject object) {
	    return joinIterables(super.getExportedObjectsByObject(object), globalData.getExportedObjectsByObject(object));
	  }
	}
