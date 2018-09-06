/**
 * Copyright (c) 2018 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.ide.tests.editor.contentassist;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.inject.Inject;
import java.util.concurrent.Executors;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.grammaranalysis.impl.GrammarElementTitleSwitch;
import org.eclipse.xtext.ide.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ide.editor.contentassist.antlr.ContentAssistContextFactory;
import org.eclipse.xtext.ide.tests.testlanguage.Core861_ContentAssistLookAheadTestLanguageIdeInjectorProvider;
import org.eclipse.xtext.resource.FileExtensionProvider;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.util.StringInputStream;
import org.eclipse.xtext.util.TextRegion;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Pair;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @author Christian Schneider - Initial contribution and API
 */
@RunWith(XtextRunner.class)
@InjectWith(Core861_ContentAssistLookAheadTestLanguageIdeInjectorProvider.class)
@SuppressWarnings("all")
public class Core861_ContentAssistLookAheadTest {
  @Test
  public void test() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("int y() {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("bar<|>");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    final String good1 = this.firstSetGrammarElementsToString(_builder.toString());
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("public int y () {");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("bar<|>");
    _builder_1.newLine();
    _builder_1.append("}");
    _builder_1.newLine();
    final String good2 = this.firstSetGrammarElementsToString(_builder_1.toString());
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("public int y() {");
    _builder_2.newLine();
    _builder_2.append("\t");
    _builder_2.append("bar<|>");
    _builder_2.newLine();
    _builder_2.append("}");
    _builder_2.newLine();
    final String bad = this.firstSetGrammarElementsToString(_builder_2.toString());
    Assert.assertEquals(good1, good2);
    Assert.assertEquals(good2, bad);
  }
  
  @Inject
  private ContentAssistContextFactory factory;
  
  private final String cursor = "<|>";
  
  public String firstSetGrammarElementsToString(final String input) {
    final int offset = input.indexOf(this.cursor);
    Preconditions.checkArgument((offset >= 0), "you forgot to provide a cursor");
    final String doc = input.replace(this.cursor, "");
    final XtextResource res = this.parse(doc);
    this.factory.setPool(Executors.newSingleThreadExecutor());
    TextRegion _textRegion = new TextRegion(0, 0);
    final ContentAssistContext[] ctxs = this.factory.create(doc, _textRegion, offset, res);
    final GrammarElementTitleSwitch f = new GrammarElementTitleSwitch().showAssignments().showQualified().showRule();
    StringConcatenation _builder = new StringConcatenation();
    {
      Iterable<Pair<Integer, ContentAssistContext>> _indexed = IterableExtensions.<ContentAssistContext>indexed(((Iterable<? extends ContentAssistContext>)Conversions.doWrapArray(ctxs)));
      for(final Pair<Integer, ContentAssistContext> ctx : _indexed) {
        _builder.append("context");
        Integer _key = ctx.getKey();
        _builder.append(_key);
        _builder.append(" {");
        _builder.newLineIfNotEmpty();
        {
          ImmutableList<AbstractElement> _firstSetGrammarElements = ctx.getValue().getFirstSetGrammarElements();
          for(final AbstractElement ele : _firstSetGrammarElements) {
            _builder.append("\t");
            String _name = ele.eClass().getName();
            _builder.append(_name, "\t");
            _builder.append(": ");
            String _apply = f.apply(ele);
            _builder.append(_apply, "\t");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("}");
        _builder.newLine();
      }
    }
    return _builder.toString();
  }
  
  @Inject
  private FileExtensionProvider fileExtension;
  
  @Inject
  private IResourceFactory resFactory;
  
  private XtextResource parse(final String doc) {
    try {
      String _primaryFileExtension = this.fileExtension.getPrimaryFileExtension();
      String _plus = ("dummy." + _primaryFileExtension);
      final URI uri = URI.createURI(_plus);
      Resource _createResource = this.resFactory.createResource(uri);
      final XtextResource res = ((XtextResource) _createResource);
      EList<Resource> _resources = new XtextResourceSet().getResources();
      _resources.add(res);
      StringInputStream _stringInputStream = new StringInputStream(doc);
      res.load(_stringInputStream, CollectionLiterals.<Object, Object>emptyMap());
      return res;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
