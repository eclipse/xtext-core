/**
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.xtext.wizard;

import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xtext.wizard.EPackageInfo;

@Accessors
@SuppressWarnings("all")
public class Ecore2XtextConfiguration {
  private final Set<EPackageInfo> ePackageInfos = CollectionLiterals.<EPackageInfo>newHashSet();
  
  private EPackageInfo defaultEPackageInfo;
  
  private EClass rootElementClass;
  
  @Pure
  public Set<EPackageInfo> getEPackageInfos() {
    return this.ePackageInfos;
  }
  
  @Pure
  public EPackageInfo getDefaultEPackageInfo() {
    return this.defaultEPackageInfo;
  }
  
  public void setDefaultEPackageInfo(final EPackageInfo defaultEPackageInfo) {
    this.defaultEPackageInfo = defaultEPackageInfo;
  }
  
  @Pure
  public EClass getRootElementClass() {
    return this.rootElementClass;
  }
  
  public void setRootElementClass(final EClass rootElementClass) {
    this.rootElementClass = rootElementClass;
  }
}
