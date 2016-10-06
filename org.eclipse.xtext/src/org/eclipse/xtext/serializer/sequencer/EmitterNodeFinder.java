/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.serializer.sequencer;

import java.util.List;

import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.nodemodel.INode;

/**
 * @author Moritz Eysholdt - Initial contribution and API
 */
public class EmitterNodeFinder {

	@Deprecated
	protected INode toNode;
	private List<INode> emitters;
	private int index;

	public EmitterNodeFinder(INode node) {
		this.toNode = node;
		this.emitters = EmitterNodeUtil.collectEmitterNodes(node, null);
		this.index = 0;
	}

	public INode next(AbstractElement grammarElement) {
		for (int i = index; i < emitters.size(); i++) {
			INode next = emitters.get(i);
			if (next.getGrammarElement() == grammarElement) {
				index = i + 1;
				return toNode = next;
			}
		}
		return null;
	}

}
