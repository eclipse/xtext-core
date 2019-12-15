/**
 * Copyright (c) 2015, 2019 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.xtext.generator;

import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xtext.generator.grammarAccess.GrammarAccessExtensions;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
@SuppressWarnings("all")
public class GrammarAccessExtensionsTest {
  @Extension
  private GrammarAccessExtensions _grammarAccessExtensions = new GrammarAccessExtensions();
  
  @Test
  public void testToJavaIdentifier() {
    Assert.assertEquals("FooBar", this._grammarAccessExtensions.toJavaIdentifier("foo Bar", true));
    Assert.assertEquals("Foo", this._grammarAccessExtensions.toJavaIdentifier("foo;", true));
    Assert.assertEquals("foo", this._grammarAccessExtensions.toJavaIdentifier("foo;", false));
    Assert.assertEquals("Colon", this._grammarAccessExtensions.toJavaIdentifier(":", true));
    Assert.assertEquals("Colon", this._grammarAccessExtensions.toJavaIdentifier(":", false));
    Assert.assertEquals("Semicolon", this._grammarAccessExtensions.toJavaIdentifier(";", false));
    Assert.assertEquals("CommercialAtApostrophe", this._grammarAccessExtensions.toJavaIdentifier("@\'", false));
    Assert.assertEquals("Gr�n", this._grammarAccessExtensions.toJavaIdentifier("Gr�n", true));
    Assert.assertEquals("DollarSign", this._grammarAccessExtensions.toJavaIdentifier("$", true));
    Assert.assertEquals("_", this._grammarAccessExtensions.toJavaIdentifier("_", true));
  }
  
  /**
   * see https://bugs.eclipse.org/bugs/show_bug.cgi?id=298492
   */
  @Test
  public void testBug() throws Exception {
    Assert.assertEquals("HiraganaLetterRu", this._grammarAccessExtensions.toJavaIdentifier("\u308b", true));
  }
  
  @Test
  public void testSmoke() throws Exception {
    for (int i = 0; (i < 4000); i++) {
      {
        final String identifier = this._grammarAccessExtensions.toJavaIdentifier(String.valueOf(((char) i)), false);
        for (int j = 0; (j < identifier.length()); j++) {
          {
            final char charAt = identifier.charAt(j);
            Assert.assertTrue(((identifier + ":") + Character.valueOf(charAt)), this._grammarAccessExtensions.isValidJavaLatinIdentifier(charAt, (j == 0)));
          }
        }
      }
    }
  }
}
