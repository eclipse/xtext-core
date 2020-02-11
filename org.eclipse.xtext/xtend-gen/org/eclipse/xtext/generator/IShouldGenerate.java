/**
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.generator;

import com.google.common.annotations.Beta;
import com.google.common.base.Objects;
import com.google.inject.ImplementedBy;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * @author Sven Efftinge - Initial contribution and API
 * 
 * @since 2.9
 */
@Beta
@ImplementedBy(IShouldGenerate.OnlyWithoutErrors.class)
@SuppressWarnings("all")
public interface IShouldGenerate {
  @Beta
  @Singleton
  class OnlyWithoutErrors implements IShouldGenerate {
    @Inject
    private IResourceValidator resourceValidator;
    
    @Override
    public boolean shouldGenerate(final Resource resource, final CancelIndicator cancelIndicator) {
      boolean _isEmpty = resource.getErrors().isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        return false;
      }
      final List<Issue> issues = this.resourceValidator.validate(resource, CheckMode.NORMAL_AND_FAST, cancelIndicator);
      final Function1<Issue, Boolean> _function = (Issue it) -> {
        Severity _severity = it.getSeverity();
        return Boolean.valueOf(Objects.equal(_severity, Severity.ERROR));
      };
      boolean _exists = IterableExtensions.<Issue>exists(issues, _function);
      return (!_exists);
    }
  }
  
  @Beta
  @Singleton
  class Always implements IShouldGenerate {
    @Override
    public boolean shouldGenerate(final Resource resource, final CancelIndicator cancelIndicator) {
      return true;
    }
  }
  
  /**
   * whether code should be generated for this resource.
   */
  boolean shouldGenerate(final Resource resource, final CancelIndicator cancelIndicator);
}
