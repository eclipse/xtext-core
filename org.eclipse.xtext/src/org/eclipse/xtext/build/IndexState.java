/*******************************************************************************
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.build;

import java.util.Collections;

import org.eclipse.xtext.resource.impl.ResourceDescriptionsData;

/**
 * @author Sven Efftinge - Initial contribution and API
 */
public class IndexState {
	private final ResourceDescriptionsData resourceDescriptions;

	private final Source2GeneratedMapping fileMappings;

	/**
	 * Constructor
	 */
	public IndexState() {
		this(new ResourceDescriptionsData(Collections.emptySet()), new Source2GeneratedMapping());
	}

	public IndexState(ResourceDescriptionsData resourceDescriptions, Source2GeneratedMapping fileMappings) {
		super();
		this.resourceDescriptions = resourceDescriptions;
		this.fileMappings = fileMappings;
	}

	public ResourceDescriptionsData getResourceDescriptions() {
		return this.resourceDescriptions;
	}

	public Source2GeneratedMapping getFileMappings() {
		return this.fileMappings;
	}
}
