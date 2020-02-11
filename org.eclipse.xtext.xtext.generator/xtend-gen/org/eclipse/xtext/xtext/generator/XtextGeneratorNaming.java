/**
 * Copyright (c) 2015, 2017 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.xtext.generator;

import com.google.inject.Inject;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xtext.generator.model.TypeReference;
import org.eclipse.xtext.xtext.generator.model.project.IXtextProjectConfig;

/**
 * Configuration of the names of the generated classes. Create a subclass and register it with a specialized
 * {@link DefaultGeneratorModule} in order to customize some class or package names.
 */
@SuppressWarnings("all")
public class XtextGeneratorNaming {
  @Inject
  private IXtextProjectConfig projectConfig;
  
  public String getRuntimeBasePackage(final Grammar grammar) {
    return GrammarUtil.getNamespace(grammar);
  }
  
  public String getRuntimeTestBasePackage(final Grammar grammar) {
    String _runtimeBasePackage = this.getRuntimeBasePackage(grammar);
    return (_runtimeBasePackage + ".tests");
  }
  
  public TypeReference getRuntimeModule(final Grammar grammar) {
    String _runtimeBasePackage = this.getRuntimeBasePackage(grammar);
    String _simpleName = GrammarUtil.getSimpleName(grammar);
    String _plus = (_simpleName + "RuntimeModule");
    return new TypeReference(_runtimeBasePackage, _plus);
  }
  
  public TypeReference getRuntimeGenModule(final Grammar grammar) {
    String _runtimeBasePackage = this.getRuntimeBasePackage(grammar);
    String _simpleName = GrammarUtil.getSimpleName(grammar);
    String _plus = ("Abstract" + _simpleName);
    String _plus_1 = (_plus + "RuntimeModule");
    return new TypeReference(_runtimeBasePackage, _plus_1);
  }
  
  public TypeReference getRuntimeDefaultModule(final Grammar grammar) {
    return new TypeReference("org.eclipse.xtext.service.DefaultRuntimeModule");
  }
  
  public TypeReference getRuntimeSetup(final Grammar grammar) {
    String _runtimeBasePackage = this.getRuntimeBasePackage(grammar);
    String _simpleName = GrammarUtil.getSimpleName(grammar);
    String _plus = (_simpleName + "StandaloneSetup");
    return new TypeReference(_runtimeBasePackage, _plus);
  }
  
  public TypeReference getRuntimeGenSetup(final Grammar grammar) {
    String _runtimeBasePackage = this.getRuntimeBasePackage(grammar);
    String _simpleName = GrammarUtil.getSimpleName(grammar);
    String _plus = (_simpleName + "StandaloneSetupGenerated");
    return new TypeReference(_runtimeBasePackage, _plus);
  }
  
  public String getGenericIdeBasePackage(final Grammar grammar) {
    String _runtimeBasePackage = this.getRuntimeBasePackage(grammar);
    return (_runtimeBasePackage + ".ide");
  }
  
  public String getGenericIdeTestBasePackage(final Grammar grammar) {
    String _genericIdeBasePackage = this.getGenericIdeBasePackage(grammar);
    return (_genericIdeBasePackage + ".tests");
  }
  
  public TypeReference getGenericIdeModule(final Grammar grammar) {
    String _genericIdeBasePackage = this.getGenericIdeBasePackage(grammar);
    String _simpleName = GrammarUtil.getSimpleName(grammar);
    String _plus = (_simpleName + "IdeModule");
    return new TypeReference(_genericIdeBasePackage, _plus);
  }
  
  public TypeReference getGenericIdeGenModule(final Grammar grammar) {
    String _genericIdeBasePackage = this.getGenericIdeBasePackage(grammar);
    String _simpleName = GrammarUtil.getSimpleName(grammar);
    String _plus = ("Abstract" + _simpleName);
    String _plus_1 = (_plus + "IdeModule");
    return new TypeReference(_genericIdeBasePackage, _plus_1);
  }
  
  public TypeReference getGenericIdeDefaultModule(final Grammar grammar) {
    return new TypeReference("org.eclipse.xtext.ide.DefaultIdeModule");
  }
  
  public TypeReference getGenericIdeSetup(final Grammar grammar) {
    String _genericIdeBasePackage = this.getGenericIdeBasePackage(grammar);
    String _simpleName = GrammarUtil.getSimpleName(grammar);
    String _plus = (_simpleName + "IdeSetup");
    return new TypeReference(_genericIdeBasePackage, _plus);
  }
  
  public String getEclipsePluginBasePackage(final Grammar grammar) {
    String _namespace = GrammarUtil.getNamespace(grammar);
    return (_namespace + ".ui");
  }
  
  public String getEclipsePluginTestBasePackage(final Grammar grammar) {
    String _eclipsePluginBasePackage = this.getEclipsePluginBasePackage(grammar);
    return (_eclipsePluginBasePackage + ".tests");
  }
  
  public TypeReference getEclipsePluginModule(final Grammar grammar) {
    String _eclipsePluginBasePackage = this.getEclipsePluginBasePackage(grammar);
    String _simpleName = GrammarUtil.getSimpleName(grammar);
    String _plus = (_simpleName + "UiModule");
    return new TypeReference(_eclipsePluginBasePackage, _plus);
  }
  
