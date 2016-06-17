/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.testing.util;

import java.io.InputStream;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.resource.FileExtensionProvider;

import com.google.inject.Inject;

/**
 * Some convenience methods for parsing (i.e. testing, etc.)
 * 
 * @author Sven Efftinge - Initial contribution and API
 */
public class ParseHelper<T extends EObject> {

	@Inject
	private ResourceHelper resourceHelper;

	public String fileExtension;
	
	/**
	 * @since 2.5
	 */
	@Inject
	public void setFileExtensionProvider(FileExtensionProvider extensionProvider) {
		fileExtension = extensionProvider.getPrimaryFileExtension();
	}

	@SuppressWarnings("unchecked")
	public T parse(InputStream in, URI uriToUse, Map<?, ?> options, ResourceSet resourceSet) {
		resourceHelper.setFileExtension(fileExtension);
		Resource resource = resourceHelper.resource(in, uriToUse, options, resourceSet);
		final T root = (T) (resource.getContents().isEmpty() ? null : resource.getContents().get(0));
		return root;
	}

	public T parse(CharSequence text) throws Exception {
		return parse(text, resourceHelper.createResourceSet());
	}

	public T parse(CharSequence text, ResourceSet resourceSetToUse) throws Exception {
		return parse(getAsStream(text), computeUnusedUri(resourceSetToUse), null, resourceSetToUse);
	}

	public T parse(CharSequence text, URI uriToUse, ResourceSet resourceSetToUse) throws Exception {
		return parse(getAsStream(text), uriToUse, null, resourceSetToUse);
	}
	
	protected URI computeUnusedUri(ResourceSet resourceSet) {
		return resourceHelper.computeUnusedUri(resourceSet);
	}

	protected InputStream getAsStream(CharSequence text) {
		return resourceHelper.getAsStream(text);
	}

}
