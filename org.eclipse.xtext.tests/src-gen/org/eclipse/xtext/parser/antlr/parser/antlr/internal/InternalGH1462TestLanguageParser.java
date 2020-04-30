package org.eclipse.xtext.parser.antlr.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.parser.antlr.services.GH1462TestLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGH1462TestLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'#1'", "'#2'", "'#3'", "'#4'", "'#5'", "'#6'", "'#7'", "'#8'", "'#9'", "'#10'", "'#11'", "'s'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=4;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalGH1462TestLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGH1462TestLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGH1462TestLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGH1462TestLanguage.g"; }



     	private GH1462TestLanguageGrammarAccess grammarAccess;

        public InternalGH1462TestLanguageParser(TokenStream input, GH1462TestLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Root";
       	}

       	@Override
       	protected GH1462TestLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRoot"
    // InternalGH1462TestLanguage.g:64:1: entryRuleRoot returns [EObject current=null] : iv_ruleRoot= ruleRoot EOF ;
    public final EObject entryRuleRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoot = null;


        try {
            // InternalGH1462TestLanguage.g:64:45: (iv_ruleRoot= ruleRoot EOF )
            // InternalGH1462TestLanguage.g:65:2: iv_ruleRoot= ruleRoot EOF
            {
             newCompositeNode(grammarAccess.getRootRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRoot=ruleRoot();

            state._fsp--;

             current =iv_ruleRoot; 
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
    // $ANTLR end "entryRuleRoot"


    // $ANTLR start "ruleRoot"
    // InternalGH1462TestLanguage.g:71:1: ruleRoot returns [EObject current=null] : ( (otherlv_0= '#1' ( (lv_element_1_0= ruleRule1 ) ) ) | (otherlv_2= '#2' ( (lv_element_3_0= ruleRule2 ) ) ) | (otherlv_4= '#3' ( (lv_element_5_0= ruleRule3 ) ) ) | (otherlv_6= '#4' ( (lv_element_7_0= ruleRule4 ) ) ) | (otherlv_8= '#5' ( (lv_element_9_0= ruleRule5 ) ) ) | (otherlv_10= '#6' ( (lv_element_11_0= ruleRule6 ) ) ) | (otherlv_12= '#7' ( (lv_element_13_0= ruleRule7 ) ) ) | (otherlv_14= '#8' ( (lv_element_15_0= ruleRule8 ) ) ) | (otherlv_16= '#9' ( (lv_element_17_0= ruleRule9 ) ) ) | (otherlv_18= '#10' ( (lv_element_19_0= ruleRule10 ) ) ) | (otherlv_20= '#11' ( (lv_element_21_0= ruleRule11 ) ) ) ) ;
    public final EObject ruleRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        EObject lv_element_1_0 = null;

        EObject lv_element_3_0 = null;

        EObject lv_element_5_0 = null;

        EObject lv_element_7_0 = null;

        EObject lv_element_9_0 = null;

        EObject lv_element_11_0 = null;

        EObject lv_element_13_0 = null;

        EObject lv_element_15_0 = null;

        EObject lv_element_17_0 = null;

        EObject lv_element_19_0 = null;

        EObject lv_element_21_0 = null;



        	enterRule();

        try {
            // InternalGH1462TestLanguage.g:77:2: ( ( (otherlv_0= '#1' ( (lv_element_1_0= ruleRule1 ) ) ) | (otherlv_2= '#2' ( (lv_element_3_0= ruleRule2 ) ) ) | (otherlv_4= '#3' ( (lv_element_5_0= ruleRule3 ) ) ) | (otherlv_6= '#4' ( (lv_element_7_0= ruleRule4 ) ) ) | (otherlv_8= '#5' ( (lv_element_9_0= ruleRule5 ) ) ) | (otherlv_10= '#6' ( (lv_element_11_0= ruleRule6 ) ) ) | (otherlv_12= '#7' ( (lv_element_13_0= ruleRule7 ) ) ) | (otherlv_14= '#8' ( (lv_element_15_0= ruleRule8 ) ) ) | (otherlv_16= '#9' ( (lv_element_17_0= ruleRule9 ) ) ) | (otherlv_18= '#10' ( (lv_element_19_0= ruleRule10 ) ) ) | (otherlv_20= '#11' ( (lv_element_21_0= ruleRule11 ) ) ) ) )
            // InternalGH1462TestLanguage.g:78:2: ( (otherlv_0= '#1' ( (lv_element_1_0= ruleRule1 ) ) ) | (otherlv_2= '#2' ( (lv_element_3_0= ruleRule2 ) ) ) | (otherlv_4= '#3' ( (lv_element_5_0= ruleRule3 ) ) ) | (otherlv_6= '#4' ( (lv_element_7_0= ruleRule4 ) ) ) | (otherlv_8= '#5' ( (lv_element_9_0= ruleRule5 ) ) ) | (otherlv_10= '#6' ( (lv_element_11_0= ruleRule6 ) ) ) | (otherlv_12= '#7' ( (lv_element_13_0= ruleRule7 ) ) ) | (otherlv_14= '#8' ( (lv_element_15_0= ruleRule8 ) ) ) | (otherlv_16= '#9' ( (lv_element_17_0= ruleRule9 ) ) ) | (otherlv_18= '#10' ( (lv_element_19_0= ruleRule10 ) ) ) | (otherlv_20= '#11' ( (lv_element_21_0= ruleRule11 ) ) ) )
            {
            // InternalGH1462TestLanguage.g:78:2: ( (otherlv_0= '#1' ( (lv_element_1_0= ruleRule1 ) ) ) | (otherlv_2= '#2' ( (lv_element_3_0= ruleRule2 ) ) ) | (otherlv_4= '#3' ( (lv_element_5_0= ruleRule3 ) ) ) | (otherlv_6= '#4' ( (lv_element_7_0= ruleRule4 ) ) ) | (otherlv_8= '#5' ( (lv_element_9_0= ruleRule5 ) ) ) | (otherlv_10= '#6' ( (lv_element_11_0= ruleRule6 ) ) ) | (otherlv_12= '#7' ( (lv_element_13_0= ruleRule7 ) ) ) | (otherlv_14= '#8' ( (lv_element_15_0= ruleRule8 ) ) ) | (otherlv_16= '#9' ( (lv_element_17_0= ruleRule9 ) ) ) | (otherlv_18= '#10' ( (lv_element_19_0= ruleRule10 ) ) ) | (otherlv_20= '#11' ( (lv_element_21_0= ruleRule11 ) ) ) )
            int alt1=11;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            case 13:
                {
                alt1=3;
                }
                break;
            case 14:
                {
                alt1=4;
                }
                break;
            case 15:
                {
                alt1=5;
                }
                break;
            case 16:
                {
                alt1=6;
                }
                break;
            case 17:
                {
                alt1=7;
                }
                break;
            case 18:
                {
                alt1=8;
                }
                break;
            case 19:
                {
                alt1=9;
                }
                break;
            case 20:
                {
                alt1=10;
                }
                break;
            case 21:
                {
                alt1=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalGH1462TestLanguage.g:79:3: (otherlv_0= '#1' ( (lv_element_1_0= ruleRule1 ) ) )
                    {
                    // InternalGH1462TestLanguage.g:79:3: (otherlv_0= '#1' ( (lv_element_1_0= ruleRule1 ) ) )
                    // InternalGH1462TestLanguage.g:80:4: otherlv_0= '#1' ( (lv_element_1_0= ruleRule1 ) )
                    {
                    otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getRootAccess().getNumberSignDigitOneKeyword_0_0());
                    			
                    // InternalGH1462TestLanguage.g:84:4: ( (lv_element_1_0= ruleRule1 ) )
                    // InternalGH1462TestLanguage.g:85:5: (lv_element_1_0= ruleRule1 )
                    {
                    // InternalGH1462TestLanguage.g:85:5: (lv_element_1_0= ruleRule1 )
                    // InternalGH1462TestLanguage.g:86:6: lv_element_1_0= ruleRule1
                    {

                    						newCompositeNode(grammarAccess.getRootAccess().getElementRule1ParserRuleCall_0_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_element_1_0=ruleRule1();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRootRule());
                    						}
                    						set(
                    							current,
                    							"element",
                    							lv_element_1_0,
                    							"org.eclipse.xtext.parser.antlr.GH1462TestLanguage.Rule1");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGH1462TestLanguage.g:105:3: (otherlv_2= '#2' ( (lv_element_3_0= ruleRule2 ) ) )
                    {
                    // InternalGH1462TestLanguage.g:105:3: (otherlv_2= '#2' ( (lv_element_3_0= ruleRule2 ) ) )
                    // InternalGH1462TestLanguage.g:106:4: otherlv_2= '#2' ( (lv_element_3_0= ruleRule2 ) )
                    {
                    otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getRootAccess().getNumberSignDigitTwoKeyword_1_0());
                    			
                    // InternalGH1462TestLanguage.g:110:4: ( (lv_element_3_0= ruleRule2 ) )
                    // InternalGH1462TestLanguage.g:111:5: (lv_element_3_0= ruleRule2 )
                    {
                    // InternalGH1462TestLanguage.g:111:5: (lv_element_3_0= ruleRule2 )
                    // InternalGH1462TestLanguage.g:112:6: lv_element_3_0= ruleRule2
                    {

                    						newCompositeNode(grammarAccess.getRootAccess().getElementRule2ParserRuleCall_1_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_element_3_0=ruleRule2();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRootRule());
                    						}
                    						set(
                    							current,
                    							"element",
                    							lv_element_3_0,
                    							"org.eclipse.xtext.parser.antlr.GH1462TestLanguage.Rule2");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalGH1462TestLanguage.g:131:3: (otherlv_4= '#3' ( (lv_element_5_0= ruleRule3 ) ) )
                    {
                    // InternalGH1462TestLanguage.g:131:3: (otherlv_4= '#3' ( (lv_element_5_0= ruleRule3 ) ) )
                    // InternalGH1462TestLanguage.g:132:4: otherlv_4= '#3' ( (lv_element_5_0= ruleRule3 ) )
                    {
                    otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getRootAccess().getNumberSignDigitThreeKeyword_2_0());
                    			
                    // InternalGH1462TestLanguage.g:136:4: ( (lv_element_5_0= ruleRule3 ) )
                    // InternalGH1462TestLanguage.g:137:5: (lv_element_5_0= ruleRule3 )
                    {
                    // InternalGH1462TestLanguage.g:137:5: (lv_element_5_0= ruleRule3 )
                    // InternalGH1462TestLanguage.g:138:6: lv_element_5_0= ruleRule3
                    {

                    						newCompositeNode(grammarAccess.getRootAccess().getElementRule3ParserRuleCall_2_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_element_5_0=ruleRule3();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRootRule());
                    						}
                    						set(
                    							current,
                    							"element",
                    							lv_element_5_0,
                    							"org.eclipse.xtext.parser.antlr.GH1462TestLanguage.Rule3");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalGH1462TestLanguage.g:157:3: (otherlv_6= '#4' ( (lv_element_7_0= ruleRule4 ) ) )
                    {
                    // InternalGH1462TestLanguage.g:157:3: (otherlv_6= '#4' ( (lv_element_7_0= ruleRule4 ) ) )
                    // InternalGH1462TestLanguage.g:158:4: otherlv_6= '#4' ( (lv_element_7_0= ruleRule4 ) )
                    {
                    otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getRootAccess().getNumberSignDigitFourKeyword_3_0());
                    			
                    // InternalGH1462TestLanguage.g:162:4: ( (lv_element_7_0= ruleRule4 ) )
                    // InternalGH1462TestLanguage.g:163:5: (lv_element_7_0= ruleRule4 )
                    {
                    // InternalGH1462TestLanguage.g:163:5: (lv_element_7_0= ruleRule4 )
                    // InternalGH1462TestLanguage.g:164:6: lv_element_7_0= ruleRule4
                    {

                    						newCompositeNode(grammarAccess.getRootAccess().getElementRule4ParserRuleCall_3_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_element_7_0=ruleRule4();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRootRule());
                    						}
                    						set(
                    							current,
                    							"element",
                    							lv_element_7_0,
                    							"org.eclipse.xtext.parser.antlr.GH1462TestLanguage.Rule4");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalGH1462TestLanguage.g:183:3: (otherlv_8= '#5' ( (lv_element_9_0= ruleRule5 ) ) )
                    {
                    // InternalGH1462TestLanguage.g:183:3: (otherlv_8= '#5' ( (lv_element_9_0= ruleRule5 ) ) )
                    // InternalGH1462TestLanguage.g:184:4: otherlv_8= '#5' ( (lv_element_9_0= ruleRule5 ) )
                    {
                    otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getRootAccess().getNumberSignDigitFiveKeyword_4_0());
                    			
                    // InternalGH1462TestLanguage.g:188:4: ( (lv_element_9_0= ruleRule5 ) )
                    // InternalGH1462TestLanguage.g:189:5: (lv_element_9_0= ruleRule5 )
                    {
                    // InternalGH1462TestLanguage.g:189:5: (lv_element_9_0= ruleRule5 )
                    // InternalGH1462TestLanguage.g:190:6: lv_element_9_0= ruleRule5
                    {

                    						newCompositeNode(grammarAccess.getRootAccess().getElementRule5ParserRuleCall_4_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_element_9_0=ruleRule5();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRootRule());
                    						}
                    						set(
                    							current,
                    							"element",
                    							lv_element_9_0,
                    							"org.eclipse.xtext.parser.antlr.GH1462TestLanguage.Rule5");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalGH1462TestLanguage.g:209:3: (otherlv_10= '#6' ( (lv_element_11_0= ruleRule6 ) ) )
                    {
                    // InternalGH1462TestLanguage.g:209:3: (otherlv_10= '#6' ( (lv_element_11_0= ruleRule6 ) ) )
                    // InternalGH1462TestLanguage.g:210:4: otherlv_10= '#6' ( (lv_element_11_0= ruleRule6 ) )
                    {
                    otherlv_10=(Token)match(input,16,FollowSets000.FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getRootAccess().getNumberSignDigitSixKeyword_5_0());
                    			
                    // InternalGH1462TestLanguage.g:214:4: ( (lv_element_11_0= ruleRule6 ) )
                    // InternalGH1462TestLanguage.g:215:5: (lv_element_11_0= ruleRule6 )
                    {
                    // InternalGH1462TestLanguage.g:215:5: (lv_element_11_0= ruleRule6 )
                    // InternalGH1462TestLanguage.g:216:6: lv_element_11_0= ruleRule6
                    {

                    						newCompositeNode(grammarAccess.getRootAccess().getElementRule6ParserRuleCall_5_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_element_11_0=ruleRule6();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRootRule());
                    						}
                    						set(
                    							current,
                    							"element",
                    							lv_element_11_0,
                    							"org.eclipse.xtext.parser.antlr.GH1462TestLanguage.Rule6");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalGH1462TestLanguage.g:235:3: (otherlv_12= '#7' ( (lv_element_13_0= ruleRule7 ) ) )
                    {
                    // InternalGH1462TestLanguage.g:235:3: (otherlv_12= '#7' ( (lv_element_13_0= ruleRule7 ) ) )
                    // InternalGH1462TestLanguage.g:236:4: otherlv_12= '#7' ( (lv_element_13_0= ruleRule7 ) )
                    {
                    otherlv_12=(Token)match(input,17,FollowSets000.FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getRootAccess().getNumberSignDigitSevenKeyword_6_0());
                    			
                    // InternalGH1462TestLanguage.g:240:4: ( (lv_element_13_0= ruleRule7 ) )
                    // InternalGH1462TestLanguage.g:241:5: (lv_element_13_0= ruleRule7 )
                    {
                    // InternalGH1462TestLanguage.g:241:5: (lv_element_13_0= ruleRule7 )
                    // InternalGH1462TestLanguage.g:242:6: lv_element_13_0= ruleRule7
                    {

                    						newCompositeNode(grammarAccess.getRootAccess().getElementRule7ParserRuleCall_6_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_element_13_0=ruleRule7();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRootRule());
                    						}
                    						set(
                    							current,
                    							"element",
                    							lv_element_13_0,
                    							"org.eclipse.xtext.parser.antlr.GH1462TestLanguage.Rule7");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalGH1462TestLanguage.g:261:3: (otherlv_14= '#8' ( (lv_element_15_0= ruleRule8 ) ) )
                    {
                    // InternalGH1462TestLanguage.g:261:3: (otherlv_14= '#8' ( (lv_element_15_0= ruleRule8 ) ) )
                    // InternalGH1462TestLanguage.g:262:4: otherlv_14= '#8' ( (lv_element_15_0= ruleRule8 ) )
                    {
                    otherlv_14=(Token)match(input,18,FollowSets000.FOLLOW_3); 

                    				newLeafNode(otherlv_14, grammarAccess.getRootAccess().getNumberSignDigitEightKeyword_7_0());
                    			
                    // InternalGH1462TestLanguage.g:266:4: ( (lv_element_15_0= ruleRule8 ) )
                    // InternalGH1462TestLanguage.g:267:5: (lv_element_15_0= ruleRule8 )
                    {
                    // InternalGH1462TestLanguage.g:267:5: (lv_element_15_0= ruleRule8 )
                    // InternalGH1462TestLanguage.g:268:6: lv_element_15_0= ruleRule8
                    {

                    						newCompositeNode(grammarAccess.getRootAccess().getElementRule8ParserRuleCall_7_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_element_15_0=ruleRule8();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRootRule());
                    						}
                    						set(
                    							current,
                    							"element",
                    							lv_element_15_0,
                    							"org.eclipse.xtext.parser.antlr.GH1462TestLanguage.Rule8");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 9 :
                    // InternalGH1462TestLanguage.g:287:3: (otherlv_16= '#9' ( (lv_element_17_0= ruleRule9 ) ) )
                    {
                    // InternalGH1462TestLanguage.g:287:3: (otherlv_16= '#9' ( (lv_element_17_0= ruleRule9 ) ) )
                    // InternalGH1462TestLanguage.g:288:4: otherlv_16= '#9' ( (lv_element_17_0= ruleRule9 ) )
                    {
                    otherlv_16=(Token)match(input,19,FollowSets000.FOLLOW_3); 

                    				newLeafNode(otherlv_16, grammarAccess.getRootAccess().getNumberSignDigitNineKeyword_8_0());
                    			
                    // InternalGH1462TestLanguage.g:292:4: ( (lv_element_17_0= ruleRule9 ) )
                    // InternalGH1462TestLanguage.g:293:5: (lv_element_17_0= ruleRule9 )
                    {
                    // InternalGH1462TestLanguage.g:293:5: (lv_element_17_0= ruleRule9 )
                    // InternalGH1462TestLanguage.g:294:6: lv_element_17_0= ruleRule9
                    {

                    						newCompositeNode(grammarAccess.getRootAccess().getElementRule9ParserRuleCall_8_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_element_17_0=ruleRule9();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRootRule());
                    						}
                    						set(
                    							current,
                    							"element",
                    							lv_element_17_0,
                    							"org.eclipse.xtext.parser.antlr.GH1462TestLanguage.Rule9");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 10 :
                    // InternalGH1462TestLanguage.g:313:3: (otherlv_18= '#10' ( (lv_element_19_0= ruleRule10 ) ) )
                    {
                    // InternalGH1462TestLanguage.g:313:3: (otherlv_18= '#10' ( (lv_element_19_0= ruleRule10 ) ) )
                    // InternalGH1462TestLanguage.g:314:4: otherlv_18= '#10' ( (lv_element_19_0= ruleRule10 ) )
                    {
                    otherlv_18=(Token)match(input,20,FollowSets000.FOLLOW_3); 

                    				newLeafNode(otherlv_18, grammarAccess.getRootAccess().getNumberSignDigitOneDigitZeroKeyword_9_0());
                    			
                    // InternalGH1462TestLanguage.g:318:4: ( (lv_element_19_0= ruleRule10 ) )
                    // InternalGH1462TestLanguage.g:319:5: (lv_element_19_0= ruleRule10 )
                    {
                    // InternalGH1462TestLanguage.g:319:5: (lv_element_19_0= ruleRule10 )
                    // InternalGH1462TestLanguage.g:320:6: lv_element_19_0= ruleRule10
                    {

                    						newCompositeNode(grammarAccess.getRootAccess().getElementRule10ParserRuleCall_9_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_element_19_0=ruleRule10();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRootRule());
                    						}
                    						set(
                    							current,
                    							"element",
                    							lv_element_19_0,
                    							"org.eclipse.xtext.parser.antlr.GH1462TestLanguage.Rule10");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 11 :
                    // InternalGH1462TestLanguage.g:339:3: (otherlv_20= '#11' ( (lv_element_21_0= ruleRule11 ) ) )
                    {
                    // InternalGH1462TestLanguage.g:339:3: (otherlv_20= '#11' ( (lv_element_21_0= ruleRule11 ) ) )
                    // InternalGH1462TestLanguage.g:340:4: otherlv_20= '#11' ( (lv_element_21_0= ruleRule11 ) )
                    {
                    otherlv_20=(Token)match(input,21,FollowSets000.FOLLOW_3); 

                    				newLeafNode(otherlv_20, grammarAccess.getRootAccess().getNumberSignDigitOneDigitOneKeyword_10_0());
                    			
                    // InternalGH1462TestLanguage.g:344:4: ( (lv_element_21_0= ruleRule11 ) )
                    // InternalGH1462TestLanguage.g:345:5: (lv_element_21_0= ruleRule11 )
                    {
                    // InternalGH1462TestLanguage.g:345:5: (lv_element_21_0= ruleRule11 )
                    // InternalGH1462TestLanguage.g:346:6: lv_element_21_0= ruleRule11
                    {

                    						newCompositeNode(grammarAccess.getRootAccess().getElementRule11ParserRuleCall_10_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_element_21_0=ruleRule11();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRootRule());
                    						}
                    						set(
                    							current,
                    							"element",
                    							lv_element_21_0,
                    							"org.eclipse.xtext.parser.antlr.GH1462TestLanguage.Rule11");
                    						afterParserOrEnumRuleCall();
                    					

                    }


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
    // $ANTLR end "ruleRoot"


    // $ANTLR start "entryRuleRule1"
    // InternalGH1462TestLanguage.g:368:1: entryRuleRule1 returns [EObject current=null] : iv_ruleRule1= ruleRule1 EOF ;
    public final EObject entryRuleRule1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule1 = null;


        try {
            // InternalGH1462TestLanguage.g:368:46: (iv_ruleRule1= ruleRule1 EOF )
            // InternalGH1462TestLanguage.g:369:2: iv_ruleRule1= ruleRule1 EOF
            {
             newCompositeNode(grammarAccess.getRule1Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRule1=ruleRule1();

            state._fsp--;

             current =iv_ruleRule1; 
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
    // $ANTLR end "entryRuleRule1"


    // $ANTLR start "ruleRule1"
    // InternalGH1462TestLanguage.g:375:1: ruleRule1 returns [EObject current=null] : ( ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= RULE_INT ) ) ( (lv_unit_2_0= 's' ) ) ) ;
    public final EObject ruleRule1() throws RecognitionException {
        EObject current = null;

        Token lv_left_0_0=null;
        Token lv_right_1_0=null;
        Token lv_unit_2_0=null;


        	enterRule();

        try {
            // InternalGH1462TestLanguage.g:381:2: ( ( ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= RULE_INT ) ) ( (lv_unit_2_0= 's' ) ) ) )
            // InternalGH1462TestLanguage.g:382:2: ( ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= RULE_INT ) ) ( (lv_unit_2_0= 's' ) ) )
            {
            // InternalGH1462TestLanguage.g:382:2: ( ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= RULE_INT ) ) ( (lv_unit_2_0= 's' ) ) )
            // InternalGH1462TestLanguage.g:383:3: ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= RULE_INT ) ) ( (lv_unit_2_0= 's' ) )
            {
            // InternalGH1462TestLanguage.g:383:3: ( (lv_left_0_0= RULE_INT ) )
            // InternalGH1462TestLanguage.g:384:4: (lv_left_0_0= RULE_INT )
            {
            // InternalGH1462TestLanguage.g:384:4: (lv_left_0_0= RULE_INT )
            // InternalGH1462TestLanguage.g:385:5: lv_left_0_0= RULE_INT
            {
            lv_left_0_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_3); 

            					newLeafNode(lv_left_0_0, grammarAccess.getRule1Access().getLeftINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRule1Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"left",
            						lv_left_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalGH1462TestLanguage.g:401:3: ( (lv_right_1_0= RULE_INT ) )
            // InternalGH1462TestLanguage.g:402:4: (lv_right_1_0= RULE_INT )
            {
            // InternalGH1462TestLanguage.g:402:4: (lv_right_1_0= RULE_INT )
            // InternalGH1462TestLanguage.g:403:5: lv_right_1_0= RULE_INT
            {
            lv_right_1_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_6); 

            					newLeafNode(lv_right_1_0, grammarAccess.getRule1Access().getRightINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRule1Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"right",
            						lv_right_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalGH1462TestLanguage.g:419:3: ( (lv_unit_2_0= 's' ) )
            // InternalGH1462TestLanguage.g:420:4: (lv_unit_2_0= 's' )
            {
            // InternalGH1462TestLanguage.g:420:4: (lv_unit_2_0= 's' )
            // InternalGH1462TestLanguage.g:421:5: lv_unit_2_0= 's'
            {
            lv_unit_2_0=(Token)match(input,22,FollowSets000.FOLLOW_2); 

            					newLeafNode(lv_unit_2_0, grammarAccess.getRule1Access().getUnitSKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRule1Rule());
            					}
            					setWithLastConsumed(current, "unit", lv_unit_2_0, "s");
            				

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
    // $ANTLR end "ruleRule1"


    // $ANTLR start "entryRuleRule2"
    // InternalGH1462TestLanguage.g:437:1: entryRuleRule2 returns [EObject current=null] : iv_ruleRule2= ruleRule2 EOF ;
    public final EObject entryRuleRule2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule2 = null;


        try {
            // InternalGH1462TestLanguage.g:437:46: (iv_ruleRule2= ruleRule2 EOF )
            // InternalGH1462TestLanguage.g:438:2: iv_ruleRule2= ruleRule2 EOF
            {
             newCompositeNode(grammarAccess.getRule2Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRule2=ruleRule2();

            state._fsp--;

             current =iv_ruleRule2; 
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
    // $ANTLR end "entryRuleRule2"


    // $ANTLR start "ruleRule2"
    // InternalGH1462TestLanguage.g:444:1: ruleRule2 returns [EObject current=null] : (this_INT_0= RULE_INT ( (lv_value_1_0= RULE_INT ) ) ( (lv_unit_2_0= 's' ) ) ) ;
    public final EObject ruleRule2() throws RecognitionException {
        EObject current = null;

        Token this_INT_0=null;
        Token lv_value_1_0=null;
        Token lv_unit_2_0=null;


        	enterRule();

        try {
            // InternalGH1462TestLanguage.g:450:2: ( (this_INT_0= RULE_INT ( (lv_value_1_0= RULE_INT ) ) ( (lv_unit_2_0= 's' ) ) ) )
            // InternalGH1462TestLanguage.g:451:2: (this_INT_0= RULE_INT ( (lv_value_1_0= RULE_INT ) ) ( (lv_unit_2_0= 's' ) ) )
            {
            // InternalGH1462TestLanguage.g:451:2: (this_INT_0= RULE_INT ( (lv_value_1_0= RULE_INT ) ) ( (lv_unit_2_0= 's' ) ) )
            // InternalGH1462TestLanguage.g:452:3: this_INT_0= RULE_INT ( (lv_value_1_0= RULE_INT ) ) ( (lv_unit_2_0= 's' ) )
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_3); 

            			newLeafNode(this_INT_0, grammarAccess.getRule2Access().getINTTerminalRuleCall_0());
            		
            // InternalGH1462TestLanguage.g:456:3: ( (lv_value_1_0= RULE_INT ) )
            // InternalGH1462TestLanguage.g:457:4: (lv_value_1_0= RULE_INT )
            {
            // InternalGH1462TestLanguage.g:457:4: (lv_value_1_0= RULE_INT )
            // InternalGH1462TestLanguage.g:458:5: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_6); 

            					newLeafNode(lv_value_1_0, grammarAccess.getRule2Access().getValueINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRule2Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalGH1462TestLanguage.g:474:3: ( (lv_unit_2_0= 's' ) )
            // InternalGH1462TestLanguage.g:475:4: (lv_unit_2_0= 's' )
            {
            // InternalGH1462TestLanguage.g:475:4: (lv_unit_2_0= 's' )
            // InternalGH1462TestLanguage.g:476:5: lv_unit_2_0= 's'
            {
            lv_unit_2_0=(Token)match(input,22,FollowSets000.FOLLOW_2); 

            					newLeafNode(lv_unit_2_0, grammarAccess.getRule2Access().getUnitSKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRule2Rule());
            					}
            					setWithLastConsumed(current, "unit", lv_unit_2_0, "s");
            				

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
    // $ANTLR end "ruleRule2"


    // $ANTLR start "entryRuleRule3"
    // InternalGH1462TestLanguage.g:492:1: entryRuleRule3 returns [EObject current=null] : iv_ruleRule3= ruleRule3 EOF ;
    public final EObject entryRuleRule3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule3 = null;


        try {
            // InternalGH1462TestLanguage.g:492:46: (iv_ruleRule3= ruleRule3 EOF )
            // InternalGH1462TestLanguage.g:493:2: iv_ruleRule3= ruleRule3 EOF
            {
             newCompositeNode(grammarAccess.getRule3Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRule3=ruleRule3();

            state._fsp--;

             current =iv_ruleRule3; 
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
    // $ANTLR end "entryRuleRule3"


    // $ANTLR start "ruleRule3"
    // InternalGH1462TestLanguage.g:499:1: ruleRule3 returns [EObject current=null] : ( ( (lv_left_0_0= RULE_ID ) ) ( (lv_right_1_0= RULE_STRING ) ) ( (lv_unit_2_0= 's' ) ) ) ;
    public final EObject ruleRule3() throws RecognitionException {
        EObject current = null;

        Token lv_left_0_0=null;
        Token lv_right_1_0=null;
        Token lv_unit_2_0=null;


        	enterRule();

        try {
            // InternalGH1462TestLanguage.g:505:2: ( ( ( (lv_left_0_0= RULE_ID ) ) ( (lv_right_1_0= RULE_STRING ) ) ( (lv_unit_2_0= 's' ) ) ) )
            // InternalGH1462TestLanguage.g:506:2: ( ( (lv_left_0_0= RULE_ID ) ) ( (lv_right_1_0= RULE_STRING ) ) ( (lv_unit_2_0= 's' ) ) )
            {
            // InternalGH1462TestLanguage.g:506:2: ( ( (lv_left_0_0= RULE_ID ) ) ( (lv_right_1_0= RULE_STRING ) ) ( (lv_unit_2_0= 's' ) ) )
            // InternalGH1462TestLanguage.g:507:3: ( (lv_left_0_0= RULE_ID ) ) ( (lv_right_1_0= RULE_STRING ) ) ( (lv_unit_2_0= 's' ) )
            {
            // InternalGH1462TestLanguage.g:507:3: ( (lv_left_0_0= RULE_ID ) )
            // InternalGH1462TestLanguage.g:508:4: (lv_left_0_0= RULE_ID )
            {
            // InternalGH1462TestLanguage.g:508:4: (lv_left_0_0= RULE_ID )
            // InternalGH1462TestLanguage.g:509:5: lv_left_0_0= RULE_ID
            {
            lv_left_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_5); 

            					newLeafNode(lv_left_0_0, grammarAccess.getRule3Access().getLeftIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRule3Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"left",
            						lv_left_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalGH1462TestLanguage.g:525:3: ( (lv_right_1_0= RULE_STRING ) )
            // InternalGH1462TestLanguage.g:526:4: (lv_right_1_0= RULE_STRING )
            {
            // InternalGH1462TestLanguage.g:526:4: (lv_right_1_0= RULE_STRING )
            // InternalGH1462TestLanguage.g:527:5: lv_right_1_0= RULE_STRING
            {
            lv_right_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); 

            					newLeafNode(lv_right_1_0, grammarAccess.getRule3Access().getRightSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRule3Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"right",
            						lv_right_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalGH1462TestLanguage.g:543:3: ( (lv_unit_2_0= 's' ) )
            // InternalGH1462TestLanguage.g:544:4: (lv_unit_2_0= 's' )
            {
            // InternalGH1462TestLanguage.g:544:4: (lv_unit_2_0= 's' )
            // InternalGH1462TestLanguage.g:545:5: lv_unit_2_0= 's'
            {
            lv_unit_2_0=(Token)match(input,22,FollowSets000.FOLLOW_2); 

            					newLeafNode(lv_unit_2_0, grammarAccess.getRule3Access().getUnitSKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRule3Rule());
            					}
            					setWithLastConsumed(current, "unit", lv_unit_2_0, "s");
            				

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
    // $ANTLR end "ruleRule3"


    // $ANTLR start "entryRuleRule4"
    // InternalGH1462TestLanguage.g:561:1: entryRuleRule4 returns [EObject current=null] : iv_ruleRule4= ruleRule4 EOF ;
    public final EObject entryRuleRule4() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule4 = null;


        try {
            // InternalGH1462TestLanguage.g:561:46: (iv_ruleRule4= ruleRule4 EOF )
            // InternalGH1462TestLanguage.g:562:2: iv_ruleRule4= ruleRule4 EOF
            {
             newCompositeNode(grammarAccess.getRule4Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRule4=ruleRule4();

            state._fsp--;

             current =iv_ruleRule4; 
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
    // $ANTLR end "entryRuleRule4"


    // $ANTLR start "ruleRule4"
    // InternalGH1462TestLanguage.g:568:1: ruleRule4 returns [EObject current=null] : ( ( (lv_left_0_0= RULE_STRING ) ) ( (lv_right_1_0= RULE_ID ) ) ( (lv_unit_2_0= 's' ) ) ) ;
    public final EObject ruleRule4() throws RecognitionException {
        EObject current = null;

        Token lv_left_0_0=null;
        Token lv_right_1_0=null;
        Token lv_unit_2_0=null;


        	enterRule();

        try {
            // InternalGH1462TestLanguage.g:574:2: ( ( ( (lv_left_0_0= RULE_STRING ) ) ( (lv_right_1_0= RULE_ID ) ) ( (lv_unit_2_0= 's' ) ) ) )
            // InternalGH1462TestLanguage.g:575:2: ( ( (lv_left_0_0= RULE_STRING ) ) ( (lv_right_1_0= RULE_ID ) ) ( (lv_unit_2_0= 's' ) ) )
            {
            // InternalGH1462TestLanguage.g:575:2: ( ( (lv_left_0_0= RULE_STRING ) ) ( (lv_right_1_0= RULE_ID ) ) ( (lv_unit_2_0= 's' ) ) )
            // InternalGH1462TestLanguage.g:576:3: ( (lv_left_0_0= RULE_STRING ) ) ( (lv_right_1_0= RULE_ID ) ) ( (lv_unit_2_0= 's' ) )
            {
            // InternalGH1462TestLanguage.g:576:3: ( (lv_left_0_0= RULE_STRING ) )
            // InternalGH1462TestLanguage.g:577:4: (lv_left_0_0= RULE_STRING )
            {
            // InternalGH1462TestLanguage.g:577:4: (lv_left_0_0= RULE_STRING )
            // InternalGH1462TestLanguage.g:578:5: lv_left_0_0= RULE_STRING
            {
            lv_left_0_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_4); 

            					newLeafNode(lv_left_0_0, grammarAccess.getRule4Access().getLeftSTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRule4Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"left",
            						lv_left_0_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalGH1462TestLanguage.g:594:3: ( (lv_right_1_0= RULE_ID ) )
            // InternalGH1462TestLanguage.g:595:4: (lv_right_1_0= RULE_ID )
            {
            // InternalGH1462TestLanguage.g:595:4: (lv_right_1_0= RULE_ID )
            // InternalGH1462TestLanguage.g:596:5: lv_right_1_0= RULE_ID
            {
            lv_right_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); 

            					newLeafNode(lv_right_1_0, grammarAccess.getRule4Access().getRightIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRule4Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"right",
            						lv_right_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalGH1462TestLanguage.g:612:3: ( (lv_unit_2_0= 's' ) )
            // InternalGH1462TestLanguage.g:613:4: (lv_unit_2_0= 's' )
            {
            // InternalGH1462TestLanguage.g:613:4: (lv_unit_2_0= 's' )
            // InternalGH1462TestLanguage.g:614:5: lv_unit_2_0= 's'
            {
            lv_unit_2_0=(Token)match(input,22,FollowSets000.FOLLOW_2); 

            					newLeafNode(lv_unit_2_0, grammarAccess.getRule4Access().getUnitSKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRule4Rule());
            					}
            					setWithLastConsumed(current, "unit", lv_unit_2_0, "s");
            				

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
    // $ANTLR end "ruleRule4"


    // $ANTLR start "entryRuleRule5"
    // InternalGH1462TestLanguage.g:630:1: entryRuleRule5 returns [EObject current=null] : iv_ruleRule5= ruleRule5 EOF ;
    public final EObject entryRuleRule5() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule5 = null;


        try {
            // InternalGH1462TestLanguage.g:630:46: (iv_ruleRule5= ruleRule5 EOF )
            // InternalGH1462TestLanguage.g:631:2: iv_ruleRule5= ruleRule5 EOF
            {
             newCompositeNode(grammarAccess.getRule5Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRule5=ruleRule5();

            state._fsp--;

             current =iv_ruleRule5; 
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
    // $ANTLR end "entryRuleRule5"


    // $ANTLR start "ruleRule5"
    // InternalGH1462TestLanguage.g:637:1: ruleRule5 returns [EObject current=null] : ( ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= ruleInteger ) ) ( (lv_unit_2_0= 's' ) ) ) ;
    public final EObject ruleRule5() throws RecognitionException {
        EObject current = null;

        Token lv_left_0_0=null;
        Token lv_unit_2_0=null;
        AntlrDatatypeRuleToken lv_right_1_0 = null;



        	enterRule();

        try {
            // InternalGH1462TestLanguage.g:643:2: ( ( ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= ruleInteger ) ) ( (lv_unit_2_0= 's' ) ) ) )
            // InternalGH1462TestLanguage.g:644:2: ( ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= ruleInteger ) ) ( (lv_unit_2_0= 's' ) ) )
            {
            // InternalGH1462TestLanguage.g:644:2: ( ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= ruleInteger ) ) ( (lv_unit_2_0= 's' ) ) )
            // InternalGH1462TestLanguage.g:645:3: ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= ruleInteger ) ) ( (lv_unit_2_0= 's' ) )
            {
            // InternalGH1462TestLanguage.g:645:3: ( (lv_left_0_0= RULE_INT ) )
            // InternalGH1462TestLanguage.g:646:4: (lv_left_0_0= RULE_INT )
            {
            // InternalGH1462TestLanguage.g:646:4: (lv_left_0_0= RULE_INT )
            // InternalGH1462TestLanguage.g:647:5: lv_left_0_0= RULE_INT
            {
            lv_left_0_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_3); 

            					newLeafNode(lv_left_0_0, grammarAccess.getRule5Access().getLeftINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRule5Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"left",
            						lv_left_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalGH1462TestLanguage.g:663:3: ( (lv_right_1_0= ruleInteger ) )
            // InternalGH1462TestLanguage.g:664:4: (lv_right_1_0= ruleInteger )
            {
            // InternalGH1462TestLanguage.g:664:4: (lv_right_1_0= ruleInteger )
            // InternalGH1462TestLanguage.g:665:5: lv_right_1_0= ruleInteger
            {

            					newCompositeNode(grammarAccess.getRule5Access().getRightIntegerParserRuleCall_1_0());
            				
            pushFollow(FollowSets000.FOLLOW_6);
            lv_right_1_0=ruleInteger();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRule5Rule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_1_0,
            						"org.eclipse.xtext.parser.antlr.GH1462TestLanguage.Integer");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGH1462TestLanguage.g:682:3: ( (lv_unit_2_0= 's' ) )
            // InternalGH1462TestLanguage.g:683:4: (lv_unit_2_0= 's' )
            {
            // InternalGH1462TestLanguage.g:683:4: (lv_unit_2_0= 's' )
            // InternalGH1462TestLanguage.g:684:5: lv_unit_2_0= 's'
            {
            lv_unit_2_0=(Token)match(input,22,FollowSets000.FOLLOW_2); 

            					newLeafNode(lv_unit_2_0, grammarAccess.getRule5Access().getUnitSKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRule5Rule());
            					}
            					setWithLastConsumed(current, "unit", lv_unit_2_0, "s");
            				

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
    // $ANTLR end "ruleRule5"


    // $ANTLR start "entryRuleRule6"
    // InternalGH1462TestLanguage.g:700:1: entryRuleRule6 returns [EObject current=null] : iv_ruleRule6= ruleRule6 EOF ;
    public final EObject entryRuleRule6() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule6 = null;


        try {
            // InternalGH1462TestLanguage.g:700:46: (iv_ruleRule6= ruleRule6 EOF )
            // InternalGH1462TestLanguage.g:701:2: iv_ruleRule6= ruleRule6 EOF
            {
             newCompositeNode(grammarAccess.getRule6Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRule6=ruleRule6();

            state._fsp--;

             current =iv_ruleRule6; 
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
    // $ANTLR end "entryRuleRule6"


    // $ANTLR start "ruleRule6"
    // InternalGH1462TestLanguage.g:707:1: ruleRule6 returns [EObject current=null] : ( ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= ruleWrapper ) ) ( (lv_unit_2_0= 's' ) ) ) ;
    public final EObject ruleRule6() throws RecognitionException {
        EObject current = null;

        Token lv_left_0_0=null;
        Token lv_unit_2_0=null;
        EObject lv_right_1_0 = null;



        	enterRule();

        try {
            // InternalGH1462TestLanguage.g:713:2: ( ( ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= ruleWrapper ) ) ( (lv_unit_2_0= 's' ) ) ) )
            // InternalGH1462TestLanguage.g:714:2: ( ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= ruleWrapper ) ) ( (lv_unit_2_0= 's' ) ) )
            {
            // InternalGH1462TestLanguage.g:714:2: ( ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= ruleWrapper ) ) ( (lv_unit_2_0= 's' ) ) )
            // InternalGH1462TestLanguage.g:715:3: ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= ruleWrapper ) ) ( (lv_unit_2_0= 's' ) )
            {
            // InternalGH1462TestLanguage.g:715:3: ( (lv_left_0_0= RULE_INT ) )
            // InternalGH1462TestLanguage.g:716:4: (lv_left_0_0= RULE_INT )
            {
            // InternalGH1462TestLanguage.g:716:4: (lv_left_0_0= RULE_INT )
            // InternalGH1462TestLanguage.g:717:5: lv_left_0_0= RULE_INT
            {
            lv_left_0_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_3); 

            					newLeafNode(lv_left_0_0, grammarAccess.getRule6Access().getLeftINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRule6Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"left",
            						lv_left_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalGH1462TestLanguage.g:733:3: ( (lv_right_1_0= ruleWrapper ) )
            // InternalGH1462TestLanguage.g:734:4: (lv_right_1_0= ruleWrapper )
            {
            // InternalGH1462TestLanguage.g:734:4: (lv_right_1_0= ruleWrapper )
            // InternalGH1462TestLanguage.g:735:5: lv_right_1_0= ruleWrapper
            {

            					newCompositeNode(grammarAccess.getRule6Access().getRightWrapperParserRuleCall_1_0());
            				
            pushFollow(FollowSets000.FOLLOW_6);
            lv_right_1_0=ruleWrapper();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRule6Rule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_1_0,
            						"org.eclipse.xtext.parser.antlr.GH1462TestLanguage.Wrapper");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGH1462TestLanguage.g:752:3: ( (lv_unit_2_0= 's' ) )
            // InternalGH1462TestLanguage.g:753:4: (lv_unit_2_0= 's' )
            {
            // InternalGH1462TestLanguage.g:753:4: (lv_unit_2_0= 's' )
            // InternalGH1462TestLanguage.g:754:5: lv_unit_2_0= 's'
            {
            lv_unit_2_0=(Token)match(input,22,FollowSets000.FOLLOW_2); 

            					newLeafNode(lv_unit_2_0, grammarAccess.getRule6Access().getUnitSKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRule6Rule());
            					}
            					setWithLastConsumed(current, "unit", lv_unit_2_0, "s");
            				

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
    // $ANTLR end "ruleRule6"


    // $ANTLR start "entryRuleRule7"
    // InternalGH1462TestLanguage.g:770:1: entryRuleRule7 returns [EObject current=null] : iv_ruleRule7= ruleRule7 EOF ;
    public final EObject entryRuleRule7() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule7 = null;


        try {
            // InternalGH1462TestLanguage.g:770:46: (iv_ruleRule7= ruleRule7 EOF )
            // InternalGH1462TestLanguage.g:771:2: iv_ruleRule7= ruleRule7 EOF
            {
             newCompositeNode(grammarAccess.getRule7Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRule7=ruleRule7();

            state._fsp--;

             current =iv_ruleRule7; 
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
    // $ANTLR end "entryRuleRule7"


    // $ANTLR start "ruleRule7"
    // InternalGH1462TestLanguage.g:777:1: ruleRule7 returns [EObject current=null] : ( ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= RULE_INT ) ) ( (lv_unit_2_0= 's' ) ) ) ;
    public final EObject ruleRule7() throws RecognitionException {
        EObject current = null;

        Token lv_left_0_0=null;
        Token lv_right_1_0=null;
        Token lv_unit_2_0=null;


        	enterRule();

        try {
            // InternalGH1462TestLanguage.g:783:2: ( ( ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= RULE_INT ) ) ( (lv_unit_2_0= 's' ) ) ) )
            // InternalGH1462TestLanguage.g:784:2: ( ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= RULE_INT ) ) ( (lv_unit_2_0= 's' ) ) )
            {
            // InternalGH1462TestLanguage.g:784:2: ( ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= RULE_INT ) ) ( (lv_unit_2_0= 's' ) ) )
            // InternalGH1462TestLanguage.g:785:3: ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= RULE_INT ) ) ( (lv_unit_2_0= 's' ) )
            {
            // InternalGH1462TestLanguage.g:785:3: ( (lv_left_0_0= RULE_INT ) )
            // InternalGH1462TestLanguage.g:786:4: (lv_left_0_0= RULE_INT )
            {
            // InternalGH1462TestLanguage.g:786:4: (lv_left_0_0= RULE_INT )
            // InternalGH1462TestLanguage.g:787:5: lv_left_0_0= RULE_INT
            {
            lv_left_0_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_3); 

            					newLeafNode(lv_left_0_0, grammarAccess.getRule7Access().getLeftINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRule7Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"left",
            						lv_left_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalGH1462TestLanguage.g:803:3: ( (lv_right_1_0= RULE_INT ) )
            // InternalGH1462TestLanguage.g:804:4: (lv_right_1_0= RULE_INT )
            {
            // InternalGH1462TestLanguage.g:804:4: (lv_right_1_0= RULE_INT )
            // InternalGH1462TestLanguage.g:805:5: lv_right_1_0= RULE_INT
            {
            lv_right_1_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_6); 

            					newLeafNode(lv_right_1_0, grammarAccess.getRule7Access().getRightINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRule7Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"right",
            						true,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalGH1462TestLanguage.g:821:3: ( (lv_unit_2_0= 's' ) )
            // InternalGH1462TestLanguage.g:822:4: (lv_unit_2_0= 's' )
            {
            // InternalGH1462TestLanguage.g:822:4: (lv_unit_2_0= 's' )
            // InternalGH1462TestLanguage.g:823:5: lv_unit_2_0= 's'
            {
            lv_unit_2_0=(Token)match(input,22,FollowSets000.FOLLOW_2); 

            					newLeafNode(lv_unit_2_0, grammarAccess.getRule7Access().getUnitSKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRule7Rule());
            					}
            					setWithLastConsumed(current, "unit", lv_unit_2_0, "s");
            				

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
    // $ANTLR end "ruleRule7"


    // $ANTLR start "entryRuleRule8"
    // InternalGH1462TestLanguage.g:839:1: entryRuleRule8 returns [EObject current=null] : iv_ruleRule8= ruleRule8 EOF ;
    public final EObject entryRuleRule8() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule8 = null;


        try {
            // InternalGH1462TestLanguage.g:839:46: (iv_ruleRule8= ruleRule8 EOF )
            // InternalGH1462TestLanguage.g:840:2: iv_ruleRule8= ruleRule8 EOF
            {
             newCompositeNode(grammarAccess.getRule8Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRule8=ruleRule8();

            state._fsp--;

             current =iv_ruleRule8; 
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
    // $ANTLR end "entryRuleRule8"


    // $ANTLR start "ruleRule8"
    // InternalGH1462TestLanguage.g:846:1: ruleRule8 returns [EObject current=null] : ( ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= '#1' ) ) ( (lv_unit_2_0= 's' ) ) ) ;
    public final EObject ruleRule8() throws RecognitionException {
        EObject current = null;

        Token lv_left_0_0=null;
        Token lv_right_1_0=null;
        Token lv_unit_2_0=null;


        	enterRule();

        try {
            // InternalGH1462TestLanguage.g:852:2: ( ( ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= '#1' ) ) ( (lv_unit_2_0= 's' ) ) ) )
            // InternalGH1462TestLanguage.g:853:2: ( ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= '#1' ) ) ( (lv_unit_2_0= 's' ) ) )
            {
            // InternalGH1462TestLanguage.g:853:2: ( ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= '#1' ) ) ( (lv_unit_2_0= 's' ) ) )
            // InternalGH1462TestLanguage.g:854:3: ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= '#1' ) ) ( (lv_unit_2_0= 's' ) )
            {
            // InternalGH1462TestLanguage.g:854:3: ( (lv_left_0_0= RULE_INT ) )
            // InternalGH1462TestLanguage.g:855:4: (lv_left_0_0= RULE_INT )
            {
            // InternalGH1462TestLanguage.g:855:4: (lv_left_0_0= RULE_INT )
            // InternalGH1462TestLanguage.g:856:5: lv_left_0_0= RULE_INT
            {
            lv_left_0_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_7); 

            					newLeafNode(lv_left_0_0, grammarAccess.getRule8Access().getLeftINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRule8Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"left",
            						lv_left_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalGH1462TestLanguage.g:872:3: ( (lv_right_1_0= '#1' ) )
            // InternalGH1462TestLanguage.g:873:4: (lv_right_1_0= '#1' )
            {
            // InternalGH1462TestLanguage.g:873:4: (lv_right_1_0= '#1' )
            // InternalGH1462TestLanguage.g:874:5: lv_right_1_0= '#1'
            {
            lv_right_1_0=(Token)match(input,11,FollowSets000.FOLLOW_6); 

            					newLeafNode(lv_right_1_0, grammarAccess.getRule8Access().getRight1Keyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRule8Rule());
            					}
            					setWithLastConsumed(current, "right", true, "#1");
            				

            }


            }

            // InternalGH1462TestLanguage.g:886:3: ( (lv_unit_2_0= 's' ) )
            // InternalGH1462TestLanguage.g:887:4: (lv_unit_2_0= 's' )
            {
            // InternalGH1462TestLanguage.g:887:4: (lv_unit_2_0= 's' )
            // InternalGH1462TestLanguage.g:888:5: lv_unit_2_0= 's'
            {
            lv_unit_2_0=(Token)match(input,22,FollowSets000.FOLLOW_2); 

            					newLeafNode(lv_unit_2_0, grammarAccess.getRule8Access().getUnitSKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRule8Rule());
            					}
            					setWithLastConsumed(current, "unit", lv_unit_2_0, "s");
            				

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
    // $ANTLR end "ruleRule8"


    // $ANTLR start "entryRuleRule9"
    // InternalGH1462TestLanguage.g:904:1: entryRuleRule9 returns [EObject current=null] : iv_ruleRule9= ruleRule9 EOF ;
    public final EObject entryRuleRule9() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule9 = null;


        try {
            // InternalGH1462TestLanguage.g:904:46: (iv_ruleRule9= ruleRule9 EOF )
            // InternalGH1462TestLanguage.g:905:2: iv_ruleRule9= ruleRule9 EOF
            {
             newCompositeNode(grammarAccess.getRule9Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRule9=ruleRule9();

            state._fsp--;

             current =iv_ruleRule9; 
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
    // $ANTLR end "entryRuleRule9"


    // $ANTLR start "ruleRule9"
    // InternalGH1462TestLanguage.g:911:1: ruleRule9 returns [EObject current=null] : ( ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= ruleMaybeEmpty ) ) ( (lv_unit_2_0= 's' ) ) ) ;
    public final EObject ruleRule9() throws RecognitionException {
        EObject current = null;

        Token lv_left_0_0=null;
        Token lv_unit_2_0=null;
        AntlrDatatypeRuleToken lv_right_1_0 = null;



        	enterRule();

        try {
            // InternalGH1462TestLanguage.g:917:2: ( ( ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= ruleMaybeEmpty ) ) ( (lv_unit_2_0= 's' ) ) ) )
            // InternalGH1462TestLanguage.g:918:2: ( ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= ruleMaybeEmpty ) ) ( (lv_unit_2_0= 's' ) ) )
            {
            // InternalGH1462TestLanguage.g:918:2: ( ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= ruleMaybeEmpty ) ) ( (lv_unit_2_0= 's' ) ) )
            // InternalGH1462TestLanguage.g:919:3: ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= ruleMaybeEmpty ) ) ( (lv_unit_2_0= 's' ) )
            {
            // InternalGH1462TestLanguage.g:919:3: ( (lv_left_0_0= RULE_INT ) )
            // InternalGH1462TestLanguage.g:920:4: (lv_left_0_0= RULE_INT )
            {
            // InternalGH1462TestLanguage.g:920:4: (lv_left_0_0= RULE_INT )
            // InternalGH1462TestLanguage.g:921:5: lv_left_0_0= RULE_INT
            {
            lv_left_0_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_8); 

            					newLeafNode(lv_left_0_0, grammarAccess.getRule9Access().getLeftINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRule9Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"left",
            						lv_left_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalGH1462TestLanguage.g:937:3: ( (lv_right_1_0= ruleMaybeEmpty ) )
            // InternalGH1462TestLanguage.g:938:4: (lv_right_1_0= ruleMaybeEmpty )
            {
            // InternalGH1462TestLanguage.g:938:4: (lv_right_1_0= ruleMaybeEmpty )
            // InternalGH1462TestLanguage.g:939:5: lv_right_1_0= ruleMaybeEmpty
            {

            					newCompositeNode(grammarAccess.getRule9Access().getRightMaybeEmptyParserRuleCall_1_0());
            				
            pushFollow(FollowSets000.FOLLOW_6);
            lv_right_1_0=ruleMaybeEmpty();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRule9Rule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_1_0,
            						"org.eclipse.xtext.parser.antlr.GH1462TestLanguage.MaybeEmpty");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGH1462TestLanguage.g:956:3: ( (lv_unit_2_0= 's' ) )
            // InternalGH1462TestLanguage.g:957:4: (lv_unit_2_0= 's' )
            {
            // InternalGH1462TestLanguage.g:957:4: (lv_unit_2_0= 's' )
            // InternalGH1462TestLanguage.g:958:5: lv_unit_2_0= 's'
            {
            lv_unit_2_0=(Token)match(input,22,FollowSets000.FOLLOW_2); 

            					newLeafNode(lv_unit_2_0, grammarAccess.getRule9Access().getUnitSKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRule9Rule());
            					}
            					setWithLastConsumed(current, "unit", lv_unit_2_0, "s");
            				

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
    // $ANTLR end "ruleRule9"


    // $ANTLR start "entryRuleRule10"
    // InternalGH1462TestLanguage.g:974:1: entryRuleRule10 returns [EObject current=null] : iv_ruleRule10= ruleRule10 EOF ;
    public final EObject entryRuleRule10() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule10 = null;


        try {
            // InternalGH1462TestLanguage.g:974:47: (iv_ruleRule10= ruleRule10 EOF )
            // InternalGH1462TestLanguage.g:975:2: iv_ruleRule10= ruleRule10 EOF
            {
             newCompositeNode(grammarAccess.getRule10Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRule10=ruleRule10();

            state._fsp--;

             current =iv_ruleRule10; 
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
    // $ANTLR end "entryRuleRule10"


    // $ANTLR start "ruleRule10"
    // InternalGH1462TestLanguage.g:981:1: ruleRule10 returns [EObject current=null] : ( ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= ruleMaybeEmpty ) ) ( (lv_unit_2_0= 's' ) ) ) ;
    public final EObject ruleRule10() throws RecognitionException {
        EObject current = null;

        Token lv_left_0_0=null;
        Token lv_unit_2_0=null;
        AntlrDatatypeRuleToken lv_right_1_0 = null;



        	enterRule();

        try {
            // InternalGH1462TestLanguage.g:987:2: ( ( ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= ruleMaybeEmpty ) ) ( (lv_unit_2_0= 's' ) ) ) )
            // InternalGH1462TestLanguage.g:988:2: ( ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= ruleMaybeEmpty ) ) ( (lv_unit_2_0= 's' ) ) )
            {
            // InternalGH1462TestLanguage.g:988:2: ( ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= ruleMaybeEmpty ) ) ( (lv_unit_2_0= 's' ) ) )
            // InternalGH1462TestLanguage.g:989:3: ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= ruleMaybeEmpty ) ) ( (lv_unit_2_0= 's' ) )
            {
            // InternalGH1462TestLanguage.g:989:3: ( (lv_left_0_0= RULE_INT ) )
            // InternalGH1462TestLanguage.g:990:4: (lv_left_0_0= RULE_INT )
            {
            // InternalGH1462TestLanguage.g:990:4: (lv_left_0_0= RULE_INT )
            // InternalGH1462TestLanguage.g:991:5: lv_left_0_0= RULE_INT
            {
            lv_left_0_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_8); 

            					newLeafNode(lv_left_0_0, grammarAccess.getRule10Access().getLeftINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRule10Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"left",
            						lv_left_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalGH1462TestLanguage.g:1007:3: ( (lv_right_1_0= ruleMaybeEmpty ) )
            // InternalGH1462TestLanguage.g:1008:4: (lv_right_1_0= ruleMaybeEmpty )
            {
            // InternalGH1462TestLanguage.g:1008:4: (lv_right_1_0= ruleMaybeEmpty )
            // InternalGH1462TestLanguage.g:1009:5: lv_right_1_0= ruleMaybeEmpty
            {

            					newCompositeNode(grammarAccess.getRule10Access().getRightMaybeEmptyParserRuleCall_1_0());
            				
            pushFollow(FollowSets000.FOLLOW_6);
            lv_right_1_0=ruleMaybeEmpty();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRule10Rule());
            					}
            					set(
            						current,
            						"right",
            						true,
            						"org.eclipse.xtext.parser.antlr.GH1462TestLanguage.MaybeEmpty");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGH1462TestLanguage.g:1026:3: ( (lv_unit_2_0= 's' ) )
            // InternalGH1462TestLanguage.g:1027:4: (lv_unit_2_0= 's' )
            {
            // InternalGH1462TestLanguage.g:1027:4: (lv_unit_2_0= 's' )
            // InternalGH1462TestLanguage.g:1028:5: lv_unit_2_0= 's'
            {
            lv_unit_2_0=(Token)match(input,22,FollowSets000.FOLLOW_2); 

            					newLeafNode(lv_unit_2_0, grammarAccess.getRule10Access().getUnitSKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRule10Rule());
            					}
            					setWithLastConsumed(current, "unit", lv_unit_2_0, "s");
            				

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
    // $ANTLR end "ruleRule10"


    // $ANTLR start "entryRuleRule11"
    // InternalGH1462TestLanguage.g:1044:1: entryRuleRule11 returns [EObject current=null] : iv_ruleRule11= ruleRule11 EOF ;
    public final EObject entryRuleRule11() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule11 = null;


        try {
            // InternalGH1462TestLanguage.g:1044:47: (iv_ruleRule11= ruleRule11 EOF )
            // InternalGH1462TestLanguage.g:1045:2: iv_ruleRule11= ruleRule11 EOF
            {
             newCompositeNode(grammarAccess.getRule11Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRule11=ruleRule11();

            state._fsp--;

             current =iv_ruleRule11; 
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
    // $ANTLR end "entryRuleRule11"


    // $ANTLR start "ruleRule11"
    // InternalGH1462TestLanguage.g:1051:1: ruleRule11 returns [EObject current=null] : ( ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= ruleInteger ) ) ( (lv_unit_2_0= 's' ) ) ) ;
    public final EObject ruleRule11() throws RecognitionException {
        EObject current = null;

        Token lv_left_0_0=null;
        Token lv_unit_2_0=null;
        AntlrDatatypeRuleToken lv_right_1_0 = null;



        	enterRule();

        try {
            // InternalGH1462TestLanguage.g:1057:2: ( ( ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= ruleInteger ) ) ( (lv_unit_2_0= 's' ) ) ) )
            // InternalGH1462TestLanguage.g:1058:2: ( ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= ruleInteger ) ) ( (lv_unit_2_0= 's' ) ) )
            {
            // InternalGH1462TestLanguage.g:1058:2: ( ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= ruleInteger ) ) ( (lv_unit_2_0= 's' ) ) )
            // InternalGH1462TestLanguage.g:1059:3: ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= ruleInteger ) ) ( (lv_unit_2_0= 's' ) )
            {
            // InternalGH1462TestLanguage.g:1059:3: ( (lv_left_0_0= RULE_INT ) )
            // InternalGH1462TestLanguage.g:1060:4: (lv_left_0_0= RULE_INT )
            {
            // InternalGH1462TestLanguage.g:1060:4: (lv_left_0_0= RULE_INT )
            // InternalGH1462TestLanguage.g:1061:5: lv_left_0_0= RULE_INT
            {
            lv_left_0_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_3); 

            					newLeafNode(lv_left_0_0, grammarAccess.getRule11Access().getLeftINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRule11Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"left",
            						lv_left_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalGH1462TestLanguage.g:1077:3: ( (lv_right_1_0= ruleInteger ) )
            // InternalGH1462TestLanguage.g:1078:4: (lv_right_1_0= ruleInteger )
            {
            // InternalGH1462TestLanguage.g:1078:4: (lv_right_1_0= ruleInteger )
            // InternalGH1462TestLanguage.g:1079:5: lv_right_1_0= ruleInteger
            {

            					newCompositeNode(grammarAccess.getRule11Access().getRightIntegerParserRuleCall_1_0());
            				
            pushFollow(FollowSets000.FOLLOW_6);
            lv_right_1_0=ruleInteger();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRule11Rule());
            					}
            					set(
            						current,
            						"right",
            						true,
            						"org.eclipse.xtext.parser.antlr.GH1462TestLanguage.Integer");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGH1462TestLanguage.g:1096:3: ( (lv_unit_2_0= 's' ) )
            // InternalGH1462TestLanguage.g:1097:4: (lv_unit_2_0= 's' )
            {
            // InternalGH1462TestLanguage.g:1097:4: (lv_unit_2_0= 's' )
            // InternalGH1462TestLanguage.g:1098:5: lv_unit_2_0= 's'
            {
            lv_unit_2_0=(Token)match(input,22,FollowSets000.FOLLOW_2); 

            					newLeafNode(lv_unit_2_0, grammarAccess.getRule11Access().getUnitSKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRule11Rule());
            					}
            					setWithLastConsumed(current, "unit", lv_unit_2_0, "s");
            				

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
    // $ANTLR end "ruleRule11"


    // $ANTLR start "entryRuleInteger"
    // InternalGH1462TestLanguage.g:1114:1: entryRuleInteger returns [String current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final String entryRuleInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger = null;


        try {
            // InternalGH1462TestLanguage.g:1114:47: (iv_ruleInteger= ruleInteger EOF )
            // InternalGH1462TestLanguage.g:1115:2: iv_ruleInteger= ruleInteger EOF
            {
             newCompositeNode(grammarAccess.getIntegerRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleInteger=ruleInteger();

            state._fsp--;

             current =iv_ruleInteger.getText(); 
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
    // $ANTLR end "entryRuleInteger"


    // $ANTLR start "ruleInteger"
    // InternalGH1462TestLanguage.g:1121:1: ruleInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalGH1462TestLanguage.g:1127:2: (this_INT_0= RULE_INT )
            // InternalGH1462TestLanguage.g:1128:2: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); 

            		current.merge(this_INT_0);
            	

            		newLeafNode(this_INT_0, grammarAccess.getIntegerAccess().getINTTerminalRuleCall());
            	

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
    // $ANTLR end "ruleInteger"


    // $ANTLR start "entryRuleMaybeEmpty"
    // InternalGH1462TestLanguage.g:1138:1: entryRuleMaybeEmpty returns [String current=null] : iv_ruleMaybeEmpty= ruleMaybeEmpty EOF ;
    public final String entryRuleMaybeEmpty() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMaybeEmpty = null;


        try {
            // InternalGH1462TestLanguage.g:1138:50: (iv_ruleMaybeEmpty= ruleMaybeEmpty EOF )
            // InternalGH1462TestLanguage.g:1139:2: iv_ruleMaybeEmpty= ruleMaybeEmpty EOF
            {
             newCompositeNode(grammarAccess.getMaybeEmptyRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMaybeEmpty=ruleMaybeEmpty();

            state._fsp--;

             current =iv_ruleMaybeEmpty.getText(); 
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
    // $ANTLR end "entryRuleMaybeEmpty"


    // $ANTLR start "ruleMaybeEmpty"
    // InternalGH1462TestLanguage.g:1145:1: ruleMaybeEmpty returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT )? ;
    public final AntlrDatatypeRuleToken ruleMaybeEmpty() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalGH1462TestLanguage.g:1151:2: ( (this_INT_0= RULE_INT )? )
            // InternalGH1462TestLanguage.g:1152:2: (this_INT_0= RULE_INT )?
            {
            // InternalGH1462TestLanguage.g:1152:2: (this_INT_0= RULE_INT )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_INT) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalGH1462TestLanguage.g:1153:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getMaybeEmptyAccess().getINTTerminalRuleCall());
                    		

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
    // $ANTLR end "ruleMaybeEmpty"


    // $ANTLR start "entryRuleWrapper"
    // InternalGH1462TestLanguage.g:1164:1: entryRuleWrapper returns [EObject current=null] : iv_ruleWrapper= ruleWrapper EOF ;
    public final EObject entryRuleWrapper() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWrapper = null;


        try {
            // InternalGH1462TestLanguage.g:1164:48: (iv_ruleWrapper= ruleWrapper EOF )
            // InternalGH1462TestLanguage.g:1165:2: iv_ruleWrapper= ruleWrapper EOF
            {
             newCompositeNode(grammarAccess.getWrapperRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleWrapper=ruleWrapper();

            state._fsp--;

             current =iv_ruleWrapper; 
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
    // $ANTLR end "entryRuleWrapper"


    // $ANTLR start "ruleWrapper"
    // InternalGH1462TestLanguage.g:1171:1: ruleWrapper returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleWrapper() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalGH1462TestLanguage.g:1177:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalGH1462TestLanguage.g:1178:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalGH1462TestLanguage.g:1178:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalGH1462TestLanguage.g:1179:3: (lv_value_0_0= RULE_INT )
            {
            // InternalGH1462TestLanguage.g:1179:3: (lv_value_0_0= RULE_INT )
            // InternalGH1462TestLanguage.g:1180:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getWrapperAccess().getValueINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getWrapperRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

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
    // $ANTLR end "ruleWrapper"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000400010L});
    }


}