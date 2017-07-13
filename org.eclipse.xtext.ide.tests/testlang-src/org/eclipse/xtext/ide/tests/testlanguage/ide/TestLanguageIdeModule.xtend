/*
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.ide.tests.testlanguage.ide

import org.eclipse.xtext.ide.server.ILanguageServerExtension
import org.eclipse.xtext.ide.server.codelens.ICodeLensResolver
import org.eclipse.xtext.ide.server.codelens.ICodeLensService
import org.eclipse.xtext.ide.tests.testlanguage.ide.server.CodeLensService
import org.eclipse.xtext.ide.server.codeActions.ICodeActionService
import org.eclipse.xtext.ide.tests.testlanguage.ide.server.CodeActionService

/**
 * Use this class to register ide components.
 */
class TestLanguageIdeModule extends AbstractTestLanguageIdeModule {
	
	def Class<? extends ILanguageServerExtension> bindLanguageServerExtension() {
		TestLangLSPExtension
	}
	
	def Class<? extends ICodeLensResolver> bindICodeLensResolver() {
		CodeLensService
	}
	
	def Class<? extends ICodeLensService> bindICodeLensService() {
		CodeLensService
	}
	
	def Class<? extends ICodeActionService> bindICodeActionService() {
		CodeActionService
	}
	
}
