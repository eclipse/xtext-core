/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.ide.tests.server;

import com.google.common.base.Splitter;
import com.google.common.collect.Iterables;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import org.eclipse.lsp4j.DidOpenTextDocumentParams;
import org.eclipse.lsp4j.TextDocumentItem;
import org.eclipse.lsp4j.jsonrpc.services.ServiceEndpoints;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.ide.tests.server.AbstractTestLangLanguageServerTest;
import org.eclipse.xtext.ide.tests.testlanguage.ide.TestLangLSPExtension;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Pair;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.hamcrest.CoreMatchers;
import org.hamcrest.Matcher;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

/**
 * @author efftinge - Initial contribution and API
 */
@SuppressWarnings("all")
public class LspExtensionTest extends AbstractTestLangLanguageServerTest {
  @Rule
  public ErrorCollector collector = new ErrorCollector();
  
  @Test
  public void testExtension() {
    try {
      final String fileURI = this.writeFile("mydoc.testlang", "");
      this.initialize();
      final TestLangLSPExtension ext = ServiceEndpoints.<TestLangLSPExtension>toServiceObject(this.languageServer, TestLangLSPExtension.class);
      DidOpenTextDocumentParams _didOpenTextDocumentParams = new DidOpenTextDocumentParams();
      final Procedure1<DidOpenTextDocumentParams> _function = (DidOpenTextDocumentParams it) -> {
        TextDocumentItem _textDocumentItem = new TextDocumentItem();
        final Procedure1<TextDocumentItem> _function_1 = (TextDocumentItem it_1) -> {
          it_1.setUri(fileURI);
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("foo bar");
          _builder.newLine();
          _builder.append("baz test");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("bla blubb");
          _builder.newLine();
          it_1.setText(_builder.toString());
        };
        TextDocumentItem _doubleArrow = ObjectExtensions.<TextDocumentItem>operator_doubleArrow(_textDocumentItem, _function_1);
        it.setTextDocument(_doubleArrow);
      };
      DidOpenTextDocumentParams _doubleArrow = ObjectExtensions.<DidOpenTextDocumentParams>operator_doubleArrow(_didOpenTextDocumentParams, _function);
      this.languageServer.didOpen(_doubleArrow);
      TestLangLSPExtension.TextOfLineParam _textOfLineParam = new TestLangLSPExtension.TextOfLineParam();
      final Procedure1<TestLangLSPExtension.TextOfLineParam> _function_1 = (TestLangLSPExtension.TextOfLineParam it) -> {
        it.uri = fileURI;
        it.line = 1;
      };
      TestLangLSPExtension.TextOfLineParam _doubleArrow_1 = ObjectExtensions.<TestLangLSPExtension.TextOfLineParam>operator_doubleArrow(_textOfLineParam, _function_1);
      CompletableFuture<TestLangLSPExtension.TextOfLineResult> _textOfLine = ext.getTextOfLine(_doubleArrow_1);
      final TestLangLSPExtension.TextOfLineResult result = _textOfLine.get();
      Assert.assertEquals("baz test", result.text);
      final Function1<Pair<String, Object>, Object> _function_2 = (Pair<String, Object> it) -> {
        return it.getValue();
      };
      List<Object> _map = ListExtensions.<Pair<String, Object>, Object>map(this.notifications, _function_2);
      Iterable<TestLangLSPExtension.BuildNotification> _filter = Iterables.<TestLangLSPExtension.BuildNotification>filter(_map, TestLangLSPExtension.BuildNotification.class);
      final Function1<TestLangLSPExtension.BuildNotification, String> _function_3 = (TestLangLSPExtension.BuildNotification it) -> {
        return it.message;
      };
      Iterable<String> _map_1 = IterableExtensions.<TestLangLSPExtension.BuildNotification, String>map(_filter, _function_3);
      final Consumer<String> _function_4 = (String message) -> {
        Matcher<String> _startsWith = CoreMatchers.startsWith("Built ");
        this.collector.<String>checkThat(message, _startsWith);
        Splitter _on = Splitter.on("Built ");
        Splitter _omitEmptyStrings = _on.omitEmptyStrings();
        final Iterable<String> builtResources = _omitEmptyStrings.split(message);
        int _size = IterableExtensions.size(builtResources);
        Matcher<Integer> _is = CoreMatchers.<Integer>is(Integer.valueOf(1));
        this.collector.<Integer>checkThat(Integer.valueOf(_size), _is);
        String _head = IterableExtensions.<String>head(builtResources);
        Matcher<String> _endsWith = CoreMatchers.endsWith("/org.eclipse.xtext.ide.tests/test-data/test-project/mydoc.testlang");
        this.collector.<String>checkThat(_head, _endsWith);
      };
      _map_1.forEach(_function_4);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
