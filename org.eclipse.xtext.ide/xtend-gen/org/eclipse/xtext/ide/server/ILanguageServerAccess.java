/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.ide.server;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.lsp4j.services.LanguageClient;
import org.eclipse.xtend.lib.annotations.Data;
import org.eclipse.xtext.ide.server.Document;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

/**
 * API for interacting with a running language server.
 * 
 * @author Sven Efftinge - Initial contribution and API
 */
@SuppressWarnings("all")
public interface ILanguageServerAccess {
  @Data
  public static class Context {
    private final Resource resource;
    
    private final Document document;
    
    private final boolean isDocumentOpen;
    
    private final CancelIndicator cancelChecker;
    
    public Context(final Resource resource, final Document document, final boolean isDocumentOpen, final CancelIndicator cancelChecker) {
      super();
      this.resource = resource;
      this.document = document;
      this.isDocumentOpen = isDocumentOpen;
      this.cancelChecker = cancelChecker;
    }
    
    @Override
    @Pure
    public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((this.resource== null) ? 0 : this.resource.hashCode());
      result = prime * result + ((this.document== null) ? 0 : this.document.hashCode());
      result = prime * result + (this.isDocumentOpen ? 1231 : 1237);
      result = prime * result + ((this.cancelChecker== null) ? 0 : this.cancelChecker.hashCode());
      return result;
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
      ILanguageServerAccess.Context other = (ILanguageServerAccess.Context) obj;
      if (this.resource == null) {
        if (other.resource != null)
          return false;
      } else if (!this.resource.equals(other.resource))
        return false;
      if (this.document == null) {
        if (other.document != null)
          return false;
      } else if (!this.document.equals(other.document))
        return false;
      if (other.isDocumentOpen != this.isDocumentOpen)
        return false;
      if (this.cancelChecker == null) {
        if (other.cancelChecker != null)
          return false;
      } else if (!this.cancelChecker.equals(other.cancelChecker))
        return false;
      return true;
    }
    
    @Override
    @Pure
    public String toString() {
      ToStringBuilder b = new ToStringBuilder(this);
      b.add("resource", this.resource);
      b.add("document", this.document);
      b.add("isDocumentOpen", this.isDocumentOpen);
      b.add("cancelChecker", this.cancelChecker);
      return b.toString();
    }
    
    @Pure
    public Resource getResource() {
      return this.resource;
    }
    
    @Pure
    public Document getDocument() {
      return this.document;
    }
    
    @Pure
    public boolean isDocumentOpen() {
      return this.isDocumentOpen;
    }
    
    @Pure
    public CancelIndicator getCancelChecker() {
      return this.cancelChecker;
    }
  }
  
  public interface IBuildListener {
    public abstract void afterBuild(final List<IResourceDescription.Delta> deltas);
  }
  
  /**
   * Provides read access to a fully resolved resource and Document.
   * 
   * @throws IllegalStateException if the language server is not initialized yet
   */
  public abstract <T extends Object> CompletableFuture<T> doRead(final String uri, final Function<ILanguageServerAccess.Context, T> function);
  
  /**
   * Registers a build listener on the this language server.
   */
  public abstract void addBuildListener(final ILanguageServerAccess.IBuildListener listener);
  
  /**
   * Returns the language client facade. It usually also implements Endpoint, which can be used to
   * call non-standard extensions to the LSP.
   */
  public abstract LanguageClient getLanguageClient();
}
