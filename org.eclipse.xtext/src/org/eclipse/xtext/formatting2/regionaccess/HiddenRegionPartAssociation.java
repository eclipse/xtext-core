/*******************************************************************************
 * Copyright (c) 2018 TypeFox GmbH (http://www.typefox.io) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.formatting2.regionaccess;

/**
 * @author Moritz Eysholdt - Initial contribution and API
 * 
 * @since 2.14
 */
public enum HiddenRegionPartAssociation {
	/**
	 * The whitespace or comment belongs to the trailing {@link ISemanticRegion}.
	 */
	NEXT,

	/**
	 * The whitespace or comment belongs to the leading {@link ISemanticRegion}.
	 */
	PREVIOUS,

	/**
	 * The whitespace or comment belongs NEITHER to the leading not trailing {@link ISemanticRegion}.
	 */
	CONTAINER;
}
