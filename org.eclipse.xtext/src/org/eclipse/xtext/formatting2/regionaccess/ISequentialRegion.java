/*******************************************************************************
 * Copyright (c) 2014 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.formatting2.regionaccess;

/**
 * <p>
 * Common interface for {@link IHiddenRegion} and {@link ISemanticRegion}.
 * </p>
 * 
 * <p>
 * {@link IHiddenRegion} and {@link ISemanticRegion} are arranged strictly alternating in a linked list. This interface
 * provides the method to navigate that list.
 * </p>
 * 
 * @author Moritz Eysholdt - Initial contribution and API
 */
public interface ISequentialRegion extends ITextSegment {

	ISemanticRegionFinder immediatelyFollowing();

	ISemanticRegionFinder immediatelyPreceding();

	IHiddenRegion getNextHiddenRegion();

	ISemanticRegion getNextSemanticRegion();

	ISequentialRegion getNextSequentialRegion();

	IHiddenRegion getPreviousHiddenRegion();

	ISemanticRegion getPreviousSemanticRegion();

	ISequentialRegion getPreviousSequentialRegion();
}
