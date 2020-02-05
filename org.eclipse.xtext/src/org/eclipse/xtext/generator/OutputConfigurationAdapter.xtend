/*******************************************************************************
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.generator

import java.util.Set
import org.eclipse.emf.common.notify.impl.AdapterImpl
import org.eclipse.xtend.lib.annotations.Data
import java.util.Map

/**
 * @noreference
 */
@Data
class OutputConfigurationAdapter extends AdapterImpl {
	Map<String, Set<OutputConfiguration>> outputConfigurationsPerLanguage 
	
	override isAdapterForType(Object type) {
		type == OutputConfigurationAdapter
	}
	
}