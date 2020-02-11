/**
 * Copyright (c) 2015, 2017 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.xtext.generator;

/**
 * Use this to report configuration problems during the {@link IXtextGeneratorFragment#checkConfiguration(Issues)} phase.
 */
@SuppressWarnings("all")
public interface Issues {
  void addError(final String message);
  
  void addError(final String message, final Object source);
  
  void addWarning(final String message);
  
  void addWarning(final String message, final Object source);
}
