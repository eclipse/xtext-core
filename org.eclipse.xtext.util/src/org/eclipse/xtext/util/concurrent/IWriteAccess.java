/*******************************************************************************
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.util.concurrent;

/**
 * @author Sven Efftinge - Initial contribution and API
 * @author Jan Koehnlein - Separated read and write access
 */
public interface IWriteAccess<P> {

	/**
	 * @deprecated use {@link #modify(Object, IUnitOfWork)} instead
	 */
	@Deprecated
	public <T> T modify(IUnitOfWork<T,P> work);

	/**
	 * @return Whether the {@code work} was processed or not
	 * @since 2.14
	 */
	public boolean modify(IUnitOfWork.Void<P> work);

	/**
	 * Performs a unit of work safely.
	 * 
	 * @return The result of performing the unit of {@code work}, or
	 * {@code defaultValue} if the parameter for the unit of {@code work} was null
	 * 
	 * @since 2.14
	 */
	public <T> T modify(T defaultValue, IUnitOfWork<T,P> work);
}
