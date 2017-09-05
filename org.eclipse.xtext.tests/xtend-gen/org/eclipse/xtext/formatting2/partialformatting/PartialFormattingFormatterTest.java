/**
 * Copyright (c) 2017 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.formatting2.partialformatting;

import java.util.Collection;
import javax.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.formatting2.FormatterPreferenceKeys;
import org.eclipse.xtext.formatting2.partialformatting.tests.PartialFormattingTestLanguageInjectorProvider;
import org.eclipse.xtext.preferences.MapBasedPreferenceValues;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.formatter.FormatterTestHelper;
import org.eclipse.xtext.testing.formatter.FormatterTestRequest;
import org.eclipse.xtext.util.ITextRegion;
import org.eclipse.xtext.util.TextRegion;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @author cwehrheim - Initial contribution and API
 */
@RunWith(XtextRunner.class)
@InjectWith(PartialFormattingTestLanguageInjectorProvider.class)
@SuppressWarnings("all")
public class PartialFormattingFormatterTest {
  @Inject
  protected FormatterTestHelper tester;
  
  @Test
  public void testFormatting1() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("entity A {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("attr a : String");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("attr b : Int");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    final String exp = _builder.toString();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("entity A {");
    _builder_1.newLine();
    _builder_1.append("\t\t\t");
    _builder_1.append("attr a : String");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("attr b : Int");
    _builder_1.newLine();
    _builder_1.append("}");
    _builder_1.newLine();
    final String source = _builder_1.toString();
    final String part = "\t\t\tattr a : String";
    final int offset = source.indexOf(part);
    final int length = part.length();
    final Procedure1<FormatterTestRequest> _function = (FormatterTestRequest it) -> {
      final Procedure1<MapBasedPreferenceValues> _function_1 = (MapBasedPreferenceValues it_1) -> {
        it_1.<Integer>put(FormatterPreferenceKeys.maxLineWidth, Integer.valueOf(80));
      };
      it.preferences(_function_1);
      it.setExpectation(exp);
      it.setToBeFormatted(source);
      Collection<ITextRegion> _regions = it.getRequest().getRegions();
      TextRegion _textRegion = new TextRegion((offset - 1), (length + 1));
      _regions.add(_textRegion);
      it.setAllowSyntaxErrors(false);
    };
    this.tester.assertFormatted(_function);
  }
  
  @Test
  public void testFormatting2() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("entity A {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("attr a : String");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("attr b : Int");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    final String exp = _builder.toString();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("entity A {");
    _builder_1.newLine();
    _builder_1.append("\t\t\t");
    _builder_1.append("attr a : String");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("attr b : Int");
    _builder_1.newLine();
    _builder_1.append("}");
    _builder_1.newLine();
    final String source = _builder_1.toString();
    final String part = "\t\t\tattr a : String";
    final int offset = source.indexOf(part);
    final int length = part.length();
    final Procedure1<FormatterTestRequest> _function = (FormatterTestRequest it) -> {
      final Procedure1<MapBasedPreferenceValues> _function_1 = (MapBasedPreferenceValues it_1) -> {
        it_1.<Integer>put(FormatterPreferenceKeys.maxLineWidth, Integer.valueOf(80));
      };
      it.preferences(_function_1);
      it.setExpectation(exp);
      it.setToBeFormatted(source);
      Collection<ITextRegion> _regions = it.getRequest().getRegions();
      TextRegion _textRegion = new TextRegion(offset, length);
      _regions.add(_textRegion);
      it.setAllowSyntaxErrors(false);
    };
    this.tester.assertFormatted(_function);
  }
  
  @Test
  public void testFormatting3() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("entity A {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("attr a : String");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("attr b : Int");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("entity B {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("attr c : String");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("attr d : Int");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("entity C {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("attr e : String");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("attr f : Int");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ref g : A");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    final String exp = _builder.toString();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("entity A {attr a : String    attr b : Int   }  entity B {");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("attr c : String");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("attr d : Int");
    _builder_1.newLine();
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("entity C {  \t\tattr e : String  \t\tattr f : Int \t\t\tref g : A\t}");
    _builder_1.newLine();
    final String source = _builder_1.toString();
    final Procedure1<FormatterTestRequest> _function = (FormatterTestRequest it) -> {
      final Procedure1<MapBasedPreferenceValues> _function_1 = (MapBasedPreferenceValues it_1) -> {
        it_1.<Integer>put(FormatterPreferenceKeys.maxLineWidth, Integer.valueOf(80));
      };
      it.preferences(_function_1);
      it.setExpectation(exp);
      it.setToBeFormatted(source);
      it.setAllowSyntaxErrors(false);
    };
    this.tester.assertFormatted(_function);
  }
  
  @Test
  public void testFormatting4() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("entity A {attr a : String    attr b : Int   }  entity B {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("attr c : String");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("attr d : Int");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("entity C {  \t\tattr e : String  \t\tattr f : Int \t\t\tref g : A\t}");
    _builder.newLine();
    final String exp = _builder.toString();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("entity A {attr a : String    attr b : Int   }  entity B {");
    _builder_1.newLine();
    _builder_1.append("\t\t\t");
    _builder_1.append("attr c : String");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t");
    _builder_1.append("attr d : Int");
    _builder_1.newLine();
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("entity C {  \t\tattr e : String  \t\tattr f : Int \t\t\tref g : A\t}");
    _builder_1.newLine();
    final String source = _builder_1.toString();
    final String part1 = "\t\tattr c : String";
    final int offset1 = source.indexOf(part1);
    final int length1 = part1.length();
    final String part2 = "\t\t\t\tattr d : Int";
    final int offset2 = source.indexOf(part2);
    final int length2 = part2.length();
    final Procedure1<FormatterTestRequest> _function = (FormatterTestRequest it) -> {
      final Procedure1<MapBasedPreferenceValues> _function_1 = (MapBasedPreferenceValues it_1) -> {
        it_1.<Integer>put(FormatterPreferenceKeys.maxLineWidth, Integer.valueOf(80));
      };
      it.preferences(_function_1);
      it.setExpectation(exp);
      it.setToBeFormatted(source);
      Collection<ITextRegion> _regions = it.getRequest().getRegions();
      TextRegion _textRegion = new TextRegion(offset1, length1);
      _regions.add(_textRegion);
      Collection<ITextRegion> _regions_1 = it.getRequest().getRegions();
      TextRegion _textRegion_1 = new TextRegion(offset2, length2);
      _regions_1.add(_textRegion_1);
      it.setAllowSyntaxErrors(false);
    };
    this.tester.assertFormatted(_function);
  }
  
  @Test
  public void testFormatting5() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("entity A {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("attr a : String");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("attr b : Int");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("entity B {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("attr c : String");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("attr d : Int");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("entity C {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("attr e : String");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("attr f : Int");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ref g : A");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    final String exp = _builder.toString();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("entity A {attr a : String    attr b : Int   }  entity B {");
    _builder_1.newLine();
    _builder_1.append("\t\t\t");
    _builder_1.append("attr c : String");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t\t");
    _builder_1.append("attr d : Int");
    _builder_1.newLine();
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("entity C {  \t\tattr e : String  \t\tattr f : Int \t\t\tref g : A\t}");
    _builder_1.newLine();
    final String source = _builder_1.toString();
    final Procedure1<FormatterTestRequest> _function = (FormatterTestRequest it) -> {
      final Procedure1<MapBasedPreferenceValues> _function_1 = (MapBasedPreferenceValues it_1) -> {
        it_1.<Integer>put(FormatterPreferenceKeys.maxLineWidth, Integer.valueOf(80));
      };
      it.preferences(_function_1);
      it.setExpectation(exp);
      it.setToBeFormatted(source);
      Collection<ITextRegion> _regions = it.getRequest().getRegions();
      TextRegion _textRegion = new TextRegion(10, 82);
      _regions.add(_textRegion);
      Collection<ITextRegion> _regions_1 = it.getRequest().getRegions();
      TextRegion _textRegion_1 = new TextRegion(107, 49);
      _regions_1.add(_textRegion_1);
      it.setAllowSyntaxErrors(false);
    };
    this.tester.assertFormatted(_function);
  }
}
