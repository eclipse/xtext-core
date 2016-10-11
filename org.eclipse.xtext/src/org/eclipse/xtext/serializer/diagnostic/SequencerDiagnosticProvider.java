/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.serializer.diagnostic;

import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.analysis.IGrammarConstraintProvider;
import org.eclipse.xtext.serializer.analysis.IGrammarConstraintProvider.IConstraint;
import org.eclipse.xtext.serializer.analysis.ISemanticSequencerNfaProvider.ISemState;
import org.eclipse.xtext.serializer.analysis.SerializationContext;
import org.eclipse.xtext.serializer.analysis.SerializationContextMap;
import org.eclipse.xtext.serializer.analysis.SerializationContextMap.Entry;
import org.eclipse.xtext.serializer.sequencer.BacktrackingSemanticSequencer.SerializableObject;
import org.eclipse.xtext.serializer.sequencer.IContextFinder;
import org.eclipse.xtext.util.formallang.Nfa;

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.inject.Inject;

/**
 * @author Moritz Eysholdt - Initial contribution and API
 */
public class SequencerDiagnosticProvider implements ISemanticSequencerDiagnosticProvider {

	public static class NamedElement2Name implements Function<ENamedElement, String> {

		@Override
		public String apply(ENamedElement from) {
			return from == null ? "null" : from.getName();
		}
	}

	@Inject
	protected IContextFinder contextFinder;

	@Inject
	protected IGrammarAccess grammarAccess;

	@Inject
	protected IGrammarConstraintProvider grammarConstraints;

	@Override
	@Deprecated
	public ISerializationDiagnostic createBacktrackingFailedDiagnostic(SerializableObject semanticObject, EObject context,
			Nfa<ISemState> nfa) {
		ISerializationContext ctx = SerializationContext.fromEObject(context, semanticObject.getEObject());
		SerializationContextMap<IConstraint> constraints = grammarConstraints.getConstraints(grammarAccess.getGrammar());
		return createBacktrackingFailedDiagnostic(semanticObject, ctx, constraints.get(ctx));
	}

	@Override
	public ISerializationDiagnostic createBacktrackingFailedDiagnostic(SerializableObject sem, ISerializationContext ctx,
			IConstraint constraint) {
		StringBuilder msg = new StringBuilder();
		msg.append("Could not serialize EObject via backtracking.\n");
		msg.append("Constraint: " + constraint + "\n");
		msg.append(sem.getValuesString());
		return new SerializationDiagnostic(BACKTRACKING_FAILED, sem.getEObject(), ctx, grammarAccess.getGrammar(), msg.toString());
	}

	@Override
	public ISerializationDiagnostic createFeatureValueMissing(EObject semanticObject, EStructuralFeature feature) {
		String msg = "A value for feature '" + feature.getName() + "' is missing but required.";
		return new SerializationDiagnostic(FEATURE_VALUE_MISSING, semanticObject, grammarAccess.getGrammar(), msg);
	}

	@Override
	@Deprecated
	public ISerializationDiagnostic createInvalidContextOrTypeDiagnostic(EObject semanticObject, EObject context) {
		ISerializationContext ctx = SerializationContext.fromEObject(context, semanticObject);
		return createInvalidContextOrTypeDiagnostic(semanticObject, ctx);
	}

	@Override
	public ISerializationDiagnostic createInvalidContextOrTypeDiagnostic(EObject sem, ISerializationContext context) {
		Set<ISerializationContext> contexts = Sets.newHashSet(contextFinder.findByContentsAndContainer(sem, null));
		Set<EClass> validTypes = getValidTypes(context);
		List<ISerializationContext> recommendedCtxs = Lists.newArrayList();
		List<ISerializationContext> otherValidCtxs = Lists.newArrayList();
		for (ISerializationContext ctx : getValidContexts(sem.eClass())) {
			if (contexts.contains(ctx))
				recommendedCtxs.add(ctx);
			else
				otherValidCtxs.add(ctx);
		}
		String semanticType = sem.eClass().getName();
		String validTypeNames = Joiner.on(", ").join(Iterables.transform(validTypes, new NamedElement2Name()));
		StringBuilder msg = new StringBuilder();
		msg.append("The context '" + context + "' is not valid for type '" + semanticType + "'\n");
		msg.append("Recommended contexts for type '" + semanticType + "': " + recommendedCtxs + "\n");
		if (!otherValidCtxs.isEmpty())
			msg.append("Other valid contexts for type '" + semanticType + "': " + otherValidCtxs);
		msg.append("The context '" + context + "' is valid for types: " + validTypeNames + "\n");
		return new SerializationDiagnostic(INVALID_CONTEXT_OR_TYPE, sem, grammarAccess.getGrammar(), msg.toString());
	}

	protected List<ISerializationContext> getValidContexts(EClass clazz) {
		List<ISerializationContext> result = Lists.newArrayList();
		SerializationContextMap<IConstraint> constraints = grammarConstraints.getConstraints(grammarAccess.getGrammar());
		for (Entry<IConstraint> ctx : constraints.values())
			for (EClass type : ctx.getTypes()) {
				if (type == clazz)
					result.addAll(ctx.getContexts(type));
			}
		return result;
	}

	protected Set<EClass> getValidTypes(ISerializationContext context) {
		SerializationContextMap<IConstraint> constraints = grammarConstraints.getConstraints(grammarAccess.getGrammar());
		Set<EClass> result = Sets.newLinkedHashSet();
		for (Entry<IConstraint> ctx : constraints.values())
			for (ISerializationContext c : ctx.getContexts())
				if (((SerializationContext) c).getActionOrRule() == ((SerializationContext) context)
						.getActionOrRule()) {
					result.add(c.getType());
				}
		return result;
	}

}
