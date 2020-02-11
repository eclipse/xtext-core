/*******************************************************************************
 * Copyright (c) 2014 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.resource.persistence

import org.eclipse.emf.common.notify.impl.AdapterImpl

/**
 * An adapter that can be installed into a SerializableResource,
 * to provide resource state. It is used with dirty editors providing the dirty non persisted
 * state to other editors.
 * 
 * @author Sven Efftinge - Initial contribution and API
 */
class ResourceStorageProviderAdapter extends AdapterImpl {
	
	override isAdapterForType(Object type) {
		type == ResourceStorageProviderAdapter
	}

	def ResourceStorageLoadable getResourceStorageLoadable(StorageAwareResource resource) {
		return null
	}
	
}