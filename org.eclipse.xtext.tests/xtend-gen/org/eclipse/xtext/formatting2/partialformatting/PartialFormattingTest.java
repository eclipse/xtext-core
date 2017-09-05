/**
 * Copyright (c) 2019 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.formatting2.partialformatting;

import com.google.inject.Inject;
import java.util.Arrays;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.IHiddenRegionFormatter;
import org.eclipse.xtext.formatting2.internal.GenericFormatter;
import org.eclipse.xtext.formatting2.internal.GenericFormatterTestRequest;
import org.eclipse.xtext.formatting2.internal.GenericFormatterTester;
import org.eclipse.xtext.formatting2.partialformatting.MyPartialFormattingTestLanguageInjectorProvider;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;
import org.eclipse.xtext.formatting2.regionaccess.ITextRegionExtensions;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Model;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Unit;
import org.eclipse.xtext.util.ITextRegion;
import org.eclipse.xtext.util.TextRegion;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @author Christian Wehrheim - Initial contribution and API
 */
@RunWith(XtextRunner.class)
@InjectWith(MyPartialFormattingTestLanguageInjectorProvider.class)
@SuppressWarnings("all")
public class PartialFormattingTest {
  public static class TestFormatter extends GenericFormatter<Model> {
    protected void _format(final Unit unit, @Extension final IFormattableDocument document) {
      final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
        it.newLine();
      };
      document.append(this.textRegionExtensions.regionFor(unit).keyword("{"), _function);
      final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
        it.newLine();
      };
      document.prepend(this.textRegionExtensions.regionFor(unit).keyword("}"), _function_1);
      final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
        it.indent();
      };
      document.<ISemanticRegion, ISemanticRegion>interior(
        this.textRegionExtensions.regionFor(unit).keyword("{"), 
        this.textRegionExtensions.regionFor(unit).keyword("}"), _function_2);
    }
    
    @Override
    protected void format(final Model model, final ITextRegionExtensions regionAccess, final IFormattableDocument document) {
      EList<Unit> _units = model.getUnits();
      for (final Unit unit : _units) {
        this.format(unit, document);
      }
    }
    
    public void format(final Object unit, final IFormattableDocument document) {
      if (unit instanceof XtextResource) {
        _format((XtextResource)unit, document);
        return;
      } else if (unit instanceof Unit) {
        _format((Unit)unit, document);
        return;
      } else if (unit instanceof EObject) {
        _format((EObject)unit, document);
        return;
      } else if (unit == null) {
        _format((Void)null, document);
        return;
      } else if (unit != null) {
        _format(unit, document);
        return;
      } else {
        throw new IllegalArgumentException("Unhandled parameter types: " +
          Arrays.<Object>asList(unit, document).toString());
      }
    }
  }
  
  @Inject
  @Extension
  private GenericFormatterTester _genericFormatterTester;
  
  @Test
  public void test_nonPartial() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("unit unitname {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("source : /a/b/c/;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("output : /d/e/f/;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    final String source = _builder.toString();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("unit unitname {");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("source : /a/b/c/;");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("output : /d/e/f/;");
    _builder_1.newLine();
    _builder_1.append("}");
    _builder_1.newLine();
    final String expected = _builder_1.toString();
    final Procedure1<GenericFormatterTestRequest> _function = (GenericFormatterTestRequest it) -> {
      it.setToBeFormatted(source);
      PartialFormattingTest.TestFormatter _testFormatter = new PartialFormattingTest.TestFormatter();
      it.setFormatter(_testFormatter);
      Collection<ITextRegion> _regions = it.getRequest().getRegions();
      int _length = source.length();
      TextRegion _textRegion = new TextRegion(0, _length);
      _regions.add(_textRegion);
      it.setExpectation(expected);
    };
    this._genericFormatterTester.assertFormatted(_function);
  }
  
  @Test
  public void test_partial() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("unit unitname {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("source : /a/b/c/;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("output : /d/e/f/;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    final String source = _builder.toString();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("unit unitname {");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("source : /a/b/c/;");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("output : /d/e/f/;");
    _builder_1.newLine();
    _builder_1.append("}");
    _builder_1.newLine();
    final String expected = _builder_1.toString();
    final String part = "\t\tsource : /a/b/c/;";
    final int offset = source.indexOf(part);
    final int length = part.length();
    final Procedure1<GenericFormatterTestRequest> _function = (GenericFormatterTestRequest it) -> {
      it.setToBeFormatted(source);
      PartialFormattingTest.TestFormatter _testFormatter = new PartialFormattingTest.TestFormatter();
      it.setFormatter(_testFormatter);
      Collection<ITextRegion> _regions = it.getRequest().getRegions();
      TextRegion _textRegion = new TextRegion(offset, length);
      _regions.add(_textRegion);
      it.setExpectation(expected);
    };
    this._genericFormatterTester.assertFormatted(_function);
  }
}
