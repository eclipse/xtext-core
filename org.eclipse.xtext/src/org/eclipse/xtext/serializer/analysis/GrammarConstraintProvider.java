/*******************************************************************************
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.serializer.analysis;

import static org.eclipse.xtext.serializer.analysis.IGrammarConstraintProvider.ConstraintElementType.*;
import static org.eclipse.xtext.serializer.analysis.ISemanticSequencerNfaProvider.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.grammaranalysis.impl.GrammarElementTitleSwitch;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.analysis.ISemanticSequencerNfaProvider.ISemState;
import org.eclipse.xtext.serializer.analysis.SerializationContextMap.Entry;
import org.eclipse.xtext.util.formallang.Nfa;
import org.eclipse.xtext.util.formallang.NfaToProduction;
import org.eclipse.xtext.util.formallang.NfaUtil;
import org.eclipse.xtext.util.formallang.Pda;
import org.eclipse.xtext.util.formallang.ProductionFactory;
import org.eclipse.xtext.util.formallang.ProductionFormatter;

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;
import com.google.inject.Inject;

/**
 * @author Moritz Eysholdt - Initial contribution and API
 */
public class GrammarConstraintProvider implements IGrammarConstraintProvider {

	protected static class Constraint implements IGrammarConstraintProvider.IConstraint {

		private IConstraintElement body = UNINITIALIZED;

		private final List<ISerializationContext> contexts = Lists.newArrayList();

		private IFeatureInfo[] features = null;

		private final Grammar grammar;

		private String identity;

		private String name;

		private final Nfa<ISemState> nfa;

		private final EClass type;

		public Constraint(Grammar grammar, EClass type, Nfa<ISemState> nfa) {
			super();
			this.grammar = grammar;
			this.type = type;
			this.nfa = nfa;
		}

		protected void collectBounds(ISemState state, int[] current, Set<ISemState> visited, int[] min, int[] max) {
			int featureID = state.getFeatureID();
			int previousValue = -1;
			boolean newVisit = false;
			if (featureID >= 0) {
				if (current[featureID] == IGrammarConstraintProvider.MAX)
					return;
				previousValue = current[featureID];
				newVisit = visited.add(state);
				if (newVisit)
					current[featureID]++;
				else
					current[featureID] = IGrammarConstraintProvider.MAX;
			} else if (state.getFollowers().isEmpty()) {
				for (int i = 0; i < current.length; i++) {
					max[i] = Math.max(current[i], max[i]);
					min[i] = Math.min(current[i], min[i]);
				}
				return;
			}
			for (ISemState follower : state.getFollowers()) {
				collectBounds(follower, current, visited, min, max);
			}
			if (previousValue >= 0)
				current[featureID] = previousValue;
			if (newVisit)
				visited.remove(state);
		}

		@Override
		public int compareTo(IConstraint o) {
			return getName().compareTo(o.getName());
		}

		@Override
		public boolean equals(Object obj) {
			if (obj == null || obj.getClass() != getClass())
				return false;
			if (this == obj)
				return true;
			return getIdentity().equals(((Constraint) obj).getIdentity());
		}

		@Override
		public IConstraintElement getBody() {
			if (body == UNINITIALIZED) {
				ConstraintElementFactory factory = new ConstraintElementFactory(this);
				NfaToProduction n2p = new NfaToProduction().excludeStartAndStop();
				GrammarElementDeclarationOrder order = GrammarElementDeclarationOrder.get(grammar);
				IConstraintElement element = n2p.nfaToGrammar(nfa, GET_ASSIGNED_GRAMMAR_ELEMENT, order, factory);
				if (element.getType() == GROUP && element.getChildren().isEmpty())
					body = null;
				else
					body = element;
			}
			return body;
		}

		@Override
		public List<ISerializationContext> getContexts() {
			return contexts;
		}

