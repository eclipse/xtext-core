/*******************************************************************************
 * Copyright (c) 2008 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.parser.packrat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.parser.AbstractParser;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parser.packrat.AbstractParserConfiguration.IInternalParserConfiguration;
import org.eclipse.xtext.parser.packrat.consumers.ConsumeResult;
import org.eclipse.xtext.parser.packrat.consumers.EnumLiteralConsumer;
import org.eclipse.xtext.parser.packrat.consumers.IConsumerUtility;
import org.eclipse.xtext.parser.packrat.consumers.INonTerminalConsumer;
import org.eclipse.xtext.parser.packrat.consumers.INonTerminalConsumerConfiguration;
import org.eclipse.xtext.parser.packrat.consumers.IRootConsumerListener;
import org.eclipse.xtext.parser.packrat.consumers.ITerminalConsumer;
import org.eclipse.xtext.parser.packrat.consumers.KeywordConsumer;
import org.eclipse.xtext.parser.packrat.consumers.NonTerminalConsumer;
import org.eclipse.xtext.parser.packrat.debug.DebugBacktracker;
import org.eclipse.xtext.parser.packrat.debug.DebugCharSequenceWithOffset;
import org.eclipse.xtext.parser.packrat.debug.DebugConsumerUtility;
import org.eclipse.xtext.parser.packrat.debug.DebugHiddenTokenHandler;
import org.eclipse.xtext.parser.packrat.debug.DebugMarkerFactory;
import org.eclipse.xtext.parser.packrat.debug.DebugParsedTokenAcceptor;
import org.eclipse.xtext.parser.packrat.debug.DebugUtil;
import org.eclipse.xtext.parser.packrat.internal.Backtracker;
import org.eclipse.xtext.parser.packrat.internal.Marker;
import org.eclipse.xtext.parser.packrat.internal.Marker.IMarkerClient;
import org.eclipse.xtext.parser.packrat.matching.ICharacterClass;
import org.eclipse.xtext.parser.packrat.matching.ISequenceMatcher;
import org.eclipse.xtext.parser.packrat.tokens.AbstractParsedToken;
import org.eclipse.xtext.parser.packrat.tokens.ErrorToken;
import org.eclipse.xtext.parser.packrat.tokens.IParsedTokenAcceptor;
import org.eclipse.xtext.parser.packrat.tokens.IParsedTokenSource;
import org.eclipse.xtext.parser.packrat.tokens.ParsedAction;
import org.eclipse.xtext.parser.packrat.tokens.ParsedToken;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 * @author Jan Koehnlein
 */
