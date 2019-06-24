/*******************************************************************************
 * Copyright (c) 2011 Sigasi N.V. (http://www.sigasi.com) and others. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package org.eclipse.xtext.nodemodel.serialization;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.nodemodel.impl.RootNode;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.XtextResource;

/**
 * @author Mark Christiaens - Initial contribution
 * 
 * @since 2.3
 */
public class SerializationConversionContext {
	final private Map<EObject, Integer> grammarElementToIdMap;
	final private ArrayList<String> grammarIdToURIMap;
	final private Map<EObject, Integer> eObjectToIdMap;

	public SerializationConversionContext(XtextResource resource) {
		grammarElementToIdMap = new IdentityHashMap<EObject, Integer>(100);
		grammarIdToURIMap = new ArrayList<String>(100);
		eObjectToIdMap = new IdentityHashMap<EObject, Integer>(1000);

		fillEObjectToIdMap(resource);
		fillGrammarElementToIdMap(resource);
	}

	public Integer getGrammarElementId(EObject grammarElement) {
		final Integer id = grammarElementToIdMap.get(grammarElement);

		if (id == null) {
			throw new IllegalArgumentException(
					"Trying to fetch a grammar element that does not (no longer) exists with id: " + id);
		}

		return id;
	}

	protected void fillEObjectToIdMap(Resource resource) {
		SerializationUtil.fillIdToEObjectMap(resource, eObjectToIdMap);
	}

	protected void fillGrammarElementToIdMap(XtextResource r) {
		IParseResult parseResult = r.getParseResult();
		if (parseResult != null) {
			RootNode it = (RootNode) parseResult.getRootNode();
			it.fillGrammarElementToIdMap(grammarElementToIdMap, grammarIdToURIMap);
		}
	}

	public Integer getEObjectId(EObject eObject) {
		Integer id = eObjectToIdMap.get(eObject);

		if (id == null) {
			throw new IllegalArgumentException("Trying to fetch an EMF object that does not exist (no longer) with id: "
					+ id);
		}

		return id;
	}

	/**
	 * Returns an unmodifiable view on the grammarIdToURIMap
	 */
	public List<String> getGrammarIdToURIMap() {
		return Collections.unmodifiableList(grammarIdToURIMap);
	}
}
