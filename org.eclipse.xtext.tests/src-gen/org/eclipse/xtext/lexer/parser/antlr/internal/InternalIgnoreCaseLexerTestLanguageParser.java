package org.eclipse.xtext.lexer.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.lexer.services.IgnoreCaseLexerTestLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalIgnoreCaseLexerTestLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Case", "Foo", "RULE_WS", "RULE_SL_COMMENT"
    };
    public static final int RULE_WS=6;
    public static final int Foo=5;
    public static final int Case=4;
    public static final int RULE_SL_COMMENT=7;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalIgnoreCaseLexerTestLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalIgnoreCaseLexerTestLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalIgnoreCaseLexerTestLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalIgnoreCaseLexerTestLanguageParser.g"; }




    	private IgnoreCaseLexerTestLanguageGrammarAccess grammarAccess;
    	 	
    	public InternalIgnoreCaseLexerTestLanguageParser(TokenStream input, IgnoreCaseLexerTestLanguageGrammarAccess grammarAccess) {
    		this(input);
    		this.grammarAccess = grammarAccess;
    		registerRules(grammarAccess.getGrammar());
    	}
    	
    	@Override
    	protected String getFirstRuleName() {
    		return "Model";	
    	} 
    	   	   	
    	@Override
    	protected IgnoreCaseLexerTestLanguageGrammarAccess getGrammarAccess() {
    		return grammarAccess;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalIgnoreCaseLexerTestLanguageParser.g:61:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalIgnoreCaseLexerTestLanguageParser.g:62:2: (iv_ruleModel= ruleModel EOF )
            // InternalIgnoreCaseLexerTestLanguageParser.g:63:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalIgnoreCaseLexerTestLanguageParser.g:70:1: ruleModel returns [EObject current=null] : (otherlv_0= Case (otherlv_1= Foo )? ( (lv_value_2_0= Case ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // InternalIgnoreCaseLexerTestLanguageParser.g:73:28: ( (otherlv_0= Case (otherlv_1= Foo )? ( (lv_value_2_0= Case ) ) ) )
            // InternalIgnoreCaseLexerTestLanguageParser.g:74:1: (otherlv_0= Case (otherlv_1= Foo )? ( (lv_value_2_0= Case ) ) )
            {
            // InternalIgnoreCaseLexerTestLanguageParser.g:74:1: (otherlv_0= Case (otherlv_1= Foo )? ( (lv_value_2_0= Case ) ) )
            // InternalIgnoreCaseLexerTestLanguageParser.g:75:2: otherlv_0= Case (otherlv_1= Foo )? ( (lv_value_2_0= Case ) )
            {
            otherlv_0=(Token)match(input,Case,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getModelAccess().getCaseKeyword_0());
                
            // InternalIgnoreCaseLexerTestLanguageParser.g:79:1: (otherlv_1= Foo )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==Foo) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalIgnoreCaseLexerTestLanguageParser.g:80:2: otherlv_1= Foo
                    {
                    otherlv_1=(Token)match(input,Foo,FollowSets000.FOLLOW_4); 

                        	newLeafNode(otherlv_1, grammarAccess.getModelAccess().getFooKeyword_1());
                        

                    }
                    break;

            }

            // InternalIgnoreCaseLexerTestLanguageParser.g:84:3: ( (lv_value_2_0= Case ) )
            // InternalIgnoreCaseLexerTestLanguageParser.g:85:1: (lv_value_2_0= Case )
            {
            // InternalIgnoreCaseLexerTestLanguageParser.g:85:1: (lv_value_2_0= Case )
            // InternalIgnoreCaseLexerTestLanguageParser.g:86:3: lv_value_2_0= Case
            {
            lv_value_2_0=(Token)match(input,Case,FollowSets000.FOLLOW_2); 

                    newLeafNode(lv_value_2_0, grammarAccess.getModelAccess().getValueCaSeKeyword_2_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getModelRule());
            	        }
                   		setWithLastConsumed(current, "value", lv_value_2_0, "CaSe");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    }


}