public abstract class AbstractPackratParser extends AbstractParser implements
	IPackratParser,
	IMarkerClient,
	ICharSequenceWithOffset,
	IParsedTokenAcceptor,
	IHiddenTokenHandler,
	IConsumerUtility {

	private static Logger log = Logger.getLogger(AbstractPackratParser.class);

	private class HiddenTokenState implements IHiddenTokenHandler.IHiddenTokenState {
		private final ITerminalConsumer[] hiddens;

		public HiddenTokenState(ITerminalConsumer[] previousHiddens) {
			this.hiddens = previousHiddens;
		}

		@Override
		public void restore() {
			setHiddens(this.hiddens);
		}

		@Override
		public String toString() {
			return "HiddenTokenState holding " + Arrays.toString(hiddens);
		}
	}

	private static final IHiddenTokenState NULL_HIDDEN_TOKEN_STATE = new IHiddenTokenState() {
		@Override
		public void restore() {
		}
	};

	private final IParseResultFactory parseResultFactory;

	private final IGrammarAccess grammarAccess;

	private CharSequence input;

	private ITerminalConsumer[] hiddens;

	private int offset;

	private final KeywordConsumer keywordConsumer;

	private final EnumLiteralConsumer literalConsumer;

	private final IParserConfiguration parserConfiguration;

	private final IBacktracker backtracker;

	private static final int MARKER_BUFFER_SIZE = 100;

	private final Marker[] markerBuffer;

	private int markerBufferSize;

	private Marker activeMarker;

	protected AbstractPackratParser(IParseResultFactory parseResultFactory, IGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
		this.parseResultFactory = parseResultFactory;
		backtracker = new Backtracker(this);
		parserConfiguration = createParserConfiguration();
		keywordConsumer = createKeywordConsumer();
		literalConsumer = createLiteralConsumer();
		markerBuffer = new Marker[MARKER_BUFFER_SIZE];
		hiddens = parserConfiguration.getInitialHiddenTerminals();
		for(ITerminalConsumer hidden: this.hiddens)
			hidden.setHidden(true);
	}

	private IParserConfiguration createParserConfiguration() {
		final ICharSequenceWithOffset localInput = DebugUtil.INPUT_DEBUG ? new DebugCharSequenceWithOffset(this) : this;
		final IMarkerFactory localMarkerFactory = DebugUtil.MARKER_FACTORY_DEBUG ? new DebugMarkerFactory(this) : this;
		final IParsedTokenAcceptor localTokenAcceptor = DebugUtil.TOKEN_ACCEPTOR_DEBUG ? new DebugParsedTokenAcceptor(this) : this;
		final IHiddenTokenHandler localHiddenTokenHandler = DebugUtil.HIDDEN_TOKEN_HANDLER_DEBUG ? new DebugHiddenTokenHandler(this) : this;
		final IConsumerUtility localConsumerUtil = DebugUtil.CONSUMER_UTIL_DEBUG ? new DebugConsumerUtility(this) : this;
		final IBacktracker localBacktracker = DebugUtil.BACKTRACKER_DEBUG ? new DebugBacktracker(backtracker) : backtracker;

		IParserConfiguration result = createParserConfiguration(new IInternalParserConfiguration() {
			@Override
			public IConsumerUtility getConsumerUtil() {
				return localConsumerUtil;
			}
			@Override
			public IHiddenTokenHandler getHiddenTokenHandler() {
				return localHiddenTokenHandler;
			}
			@Override
			public ICharSequenceWithOffset getInput() {
				return localInput;
			}
			@Override
			public IMarkerFactory getMarkerFactory() {
				return localMarkerFactory;
			}
			@Override
			public IParsedTokenAcceptor getTokenAcceptor() {
				return localTokenAcceptor;
			}
			@Override
			public IBacktracker getBacktracker() {
				return localBacktracker;
			}
		});
		result.createTerminalConsumers();
		result.createNonTerminalConsumers();
		result.configureConsumers();
		return result;
	}

	protected abstract IParserConfiguration createParserConfiguration(IInternalParserConfiguration configuration);

	protected KeywordConsumer createKeywordConsumer() {
		return parserConfiguration.createKeywordConsumer();
	}

	protected EnumLiteralConsumer createLiteralConsumer() {
		return parserConfiguration.createLiteralConsumer();
	}

	public CharSequence getInput() {
		return input;
	}

	@Override
	public final IParseResult parse(CharSequence input) {
		return parse(input, getRootConsumer());
	}

	@Override
	public final IParseResult parse(CharSequence input, INonTerminalConsumer consumer) {
		this.input = input;
		this.offset = 0;
		Arrays.fill(markerBuffer, null);
		this.markerBufferSize = 0;
		return parse(consumer);
	}

	private class RootConsumerListener implements IRootConsumerListener {

		@Override
		public void beforeNonTerminalEnd(INonTerminalConsumer nonTerminalConsumer, int result, INonTerminalConsumerConfiguration configuration) {
			if (result == ConsumeResult.SUCCESS) {
				if (offset != length())
					consumeHiddens();
				if (offset != length()) {
					configuration.getTokenAcceptor().accept(new ErrorToken(offset, length() - offset, null, "<EOF> expected."));
					offset = length();
				}
			}
		}

		@Override
		public void afterNonTerminalBegin(INonTerminalConsumer nonTerminalConsumer, INonTerminalConsumerConfiguration configuration) {
			consumeHiddens();
		}

		@Override
		public void handleException(NonTerminalConsumer nonTerminalConsumer, Exception e, INonTerminalConsumerConfiguration configuration) {
			log.error("handle Exception: " + e.getMessage(), e);
			configuration.getTokenAcceptor().accept(new ErrorToken(offset, length() - offset, null, e.getMessage()));
			offset = length();
		}
	}

	protected final IParseResult parse(INonTerminalConsumer consumer) {
		if (activeMarker != null)
			throw new IllegalStateException("cannot parse now. Active marker is already assigned.");
		IMarker rootMarker = mark();
		IRootConsumerListener listener = new RootConsumerListener();
		try {
			consumer.consumeAsRoot(listener);
			IParseResult result = getParseResultFactory().createParseResult(activeMarker, input);
			rootMarker.commit();
			if (activeMarker != null)
				throw new IllegalStateException("cannot finish parse: active marker is still present.");
			return result;
		} catch(Exception e) {
			throw new WrappedException(e);
		}
	}

	protected INonTerminalConsumer getRootConsumer() {
		return parserConfiguration.getRootConsumer();
	}

	protected void consumeHiddens() {
		boolean anySuccess = true;
		while(anySuccess) {
			anySuccess = false;
			for (ITerminalConsumer consumer: hiddens) {
				IMarker marker = mark();
				if (consumer.consume(null, false, false, null, ISequenceMatcher.Factory.nullMatcher(), true) == ConsumeResult.SUCCESS) {
					anySuccess = true;
					marker.commit();
					break;
				}
				marker.rollback();
			}
		}
	}

	@Override
	public IMarker mark() {
		return getNextMarker(activeMarker, offset);
	}

	@Override
	public Marker getActiveMarker() {
		return activeMarker;
	}

	@Override
	public Marker getNextMarker(Marker parent, int offset) {
		return markerBufferSize > 0 ?
				markerBuffer[--markerBufferSize].reInit(offset, parent, this, this) :
				new Marker(parent, offset, this, this);
	}

	@Override
	public void setActiveMarker(Marker marker) {
		this.activeMarker = marker;
	}

	@Override
	public void releaseMarker(Marker marker) {
		if (markerBufferSize < MARKER_BUFFER_SIZE)
			markerBuffer[markerBufferSize++] = marker;
	}

	@Override
	public int consumeKeyword(Keyword keyword, String feature, boolean isMany, boolean isBoolean, ICharacterClass notFollowedBy, boolean optional) {
		keywordConsumer.configure(keyword, notFollowedBy);
		return consumeTerminal(keywordConsumer, feature, isMany, isBoolean, keyword, ISequenceMatcher.Factory.nullMatcher(), optional);
	}

	@Override
	public int consumeEnum(EnumLiteralDeclaration literal, ICharacterClass notFollowedBy) {
		literalConsumer.configure(literal, notFollowedBy);
		return consumeTerminal(literalConsumer, null, false, false, literal, ISequenceMatcher.Factory.nullMatcher(), false);
	}

	@Override
	public int consumeTerminal(ITerminalConsumer consumer, String feature, boolean isMany, boolean isBoolean,
			AbstractElement grammarElement, ISequenceMatcher notMatching, boolean optional) {
		IMarker marker = mark();
		consumeHiddens();
		int result = consumer.consume(feature, isMany, isBoolean, grammarElement,
				notMatching != null ? notMatching : ISequenceMatcher.Factory.nullMatcher(), optional);
		if (result == ConsumeResult.SUCCESS) {
			marker.commit();
			return result;
		}
		marker.rollback();
		return result;
	}

	@Override
	public int consumeNonTerminal(INonTerminalConsumer consumer, String feature, boolean isMany,
			boolean isDatatype, boolean isBoolean, AbstractElement grammarElement, boolean optional) throws Exception {
		if (!consumer.isDefiningHiddens())
			return consumer.consume(feature, isMany, isDatatype, isBoolean, grammarElement, optional);

		// either consume hiddens and have success or leave them and try again
		// TODO: rollback hidden tokens step by step
		IMarker bestMarker = mark();
		IMarker currentMarker = bestMarker.fork();
		int result = consumer.consume(feature, isMany, isDatatype, isBoolean, grammarElement, optional);
		if (result == ConsumeResult.SUCCESS) {
			bestMarker = currentMarker.join(bestMarker);
			bestMarker.commit();
			return result;
		}
		// no success, read hidden tokens and try again
		bestMarker = currentMarker.join(bestMarker);
		currentMarker = bestMarker.fork();
		consumeHiddens();
		int nextResult = consumer.consume(feature, isMany, isDatatype, isBoolean, grammarElement, optional);
		if (nextResult == ConsumeResult.SUCCESS) {
			bestMarker = currentMarker.join(bestMarker);
			bestMarker.commit();
			return nextResult;
		}
		// keep better result
		if (nextResult > result) {
			bestMarker = currentMarker.join(bestMarker);
			result = nextResult;
		} else {
			bestMarker = bestMarker.join(currentMarker);
		}
		// commit latest error
		bestMarker.commit();
		return result;
	}

	@Override
	public void consumeAction(final Action action, final boolean isMany) {
		accept(new ParsedAction(offset, action, isMany, new IParsedTokenSource(){
			@Override
			public int parseAgain(ParsedToken token) throws Exception {
				consumeAction(action, isMany);
				return ConsumeResult.SUCCESS;
			}
		}));
	}

	protected IParseResultFactory getParseResultFactory() {
		return parseResultFactory;
	}

	protected IGrammarAccess getGrammarAccess() {
		return grammarAccess;
	}

	@Override
	public int getOffset() {
		return offset;
	}

	@Override
	public char charAt(int index) {
		return input.charAt(index);
	}

	@Override
	public int length() {
		return input.length();
	}

	@Override
	public CharSequence subSequence(int start, int end) {
		return input.subSequence(start, end);
	}

	@Override
	public void incOffset() {
		offset++;
	}

	@Override
	public void incOffset(int amount) {
		offset+=amount;
	}

	@Override
	public void accept(AbstractParsedToken token) {
		activeMarker.accept(token);
	}

	@Override
	public void setOffset(int offset) {
		this.offset = offset;
	}

	@Override
	public IHiddenTokenState replaceHiddenTokens(ITerminalConsumer... consumers) {
		if (consumers == null)
			return NULL_HIDDEN_TOKEN_STATE;
		IHiddenTokenState result = new HiddenTokenState(this.hiddens);
		setHiddens(consumers);
		return result;
	}

	private void setHiddens(ITerminalConsumer... hiddenConsumers) {
		for(ITerminalConsumer hidden: this.hiddens)
			hidden.setHidden(false);
		this.hiddens = hiddenConsumers;
		for(ITerminalConsumer hidden: this.hiddens)
			hidden.setHidden(true);
	}

	
	@Override
	protected IParseResult doParse(Reader reader) {
		return doParse(createCharSequence(reader));
	}
	
	protected CharSequence createCharSequence(Reader reader0) {
		try {
			char[] buff = new char[1024];
			BufferedReader reader = new BufferedReader(reader0);
			CharArrayWriterAsSequence result = new CharArrayWriterAsSequence();
			int chars = 0;
			while((chars = reader.read(buff)) != -1) {
				result.write(buff, 0, chars);
			}
			reader.close();
			return result;
		} catch(IOException ex) {
			throw new WrappedException(ex);
		}
	}

	@Override
	protected IParseResult doParse(CharSequence sequence) {
		return parse(sequence);
	}

}
