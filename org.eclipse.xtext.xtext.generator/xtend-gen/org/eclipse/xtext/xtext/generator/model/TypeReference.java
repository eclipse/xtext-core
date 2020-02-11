/**
 * Copyright (c) 2015, 2017 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.xtext.generator.model;

import com.google.common.base.Objects;
import com.google.common.base.Splitter;
import java.util.Collections;
import java.util.List;
import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtend.lib.annotations.AccessorType;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtend.lib.annotations.EqualsHashCode;
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xtext.generator.IXtextGeneratorLanguage;
import org.eclipse.xtext.xtext.generator.util.GenModelUtil2;

/**
 * Reference to a Java type. Use this for automatic import of types in {@link JavaFileAccess}
 * and {@link XtendFileAccess}.
 */
@Accessors
@EqualsHashCode
@SuppressWarnings("all")
public class TypeReference {
  @FinalFieldsConstructor
  public static class QualifiedClassName {
    @Accessors(AccessorType.PUBLIC_GETTER)
    private final String packageName;
    
    @Accessors(AccessorType.PUBLIC_GETTER)
    private final String className;
    
    @Pure
    public String getPackageName() {
      return this.packageName;
    }
    
    @Pure
    public String getClassName() {
      return this.className;
    }
    
    public QualifiedClassName(final String packageName, final String className) {
      super();
      this.packageName = packageName;
      this.className = className;
    }
  }
  
  public static TypeReference typeRef(final String name, final TypeReference... arguments) {
    return new TypeReference(name, (List<TypeReference>)Conversions.doWrapArray(arguments));
  }
  
  /**
   * @deprecated this method is available for backwards compatibility reasons
   */
  @Deprecated
  public static TypeReference guessTypeRef(final String name, final TypeReference... arguments) {
    return new TypeReference(name, (List<TypeReference>)Conversions.doWrapArray(arguments), false);
  }
  
  public static TypeReference typeRef(final Class<?> clazz, final TypeReference... arguments) {
    return new TypeReference(clazz, (List<TypeReference>)Conversions.doWrapArray(arguments));
  }
  
  public static TypeReference typeRef(final EClass clazz, final IXtextGeneratorLanguage language) {
    ResourceSet _resourceSet = language.getResourceSet();
    return new TypeReference(clazz, _resourceSet);
  }
  
  private final String packageName;
  
  private final List<String> simpleNames;
  
  private final List<TypeReference> typeArguments;
  
  public TypeReference(final String qualifiedName) {
    this(qualifiedName, ((List<TypeReference>) null));
  }
  
  public TypeReference(final String qualifiedName, final List<TypeReference> arguments) {
    this(qualifiedName, arguments, true);
  }
  
  private TypeReference(final String qualifiedName, final List<TypeReference> arguments, final boolean strict) {
    this(TypeReference.getPackageName(qualifiedName, strict), TypeReference.getClassName(qualifiedName, strict), arguments);
  }
  
  public TypeReference(final String packageName, final String className) {
    this(packageName, className, null);
  }
  
  public TypeReference(final String packageName, final String className, final List<TypeReference> arguments) {
    if ((packageName == null)) {
      throw new IllegalArgumentException(("Invalid package name: " + packageName));
    }
    if ((className == null)) {
      throw new IllegalArgumentException(("Invalid class name: " + className));
    }
    this.packageName = packageName;
    this.simpleNames = ((List<String>)Conversions.doWrapArray(className.split("\\.")));
    List<TypeReference> _elvis = null;
    if (arguments != null) {
      _elvis = arguments;
    } else {
      List<TypeReference> _emptyList = Collections.<TypeReference>emptyList();
      _elvis = _emptyList;
    }
    this.typeArguments = _elvis;
  }
  
  public TypeReference(final Class<?> clazz) {
    this(clazz, null);
  }
  
  public TypeReference(final Class<?> clazz, final List<TypeReference> arguments) {
    boolean _isPrimitive = clazz.isPrimitive();
    if (_isPrimitive) {
      String _name = clazz.getName();
      String _plus = ("Type is primitive: " + _name);
      throw new IllegalArgumentException(_plus);
    }
    boolean _isAnonymousClass = clazz.isAnonymousClass();
    if (_isAnonymousClass) {
      String _name_1 = clazz.getName();
      String _plus_1 = ("Class is anonymous: " + _name_1);
      throw new IllegalArgumentException(_plus_1);
    }
    boolean _isLocalClass = clazz.isLocalClass();
    if (_isLocalClass) {
      String _name_2 = clazz.getName();
      String _plus_2 = ("Class is local: " + _name_2);
      throw new IllegalArgumentException(_plus_2);
    }
    this.packageName = clazz.getPackage().getName();
    this.simpleNames = CollectionLiterals.<String>newArrayList();
    List<TypeReference> _elvis = null;
    if (arguments != null) {
      _elvis = arguments;
    } else {
      List<TypeReference> _emptyList = Collections.<TypeReference>emptyList();
      _elvis = _emptyList;
    }
    this.typeArguments = _elvis;
    Class<?> c = clazz;
    do {
      {
        this.simpleNames.add(0, c.getSimpleName());
        c = c.getDeclaringClass();
      }
    } while((c != null));
  }
  
