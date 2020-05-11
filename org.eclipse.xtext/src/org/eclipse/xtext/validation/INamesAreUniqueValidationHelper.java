/*******************************************************************************
 * Copyright (c) 2009 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.validation;

import java.util.Collection;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.ISelectable;
import org.eclipse.xtext.resource.IResourceDescription.Delta;
import org.eclipse.xtext.resource.impl.IsAffectedExtension;
import org.eclipse.xtext.scoping.ICaseInsensitivityHelper;
import org.eclipse.xtext.util.CancelIndicator;

import com.google.inject.ImplementedBy;

/**
 * The helper can be used to validate unique names locally or across resource boundaries.
 * 
 * @see LocalUniqueNameContext
 * @author Sebastian Zarnekow - Initial contribution and API
 */
@ImplementedBy(NamesAreUniqueValidationHelper.class)
public interface INamesAreUniqueValidationHelper {

	/**
	 * Provide the context information for the unique name validation.
	 * 
	 * @since 2.22
	 */
	@ImplementedBy(DefaultUniqueNameContext.ExportedFromResource.class)
	interface ContextProvider extends IsAffectedExtension {
		
		/**
		 * Obtain the context of the unique name validation for the given resource.
		 * 
		 * May be return null.
		 */
		Context tryGetContext(Resource resource, CancelIndicator cancelIndicator);
		
		@Override
		default boolean isAffected(Collection<Delta> deltas, IResourceDescription candidate,
				IResourceDescriptions context) {
			return false;
		}
	}
	
	/**
	 * Provides context information to the validation that allows to introspect the scope in which
	 * the validation for unique names is supposed to happen.
	 * 
	 * The term <code>clusterType</code> is used to denote a EClass (super-)type of the current object
	 * under validation. When checking the name for uniqueness, the objects that fulfil the given cluster
	 * type are considered. This can be used to define different namespaces. For example, a language that
	 * has the concepts of <code>Fields</code>, <code>Procedures</code> and 
	 * <code>Functions</code> may provide two different cluster types. All fields must have a unique name
	 * and the executable <code>Procedures</code> and <code>Functions</code> use the same namespace and may
	 * not have duplicate names. 
	 * 
	 * @since 2.22
	 */
	interface Context {
		/**
		 * Return a {@link ISelectable} that can be queried for elements with a given name to find duplicates.
		 * Depending on the type of objects that have to have unique names, different selectables must be returned.
		 * 
		 * Some objects must be unique per project, others must be globally unique or only unique per file.
		 * This API allows to fine tune the scope of the validation. 
		 * 
		 * @param description the description of the validated object.
		 * @param clusterType the root type of the validated type hierarchy.
		 * @return the validation scope. 
		 */
		ISelectable getValidationScope(IEObjectDescription description, EClass clusterType);
		
		/**
		 * Return the objects that should be checked for uniqueness in the context of their {@link #getValidationScope(EClass)}.
		 */
		Iterable<IEObjectDescription> getObjectsToValidate();
		
		/**
		 * The cancel-indicator that shall be used.
		 */
		CancelIndicator cancelIndicator();
		
		/**
		 * Answers whether the names in the given cluster must be treated in a case
		 * sensistive or insensitive manner. 
		 * 
		 * @see ICaseInsensitivityHelper
		 */
		default boolean isCaseSensitive(EObject object, EClass clusterType) {
			return true;
		}
		
		/**
		 * Context implementations that do know from their construction if they will or won't 
		 * contain any duplicates, can override {@link #isUnique()} to provide a more efficient means
		 * to validate all {@link #getObjectsToValidate() candidates} at once.
		 */
		default boolean isUnique() {
			return false;
		}
	}
	
	/**
	 * Create errors for objects that have the same name. Objects, that do not belong to
	 * the same cluster will not get any errors.
	 * @see INamesAreUniqueValidationHelper#checkUniqueNames(Iterable, CancelIndicator, ValidationMessageAcceptor)
	 * 
	 * @deprecated Implementations should adhere to the context provided via {@link #checkUniqueNames(Iterable, Context, ValidationMessageAcceptor)}
	 */
	@Deprecated
	default void checkUniqueNames(Iterable<IEObjectDescription> descriptions, ValidationMessageAcceptor acceptor) {
		checkUniqueNames(descriptions, (CancelIndicator) null, acceptor);
	}
	
	/**
	 * Create errors for objects that have the same name. Objects, that do not belong to
	 * the same cluster will not get any errors. The cancel indicator may be used to interrupt 
	 * the validation.
	 * 
	 * @deprecated Implementations should adhere to the context provided via {@link #checkUniqueNames(Iterable, Context, ValidationMessageAcceptor)}
	 */
	@Deprecated
	void checkUniqueNames(Iterable<IEObjectDescription> descriptions, CancelIndicator cancelIndicator, ValidationMessageAcceptor acceptor);
	
	/**
	 * Create errors for objects that have the same name. Objects, that do not belong to
	 * the same cluster will not get any errors. The cancel indicator may be used to interrupt 
	 * the validation.
	 * 
	 * @since 2.22
	 */
	default void checkUniqueNames(Context context, ValidationMessageAcceptor acceptor) {
		checkUniqueNames(context.getObjectsToValidate(), context.cancelIndicator(), acceptor);
	}

}
