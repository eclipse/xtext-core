/*******************************************************************************
 * Copyright (c) 2015, 2016 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.build;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.CompilerPhases;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IReferenceDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescription.Delta;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.resource.impl.AbstractResourceDescription;
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionDelta;
import org.eclipse.xtext.resource.impl.ResourceDescriptionsData;
import org.eclipse.xtext.resource.persistence.SerializableEObjectDescriptionProvider;
import org.eclipse.xtext.service.OperationCanceledManager;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.inject.Inject;

/**
 * @author Jan Koehnlein - Initial contribution and API
 * @since 2.9
 */
public class Indexer {

	public static class IndexResult {
		private final List<IResourceDescription.Delta> resourceDeltas;

		private final ResourceDescriptionsData newIndex;

		public IndexResult(List<IResourceDescription.Delta> resourceDeltas, ResourceDescriptionsData newIndex) {
			this.resourceDeltas = resourceDeltas;
			this.newIndex = newIndex;
		}

		public List<IResourceDescription.Delta> getResourceDeltas() {
			return resourceDeltas;
		}

		public ResourceDescriptionsData getNewIndex() {
			return newIndex;
		}

		@Override
		public int hashCode() {
			int prime = 31;
			int result = 1;
			result = prime * result + (resourceDeltas == null ? 0 : resourceDeltas.hashCode());
			return prime * result + (newIndex == null ? 0 : newIndex.hashCode());
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj) {
				return true;
			}
			if (obj == null) {
				return false;
			}
			if (getClass() != obj.getClass()) {
				return false;
			}
			Indexer.IndexResult other = (Indexer.IndexResult) obj;
			if (resourceDeltas == null) {
				if (other.resourceDeltas != null) {
					return false;
				}
			} else if (!resourceDeltas.equals(other.resourceDeltas)) {
				return false;
			}
			if (newIndex == null) {
				if (other.newIndex != null) {
					return false;
				}
			} else if (!newIndex.equals(other.newIndex)) {
				return false;
			}
			return true;
		}

