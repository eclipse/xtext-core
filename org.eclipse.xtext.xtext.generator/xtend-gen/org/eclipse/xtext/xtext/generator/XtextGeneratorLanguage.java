/**
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.xtext.generator;

import com.google.common.base.Joiner;
import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.google.inject.Binder;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.google.inject.Provider;
import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtend.lib.annotations.AccessorType;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.AbstractMetamodelDeclaration;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.ReferencedMetamodel;
import org.eclipse.xtext.XtextPackage;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.impl.ResourceDescriptionsData;
import org.eclipse.xtext.util.internal.Log;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xtext.RuleNames;
import org.eclipse.xtext.xtext.generator.CodeConfig;
import org.eclipse.xtext.xtext.generator.CompositeGeneratorFragment2;
import org.eclipse.xtext.xtext.generator.IXtextGeneratorFragment;
import org.eclipse.xtext.xtext.generator.IXtextGeneratorLanguage;
import org.eclipse.xtext.xtext.generator.ImplicitFragment;
import org.eclipse.xtext.xtext.generator.XtextGeneratorResourceSetInitializer;
import org.eclipse.xtext.xtext.generator.model.GuiceModuleAccess;
import org.eclipse.xtext.xtext.generator.model.IXtextGeneratorFileSystemAccess;
import org.eclipse.xtext.xtext.generator.model.StandaloneSetupAccess;
import org.eclipse.xtext.xtext.generator.model.project.IRuntimeProjectConfig;
import org.eclipse.xtext.xtext.generator.model.project.IXtextProjectConfig;

/**
 * @noextend
 */
@Log
@SuppressWarnings("all")
public class XtextGeneratorLanguage extends CompositeGeneratorFragment2 implements IXtextGeneratorLanguage {
  private String grammarUri;
  
  private String name;
  
  @Accessors(AccessorType.PUBLIC_SETTER)
  private Boolean generateXtendStubs;
  
  @Accessors(AccessorType.PUBLIC_GETTER)
  private Grammar grammar;
  
  @Accessors(AccessorType.PUBLIC_GETTER)
  private RuleNames ruleNames;
  
  @Accessors(AccessorType.PUBLIC_GETTER)
  private List<String> fileExtensions;
  
  @Accessors(AccessorType.PUBLIC_GETTER)
  private List<String> referencedResources = CollectionLiterals.<String>newArrayList();
  
  @Accessors
  private ResourceSet resourceSet;
  
  @Accessors
  private Module guiceModule = ((Module) (Binder it) -> {
  });
  
  @Accessors
  private final StandaloneSetupAccess runtimeGenSetup = new StandaloneSetupAccess();
  
  @Accessors
  private final GuiceModuleAccess runtimeGenModule = new GuiceModuleAccess();
  
  @Accessors
  private final GuiceModuleAccess ideGenModule = new GuiceModuleAccess();
  
  @Accessors
  private final GuiceModuleAccess eclipsePluginGenModule = new GuiceModuleAccess();
  
  @Accessors
  private final GuiceModuleAccess ideaGenModule = new GuiceModuleAccess();
  
  @Accessors
  private final GuiceModuleAccess webGenModule = new GuiceModuleAccess();
  
  @Inject
  private Provider<ResourceSet> resourceSetProvider;
  
  @Inject
  private IXtextProjectConfig projectConfig;
  
  @Inject
  private CodeConfig codeConfig;
  
  @Inject
  private XtextGeneratorResourceSetInitializer resourceSetInitializer;
  
  public void setGrammarUri(final String uri) {
    this.grammarUri = uri;
  }
  
  public String getGrammarUri() {
    String _elvis = null;
    if (this.grammarUri != null) {
      _elvis = this.grammarUri;
    } else {
      IRuntimeProjectConfig _runtime = this.projectConfig.getRuntime();
      IXtextGeneratorFileSystemAccess _src = _runtime.getSrc();
      String _path = _src.getPath();
      String _replace = this.name.replace(".", "/");
      String _plus = (_replace + ".xtext");
      File _file = new File(_path, _plus);
      URI _uRI = _file.toURI();
      String _string = _uRI.toString();
      _elvis = _string;
    }
    return _elvis;
  }
  
  public void setName(final String name) {
    this.name = name;
  }
  
