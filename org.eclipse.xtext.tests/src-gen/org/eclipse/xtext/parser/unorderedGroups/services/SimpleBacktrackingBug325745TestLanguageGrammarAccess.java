/*
 * generated by Xtext
 */
package org.eclipse.xtext.parser.unorderedGroups.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.parser.unorderedGroups.services.BacktrackingBug325745TestLanguageGrammarAccess;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class SimpleBacktrackingBug325745TestLanguageGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class DelegateModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.unorderedGroups.SimpleBacktrackingBug325745TestLanguage.DelegateModel");
		private final RuleCall cModelParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//DelegateModel Model:
		//	Model
		@Override public ParserRule getRule() { return rule; }

		//Model
		public RuleCall getModelParserRuleCall() { return cModelParserRuleCall; }
	}
	
	
	private final DelegateModelElements pDelegateModel;
	
	private final Grammar grammar;

	private final BacktrackingBug325745TestLanguageGrammarAccess gaBacktrackingBug325745TestLanguage;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public SimpleBacktrackingBug325745TestLanguageGrammarAccess(GrammarProvider grammarProvider,
		BacktrackingBug325745TestLanguageGrammarAccess gaBacktrackingBug325745TestLanguage,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaBacktrackingBug325745TestLanguage = gaBacktrackingBug325745TestLanguage;
		this.gaTerminals = gaTerminals;
		this.pDelegateModel = new DelegateModelElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.parser.unorderedGroups.SimpleBacktrackingBug325745TestLanguage".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	

	public BacktrackingBug325745TestLanguageGrammarAccess getBacktrackingBug325745TestLanguageGrammarAccess() {
		return gaBacktrackingBug325745TestLanguage;
	}

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//DelegateModel Model:
	//	Model
	public DelegateModelElements getDelegateModelAccess() {
		return pDelegateModel;
	}
	
	public ParserRule getDelegateModelRule() {
		return getDelegateModelAccess().getRule();
	}

	//Model:
	//	{Model} fields+=Element+;
	public BacktrackingBug325745TestLanguageGrammarAccess.ModelElements getModelAccess() {
		return gaBacktrackingBug325745TestLanguage.getModelAccess();
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}

	//Element:
	//	name=ID
	//	dataType=DataType?
	//	expression=Expression '.';
	public BacktrackingBug325745TestLanguageGrammarAccess.ElementElements getElementAccess() {
		return gaBacktrackingBug325745TestLanguage.getElementAccess();
	}
	
	public ParserRule getElementRule() {
		return getElementAccess().getRule();
	}

	//DataType:
	//	baseType=ID (':=' defaultValue=STRING)?;
	public BacktrackingBug325745TestLanguageGrammarAccess.DataTypeElements getDataTypeAccess() {
		return gaBacktrackingBug325745TestLanguage.getDataTypeAccess();
	}
	
	public ParserRule getDataTypeRule() {
		return getDataTypeAccess().getRule();
	}

	//Expression:
	//	{Expression} ('['? & prefix=STRING?) ('['? terms+=SimpleTerm ']'?)* (']'? & postfix=STRING?);
	public BacktrackingBug325745TestLanguageGrammarAccess.ExpressionElements getExpressionAccess() {
		return gaBacktrackingBug325745TestLanguage.getExpressionAccess();
	}
	
	public ParserRule getExpressionRule() {
		return getExpressionAccess().getRule();
	}

	//SimpleTerm:
	//	lineCount=INT
	//	'*'?
	//	charCount=INT?
	//	'!'?
	//	charSet=ID? | refChar=ID;
	public BacktrackingBug325745TestLanguageGrammarAccess.SimpleTermElements getSimpleTermAccess() {
		return gaBacktrackingBug325745TestLanguage.getSimpleTermAccess();
	}
	
	public ParserRule getSimpleTermRule() {
		return getSimpleTermAccess().getRule();
	}

	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	'/ *'->'* /';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
