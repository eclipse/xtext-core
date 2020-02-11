/**
 * Copyright (c) 2015, 2017 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.resource.impl;

import com.google.common.annotations.Beta;
import java.util.List;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtend.lib.annotations.ToString;
import org.eclipse.xtext.util.internal.EmfAdaptable;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

/**
 * @author Sven Efftinge - Initial contribution and API
 * 
 * @since 2.9
 */
@Beta
@ToString
@EmfAdaptable
@SuppressWarnings("all")
public class ProjectDescription {
  public static class ProjectDescriptionAdapter extends AdapterImpl {
    private ProjectDescription element;
    
    public ProjectDescriptionAdapter(final ProjectDescription element) {
      this.element = element;
    }
    
    public ProjectDescription get() {
      return this.element;
    }
    
    @Override
    public boolean isAdapterForType(final Object object) {
      return object == ProjectDescription.class;
    }
  }
  
  /**
   * A unique name for this project
   */
  @Accessors
  private String name;
  
  /**
   * list of logical names of upstream dependencies
   */
  @Accessors
  private List<String> dependencies = CollectionLiterals.<String>newArrayList();
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("name", this.name);
    b.add("dependencies", this.dependencies);
    return b.toString();
  }
  
  public static ProjectDescription findInEmfObject(final Notifier emfObject) {
    for (Adapter adapter : emfObject.eAdapters()) {
    	if (adapter instanceof ProjectDescription.ProjectDescriptionAdapter) {
    		return ((ProjectDescription.ProjectDescriptionAdapter) adapter).get();
    	}
    }
    return null;
  }
  
  public static ProjectDescription removeFromEmfObject(final Notifier emfObject) {
    List<Adapter> adapters = emfObject.eAdapters();
    for(int i = 0, max = adapters.size(); i < max; i++) {
    	Adapter adapter = adapters.get(i);
    	if (adapter instanceof ProjectDescription.ProjectDescriptionAdapter) {
    		emfObject.eAdapters().remove(i);
    		return ((ProjectDescription.ProjectDescriptionAdapter) adapter).get();
    	}
    }
    return null;
  }
  
  public void attachToEmfObject(final Notifier emfObject) {
    ProjectDescription result = findInEmfObject(emfObject);
    if (result != null)
    	throw new IllegalStateException("The given EMF object already contains an adapter for ProjectDescription");
    ProjectDescription.ProjectDescriptionAdapter adapter = new ProjectDescription.ProjectDescriptionAdapter(this);
    emfObject.eAdapters().add(adapter);
  }
  
  @Pure
  public String getName() {
    return this.name;
  }
  
  public void setName(final String name) {
    this.name = name;
  }
  
  @Pure
  public List<String> getDependencies() {
    return this.dependencies;
  }
  
  public void setDependencies(final List<String> dependencies) {
    this.dependencies = dependencies;
  }
}