  public void setFileExtensions(final String fileExtensions) {
    String _trim = fileExtensions.trim();
    String[] _split = _trim.split("\\s*,\\s*");
    List<String> _list = IterableExtensions.<String>toList(((Iterable<String>)Conversions.doWrapArray(_split)));
    this.fileExtensions = _list;
  }
  
  public void addReferencedResource(final String referencedResource) {
    this.referencedResources.add(referencedResource);
  }
  
  @Override
  public List<String> getFileExtensions() {
    if (((this.fileExtensions == null) || this.fileExtensions.isEmpty())) {
      String _simpleName = GrammarUtil.getSimpleName(this.grammar);
      String _lowerCase = _simpleName.toLowerCase();
      this.setFileExtensions(_lowerCase);
      XtextGeneratorLanguage.LOG.info((("No explicit fileExtensions configured. Using \'*." + this.fileExtensions) + "\'."));
    }
    return this.fileExtensions;
  }
  
  @Override
  public boolean isGenerateXtendStubs() {
    boolean _xifexpression = false;
    boolean _notEquals = (!Objects.equal(this.generateXtendStubs, null));
    if (_notEquals) {
      _xifexpression = this.generateXtendStubs.booleanValue();
    } else {
      _xifexpression = this.codeConfig.isPreferXtendStubs();
    }
    return _xifexpression;
  }
  
