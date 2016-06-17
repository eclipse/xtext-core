/**
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.parser.fragments;

import org.eclipse.xtext.parser.fragments.AbstractFragmentsTest;
import org.eclipse.xtext.parser.fragments.FragmentTestLanguageExStandaloneSetup;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
@SuppressWarnings("all")
public class FragmentsExTest extends AbstractFragmentsTest {
  @Override
  public void setUp() throws Exception {
    super.setUp();
    FragmentTestLanguageExStandaloneSetup _fragmentTestLanguageExStandaloneSetup = new FragmentTestLanguageExStandaloneSetup();
    this.with(_fragmentTestLanguageExStandaloneSetup);
  }
}
