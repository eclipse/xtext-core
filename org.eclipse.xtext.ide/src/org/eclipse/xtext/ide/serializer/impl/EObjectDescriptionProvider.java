/*******************************************************************************
 * Copyright (c) 2017 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.ide.serializer.impl;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.ide.serializer.hooks.IEObjectDescriptionProvider;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;

import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.inject.Inject;

/**
 * @author Moritz Eysholdt - Initial contribution and API
 */
public class EObjectDescriptionProvider implements IEObjectDescriptionProvider {

	protected static class SimpleNameDescription implements IEObjectDescription {

		private final EObject object;
		private final QualifiedName qualifiedName;
		private final QualifiedName simpleName;
		private final Map<String, String> userData;

		public SimpleNameDescription(QualifiedName qName, IEObjectDescription source) {
			this.simpleName = qName;
			this.object = source.getEObjectOrProxy();
			this.qualifiedName = source.getQualifiedName();
			Preconditions.checkArgument(!this.object.eIsProxy());
			Preconditions.checkNotNull(this.simpleName);
			Preconditions.checkNotNull(this.qualifiedName);
			Map<String, String> userData = null;
			for (final String key : source.getUserDataKeys()) {
				if (userData == null) {
					userData = Maps.newHashMapWithExpectedSize(2);
				}
				userData.put(key, source.getUserData(key));
			}
			this.userData = userData;
		}

		@Override
		public EClass getEClass() {
			return object.eClass();
		}

		@Override
		public EObject getEObjectOrProxy() {
			return object;
		}

		@Override
		public URI getEObjectURI() {
			throw new UnsupportedOperationException();
		}

		@Override
		public QualifiedName getName() {
			return simpleName;
		}

		@Override
		public QualifiedName getQualifiedName() {
			return qualifiedName;
		}

		@Override
		public String getUserData(String key) {
			if (userData == null) {
				return null;
			}
			return userData.get(key);
		}

		@Override
		public String[] getUserDataKeys() {
			if (userData == null) {
				return new String[0];
			}
			return userData.keySet().toArray(new String[userData.size()]);
		}

		@Override
		public String toString() {
			StringBuilder result = new StringBuilder();
			result.append(IEObjectDescription.class.getSimpleName() + " " + qualifiedName);
			if (simpleName != null && !simpleName.equals(qualifiedName)) {
				result.append(" name:" + simpleName);
			}
			if (userData != null && !userData.isEmpty()) {
				List<String> items = Lists.newArrayList();
				for (Entry<String, String> e : userData.entrySet()) {
					items.add(e.getKey() + ": " + e.getValue());
				}
				result.append(" userData=[" + Joiner.on(", ").join(items) + "]");
			}
			return result.toString();
		}

	}

	@Inject
	private IQualifiedNameProvider qualifiedNameProvider;

	@Inject
	private IResourceDescription.Manager resourceDescriptionManager;

	protected QualifiedName computeSimpleName(Multimap<EObject, IEObjectDescription> descs, IEObjectDescription desc) {
		QualifiedName name = desc.getQualifiedName();
		int segmentCount = name.getSegmentCount();
		if (segmentCount < 2) {
			return name;
		}
		EObject container = desc.getEObjectOrProxy().eContainer();
		while (container != null) {
			Collection<IEObjectDescription> candidates = descs.get(container);
			for (IEObjectDescription cand : candidates) {
				QualifiedName candName = cand.getQualifiedName();
				int candCount = candName.getSegmentCount();
				if (candCount < segmentCount && name.startsWith(candName)) {
					return name.skipFirst(candCount);
				}
			}
			container = container.eContainer();
		}
		return name;
	}

	@Override
	public Iterable<IEObjectDescription> getEObjectDescriptions(Resource resource) {
		Multimap<EObject, IEObjectDescription> map = HashMultimap.create();
		IResourceDescription description = resourceDescriptionManager.getResourceDescription(resource);
		for (IEObjectDescription desc : description.getExportedObjects()) {
			EObject object = EcoreUtil.resolve(desc.getEObjectOrProxy(), resource);
			map.put(object, desc);
		}
		TreeIterator<EObject> it = EcoreUtil2.eAll(resource.getContents().get(0));
		while (it.hasNext()) {
			EObject next = it.next();
			if (map.containsKey(next)) {
				continue;
			}
			QualifiedName name = qualifiedNameProvider.getFullyQualifiedName(next);
			if (name != null) {
				IEObjectDescription desc = EObjectDescription.create(name, next);
				map.put(next, desc);
			}
		}
		List<IEObjectDescription> result = Lists.newArrayList();
		for (IEObjectDescription desc : map.values()) {
			QualifiedName name = computeSimpleName(map, desc);
			SimpleNameDescription copy = new SimpleNameDescription(name, desc);
			result.add(copy);
		}

		return result;
	}

}
