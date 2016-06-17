package org.eclipse.xtext.testlanguages.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.testlanguages.services.LookaheadTestLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLookaheadTestLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'bar'", "'a'", "'foo'", "'b'", "'d'", "'c'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalLookaheadTestLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLookaheadTestLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLookaheadTestLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalLookaheadTestLanguage.g"; }



     	private LookaheadTestLanguageGrammarAccess grammarAccess;
     	
        public InternalLookaheadTestLanguageParser(TokenStream input, LookaheadTestLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Entry";	
       	}
       	
       	@Override
       	protected LookaheadTestLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleEntry"
    // InternalLookaheadTestLanguage.g:67:1: entryRuleEntry returns [EObject current=null] : iv_ruleEntry= ruleEntry EOF ;
    public final EObject entryRuleEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntry = null;


        try {
            // InternalLookaheadTestLanguage.g:68:2: (iv_ruleEntry= ruleEntry EOF )
            // InternalLookaheadTestLanguage.g:69:2: iv_ruleEntry= ruleEntry EOF
            {
             newCompositeNode(grammarAccess.getEntryRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEntry=ruleEntry();

            state._fsp--;

             current =iv_ruleEntry; 
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
    // $ANTLR end "entryRuleEntry"


    // $ANTLR start "ruleEntry"
    // InternalLookaheadTestLanguage.g:76:1: ruleEntry returns [EObject current=null] : ( (lv_contents_0_0= ruleAlts ) )* ;
    public final EObject ruleEntry() throws RecognitionException {
        EObject current = null;

        EObject lv_contents_0_0 = null;


         enterRule(); 
            
        try {
            // InternalLookaheadTestLanguage.g:79:28: ( ( (lv_contents_0_0= ruleAlts ) )* )
            // InternalLookaheadTestLanguage.g:80:1: ( (lv_contents_0_0= ruleAlts ) )*
            {
            // InternalLookaheadTestLanguage.g:80:1: ( (lv_contents_0_0= ruleAlts ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalLookaheadTestLanguage.g:81:1: (lv_contents_0_0= ruleAlts )
            	    {
            	    // InternalLookaheadTestLanguage.g:81:1: (lv_contents_0_0= ruleAlts )
            	    // InternalLookaheadTestLanguage.g:82:3: lv_contents_0_0= ruleAlts
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntryAccess().getContentsAltsParserRuleCall_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_3);
            	    lv_contents_0_0=ruleAlts();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntryRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"contents",
            	            		lv_contents_0_0, 
            	            		"org.eclipse.xtext.testlanguages.LookaheadTestLanguage.Alts");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleEntry"


    // $ANTLR start "entryRuleAlts"
    // InternalLookaheadTestLanguage.g:106:1: entryRuleAlts returns [EObject current=null] : iv_ruleAlts= ruleAlts EOF ;
    public final EObject entryRuleAlts() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlts = null;


        try {
            // InternalLookaheadTestLanguage.g:107:2: (iv_ruleAlts= ruleAlts EOF )
            // InternalLookaheadTestLanguage.g:108:2: iv_ruleAlts= ruleAlts EOF
            {
             newCompositeNode(grammarAccess.getAltsRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAlts=ruleAlts();

            state._fsp--;

             current =iv_ruleAlts; 
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
    // $ANTLR end "entryRuleAlts"


    // $ANTLR start "ruleAlts"
    // InternalLookaheadTestLanguage.g:115:1: ruleAlts returns [EObject current=null] : (this_LookAhead0_0= ruleLookAhead0 | this_LookAhead1_1= ruleLookAhead1 | this_LookAhead3_2= ruleLookAhead3 ) ;
    public final EObject ruleAlts() throws RecognitionException {
        EObject current = null;

        EObject this_LookAhead0_0 = null;

        EObject this_LookAhead1_1 = null;

        EObject this_LookAhead3_2 = null;


         enterRule(); 
            
        try {
            // InternalLookaheadTestLanguage.g:118:28: ( (this_LookAhead0_0= ruleLookAhead0 | this_LookAhead1_1= ruleLookAhead1 | this_LookAhead3_2= ruleLookAhead3 ) )
            // InternalLookaheadTestLanguage.g:119:1: (this_LookAhead0_0= ruleLookAhead0 | this_LookAhead1_1= ruleLookAhead1 | this_LookAhead3_2= ruleLookAhead3 )
            {
            // InternalLookaheadTestLanguage.g:119:1: (this_LookAhead0_0= ruleLookAhead0 | this_LookAhead1_1= ruleLookAhead1 | this_LookAhead3_2= ruleLookAhead3 )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==13) ) {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==13) ) {
                    alt2=2;
                }
                else if ( (LA2_2==11) ) {
                    int LA2_4 = input.LA(3);

                    if ( (LA2_4==16) ) {
                        alt2=2;
                    }
                    else if ( (LA2_4==14) ) {
                        alt2=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalLookaheadTestLanguage.g:120:5: this_LookAhead0_0= ruleLookAhead0
                    {
                     
                            newCompositeNode(grammarAccess.getAltsAccess().getLookAhead0ParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_LookAhead0_0=ruleLookAhead0();

                    state._fsp--;

                     
                            current = this_LookAhead0_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalLookaheadTestLanguage.g:130:5: this_LookAhead1_1= ruleLookAhead1
                    {
                     
                            newCompositeNode(grammarAccess.getAltsAccess().getLookAhead1ParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_LookAhead1_1=ruleLookAhead1();

                    state._fsp--;

                     
                            current = this_LookAhead1_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalLookaheadTestLanguage.g:140:5: this_LookAhead3_2= ruleLookAhead3
                    {
                     
                            newCompositeNode(grammarAccess.getAltsAccess().getLookAhead3ParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_LookAhead3_2=ruleLookAhead3();

                    state._fsp--;

                     
                            current = this_LookAhead3_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

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
    // $ANTLR end "ruleAlts"


    // $ANTLR start "entryRuleLookAhead0"
    // InternalLookaheadTestLanguage.g:156:1: entryRuleLookAhead0 returns [EObject current=null] : iv_ruleLookAhead0= ruleLookAhead0 EOF ;
    public final EObject entryRuleLookAhead0() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLookAhead0 = null;


        try {
            // InternalLookaheadTestLanguage.g:157:2: (iv_ruleLookAhead0= ruleLookAhead0 EOF )
            // InternalLookaheadTestLanguage.g:158:2: iv_ruleLookAhead0= ruleLookAhead0 EOF
            {
             newCompositeNode(grammarAccess.getLookAhead0Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLookAhead0=ruleLookAhead0();

            state._fsp--;

             current =iv_ruleLookAhead0; 
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
    // $ANTLR end "entryRuleLookAhead0"


    // $ANTLR start "ruleLookAhead0"
    // InternalLookaheadTestLanguage.g:165:1: ruleLookAhead0 returns [EObject current=null] : (otherlv_0= 'bar' ( (lv_x_1_0= 'a' ) ) ) ;
    public final EObject ruleLookAhead0() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_x_1_0=null;

         enterRule(); 
            
        try {
            // InternalLookaheadTestLanguage.g:168:28: ( (otherlv_0= 'bar' ( (lv_x_1_0= 'a' ) ) ) )
            // InternalLookaheadTestLanguage.g:169:1: (otherlv_0= 'bar' ( (lv_x_1_0= 'a' ) ) )
            {
            // InternalLookaheadTestLanguage.g:169:1: (otherlv_0= 'bar' ( (lv_x_1_0= 'a' ) ) )
            // InternalLookaheadTestLanguage.g:169:3: otherlv_0= 'bar' ( (lv_x_1_0= 'a' ) )
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_4); 

                	newLeafNode(otherlv_0, grammarAccess.getLookAhead0Access().getBarKeyword_0());
                
            // InternalLookaheadTestLanguage.g:173:1: ( (lv_x_1_0= 'a' ) )
            // InternalLookaheadTestLanguage.g:174:1: (lv_x_1_0= 'a' )
            {
            // InternalLookaheadTestLanguage.g:174:1: (lv_x_1_0= 'a' )
            // InternalLookaheadTestLanguage.g:175:3: lv_x_1_0= 'a'
            {
            lv_x_1_0=(Token)match(input,12,FollowSets000.FOLLOW_2); 

                    newLeafNode(lv_x_1_0, grammarAccess.getLookAhead0Access().getXAKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLookAhead0Rule());
            	        }
                   		setWithLastConsumed(current, "x", lv_x_1_0, "a");
            	    

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
    // $ANTLR end "ruleLookAhead0"


    // $ANTLR start "entryRuleLookAhead1"
    // InternalLookaheadTestLanguage.g:196:1: entryRuleLookAhead1 returns [EObject current=null] : iv_ruleLookAhead1= ruleLookAhead1 EOF ;
    public final EObject entryRuleLookAhead1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLookAhead1 = null;


        try {
            // InternalLookaheadTestLanguage.g:197:2: (iv_ruleLookAhead1= ruleLookAhead1 EOF )
            // InternalLookaheadTestLanguage.g:198:2: iv_ruleLookAhead1= ruleLookAhead1 EOF
            {
             newCompositeNode(grammarAccess.getLookAhead1Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLookAhead1=ruleLookAhead1();

            state._fsp--;

             current =iv_ruleLookAhead1; 
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
    // $ANTLR end "entryRuleLookAhead1"


    // $ANTLR start "ruleLookAhead1"
    // InternalLookaheadTestLanguage.g:205:1: ruleLookAhead1 returns [EObject current=null] : (otherlv_0= 'foo' ( (lv_y_1_0= ruleLookAhead2 ) ) ( (lv_x_2_0= 'b' ) ) ( (lv_z_3_0= 'd' ) ) ) ;
    public final EObject ruleLookAhead1() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_x_2_0=null;
        Token lv_z_3_0=null;
        EObject lv_y_1_0 = null;


         enterRule(); 
            
        try {
            // InternalLookaheadTestLanguage.g:208:28: ( (otherlv_0= 'foo' ( (lv_y_1_0= ruleLookAhead2 ) ) ( (lv_x_2_0= 'b' ) ) ( (lv_z_3_0= 'd' ) ) ) )
            // InternalLookaheadTestLanguage.g:209:1: (otherlv_0= 'foo' ( (lv_y_1_0= ruleLookAhead2 ) ) ( (lv_x_2_0= 'b' ) ) ( (lv_z_3_0= 'd' ) ) )
            {
            // InternalLookaheadTestLanguage.g:209:1: (otherlv_0= 'foo' ( (lv_y_1_0= ruleLookAhead2 ) ) ( (lv_x_2_0= 'b' ) ) ( (lv_z_3_0= 'd' ) ) )
            // InternalLookaheadTestLanguage.g:209:3: otherlv_0= 'foo' ( (lv_y_1_0= ruleLookAhead2 ) ) ( (lv_x_2_0= 'b' ) ) ( (lv_z_3_0= 'd' ) )
            {
            otherlv_0=(Token)match(input,13,FollowSets000.FOLLOW_5); 

                	newLeafNode(otherlv_0, grammarAccess.getLookAhead1Access().getFooKeyword_0());
                
            // InternalLookaheadTestLanguage.g:213:1: ( (lv_y_1_0= ruleLookAhead2 ) )
            // InternalLookaheadTestLanguage.g:214:1: (lv_y_1_0= ruleLookAhead2 )
            {
            // InternalLookaheadTestLanguage.g:214:1: (lv_y_1_0= ruleLookAhead2 )
            // InternalLookaheadTestLanguage.g:215:3: lv_y_1_0= ruleLookAhead2
            {
             
            	        newCompositeNode(grammarAccess.getLookAhead1Access().getYLookAhead2ParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_6);
            lv_y_1_0=ruleLookAhead2();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLookAhead1Rule());
            	        }
                   		set(
                   			current, 
                   			"y",
                    		lv_y_1_0, 
                    		"org.eclipse.xtext.testlanguages.LookaheadTestLanguage.LookAhead2");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalLookaheadTestLanguage.g:231:2: ( (lv_x_2_0= 'b' ) )
            // InternalLookaheadTestLanguage.g:232:1: (lv_x_2_0= 'b' )
            {
            // InternalLookaheadTestLanguage.g:232:1: (lv_x_2_0= 'b' )
            // InternalLookaheadTestLanguage.g:233:3: lv_x_2_0= 'b'
            {
            lv_x_2_0=(Token)match(input,14,FollowSets000.FOLLOW_7); 

                    newLeafNode(lv_x_2_0, grammarAccess.getLookAhead1Access().getXBKeyword_2_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLookAhead1Rule());
            	        }
                   		setWithLastConsumed(current, "x", lv_x_2_0, "b");
            	    

            }


            }

            // InternalLookaheadTestLanguage.g:246:2: ( (lv_z_3_0= 'd' ) )
            // InternalLookaheadTestLanguage.g:247:1: (lv_z_3_0= 'd' )
            {
            // InternalLookaheadTestLanguage.g:247:1: (lv_z_3_0= 'd' )
            // InternalLookaheadTestLanguage.g:248:3: lv_z_3_0= 'd'
            {
            lv_z_3_0=(Token)match(input,15,FollowSets000.FOLLOW_2); 

                    newLeafNode(lv_z_3_0, grammarAccess.getLookAhead1Access().getZDKeyword_3_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLookAhead1Rule());
            	        }
                   		setWithLastConsumed(current, "z", lv_z_3_0, "d");
            	    

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
    // $ANTLR end "ruleLookAhead1"


    // $ANTLR start "entryRuleLookAhead2"
    // InternalLookaheadTestLanguage.g:269:1: entryRuleLookAhead2 returns [EObject current=null] : iv_ruleLookAhead2= ruleLookAhead2 EOF ;
    public final EObject entryRuleLookAhead2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLookAhead2 = null;


        try {
            // InternalLookaheadTestLanguage.g:270:2: (iv_ruleLookAhead2= ruleLookAhead2 EOF )
            // InternalLookaheadTestLanguage.g:271:2: iv_ruleLookAhead2= ruleLookAhead2 EOF
            {
             newCompositeNode(grammarAccess.getLookAhead2Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLookAhead2=ruleLookAhead2();

            state._fsp--;

             current =iv_ruleLookAhead2; 
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
    // $ANTLR end "entryRuleLookAhead2"


    // $ANTLR start "ruleLookAhead2"
    // InternalLookaheadTestLanguage.g:278:1: ruleLookAhead2 returns [EObject current=null] : ( ( ( (lv_z_0_0= 'foo' ) ) | ( (lv_z_1_0= 'bar' ) ) ) otherlv_2= 'c' ) ;
    public final EObject ruleLookAhead2() throws RecognitionException {
        EObject current = null;

        Token lv_z_0_0=null;
        Token lv_z_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // InternalLookaheadTestLanguage.g:281:28: ( ( ( ( (lv_z_0_0= 'foo' ) ) | ( (lv_z_1_0= 'bar' ) ) ) otherlv_2= 'c' ) )
            // InternalLookaheadTestLanguage.g:282:1: ( ( ( (lv_z_0_0= 'foo' ) ) | ( (lv_z_1_0= 'bar' ) ) ) otherlv_2= 'c' )
            {
            // InternalLookaheadTestLanguage.g:282:1: ( ( ( (lv_z_0_0= 'foo' ) ) | ( (lv_z_1_0= 'bar' ) ) ) otherlv_2= 'c' )
            // InternalLookaheadTestLanguage.g:282:2: ( ( (lv_z_0_0= 'foo' ) ) | ( (lv_z_1_0= 'bar' ) ) ) otherlv_2= 'c'
            {
            // InternalLookaheadTestLanguage.g:282:2: ( ( (lv_z_0_0= 'foo' ) ) | ( (lv_z_1_0= 'bar' ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            else if ( (LA3_0==11) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalLookaheadTestLanguage.g:282:3: ( (lv_z_0_0= 'foo' ) )
                    {
                    // InternalLookaheadTestLanguage.g:282:3: ( (lv_z_0_0= 'foo' ) )
                    // InternalLookaheadTestLanguage.g:283:1: (lv_z_0_0= 'foo' )
                    {
                    // InternalLookaheadTestLanguage.g:283:1: (lv_z_0_0= 'foo' )
                    // InternalLookaheadTestLanguage.g:284:3: lv_z_0_0= 'foo'
                    {
                    lv_z_0_0=(Token)match(input,13,FollowSets000.FOLLOW_8); 

                            newLeafNode(lv_z_0_0, grammarAccess.getLookAhead2Access().getZFooKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLookAhead2Rule());
                    	        }
                           		setWithLastConsumed(current, "z", lv_z_0_0, "foo");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalLookaheadTestLanguage.g:298:6: ( (lv_z_1_0= 'bar' ) )
                    {
                    // InternalLookaheadTestLanguage.g:298:6: ( (lv_z_1_0= 'bar' ) )
                    // InternalLookaheadTestLanguage.g:299:1: (lv_z_1_0= 'bar' )
                    {
                    // InternalLookaheadTestLanguage.g:299:1: (lv_z_1_0= 'bar' )
                    // InternalLookaheadTestLanguage.g:300:3: lv_z_1_0= 'bar'
                    {
                    lv_z_1_0=(Token)match(input,11,FollowSets000.FOLLOW_8); 

                            newLeafNode(lv_z_1_0, grammarAccess.getLookAhead2Access().getZBarKeyword_0_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLookAhead2Rule());
                    	        }
                           		setWithLastConsumed(current, "z", lv_z_1_0, "bar");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_2, grammarAccess.getLookAhead2Access().getCKeyword_1());
                

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
    // $ANTLR end "ruleLookAhead2"


    // $ANTLR start "entryRuleLookAhead3"
    // InternalLookaheadTestLanguage.g:325:1: entryRuleLookAhead3 returns [EObject current=null] : iv_ruleLookAhead3= ruleLookAhead3 EOF ;
    public final EObject entryRuleLookAhead3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLookAhead3 = null;


        try {
            // InternalLookaheadTestLanguage.g:326:2: (iv_ruleLookAhead3= ruleLookAhead3 EOF )
            // InternalLookaheadTestLanguage.g:327:2: iv_ruleLookAhead3= ruleLookAhead3 EOF
            {
             newCompositeNode(grammarAccess.getLookAhead3Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLookAhead3=ruleLookAhead3();

            state._fsp--;

             current =iv_ruleLookAhead3; 
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
    // $ANTLR end "entryRuleLookAhead3"


    // $ANTLR start "ruleLookAhead3"
    // InternalLookaheadTestLanguage.g:334:1: ruleLookAhead3 returns [EObject current=null] : (otherlv_0= 'foo' otherlv_1= 'bar' ( (lv_x_2_0= 'b' ) ) ( (lv_z_3_0= ruleLookAhead4 ) ) ) ;
    public final EObject ruleLookAhead3() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_x_2_0=null;
        EObject lv_z_3_0 = null;


         enterRule(); 
            
        try {
            // InternalLookaheadTestLanguage.g:337:28: ( (otherlv_0= 'foo' otherlv_1= 'bar' ( (lv_x_2_0= 'b' ) ) ( (lv_z_3_0= ruleLookAhead4 ) ) ) )
            // InternalLookaheadTestLanguage.g:338:1: (otherlv_0= 'foo' otherlv_1= 'bar' ( (lv_x_2_0= 'b' ) ) ( (lv_z_3_0= ruleLookAhead4 ) ) )
            {
            // InternalLookaheadTestLanguage.g:338:1: (otherlv_0= 'foo' otherlv_1= 'bar' ( (lv_x_2_0= 'b' ) ) ( (lv_z_3_0= ruleLookAhead4 ) ) )
            // InternalLookaheadTestLanguage.g:338:3: otherlv_0= 'foo' otherlv_1= 'bar' ( (lv_x_2_0= 'b' ) ) ( (lv_z_3_0= ruleLookAhead4 ) )
            {
            otherlv_0=(Token)match(input,13,FollowSets000.FOLLOW_9); 

                	newLeafNode(otherlv_0, grammarAccess.getLookAhead3Access().getFooKeyword_0());
                
            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_6); 

                	newLeafNode(otherlv_1, grammarAccess.getLookAhead3Access().getBarKeyword_1());
                
            // InternalLookaheadTestLanguage.g:346:1: ( (lv_x_2_0= 'b' ) )
            // InternalLookaheadTestLanguage.g:347:1: (lv_x_2_0= 'b' )
            {
            // InternalLookaheadTestLanguage.g:347:1: (lv_x_2_0= 'b' )
            // InternalLookaheadTestLanguage.g:348:3: lv_x_2_0= 'b'
            {
            lv_x_2_0=(Token)match(input,14,FollowSets000.FOLLOW_10); 

                    newLeafNode(lv_x_2_0, grammarAccess.getLookAhead3Access().getXBKeyword_2_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLookAhead3Rule());
            	        }
                   		setWithLastConsumed(current, "x", lv_x_2_0, "b");
            	    

            }


            }

            // InternalLookaheadTestLanguage.g:361:2: ( (lv_z_3_0= ruleLookAhead4 ) )
            // InternalLookaheadTestLanguage.g:362:1: (lv_z_3_0= ruleLookAhead4 )
            {
            // InternalLookaheadTestLanguage.g:362:1: (lv_z_3_0= ruleLookAhead4 )
            // InternalLookaheadTestLanguage.g:363:3: lv_z_3_0= ruleLookAhead4
            {
             
            	        newCompositeNode(grammarAccess.getLookAhead3Access().getZLookAhead4ParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_2);
            lv_z_3_0=ruleLookAhead4();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLookAhead3Rule());
            	        }
                   		set(
                   			current, 
                   			"z",
                    		lv_z_3_0, 
                    		"org.eclipse.xtext.testlanguages.LookaheadTestLanguage.LookAhead4");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleLookAhead3"


    // $ANTLR start "entryRuleLookAhead4"
    // InternalLookaheadTestLanguage.g:387:1: entryRuleLookAhead4 returns [EObject current=null] : iv_ruleLookAhead4= ruleLookAhead4 EOF ;
    public final EObject entryRuleLookAhead4() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLookAhead4 = null;


        try {
            // InternalLookaheadTestLanguage.g:388:2: (iv_ruleLookAhead4= ruleLookAhead4 EOF )
            // InternalLookaheadTestLanguage.g:389:2: iv_ruleLookAhead4= ruleLookAhead4 EOF
            {
             newCompositeNode(grammarAccess.getLookAhead4Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLookAhead4=ruleLookAhead4();

            state._fsp--;

             current =iv_ruleLookAhead4; 
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
    // $ANTLR end "entryRuleLookAhead4"


    // $ANTLR start "ruleLookAhead4"
    // InternalLookaheadTestLanguage.g:396:1: ruleLookAhead4 returns [EObject current=null] : ( ( (lv_x_0_0= 'c' ) ) | ( (lv_x_1_0= 'd' ) ) ) ;
    public final EObject ruleLookAhead4() throws RecognitionException {
        EObject current = null;

        Token lv_x_0_0=null;
        Token lv_x_1_0=null;

         enterRule(); 
            
        try {
            // InternalLookaheadTestLanguage.g:399:28: ( ( ( (lv_x_0_0= 'c' ) ) | ( (lv_x_1_0= 'd' ) ) ) )
            // InternalLookaheadTestLanguage.g:400:1: ( ( (lv_x_0_0= 'c' ) ) | ( (lv_x_1_0= 'd' ) ) )
            {
            // InternalLookaheadTestLanguage.g:400:1: ( ( (lv_x_0_0= 'c' ) ) | ( (lv_x_1_0= 'd' ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            else if ( (LA4_0==15) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalLookaheadTestLanguage.g:400:2: ( (lv_x_0_0= 'c' ) )
                    {
                    // InternalLookaheadTestLanguage.g:400:2: ( (lv_x_0_0= 'c' ) )
                    // InternalLookaheadTestLanguage.g:401:1: (lv_x_0_0= 'c' )
                    {
                    // InternalLookaheadTestLanguage.g:401:1: (lv_x_0_0= 'c' )
                    // InternalLookaheadTestLanguage.g:402:3: lv_x_0_0= 'c'
                    {
                    lv_x_0_0=(Token)match(input,16,FollowSets000.FOLLOW_2); 

                            newLeafNode(lv_x_0_0, grammarAccess.getLookAhead4Access().getXCKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLookAhead4Rule());
                    	        }
                           		setWithLastConsumed(current, "x", lv_x_0_0, "c");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalLookaheadTestLanguage.g:416:6: ( (lv_x_1_0= 'd' ) )
                    {
                    // InternalLookaheadTestLanguage.g:416:6: ( (lv_x_1_0= 'd' ) )
                    // InternalLookaheadTestLanguage.g:417:1: (lv_x_1_0= 'd' )
                    {
                    // InternalLookaheadTestLanguage.g:417:1: (lv_x_1_0= 'd' )
                    // InternalLookaheadTestLanguage.g:418:3: lv_x_1_0= 'd'
                    {
                    lv_x_1_0=(Token)match(input,15,FollowSets000.FOLLOW_2); 

                            newLeafNode(lv_x_1_0, grammarAccess.getLookAhead4Access().getXDKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLookAhead4Rule());
                    	        }
                           		setWithLastConsumed(current, "x", lv_x_1_0, "d");
                    	    

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleLookAhead4"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002802L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002800L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000018000L});
    }


}