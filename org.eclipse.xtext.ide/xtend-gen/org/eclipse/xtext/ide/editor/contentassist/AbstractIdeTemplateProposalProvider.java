/**
 * Copyright (c) 2016 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.ide.editor.contentassist;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.xtend.lib.annotations.Data;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtend2.lib.StringConcatenationClient;
import org.eclipse.xtext.ide.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ide.editor.contentassist.ContentAssistEntry;
import org.eclipse.xtext.ide.editor.contentassist.IIdeContentProposalAcceptor;
import org.eclipse.xtext.ide.editor.contentassist.IdeContentProposalCreator;
import org.eclipse.xtext.ide.editor.contentassist.IdeContentProposalPriorities;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.util.TextRegion;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

/**
 * Base class for adding template proposals from an {@link IdeContentProposalProvider} implementation.
 * Use {@link #variable(String)} and {@link #cursor()} to generate edit positions and an exit position
 * into the proposal, e.g.
 * <pre>
 * val StringConcatenationClient template = '''
 *     state �variable('name')�
 *         �cursor�
 *     end
 * '''
 * acceptProposal('state', 'Create a new state', template, context, acceptor)
 * </pre>
 * 
 * @since 2.10
 */
@SuppressWarnings("all")
public abstract class AbstractIdeTemplateProposalProvider {
  /**
   * Placeholder for a variable (edit position) in a template.
   */
  @Data
  protected static class Variable {
    private final String name;
    
    public Variable(final String name) {
      super();
      this.name = name;
    }
    
    @Override
    @Pure
    public int hashCode() {
      return 31 * 1 + ((this.name== null) ? 0 : this.name.hashCode());
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
      AbstractIdeTemplateProposalProvider.Variable other = (AbstractIdeTemplateProposalProvider.Variable) obj;
      if (this.name == null) {
        if (other.name != null)
          return false;
      } else if (!this.name.equals(other.name))
        return false;
      return true;
    }
    
    @Override
    @Pure
    public String toString() {
      ToStringBuilder b = new ToStringBuilder(this);
      b.add("name", this.name);
      return b.toString();
    }
    
    @Pure
    public String getName() {
      return this.name;
    }
  }
  
  /**
   * Placeholder for the cursor (exit position) in a template.
   */
  protected static class Cursor {
  }
  
  private static class TemplateStringConcatenation extends StringConcatenation {
    private final ContentAssistContext context;
    
    private final ContentAssistEntry entry;
    
    public TemplateStringConcatenation(final ContentAssistContext context, final ContentAssistEntry entry, final String lineDelimiter) {
      super(lineDelimiter);
      this.context = context;
      this.entry = entry;
    }
    
    @Override
    protected String getStringRepresentation(final Object object) {
      if ((object instanceof AbstractIdeTemplateProposalProvider.Variable)) {
        final String varName = ((AbstractIdeTemplateProposalProvider.Variable)object).name;
        int _offset = this.context.getReplaceRegion().getOffset();
        int _currentOffset = this.getCurrentOffset();
        final int offset = (_offset + _currentOffset);
        int _length = varName.length();
        TextRegion _textRegion = new TextRegion(offset, _length);
        this.entry.getEditPositions().add(_textRegion);
        return varName;
      } else {
        if ((object instanceof AbstractIdeTemplateProposalProvider.Cursor)) {
          int _offset_1 = this.context.getReplaceRegion().getOffset();
          int _currentOffset_1 = this.getCurrentOffset();
          final int offset_1 = (_offset_1 + _currentOffset_1);
          this.entry.setEscapePosition(Integer.valueOf(offset_1));
          return null;
        } else {
          return object.toString();
        }
      }
    }
    
    protected int getCurrentOffset() {
      int result = 0;
      List<String> _content = this.getContent();
      for (final String segment : _content) {
        int _result = result;
        int _length = segment.length();
        result = (_result + _length);
      }
      return result;
    }
    
    @Override
    public void newLineIfNotEmpty() {
      this.newLine();
    }
  }
  
  @Inject
  private IdeContentProposalCreator proposalCreator;
  
  @Inject
  private IdeContentProposalPriorities proposalPriorities;
  
  protected AbstractIdeTemplateProposalProvider.Variable variable(final String name) {
    return new AbstractIdeTemplateProposalProvider.Variable(name);
  }
  
  protected AbstractIdeTemplateProposalProvider.Cursor cursor() {
    return new AbstractIdeTemplateProposalProvider.Cursor();
  }
  
  protected void acceptProposal(final String name, final String description, final StringConcatenationClient template, final ContentAssistContext context, final IIdeContentProposalAcceptor acceptor) {
    this.acceptProposal(name, description, template, context, acceptor, true);
  }
  
  protected void acceptProposal(final String name, final String description, final StringConcatenationClient template, final ContentAssistContext context, final IIdeContentProposalAcceptor acceptor, final boolean adaptIndentation) {
    final ContentAssistEntry entry = this.createProposal(template, context, adaptIndentation);
    boolean _canAcceptProposal = this.canAcceptProposal(entry, context);
    if (_canAcceptProposal) {
      entry.setLabel(name);
      entry.setDescription(description);
      acceptor.accept(entry, this.proposalPriorities.getDefaultPriority(entry));
    }
  }
  
  protected boolean canAcceptProposal(final ContentAssistEntry entry, final ContentAssistContext context) {
    return this.proposalCreator.isValidProposal(entry.getProposal(), entry.getPrefix(), context);
  }
  
  protected ContentAssistEntry createProposal(final StringConcatenationClient template, final ContentAssistContext context, final boolean adaptIndentation) {
    final ContentAssistEntry entry = new ContentAssistEntry();
    entry.setPrefix(context.getPrefix());
    String _lineDelimiter = this.getLineDelimiter();
    final AbstractIdeTemplateProposalProvider.TemplateStringConcatenation stringConcat = new AbstractIdeTemplateProposalProvider.TemplateStringConcatenation(context, entry, _lineDelimiter);
    String _xifexpression = null;
    if (adaptIndentation) {
      _xifexpression = this.getIndentation(context);
    } else {
      _xifexpression = null;
    }
    final String indentation = _xifexpression;
    if ((indentation == null)) {
      stringConcat.append(template);
    } else {
      stringConcat.append(template, indentation);
    }
    entry.setProposal(stringConcat.toString());
    return entry;
  }
  
  protected String getLineDelimiter() {
    return StringConcatenation.DEFAULT_LINE_DELIMITER;
  }
  
  protected String getIndentation(final ContentAssistContext context) {
    ICompositeNode _rootNode = context.getRootNode();
    String _text = null;
    if (_rootNode!=null) {
      _text=_rootNode.getText();
    }
    final String text = _text;
    if (((text != null) && (text.length() >= context.getOffset()))) {
      int lineStart = context.getReplaceRegion().getOffset();
      int indentEnd = lineStart;
      while (((lineStart > 0) && (text.charAt((lineStart - 1)) != "\n".charAt(0)))) {
        {
          lineStart--;
          boolean _isWhitespace = Character.isWhitespace(text.charAt(lineStart));
          boolean _not = (!_isWhitespace);
          if (_not) {
            indentEnd = lineStart;
          }
        }
      }
      return text.substring(lineStart, indentEnd);
    }
    return null;
  }
}
