/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.serializer.analysis;

import java.util.BitSet;
import java.util.List;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.util.formallang.Nfa;

import com.google.common.base.Function;
import com.google.inject.ImplementedBy;

/**
 * @author Moritz Eysholdt - Initial contribution and API
 */
@ImplementedBy(SemanticSequencerNfaProvider.class)
public interface ISemanticSequencerNfaProvider {

	public Function<ISemState, AbstractElement> GET_ASSIGNED_GRAMMAR_ELEMENT = new Function<ISemState, AbstractElement>() {
		@Override
		public AbstractElement apply(ISemState input) {
			return input.getAssignedGrammarElement();
		}
	};

	public interface ISemState {
		BitSet getAllFollowerFeatures();

		AbstractElement getAssignedGrammarElement();

		EStructuralFeature getFeature();

		int getFeatureID();

		List<ISemState> getFollowers();

		int getOrderID();

		List<AbstractElement> getToBeValidatedAssignedElements();

		boolean isBooleanAssignment();
	}

	SerializationContextMap<Nfa<ISemState>> getSemanticSequencerNFAs(Grammar grammar);
}
