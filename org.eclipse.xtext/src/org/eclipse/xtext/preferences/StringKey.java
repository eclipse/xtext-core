/*******************************************************************************
 * Copyright (c) 2014 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.preferences;

/**
 * @author Moritz Eysholdt - Initial contribution and API
 */
public class StringKey extends TypedPreferenceKey<String> {

	public StringKey(String id, String defaultValue) {
		super(id, defaultValue);
	}

	@Override
	public String toString(String value) {
		return value;
	}

	@Override
	public String toValue(String string) {
		return string;
	}

}
