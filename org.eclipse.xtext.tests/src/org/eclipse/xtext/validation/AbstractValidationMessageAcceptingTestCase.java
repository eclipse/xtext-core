/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.validation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.tests.AbstractXtextTests;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public abstract class AbstractValidationMessageAcceptingTestCase extends AbstractXtextTests implements ValidationMessageAcceptor {

	@Override
	public void acceptError(String message, EObject object, EStructuralFeature feature, int index, String code,
			String... issueData) {
		fail(message);
	}

	@Override
	public void acceptError(String message, EObject object, int offset, int length, String code, String... issueData) {
		fail(message);
	}

	@Override
	public void acceptWarning(String message, EObject object, EStructuralFeature feature, int index, String code,
			String... issueData) {
		fail(message);
	}

	@Override
	public void acceptWarning(String message, EObject object, int offset, int length, String code, String... issueData) {
		fail(message);
	}

	@Override
	public void acceptInfo(String message, EObject object, EStructuralFeature feature, int index, String code,
			String... issueData) {
		fail(message);
	}

	@Override
	public void acceptInfo(String message, EObject object, int offset, int length, String code, String... issueData) {
		fail(message);
	}
}
