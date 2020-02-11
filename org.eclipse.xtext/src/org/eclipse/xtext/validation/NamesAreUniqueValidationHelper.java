/*******************************************************************************
 * Copyright (c) 2009 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.validation;

import java.util.Iterator;

import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.util.SimpleAttributeResolver;

import java.util.Map;

import javax.inject.Inject;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.service.OperationCanceledManager;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public class NamesAreUniqueValidationHelper implements INamesAreUniqueValidationHelper {

	private ImmutableSet<EClass> clusterTypes = getClusterTypes();
	
	@Inject 
	private OperationCanceledManager operationCanceledManager = new OperationCanceledManager();
	
	/**
	 * <p>Initialize the set of clustering types. A type is considered to be clustering
	 * if any instance of that type has to have a unique name when
	 * it is transformed to an {@link org.eclipse.xtext.resource.IEObjectDescription}.
	 * Instances that do not belong to the same cluster may have the same exported name.</p>
	 * <p>A clustering type will often be some kind of root type in a type hierarchy.</p> 
	 */
	protected ImmutableSet<EClass> getClusterTypes() {
		return ImmutableSet.of(EcorePackage.Literals.EOBJECT);
	}
	
	@Override
	public void checkUniqueNames(Iterable<IEObjectDescription> descriptions, 
			ValidationMessageAcceptor acceptor) {
		checkUniqueNames(descriptions, null, acceptor);
	}
	
	/**
	 * <p>
	 * {@inheritDoc}
	 * </p>
	 * The cancel indicator will be queried everytime a description has been processed.
	 * It should provide a fast answer about its canceled state.
	 */
	@Override
	public void checkUniqueNames(Iterable<IEObjectDescription> descriptions, 
			CancelIndicator cancelIndicator, 
			ValidationMessageAcceptor acceptor) {
		Iterator<IEObjectDescription> iter = descriptions.iterator();
		if (!iter.hasNext())
			return;
		Map<EClass, Map<QualifiedName, IEObjectDescription>> clusterToNames = Maps.newHashMap();
		while(iter.hasNext()) {
			IEObjectDescription description = iter.next();
			checkDescriptionForDuplicatedName(description, clusterToNames, acceptor);
			operationCanceledManager.checkCanceled(cancelIndicator);
		}
	}
	
	protected void checkDescriptionForDuplicatedName(
			IEObjectDescription description,
			Map<EClass, Map<QualifiedName, IEObjectDescription>> clusterTypeToName,
			ValidationMessageAcceptor acceptor) {
		EObject object = description.getEObjectOrProxy();
		EClass eClass = object.eClass();
		QualifiedName qualifiedName = description.getName();
		EClass clusterType = getAssociatedClusterType(eClass);
		Map<QualifiedName, IEObjectDescription> nameToDescription = clusterTypeToName.get(clusterType);
		if (nameToDescription == null) {
			nameToDescription = Maps.newHashMap();
			nameToDescription.put(qualifiedName, description);
			clusterTypeToName.put(clusterType, nameToDescription);
		} else {
			if (nameToDescription.containsKey(qualifiedName)) {
				IEObjectDescription prevDescription = nameToDescription.get(qualifiedName);
				if (prevDescription != null) {
					createDuplicateNameError(prevDescription, clusterType, acceptor);
					nameToDescription.put(qualifiedName, null);
				}
				createDuplicateNameError(description, clusterType, acceptor);
			} else {
				nameToDescription.put(qualifiedName, description);
			}
		}
	}
	
	protected void createDuplicateNameError(IEObjectDescription description, EClass clusterType, ValidationMessageAcceptor acceptor) {
		EObject object = description.getEObjectOrProxy();
		EStructuralFeature feature = getNameFeature(object);
		acceptor.acceptError(
				getDuplicateNameErrorMessage(description, clusterType, feature), 
				object, 
				feature,
				ValidationMessageAcceptor.INSIGNIFICANT_INDEX,
				getErrorCode());
	}

	/**
	 * Returns <code>null</code>. Clients may override if they desire to attach an error code to the created errors. 
	 */
	protected String getErrorCode() {
		// TODO use built-in codes to allow generic quickfixes
		return null;
	}

	/**
	 * Build the error message for duplicated names. The default implementation will provider error messages 
	 * of this form:
	 * <ul>
	 * <li>Duplicate Entity 'Sample'</li>
	 * <li>Duplicate Property 'Sample' in Entity 'EntityName'</li>
	 * </ul>
	 * If the container information will be helpful to locate the error or to understand the error
	 * it will be used, otherwise only the simple format will be build. Clients may override different
	 * methods that influence the error message.
	 * @see #getNameFeature(EObject)
	 * @see #getTypeLabel(EClass)
	 * @see #getContainerForErrorMessage(EObject)
	 * @see #isContainerInformationHelpful(IEObjectDescription, String)
	 * @see #isContainerInformationHelpful(IEObjectDescription, EObject, String, EStructuralFeature)
	 */
	public String getDuplicateNameErrorMessage(IEObjectDescription description, EClass clusterType, EStructuralFeature feature) {
		EObject object = description.getEObjectOrProxy();
		String shortName = String.valueOf(feature != null ? object.eGet(feature) : "<unnamed>");
		StringBuilder result = new StringBuilder(64);
		result.append("Duplicate ");
		result.append(getTypeLabel(clusterType));
		result.append(" '");
		result.append(shortName);
		result.append("'");
		if (isContainerInformationHelpful(description, shortName)) {
			EObject container = getContainerForErrorMessage(object);
			if (container != null) {
				String containerTypeLabel = getTypeLabel(container.eClass());
				EStructuralFeature containerNameFeature = getNameFeature(container);
				if (isContainerInformationHelpful(description, container, containerTypeLabel, containerNameFeature)) {
					result.append(" in ");
					result.append(containerTypeLabel);
					if (containerNameFeature != null) {
						String containerName = String.valueOf(container.eGet(containerNameFeature));
						if (containerName != null) {
							result.append(" '");
							result.append(containerName);
							result.append("'");
						}
					}
				}
			} 
		}
		return result.toString();
	}

	protected boolean isContainerInformationHelpful(IEObjectDescription description, EObject container, 
			String containerTypeLabel, EStructuralFeature containerNameFeature) {
		return containerTypeLabel != null && containerNameFeature != null;
	}

	protected boolean isContainerInformationHelpful(IEObjectDescription description, String shortName) {
		return true;
	}

	protected EObject getContainerForErrorMessage(EObject object) {
		return object.eContainer();
	}

	protected String getTypeLabel(EClass eClass) {
		String name = eClass.getName();
		return name;
	}
	
	protected EStructuralFeature getNameFeature(EObject object) {
		return SimpleAttributeResolver.NAME_RESOLVER.getAttribute(object);
	}
	
	/**
	 * Return the type that describes the set of instances that should have unique names.
	 * The default information will return the topmost type or the first super type that is contained
	 * in the set of cluster types ({@link NamesAreUniqueValidationHelper#getClusterTypes()}). 
	 * Only the first super type will be taken into account when walking the hierarchy.
	 */
	protected EClass getAssociatedClusterType(EClass eClass) {
		if (clusterTypes.contains(eClass))
			return eClass;
		EList<EClass> superTypes = eClass.getESuperTypes();
		if (superTypes.isEmpty())
			return eClass;
		return getAssociatedClusterType(superTypes.get(0));
	}
	
}
