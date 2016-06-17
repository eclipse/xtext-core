package org.eclipse.xtext.parser.terminalrules.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.parser.terminalrules.services.HiddenTerminalsTestLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalHiddenTerminalsTestLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'without'", "'hiddens'", "';'", "'with'", "'overriding'", "'('", "')'", "'call'", "'inheriting'", "'datatype'", "'rule'", "'hiding'"
    };
    public static final int RULE_SL_COMMENT=6;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__10=10;
    public static final int T__9=9;
    public static final int T__8=8;
    public static final int RULE_WS=4;
    public static final int RULE_ANY_OTHER=7;
    public static final int RULE_ML_COMMENT=5;

    // delegates
    // delegators


        public InternalHiddenTerminalsTestLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalHiddenTerminalsTestLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalHiddenTerminalsTestLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalHiddenTerminalsTestLanguage.g"; }



     	private HiddenTerminalsTestLanguageGrammarAccess grammarAccess;
     	
        public InternalHiddenTerminalsTestLanguageParser(TokenStream input, HiddenTerminalsTestLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected HiddenTerminalsTestLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // InternalHiddenTerminalsTestLanguage.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalHiddenTerminalsTestLanguage.g:68:2: (iv_ruleModel= ruleModel EOF )
            // InternalHiddenTerminalsTestLanguage.g:69:2: iv_ruleModel= ruleModel EOF
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
    // InternalHiddenTerminalsTestLanguage.g:76:1: ruleModel returns [EObject current=null] : (this_WithoutHiddens_0= ruleWithoutHiddens | this_WithHiddens_1= ruleWithHiddens | this_OverridingHiddens_2= ruleOverridingHiddens | this_InheritingHiddens_3= ruleInheritingHiddens | this_DatatypeHiddens_4= ruleDatatypeHiddens ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject this_WithoutHiddens_0 = null;

        EObject this_WithHiddens_1 = null;

        EObject this_OverridingHiddens_2 = null;

        EObject this_InheritingHiddens_3 = null;

        EObject this_DatatypeHiddens_4 = null;


         enterRule(); 
            
        try {
            // InternalHiddenTerminalsTestLanguage.g:79:28: ( (this_WithoutHiddens_0= ruleWithoutHiddens | this_WithHiddens_1= ruleWithHiddens | this_OverridingHiddens_2= ruleOverridingHiddens | this_InheritingHiddens_3= ruleInheritingHiddens | this_DatatypeHiddens_4= ruleDatatypeHiddens ) )
            // InternalHiddenTerminalsTestLanguage.g:80:1: (this_WithoutHiddens_0= ruleWithoutHiddens | this_WithHiddens_1= ruleWithHiddens | this_OverridingHiddens_2= ruleOverridingHiddens | this_InheritingHiddens_3= ruleInheritingHiddens | this_DatatypeHiddens_4= ruleDatatypeHiddens )
            {
            // InternalHiddenTerminalsTestLanguage.g:80:1: (this_WithoutHiddens_0= ruleWithoutHiddens | this_WithHiddens_1= ruleWithHiddens | this_OverridingHiddens_2= ruleOverridingHiddens | this_InheritingHiddens_3= ruleInheritingHiddens | this_DatatypeHiddens_4= ruleDatatypeHiddens )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 8:
                {
                alt1=1;
                }
                break;
            case 11:
                {
                alt1=2;
                }
                break;
            case 12:
                {
                alt1=3;
                }
                break;
            case 16:
                {
                alt1=4;
                }
                break;
            case 17:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalHiddenTerminalsTestLanguage.g:81:5: this_WithoutHiddens_0= ruleWithoutHiddens
                    {
                     
                            newCompositeNode(grammarAccess.getModelAccess().getWithoutHiddensParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_WithoutHiddens_0=ruleWithoutHiddens();

                    state._fsp--;

                     
                            current = this_WithoutHiddens_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalHiddenTerminalsTestLanguage.g:91:5: this_WithHiddens_1= ruleWithHiddens
                    {
                     
                            newCompositeNode(grammarAccess.getModelAccess().getWithHiddensParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_WithHiddens_1=ruleWithHiddens();

                    state._fsp--;

                     
                            current = this_WithHiddens_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalHiddenTerminalsTestLanguage.g:101:5: this_OverridingHiddens_2= ruleOverridingHiddens
                    {
                     
                            newCompositeNode(grammarAccess.getModelAccess().getOverridingHiddensParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_OverridingHiddens_2=ruleOverridingHiddens();

                    state._fsp--;

                     
                            current = this_OverridingHiddens_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // InternalHiddenTerminalsTestLanguage.g:111:5: this_InheritingHiddens_3= ruleInheritingHiddens
                    {
                     
                            newCompositeNode(grammarAccess.getModelAccess().getInheritingHiddensParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_InheritingHiddens_3=ruleInheritingHiddens();

                    state._fsp--;

                     
                            current = this_InheritingHiddens_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // InternalHiddenTerminalsTestLanguage.g:121:5: this_DatatypeHiddens_4= ruleDatatypeHiddens
                    {
                     
                            newCompositeNode(grammarAccess.getModelAccess().getDatatypeHiddensParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_DatatypeHiddens_4=ruleDatatypeHiddens();

                    state._fsp--;

                     
                            current = this_DatatypeHiddens_4; 
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleWithoutHiddens"
    // InternalHiddenTerminalsTestLanguage.g:137:1: entryRuleWithoutHiddens returns [EObject current=null] : iv_ruleWithoutHiddens= ruleWithoutHiddens EOF ;
    public final EObject entryRuleWithoutHiddens() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWithoutHiddens = null;


        try {
            // InternalHiddenTerminalsTestLanguage.g:138:2: (iv_ruleWithoutHiddens= ruleWithoutHiddens EOF )
            // InternalHiddenTerminalsTestLanguage.g:139:2: iv_ruleWithoutHiddens= ruleWithoutHiddens EOF
            {
             newCompositeNode(grammarAccess.getWithoutHiddensRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleWithoutHiddens=ruleWithoutHiddens();

            state._fsp--;

             current =iv_ruleWithoutHiddens; 
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
    // $ANTLR end "entryRuleWithoutHiddens"


    // $ANTLR start "ruleWithoutHiddens"
    // InternalHiddenTerminalsTestLanguage.g:146:1: ruleWithoutHiddens returns [EObject current=null] : (otherlv_0= 'without' ( (lv_spaces_1_0= RULE_WS ) ) otherlv_2= 'hiddens' ( (lv_spaces_3_0= RULE_WS ) )? ( (lv_valid_4_0= ';' ) ) ) ;
    public final EObject ruleWithoutHiddens() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_spaces_1_0=null;
        Token otherlv_2=null;
        Token lv_spaces_3_0=null;
        Token lv_valid_4_0=null;

         enterRule(); 
            
        try {
            // InternalHiddenTerminalsTestLanguage.g:149:28: ( (otherlv_0= 'without' ( (lv_spaces_1_0= RULE_WS ) ) otherlv_2= 'hiddens' ( (lv_spaces_3_0= RULE_WS ) )? ( (lv_valid_4_0= ';' ) ) ) )
            // InternalHiddenTerminalsTestLanguage.g:150:1: (otherlv_0= 'without' ( (lv_spaces_1_0= RULE_WS ) ) otherlv_2= 'hiddens' ( (lv_spaces_3_0= RULE_WS ) )? ( (lv_valid_4_0= ';' ) ) )
            {
            // InternalHiddenTerminalsTestLanguage.g:150:1: (otherlv_0= 'without' ( (lv_spaces_1_0= RULE_WS ) ) otherlv_2= 'hiddens' ( (lv_spaces_3_0= RULE_WS ) )? ( (lv_valid_4_0= ';' ) ) )
            // InternalHiddenTerminalsTestLanguage.g:150:3: otherlv_0= 'without' ( (lv_spaces_1_0= RULE_WS ) ) otherlv_2= 'hiddens' ( (lv_spaces_3_0= RULE_WS ) )? ( (lv_valid_4_0= ';' ) )
            {
            otherlv_0=(Token)match(input,8,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getWithoutHiddensAccess().getWithoutKeyword_0());
                
            // InternalHiddenTerminalsTestLanguage.g:154:1: ( (lv_spaces_1_0= RULE_WS ) )
            // InternalHiddenTerminalsTestLanguage.g:155:1: (lv_spaces_1_0= RULE_WS )
            {
            // InternalHiddenTerminalsTestLanguage.g:155:1: (lv_spaces_1_0= RULE_WS )
            // InternalHiddenTerminalsTestLanguage.g:156:3: lv_spaces_1_0= RULE_WS
            {
            lv_spaces_1_0=(Token)match(input,RULE_WS,FollowSets000.FOLLOW_4); 

            			newLeafNode(lv_spaces_1_0, grammarAccess.getWithoutHiddensAccess().getSpacesWSTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWithoutHiddensRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"spaces",
                    		lv_spaces_1_0, 
                    		"org.eclipse.xtext.parser.terminalrules.HiddenTerminalsTestLanguage.WS");
            	    

            }


            }

            otherlv_2=(Token)match(input,9,FollowSets000.FOLLOW_5); 

                	newLeafNode(otherlv_2, grammarAccess.getWithoutHiddensAccess().getHiddensKeyword_2());
                
            // InternalHiddenTerminalsTestLanguage.g:176:1: ( (lv_spaces_3_0= RULE_WS ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_WS) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalHiddenTerminalsTestLanguage.g:177:1: (lv_spaces_3_0= RULE_WS )
                    {
                    // InternalHiddenTerminalsTestLanguage.g:177:1: (lv_spaces_3_0= RULE_WS )
                    // InternalHiddenTerminalsTestLanguage.g:178:3: lv_spaces_3_0= RULE_WS
                    {
                    lv_spaces_3_0=(Token)match(input,RULE_WS,FollowSets000.FOLLOW_6); 

                    			newLeafNode(lv_spaces_3_0, grammarAccess.getWithoutHiddensAccess().getSpacesWSTerminalRuleCall_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWithoutHiddensRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"spaces",
                            		lv_spaces_3_0, 
                            		"org.eclipse.xtext.parser.terminalrules.HiddenTerminalsTestLanguage.WS");
                    	    

                    }


                    }
                    break;

            }

            // InternalHiddenTerminalsTestLanguage.g:194:3: ( (lv_valid_4_0= ';' ) )
            // InternalHiddenTerminalsTestLanguage.g:195:1: (lv_valid_4_0= ';' )
            {
            // InternalHiddenTerminalsTestLanguage.g:195:1: (lv_valid_4_0= ';' )
            // InternalHiddenTerminalsTestLanguage.g:196:3: lv_valid_4_0= ';'
            {
            lv_valid_4_0=(Token)match(input,10,FollowSets000.FOLLOW_2); 

                    newLeafNode(lv_valid_4_0, grammarAccess.getWithoutHiddensAccess().getValidSemicolonKeyword_4_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWithoutHiddensRule());
            	        }
                   		setWithLastConsumed(current, "valid", true, ";");
            	    

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
    // $ANTLR end "ruleWithoutHiddens"


    // $ANTLR start "entryRuleWithHiddens"
    // InternalHiddenTerminalsTestLanguage.g:217:1: entryRuleWithHiddens returns [EObject current=null] : iv_ruleWithHiddens= ruleWithHiddens EOF ;
    public final EObject entryRuleWithHiddens() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWithHiddens = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
        	
        try {
            // InternalHiddenTerminalsTestLanguage.g:221:2: (iv_ruleWithHiddens= ruleWithHiddens EOF )
            // InternalHiddenTerminalsTestLanguage.g:222:2: iv_ruleWithHiddens= ruleWithHiddens EOF
            {
             newCompositeNode(grammarAccess.getWithHiddensRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleWithHiddens=ruleWithHiddens();

            state._fsp--;

             current =iv_ruleWithHiddens; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleWithHiddens"


    // $ANTLR start "ruleWithHiddens"
    // InternalHiddenTerminalsTestLanguage.g:232:1: ruleWithHiddens returns [EObject current=null] : (otherlv_0= 'with' otherlv_1= 'hiddens' ( (lv_valid_2_0= ';' ) ) ) ;
    public final EObject ruleWithHiddens() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_valid_2_0=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
            
        try {
            // InternalHiddenTerminalsTestLanguage.g:236:28: ( (otherlv_0= 'with' otherlv_1= 'hiddens' ( (lv_valid_2_0= ';' ) ) ) )
            // InternalHiddenTerminalsTestLanguage.g:237:1: (otherlv_0= 'with' otherlv_1= 'hiddens' ( (lv_valid_2_0= ';' ) ) )
            {
            // InternalHiddenTerminalsTestLanguage.g:237:1: (otherlv_0= 'with' otherlv_1= 'hiddens' ( (lv_valid_2_0= ';' ) ) )
            // InternalHiddenTerminalsTestLanguage.g:237:3: otherlv_0= 'with' otherlv_1= 'hiddens' ( (lv_valid_2_0= ';' ) )
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_4); 

                	newLeafNode(otherlv_0, grammarAccess.getWithHiddensAccess().getWithKeyword_0());
                
            otherlv_1=(Token)match(input,9,FollowSets000.FOLLOW_6); 

                	newLeafNode(otherlv_1, grammarAccess.getWithHiddensAccess().getHiddensKeyword_1());
                
            // InternalHiddenTerminalsTestLanguage.g:245:1: ( (lv_valid_2_0= ';' ) )
            // InternalHiddenTerminalsTestLanguage.g:246:1: (lv_valid_2_0= ';' )
            {
            // InternalHiddenTerminalsTestLanguage.g:246:1: (lv_valid_2_0= ';' )
            // InternalHiddenTerminalsTestLanguage.g:247:3: lv_valid_2_0= ';'
            {
            lv_valid_2_0=(Token)match(input,10,FollowSets000.FOLLOW_2); 

                    newLeafNode(lv_valid_2_0, grammarAccess.getWithHiddensAccess().getValidSemicolonKeyword_2_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWithHiddensRule());
            	        }
                   		setWithLastConsumed(current, "valid", true, ";");
            	    

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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleWithHiddens"


    // $ANTLR start "entryRuleOverridingHiddens"
    // InternalHiddenTerminalsTestLanguage.g:271:1: entryRuleOverridingHiddens returns [EObject current=null] : iv_ruleOverridingHiddens= ruleOverridingHiddens EOF ;
    public final EObject entryRuleOverridingHiddens() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOverridingHiddens = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
        	
        try {
            // InternalHiddenTerminalsTestLanguage.g:275:2: (iv_ruleOverridingHiddens= ruleOverridingHiddens EOF )
            // InternalHiddenTerminalsTestLanguage.g:276:2: iv_ruleOverridingHiddens= ruleOverridingHiddens EOF
            {
             newCompositeNode(grammarAccess.getOverridingHiddensRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleOverridingHiddens=ruleOverridingHiddens();

            state._fsp--;

             current =iv_ruleOverridingHiddens; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleOverridingHiddens"


    // $ANTLR start "ruleOverridingHiddens"
    // InternalHiddenTerminalsTestLanguage.g:286:1: ruleOverridingHiddens returns [EObject current=null] : (otherlv_0= 'overriding' otherlv_1= 'hiddens' otherlv_2= '(' ( (lv_called_3_0= ruleOverridingHiddensCall ) ) otherlv_4= ')' ( (lv_valid_5_0= ';' ) ) ) ;
    public final EObject ruleOverridingHiddens() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_valid_5_0=null;
        EObject lv_called_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
            
        try {
            // InternalHiddenTerminalsTestLanguage.g:290:28: ( (otherlv_0= 'overriding' otherlv_1= 'hiddens' otherlv_2= '(' ( (lv_called_3_0= ruleOverridingHiddensCall ) ) otherlv_4= ')' ( (lv_valid_5_0= ';' ) ) ) )
            // InternalHiddenTerminalsTestLanguage.g:291:1: (otherlv_0= 'overriding' otherlv_1= 'hiddens' otherlv_2= '(' ( (lv_called_3_0= ruleOverridingHiddensCall ) ) otherlv_4= ')' ( (lv_valid_5_0= ';' ) ) )
            {
            // InternalHiddenTerminalsTestLanguage.g:291:1: (otherlv_0= 'overriding' otherlv_1= 'hiddens' otherlv_2= '(' ( (lv_called_3_0= ruleOverridingHiddensCall ) ) otherlv_4= ')' ( (lv_valid_5_0= ';' ) ) )
            // InternalHiddenTerminalsTestLanguage.g:291:3: otherlv_0= 'overriding' otherlv_1= 'hiddens' otherlv_2= '(' ( (lv_called_3_0= ruleOverridingHiddensCall ) ) otherlv_4= ')' ( (lv_valid_5_0= ';' ) )
            {
            otherlv_0=(Token)match(input,12,FollowSets000.FOLLOW_4); 

                	newLeafNode(otherlv_0, grammarAccess.getOverridingHiddensAccess().getOverridingKeyword_0());
                
            otherlv_1=(Token)match(input,9,FollowSets000.FOLLOW_7); 

                	newLeafNode(otherlv_1, grammarAccess.getOverridingHiddensAccess().getHiddensKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_8); 

                	newLeafNode(otherlv_2, grammarAccess.getOverridingHiddensAccess().getLeftParenthesisKeyword_2());
                
            // InternalHiddenTerminalsTestLanguage.g:303:1: ( (lv_called_3_0= ruleOverridingHiddensCall ) )
            // InternalHiddenTerminalsTestLanguage.g:304:1: (lv_called_3_0= ruleOverridingHiddensCall )
            {
            // InternalHiddenTerminalsTestLanguage.g:304:1: (lv_called_3_0= ruleOverridingHiddensCall )
            // InternalHiddenTerminalsTestLanguage.g:305:3: lv_called_3_0= ruleOverridingHiddensCall
            {
             
            	        newCompositeNode(grammarAccess.getOverridingHiddensAccess().getCalledOverridingHiddensCallParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_9);
            lv_called_3_0=ruleOverridingHiddensCall();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOverridingHiddensRule());
            	        }
                   		set(
                   			current, 
                   			"called",
                    		lv_called_3_0, 
                    		"org.eclipse.xtext.parser.terminalrules.HiddenTerminalsTestLanguage.OverridingHiddensCall");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_6); 

                	newLeafNode(otherlv_4, grammarAccess.getOverridingHiddensAccess().getRightParenthesisKeyword_4());
                
            // InternalHiddenTerminalsTestLanguage.g:325:1: ( (lv_valid_5_0= ';' ) )
            // InternalHiddenTerminalsTestLanguage.g:326:1: (lv_valid_5_0= ';' )
            {
            // InternalHiddenTerminalsTestLanguage.g:326:1: (lv_valid_5_0= ';' )
            // InternalHiddenTerminalsTestLanguage.g:327:3: lv_valid_5_0= ';'
            {
            lv_valid_5_0=(Token)match(input,10,FollowSets000.FOLLOW_2); 

                    newLeafNode(lv_valid_5_0, grammarAccess.getOverridingHiddensAccess().getValidSemicolonKeyword_5_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOverridingHiddensRule());
            	        }
                   		setWithLastConsumed(current, "valid", true, ";");
            	    

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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleOverridingHiddens"


    // $ANTLR start "entryRuleOverridingHiddensCall"
    // InternalHiddenTerminalsTestLanguage.g:351:1: entryRuleOverridingHiddensCall returns [EObject current=null] : iv_ruleOverridingHiddensCall= ruleOverridingHiddensCall EOF ;
    public final EObject entryRuleOverridingHiddensCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOverridingHiddensCall = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // InternalHiddenTerminalsTestLanguage.g:355:2: (iv_ruleOverridingHiddensCall= ruleOverridingHiddensCall EOF )
            // InternalHiddenTerminalsTestLanguage.g:356:2: iv_ruleOverridingHiddensCall= ruleOverridingHiddensCall EOF
            {
             newCompositeNode(grammarAccess.getOverridingHiddensCallRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleOverridingHiddensCall=ruleOverridingHiddensCall();

            state._fsp--;

             current =iv_ruleOverridingHiddensCall; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleOverridingHiddensCall"


    // $ANTLR start "ruleOverridingHiddensCall"
    // InternalHiddenTerminalsTestLanguage.g:366:1: ruleOverridingHiddensCall returns [EObject current=null] : (otherlv_0= 'call' ( (lv_spaces_1_0= RULE_WS ) )? ( (lv_valid_2_0= ';' ) ) ) ;
    public final EObject ruleOverridingHiddensCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_spaces_1_0=null;
        Token lv_valid_2_0=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // InternalHiddenTerminalsTestLanguage.g:370:28: ( (otherlv_0= 'call' ( (lv_spaces_1_0= RULE_WS ) )? ( (lv_valid_2_0= ';' ) ) ) )
            // InternalHiddenTerminalsTestLanguage.g:371:1: (otherlv_0= 'call' ( (lv_spaces_1_0= RULE_WS ) )? ( (lv_valid_2_0= ';' ) ) )
            {
            // InternalHiddenTerminalsTestLanguage.g:371:1: (otherlv_0= 'call' ( (lv_spaces_1_0= RULE_WS ) )? ( (lv_valid_2_0= ';' ) ) )
            // InternalHiddenTerminalsTestLanguage.g:371:3: otherlv_0= 'call' ( (lv_spaces_1_0= RULE_WS ) )? ( (lv_valid_2_0= ';' ) )
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_5); 

                	newLeafNode(otherlv_0, grammarAccess.getOverridingHiddensCallAccess().getCallKeyword_0());
                
            // InternalHiddenTerminalsTestLanguage.g:375:1: ( (lv_spaces_1_0= RULE_WS ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_WS) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalHiddenTerminalsTestLanguage.g:376:1: (lv_spaces_1_0= RULE_WS )
                    {
                    // InternalHiddenTerminalsTestLanguage.g:376:1: (lv_spaces_1_0= RULE_WS )
                    // InternalHiddenTerminalsTestLanguage.g:377:3: lv_spaces_1_0= RULE_WS
                    {
                    lv_spaces_1_0=(Token)match(input,RULE_WS,FollowSets000.FOLLOW_6); 

                    			newLeafNode(lv_spaces_1_0, grammarAccess.getOverridingHiddensCallAccess().getSpacesWSTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOverridingHiddensCallRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"spaces",
                            		lv_spaces_1_0, 
                            		"org.eclipse.xtext.parser.terminalrules.HiddenTerminalsTestLanguage.WS");
                    	    

                    }


                    }
                    break;

            }

            // InternalHiddenTerminalsTestLanguage.g:393:3: ( (lv_valid_2_0= ';' ) )
            // InternalHiddenTerminalsTestLanguage.g:394:1: (lv_valid_2_0= ';' )
            {
            // InternalHiddenTerminalsTestLanguage.g:394:1: (lv_valid_2_0= ';' )
            // InternalHiddenTerminalsTestLanguage.g:395:3: lv_valid_2_0= ';'
            {
            lv_valid_2_0=(Token)match(input,10,FollowSets000.FOLLOW_2); 

                    newLeafNode(lv_valid_2_0, grammarAccess.getOverridingHiddensCallAccess().getValidSemicolonKeyword_2_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOverridingHiddensCallRule());
            	        }
                   		setWithLastConsumed(current, "valid", true, ";");
            	    

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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleOverridingHiddensCall"


    // $ANTLR start "entryRuleInheritingHiddens"
    // InternalHiddenTerminalsTestLanguage.g:419:1: entryRuleInheritingHiddens returns [EObject current=null] : iv_ruleInheritingHiddens= ruleInheritingHiddens EOF ;
    public final EObject entryRuleInheritingHiddens() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInheritingHiddens = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
        	
        try {
            // InternalHiddenTerminalsTestLanguage.g:423:2: (iv_ruleInheritingHiddens= ruleInheritingHiddens EOF )
            // InternalHiddenTerminalsTestLanguage.g:424:2: iv_ruleInheritingHiddens= ruleInheritingHiddens EOF
            {
             newCompositeNode(grammarAccess.getInheritingHiddensRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleInheritingHiddens=ruleInheritingHiddens();

            state._fsp--;

             current =iv_ruleInheritingHiddens; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleInheritingHiddens"


    // $ANTLR start "ruleInheritingHiddens"
    // InternalHiddenTerminalsTestLanguage.g:434:1: ruleInheritingHiddens returns [EObject current=null] : (otherlv_0= 'inheriting' otherlv_1= 'hiddens' otherlv_2= '(' ( ( (lv_called_3_0= ruleInheritingHiddensCall ) ) | ( (lv_hidingCalled_4_0= ruleHidingHiddens ) ) ) otherlv_5= ')' ( (lv_valid_6_0= ';' ) ) ) ;
    public final EObject ruleInheritingHiddens() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token lv_valid_6_0=null;
        EObject lv_called_3_0 = null;

        EObject lv_hidingCalled_4_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
            
        try {
            // InternalHiddenTerminalsTestLanguage.g:438:28: ( (otherlv_0= 'inheriting' otherlv_1= 'hiddens' otherlv_2= '(' ( ( (lv_called_3_0= ruleInheritingHiddensCall ) ) | ( (lv_hidingCalled_4_0= ruleHidingHiddens ) ) ) otherlv_5= ')' ( (lv_valid_6_0= ';' ) ) ) )
            // InternalHiddenTerminalsTestLanguage.g:439:1: (otherlv_0= 'inheriting' otherlv_1= 'hiddens' otherlv_2= '(' ( ( (lv_called_3_0= ruleInheritingHiddensCall ) ) | ( (lv_hidingCalled_4_0= ruleHidingHiddens ) ) ) otherlv_5= ')' ( (lv_valid_6_0= ';' ) ) )
            {
            // InternalHiddenTerminalsTestLanguage.g:439:1: (otherlv_0= 'inheriting' otherlv_1= 'hiddens' otherlv_2= '(' ( ( (lv_called_3_0= ruleInheritingHiddensCall ) ) | ( (lv_hidingCalled_4_0= ruleHidingHiddens ) ) ) otherlv_5= ')' ( (lv_valid_6_0= ';' ) ) )
            // InternalHiddenTerminalsTestLanguage.g:439:3: otherlv_0= 'inheriting' otherlv_1= 'hiddens' otherlv_2= '(' ( ( (lv_called_3_0= ruleInheritingHiddensCall ) ) | ( (lv_hidingCalled_4_0= ruleHidingHiddens ) ) ) otherlv_5= ')' ( (lv_valid_6_0= ';' ) )
            {
            otherlv_0=(Token)match(input,16,FollowSets000.FOLLOW_4); 

                	newLeafNode(otherlv_0, grammarAccess.getInheritingHiddensAccess().getInheritingKeyword_0());
                
            otherlv_1=(Token)match(input,9,FollowSets000.FOLLOW_7); 

                	newLeafNode(otherlv_1, grammarAccess.getInheritingHiddensAccess().getHiddensKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_10); 

                	newLeafNode(otherlv_2, grammarAccess.getInheritingHiddensAccess().getLeftParenthesisKeyword_2());
                
            // InternalHiddenTerminalsTestLanguage.g:451:1: ( ( (lv_called_3_0= ruleInheritingHiddensCall ) ) | ( (lv_hidingCalled_4_0= ruleHidingHiddens ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            else if ( (LA4_0==19) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalHiddenTerminalsTestLanguage.g:451:2: ( (lv_called_3_0= ruleInheritingHiddensCall ) )
                    {
                    // InternalHiddenTerminalsTestLanguage.g:451:2: ( (lv_called_3_0= ruleInheritingHiddensCall ) )
                    // InternalHiddenTerminalsTestLanguage.g:452:1: (lv_called_3_0= ruleInheritingHiddensCall )
                    {
                    // InternalHiddenTerminalsTestLanguage.g:452:1: (lv_called_3_0= ruleInheritingHiddensCall )
                    // InternalHiddenTerminalsTestLanguage.g:453:3: lv_called_3_0= ruleInheritingHiddensCall
                    {
                     
                    	        newCompositeNode(grammarAccess.getInheritingHiddensAccess().getCalledInheritingHiddensCallParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_9);
                    lv_called_3_0=ruleInheritingHiddensCall();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInheritingHiddensRule());
                    	        }
                           		set(
                           			current, 
                           			"called",
                            		lv_called_3_0, 
                            		"org.eclipse.xtext.parser.terminalrules.HiddenTerminalsTestLanguage.InheritingHiddensCall");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalHiddenTerminalsTestLanguage.g:470:6: ( (lv_hidingCalled_4_0= ruleHidingHiddens ) )
                    {
                    // InternalHiddenTerminalsTestLanguage.g:470:6: ( (lv_hidingCalled_4_0= ruleHidingHiddens ) )
                    // InternalHiddenTerminalsTestLanguage.g:471:1: (lv_hidingCalled_4_0= ruleHidingHiddens )
                    {
                    // InternalHiddenTerminalsTestLanguage.g:471:1: (lv_hidingCalled_4_0= ruleHidingHiddens )
                    // InternalHiddenTerminalsTestLanguage.g:472:3: lv_hidingCalled_4_0= ruleHidingHiddens
                    {
                     
                    	        newCompositeNode(grammarAccess.getInheritingHiddensAccess().getHidingCalledHidingHiddensParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_9);
                    lv_hidingCalled_4_0=ruleHidingHiddens();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInheritingHiddensRule());
                    	        }
                           		set(
                           			current, 
                           			"hidingCalled",
                            		lv_hidingCalled_4_0, 
                            		"org.eclipse.xtext.parser.terminalrules.HiddenTerminalsTestLanguage.HidingHiddens");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_6); 

                	newLeafNode(otherlv_5, grammarAccess.getInheritingHiddensAccess().getRightParenthesisKeyword_4());
                
            // InternalHiddenTerminalsTestLanguage.g:492:1: ( (lv_valid_6_0= ';' ) )
            // InternalHiddenTerminalsTestLanguage.g:493:1: (lv_valid_6_0= ';' )
            {
            // InternalHiddenTerminalsTestLanguage.g:493:1: (lv_valid_6_0= ';' )
            // InternalHiddenTerminalsTestLanguage.g:494:3: lv_valid_6_0= ';'
            {
            lv_valid_6_0=(Token)match(input,10,FollowSets000.FOLLOW_2); 

                    newLeafNode(lv_valid_6_0, grammarAccess.getInheritingHiddensAccess().getValidSemicolonKeyword_5_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInheritingHiddensRule());
            	        }
                   		setWithLastConsumed(current, "valid", true, ";");
            	    

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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleInheritingHiddens"


    // $ANTLR start "entryRuleDatatypeHiddens"
    // InternalHiddenTerminalsTestLanguage.g:518:1: entryRuleDatatypeHiddens returns [EObject current=null] : iv_ruleDatatypeHiddens= ruleDatatypeHiddens EOF ;
    public final EObject entryRuleDatatypeHiddens() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatatypeHiddens = null;


        try {
            // InternalHiddenTerminalsTestLanguage.g:519:2: (iv_ruleDatatypeHiddens= ruleDatatypeHiddens EOF )
            // InternalHiddenTerminalsTestLanguage.g:520:2: iv_ruleDatatypeHiddens= ruleDatatypeHiddens EOF
            {
             newCompositeNode(grammarAccess.getDatatypeHiddensRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDatatypeHiddens=ruleDatatypeHiddens();

            state._fsp--;

             current =iv_ruleDatatypeHiddens; 
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
    // $ANTLR end "entryRuleDatatypeHiddens"


    // $ANTLR start "ruleDatatypeHiddens"
    // InternalHiddenTerminalsTestLanguage.g:527:1: ruleDatatypeHiddens returns [EObject current=null] : (otherlv_0= 'datatype' ( (lv_valid_1_0= ruleDatatypeRule ) ) ) ;
    public final EObject ruleDatatypeHiddens() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_valid_1_0 = null;


         enterRule(); 
            
        try {
            // InternalHiddenTerminalsTestLanguage.g:530:28: ( (otherlv_0= 'datatype' ( (lv_valid_1_0= ruleDatatypeRule ) ) ) )
            // InternalHiddenTerminalsTestLanguage.g:531:1: (otherlv_0= 'datatype' ( (lv_valid_1_0= ruleDatatypeRule ) ) )
            {
            // InternalHiddenTerminalsTestLanguage.g:531:1: (otherlv_0= 'datatype' ( (lv_valid_1_0= ruleDatatypeRule ) ) )
            // InternalHiddenTerminalsTestLanguage.g:531:3: otherlv_0= 'datatype' ( (lv_valid_1_0= ruleDatatypeRule ) )
            {
            otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_11); 

                	newLeafNode(otherlv_0, grammarAccess.getDatatypeHiddensAccess().getDatatypeKeyword_0());
                
            // InternalHiddenTerminalsTestLanguage.g:535:1: ( (lv_valid_1_0= ruleDatatypeRule ) )
            // InternalHiddenTerminalsTestLanguage.g:536:1: (lv_valid_1_0= ruleDatatypeRule )
            {
            // InternalHiddenTerminalsTestLanguage.g:536:1: (lv_valid_1_0= ruleDatatypeRule )
            // InternalHiddenTerminalsTestLanguage.g:537:3: lv_valid_1_0= ruleDatatypeRule
            {
             
            	        newCompositeNode(grammarAccess.getDatatypeHiddensAccess().getValidDatatypeRuleParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_2);
            lv_valid_1_0=ruleDatatypeRule();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDatatypeHiddensRule());
            	        }
                   		set(
                   			current, 
                   			"valid",
                    		true, 
                    		"org.eclipse.xtext.parser.terminalrules.HiddenTerminalsTestLanguage.DatatypeRule");
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
    // $ANTLR end "ruleDatatypeHiddens"


    // $ANTLR start "entryRuleDatatypeRule"
    // InternalHiddenTerminalsTestLanguage.g:561:1: entryRuleDatatypeRule returns [String current=null] : iv_ruleDatatypeRule= ruleDatatypeRule EOF ;
    public final String entryRuleDatatypeRule() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDatatypeRule = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        	
        try {
            // InternalHiddenTerminalsTestLanguage.g:565:2: (iv_ruleDatatypeRule= ruleDatatypeRule EOF )
            // InternalHiddenTerminalsTestLanguage.g:566:2: iv_ruleDatatypeRule= ruleDatatypeRule EOF
            {
             newCompositeNode(grammarAccess.getDatatypeRuleRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDatatypeRule=ruleDatatypeRule();

            state._fsp--;

             current =iv_ruleDatatypeRule.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleDatatypeRule"


    // $ANTLR start "ruleDatatypeRule"
    // InternalHiddenTerminalsTestLanguage.g:576:1: ruleDatatypeRule returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'rule' kw= ';' ) ;
    public final AntlrDatatypeRuleToken ruleDatatypeRule() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
            
        try {
            // InternalHiddenTerminalsTestLanguage.g:580:28: ( (kw= 'rule' kw= ';' ) )
            // InternalHiddenTerminalsTestLanguage.g:581:1: (kw= 'rule' kw= ';' )
            {
            // InternalHiddenTerminalsTestLanguage.g:581:1: (kw= 'rule' kw= ';' )
            // InternalHiddenTerminalsTestLanguage.g:582:2: kw= 'rule' kw= ';'
            {
            kw=(Token)match(input,18,FollowSets000.FOLLOW_6); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDatatypeRuleAccess().getRuleKeyword_0()); 
                
            kw=(Token)match(input,10,FollowSets000.FOLLOW_2); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDatatypeRuleAccess().getSemicolonKeyword_1()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleDatatypeRule"


    // $ANTLR start "entryRuleHidingHiddens"
    // InternalHiddenTerminalsTestLanguage.g:604:1: entryRuleHidingHiddens returns [EObject current=null] : iv_ruleHidingHiddens= ruleHidingHiddens EOF ;
    public final EObject entryRuleHidingHiddens() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHidingHiddens = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // InternalHiddenTerminalsTestLanguage.g:608:2: (iv_ruleHidingHiddens= ruleHidingHiddens EOF )
            // InternalHiddenTerminalsTestLanguage.g:609:2: iv_ruleHidingHiddens= ruleHidingHiddens EOF
            {
             newCompositeNode(grammarAccess.getHidingHiddensRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleHidingHiddens=ruleHidingHiddens();

            state._fsp--;

             current =iv_ruleHidingHiddens; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleHidingHiddens"


    // $ANTLR start "ruleHidingHiddens"
    // InternalHiddenTerminalsTestLanguage.g:619:1: ruleHidingHiddens returns [EObject current=null] : (otherlv_0= 'hiding' ( (lv_space_1_0= RULE_WS ) ) ( (lv_called_2_0= ruleInheritingHiddensCall ) ) ) ;
    public final EObject ruleHidingHiddens() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_space_1_0=null;
        EObject lv_called_2_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // InternalHiddenTerminalsTestLanguage.g:623:28: ( (otherlv_0= 'hiding' ( (lv_space_1_0= RULE_WS ) ) ( (lv_called_2_0= ruleInheritingHiddensCall ) ) ) )
            // InternalHiddenTerminalsTestLanguage.g:624:1: (otherlv_0= 'hiding' ( (lv_space_1_0= RULE_WS ) ) ( (lv_called_2_0= ruleInheritingHiddensCall ) ) )
            {
            // InternalHiddenTerminalsTestLanguage.g:624:1: (otherlv_0= 'hiding' ( (lv_space_1_0= RULE_WS ) ) ( (lv_called_2_0= ruleInheritingHiddensCall ) ) )
            // InternalHiddenTerminalsTestLanguage.g:624:3: otherlv_0= 'hiding' ( (lv_space_1_0= RULE_WS ) ) ( (lv_called_2_0= ruleInheritingHiddensCall ) )
            {
            otherlv_0=(Token)match(input,19,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getHidingHiddensAccess().getHidingKeyword_0());
                
            // InternalHiddenTerminalsTestLanguage.g:628:1: ( (lv_space_1_0= RULE_WS ) )
            // InternalHiddenTerminalsTestLanguage.g:629:1: (lv_space_1_0= RULE_WS )
            {
            // InternalHiddenTerminalsTestLanguage.g:629:1: (lv_space_1_0= RULE_WS )
            // InternalHiddenTerminalsTestLanguage.g:630:3: lv_space_1_0= RULE_WS
            {
            lv_space_1_0=(Token)match(input,RULE_WS,FollowSets000.FOLLOW_8); 

            			newLeafNode(lv_space_1_0, grammarAccess.getHidingHiddensAccess().getSpaceWSTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHidingHiddensRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"space",
                    		lv_space_1_0, 
                    		"org.eclipse.xtext.parser.terminalrules.HiddenTerminalsTestLanguage.WS");
            	    

            }


            }

            // InternalHiddenTerminalsTestLanguage.g:646:2: ( (lv_called_2_0= ruleInheritingHiddensCall ) )
            // InternalHiddenTerminalsTestLanguage.g:647:1: (lv_called_2_0= ruleInheritingHiddensCall )
            {
            // InternalHiddenTerminalsTestLanguage.g:647:1: (lv_called_2_0= ruleInheritingHiddensCall )
            // InternalHiddenTerminalsTestLanguage.g:648:3: lv_called_2_0= ruleInheritingHiddensCall
            {
             
            	        newCompositeNode(grammarAccess.getHidingHiddensAccess().getCalledInheritingHiddensCallParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_2);
            lv_called_2_0=ruleInheritingHiddensCall();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getHidingHiddensRule());
            	        }
                   		set(
                   			current, 
                   			"called",
                    		lv_called_2_0, 
                    		"org.eclipse.xtext.parser.terminalrules.HiddenTerminalsTestLanguage.InheritingHiddensCall");
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleHidingHiddens"


    // $ANTLR start "entryRuleInheritingHiddensCall"
    // InternalHiddenTerminalsTestLanguage.g:675:1: entryRuleInheritingHiddensCall returns [EObject current=null] : iv_ruleInheritingHiddensCall= ruleInheritingHiddensCall EOF ;
    public final EObject entryRuleInheritingHiddensCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInheritingHiddensCall = null;


        try {
            // InternalHiddenTerminalsTestLanguage.g:676:2: (iv_ruleInheritingHiddensCall= ruleInheritingHiddensCall EOF )
            // InternalHiddenTerminalsTestLanguage.g:677:2: iv_ruleInheritingHiddensCall= ruleInheritingHiddensCall EOF
            {
             newCompositeNode(grammarAccess.getInheritingHiddensCallRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleInheritingHiddensCall=ruleInheritingHiddensCall();

            state._fsp--;

             current =iv_ruleInheritingHiddensCall; 
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
    // $ANTLR end "entryRuleInheritingHiddensCall"


    // $ANTLR start "ruleInheritingHiddensCall"
    // InternalHiddenTerminalsTestLanguage.g:684:1: ruleInheritingHiddensCall returns [EObject current=null] : (otherlv_0= 'call' ( (lv_valid_1_0= ';' ) ) ) ;
    public final EObject ruleInheritingHiddensCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_valid_1_0=null;

         enterRule(); 
            
        try {
            // InternalHiddenTerminalsTestLanguage.g:687:28: ( (otherlv_0= 'call' ( (lv_valid_1_0= ';' ) ) ) )
            // InternalHiddenTerminalsTestLanguage.g:688:1: (otherlv_0= 'call' ( (lv_valid_1_0= ';' ) ) )
            {
            // InternalHiddenTerminalsTestLanguage.g:688:1: (otherlv_0= 'call' ( (lv_valid_1_0= ';' ) ) )
            // InternalHiddenTerminalsTestLanguage.g:688:3: otherlv_0= 'call' ( (lv_valid_1_0= ';' ) )
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_6); 

                	newLeafNode(otherlv_0, grammarAccess.getInheritingHiddensCallAccess().getCallKeyword_0());
                
            // InternalHiddenTerminalsTestLanguage.g:692:1: ( (lv_valid_1_0= ';' ) )
            // InternalHiddenTerminalsTestLanguage.g:693:1: (lv_valid_1_0= ';' )
            {
            // InternalHiddenTerminalsTestLanguage.g:693:1: (lv_valid_1_0= ';' )
            // InternalHiddenTerminalsTestLanguage.g:694:3: lv_valid_1_0= ';'
            {
            lv_valid_1_0=(Token)match(input,10,FollowSets000.FOLLOW_2); 

                    newLeafNode(lv_valid_1_0, grammarAccess.getInheritingHiddensCallAccess().getValidSemicolonKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInheritingHiddensCallRule());
            	        }
                   		setWithLastConsumed(current, "valid", true, ";");
            	    

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
    // $ANTLR end "ruleInheritingHiddensCall"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000410L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000400L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000088000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    }


}