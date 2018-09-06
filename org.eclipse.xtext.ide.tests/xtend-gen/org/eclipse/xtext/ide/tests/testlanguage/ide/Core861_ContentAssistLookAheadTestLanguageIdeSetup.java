/**
 * Copyright (c) 2016, 2017 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.ide.tests.testlanguage.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.ide.tests.testlanguage.Core861_ContentAssistLookAheadTestLanguageRuntimeModule;
import org.eclipse.xtext.ide.tests.testlanguage.Core861_ContentAssistLookAheadTestLanguageStandaloneSetup;
import org.eclipse.xtext.ide.tests.testlanguage.ide.Core861_ContentAssistLookAheadTestLanguageIdeModule;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class Core861_ContentAssistLookAheadTestLanguageIdeSetup extends Core861_ContentAssistLookAheadTestLanguageStandaloneSetup {
  @Override
  public Injector createInjector() {
    Core861_ContentAssistLookAheadTestLanguageRuntimeModule _core861_ContentAssistLookAheadTestLanguageRuntimeModule = new Core861_ContentAssistLookAheadTestLanguageRuntimeModule();
    Core861_ContentAssistLookAheadTestLanguageIdeModule _core861_ContentAssistLookAheadTestLanguageIdeModule = new Core861_ContentAssistLookAheadTestLanguageIdeModule();
    return Guice.createInjector(Modules2.mixin(_core861_ContentAssistLookAheadTestLanguageRuntimeModule, _core861_ContentAssistLookAheadTestLanguageIdeModule));
  }
}