  public TypeReference getEclipsePluginGenModule(final Grammar grammar) {
    String _eclipsePluginBasePackage = this.getEclipsePluginBasePackage(grammar);
    String _simpleName = GrammarUtil.getSimpleName(grammar);
    String _plus = ("Abstract" + _simpleName);
    String _plus_1 = (_plus + "UiModule");
    return new TypeReference(_eclipsePluginBasePackage, _plus_1);
  }
  
  public TypeReference getEclipsePluginDefaultModule(final Grammar grammar) {
    return new TypeReference("org.eclipse.xtext.ui.DefaultUiModule");
  }
  
  public TypeReference getEclipsePluginExecutableExtensionFactory(final Grammar grammar) {
    String _eclipsePluginBasePackage = this.getEclipsePluginBasePackage(grammar);
    String _simpleName = GrammarUtil.getSimpleName(grammar);
    String _plus = (_simpleName + "ExecutableExtensionFactory");
    return new TypeReference(_eclipsePluginBasePackage, _plus);
  }
  
  public TypeReference getEclipsePluginEditor(final Grammar grammar) {
    String _eclipsePluginBasePackage = this.getEclipsePluginBasePackage(grammar);
    String _plus = (_eclipsePluginBasePackage + ".editor");
    String _simpleName = GrammarUtil.getSimpleName(grammar);
    String _plus_1 = (_simpleName + "Editor");
    return new TypeReference(_plus, _plus_1);
  }
  
  public TypeReference getEclipsePluginXbaseEditor(final Grammar grammar) {
    return new TypeReference("org.eclipse.xtext.xbase.ui.editor.XbaseEditor");
  }
  
  public TypeReference getEclipsePluginDefaultEditor(final Grammar grammar) {
    return new TypeReference("org.eclipse.xtext.ui.editor.XtextEditor");
  }
  
  /**
   * @return name for the eclipsePlugin Activator or <code>null</code> if eclipsePlugin has no name
   */
  public TypeReference getEclipsePluginActivator() {
    TypeReference _xblockexpression = null;
    {
      final String pluginName = this.projectConfig.getEclipsePlugin().getName();
      if ((pluginName == null)) {
        return null;
      }
      String activatorName = pluginName.replaceAll("\\.ui$", "");
      int _lastIndexOf = activatorName.lastIndexOf(".");
      int _plus = (_lastIndexOf + 1);
      String _firstUpper = StringExtensions.toFirstUpper(activatorName.substring(_plus));
      String _plus_1 = (_firstUpper + "Activator");
      activatorName = _plus_1;
      _xblockexpression = new TypeReference((pluginName + ".internal"), activatorName);
    }
    return _xblockexpression;
  }
  
  public String getIdeaBasePackage(final Grammar grammar) {
    String _namespace = GrammarUtil.getNamespace(grammar);
    return (_namespace + ".idea");
  }
  
  public TypeReference getIdeaModule(final Grammar grammar) {
    String _ideaBasePackage = this.getIdeaBasePackage(grammar);
    String _simpleName = GrammarUtil.getSimpleName(grammar);
    String _plus = (_simpleName + "IdeaModule");
    return new TypeReference(_ideaBasePackage, _plus);
  }
  
  public TypeReference getIdeaDefaultModule(final Grammar grammar) {
    return new TypeReference("org.eclipse.xtext.idea.DefaultIdeaModule");
  }
  
  public TypeReference getIdeaGenModule(final Grammar grammar) {
    String _ideaBasePackage = this.getIdeaBasePackage(grammar);
    String _simpleName = GrammarUtil.getSimpleName(grammar);
    String _plus = ("Abstract" + _simpleName);
    String _plus_1 = (_plus + "IdeaModule");
    return new TypeReference(_ideaBasePackage, _plus_1);
  }
  
  public TypeReference getIdeaStandaloneSetup(final Grammar grammar) {
    String _ideaBasePackage = this.getIdeaBasePackage(grammar);
    String _simpleName = GrammarUtil.getSimpleName(grammar);
    String _plus = (_simpleName + "StandaloneSetupIdea");
    return new TypeReference(_ideaBasePackage, _plus);
  }
  
  public String getWebBasePackage(final Grammar grammar) {
    String _namespace = GrammarUtil.getNamespace(grammar);
    return (_namespace + ".web");
  }
  
  public TypeReference getWebModule(final Grammar grammar) {
    String _webBasePackage = this.getWebBasePackage(grammar);
    String _simpleName = GrammarUtil.getSimpleName(grammar);
    String _plus = (_simpleName + "WebModule");
    return new TypeReference(_webBasePackage, _plus);
  }
  
  public TypeReference getWebDefaultModule(final Grammar grammar) {
    return new TypeReference("org.eclipse.xtext.web.server.DefaultWebModule");
  }
  
  public TypeReference getWebGenModule(final Grammar grammar) {
    String _webBasePackage = this.getWebBasePackage(grammar);
    String _simpleName = GrammarUtil.getSimpleName(grammar);
    String _plus = ("Abstract" + _simpleName);
    String _plus_1 = (_plus + "WebModule");
    return new TypeReference(_webBasePackage, _plus_1);
  }
  
  public TypeReference getWebSetup(final Grammar grammar) {
    String _webBasePackage = this.getWebBasePackage(grammar);
    String _simpleName = GrammarUtil.getSimpleName(grammar);
    String _plus = (_simpleName + "WebSetup");
    return new TypeReference(_webBasePackage, _plus);
  }
}
