/**
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.ide.editor.contentassist;

import com.google.common.base.Objects;
import com.google.inject.Singleton;
import org.eclipse.xtend.lib.annotations.AccessorType;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.ide.editor.contentassist.ContentAssistEntry;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.xbase.lib.Pure;

/**
 * Determines priorities for content assist proposal entries. The priorities can be used
 * to sort the list of proposals.
 * @noreference
 */
@Singleton
@Accessors({ AccessorType.PROTECTED_GETTER, AccessorType.PROTECTED_SETTER })
@SuppressWarnings("all")
public class IdeContentProposalPriorities {
  private int crossRefPriority = 500;
  
  private int defaultPriority = 400;
  
  private int keywordPriority = 300;
  
  protected int adjustPriority(final ContentAssistEntry entry, final int priority) {
    if ((entry == null)) {
      return priority;
    }
    int adjustedPriority = priority;
    boolean _isLetter = Character.isLetter(entry.getProposal().charAt(0));
    boolean _not = (!_isLetter);
    if (_not) {
      int _adjustedPriority = adjustedPriority;
      adjustedPriority = (_adjustedPriority - 30);
    }
    String _proposal = entry.getProposal();
    String _prefix = entry.getPrefix();
    boolean _equals = Objects.equal(_proposal, _prefix);
    if (_equals) {
      int _adjustedPriority_1 = adjustedPriority;
      adjustedPriority = (_adjustedPriority_1 - 20);
    }
    return adjustedPriority;
  }
  
  public int getCrossRefPriority(final IEObjectDescription objectDesc, final ContentAssistEntry entry) {
    return this.adjustPriority(entry, this.crossRefPriority);
  }
  
  public int getDefaultPriority(final ContentAssistEntry entry) {
    return this.adjustPriority(entry, this.defaultPriority);
  }
  
  public int getKeywordPriority(final String keyword, final ContentAssistEntry entry) {
    return this.adjustPriority(entry, this.keywordPriority);
  }
  
  @Pure
  protected int getCrossRefPriority() {
    return this.crossRefPriority;
  }
  
  protected void setCrossRefPriority(final int crossRefPriority) {
    this.crossRefPriority = crossRefPriority;
  }
  
  @Pure
  protected int getDefaultPriority() {
    return this.defaultPriority;
  }
  
  protected void setDefaultPriority(final int defaultPriority) {
    this.defaultPriority = defaultPriority;
  }
  
  @Pure
  protected int getKeywordPriority() {
    return this.keywordPriority;
  }
  
  protected void setKeywordPriority(final int keywordPriority) {
    this.keywordPriority = keywordPriority;
  }
}
