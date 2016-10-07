/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.serializer.sequencer;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.INode;

import com.google.inject.ImplementedBy;

/**
 * @author Moritz Eysholdt - Initial contribution and API
 */
@ImplementedBy(SemanticNodeProvider.class)
public interface ISemanticNodeProvider {

	public interface ISemanticNode {
		INode getNode();

		ISemanticNode getFollower();

		AbstractElement getGrammarElement();
	}

	public interface INodesForEObjectProvider {
		ISemanticNode getSemanticNodeForMultiValue(EStructuralFeature feature, int indexInFeature, int indexInNonTransient, Object value);

		ISemanticNode getSemanticNodeForSingelValue(EStructuralFeature feature, Object value);

		ISemanticNode getFirstSemanticNode();

		INode getNodeForMultiValue(EStructuralFeature feature, int indexInFeature, int indexInNonTransient, Object value);

		INode getNodeForSingelValue(EStructuralFeature feature, Object value);
	}

	public class NullNodesForEObjectProvider implements INodesForEObjectProvider {
		@Override
		public INode getNodeForMultiValue(EStructuralFeature feature, int indexInFeature, int indexAmongNonTransient,
				Object value) {
			return null;
		}

		@Override
		public INode getNodeForSingelValue(EStructuralFeature feature, Object value) {
			return null;
		}

		@Override
		public ISemanticNode getSemanticNodeForMultiValue(EStructuralFeature feature, int indexInFeature,
				int indexInNonTransient, Object value) {
			return null;
		}

		@Override
		public ISemanticNode getSemanticNodeForSingelValue(EStructuralFeature feature, Object value) {
			return null;
		}

		@Override
		public ISemanticNode getFirstSemanticNode() {
			return null;
		}
	}

	public INodesForEObjectProvider NULL_NODES_PROVIDER = new NullNodesForEObjectProvider();

	INodesForEObjectProvider getNodesForSemanticObject(EObject semanticObject, ICompositeNode suggestedComposite);

}