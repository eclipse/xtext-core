/**
 * Copyright (c) 2015, 2019 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.service;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import com.google.inject.BindingAnnotation;

/**
 * An annotation marking a binding as language specific in contrast to a global service.
 *
 * @since 2.9
 * @author kosyakov - Initial contribution and API
 */
@Retention(RetentionPolicy.RUNTIME)
@BindingAnnotation
public @interface LanguageSpecific {
}