		@Override
		public IFeatureInfo[] getFeatures() {
			if (features == null) {
				if (type == null) {
					features = new IFeatureInfo[0];
				} else {
					int count = type.getFeatureCount();
					features = new IFeatureInfo[count];
					int[] current = new int[count];
					int[] min = new int[count];
					int[] max = new int[count];
					Arrays.fill(current, 0);
					Arrays.fill(min, IGrammarConstraintProvider.MAX);
					Arrays.fill(max, -1);
					collectBounds(nfa.getStart(), current, Sets.<ISemState> newHashSet(), min, max);
					for (int i = 0; i < count; i++) {
						EStructuralFeature feature = type.getEStructuralFeature(i);
						features[i] = new FeatureInfo(this, feature, max[i], min[i]);
					}
				}
			}
			return features;

		}

		protected String getIdentity() {
			if (identity == null) {
				String nfaString = new NfaUtil().identityString(nfa, new Function<ISemState, String>() {
					@Override
					public String apply(ISemState input) {
						AbstractElement element = input.getAssignedGrammarElement();
						return element == null ? null : EcoreUtil.getURI(element).toString();
					}
				});
				String typeString = type == null ? "null" : type.getName() + "@" + type.getEPackage().getNsURI();
				identity = typeString + "\n" + nfaString;
			}
			return identity;
		}

		@Override
		public String getName() {
			return name + "_" + (type == null ? "null" : type.getName());
		}

		@Override
		public Nfa<ISemState> getNfa() {
			return nfa;
		}

		@Override
		public String getSimpleName() {
			return name;
		}

		@Override
		public EClass getType() {
			return type;
		}

		@Override
		public int hashCode() {
			return getIdentity().hashCode();
		}

		protected void setName(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			String typeName = getType() == null ? "null" : getType().getName();
			String body = getBody() != null ? getBody().toString() : "{" + typeName + "}";
			return getName() + " returns " + typeName + ": " + body + ";";
		}

	}

	protected static class ConstraintElement implements IGrammarConstraintProvider.IConstraintElement {

		private final Collection<IConstraintElement> children;
		private final IConstraint constraint;

		private final AbstractElement element;

		private final boolean many;

		private final boolean optional;
		private IConstraintElement parent;
		private final ConstraintElementType type;

		public ConstraintElement(IConstraint constraint, ConstraintElementType type, AbstractElement element, boolean many,
				boolean optional) {
			super();
			this.constraint = constraint;
			this.type = type;
			this.element = element;
			this.children = null;
			this.many = many;
			this.optional = optional;
		}

		public ConstraintElement(IConstraint constraint, ConstraintElementType type, Collection<IConstraintElement> children, boolean many,
				boolean optional) {
			super();
			this.constraint = constraint;
			this.type = type;
			this.element = null;
			this.children = children;
			this.many = many;
			this.optional = optional;
			for (IConstraintElement child : children)
				((ConstraintElement) child).parent = this;
		}

		@Override
		public Collection<IConstraintElement> getChildren() {
			return children == null ? Collections.<IConstraintElement> emptyList() : children;
		}

		@Override
		public IConstraintElement getContainer() {
			return parent;
		}

		@Override
		public IConstraint getContainingConstraint() {
			return constraint;
		}

		public String getFeatureName() {
			if (element instanceof Action)
				return ((Action) element).getFeature();
			Assignment assignment = GrammarUtil.containingAssignment(element);
			if (assignment != null)
				return assignment.getFeature();
			return null;
		}

		@Override
		public AbstractElement getGrammarElement() {
			return element;
		}

		@Override
		public ConstraintElementType getType() {
			return type;
		}

		@Override
		public boolean isMany() {
			return many;
		}

		@Override
		public boolean isOptional() {
			return optional;
		}

		@Override
		public String toString() {
			GrammarElementTitleSwitch t2s = new GrammarElementTitleSwitch().hideCardinality().showActionsAsRuleCalls().showAssignments();
			ProductionFormatter<IConstraintElement, AbstractElement> formatter = new ProductionFormatter<IConstraintElement, AbstractElement>();
			formatter.setTokenToString(t2s);
			return formatter.format(new ConstraintElementProduction(getContainingConstraint()), this, true);
		}
	}

	protected static class ConstraintElementFactory implements ProductionFactory<IConstraintElement, AbstractElement> {

