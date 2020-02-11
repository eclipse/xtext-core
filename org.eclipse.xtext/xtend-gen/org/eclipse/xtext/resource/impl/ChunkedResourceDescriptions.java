/**
 * Copyright (c) 2015, 2016 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.resource.impl;

import com.google.common.annotations.Beta;
import com.google.common.collect.Iterables;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.ISelectable;
import org.eclipse.xtext.resource.containers.ProjectDescriptionBasedContainerManager;
import org.eclipse.xtext.resource.impl.AbstractCompoundSelectable;
import org.eclipse.xtext.resource.impl.ResourceDescriptionsData;
import org.eclipse.xtext.resource.persistence.SerializableResourceDescription;
import org.eclipse.xtext.util.internal.EmfAdaptable;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * A IResourceDescriptions implementation that holds its resource description in chunks, each identified by a string.
 * The strings represent units such as projects, source sets, and libraries.
 * 
 * @see ProjectDescription
 * @see ProjectDescriptionBasedContainerManager
 * 
 * @author Sven Efftinge - Initial contribution and API
 * 
 * @since 2.9
 */
@Beta
@EmfAdaptable
@SuppressWarnings("all")
public class ChunkedResourceDescriptions extends AbstractCompoundSelectable implements IResourceDescriptions, Externalizable {
  public static class ChunkedResourceDescriptionsAdapter extends AdapterImpl {
    private ChunkedResourceDescriptions element;
    
    public ChunkedResourceDescriptionsAdapter(final ChunkedResourceDescriptions element) {
      this.element = element;
    }
    
    public ChunkedResourceDescriptions get() {
      return this.element;
    }
    
    @Override
    public boolean isAdapterForType(final Object object) {
      return object == ChunkedResourceDescriptions.class;
    }
  }
  
  protected ConcurrentHashMap<String, ResourceDescriptionsData> chunk2resourceDescriptions = new ConcurrentHashMap<String, ResourceDescriptionsData>();
  
  protected ResourceSet resourceSet;
  
  public ChunkedResourceDescriptions() {
  }
  
  public ChunkedResourceDescriptions(final Map<String, ResourceDescriptionsData> initialData) {
    ConcurrentHashMap<String, ResourceDescriptionsData> _concurrentHashMap = new ConcurrentHashMap<String, ResourceDescriptionsData>(initialData);
    this.chunk2resourceDescriptions = _concurrentHashMap;
  }
  
  public ChunkedResourceDescriptions(final Map<String, ResourceDescriptionsData> initialData, final ResourceSet resourceSet) {
    this(initialData);
    this.setResourceSet(resourceSet);
  }
  
  /**
   * Creates a shallow copy of the resource descriptions map and installs it with the given ResourceSet.
   */
  public ChunkedResourceDescriptions createShallowCopyWith(final ResourceSet resourceSet) {
    return new ChunkedResourceDescriptions(this.chunk2resourceDescriptions, resourceSet);
  }
  
  public ResourceSet getResourceSet() {
    return this.resourceSet;
  }
  
  protected void setResourceSet(final ResourceSet resourceSet) {
    if ((this.resourceSet != null)) {
      String _name = this.getClass().getName();
      String _plus = ("This " + _name);
      String _plus_1 = (_plus + " is already associated with a different resource set.");
      throw new IllegalStateException(_plus_1);
    }
    final ChunkedResourceDescriptions index = ChunkedResourceDescriptions.findInEmfObject(resourceSet);
    if ((index != null)) {
      String _name_1 = this.getClass().getName();
      String _plus_2 = ("There is already a different " + _name_1);
      String _plus_3 = (_plus_2 + " installed in the given resource set.");
      throw new IllegalStateException(_plus_3);
    }
    this.resourceSet = resourceSet;
    this.attachToEmfObject(resourceSet);
  }
  
  public ResourceDescriptionsData setContainer(final String name, final ResourceDescriptionsData descriptions) {
    return this.chunk2resourceDescriptions.put(name, descriptions);
  }
  
  public ResourceDescriptionsData removeContainer(final String name) {
    return this.chunk2resourceDescriptions.remove(name);
  }
  
  @Override
  protected Iterable<? extends ISelectable> getSelectables() {
    return this.chunk2resourceDescriptions.values();
  }
  
  @Override
  public Iterable<IResourceDescription> getAllResourceDescriptions() {
    final Function1<ResourceDescriptionsData, Iterable<IResourceDescription>> _function = (ResourceDescriptionsData it) -> {
      return it.getAllResourceDescriptions();
    };
    return Iterables.<IResourceDescription>concat(IterableExtensions.<ResourceDescriptionsData, Iterable<IResourceDescription>>map(this.chunk2resourceDescriptions.values(), _function));
  }
  
