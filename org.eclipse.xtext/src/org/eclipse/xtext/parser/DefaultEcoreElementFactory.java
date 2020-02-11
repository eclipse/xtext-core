/*******************************************************************************
 * Copyright (c) 2008 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 *******************************************************************************/
package org.eclipse.xtext.parser;

import java.util.Collection;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.ValueConverterWithValueException;
import org.eclipse.xtext.nodemodel.INode;

import com.google.inject.Inject;

/**
 * @author Sven Efftinge - Initial contribution and API
 */
public class DefaultEcoreElementFactory implements IAstFactory {

	private static final Logger log = Logger.getLogger(DefaultEcoreElementFactory.class);
	
	@Inject
	private IValueConverterService converterService;

	@Inject(optional=true)
	private ITokenToStringConverter tokenConverter;

	public IValueConverterService getConverterService() {
		return converterService;
	}

	public void setConverterService(IValueConverterService converterService) {
		this.converterService = converterService;
	}

	@Override
	public EObject create(EClassifier classifier) {
		if (classifier == null)
			throw new NullPointerException("Classifier may not be null.");
		if (!(classifier instanceof EClass))
			throw new IllegalArgumentException("Cannot create instance of datatype '" + classifier.getName() + "'");
		EClass clazz = (EClass) classifier;
		if (clazz.isAbstract() || clazz.isInterface())
			throw new IllegalArgumentException("Cannot create instance of abstract class '" + clazz.getName() + "'");
		if (classifier.eIsProxy())
			throw new IllegalStateException("Unresolved proxy "+((InternalEObject)classifier).eProxyURI()+". Make sure the EPackage has been registered.");
		return clazz.getEPackage().getEFactoryInstance().create(clazz);
	}

	@Override
	public void set(EObject object, String feature, Object value, String ruleName, INode node) throws ValueConverterException {
		final EStructuralFeature structuralFeature = object.eClass().getEStructuralFeature(feature);
		if (structuralFeature == null)
			throw new IllegalArgumentException(object.eClass().getName() + "." + feature + " does not exist");
		
		try {
			final Object tokenValue = getTokenValue(value, ruleName, node);
			checkNullForPrimitiveFeatures(structuralFeature, tokenValue, node);
			object.eSet(structuralFeature, tokenValue);
		} catch(ValueConverterWithValueException e) {
			final Object tokenValue = e.getValue();
			checkNullForPrimitiveFeatures(structuralFeature, tokenValue, node);
			object.eSet(structuralFeature, tokenValue);
			throw e;
		} catch(ValueConverterException e) {
			throw e;
		} catch(NullPointerException e) {
			log.warn(e.getMessage(), e);
			throw new ValueConverterException("A NullPointerException occured. This indicates a missing value converter or a bug in its implementation.", node, e);
		} catch(Exception e) {
			throw new ValueConverterException(null, node, e);
		}
	}

	private Object getTokenValue(Object tokenOrValue, String ruleName, INode node) throws ValueConverterException {
		Object value = getTokenAsStringIfPossible(tokenOrValue);
		if ((value == null || value instanceof CharSequence) && ruleName != null) {
			value = converterService.toValue(value == null ? null : value.toString(), ruleName, node);
		}
		return value;
	}

	protected Object getTokenAsStringIfPossible(Object tokenOrValue) {
		if (tokenConverter != null)
			return tokenConverter.getTokenAsStringIfPossible(tokenOrValue);
		return tokenOrValue;
	}

	@Override
	@SuppressWarnings("unchecked")
	public void add(EObject object, String feature, Object value, String ruleName, INode node) throws ValueConverterException {
		if (value == null)
			return;
		final EStructuralFeature structuralFeature = object.eClass().getEStructuralFeature(feature);
		if (structuralFeature == null)
			throw new IllegalArgumentException(object.eClass().getName() + "." + feature + " does not exist");
		
		try {
			if (value instanceof EObject) {
				// containment lists are unique per-se and the tokenValue was created just a sec ago
				((InternalEList<EObject>) object.eGet(structuralFeature)).addUnique((EObject) value);
			} else {
				final Object tokenValue = getTokenValue(value, ruleName, node);
				checkNullForPrimitiveFeatures(structuralFeature, value, node);
				((Collection<Object>) object.eGet(structuralFeature)).add(tokenValue);
			}
		} catch(ValueConverterWithValueException e) {
			final Object tokenValue = e.getValue();
			checkNullForPrimitiveFeatures(structuralFeature, value, node);
			((Collection<Object>) object.eGet(structuralFeature)).add(tokenValue);
			throw e;
		} catch(ValueConverterException e) {
			throw e;
		} catch(NullPointerException e) {
			log.error(e.getMessage(), e);
			throw new ValueConverterException("A NullPointerException occured. This indicates a missing value converter or a bug in its implementation.", node, e);
		} catch(Exception e) {
			throw new ValueConverterException(null, node, e);
		}
	}

	private void checkNullForPrimitiveFeatures(EStructuralFeature structuralFeature, Object tokenValue, INode node) {
		if(tokenValue == null && structuralFeature.getEType().getInstanceClass().isPrimitive()) {
			throw new ValueConverterException("ValueConverter returned null for primitive feature " + structuralFeature.getName(), node, null);
		}
	}
}