  @Override
  public void initialize(final Injector injector) {
    List<IXtextGeneratorFragment> _fragments = this.getFragments();
    List<? extends IXtextGeneratorFragment> _implicitFragments = this.getImplicitFragments();
    _fragments.addAll(0, _implicitFragments);
    injector.injectMembers(XtextGeneratorLanguage.class);
    if ((this.resourceSet == null)) {
      ResourceSet _get = this.resourceSetProvider.get();
      this.resourceSet = _get;
    }
    this.resourceSetInitializer.initialize(this.resourceSet, this.referencedResources);
    EList<Resource> _resources = this.resourceSet.getResources();
    boolean _isEmpty = _resources.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      this.installIndex();
      {
        int i = 0;
        EList<Resource> _resources_1 = this.resourceSet.getResources();
        int size = _resources_1.size();
        boolean _while = (i < size);
        while (_while) {
          {
            EList<Resource> _resources_2 = this.resourceSet.getResources();
            final Resource res = _resources_2.get(i);
            EList<EObject> _contents = res.getContents();
            boolean _isEmpty_1 = _contents.isEmpty();
            if (_isEmpty_1) {
              org.eclipse.emf.common.util.URI _uRI = res.getURI();
              String _plus = ("Error loading \'" + _uRI);
              String _plus_1 = (_plus + "\'");
              XtextGeneratorLanguage.LOG.error(_plus_1);
            } else {
              EList<Resource.Diagnostic> _errors = res.getErrors();
              boolean _isEmpty_2 = _errors.isEmpty();
              boolean _not_1 = (!_isEmpty_2);
              if (_not_1) {
                org.eclipse.emf.common.util.URI _uRI_1 = res.getURI();
                String _plus_2 = ("Error loading \'" + _uRI_1);
                String _plus_3 = (_plus_2 + "\':\n");
                Joiner _on = Joiner.on("\n");
                EList<Resource.Diagnostic> _errors_1 = res.getErrors();
                String _join = _on.join(_errors_1);
                String _plus_4 = (_plus_3 + _join);
                XtextGeneratorLanguage.LOG.error(_plus_4);
              }
            }
          }
          i++;
          _while = (i < size);
        }
      }
      EcoreUtil.resolveAll(this.resourceSet);
    }
    String _grammarUri = this.getGrammarUri();
    boolean _equals = Objects.equal(_grammarUri, null);
    if (_equals) {
      throw new IllegalStateException("No grammarUri or language name given");
    }
    String _grammarUri_1 = this.getGrammarUri();
    org.eclipse.emf.common.util.URI _createURI = org.eclipse.emf.common.util.URI.createURI(_grammarUri_1);
    Resource _resource = this.resourceSet.getResource(_createURI, true);
    final XtextResource resource = ((XtextResource) _resource);
    EList<EObject> _contents = resource.getContents();
    boolean _isEmpty_1 = _contents.isEmpty();
    if (_isEmpty_1) {
      String _grammarUri_2 = this.getGrammarUri();
      String _plus = ("Couldn\'t load grammar for \'" + _grammarUri_2);
      String _plus_1 = (_plus + "\'.");
      throw new IllegalArgumentException(_plus_1);
    }
    EList<Resource.Diagnostic> _errors = resource.getErrors();
    boolean _isEmpty_2 = _errors.isEmpty();
    boolean _not_1 = (!_isEmpty_2);
    if (_not_1) {
      EList<Resource.Diagnostic> _errors_1 = resource.getErrors();
      XtextGeneratorLanguage.LOG.error(_errors_1);
      String _grammarUri_3 = this.getGrammarUri();
      String _plus_2 = ("Problem parsing \'" + _grammarUri_3);
      String _plus_3 = (_plus_2 + "\':\n");
      Joiner _on = Joiner.on("\n");
      EList<Resource.Diagnostic> _errors_2 = resource.getErrors();
      String _join = _on.join(_errors_2);
      String _plus_4 = (_plus_3 + _join);
      throw new IllegalStateException(_plus_4);
    }
    EList<EObject> _contents_1 = resource.getContents();
    EObject _get_1 = _contents_1.get(0);
    final Grammar grammar = ((Grammar) _get_1);
    this.validateGrammar(grammar);
    this.initialize(grammar);
    super.initialize(injector);
  }
  
  protected List<? extends IXtextGeneratorFragment> getImplicitFragments() {
    ArrayList<ImplicitFragment> _xblockexpression = null;
    {
      final ArrayList<ImplicitFragment> fragments = CollectionLiterals.<ImplicitFragment>newArrayList();
      ImplicitFragment _implicitFragment = new ImplicitFragment();
      fragments.add(_implicitFragment);
      _xblockexpression = fragments;
    }
    return _xblockexpression;
  }
  
  public void initialize(final Grammar grammar) {
    this.grammar = grammar;
    RuleNames _ruleNames = RuleNames.getRuleNames(grammar, true);
    this.ruleNames = _ruleNames;
  }
  
  private void installIndex() {
    List<IResourceDescription> _emptyList = Collections.<IResourceDescription>emptyList();
    final ResourceDescriptionsData index = new ResourceDescriptionsData(_emptyList);
    EList<Resource> _resources = this.resourceSet.getResources();
    final ArrayList<Resource> resources = Lists.<Resource>newArrayList(_resources);
    for (final Resource resource : resources) {
      org.eclipse.emf.common.util.URI _uRI = resource.getURI();
      this.index(resource, _uRI, index);
    }
    ResourceDescriptionsData.ResourceSetAdapter.installResourceDescriptionsData(this.resourceSet, index);
  }
  
  private void index(final Resource resource, final org.eclipse.emf.common.util.URI uri, final ResourceDescriptionsData index) {
    final IResourceServiceProvider serviceProvider = IResourceServiceProvider.Registry.INSTANCE.getResourceServiceProvider(uri);
    boolean _notEquals = (!Objects.equal(serviceProvider, null));
    if (_notEquals) {
      IResourceDescription.Manager _resourceDescriptionManager = serviceProvider.getResourceDescriptionManager();
      final IResourceDescription resourceDescription = _resourceDescriptionManager.getResourceDescription(resource);
      boolean _notEquals_1 = (!Objects.equal(resourceDescription, null));
      if (_notEquals_1) {
        index.addDescription(uri, resourceDescription);
      }
    }
  }
  
  protected void validateGrammar(final Grammar grammar) {
    this.validateAllImports(grammar);
    final EValidator validator = EValidator.Registry.INSTANCE.getEValidator(XtextPackage.eINSTANCE);
    if ((validator != null)) {
      final DiagnosticChain chain = new DiagnosticChain() {
        @Override
        public void add(final Diagnostic diagnostic) {
          int _severity = diagnostic.getSeverity();
          boolean _equals = (_severity == Diagnostic.ERROR);
          if (_equals) {
            String _name = grammar.getName();
            String _plus = ("Validation Error in " + _name);
            final String grammarName = (_plus + ": ");
            Throwable _exception = diagnostic.getException();
            boolean _equals_1 = Objects.equal(_exception, null);
            if (_equals_1) {
              String _message = diagnostic.getMessage();
              String _plus_1 = (grammarName + _message);
              throw new IllegalStateException(_plus_1);
            } else {
              String _message_1 = diagnostic.getMessage();
              String _plus_2 = (grammarName + _message_1);
              Throwable _exception_1 = diagnostic.getException();
              throw new IllegalStateException(_plus_2, _exception_1);
            }
          }
        }
        
        @Override
        public void addAll(final Diagnostic diagnostic) {
          this.add(diagnostic);
        }
        
        @Override
        public void merge(final Diagnostic diagnostic) {
          throw new UnsupportedOperationException();
        }
      };
      validator.validate(grammar, chain, null);
      final TreeIterator<EObject> iterator = grammar.eAllContents();
      while (iterator.hasNext()) {
        EObject _next = iterator.next();
        HashMap<Object, Object> _hashMap = new HashMap<Object, Object>();
        validator.validate(_next, chain, _hashMap);
      }
    }
  }
  
  protected void validateAllImports(final Grammar grammar) {
    List<AbstractMetamodelDeclaration> _allMetamodelDeclarations = GrammarUtil.allMetamodelDeclarations(grammar);
    for (final AbstractMetamodelDeclaration amd : _allMetamodelDeclarations) {
      if ((amd instanceof ReferencedMetamodel)) {
        this.validateReferencedMetamodel(((ReferencedMetamodel)amd));
      }
    }
  }
  
  protected void validateReferencedMetamodel(final ReferencedMetamodel ref) {
    if (((!Objects.equal(ref.getEPackage(), null)) && (!ref.getEPackage().eIsProxy()))) {
      return;
    }
    final EReference eref = XtextPackage.Literals.ABSTRACT_METAMODEL_DECLARATION__EPACKAGE;
    final List<INode> nodes = NodeModelUtils.findNodesForFeature(ref, eref);
    String _xifexpression = null;
    boolean _isEmpty = nodes.isEmpty();
    if (_isEmpty) {
      _xifexpression = "(unknown)";
    } else {
      INode _get = nodes.get(0);
      _xifexpression = NodeModelUtils.getTokenText(_get);
    }
    final String refName = _xifexpression;
    Grammar _grammar = GrammarUtil.getGrammar(ref);
    final String grammarName = _grammar.getName();
    final String msg = ((((("The EPackage " + refName) + " in grammar ") + grammarName) + " could not be found. ") + "You might want to register that EPackage in your workflow file.");
    throw new IllegalStateException(msg);
  }
  
  private final static Logger LOG = Logger.getLogger(XtextGeneratorLanguage.class);
  
  public void setGenerateXtendStubs(final Boolean generateXtendStubs) {
    this.generateXtendStubs = generateXtendStubs;
  }
  
  @Pure
  public Grammar getGrammar() {
    return this.grammar;
  }
  
  @Pure
  public RuleNames getRuleNames() {
    return this.ruleNames;
  }
  
  @Pure
  public List<String> getReferencedResources() {
    return this.referencedResources;
  }
  
  @Pure
  public ResourceSet getResourceSet() {
    return this.resourceSet;
  }
  
  public void setResourceSet(final ResourceSet resourceSet) {
    this.resourceSet = resourceSet;
  }
  
  @Pure
  public Module getGuiceModule() {
    return this.guiceModule;
  }
  
  public void setGuiceModule(final Module guiceModule) {
    this.guiceModule = guiceModule;
  }
  
  @Pure
  public StandaloneSetupAccess getRuntimeGenSetup() {
    return this.runtimeGenSetup;
  }
  
  @Pure
  public GuiceModuleAccess getRuntimeGenModule() {
    return this.runtimeGenModule;
  }
  
  @Pure
  public GuiceModuleAccess getIdeGenModule() {
    return this.ideGenModule;
  }
  
  @Pure
  public GuiceModuleAccess getEclipsePluginGenModule() {
    return this.eclipsePluginGenModule;
  }
  
  @Pure
  public GuiceModuleAccess getIdeaGenModule() {
    return this.ideaGenModule;
  }
  
  @Pure
  public GuiceModuleAccess getWebGenModule() {
    return this.webGenModule;
  }
}
