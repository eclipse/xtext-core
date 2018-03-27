/*******************************************************************************
 * Copyright (c) 2008 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.xtext.util.concurrent;

/**
 * @author Sven Efftinge - Initial contribution and API
 * @author Jan Koehnlein - Separated read and write access
 */
public interface IReadAccess<P> {
	
	/**
	 * @deprecated use {@link #readOnly(Object, IUnitOfWork)} instead.
	 */
	@Deprecated
	<T> T readOnly(IUnitOfWork<T,P> work);
	
	/**
	 * @return Whether the {@code work} was processed or not
	 * @since 2.14
	 */
	boolean readOnly(IUnitOfWork.Void<P> work);
	
	/**
	 * Performs a unit of work safely.
	 * 
	 * @return The result of performing the unit of {@code work}, or
	 * {@code defaultValue} if the parameter for the unit of {@code work} was null
	 * 
	 * @since 2.14
	 */
	<T> T readOnly(T defaultValue, IUnitOfWork<T,P> work);
	
	/**
	 * Cancels all cancelable readers before executing the {@link IUnitOfWork}.
	 * For interactive jobs that need fastest possible execution.
	 *   
	 * @since 2.7
	 * @see CancelableUnitOfWork
	 */
	interface Priority<P> {
		/**
		 * @deprecated use {@link #priorityReadOnly(Object, IUnitOfWork)} instead
		 */
		@Deprecated
		<T> T priorityReadOnly(IUnitOfWork<T,P> work);
		
		/**
		 * @return Whether the {@code work} was processed or not
		 * @since 2.14
		 */
		boolean priorityReadOnly(IUnitOfWork.Void<P> work);
		
		/**
		 * Performs a unit of work safely.
		 * 
		 * @return The result of performing the unit of {@code work}, or
		 * {@code defaultValue} if the parameter for the unit of {@code work} was null
		 * 
		 * @since 2.14
		 */
		<T> T priorityReadOnly(T defaultValue, IUnitOfWork<T,P> work);
	}
}