		@Override
		public String toString() {
			ToStringBuilder b = new ToStringBuilder(this);
			b.add("resourceDeltas", resourceDeltas);
			b.add("newIndex", newIndex);
			return b.toString();
		}

	}

	/**
	 * A resource description that has no references to the origin resource anymore. Imported names and reference
	 * descriptions are not available.
	 */
	protected static class ResolvedResourceDescription extends AbstractResourceDescription {

		private static final Logger LOG = Logger.getLogger(ResolvedResourceDescription.class);

		private URI uri;

		private ImmutableList<IEObjectDescription> exported;

		public ResolvedResourceDescription(IResourceDescription original) {
			uri = original.getURI();
			exported = FluentIterable.from(original.getExportedObjects()).transform(from -> {
				if (from instanceof SerializableEObjectDescriptionProvider) {
					return ((SerializableEObjectDescriptionProvider) from).toSerializableEObjectDescription();
				}
				if (from.getEObjectOrProxy().eIsProxy()) {
					return from;
				}
				InternalEObject result = (InternalEObject) EcoreUtil.create(from.getEClass());
				result.eSetProxyURI(from.getEObjectURI());
				Map<String, String> userData = null;
				String[] userDataKeys = from.getUserDataKeys();
				for (String key : userDataKeys) {
					if (userData == null) {
						userData = Maps.newHashMapWithExpectedSize(userDataKeys.length);
					}
					userData.put(key, from.getUserData(key));
				}
				return EObjectDescription.create(from.getName(), result, userData);
			}).toList();
		}

		@Override
		protected List<IEObjectDescription> computeExportedObjects() {
			return exported;
		}

		@Override
		public Iterable<QualifiedName> getImportedNames() {
			IllegalStateException exception = new IllegalStateException("getImportedNames" + getURI());
			LOG.error(exception, exception);
			return Collections.emptyList();
		}

		@Override
		public Iterable<IReferenceDescription> getReferenceDescriptions() {
			IllegalStateException exception = new IllegalStateException("getReferenceDescriptions" + getURI());
			LOG.error(exception, exception);
			return Collections.emptyList();
		}

		@Override
		public URI getURI() {
			return uri;
		}
	}

	@Inject
	private CompilerPhases compilerPhases;

	@Inject
	private OperationCanceledManager operationCanceledManager;

	/**
	 * Compute an updated index.
	 */
	public Indexer.IndexResult computeAndIndexAffected(BuildRequest request, BuildContext context) {
		ResourceDescriptionsData previousIndex = context.getOldState().getResourceDescriptions();
		ResourceDescriptionsData newIndex = request.getState().getResourceDescriptions();
		List<IResourceDescription.Delta> deltas = new ArrayList<>();
		deltas.addAll(getDeltasForDeletedResources(request, previousIndex, context));
		deltas.addAll(getDeltasForChangedResources(request.getDirtyFiles(), previousIndex, context));
		for (IResourceDescription.Delta delta : deltas) {
			newIndex.register(delta);
		}
		Set<IResourceDescription.Delta> allDeltas = new HashSet<>(deltas);
		allDeltas.addAll(request.getExternalDeltas());
		Set<URI> remainingURIs = FluentIterable.from(previousIndex.getAllResourceDescriptions())
				.transform(IResourceDescription::getURI).copyInto(new HashSet<>());
		remainingURIs.removeAll(FluentIterable.from(deltas).transform(Delta::getUri).toSet());
		List<URI> allAffected = FluentIterable.from(remainingURIs).filter(it -> {
			IResourceDescription.Manager manager = context.getResourceServiceProvider(it)
					.getResourceDescriptionManager();
			IResourceDescription resourceDescription = previousIndex.getResourceDescription(it);
			return isAffected(resourceDescription, manager, allDeltas, allDeltas, newIndex);
		}).toList();
		deltas.addAll(getDeltasForChangedResources(allAffected, previousIndex, context));
		return new Indexer.IndexResult(deltas, newIndex);
	}

	/**
	 * Process the deleted resources.
	 */
	protected List<IResourceDescription.Delta> getDeltasForDeletedResources(BuildRequest request,
			ResourceDescriptionsData oldIndex, BuildContext context) {
		List<IResourceDescription.Delta> deltas = new ArrayList<>();
		for (URI deleted : request.getDeletedFiles()) {
			IResourceServiceProvider resourceServiceProvider = context.getResourceServiceProvider(deleted);
			if (resourceServiceProvider != null) {
				operationCanceledManager.checkCanceled(context.getCancelIndicator());
				IResourceDescription oldDescription = oldIndex != null ? oldIndex.getResourceDescription(deleted)
						: null;
				if (oldDescription != null) {
					DefaultResourceDescriptionDelta delta = new DefaultResourceDescriptionDelta(oldDescription, null);
					deltas.add(delta);
				}
			}
		}
		return deltas;
	}

	/**
	 * Process the changed resources.
	 */
	protected List<IResourceDescription.Delta> getDeltasForChangedResources(Iterable<URI> affectedUris,
			ResourceDescriptionsData oldIndex, BuildContext context) {
		try {
			compilerPhases.setIndexing(context.getResourceSet(), true);
			// Since context.executeClustered, we can avoid a copy due of the list due to the impl detail of
			// IterableExtensions.toList
			return IterableExtensions
					.toList(context.executeClustered(affectedUris, it -> addToIndex(it, true, oldIndex, context)));
		} finally {
			compilerPhases.setIndexing(context.getResourceSet(), false);
		}
	}

	/**
	 * Index the given resource.
	 *
	 * @param isPreIndexing
	 *            can be evaluated to produce different index entries depending on the phase
	 */
	protected IResourceDescription.Delta addToIndex(Resource resource, boolean isPreIndexing,
			ResourceDescriptionsData oldIndex, BuildContext context) {
		operationCanceledManager.checkCanceled(context.getCancelIndicator());
		URI uri = resource.getURI();
		IResourceServiceProvider serviceProvider = context.getResourceServiceProvider(uri);
		IResourceDescription.Manager manager = serviceProvider.getResourceDescriptionManager();
		IResourceDescription newDescription = manager.getResourceDescription(resource);
		IResourceDescription toBeAdded = new Indexer.ResolvedResourceDescription(newDescription);
		IResourceDescription.Delta delta = manager
				.createDelta(oldIndex != null ? oldIndex.getResourceDescription(uri) : null, toBeAdded);
		return delta;
	}

	/**
	 * Return true, if the given resource must be processed due to the given changes.
	 */
	protected boolean isAffected(IResourceDescription affectionCandidate, IResourceDescription.Manager manager,
			Collection<IResourceDescription.Delta> newDeltas, Collection<IResourceDescription.Delta> allDeltas,
			IResourceDescriptions resourceDescriptions) {
		if (manager instanceof IResourceDescription.Manager.AllChangeAware) {
			return ((IResourceDescription.Manager.AllChangeAware) manager).isAffectedByAny(allDeltas,
					affectionCandidate, resourceDescriptions);
		} else {
			if (newDeltas.isEmpty()) {
				return false;
			} else {
				return manager.isAffected(newDeltas, affectionCandidate, resourceDescriptions);
			}
		}
	}
}
