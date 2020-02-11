/**
 * Copyright (c) 2014, 2017 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.resource.persistence;

import com.google.common.base.Objects;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.lib.Exceptions;

/**
 * @since 2.8
 */
@SuppressWarnings("all")
public class SerializationExtensions {
  public static <T extends ENamedElement> T readEcoreElement(final ObjectInput in) throws IOException {
    final URI uri = SerializationExtensions.readURI(in);
    final EPackage ePackage = EPackage.Registry.INSTANCE.getEPackage(uri.trimFragment().toString());
    Resource _eResource = null;
    if (ePackage!=null) {
      _eResource=ePackage.eResource();
    }
    EObject _eObject = null;
    if (_eResource!=null) {
      _eObject=_eResource.getEObject(uri.fragment());
    }
    return ((T) _eObject);
  }
  
  public static void writeEcoreElement(final ObjectOutput out, final ENamedElement namedElement) throws IOException {
    final URI uri = EcoreUtil.getURI(namedElement);
    SerializationExtensions.writeURI(out, uri);
  }
  
  public static <T extends Object> T readCastedObject(final ObjectInput in) throws IOException {
    try {
      Object _readObject = in.readObject();
      return ((T) _readObject);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static URI readURI(final ObjectInput in) throws IOException {
    final String stringRep = in.readUTF();
    boolean _equals = Objects.equal(stringRep, "NULL");
    if (_equals) {
      return null;
    }
    return URI.createURI(stringRep);
  }
  
  public static void writeURI(final ObjectOutput out, final URI uri) throws IOException {
    if ((uri == null)) {
      out.writeUTF("NULL");
    } else {
      out.writeUTF(uri.toString());
    }
  }
  
  public static QualifiedName readQualifiedName(final ObjectInput in) throws IOException {
    try {
      Object _readObject = in.readObject();
      return QualifiedName.create(((ArrayList<String>) _readObject));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static void writeQualifiedName(final ObjectOutput out, final QualifiedName name) throws IOException {
    List<String> _segments = name.getSegments();
    ArrayList<String> _arrayList = new ArrayList<String>(_segments);
    out.writeObject(_arrayList);
  }
}