  public TypeReference(final EClass clazz, final ResourceSet resourceSet) {
    this(TypeReference.getQualifiedName(clazz, resourceSet));
  }
  
  public TypeReference(final TypeReference.QualifiedClassName qualifiedClazzName) {
    this(qualifiedClazzName.packageName, qualifiedClazzName.className, null);
  }
  
  public TypeReference(final EPackage epackage, final ResourceSet resourceSet) {
    this(TypeReference.getQualifiedName(epackage, resourceSet));
  }
  
  private static String getPackageName(final String qualifiedName, final boolean strict) {
    final List<String> segments = IterableExtensions.<String>toList(Splitter.on(".").split(qualifiedName));
    int _size = segments.size();
    boolean _equals = (_size == 1);
    if (_equals) {
      return "";
    }
    if (strict) {
      int _length = ((Object[])Conversions.unwrapArray(segments, Object.class)).length;
      int _minus = (_length - 1);
      final List<String> packageSegments = segments.subList(0, _minus);
      final Function1<String, Boolean> _function = (String it) -> {
        return Boolean.valueOf(Character.isUpperCase(it.charAt(0)));
      };
      boolean _isEmpty = IterableExtensions.isEmpty(IterableExtensions.<String>filter(packageSegments, _function));
      boolean _not = (!_isEmpty);
      if (_not) {
        throw new IllegalArgumentException((("Cannot determine the package name of \'" + qualifiedName) + "\'. Please use the TypeReference(packageName, className) constructor"));
      }
      return IterableExtensions.join(packageSegments, ".");
    } else {
      int _length_1 = ((Object[])Conversions.unwrapArray(segments, Object.class)).length;
      int _minus_1 = (_length_1 - 1);
      List<String> packageSegments_1 = segments.subList(0, _minus_1);
      while ((!packageSegments_1.isEmpty())) {
        boolean _isUpperCase = Character.isUpperCase(IterableExtensions.<String>last(packageSegments_1).charAt(0));
        if (_isUpperCase) {
          final List<String> _converted_packageSegments_1 = (List<String>)packageSegments_1;
          int _length_2 = ((Object[])Conversions.unwrapArray(_converted_packageSegments_1, Object.class)).length;
          int _minus_2 = (_length_2 - 1);
          packageSegments_1 = packageSegments_1.subList(0, _minus_2);
        } else {
          return IterableExtensions.join(packageSegments_1, ".");
        }
      }
      return "";
    }
  }
  
