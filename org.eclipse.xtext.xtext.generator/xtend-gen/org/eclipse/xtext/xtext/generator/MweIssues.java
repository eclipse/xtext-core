/**
 * Copyright (c) 2015, 2017 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.xtext.generator;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xtext.generator.Issues;
import org.eclipse.xtext.xtext.generator.XtextGenerator;

/**
 * {@link Issues} implementation for MWE2 workflows.
 */
@FinalFieldsConstructor
@SuppressWarnings("all")
public class MweIssues implements Issues {
  @Accessors
  private final XtextGenerator owner;
  
  @Accessors
  private final org.eclipse.emf.mwe.core.issues.Issues delegate;
  
  @Override
  public void addError(final String message) {
    this.delegate.addError(this.owner, message);
  }
  
  @Override
  public void addError(final String message, final Object source) {
    this.delegate.addError(this.owner, message, source);
  }
  
  @Override
  public void addWarning(final String message) {
    this.delegate.addWarning(this.owner, message);
  }
  
  @Override
  public void addWarning(final String message, final Object source) {
    this.delegate.addWarning(this.owner, message, source);
  }
  
  public MweIssues(final XtextGenerator owner, final org.eclipse.emf.mwe.core.issues.Issues delegate) {
    super();
    this.owner = owner;
    this.delegate = delegate;
  }
  
  @Pure
  public XtextGenerator getOwner() {
    return this.owner;
  }
  
  @Pure
  public org.eclipse.emf.mwe.core.issues.Issues getDelegate() {
    return this.delegate;
  }
}
