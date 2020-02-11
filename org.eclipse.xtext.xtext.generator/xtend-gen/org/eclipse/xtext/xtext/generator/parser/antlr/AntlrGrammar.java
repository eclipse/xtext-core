/**
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.xtext.generator.parser.antlr;

import org.eclipse.xtend.lib.annotations.Data;
import org.eclipse.xtext.xbase.lib.Pure;

@Data
@SuppressWarnings("all")
public class AntlrGrammar {
  private final String packageName;
  
  private final String simpleName;
  
  public String getName() {
    return ((this.packageName + ".") + this.simpleName);
  }
  
  public String getGrammarFileName() {
    String _replace = this.getName().replace(".", "/");
    return (_replace + ".g");
  }
  
  public String getTokensFileName() {
    String _replace = this.getName().replace(".", "/");
    return (_replace + ".tokens");
  }
  
  @Override
  public String toString() {
    return this.getName();
  }
  
  public AntlrGrammar(final String packageName, final String simpleName) {
    super();
    this.packageName = packageName;
    this.simpleName = simpleName;
  }
  
  @Override
  @Pure
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((this.packageName== null) ? 0 : this.packageName.hashCode());
    return prime * result + ((this.simpleName== null) ? 0 : this.simpleName.hashCode());
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
    AntlrGrammar other = (AntlrGrammar) obj;
    if (this.packageName == null) {
      if (other.packageName != null)
        return false;
    } else if (!this.packageName.equals(other.packageName))
      return false;
    if (this.simpleName == null) {
      if (other.simpleName != null)
        return false;
    } else if (!this.simpleName.equals(other.simpleName))
      return false;
    return true;
  }
  
  @Pure
  public String getPackageName() {
    return this.packageName;
  }
  
  @Pure
  public String getSimpleName() {
    return this.simpleName;
  }
}
