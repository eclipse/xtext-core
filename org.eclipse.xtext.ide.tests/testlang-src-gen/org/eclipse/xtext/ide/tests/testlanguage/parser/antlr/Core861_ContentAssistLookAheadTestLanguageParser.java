/*
 * Copyright (c) 2016, 2017 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.ide.tests.testlanguage.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.ide.tests.testlanguage.parser.antlr.internal.InternalCore861_ContentAssistLookAheadTestLanguageParser;
import org.eclipse.xtext.ide.tests.testlanguage.services.Core861_ContentAssistLookAheadTestLanguageGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class Core861_ContentAssistLookAheadTestLanguageParser extends AbstractAntlrParser {

	@Inject
	private Core861_ContentAssistLookAheadTestLanguageGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalCore861_ContentAssistLookAheadTestLanguageParser createParser(XtextTokenStream stream) {
		return new InternalCore861_ContentAssistLookAheadTestLanguageParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Member";
	}

	public Core861_ContentAssistLookAheadTestLanguageGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(Core861_ContentAssistLookAheadTestLanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
