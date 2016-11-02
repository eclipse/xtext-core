/*******************************************************************************
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.ide.editor.contentassist.antlr;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.UnorderedGroup;
import org.eclipse.xtext.XtextFactory;
import org.eclipse.xtext.ide.editor.contentassist.IFollowElementAcceptor;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import com.google.inject.Inject;
import com.google.inject.Provider;

/**
 * @since 2.9
 */
public class FollowElementComputer {
	
	@Inject IContentAssistParser parser;
	
	/**
	 * @since 2.11
	 */
	@Inject Provider<FollowElementCalculator> feCalculatorProvider;
	
	public void collectAbstractElements(Grammar grammar, EStructuralFeature feature, IFollowElementAcceptor followElementAcceptor) {
		for (Grammar superGrammar : grammar.getUsedGrammars()) {
			collectAbstractElements(superGrammar, feature, followElementAcceptor);
		}
		EClass declarator = feature.getEContainingClass();
		for (ParserRule rule : GrammarUtil.allParserRules(grammar)) {
			for (Assignment assignment : GrammarUtil.containedAssignments(rule)) {
				if (assignment.getFeature().equals(feature.getName())) {
					EClassifier classifier = GrammarUtil.findCurrentType(assignment);
					EClassifier compType = EcoreUtil2.getCompatibleType(declarator, classifier);
					if (compType == declarator) {
						followElementAcceptor.accept(assignment);
					}
				}
			}
		}
	}
	
	public void computeFollowElements(Collection<FollowElement> followElements, final IFollowElementAcceptor followElementAcceptor) {
		FollowElementCalculator calculator = feCalculatorProvider.get();
		calculator.acceptor = new IFollowElementAcceptor(){
			@Override
			public void accept(AbstractElement element) {
				ParserRule rule = GrammarUtil.containingParserRule(element);
				if (rule == null || !GrammarUtil.isDatatypeRule(rule))
					followElementAcceptor.accept(element);
			}
		};
		for(FollowElement element: followElements) {
			List<Integer> paramStack = element.getParamStack();
			if (!paramStack.isEmpty()) {
				calculator.setParameterConfig(paramStack.get(paramStack.size() - 1));
			} else {
				calculator.setParameterConfig(0);
			}
			computeFollowElements(calculator, element);
		}
	}
	
	public void computeFollowElements(Collection<FollowElement> followElements, final Collection<AbstractElement> result) {
		computeFollowElements(followElements, new IFollowElementAcceptor(){
			@Override
			public void accept(AbstractElement element) {
				result.add(element);
			}
		});
	}

	protected void computeFollowElements(FollowElementCalculator calculator, FollowElement element) {
		Multimap<Integer, List<AbstractElement>> visited = HashMultimap.create();
		computeFollowElements(calculator, element, visited);
	}
	
	protected void computeFollowElements(FollowElementCalculator calculator, FollowElement element, Multimap<Integer, List<AbstractElement>> visited) {
		List<AbstractElement> currentState = Lists.newArrayList(element.getLocalTrace());
		currentState.add(element.getGrammarElement());
		if (!visited.put(element.getLookAhead(), currentState))
			return;
		if (element.getLookAhead() <= 1) {
			for(AbstractElement abstractElement: currentState) {
				Assignment ass = EcoreUtil2.getContainerOfType(abstractElement, Assignment.class);
				if (ass != null)
					calculator.doSwitch(ass);
				else {
					if (abstractElement instanceof UnorderedGroup && abstractElement == element.getGrammarElement()) {
						calculator.doSwitch((UnorderedGroup) abstractElement, element.getHandledUnorderedGroupElements());
					} else {
						calculator.doSwitch(abstractElement);
						if (GrammarUtil.isOptionalCardinality(abstractElement)) {
							EObject container = abstractElement.eContainer();
							if (container instanceof Group) {
								Group group = (Group) container;
								int idx = group.getElements().indexOf(abstractElement);
								if (idx == group.getElements().size() - 1) {
									if (!currentState.contains(group) && GrammarUtil.isMultipleCardinality(group)) {
										calculator.doSwitch(group);
									}
								} else if (idx < group.getElements().size() - 1 && "?".equals(abstractElement.getCardinality())) { // loops are fine
									AbstractElement nextElement = group.getElements().get(idx + 1);
									if (!currentState.contains(nextElement)) {
										calculator.doSwitch(nextElement);
									}
								}
							}
						} else if (isAlternativeWithEmptyPath(abstractElement)) {
							EObject container = abstractElement.eContainer();
							if (container instanceof Group) {
								Group group = (Group) container;
								int idx = group.getElements().indexOf(abstractElement);
								if (!currentState.contains(group) && idx != group.getElements().size() - 1) {
									AbstractElement next = group.getElements().get(idx + 1);
									if (!currentState.contains(next)) {
										calculator.doSwitch(next);
									}
								}
							}
						}
					}
				}
			}
			// special case: entry rule, first abstract element
			// we need a synthetic rule call
			if (element.getTrace().equals(element.getLocalTrace())) {
				ParserRule parserRule = GrammarUtil.containingParserRule(element.getGrammarElement());
				if (parserRule != null) {
					RuleCall ruleCall = XtextFactory.eINSTANCE.createRuleCall();
					ruleCall.setRule(parserRule);
					calculator.doSwitch(ruleCall);
				}
			}
			return;
		}
		Collection<FollowElement> followElements = parser.getFollowElements(element);
		for(FollowElement newElement: followElements) {
			if (newElement.getLookAhead() != element.getLookAhead() || newElement.getGrammarElement() != element.getGrammarElement()) {
				if (newElement.getLookAhead() == element.getLookAhead()) {
					int originalTraceSize = element.getLocalTrace().size();
					List<AbstractElement> newTrace = newElement.getLocalTrace();
					if (newTrace.size() > originalTraceSize) {
						if (Collections.indexOfSubList(element.getLocalTrace(), newTrace.subList(originalTraceSize, newTrace.size())) != -1) {
							continue;
						}
					}
				}
				computeFollowElements(calculator, newElement, visited);
			}
		}
	}

	private boolean isAlternativeWithEmptyPath(AbstractElement abstractElement) {
		if (abstractElement instanceof Alternatives) {
			Alternatives alternatives = (Alternatives) abstractElement;
			for(AbstractElement path: alternatives.getElements()) {
				if (GrammarUtil.isOptionalCardinality(path))
					return true;
			}
		}
		return false;
	}
}
