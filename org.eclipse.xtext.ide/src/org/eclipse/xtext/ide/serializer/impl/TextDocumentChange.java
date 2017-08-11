/*******************************************************************************
 * Copyright (c) 2017 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.ide.serializer.impl;

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.formatting2.regionaccess.ITextRegionAccessDiff;
import org.eclipse.xtext.formatting2.regionaccess.ITextReplacement;
import org.eclipse.xtext.ide.serializer.ITextDocumentChange;
import org.eclipse.xtext.ide.serializer.debug.TextDocumentChangeToString;
import org.eclipse.xtext.resource.XtextResource;

/**
 * @author Moritz Eysholdt - Initial contribution and API
 */
public class TextDocumentChange implements ITextDocumentChange {

	public final List<ITextReplacement> replacements;
	public final URI oldURI;
	public final ITextRegionAccessDiff access;

	public TextDocumentChange(ITextRegionAccessDiff access, URI oldURI, List<ITextReplacement> replacements) {
		super();
		this.access = access;
		this.oldURI = oldURI;
		this.replacements = replacements;
	}

	@Override
	public XtextResource getResource() {
		return access.getResource();
	}

	@Override
	public List<ITextReplacement> getReplacements() {
		return replacements;
	}

	@Override
	public URI getOldURI() {
		return oldURI;
	}

	@Override
	public URI getNewURI() {
		return getResource().getURI();
	}

	public ITextRegionAccessDiff getTextRegionAccess() {
		return access;
	}

	@Override
	public String toString() {
		return new TextDocumentChangeToString().add(this).toString();
	}

}
