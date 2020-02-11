/**
 * Copyright (c) 2015, 2017 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.xtext.generator.model.project;

import com.google.inject.Inject;
import com.google.inject.Injector;
import org.eclipse.xtend.lib.annotations.AccessorType;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xtext.generator.Issues;
import org.eclipse.xtext.xtext.generator.model.IXtextGeneratorFileSystemAccess;
import org.eclipse.xtext.xtext.generator.model.project.ISubProjectConfig;
import org.eclipse.xtext.xtext.generator.model.project.XtextProjectConfig;

/**
 * Configuration of subprojects.
 * 
 * @noextend This class should not be extended by clients.
 */
@SuppressWarnings("all")
public class SubProjectConfig implements ISubProjectConfig {
  @Inject
  @Accessors(AccessorType.PUBLIC_GETTER)
  private XtextProjectConfig owner;
  
  @Accessors
  private boolean enabled;
  
  @Accessors
  private boolean overwriteSrc;
  
  @Accessors
  private String name;
  
  @Accessors(AccessorType.PUBLIC_GETTER)
  private String rootPath;
  
  @Accessors(AccessorType.PUBLIC_GETTER)
  private IXtextGeneratorFileSystemAccess root;
  
  @Accessors(AccessorType.PUBLIC_GETTER)
  private String metaInfPath;
  
  @Accessors(AccessorType.PUBLIC_GETTER)
  private IXtextGeneratorFileSystemAccess metaInf;
  
  @Accessors(AccessorType.PUBLIC_GETTER)
  private String srcPath;
  
  @Accessors(AccessorType.PUBLIC_GETTER)
  private IXtextGeneratorFileSystemAccess src;
  
  @Accessors(AccessorType.PUBLIC_GETTER)
  private String srcGenPath;
  
  @Accessors(AccessorType.PUBLIC_GETTER)
  private IXtextGeneratorFileSystemAccess srcGen;
  
  @Accessors(AccessorType.PUBLIC_GETTER)
  private String iconsPath;
  
  @Accessors(AccessorType.PUBLIC_GETTER)
  private IXtextGeneratorFileSystemAccess icons;
  
  public void setRoot(final String path) {
    this.rootPath = path;
  }
  
  public void setMetaInf(final String path) {
    this.metaInfPath = path;
  }
  
  public void setSrc(final String path) {
    this.srcPath = path;
  }
  
  public void setSrcGen(final String path) {
    this.srcGenPath = path;
  }
  
  public void setIcons(final String path) {
    this.iconsPath = path;
  }
  
  public void checkConfiguration(final Issues issues) {
  }
  
  @Override
  public void initialize(final Injector injector) {
    injector.injectMembers(this);
    boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(this.rootPath);
    boolean _not = (!_isNullOrEmpty);
    if (_not) {
      this.root = this.owner.newFileSystemAccess(this.rootPath, true);
      this.root.initialize(injector);
    }
    boolean _isNullOrEmpty_1 = StringExtensions.isNullOrEmpty(this.metaInfPath);
    boolean _not_1 = (!_isNullOrEmpty_1);
    if (_not_1) {
      this.metaInf = this.owner.newFileSystemAccess(this.metaInfPath, true);
      this.metaInf.initialize(injector);
    }
    boolean _isNullOrEmpty_2 = StringExtensions.isNullOrEmpty(this.srcPath);
    boolean _not_2 = (!_isNullOrEmpty_2);
    if (_not_2) {
      this.src = this.owner.newFileSystemAccess(this.srcPath, this.overwriteSrc);
      this.src.initialize(injector);
    }
    boolean _isNullOrEmpty_3 = StringExtensions.isNullOrEmpty(this.srcGenPath);
    boolean _not_3 = (!_isNullOrEmpty_3);
    if (_not_3) {
      this.srcGen = this.owner.newFileSystemAccess(this.srcGenPath, true);
      this.srcGen.initialize(injector);
    }
    boolean _isNullOrEmpty_4 = StringExtensions.isNullOrEmpty(this.iconsPath);
    boolean _not_4 = (!_isNullOrEmpty_4);
    if (_not_4) {
      this.icons = this.owner.newFileSystemAccess(this.iconsPath, true);
      this.icons.initialize(injector);
    }
  }
  
  @Pure
  public XtextProjectConfig getOwner() {
    return this.owner;
  }
  
  @Pure
  public boolean isEnabled() {
    return this.enabled;
  }
  
  public void setEnabled(final boolean enabled) {
    this.enabled = enabled;
  }
  
  @Pure
  public boolean isOverwriteSrc() {
    return this.overwriteSrc;
  }
  
  public void setOverwriteSrc(final boolean overwriteSrc) {
    this.overwriteSrc = overwriteSrc;
  }
  
  @Pure
  public String getName() {
    return this.name;
  }
  
  public void setName(final String name) {
    this.name = name;
  }
  
  @Pure
  public String getRootPath() {
    return this.rootPath;
  }
  
  @Pure
  public IXtextGeneratorFileSystemAccess getRoot() {
    return this.root;
  }
  
  @Pure
  public String getMetaInfPath() {
    return this.metaInfPath;
  }
  
  @Pure
  public IXtextGeneratorFileSystemAccess getMetaInf() {
    return this.metaInf;
  }
  
  @Pure
  public String getSrcPath() {
    return this.srcPath;
  }
  
  @Pure
  public IXtextGeneratorFileSystemAccess getSrc() {
    return this.src;
  }
  
  @Pure
  public String getSrcGenPath() {
    return this.srcGenPath;
  }
  
  @Pure
  public IXtextGeneratorFileSystemAccess getSrcGen() {
    return this.srcGen;
  }
  
  @Pure
  public String getIconsPath() {
    return this.iconsPath;
  }
  
  @Pure
  public IXtextGeneratorFileSystemAccess getIcons() {
    return this.icons;
  }
}
