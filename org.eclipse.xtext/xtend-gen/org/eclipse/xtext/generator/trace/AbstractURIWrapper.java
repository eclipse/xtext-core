/**
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.generator.trace;

import org.eclipse.emf.common.util.URI;
import org.eclipse.xtend.lib.annotations.Data;
import org.eclipse.xtext.xbase.lib.Pure;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
@Data
@SuppressWarnings("all")
public abstract class AbstractURIWrapper {
  private final URI URI;
  
  @Override
  public String toString() {
    return this.URI.toString();
  }
  
  public AbstractURIWrapper(final URI URI) {
    super();
    this.URI = URI;
  }
  
  @Override
  @Pure
  public int hashCode() {
    return 31 * 1 + ((this.URI== null) ? 0 : this.URI.hashCode());
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
    AbstractURIWrapper other = (AbstractURIWrapper) obj;
    if (this.URI == null) {
      if (other.URI != null)
        return false;
    } else if (!this.URI.equals(other.URI))
      return false;
    return true;
  }
  
  @Pure
  public URI getURI() {
    return this.URI;
  }
}
