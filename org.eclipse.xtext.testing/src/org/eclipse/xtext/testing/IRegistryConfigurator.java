/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.testing;

/**
 * Extension interface to {@link IInjectorProvider} to clean up any side effects introduced through modifying global
 * state registries such as {@link org.eclipse.emf.ecore.EPackage.Registry}.
 * 
 * @author Michael Clay - Initial contribution and API
 */
public interface IRegistryConfigurator {

	/**
	 * Enables the same behaviour such as junit's {@link org.junit.Before} which is used to prepare or setup some
	 * required state expected by the actual test method execution.
	 */
	void setupRegistry();

	/**
	 * Complement method to {@link #setupRegistry()} to be called after any test execution.
	 */
	void restoreRegistry();

}