		private final IConstraint constraint;

		public ConstraintElementFactory(IConstraint constraint) {
			super();
			this.constraint = constraint;
		}

		@Override
		public IConstraintElement createForAlternativeChildren(boolean m, boolean o, Iterable<IConstraintElement> c) {

			return new ConstraintElement(constraint, ALTERNATIVE, ImmutableSet.copyOf(c), m, o);
		}

		@Override
		public IConstraintElement createForSequentialChildren(boolean m, boolean o, Iterable<IConstraintElement> c) {
			return new ConstraintElement(constraint, GROUP, ImmutableList.copyOf(c), m, o);
		}

		@Override
		public IConstraintElement createForToken(boolean many, boolean optional, AbstractElement token) {
			ConstraintElementType type = token == null ? null : getConstraintElementType(token);
			return new ConstraintElement(constraint, type, token, many, optional);
		}

		@Override
		public IConstraintElement createForUnordertedChildren(boolean m, boolean o, Iterable<IConstraintElement> c) {
			return new ConstraintElement(constraint, UNORDERED_GROUP, ImmutableSet.copyOf(c), m, o);
		}
	}

	protected static class FeatureInfo implements IFeatureInfo {
		private List<IConstraintElement> assignments = null;
		private final Constraint constraint;
		private final EStructuralFeature feature;
		private final int lowerBound;
		private final int upperBound;

		public FeatureInfo(Constraint constraint, EStructuralFeature feature, int upperBound, int lowerBound) {
			super();
			this.constraint = constraint;
			this.feature = feature;
			this.upperBound = upperBound;
			this.lowerBound = lowerBound;
		}

		@Override
		public List<IConstraintElement> getAssignments() {
			if (assignments == null) {
				IConstraintElement body = constraint.getBody();
				if (body == null) {
					assignments = Collections.emptyList();
				} else {
					assignments = Lists.newArrayList();
					LinkedList<IConstraintElement> stack = new LinkedList<IConstraintElement>();
					stack.push(body);
					while (!stack.isEmpty()) {
						IConstraintElement element = stack.pop();
						String name = ((ConstraintElement) element).getFeatureName();
						if (feature.getName().equals(name))
							assignments.add(element);
						stack.addAll(element.getChildren());
					}
				}
			}
			return assignments;
		}

		@Override
		public IConstraint getContainingConstraint() {
			return constraint;
		}

		@Override
		public EStructuralFeature getFeature() {
			return feature;
		}

		@Override
		public int getLowerBound() {
			return lowerBound;
		}

		@Override
		public int getUpperBound() {
			return upperBound;
		}

	}

	private final static IConstraintElement UNINITIALIZED = new ConstraintElement(null, null, (AbstractElement) null, false, false);

	private Map<Grammar, SerializationContextMap<IConstraint>> cache = Maps.newHashMap();

	@Inject
	protected Context2NameFunction context2Name;

	@Inject
	private ISemanticSequencerNfaProvider nfaProvider;

	@Inject
	private IContextTypePDAProvider typeProvider;

	@Inject
	private NfaUtil nfaUtil;

	protected Multimap<Parameter, Boolean> collectAllParameterValues(IConstraint constraint) {
		Set<Parameter> all = Sets.newLinkedHashSet();
		List<ISerializationContext> contexts = constraint.getContexts();
		for (ISerializationContext context : contexts) {
			all.addAll(((SerializationContext) context).getDeclaredParameters());
		}
		Multimap<Parameter, Boolean> values = LinkedHashMultimap.create();
		for (ISerializationContext ctx : contexts) {
			Set<Parameter> params = ctx.getEnabledBooleanParameters();
			for (Parameter param : all)
				values.put(param, params != null && params.contains(param));
		}
		return values;
	}

