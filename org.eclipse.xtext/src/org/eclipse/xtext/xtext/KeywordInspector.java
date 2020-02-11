/*******************************************************************************
 * Copyright (c) 2009 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.xtext;

import java.util.List;

import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.XtextPackage;
import org.eclipse.xtext.util.IResourceScopeCache;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.validation.ValidationMessageAcceptor;

/**
 * <p>Simple implementation of a check for keywords that collide with terminal rules.</p>
 * It identifies cases like
 * <pre>
 * Rule: op='+';
 * PLUS: '+';
 * </pre>
 * 
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public class KeywordInspector {

	private final ValidationMessageAcceptor acceptor;
	private final IResourceScopeCache cache;

	public KeywordInspector(ValidationMessageAcceptor messageAcceptor, IResourceScopeCache cache) {
		this.acceptor = messageAcceptor;
		this.cache = cache;
	}
	
	public void inspectKeywordHidesTerminalRule(Keyword keyword) {
		AbstractRule container = GrammarUtil.containingRule(keyword);
		if (container instanceof TerminalRule)
			return;
		Grammar grammar = GrammarUtil.getGrammar(container);
		List<TerminalRule> rules = cache.get(KeywordInspector.class, grammar.eResource(), ()->GrammarUtil.allTerminalRules(grammar));
		for(TerminalRule rule: rules) {
			if (!rule.isFragment()) {
				AbstractElement element = rule.getAlternatives();
				if (element instanceof Keyword && Strings.isEmpty(element.getCardinality())) {
					String value = ((Keyword) element).getValue();
					if (value.equals(keyword.getValue()))
						acceptor.acceptError(
							"The keyword '" + value + "' hides the terminal rule " + rule.getName()+ ".", 
							keyword,
							XtextPackage.Literals.KEYWORD__VALUE,
							ValidationMessageAcceptor.INSIGNIFICANT_INDEX, null);
				}
			}
		}
	}

}
