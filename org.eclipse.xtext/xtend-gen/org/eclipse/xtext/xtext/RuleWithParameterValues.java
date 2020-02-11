/**
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.xtext;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.xtend.lib.annotations.Data;
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.util.internal.EmfAdaptable;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;
import org.eclipse.xtext.xtext.ParameterConfigHelper;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
@Data
@EmfAdaptable
@SuppressWarnings("all")
public class RuleWithParameterValues {
  public static class RuleWithParameterValuesAdapter extends AdapterImpl {
    private RuleWithParameterValues element;
    
    public RuleWithParameterValuesAdapter(final RuleWithParameterValues element) {
      this.element = element;
    }
    
    public RuleWithParameterValues get() {
      return this.element;
    }
    
    @Override
    public boolean isAdapterForType(final Object object) {
      return object == RuleWithParameterValues.class;
    }
  }
  
  private final AbstractRule original;
  
  private final Set<Parameter> paramValues;
  
  @FinalFieldsConstructor
  public RuleWithParameterValues(final AbstractRule original, final Set<Parameter> paramValues) {
    super();
    this.original = original;
    this.paramValues = paramValues;
  }
  
  RuleWithParameterValues(final AbstractRule original) {
    this(original, Collections.<Parameter>emptySet());
  }
  
  public static AbstractRule getOriginalRule(final AbstractRule copy) {
    return RuleWithParameterValues.findInEmfObject(copy).getOriginal();
  }
  
  public static AbstractRule tryGetOriginalRule(final AbstractRule copy) {
    RuleWithParameterValues _findInEmfObject = RuleWithParameterValues.findInEmfObject(copy);
    AbstractRule _original = null;
    if (_findInEmfObject!=null) {
      _original=_findInEmfObject.getOriginal();
    }
    return _original;
  }
  
  public static Set<Parameter> getParamValues(final AbstractRule copy) {
    return RuleWithParameterValues.findInEmfObject(copy).getParamValues();
  }
  
  public static int getParamConfig(final AbstractRule copy) {
    final RuleWithParameterValues values = RuleWithParameterValues.findInEmfObject(copy);
    return ParameterConfigHelper.getParameterConfig(values.paramValues, ((ParserRule) values.original));
  }
  
  @Override
  @Pure
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((this.original== null) ? 0 : this.original.hashCode());
    return prime * result + ((this.paramValues== null) ? 0 : this.paramValues.hashCode());
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    RuleWithParameterValues other = (RuleWithParameterValues) obj;
    if (this.original == null) {
      if (other.original != null)
        return false;
    } else if (!this.original.equals(other.original))
      return false;
    if (this.paramValues == null) {
      if (other.paramValues != null)
        return false;
    } else if (!this.paramValues.equals(other.paramValues))
      return false;
    return true;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("original", this.original);
    b.add("paramValues", this.paramValues);
    return b.toString();
  }
  
  @Pure
  public AbstractRule getOriginal() {
    return this.original;
  }
  
  @Pure
  public Set<Parameter> getParamValues() {
    return this.paramValues;
  }
  
  public static RuleWithParameterValues findInEmfObject(final Notifier emfObject) {
    for (Adapter adapter : emfObject.eAdapters()) {
    	if (adapter instanceof RuleWithParameterValues.RuleWithParameterValuesAdapter) {
    		return ((RuleWithParameterValues.RuleWithParameterValuesAdapter) adapter).get();
    	}
    }
    return null;
  }
  
  public static RuleWithParameterValues removeFromEmfObject(final Notifier emfObject) {
    List<Adapter> adapters = emfObject.eAdapters();
    for(int i = 0, max = adapters.size(); i < max; i++) {
    	Adapter adapter = adapters.get(i);
    	if (adapter instanceof RuleWithParameterValues.RuleWithParameterValuesAdapter) {
    		emfObject.eAdapters().remove(i);
    		return ((RuleWithParameterValues.RuleWithParameterValuesAdapter) adapter).get();
    	}
    }
    return null;
  }
  
  public void attachToEmfObject(final Notifier emfObject) {
    RuleWithParameterValues result = findInEmfObject(emfObject);
    if (result != null)
    	throw new IllegalStateException("The given EMF object already contains an adapter for RuleWithParameterValues");
    RuleWithParameterValues.RuleWithParameterValuesAdapter adapter = new RuleWithParameterValues.RuleWithParameterValuesAdapter(this);
    emfObject.eAdapters().add(adapter);
  }
}
