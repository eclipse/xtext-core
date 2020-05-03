package org.eclipse.xtext.formatting2.regionaccess.internal.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.formatting2.regionaccess.internal.services.RegionAccessTestLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRegionAccessTestLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'5'", "'6'", "'7'", "'action'", "'8'", "'1'", "'2'", "'3'", "'4'", "'prefix'", "'+'", "'('", "')'", "'unassigned'", "'fragment'", "'child'", "'ref'", "'end'", "'datatype'", "'recursion'", "'lit1'", "'lit2'"
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
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalRegionAccessTestLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRegionAccessTestLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRegionAccessTestLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRegionAccessTestLanguage.g"; }



     	private RegionAccessTestLanguageGrammarAccess grammarAccess;

        public InternalRegionAccessTestLanguageParser(TokenStream input, RegionAccessTestLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Root";
       	}

       	@Override
       	protected RegionAccessTestLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRoot"
    // InternalRegionAccessTestLanguage.g:65:1: entryRuleRoot returns [EObject current=null] : iv_ruleRoot= ruleRoot EOF ;
    public final EObject entryRuleRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoot = null;


        try {
            // InternalRegionAccessTestLanguage.g:65:45: (iv_ruleRoot= ruleRoot EOF )
            // InternalRegionAccessTestLanguage.g:66:2: iv_ruleRoot= ruleRoot EOF
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
    // InternalRegionAccessTestLanguage.g:72:1: ruleRoot returns [EObject current=null] : (this_Simple_0= ruleSimple | this_Delegation_1= ruleDelegation | this_Unassigned_2= ruleUnassigned | this_PrefixedUnassigned_3= rulePrefixedUnassigned | (otherlv_4= '5' this_Expression_5= ruleExpression ) | (otherlv_6= '6' this_Mixed_7= ruleMixed ) | (otherlv_8= '7' ( () otherlv_10= 'action' )? ( (lv_mixed_11_0= ruleMixed ) ) ) | (otherlv_12= '8' this_ValueList_13= ruleValueList ) ) ;
    public final EObject ruleRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject this_Simple_0 = null;

        EObject this_Delegation_1 = null;

        EObject this_Unassigned_2 = null;

        EObject this_PrefixedUnassigned_3 = null;

        EObject this_Expression_5 = null;

        EObject this_Mixed_7 = null;

        EObject lv_mixed_11_0 = null;

        EObject this_ValueList_13 = null;


        try {
            // InternalRegionAccessTestLanguage.g:73:1: ( (this_Simple_0= ruleSimple | this_Delegation_1= ruleDelegation | this_Unassigned_2= ruleUnassigned | this_PrefixedUnassigned_3= rulePrefixedUnassigned | (otherlv_4= '5' this_Expression_5= ruleExpression ) | (otherlv_6= '6' this_Mixed_7= ruleMixed ) | (otherlv_8= '7' ( () otherlv_10= 'action' )? ( (lv_mixed_11_0= ruleMixed ) ) ) | (otherlv_12= '8' this_ValueList_13= ruleValueList ) ) )
            // InternalRegionAccessTestLanguage.g:74:2: (this_Simple_0= ruleSimple | this_Delegation_1= ruleDelegation | this_Unassigned_2= ruleUnassigned | this_PrefixedUnassigned_3= rulePrefixedUnassigned | (otherlv_4= '5' this_Expression_5= ruleExpression ) | (otherlv_6= '6' this_Mixed_7= ruleMixed ) | (otherlv_8= '7' ( () otherlv_10= 'action' )? ( (lv_mixed_11_0= ruleMixed ) ) ) | (otherlv_12= '8' this_ValueList_13= ruleValueList ) )
            {
            // InternalRegionAccessTestLanguage.g:74:2: (this_Simple_0= ruleSimple | this_Delegation_1= ruleDelegation | this_Unassigned_2= ruleUnassigned | this_PrefixedUnassigned_3= rulePrefixedUnassigned | (otherlv_4= '5' this_Expression_5= ruleExpression ) | (otherlv_6= '6' this_Mixed_7= ruleMixed ) | (otherlv_8= '7' ( () otherlv_10= 'action' )? ( (lv_mixed_11_0= ruleMixed ) ) ) | (otherlv_12= '8' this_ValueList_13= ruleValueList ) )
            int alt2=8;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt2=1;
                }
                break;
            case 17:
                {
                alt2=2;
                }
                break;
            case 18:
                {
                alt2=3;
                }
                break;
            case 19:
                {
                alt2=4;
                }
                break;
            case 11:
                {
                alt2=5;
                }
                break;
            case 12:
                {
                alt2=6;
                }
                break;
            case 13:
                {
                alt2=7;
                }
                break;
            case 15:
                {
                alt2=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalRegionAccessTestLanguage.g:75:3: this_Simple_0= ruleSimple
                    {

                    			newCompositeNode(grammarAccess.getRootAccess().getSimpleParserRuleCall_0());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Simple_0=ruleSimple();

                    state._fsp--;


                    			current = this_Simple_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRegionAccessTestLanguage.g:84:3: this_Delegation_1= ruleDelegation
                    {

                    			newCompositeNode(grammarAccess.getRootAccess().getDelegationParserRuleCall_1());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Delegation_1=ruleDelegation();

                    state._fsp--;


                    			current = this_Delegation_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRegionAccessTestLanguage.g:93:3: this_Unassigned_2= ruleUnassigned
                    {

                    			newCompositeNode(grammarAccess.getRootAccess().getUnassignedParserRuleCall_2());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Unassigned_2=ruleUnassigned();

                    state._fsp--;


                    			current = this_Unassigned_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRegionAccessTestLanguage.g:102:3: this_PrefixedUnassigned_3= rulePrefixedUnassigned
                    {

                    			newCompositeNode(grammarAccess.getRootAccess().getPrefixedUnassignedParserRuleCall_3());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_PrefixedUnassigned_3=rulePrefixedUnassigned();

                    state._fsp--;


                    			current = this_PrefixedUnassigned_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalRegionAccessTestLanguage.g:111:3: (otherlv_4= '5' this_Expression_5= ruleExpression )
                    {
                    // InternalRegionAccessTestLanguage.g:111:3: (otherlv_4= '5' this_Expression_5= ruleExpression )
                    // InternalRegionAccessTestLanguage.g:112:4: otherlv_4= '5' this_Expression_5= ruleExpression
                    {
                    otherlv_4=(Token)match(input,11,FollowSets000.FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getRootAccess().getDigitFiveKeyword_4_0());
                    			

                    				newCompositeNode(grammarAccess.getRootAccess().getExpressionParserRuleCall_4_1());
                    			
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Expression_5=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_5;
                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalRegionAccessTestLanguage.g:126:3: (otherlv_6= '6' this_Mixed_7= ruleMixed )
                    {
                    // InternalRegionAccessTestLanguage.g:126:3: (otherlv_6= '6' this_Mixed_7= ruleMixed )
                    // InternalRegionAccessTestLanguage.g:127:4: otherlv_6= '6' this_Mixed_7= ruleMixed
                    {
                    otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getRootAccess().getDigitSixKeyword_5_0());
                    			

                    				newCompositeNode(grammarAccess.getRootAccess().getMixedParserRuleCall_5_1());
                    			
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Mixed_7=ruleMixed();

                    state._fsp--;


                    				current = this_Mixed_7;
                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalRegionAccessTestLanguage.g:141:3: (otherlv_8= '7' ( () otherlv_10= 'action' )? ( (lv_mixed_11_0= ruleMixed ) ) )
                    {
                    // InternalRegionAccessTestLanguage.g:141:3: (otherlv_8= '7' ( () otherlv_10= 'action' )? ( (lv_mixed_11_0= ruleMixed ) ) )
                    // InternalRegionAccessTestLanguage.g:142:4: otherlv_8= '7' ( () otherlv_10= 'action' )? ( (lv_mixed_11_0= ruleMixed ) )
                    {
                    otherlv_8=(Token)match(input,13,FollowSets000.FOLLOW_5); 

                    				newLeafNode(otherlv_8, grammarAccess.getRootAccess().getDigitSevenKeyword_6_0());
                    			
                    // InternalRegionAccessTestLanguage.g:146:4: ( () otherlv_10= 'action' )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==14) ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // InternalRegionAccessTestLanguage.g:147:5: () otherlv_10= 'action'
                            {
                            // InternalRegionAccessTestLanguage.g:147:5: ()
                            // InternalRegionAccessTestLanguage.g:148:6: 
                            {

                            						current = forceCreateModelElement(
                            							grammarAccess.getRootAccess().getRootActionAction_6_1_0(),
                            							current);
                            					

                            }

                            otherlv_10=(Token)match(input,14,FollowSets000.FOLLOW_4); 

                            					newLeafNode(otherlv_10, grammarAccess.getRootAccess().getActionKeyword_6_1_1());
                            				

                            }
                            break;

                    }

                    // InternalRegionAccessTestLanguage.g:159:4: ( (lv_mixed_11_0= ruleMixed ) )
                    // InternalRegionAccessTestLanguage.g:160:5: (lv_mixed_11_0= ruleMixed )
                    {
                    // InternalRegionAccessTestLanguage.g:160:5: (lv_mixed_11_0= ruleMixed )
                    // InternalRegionAccessTestLanguage.g:161:6: lv_mixed_11_0= ruleMixed
                    {

                    						newCompositeNode(grammarAccess.getRootAccess().getMixedMixedParserRuleCall_6_2_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_mixed_11_0=ruleMixed();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRootRule());
                    						}
                    						set(
                    							current,
                    							"mixed",
                    							lv_mixed_11_0,
                    							"org.eclipse.xtext.formatting2.regionaccess.internal.RegionAccessTestLanguage.Mixed");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalRegionAccessTestLanguage.g:180:3: (otherlv_12= '8' this_ValueList_13= ruleValueList )
                    {
                    // InternalRegionAccessTestLanguage.g:180:3: (otherlv_12= '8' this_ValueList_13= ruleValueList )
                    // InternalRegionAccessTestLanguage.g:181:4: otherlv_12= '8' this_ValueList_13= ruleValueList
                    {
                    otherlv_12=(Token)match(input,15,FollowSets000.FOLLOW_6); 

                    				newLeafNode(otherlv_12, grammarAccess.getRootAccess().getDigitEightKeyword_7_0());
                    			

                    				newCompositeNode(grammarAccess.getRootAccess().getValueListParserRuleCall_7_1());
                    			
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ValueList_13=ruleValueList();

                    state._fsp--;


                    				current = this_ValueList_13;
                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleRoot"


    // $ANTLR start "entryRuleSimple"
    // InternalRegionAccessTestLanguage.g:198:1: entryRuleSimple returns [EObject current=null] : iv_ruleSimple= ruleSimple EOF ;
    public final EObject entryRuleSimple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimple = null;


        try {
            // InternalRegionAccessTestLanguage.g:198:47: (iv_ruleSimple= ruleSimple EOF )
            // InternalRegionAccessTestLanguage.g:199:2: iv_ruleSimple= ruleSimple EOF
            {
             newCompositeNode(grammarAccess.getSimpleRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSimple=ruleSimple();

            state._fsp--;

             current =iv_ruleSimple; 
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
    // $ANTLR end "entryRuleSimple"


    // $ANTLR start "ruleSimple"
    // InternalRegionAccessTestLanguage.g:205:1: ruleSimple returns [EObject current=null] : (otherlv_0= '1' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleSimple() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

        try {
            // InternalRegionAccessTestLanguage.g:206:1: ( (otherlv_0= '1' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalRegionAccessTestLanguage.g:207:2: (otherlv_0= '1' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalRegionAccessTestLanguage.g:207:2: (otherlv_0= '1' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalRegionAccessTestLanguage.g:208:3: otherlv_0= '1' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,16,FollowSets000.FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getSimpleAccess().getDigitOneKeyword_0());
            		
            // InternalRegionAccessTestLanguage.g:212:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRegionAccessTestLanguage.g:213:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRegionAccessTestLanguage.g:213:4: (lv_name_1_0= RULE_ID )
            // InternalRegionAccessTestLanguage.g:214:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSimpleAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSimpleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


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
    // $ANTLR end "ruleSimple"


    // $ANTLR start "entryRuleDelegation"
    // InternalRegionAccessTestLanguage.g:234:1: entryRuleDelegation returns [EObject current=null] : iv_ruleDelegation= ruleDelegation EOF ;
    public final EObject entryRuleDelegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelegation = null;


        try {
            // InternalRegionAccessTestLanguage.g:234:51: (iv_ruleDelegation= ruleDelegation EOF )
            // InternalRegionAccessTestLanguage.g:235:2: iv_ruleDelegation= ruleDelegation EOF
            {
             newCompositeNode(grammarAccess.getDelegationRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDelegation=ruleDelegation();

            state._fsp--;

             current =iv_ruleDelegation; 
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
    // $ANTLR end "entryRuleDelegation"


    // $ANTLR start "ruleDelegation"
    // InternalRegionAccessTestLanguage.g:241:1: ruleDelegation returns [EObject current=null] : (otherlv_0= '2' ( (lv_delegate_1_0= ruleDelegate ) ) ) ;
    public final EObject ruleDelegation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_delegate_1_0 = null;


        try {
            // InternalRegionAccessTestLanguage.g:242:1: ( (otherlv_0= '2' ( (lv_delegate_1_0= ruleDelegate ) ) ) )
            // InternalRegionAccessTestLanguage.g:243:2: (otherlv_0= '2' ( (lv_delegate_1_0= ruleDelegate ) ) )
            {
            // InternalRegionAccessTestLanguage.g:243:2: (otherlv_0= '2' ( (lv_delegate_1_0= ruleDelegate ) ) )
            // InternalRegionAccessTestLanguage.g:244:3: otherlv_0= '2' ( (lv_delegate_1_0= ruleDelegate ) )
            {
            otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getDelegationAccess().getDigitTwoKeyword_0());
            		
            // InternalRegionAccessTestLanguage.g:248:3: ( (lv_delegate_1_0= ruleDelegate ) )
            // InternalRegionAccessTestLanguage.g:249:4: (lv_delegate_1_0= ruleDelegate )
            {
            // InternalRegionAccessTestLanguage.g:249:4: (lv_delegate_1_0= ruleDelegate )
            // InternalRegionAccessTestLanguage.g:250:5: lv_delegate_1_0= ruleDelegate
            {

            					newCompositeNode(grammarAccess.getDelegationAccess().getDelegateDelegateParserRuleCall_1_0());
            				
            pushFollow(FollowSets000.FOLLOW_2);
            lv_delegate_1_0=ruleDelegate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDelegationRule());
            					}
            					set(
            						current,
            						"delegate",
            						lv_delegate_1_0,
            						"org.eclipse.xtext.formatting2.regionaccess.internal.RegionAccessTestLanguage.Delegate");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


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
    // $ANTLR end "ruleDelegation"


    // $ANTLR start "entryRuleUnassigned"
    // InternalRegionAccessTestLanguage.g:271:1: entryRuleUnassigned returns [EObject current=null] : iv_ruleUnassigned= ruleUnassigned EOF ;
    public final EObject entryRuleUnassigned() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnassigned = null;


        try {
            // InternalRegionAccessTestLanguage.g:271:51: (iv_ruleUnassigned= ruleUnassigned EOF )
            // InternalRegionAccessTestLanguage.g:272:2: iv_ruleUnassigned= ruleUnassigned EOF
            {
             newCompositeNode(grammarAccess.getUnassignedRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleUnassigned=ruleUnassigned();

            state._fsp--;

             current =iv_ruleUnassigned; 
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
    // $ANTLR end "entryRuleUnassigned"


    // $ANTLR start "ruleUnassigned"
    // InternalRegionAccessTestLanguage.g:278:1: ruleUnassigned returns [EObject current=null] : (otherlv_0= '3' this_Delegate_1= ruleDelegate ) ;
    public final EObject ruleUnassigned() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Delegate_1 = null;


        try {
            // InternalRegionAccessTestLanguage.g:279:1: ( (otherlv_0= '3' this_Delegate_1= ruleDelegate ) )
            // InternalRegionAccessTestLanguage.g:280:2: (otherlv_0= '3' this_Delegate_1= ruleDelegate )
            {
            // InternalRegionAccessTestLanguage.g:280:2: (otherlv_0= '3' this_Delegate_1= ruleDelegate )
            // InternalRegionAccessTestLanguage.g:281:3: otherlv_0= '3' this_Delegate_1= ruleDelegate
            {
            otherlv_0=(Token)match(input,18,FollowSets000.FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getUnassignedAccess().getDigitThreeKeyword_0());
            		

            			newCompositeNode(grammarAccess.getUnassignedAccess().getDelegateParserRuleCall_1());
            		
            pushFollow(FollowSets000.FOLLOW_2);
            this_Delegate_1=ruleDelegate();

            state._fsp--;


            			current = this_Delegate_1;
            			afterParserOrEnumRuleCall();
            		

            }


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
    // $ANTLR end "ruleUnassigned"


    // $ANTLR start "entryRulePrefixedUnassigned"
    // InternalRegionAccessTestLanguage.g:297:1: entryRulePrefixedUnassigned returns [EObject current=null] : iv_rulePrefixedUnassigned= rulePrefixedUnassigned EOF ;
    public final EObject entryRulePrefixedUnassigned() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefixedUnassigned = null;


        try {
            // InternalRegionAccessTestLanguage.g:297:59: (iv_rulePrefixedUnassigned= rulePrefixedUnassigned EOF )
            // InternalRegionAccessTestLanguage.g:298:2: iv_rulePrefixedUnassigned= rulePrefixedUnassigned EOF
            {
             newCompositeNode(grammarAccess.getPrefixedUnassignedRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePrefixedUnassigned=rulePrefixedUnassigned();

            state._fsp--;

             current =iv_rulePrefixedUnassigned; 
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
    // $ANTLR end "entryRulePrefixedUnassigned"


    // $ANTLR start "rulePrefixedUnassigned"
    // InternalRegionAccessTestLanguage.g:304:1: rulePrefixedUnassigned returns [EObject current=null] : (otherlv_0= '4' ( (lv_delegate_1_0= rulePrefixedDelegate ) ) ) ;
    public final EObject rulePrefixedUnassigned() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_delegate_1_0 = null;


        try {
            // InternalRegionAccessTestLanguage.g:305:1: ( (otherlv_0= '4' ( (lv_delegate_1_0= rulePrefixedDelegate ) ) ) )
            // InternalRegionAccessTestLanguage.g:306:2: (otherlv_0= '4' ( (lv_delegate_1_0= rulePrefixedDelegate ) ) )
            {
            // InternalRegionAccessTestLanguage.g:306:2: (otherlv_0= '4' ( (lv_delegate_1_0= rulePrefixedDelegate ) ) )
            // InternalRegionAccessTestLanguage.g:307:3: otherlv_0= '4' ( (lv_delegate_1_0= rulePrefixedDelegate ) )
            {
            otherlv_0=(Token)match(input,19,FollowSets000.FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getPrefixedUnassignedAccess().getDigitFourKeyword_0());
            		
            // InternalRegionAccessTestLanguage.g:311:3: ( (lv_delegate_1_0= rulePrefixedDelegate ) )
            // InternalRegionAccessTestLanguage.g:312:4: (lv_delegate_1_0= rulePrefixedDelegate )
            {
            // InternalRegionAccessTestLanguage.g:312:4: (lv_delegate_1_0= rulePrefixedDelegate )
            // InternalRegionAccessTestLanguage.g:313:5: lv_delegate_1_0= rulePrefixedDelegate
            {

            					newCompositeNode(grammarAccess.getPrefixedUnassignedAccess().getDelegatePrefixedDelegateParserRuleCall_1_0());
            				
            pushFollow(FollowSets000.FOLLOW_2);
            lv_delegate_1_0=rulePrefixedDelegate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPrefixedUnassignedRule());
            					}
            					set(
            						current,
            						"delegate",
            						lv_delegate_1_0,
            						"org.eclipse.xtext.formatting2.regionaccess.internal.RegionAccessTestLanguage.PrefixedDelegate");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


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
    // $ANTLR end "rulePrefixedUnassigned"


    // $ANTLR start "entryRulePrefixedDelegate"
    // InternalRegionAccessTestLanguage.g:334:1: entryRulePrefixedDelegate returns [EObject current=null] : iv_rulePrefixedDelegate= rulePrefixedDelegate EOF ;
    public final EObject entryRulePrefixedDelegate() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefixedDelegate = null;


        try {
            // InternalRegionAccessTestLanguage.g:334:57: (iv_rulePrefixedDelegate= rulePrefixedDelegate EOF )
            // InternalRegionAccessTestLanguage.g:335:2: iv_rulePrefixedDelegate= rulePrefixedDelegate EOF
            {
             newCompositeNode(grammarAccess.getPrefixedDelegateRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePrefixedDelegate=rulePrefixedDelegate();

            state._fsp--;

             current =iv_rulePrefixedDelegate; 
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
    // $ANTLR end "entryRulePrefixedDelegate"


    // $ANTLR start "rulePrefixedDelegate"
    // InternalRegionAccessTestLanguage.g:341:1: rulePrefixedDelegate returns [EObject current=null] : (otherlv_0= 'prefix' this_Delegate_1= ruleDelegate ) ;
    public final EObject rulePrefixedDelegate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Delegate_1 = null;


        try {
            // InternalRegionAccessTestLanguage.g:342:1: ( (otherlv_0= 'prefix' this_Delegate_1= ruleDelegate ) )
            // InternalRegionAccessTestLanguage.g:343:2: (otherlv_0= 'prefix' this_Delegate_1= ruleDelegate )
            {
            // InternalRegionAccessTestLanguage.g:343:2: (otherlv_0= 'prefix' this_Delegate_1= ruleDelegate )
            // InternalRegionAccessTestLanguage.g:344:3: otherlv_0= 'prefix' this_Delegate_1= ruleDelegate
            {
            otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getPrefixedDelegateAccess().getPrefixKeyword_0());
            		

            			newCompositeNode(grammarAccess.getPrefixedDelegateAccess().getDelegateParserRuleCall_1());
            		
            pushFollow(FollowSets000.FOLLOW_2);
            this_Delegate_1=ruleDelegate();

            state._fsp--;


            			current = this_Delegate_1;
            			afterParserOrEnumRuleCall();
            		

            }


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
    // $ANTLR end "rulePrefixedDelegate"


    // $ANTLR start "entryRuleDelegate"
    // InternalRegionAccessTestLanguage.g:360:1: entryRuleDelegate returns [EObject current=null] : iv_ruleDelegate= ruleDelegate EOF ;
    public final EObject entryRuleDelegate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelegate = null;


        try {
            // InternalRegionAccessTestLanguage.g:360:49: (iv_ruleDelegate= ruleDelegate EOF )
            // InternalRegionAccessTestLanguage.g:361:2: iv_ruleDelegate= ruleDelegate EOF
            {
             newCompositeNode(grammarAccess.getDelegateRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDelegate=ruleDelegate();

            state._fsp--;

             current =iv_ruleDelegate; 
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
    // $ANTLR end "entryRuleDelegate"


    // $ANTLR start "ruleDelegate"
    // InternalRegionAccessTestLanguage.g:367:1: ruleDelegate returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleDelegate() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

        try {
            // InternalRegionAccessTestLanguage.g:368:1: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalRegionAccessTestLanguage.g:369:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalRegionAccessTestLanguage.g:369:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalRegionAccessTestLanguage.g:370:3: (lv_name_0_0= RULE_ID )
            {
            // InternalRegionAccessTestLanguage.g:370:3: (lv_name_0_0= RULE_ID )
            // InternalRegionAccessTestLanguage.g:371:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getDelegateAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getDelegateRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


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
    // $ANTLR end "ruleDelegate"


    // $ANTLR start "entryRuleExpression"
    // InternalRegionAccessTestLanguage.g:390:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalRegionAccessTestLanguage.g:390:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalRegionAccessTestLanguage.g:391:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalRegionAccessTestLanguage.g:397:1: ruleExpression returns [EObject current=null] : (this_Primary_0= rulePrimary ( () otherlv_2= '+' ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;


        try {
            // InternalRegionAccessTestLanguage.g:398:1: ( (this_Primary_0= rulePrimary ( () otherlv_2= '+' ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // InternalRegionAccessTestLanguage.g:399:2: (this_Primary_0= rulePrimary ( () otherlv_2= '+' ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // InternalRegionAccessTestLanguage.g:399:2: (this_Primary_0= rulePrimary ( () otherlv_2= '+' ( (lv_right_3_0= rulePrimary ) ) )* )
            // InternalRegionAccessTestLanguage.g:400:3: this_Primary_0= rulePrimary ( () otherlv_2= '+' ( (lv_right_3_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpressionAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FollowSets000.FOLLOW_8);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRegionAccessTestLanguage.g:408:3: ( () otherlv_2= '+' ( (lv_right_3_0= rulePrimary ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==21) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalRegionAccessTestLanguage.g:409:4: () otherlv_2= '+' ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalRegionAccessTestLanguage.g:409:4: ()
            	    // InternalRegionAccessTestLanguage.g:410:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getExpressionAccess().getAddLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,21,FollowSets000.FOLLOW_3); 

            	    				newLeafNode(otherlv_2, grammarAccess.getExpressionAccess().getPlusSignKeyword_1_1());
            	    			
            	    // InternalRegionAccessTestLanguage.g:420:4: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalRegionAccessTestLanguage.g:421:5: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalRegionAccessTestLanguage.g:421:5: (lv_right_3_0= rulePrimary )
            	    // InternalRegionAccessTestLanguage.g:422:6: lv_right_3_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getExpressionAccess().getRightPrimaryParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FollowSets000.FOLLOW_8);
            	    lv_right_3_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.eclipse.xtext.formatting2.regionaccess.internal.RegionAccessTestLanguage.Primary");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRulePrimary"
    // InternalRegionAccessTestLanguage.g:444:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalRegionAccessTestLanguage.g:444:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalRegionAccessTestLanguage.g:445:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalRegionAccessTestLanguage.g:451:1: rulePrimary returns [EObject current=null] : ( ( () ( (lv_name_1_0= RULE_ID ) ) ) | this_Parenthesized_2= ruleParenthesized ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject this_Parenthesized_2 = null;


        try {
            // InternalRegionAccessTestLanguage.g:452:1: ( ( ( () ( (lv_name_1_0= RULE_ID ) ) ) | this_Parenthesized_2= ruleParenthesized ) )
            // InternalRegionAccessTestLanguage.g:453:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) | this_Parenthesized_2= ruleParenthesized )
            {
            // InternalRegionAccessTestLanguage.g:453:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) | this_Parenthesized_2= ruleParenthesized )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==22) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalRegionAccessTestLanguage.g:454:3: ( () ( (lv_name_1_0= RULE_ID ) ) )
                    {
                    // InternalRegionAccessTestLanguage.g:454:3: ( () ( (lv_name_1_0= RULE_ID ) ) )
                    // InternalRegionAccessTestLanguage.g:455:4: () ( (lv_name_1_0= RULE_ID ) )
                    {
                    // InternalRegionAccessTestLanguage.g:455:4: ()
                    // InternalRegionAccessTestLanguage.g:456:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getNamedAction_0_0(),
                    						current);
                    				

                    }

                    // InternalRegionAccessTestLanguage.g:462:4: ( (lv_name_1_0= RULE_ID ) )
                    // InternalRegionAccessTestLanguage.g:463:5: (lv_name_1_0= RULE_ID )
                    {
                    // InternalRegionAccessTestLanguage.g:463:5: (lv_name_1_0= RULE_ID )
                    // InternalRegionAccessTestLanguage.g:464:6: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

                    						newLeafNode(lv_name_1_0, grammarAccess.getPrimaryAccess().getNameIDTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimaryRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRegionAccessTestLanguage.g:482:3: this_Parenthesized_2= ruleParenthesized
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getParenthesizedParserRuleCall_1());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Parenthesized_2=ruleParenthesized();

                    state._fsp--;


                    			current = this_Parenthesized_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleParenthesized"
    // InternalRegionAccessTestLanguage.g:494:1: entryRuleParenthesized returns [EObject current=null] : iv_ruleParenthesized= ruleParenthesized EOF ;
    public final EObject entryRuleParenthesized() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesized = null;


        try {
            // InternalRegionAccessTestLanguage.g:494:54: (iv_ruleParenthesized= ruleParenthesized EOF )
            // InternalRegionAccessTestLanguage.g:495:2: iv_ruleParenthesized= ruleParenthesized EOF
            {
             newCompositeNode(grammarAccess.getParenthesizedRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleParenthesized=ruleParenthesized();

            state._fsp--;

             current =iv_ruleParenthesized; 
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
    // $ANTLR end "entryRuleParenthesized"


    // $ANTLR start "ruleParenthesized"
    // InternalRegionAccessTestLanguage.g:501:1: ruleParenthesized returns [EObject current=null] : (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) ;
    public final EObject ruleParenthesized() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Expression_1 = null;


        try {
            // InternalRegionAccessTestLanguage.g:502:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) )
            // InternalRegionAccessTestLanguage.g:503:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
            {
            // InternalRegionAccessTestLanguage.g:503:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
            // InternalRegionAccessTestLanguage.g:504:3: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,22,FollowSets000.FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getParenthesizedAccess().getLeftParenthesisKeyword_0());
            		

            			newCompositeNode(grammarAccess.getParenthesizedAccess().getExpressionParserRuleCall_1());
            		
            pushFollow(FollowSets000.FOLLOW_9);
            this_Expression_1=ruleExpression();

            state._fsp--;


            			current = this_Expression_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getParenthesizedAccess().getRightParenthesisKeyword_2());
            		

            }


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
    // $ANTLR end "ruleParenthesized"


    // $ANTLR start "entryRuleMixed"
    // InternalRegionAccessTestLanguage.g:524:1: entryRuleMixed returns [EObject current=null] : iv_ruleMixed= ruleMixed EOF ;
    public final EObject entryRuleMixed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMixed = null;


        try {
            // InternalRegionAccessTestLanguage.g:524:46: (iv_ruleMixed= ruleMixed EOF )
            // InternalRegionAccessTestLanguage.g:525:2: iv_ruleMixed= ruleMixed EOF
            {
             newCompositeNode(grammarAccess.getMixedRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMixed=ruleMixed();

            state._fsp--;

             current =iv_ruleMixed; 
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
    // $ANTLR end "entryRuleMixed"


    // $ANTLR start "ruleMixed"
    // InternalRegionAccessTestLanguage.g:531:1: ruleMixed returns [EObject current=null] : (otherlv_0= '(' (otherlv_1= 'unassigned' (this_ID_2= RULE_ID | ruleDatatype ) )? ( ( () (otherlv_5= 'fragment' this_Fragment_6= ruleFragment[$current] )? ) | this_Mixed_7= ruleMixed | ( ( (lv_name_8_0= RULE_ID ) ) | (otherlv_9= 'child' ( (lv_eobj_10_0= ruleMixed ) ) ) | ( (lv_datatype_11_0= ruleDatatype ) ) | (otherlv_12= 'ref' ( (otherlv_13= RULE_ID ) ) ) | ( (lv_lit_14_0= ruleEnum ) ) ) ) otherlv_15= ')' ( () otherlv_17= 'action' ( ( (lv_body_18_0= ruleMixed ) ) otherlv_19= 'end' )? )* ) ;
    public final EObject ruleMixed() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token this_ID_2=null;
        Token otherlv_5=null;
        Token lv_name_8_0=null;
        Token otherlv_9=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        EObject this_Fragment_6 = null;

        EObject this_Mixed_7 = null;

        EObject lv_eobj_10_0 = null;

        AntlrDatatypeRuleToken lv_datatype_11_0 = null;

        Enumerator lv_lit_14_0 = null;

        EObject lv_body_18_0 = null;


        try {
            // InternalRegionAccessTestLanguage.g:532:1: ( (otherlv_0= '(' (otherlv_1= 'unassigned' (this_ID_2= RULE_ID | ruleDatatype ) )? ( ( () (otherlv_5= 'fragment' this_Fragment_6= ruleFragment[$current] )? ) | this_Mixed_7= ruleMixed | ( ( (lv_name_8_0= RULE_ID ) ) | (otherlv_9= 'child' ( (lv_eobj_10_0= ruleMixed ) ) ) | ( (lv_datatype_11_0= ruleDatatype ) ) | (otherlv_12= 'ref' ( (otherlv_13= RULE_ID ) ) ) | ( (lv_lit_14_0= ruleEnum ) ) ) ) otherlv_15= ')' ( () otherlv_17= 'action' ( ( (lv_body_18_0= ruleMixed ) ) otherlv_19= 'end' )? )* ) )
            // InternalRegionAccessTestLanguage.g:533:2: (otherlv_0= '(' (otherlv_1= 'unassigned' (this_ID_2= RULE_ID | ruleDatatype ) )? ( ( () (otherlv_5= 'fragment' this_Fragment_6= ruleFragment[$current] )? ) | this_Mixed_7= ruleMixed | ( ( (lv_name_8_0= RULE_ID ) ) | (otherlv_9= 'child' ( (lv_eobj_10_0= ruleMixed ) ) ) | ( (lv_datatype_11_0= ruleDatatype ) ) | (otherlv_12= 'ref' ( (otherlv_13= RULE_ID ) ) ) | ( (lv_lit_14_0= ruleEnum ) ) ) ) otherlv_15= ')' ( () otherlv_17= 'action' ( ( (lv_body_18_0= ruleMixed ) ) otherlv_19= 'end' )? )* )
            {
            // InternalRegionAccessTestLanguage.g:533:2: (otherlv_0= '(' (otherlv_1= 'unassigned' (this_ID_2= RULE_ID | ruleDatatype ) )? ( ( () (otherlv_5= 'fragment' this_Fragment_6= ruleFragment[$current] )? ) | this_Mixed_7= ruleMixed | ( ( (lv_name_8_0= RULE_ID ) ) | (otherlv_9= 'child' ( (lv_eobj_10_0= ruleMixed ) ) ) | ( (lv_datatype_11_0= ruleDatatype ) ) | (otherlv_12= 'ref' ( (otherlv_13= RULE_ID ) ) ) | ( (lv_lit_14_0= ruleEnum ) ) ) ) otherlv_15= ')' ( () otherlv_17= 'action' ( ( (lv_body_18_0= ruleMixed ) ) otherlv_19= 'end' )? )* )
            // InternalRegionAccessTestLanguage.g:534:3: otherlv_0= '(' (otherlv_1= 'unassigned' (this_ID_2= RULE_ID | ruleDatatype ) )? ( ( () (otherlv_5= 'fragment' this_Fragment_6= ruleFragment[$current] )? ) | this_Mixed_7= ruleMixed | ( ( (lv_name_8_0= RULE_ID ) ) | (otherlv_9= 'child' ( (lv_eobj_10_0= ruleMixed ) ) ) | ( (lv_datatype_11_0= ruleDatatype ) ) | (otherlv_12= 'ref' ( (otherlv_13= RULE_ID ) ) ) | ( (lv_lit_14_0= ruleEnum ) ) ) ) otherlv_15= ')' ( () otherlv_17= 'action' ( ( (lv_body_18_0= ruleMixed ) ) otherlv_19= 'end' )? )*
            {
            otherlv_0=(Token)match(input,22,FollowSets000.FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getMixedAccess().getLeftParenthesisKeyword_0());
            		
            // InternalRegionAccessTestLanguage.g:538:3: (otherlv_1= 'unassigned' (this_ID_2= RULE_ID | ruleDatatype ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRegionAccessTestLanguage.g:539:4: otherlv_1= 'unassigned' (this_ID_2= RULE_ID | ruleDatatype )
                    {
                    otherlv_1=(Token)match(input,24,FollowSets000.FOLLOW_11); 

                    				newLeafNode(otherlv_1, grammarAccess.getMixedAccess().getUnassignedKeyword_1_0());
                    			
                    // InternalRegionAccessTestLanguage.g:543:4: (this_ID_2= RULE_ID | ruleDatatype )
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==RULE_ID) ) {
                        alt5=1;
                    }
                    else if ( (LA5_0==29) ) {
                        alt5=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 0, input);

                        throw nvae;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalRegionAccessTestLanguage.g:544:5: this_ID_2= RULE_ID
                            {
                            this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_10); 

                            					newLeafNode(this_ID_2, grammarAccess.getMixedAccess().getIDTerminalRuleCall_1_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalRegionAccessTestLanguage.g:549:5: ruleDatatype
                            {

                            					newCompositeNode(grammarAccess.getMixedAccess().getDatatypeParserRuleCall_1_1_1());
                            				
                            pushFollow(FollowSets000.FOLLOW_10);
                            ruleDatatype();

                            state._fsp--;


                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalRegionAccessTestLanguage.g:558:3: ( ( () (otherlv_5= 'fragment' this_Fragment_6= ruleFragment[$current] )? ) | this_Mixed_7= ruleMixed | ( ( (lv_name_8_0= RULE_ID ) ) | (otherlv_9= 'child' ( (lv_eobj_10_0= ruleMixed ) ) ) | ( (lv_datatype_11_0= ruleDatatype ) ) | (otherlv_12= 'ref' ( (otherlv_13= RULE_ID ) ) ) | ( (lv_lit_14_0= ruleEnum ) ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 23:
            case 25:
                {
                alt9=1;
                }
                break;
            case 22:
                {
                alt9=2;
                }
                break;
            case RULE_ID:
            case 26:
            case 27:
            case 29:
            case 31:
            case 32:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalRegionAccessTestLanguage.g:559:4: ( () (otherlv_5= 'fragment' this_Fragment_6= ruleFragment[$current] )? )
                    {
                    // InternalRegionAccessTestLanguage.g:559:4: ( () (otherlv_5= 'fragment' this_Fragment_6= ruleFragment[$current] )? )
                    // InternalRegionAccessTestLanguage.g:560:5: () (otherlv_5= 'fragment' this_Fragment_6= ruleFragment[$current] )?
                    {
                    // InternalRegionAccessTestLanguage.g:560:5: ()
                    // InternalRegionAccessTestLanguage.g:561:6: 
                    {

                    						current = forceCreateModelElement(
                    							grammarAccess.getMixedAccess().getActionAction_2_0_0(),
                    							current);
                    					

                    }

                    // InternalRegionAccessTestLanguage.g:567:5: (otherlv_5= 'fragment' this_Fragment_6= ruleFragment[$current] )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==25) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalRegionAccessTestLanguage.g:568:6: otherlv_5= 'fragment' this_Fragment_6= ruleFragment[$current]
                            {
                            otherlv_5=(Token)match(input,25,FollowSets000.FOLLOW_12); 

                            						newLeafNode(otherlv_5, grammarAccess.getMixedAccess().getFragmentKeyword_2_0_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getMixedRule());
                            						}
                            						newCompositeNode(grammarAccess.getMixedAccess().getFragmentParserRuleCall_2_0_1_1());
                            					
                            pushFollow(FollowSets000.FOLLOW_9);
                            this_Fragment_6=ruleFragment(current);

                            state._fsp--;


                            						current = this_Fragment_6;
                            						afterParserOrEnumRuleCall();
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRegionAccessTestLanguage.g:586:4: this_Mixed_7= ruleMixed
                    {

                    				newCompositeNode(grammarAccess.getMixedAccess().getMixedParserRuleCall_2_1());
                    			
                    pushFollow(FollowSets000.FOLLOW_9);
                    this_Mixed_7=ruleMixed();

                    state._fsp--;


                    				current = this_Mixed_7;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 3 :
                    // InternalRegionAccessTestLanguage.g:595:4: ( ( (lv_name_8_0= RULE_ID ) ) | (otherlv_9= 'child' ( (lv_eobj_10_0= ruleMixed ) ) ) | ( (lv_datatype_11_0= ruleDatatype ) ) | (otherlv_12= 'ref' ( (otherlv_13= RULE_ID ) ) ) | ( (lv_lit_14_0= ruleEnum ) ) )
                    {
                    // InternalRegionAccessTestLanguage.g:595:4: ( ( (lv_name_8_0= RULE_ID ) ) | (otherlv_9= 'child' ( (lv_eobj_10_0= ruleMixed ) ) ) | ( (lv_datatype_11_0= ruleDatatype ) ) | (otherlv_12= 'ref' ( (otherlv_13= RULE_ID ) ) ) | ( (lv_lit_14_0= ruleEnum ) ) )
                    int alt8=5;
                    switch ( input.LA(1) ) {
                    case RULE_ID:
                        {
                        alt8=1;
                        }
                        break;
                    case 26:
                        {
                        alt8=2;
                        }
                        break;
                    case 29:
                        {
                        alt8=3;
                        }
                        break;
                    case 27:
                        {
                        alt8=4;
                        }
                        break;
                    case 31:
                    case 32:
                        {
                        alt8=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 0, input);

                        throw nvae;
                    }

                    switch (alt8) {
                        case 1 :
                            // InternalRegionAccessTestLanguage.g:596:5: ( (lv_name_8_0= RULE_ID ) )
                            {
                            // InternalRegionAccessTestLanguage.g:596:5: ( (lv_name_8_0= RULE_ID ) )
                            // InternalRegionAccessTestLanguage.g:597:6: (lv_name_8_0= RULE_ID )
                            {
                            // InternalRegionAccessTestLanguage.g:597:6: (lv_name_8_0= RULE_ID )
                            // InternalRegionAccessTestLanguage.g:598:7: lv_name_8_0= RULE_ID
                            {
                            lv_name_8_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_9); 

                            							newLeafNode(lv_name_8_0, grammarAccess.getMixedAccess().getNameIDTerminalRuleCall_2_2_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMixedRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"name",
                            								lv_name_8_0,
                            								"org.eclipse.xtext.common.Terminals.ID");
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalRegionAccessTestLanguage.g:615:5: (otherlv_9= 'child' ( (lv_eobj_10_0= ruleMixed ) ) )
                            {
                            // InternalRegionAccessTestLanguage.g:615:5: (otherlv_9= 'child' ( (lv_eobj_10_0= ruleMixed ) ) )
                            // InternalRegionAccessTestLanguage.g:616:6: otherlv_9= 'child' ( (lv_eobj_10_0= ruleMixed ) )
                            {
                            otherlv_9=(Token)match(input,26,FollowSets000.FOLLOW_4); 

                            						newLeafNode(otherlv_9, grammarAccess.getMixedAccess().getChildKeyword_2_2_1_0());
                            					
                            // InternalRegionAccessTestLanguage.g:620:6: ( (lv_eobj_10_0= ruleMixed ) )
                            // InternalRegionAccessTestLanguage.g:621:7: (lv_eobj_10_0= ruleMixed )
                            {
                            // InternalRegionAccessTestLanguage.g:621:7: (lv_eobj_10_0= ruleMixed )
                            // InternalRegionAccessTestLanguage.g:622:8: lv_eobj_10_0= ruleMixed
                            {

                            								newCompositeNode(grammarAccess.getMixedAccess().getEobjMixedParserRuleCall_2_2_1_1_0());
                            							
                            pushFollow(FollowSets000.FOLLOW_9);
                            lv_eobj_10_0=ruleMixed();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getMixedRule());
                            								}
                            								set(
                            									current,
                            									"eobj",
                            									lv_eobj_10_0,
                            									"org.eclipse.xtext.formatting2.regionaccess.internal.RegionAccessTestLanguage.Mixed");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalRegionAccessTestLanguage.g:641:5: ( (lv_datatype_11_0= ruleDatatype ) )
                            {
                            // InternalRegionAccessTestLanguage.g:641:5: ( (lv_datatype_11_0= ruleDatatype ) )
                            // InternalRegionAccessTestLanguage.g:642:6: (lv_datatype_11_0= ruleDatatype )
                            {
                            // InternalRegionAccessTestLanguage.g:642:6: (lv_datatype_11_0= ruleDatatype )
                            // InternalRegionAccessTestLanguage.g:643:7: lv_datatype_11_0= ruleDatatype
                            {

                            							newCompositeNode(grammarAccess.getMixedAccess().getDatatypeDatatypeParserRuleCall_2_2_2_0());
                            						
                            pushFollow(FollowSets000.FOLLOW_9);
                            lv_datatype_11_0=ruleDatatype();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getMixedRule());
                            							}
                            							set(
                            								current,
                            								"datatype",
                            								lv_datatype_11_0,
                            								"org.eclipse.xtext.formatting2.regionaccess.internal.RegionAccessTestLanguage.Datatype");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;
                        case 4 :
                            // InternalRegionAccessTestLanguage.g:661:5: (otherlv_12= 'ref' ( (otherlv_13= RULE_ID ) ) )
                            {
                            // InternalRegionAccessTestLanguage.g:661:5: (otherlv_12= 'ref' ( (otherlv_13= RULE_ID ) ) )
                            // InternalRegionAccessTestLanguage.g:662:6: otherlv_12= 'ref' ( (otherlv_13= RULE_ID ) )
                            {
                            otherlv_12=(Token)match(input,27,FollowSets000.FOLLOW_6); 

                            						newLeafNode(otherlv_12, grammarAccess.getMixedAccess().getRefKeyword_2_2_3_0());
                            					
                            // InternalRegionAccessTestLanguage.g:666:6: ( (otherlv_13= RULE_ID ) )
                            // InternalRegionAccessTestLanguage.g:667:7: (otherlv_13= RULE_ID )
                            {
                            // InternalRegionAccessTestLanguage.g:667:7: (otherlv_13= RULE_ID )
                            // InternalRegionAccessTestLanguage.g:668:8: otherlv_13= RULE_ID
                            {

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getMixedRule());
                            								}
                            							
                            otherlv_13=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_9); 

                            								newLeafNode(otherlv_13, grammarAccess.getMixedAccess().getRefMixedCrossReference_2_2_3_1_0());
                            							

                            }


                            }


                            }


                            }
                            break;
                        case 5 :
                            // InternalRegionAccessTestLanguage.g:681:5: ( (lv_lit_14_0= ruleEnum ) )
                            {
                            // InternalRegionAccessTestLanguage.g:681:5: ( (lv_lit_14_0= ruleEnum ) )
                            // InternalRegionAccessTestLanguage.g:682:6: (lv_lit_14_0= ruleEnum )
                            {
                            // InternalRegionAccessTestLanguage.g:682:6: (lv_lit_14_0= ruleEnum )
                            // InternalRegionAccessTestLanguage.g:683:7: lv_lit_14_0= ruleEnum
                            {

                            							newCompositeNode(grammarAccess.getMixedAccess().getLitEnumEnumRuleCall_2_2_4_0());
                            						
                            pushFollow(FollowSets000.FOLLOW_9);
                            lv_lit_14_0=ruleEnum();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getMixedRule());
                            							}
                            							set(
                            								current,
                            								"lit",
                            								lv_lit_14_0,
                            								"org.eclipse.xtext.formatting2.regionaccess.internal.RegionAccessTestLanguage.Enum");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,23,FollowSets000.FOLLOW_13); 

            			newLeafNode(otherlv_15, grammarAccess.getMixedAccess().getRightParenthesisKeyword_3());
            		
            // InternalRegionAccessTestLanguage.g:706:3: ( () otherlv_17= 'action' ( ( (lv_body_18_0= ruleMixed ) ) otherlv_19= 'end' )? )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==14) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalRegionAccessTestLanguage.g:707:4: () otherlv_17= 'action' ( ( (lv_body_18_0= ruleMixed ) ) otherlv_19= 'end' )?
            	    {
            	    // InternalRegionAccessTestLanguage.g:707:4: ()
            	    // InternalRegionAccessTestLanguage.g:708:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMixedAccess().getAssignedActionChildAction_4_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_14); 

            	    				newLeafNode(otherlv_17, grammarAccess.getMixedAccess().getActionKeyword_4_1());
            	    			
            	    // InternalRegionAccessTestLanguage.g:718:4: ( ( (lv_body_18_0= ruleMixed ) ) otherlv_19= 'end' )?
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==22) ) {
            	        alt10=1;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // InternalRegionAccessTestLanguage.g:719:5: ( (lv_body_18_0= ruleMixed ) ) otherlv_19= 'end'
            	            {
            	            // InternalRegionAccessTestLanguage.g:719:5: ( (lv_body_18_0= ruleMixed ) )
            	            // InternalRegionAccessTestLanguage.g:720:6: (lv_body_18_0= ruleMixed )
            	            {
            	            // InternalRegionAccessTestLanguage.g:720:6: (lv_body_18_0= ruleMixed )
            	            // InternalRegionAccessTestLanguage.g:721:7: lv_body_18_0= ruleMixed
            	            {

            	            							newCompositeNode(grammarAccess.getMixedAccess().getBodyMixedParserRuleCall_4_2_0_0());
            	            						
            	            pushFollow(FollowSets000.FOLLOW_15);
            	            lv_body_18_0=ruleMixed();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getMixedRule());
            	            							}
            	            							set(
            	            								current,
            	            								"body",
            	            								lv_body_18_0,
            	            								"org.eclipse.xtext.formatting2.regionaccess.internal.RegionAccessTestLanguage.Mixed");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }


            	            }

            	            otherlv_19=(Token)match(input,28,FollowSets000.FOLLOW_13); 

            	            					newLeafNode(otherlv_19, grammarAccess.getMixedAccess().getEndKeyword_4_2_1());
            	            				

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


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
    // $ANTLR end "ruleMixed"


    // $ANTLR start "entryRuleDatatype"
    // InternalRegionAccessTestLanguage.g:748:1: entryRuleDatatype returns [String current=null] : iv_ruleDatatype= ruleDatatype EOF ;
    public final String entryRuleDatatype() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDatatype = null;


        try {
            // InternalRegionAccessTestLanguage.g:748:48: (iv_ruleDatatype= ruleDatatype EOF )
            // InternalRegionAccessTestLanguage.g:749:2: iv_ruleDatatype= ruleDatatype EOF
            {
             newCompositeNode(grammarAccess.getDatatypeRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDatatype=ruleDatatype();

            state._fsp--;

             current =iv_ruleDatatype.getText(); 
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
    // $ANTLR end "entryRuleDatatype"


    // $ANTLR start "ruleDatatype"
    // InternalRegionAccessTestLanguage.g:755:1: ruleDatatype returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'datatype' (this_Datatype_1= ruleDatatype | this_ID_2= RULE_ID ) ) ;
    public final AntlrDatatypeRuleToken ruleDatatype() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_2=null;
        AntlrDatatypeRuleToken this_Datatype_1 = null;


        try {
            // InternalRegionAccessTestLanguage.g:756:1: ( (kw= 'datatype' (this_Datatype_1= ruleDatatype | this_ID_2= RULE_ID ) ) )
            // InternalRegionAccessTestLanguage.g:757:2: (kw= 'datatype' (this_Datatype_1= ruleDatatype | this_ID_2= RULE_ID ) )
            {
            // InternalRegionAccessTestLanguage.g:757:2: (kw= 'datatype' (this_Datatype_1= ruleDatatype | this_ID_2= RULE_ID ) )
            // InternalRegionAccessTestLanguage.g:758:3: kw= 'datatype' (this_Datatype_1= ruleDatatype | this_ID_2= RULE_ID )
            {
            kw=(Token)match(input,29,FollowSets000.FOLLOW_11); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDatatypeAccess().getDatatypeKeyword_0());
            		
            // InternalRegionAccessTestLanguage.g:763:3: (this_Datatype_1= ruleDatatype | this_ID_2= RULE_ID )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==29) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_ID) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalRegionAccessTestLanguage.g:764:4: this_Datatype_1= ruleDatatype
                    {

                    				newCompositeNode(grammarAccess.getDatatypeAccess().getDatatypeParserRuleCall_1_0());
                    			
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Datatype_1=ruleDatatype();

                    state._fsp--;


                    				current.merge(this_Datatype_1);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalRegionAccessTestLanguage.g:775:4: this_ID_2= RULE_ID
                    {
                    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

                    				current.merge(this_ID_2);
                    			

                    				newLeafNode(this_ID_2, grammarAccess.getDatatypeAccess().getIDTerminalRuleCall_1_1());
                    			

                    }
                    break;

            }


            }


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
    // $ANTLR end "ruleDatatype"


    // $ANTLR start "ruleFragment"
    // InternalRegionAccessTestLanguage.g:788:1: ruleFragment[EObject in_current] returns [EObject current=in_current] : ( ( (lv_fragName_0_0= RULE_ID ) ) | (otherlv_1= 'child' ( (lv_mixed_2_0= ruleMixed ) ) ) | (otherlv_3= 'recursion' this_Fragment_4= ruleFragment[$current] ) ) ;
    public final EObject ruleFragment(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_fragName_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_mixed_2_0 = null;

        EObject this_Fragment_4 = null;


        try {
            // InternalRegionAccessTestLanguage.g:789:1: ( ( ( (lv_fragName_0_0= RULE_ID ) ) | (otherlv_1= 'child' ( (lv_mixed_2_0= ruleMixed ) ) ) | (otherlv_3= 'recursion' this_Fragment_4= ruleFragment[$current] ) ) )
            // InternalRegionAccessTestLanguage.g:790:2: ( ( (lv_fragName_0_0= RULE_ID ) ) | (otherlv_1= 'child' ( (lv_mixed_2_0= ruleMixed ) ) ) | (otherlv_3= 'recursion' this_Fragment_4= ruleFragment[$current] ) )
            {
            // InternalRegionAccessTestLanguage.g:790:2: ( ( (lv_fragName_0_0= RULE_ID ) ) | (otherlv_1= 'child' ( (lv_mixed_2_0= ruleMixed ) ) ) | (otherlv_3= 'recursion' this_Fragment_4= ruleFragment[$current] ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt13=1;
                }
                break;
            case 26:
                {
                alt13=2;
                }
                break;
            case 30:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalRegionAccessTestLanguage.g:791:3: ( (lv_fragName_0_0= RULE_ID ) )
                    {
                    // InternalRegionAccessTestLanguage.g:791:3: ( (lv_fragName_0_0= RULE_ID ) )
                    // InternalRegionAccessTestLanguage.g:792:4: (lv_fragName_0_0= RULE_ID )
                    {
                    // InternalRegionAccessTestLanguage.g:792:4: (lv_fragName_0_0= RULE_ID )
                    // InternalRegionAccessTestLanguage.g:793:5: lv_fragName_0_0= RULE_ID
                    {
                    lv_fragName_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

                    					newLeafNode(lv_fragName_0_0, grammarAccess.getFragmentAccess().getFragNameIDTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFragmentRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"fragName",
                    						lv_fragName_0_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRegionAccessTestLanguage.g:810:3: (otherlv_1= 'child' ( (lv_mixed_2_0= ruleMixed ) ) )
                    {
                    // InternalRegionAccessTestLanguage.g:810:3: (otherlv_1= 'child' ( (lv_mixed_2_0= ruleMixed ) ) )
                    // InternalRegionAccessTestLanguage.g:811:4: otherlv_1= 'child' ( (lv_mixed_2_0= ruleMixed ) )
                    {
                    otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getFragmentAccess().getChildKeyword_1_0());
                    			
                    // InternalRegionAccessTestLanguage.g:815:4: ( (lv_mixed_2_0= ruleMixed ) )
                    // InternalRegionAccessTestLanguage.g:816:5: (lv_mixed_2_0= ruleMixed )
                    {
                    // InternalRegionAccessTestLanguage.g:816:5: (lv_mixed_2_0= ruleMixed )
                    // InternalRegionAccessTestLanguage.g:817:6: lv_mixed_2_0= ruleMixed
                    {

                    						newCompositeNode(grammarAccess.getFragmentAccess().getMixedMixedParserRuleCall_1_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_mixed_2_0=ruleMixed();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFragmentRule());
                    						}
                    						set(
                    							current,
                    							"mixed",
                    							lv_mixed_2_0,
                    							"org.eclipse.xtext.formatting2.regionaccess.internal.RegionAccessTestLanguage.Mixed");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalRegionAccessTestLanguage.g:836:3: (otherlv_3= 'recursion' this_Fragment_4= ruleFragment[$current] )
                    {
                    // InternalRegionAccessTestLanguage.g:836:3: (otherlv_3= 'recursion' this_Fragment_4= ruleFragment[$current] )
                    // InternalRegionAccessTestLanguage.g:837:4: otherlv_3= 'recursion' this_Fragment_4= ruleFragment[$current]
                    {
                    otherlv_3=(Token)match(input,30,FollowSets000.FOLLOW_12); 

                    				newLeafNode(otherlv_3, grammarAccess.getFragmentAccess().getRecursionKeyword_2_0());
                    			

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getFragmentRule());
                    				}
                    				newCompositeNode(grammarAccess.getFragmentAccess().getFragmentParserRuleCall_2_1());
                    			
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Fragment_4=ruleFragment(current);

                    state._fsp--;


                    				current = this_Fragment_4;
                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleFragment"


    // $ANTLR start "entryRuleValueList"
    // InternalRegionAccessTestLanguage.g:857:1: entryRuleValueList returns [EObject current=null] : iv_ruleValueList= ruleValueList EOF ;
    public final EObject entryRuleValueList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueList = null;


        try {
            // InternalRegionAccessTestLanguage.g:857:50: (iv_ruleValueList= ruleValueList EOF )
            // InternalRegionAccessTestLanguage.g:858:2: iv_ruleValueList= ruleValueList EOF
            {
             newCompositeNode(grammarAccess.getValueListRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleValueList=ruleValueList();

            state._fsp--;

             current =iv_ruleValueList; 
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
    // $ANTLR end "entryRuleValueList"


    // $ANTLR start "ruleValueList"
    // InternalRegionAccessTestLanguage.g:864:1: ruleValueList returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) )* ) ;
    public final EObject ruleValueList() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

        try {
            // InternalRegionAccessTestLanguage.g:865:1: ( ( () ( (lv_name_1_0= RULE_ID ) )* ) )
            // InternalRegionAccessTestLanguage.g:866:2: ( () ( (lv_name_1_0= RULE_ID ) )* )
            {
            // InternalRegionAccessTestLanguage.g:866:2: ( () ( (lv_name_1_0= RULE_ID ) )* )
            // InternalRegionAccessTestLanguage.g:867:3: () ( (lv_name_1_0= RULE_ID ) )*
            {
            // InternalRegionAccessTestLanguage.g:867:3: ()
            // InternalRegionAccessTestLanguage.g:868:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getValueListAccess().getValueListAction_0(),
            					current);
            			

            }

            // InternalRegionAccessTestLanguage.g:874:3: ( (lv_name_1_0= RULE_ID ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalRegionAccessTestLanguage.g:875:4: (lv_name_1_0= RULE_ID )
            	    {
            	    // InternalRegionAccessTestLanguage.g:875:4: (lv_name_1_0= RULE_ID )
            	    // InternalRegionAccessTestLanguage.g:876:5: lv_name_1_0= RULE_ID
            	    {
            	    lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_16); 

            	    					newLeafNode(lv_name_1_0, grammarAccess.getValueListAccess().getNameIDTerminalRuleCall_1_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getValueListRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"name",
            	    						lv_name_1_0,
            	    						"org.eclipse.xtext.common.Terminals.ID");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


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
    // $ANTLR end "ruleValueList"


    // $ANTLR start "ruleEnum"
    // InternalRegionAccessTestLanguage.g:896:1: ruleEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'lit1' ) | (enumLiteral_1= 'lit2' ) ) ;
    public final Enumerator ruleEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

        try {
            // InternalRegionAccessTestLanguage.g:897:1: ( ( (enumLiteral_0= 'lit1' ) | (enumLiteral_1= 'lit2' ) ) )
            // InternalRegionAccessTestLanguage.g:898:2: ( (enumLiteral_0= 'lit1' ) | (enumLiteral_1= 'lit2' ) )
            {
            // InternalRegionAccessTestLanguage.g:898:2: ( (enumLiteral_0= 'lit1' ) | (enumLiteral_1= 'lit2' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==31) ) {
                alt15=1;
            }
            else if ( (LA15_0==32) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalRegionAccessTestLanguage.g:899:3: (enumLiteral_0= 'lit1' )
                    {
                    // InternalRegionAccessTestLanguage.g:899:3: (enumLiteral_0= 'lit1' )
                    // InternalRegionAccessTestLanguage.g:900:4: enumLiteral_0= 'lit1'
                    {
                    enumLiteral_0=(Token)match(input,31,FollowSets000.FOLLOW_2); 

                    				current = grammarAccess.getEnumAccess().getLit1EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEnumAccess().getLit1EnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRegionAccessTestLanguage.g:907:3: (enumLiteral_1= 'lit2' )
                    {
                    // InternalRegionAccessTestLanguage.g:907:3: (enumLiteral_1= 'lit2' )
                    // InternalRegionAccessTestLanguage.g:908:4: enumLiteral_1= 'lit2'
                    {
                    enumLiteral_1=(Token)match(input,32,FollowSets000.FOLLOW_2); 

                    				current = grammarAccess.getEnumAccess().getLit2EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEnumAccess().getLit2EnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleEnum"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000400010L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000404000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000001AFC00010L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000020000010L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000044000010L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000404002L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000012L});
    }


}