	protected String findBestConstraintName(Grammar grammar, SerializationContextMap<Pda<ISerState, RuleCall>> typePDAs,
			IConstraint constraint) {
		Set<ParserRule> relevantRules = Sets.newLinkedHashSet();
		Set<Action> relevantActions = Sets.newLinkedHashSet();
		Set<ParserRule> contextRules = Sets.newLinkedHashSet();
		for (ISerializationContext ctx : constraint.getContexts()) {
			ParserRule rule = ctx.getParserRule();
			if (rule != null) {
				contextRules.add(rule);
			}
		}
		// 1. find relevant rules based on assignments 
		for (ISemState s : nfaUtil.collect(constraint.getNfa())) {
			AbstractElement element = s.getAssignedGrammarElement();
			if (element != null)
				relevantRules.add(GrammarUtil.containingParserRule(element));
		}
		// 2. find relevant rules based on unassigned actions
		for (ISerializationContext ctx : constraint.getContexts()) {
			for (ISerState s : nfaUtil.collect(typePDAs.get(ctx))) {
				AbstractElement element = s.getGrammarElement();
				if (element instanceof Action && ((Action) element).getFeature() == null)
					relevantRules.add(GrammarUtil.containingParserRule(element));
			}
		}
		if (relevantRules.isEmpty()) {
			Set<ParserRule> allRules = Sets.newLinkedHashSet(contextRules);
			for (ISerializationContext ctx : constraint.getContexts()) {
				Action action = ctx.getAssignedAction();
				if (action != null)
					allRules.add(GrammarUtil.containingParserRule(action));
			}
			// 3. use all rules, because the constraint returns null.
			relevantRules.addAll(allRules);
		}
		for (ISerializationContext ctx : constraint.getContexts()) {
			Action action = ctx.getAssignedAction();
			if (action != null) {
				ParserRule rule = GrammarUtil.containingParserRule(action);
				if (!contextRules.contains(rule) && relevantRules.contains(rule)) {
					relevantActions.add(action);
				}
			}
		}
		List<String> actions = Lists.newArrayList();
		List<String> rules = Lists.newArrayList();
		Multimap<Parameter, Boolean> parameterValues = collectAllParameterValues(constraint);
		for (Action a : relevantActions)
			actions.add(context2Name.getUniqueActionName(a));
		for (ParserRule rule : relevantRules) {
			StringBuilder segments = new StringBuilder();
			for (Parameter param : rule.getParameters()) {
				Collection<Boolean> values = parameterValues.get(param);
				if (values.size() == 1) {
					segments.append(param.getName() + "$" + values.iterator().next() + "$");
				}
			}
			if (segments.length() == 0) {
				rules.add(rule.getName());
			} else {
				rules.add(rule.getName() + "$" + segments);
			}
		}
		Collections.sort(rules);
		String result = Joiner.on("_").join(rules);
		if (!actions.isEmpty()) {
			Collections.sort(actions);
			result += "_" + Joiner.on('_').join(actions);
		}
		return result;
	}

	@Override
	public SerializationContextMap<IConstraint> getConstraints(Grammar grammar) {
		SerializationContextMap<IConstraint> cached = cache.get(grammar);
		if (cached != null)
			return cached;
		SerializationContextMap.Builder<IConstraint> builder = SerializationContextMap.builder();
		GrammarElementDeclarationOrder.get(grammar);
		SerializationContextMap<Nfa<ISemState>> nfas = nfaProvider.getSemanticSequencerNFAs(grammar);
		for (Entry<Nfa<ISemState>> e : nfas.values()) {
			Nfa<ISemState> nfa = e.getValue();
			for (EClass type : e.getTypes()) {
				Constraint constraint = new Constraint(grammar, type, nfa);
				List<ISerializationContext> contexts = e.getContexts(type);
				constraint.contexts.addAll(contexts);
				builder.put(contexts, constraint);
			}
		}
		SerializationContextMap<IConstraint> result = builder.create();
		SerializationContextMap<Pda<ISerState, RuleCall>> typePDAs = typeProvider.getContextTypePDAs(grammar);
		for (Entry<IConstraint> e : result.values()) {
			Constraint constraint = (Constraint) e.getValue();
			constraint.setName(findBestConstraintName(grammar, typePDAs, constraint));
		}
		cache.put(grammar, result);
		return result;
	}

}
