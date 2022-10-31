/*******************************************************************************
 * Copyright (c) 2021 TypeFox GmbH (http://www.typefox.io) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.ide.server.folding;

import java.io.IOException;
import java.io.LineNumberReader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.stream.Collectors;

import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.lsp4j.FoldingRange;
import org.eclipse.xtext.ide.editor.folding.IFoldingRangeProvider;
import org.eclipse.xtext.ide.server.Document;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.CancelIndicator;

import com.google.inject.Inject;
import com.google.inject.Singleton;

/**
 * @author Mark Sujew - Initial contribution and API
 * 		   Rubén Porras Campo - Improve complexity of offset mapping algorithm
 * 
 * @since 2.26
 */
@Singleton
public class FoldingRangeService {

	@Inject
	private IFoldingRangeProvider foldingRangeProvider;

	public List<FoldingRange> createFoldingRanges(Document document, XtextResource resource,
			CancelIndicator cancelIndicator) {
		if (resource == null || document == null) {
			return Collections.emptyList();
		}
		SortedSet<org.eclipse.xtext.ide.editor.folding.FoldingRange> foldingRanges = foldingRangeProvider
				.getFoldingRanges(resource, cancelIndicator);
		Map<Integer, Integer> offsetToLineMap = mapOffsetToLine(document, foldingRanges, cancelIndicator);
		return foldingRanges.stream().map(range -> toFoldingRange(offsetToLineMap, range))
				.filter(range -> isValidRange(range)).collect(Collectors.toList());
	}

	/**
	 * @since 2.29
	 */
	protected Map<Integer, Integer> mapOffsetToLine(Document document,
			SortedSet<org.eclipse.xtext.ide.editor.folding.FoldingRange> foldingRanges, CancelIndicator cancelIndicator) {
		int[] offsets = new int[foldingRanges.size() * 2];
		int i = 0;
		for (org.eclipse.xtext.ide.editor.folding.FoldingRange foldingRange : foldingRanges) {
			if (cancelIndicator.isCanceled()) {
				throw new OperationCanceledException();
			}
			offsets[i++] = foldingRange.getOffset();
			offsets[i++] = foldingRange.getOffset() + foldingRange.getLength();
		}
		Arrays.sort(offsets);

		int lastOffset = 0;
		Map<Integer, Integer> offsetToLineMap = new HashMap<>(offsets.length);
		try (LineNumberReader reader = new LineNumberReader(new StringReader(document.getContents()))) {
			for (i = 0; i < offsets.length; i++) {
				if (cancelIndicator.isCanceled()) {
					throw new OperationCanceledException();
				}
				int deltaOffset = offsets[i] - lastOffset;
				lastOffset = offsets[i];
				reader.skip(deltaOffset);
				offsetToLineMap.put(offsets[i], reader.getLineNumber());
			}
		} catch (IOException e) {
			throw new WrappedException(e);
		}
		return offsetToLineMap;
	}
	
	/**
	 * @since 2.29
	 */
	protected FoldingRange toFoldingRange(final Map<Integer, Integer> offsetToLineMap,
			final org.eclipse.xtext.ide.editor.folding.FoldingRange range) {
		int offset = range.getOffset();
		int endOffset = range.getOffset() + range.getLength();

		FoldingRange result = new FoldingRange(offsetToLineMap.get(offset), offsetToLineMap.get(endOffset));
		if (range.getKind() != null) {
			result.setKind(range.getKind().toString());
		}
		return result;
	}

	protected boolean isValidRange(FoldingRange range) {
		return range.getStartLine() < range.getEndLine();
	}
}
