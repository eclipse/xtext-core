/*******************************************************************************
 * Copyright (c) 2008 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.parser.packrat.tokens;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.packrat.IParsedTokenVisitor;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public class ParsedTerminalWithFeature extends ParsedTerminal {
	
	private final String feature;
	private final boolean isMany;
	private final boolean isBoolean;
	private final String lexerRule;

	public ParsedTerminalWithFeature(int offset, int length, EObject grammarElement, 
			boolean hidden, String feature, boolean isMany, boolean isBoolean, String lexerRule) {
		super(offset, length, grammarElement, hidden);
		this.feature = feature;
		this.isMany = isMany;
		this.isBoolean = isBoolean;
		this.lexerRule = lexerRule;
	}

	@Override
	public void accept(IParsedTokenVisitor visitor) {
		visitor.visitParsedTerminalWithFeature(this);
	}

	public String getFeature() {
		return feature;
	}

	public boolean isMany() {
		return isMany;
	}

	public boolean isBoolean() {
		return isBoolean;
	}

	public String getLexerRule() {
		return lexerRule;
	}

}
