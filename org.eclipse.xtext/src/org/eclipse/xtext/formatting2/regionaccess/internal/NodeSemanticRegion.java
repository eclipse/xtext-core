/*******************************************************************************
 * Copyright (c) 2014 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.formatting2.regionaccess.internal;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.formatting2.regionaccess.IEObjectRegion;
import org.eclipse.xtext.formatting2.regionaccess.IHiddenRegion;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegionFinder;
import org.eclipse.xtext.formatting2.regionaccess.ISequentialRegion;
import org.eclipse.xtext.nodemodel.INode;

/**
 * @author Moritz Eysholdt - Initial contribution and API
 */
public class NodeSemanticRegion extends NodeRegion implements ISemanticRegion {

	private NodeEObjectRegion eObjectTokens;
	private IHiddenRegion leading;
	private IHiddenRegion trailing;

	protected NodeSemanticRegion(NodeModelBasedRegionAccess access, INode node) {
		super(access, node);
	}

	@Override
	public IEObjectRegion getEObjectRegion() {
		return eObjectTokens;
	}

	@Override
	public AbstractElement getGrammarElement() {
		EObject element = super.getGrammarElement();
		if (element instanceof CrossReference)
			return ((CrossReference) element).getTerminal();
		return element instanceof AbstractElement ? (AbstractElement) element : null;
	}

	@Override
	public IHiddenRegion getNextHiddenRegion() {
		return trailing;
	}

	@Override
	public ISemanticRegion getNextSemanticRegion() {
		return trailing != null ? trailing.getNextSemanticRegion() : null;
	}
	
	@Override
	public ISequentialRegion getNextSequentialRegion() {
		return trailing;
	}

	@Override
	public IHiddenRegion getPreviousHiddenRegion() {
		return leading;
	}

	@Override
	public ISemanticRegion getPreviousSemanticRegion() {
		return leading != null ? leading.getPreviousSemanticRegion() : null;
	}
	
	@Override
	public ISequentialRegion getPreviousSequentialRegion() {
		return leading;
	}

	@Override
	public EObject getSemanticElement() {
		return eObjectTokens != null ? eObjectTokens.getSemanticElement() : null;
	}

	@Override
	public ISemanticRegionFinder immediatelyFollowing() {
		return new SemanticRegionMatcher(getNextSemanticRegion());
	}

	@Override
	public ISemanticRegionFinder immediatelyPreceding() {
		return new SemanticRegionMatcher(getPreviousSemanticRegion());
	}

	protected void setEObjectTokens(NodeEObjectRegion eObjectTokens) {
		this.eObjectTokens = eObjectTokens;
	}

	protected void setLeadingHiddenRegion(IHiddenRegion leading) {
		this.leading = leading;
	}

	protected void setTrailingHiddenRegion(IHiddenRegion trailing) {
		this.trailing = trailing;
	}
}