  @Override
  public IResourceDescription getResourceDescription(final URI uri) {
    Collection<ResourceDescriptionsData> _values = this.chunk2resourceDescriptions.values();
    for (final ResourceDescriptionsData selectable : _values) {
      {
        final IResourceDescription result = selectable.getResourceDescription(uri);
        if ((result != null)) {
          return result;
        }
      }
    }
    return null;
  }
  
  public ResourceDescriptionsData getContainer(final URI uri) {
    Collection<ResourceDescriptionsData> _values = this.chunk2resourceDescriptions.values();
    for (final ResourceDescriptionsData container : _values) {
      {
        final IResourceDescription result = container.getResourceDescription(uri);
        if ((result != null)) {
          return container;
        }
      }
    }
    return null;
  }
  
  public ResourceDescriptionsData getContainer(final String containerHandle) {
    return this.chunk2resourceDescriptions.get(containerHandle);
  }
  
  @Override
  public void readExternal(final ObjectInput in) throws IOException, ClassNotFoundException {
    final int numChunks = in.readInt();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, numChunks, true);
    for (final Integer i : _doubleDotLessThan) {
      {
        final String chunkName = in.readUTF();
        final int numDescriptions = in.readInt();
        final ArrayList<IResourceDescription> descriptions = new ArrayList<IResourceDescription>(numDescriptions);
        ExclusiveRange _doubleDotLessThan_1 = new ExclusiveRange(0, numDescriptions, true);
        for (final Integer j : _doubleDotLessThan_1) {
          Object _readObject = in.readObject();
          descriptions.add(((IResourceDescription) _readObject));
        }
        ResourceDescriptionsData _resourceDescriptionsData = new ResourceDescriptionsData(descriptions);
        this.chunk2resourceDescriptions.put(chunkName, _resourceDescriptionsData);
      }
    }
  }
  
  @Override
  public void writeExternal(final ObjectOutput out) throws IOException {
    final HashMap<String, ResourceDescriptionsData> copy = new HashMap<String, ResourceDescriptionsData>(this.chunk2resourceDescriptions);
    out.writeInt(copy.entrySet().size());
    final Consumer<Map.Entry<String, ResourceDescriptionsData>> _function = (Map.Entry<String, ResourceDescriptionsData> it) -> {
      try {
        out.writeUTF(it.getKey());
        final Function1<IResourceDescription, Object> _function_1 = (IResourceDescription it_1) -> {
          Object _xifexpression = null;
          if ((it_1 instanceof Serializable)) {
            _xifexpression = ((Object)it_1);
          } else {
            _xifexpression = SerializableResourceDescription.createCopy(it_1);
          }
          return ((Object)_xifexpression);
        };
        final Iterable<Object> descriptions = IterableExtensions.<IResourceDescription, Object>map(it.getValue().getAllResourceDescriptions(), _function_1);
        out.writeInt(IterableExtensions.size(descriptions));
        final Consumer<Object> _function_2 = (Object it_1) -> {
          try {
            out.writeObject(it_1);
          } catch (Throwable _e) {
            throw Exceptions.sneakyThrow(_e);
          }
        };
        descriptions.forEach(_function_2);
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    };
    copy.entrySet().forEach(_function);
  }
  
  public static ChunkedResourceDescriptions findInEmfObject(final Notifier emfObject) {
    for (Adapter adapter : emfObject.eAdapters()) {
    	if (adapter instanceof ChunkedResourceDescriptions.ChunkedResourceDescriptionsAdapter) {
    		return ((ChunkedResourceDescriptions.ChunkedResourceDescriptionsAdapter) adapter).get();
    	}
    }
    return null;
  }
  
  public static ChunkedResourceDescriptions removeFromEmfObject(final Notifier emfObject) {
    List<Adapter> adapters = emfObject.eAdapters();
    for(int i = 0, max = adapters.size(); i < max; i++) {
    	Adapter adapter = adapters.get(i);
    	if (adapter instanceof ChunkedResourceDescriptions.ChunkedResourceDescriptionsAdapter) {
    		emfObject.eAdapters().remove(i);
    		return ((ChunkedResourceDescriptions.ChunkedResourceDescriptionsAdapter) adapter).get();
    	}
    }
    return null;
  }
  
  public void attachToEmfObject(final Notifier emfObject) {
    ChunkedResourceDescriptions result = findInEmfObject(emfObject);
    if (result != null)
    	throw new IllegalStateException("The given EMF object already contains an adapter for ChunkedResourceDescriptions");
    ChunkedResourceDescriptions.ChunkedResourceDescriptionsAdapter adapter = new ChunkedResourceDescriptions.ChunkedResourceDescriptionsAdapter(this);
    emfObject.eAdapters().add(adapter);
  }
}
