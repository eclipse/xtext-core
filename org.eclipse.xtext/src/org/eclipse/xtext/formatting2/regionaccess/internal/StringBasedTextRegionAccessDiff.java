/*******************************************************************************
 * Copyright (c) 2017 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.formatting2.regionaccess.internal;

import java.util.List;

import org.eclipse.xtext.formatting2.regionaccess.ITextRegionAccess;
import org.eclipse.xtext.formatting2.regionaccess.ITextRegionAccessDiff;
import org.eclipse.xtext.formatting2.regionaccess.ITextSegmentDiff;

import com.google.common.collect.Lists;

/**
 * @author Moritz Eysholdt - Initial contribution and API
 */
public class StringBasedTextRegionAccessDiff extends StringBasedRegionAccess implements ITextRegionAccessDiff {

	private final List<ITextSegmentDiff> diffs = Lists.newArrayList();

	private final ITextRegionAccess original;

	protected StringBasedTextRegionAccessDiff(ITextRegionAccess original) {
		super(original.getResource());
		this.original = original;
	}

	protected void append(SequentialRegionDiff rewrite) {
		this.diffs.add(rewrite);
	}

	@Override
	public ITextRegionAccess getOriginalTextRegionAccess() {
		return original;
	}

	@Override
	public List<ITextSegmentDiff> getRegionDifferences() {
		return diffs;
	}

}