  private static String getClassName(final String qualifiedName, final boolean strict) {
    String _xblockexpression = null;
    {
      final String packageName = TypeReference.getPackageName(qualifiedName, strict);
      String _xifexpression = null;
      boolean _isEmpty = packageName.isEmpty();
      if (_isEmpty) {
        _xifexpression = qualifiedName;
      } else {
        int _length = packageName.length();
        int _plus = (_length + 1);
        _xifexpression = qualifiedName.substring(_plus, qualifiedName.length());
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  private static TypeReference.QualifiedClassName getQualifiedName(final EClass clazz, final ResourceSet resourceSet) {
    TypeReference.QualifiedClassName _xifexpression = null;
    String _nsURI = clazz.getEPackage().getNsURI();
    boolean _equals = Objects.equal(_nsURI, "http://www.eclipse.org/2008/Xtext");
    if (_equals) {
      String _name = clazz.getName();
      _xifexpression = new TypeReference.QualifiedClassName("org.eclipse.xtext", _name);
    } else {
      TypeReference.QualifiedClassName _xifexpression_1 = null;
      String _nsURI_1 = clazz.getEPackage().getNsURI();
      boolean _equals_1 = Objects.equal(_nsURI_1, "http://www.eclipse.org/emf/2002/Ecore");
      if (_equals_1) {
        TypeReference.QualifiedClassName _xifexpression_2 = null;
        String _instanceTypeName = clazz.getInstanceTypeName();
        boolean _tripleNotEquals = (_instanceTypeName != null);
        if (_tripleNotEquals) {
          TypeReference.QualifiedClassName _xblockexpression = null;
          {
            final String itn = clazz.getInstanceTypeName();
            String _substring = itn.substring(0, itn.lastIndexOf("."));
            int _lastIndexOf = itn.lastIndexOf(".");
            int _plus = (_lastIndexOf + 1);
            String _replace = itn.substring(_plus).replace("$", ".");
            _xblockexpression = new TypeReference.QualifiedClassName(_substring, _replace);
          }
          _xifexpression_2 = _xblockexpression;
        } else {
          String _name_1 = clazz.getName();
          _xifexpression_2 = new TypeReference.QualifiedClassName("org.eclipse.emf.ecore", _name_1);
        }
        _xifexpression_1 = _xifexpression_2;
      } else {
        TypeReference.QualifiedClassName _xifexpression_3 = null;
        String _instanceTypeName_1 = clazz.getInstanceTypeName();
        boolean _tripleNotEquals_1 = (_instanceTypeName_1 != null);
        if (_tripleNotEquals_1) {
          TypeReference.QualifiedClassName _xblockexpression_1 = null;
          {
            final String itn = clazz.getInstanceTypeName();
            String _substring = itn.substring(0, itn.lastIndexOf("."));
            int _lastIndexOf = itn.lastIndexOf(".");
            int _plus = (_lastIndexOf + 1);
            String _replace = itn.substring(_plus).replace("$", ".");
            _xblockexpression_1 = new TypeReference.QualifiedClassName(_substring, _replace);
          }
          _xifexpression_3 = _xblockexpression_1;
        } else {
          TypeReference.QualifiedClassName _xblockexpression_2 = null;
          {
            final GenClass genClass = GenModelUtil2.getGenClass(clazz, resourceSet);
            final String packageName = genClass.getGenPackage().getInterfacePackageName();
            String _interfaceName = genClass.getInterfaceName();
            _xblockexpression_2 = new TypeReference.QualifiedClassName(packageName, _interfaceName);
          }
          _xifexpression_3 = _xblockexpression_2;
        }
        _xifexpression_1 = _xifexpression_3;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  private static TypeReference.QualifiedClassName getQualifiedName(final EPackage epackage, final ResourceSet resourceSet) {
    TypeReference.QualifiedClassName _xblockexpression = null;
    {
      final GenPackage genPackage = GenModelUtil2.getGenPackage(epackage, resourceSet);
      String _xifexpression = null;
      boolean _isSuppressEMFMetaData = genPackage.getGenModel().isSuppressEMFMetaData();
      if (_isSuppressEMFMetaData) {
        _xifexpression = genPackage.getQualifiedPackageClassName();
      } else {
        _xifexpression = genPackage.getReflectionPackageName();
      }
      final String packageName = _xifexpression;
      String _packageInterfaceName = genPackage.getPackageInterfaceName();
      _xblockexpression = new TypeReference.QualifiedClassName(packageName, _packageInterfaceName);
    }
    return _xblockexpression;
  }
  
  @Override
  public String toString() {
    String _name = this.getName();
    final Function1<TypeReference, CharSequence> _function = (TypeReference it) -> {
      return it.toString();
    };
    String _join = IterableExtensions.<TypeReference>join(this.typeArguments, "<", ", ", ">", _function);
    return (_name + _join);
  }
  
  public String getName() {
    String _join = IterableExtensions.join(this.simpleNames, ".");
    return ((this.packageName + ".") + _join);
  }
  
  public String getSimpleName() {
    return IterableExtensions.<String>last(this.simpleNames);
  }
  
  public String getPath() {
    String _replace = this.packageName.replace(".", "/");
    String _plus = (_replace + "/");
    String _head = IterableExtensions.<String>head(this.simpleNames);
    return (_plus + _head);
  }
  
  public String getJavaPath() {
    String _path = this.getPath();
    return (_path + ".java");
  }
  
  public String getXtendPath() {
    String _path = this.getPath();
    return (_path + ".xtend");
  }
  
  @Pure
  public String getPackageName() {
    return this.packageName;
  }
  
  @Pure
  public List<String> getSimpleNames() {
    return this.simpleNames;
  }
  
  @Pure
  public List<TypeReference> getTypeArguments() {
    return this.typeArguments;
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
    TypeReference other = (TypeReference) obj;
    if (this.packageName == null) {
      if (other.packageName != null)
        return false;
    } else if (!this.packageName.equals(other.packageName))
      return false;
    if (this.simpleNames == null) {
      if (other.simpleNames != null)
        return false;
    } else if (!this.simpleNames.equals(other.simpleNames))
      return false;
    if (this.typeArguments == null) {
      if (other.typeArguments != null)
        return false;
    } else if (!this.typeArguments.equals(other.typeArguments))
      return false;
    return true;
  }
  
  @Override
  @Pure
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((this.packageName== null) ? 0 : this.packageName.hashCode());
    result = prime * result + ((this.simpleNames== null) ? 0 : this.simpleNames.hashCode());
    return prime * result + ((this.typeArguments== null) ? 0 : this.typeArguments.hashCode());
  }
}
