/*******************************************************************************
 * Copyright (c) 2009 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.service;

import java.util.List;

import org.apache.log4j.Logger;

import com.google.common.collect.Lists;
import com.google.inject.Binder;
import com.google.inject.Module;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public class CompoundModule implements Module {

	private static Logger LOGGER = Logger.getLogger(CompoundModule.class);
	
	private List<Module> modules;

	public CompoundModule() {
		modules = Lists.newArrayList();
	}
	
	@Override
	public void configure(Binder binder) {
		for (Module module : modules) {
			try {
				module.configure(binder);
			} catch(Exception e) {
				LOGGER.error(e.getMessage(), e);
			}
		}
	}

	public void add(Module module) {
		modules.add(module);
	}
	
	public void remove(Module module) {
		modules.remove(module);
	}
	
	public List<Module> getModules() {
		return modules;
	}

	public int size() {
		return modules.size();
	}
}
