package org.eclipse.xtext.serializer.parser.antlr.internal;

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
import org.eclipse.xtext.serializer.services.ContextFinderTestLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalContextFinderTestLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'#0'", "'#1'", "'#2'", "'#3'", "'#4'", "'#5'", "'#6'", "'#7'", "'#8'", "'model'", "'kw1'", "'kw2'", "'.'", "'foo'", "'lit1'", "'lit2'"
    };
    public static final int RULE_STRING=4;
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
    public static final int T__26=26;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalContextFinderTestLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalContextFinderTestLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalContextFinderTestLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalContextFinderTestLanguage.g"; }



     	private ContextFinderTestLanguageGrammarAccess grammarAccess;

        public InternalContextFinderTestLanguageParser(TokenStream input, ContextFinderTestLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected ContextFinderTestLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalContextFinderTestLanguage.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalContextFinderTestLanguage.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalContextFinderTestLanguage.g:66:2: iv_ruleModel= ruleModel EOF
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
    // InternalContextFinderTestLanguage.g:72:1: ruleModel returns [EObject current=null] : ( (otherlv_0= '#0' ( (lv_model_1_0= ruleModel2 ) ) ) | (otherlv_2= '#1' ( ( (lv_attributeExclusion_3_1= ruleAttributeExclusionTest1 | lv_attributeExclusion_3_2= ruleAttributeExclusionTest2 ) ) ) ) | (otherlv_4= '#2' ( ( (lv_nestedType_5_1= ruleNestedTypeTest1 | lv_nestedType_5_2= ruleNestedTypeTest2 ) ) ) ) | (otherlv_6= '#3' ( ( (lv_nestedTypeRecursiveTest2_7_1= ruleNestedTypeRecursiveTest1 | lv_nestedTypeRecursiveTest2_7_2= ruleNestedTypeRecursiveTest2 ) ) ) ) | (otherlv_8= '#4' ( ( (lv_parentRef_9_1= ruleParentRefTest1 | lv_parentRef_9_2= ruleParentRefTest2 ) ) ) ) | (otherlv_10= '#5' ( ( (lv_quantityExclusion_11_1= ruleQuantityExclusionTest1 | lv_quantityExclusion_11_2= ruleQuantityExclusionTest2 ) ) ) ) | (otherlv_12= '#6' ( ( (lv_valueExclusion_13_1= ruleValueExclusionTest1 | lv_valueExclusion_13_2= ruleValueExclusionTest2 ) ) ) ) | (otherlv_14= '#7' ( (lv_name_15_0= RULE_STRING ) ) ( ( (lv_nodeExclusion_16_1= ruleNodeExclusion1 | lv_nodeExclusion_16_2= ruleNodeExclusion2 ) ) ) ) | (otherlv_17= '#8' ( (lv_name_18_0= RULE_STRING ) ) ( ( (lv_nodeExclusionList_19_1= ruleNodeExclusion1List | lv_nodeExclusionList_19_2= ruleNodeExclusion2List ) ) ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token lv_name_15_0=null;
        Token otherlv_17=null;
        Token lv_name_18_0=null;
        EObject lv_model_1_0 = null;

        EObject lv_attributeExclusion_3_1 = null;

        EObject lv_attributeExclusion_3_2 = null;

        EObject lv_nestedType_5_1 = null;

        EObject lv_nestedType_5_2 = null;

        EObject lv_nestedTypeRecursiveTest2_7_1 = null;

        EObject lv_nestedTypeRecursiveTest2_7_2 = null;

        EObject lv_parentRef_9_1 = null;

        EObject lv_parentRef_9_2 = null;

        EObject lv_quantityExclusion_11_1 = null;

        EObject lv_quantityExclusion_11_2 = null;

        EObject lv_valueExclusion_13_1 = null;

        EObject lv_valueExclusion_13_2 = null;

        EObject lv_nodeExclusion_16_1 = null;

        EObject lv_nodeExclusion_16_2 = null;

        EObject lv_nodeExclusionList_19_1 = null;

        EObject lv_nodeExclusionList_19_2 = null;


        try {
            // InternalContextFinderTestLanguage.g:73:1: ( ( (otherlv_0= '#0' ( (lv_model_1_0= ruleModel2 ) ) ) | (otherlv_2= '#1' ( ( (lv_attributeExclusion_3_1= ruleAttributeExclusionTest1 | lv_attributeExclusion_3_2= ruleAttributeExclusionTest2 ) ) ) ) | (otherlv_4= '#2' ( ( (lv_nestedType_5_1= ruleNestedTypeTest1 | lv_nestedType_5_2= ruleNestedTypeTest2 ) ) ) ) | (otherlv_6= '#3' ( ( (lv_nestedTypeRecursiveTest2_7_1= ruleNestedTypeRecursiveTest1 | lv_nestedTypeRecursiveTest2_7_2= ruleNestedTypeRecursiveTest2 ) ) ) ) | (otherlv_8= '#4' ( ( (lv_parentRef_9_1= ruleParentRefTest1 | lv_parentRef_9_2= ruleParentRefTest2 ) ) ) ) | (otherlv_10= '#5' ( ( (lv_quantityExclusion_11_1= ruleQuantityExclusionTest1 | lv_quantityExclusion_11_2= ruleQuantityExclusionTest2 ) ) ) ) | (otherlv_12= '#6' ( ( (lv_valueExclusion_13_1= ruleValueExclusionTest1 | lv_valueExclusion_13_2= ruleValueExclusionTest2 ) ) ) ) | (otherlv_14= '#7' ( (lv_name_15_0= RULE_STRING ) ) ( ( (lv_nodeExclusion_16_1= ruleNodeExclusion1 | lv_nodeExclusion_16_2= ruleNodeExclusion2 ) ) ) ) | (otherlv_17= '#8' ( (lv_name_18_0= RULE_STRING ) ) ( ( (lv_nodeExclusionList_19_1= ruleNodeExclusion1List | lv_nodeExclusionList_19_2= ruleNodeExclusion2List ) ) ) ) ) )
            // InternalContextFinderTestLanguage.g:74:2: ( (otherlv_0= '#0' ( (lv_model_1_0= ruleModel2 ) ) ) | (otherlv_2= '#1' ( ( (lv_attributeExclusion_3_1= ruleAttributeExclusionTest1 | lv_attributeExclusion_3_2= ruleAttributeExclusionTest2 ) ) ) ) | (otherlv_4= '#2' ( ( (lv_nestedType_5_1= ruleNestedTypeTest1 | lv_nestedType_5_2= ruleNestedTypeTest2 ) ) ) ) | (otherlv_6= '#3' ( ( (lv_nestedTypeRecursiveTest2_7_1= ruleNestedTypeRecursiveTest1 | lv_nestedTypeRecursiveTest2_7_2= ruleNestedTypeRecursiveTest2 ) ) ) ) | (otherlv_8= '#4' ( ( (lv_parentRef_9_1= ruleParentRefTest1 | lv_parentRef_9_2= ruleParentRefTest2 ) ) ) ) | (otherlv_10= '#5' ( ( (lv_quantityExclusion_11_1= ruleQuantityExclusionTest1 | lv_quantityExclusion_11_2= ruleQuantityExclusionTest2 ) ) ) ) | (otherlv_12= '#6' ( ( (lv_valueExclusion_13_1= ruleValueExclusionTest1 | lv_valueExclusion_13_2= ruleValueExclusionTest2 ) ) ) ) | (otherlv_14= '#7' ( (lv_name_15_0= RULE_STRING ) ) ( ( (lv_nodeExclusion_16_1= ruleNodeExclusion1 | lv_nodeExclusion_16_2= ruleNodeExclusion2 ) ) ) ) | (otherlv_17= '#8' ( (lv_name_18_0= RULE_STRING ) ) ( ( (lv_nodeExclusionList_19_1= ruleNodeExclusion1List | lv_nodeExclusionList_19_2= ruleNodeExclusion2List ) ) ) ) )
            {
            // InternalContextFinderTestLanguage.g:74:2: ( (otherlv_0= '#0' ( (lv_model_1_0= ruleModel2 ) ) ) | (otherlv_2= '#1' ( ( (lv_attributeExclusion_3_1= ruleAttributeExclusionTest1 | lv_attributeExclusion_3_2= ruleAttributeExclusionTest2 ) ) ) ) | (otherlv_4= '#2' ( ( (lv_nestedType_5_1= ruleNestedTypeTest1 | lv_nestedType_5_2= ruleNestedTypeTest2 ) ) ) ) | (otherlv_6= '#3' ( ( (lv_nestedTypeRecursiveTest2_7_1= ruleNestedTypeRecursiveTest1 | lv_nestedTypeRecursiveTest2_7_2= ruleNestedTypeRecursiveTest2 ) ) ) ) | (otherlv_8= '#4' ( ( (lv_parentRef_9_1= ruleParentRefTest1 | lv_parentRef_9_2= ruleParentRefTest2 ) ) ) ) | (otherlv_10= '#5' ( ( (lv_quantityExclusion_11_1= ruleQuantityExclusionTest1 | lv_quantityExclusion_11_2= ruleQuantityExclusionTest2 ) ) ) ) | (otherlv_12= '#6' ( ( (lv_valueExclusion_13_1= ruleValueExclusionTest1 | lv_valueExclusion_13_2= ruleValueExclusionTest2 ) ) ) ) | (otherlv_14= '#7' ( (lv_name_15_0= RULE_STRING ) ) ( ( (lv_nodeExclusion_16_1= ruleNodeExclusion1 | lv_nodeExclusion_16_2= ruleNodeExclusion2 ) ) ) ) | (otherlv_17= '#8' ( (lv_name_18_0= RULE_STRING ) ) ( ( (lv_nodeExclusionList_19_1= ruleNodeExclusion1List | lv_nodeExclusionList_19_2= ruleNodeExclusion2List ) ) ) ) )
            int alt9=9;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt9=1;
                }
                break;
            case 12:
                {
                alt9=2;
                }
                break;
            case 13:
                {
                alt9=3;
                }
                break;
            case 14:
                {
                alt9=4;
                }
                break;
            case 15:
                {
                alt9=5;
                }
                break;
            case 16:
                {
                alt9=6;
                }
                break;
            case 17:
                {
                alt9=7;
                }
                break;
            case 18:
                {
                alt9=8;
                }
                break;
            case 19:
                {
                alt9=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalContextFinderTestLanguage.g:75:3: (otherlv_0= '#0' ( (lv_model_1_0= ruleModel2 ) ) )
                    {
                    // InternalContextFinderTestLanguage.g:75:3: (otherlv_0= '#0' ( (lv_model_1_0= ruleModel2 ) ) )
                    // InternalContextFinderTestLanguage.g:76:4: otherlv_0= '#0' ( (lv_model_1_0= ruleModel2 ) )
                    {
                    otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getModelAccess().getNumberSignDigitZeroKeyword_0_0());
                    			
                    // InternalContextFinderTestLanguage.g:80:4: ( (lv_model_1_0= ruleModel2 ) )
                    // InternalContextFinderTestLanguage.g:81:5: (lv_model_1_0= ruleModel2 )
                    {
                    // InternalContextFinderTestLanguage.g:81:5: (lv_model_1_0= ruleModel2 )
                    // InternalContextFinderTestLanguage.g:82:6: lv_model_1_0= ruleModel2
                    {

                    						newCompositeNode(grammarAccess.getModelAccess().getModelModel2ParserRuleCall_0_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_model_1_0=ruleModel2();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getModelRule());
                    						}
                    						set(
                    							current,
                    							"model",
                    							lv_model_1_0,
                    							"org.eclipse.xtext.serializer.ContextFinderTestLanguage.Model2");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalContextFinderTestLanguage.g:101:3: (otherlv_2= '#1' ( ( (lv_attributeExclusion_3_1= ruleAttributeExclusionTest1 | lv_attributeExclusion_3_2= ruleAttributeExclusionTest2 ) ) ) )
                    {
                    // InternalContextFinderTestLanguage.g:101:3: (otherlv_2= '#1' ( ( (lv_attributeExclusion_3_1= ruleAttributeExclusionTest1 | lv_attributeExclusion_3_2= ruleAttributeExclusionTest2 ) ) ) )
                    // InternalContextFinderTestLanguage.g:102:4: otherlv_2= '#1' ( ( (lv_attributeExclusion_3_1= ruleAttributeExclusionTest1 | lv_attributeExclusion_3_2= ruleAttributeExclusionTest2 ) ) )
                    {
                    otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getModelAccess().getNumberSignDigitOneKeyword_1_0());
                    			
                    // InternalContextFinderTestLanguage.g:106:4: ( ( (lv_attributeExclusion_3_1= ruleAttributeExclusionTest1 | lv_attributeExclusion_3_2= ruleAttributeExclusionTest2 ) ) )
                    // InternalContextFinderTestLanguage.g:107:5: ( (lv_attributeExclusion_3_1= ruleAttributeExclusionTest1 | lv_attributeExclusion_3_2= ruleAttributeExclusionTest2 ) )
                    {
                    // InternalContextFinderTestLanguage.g:107:5: ( (lv_attributeExclusion_3_1= ruleAttributeExclusionTest1 | lv_attributeExclusion_3_2= ruleAttributeExclusionTest2 ) )
                    // InternalContextFinderTestLanguage.g:108:6: (lv_attributeExclusion_3_1= ruleAttributeExclusionTest1 | lv_attributeExclusion_3_2= ruleAttributeExclusionTest2 )
                    {
                    // InternalContextFinderTestLanguage.g:108:6: (lv_attributeExclusion_3_1= ruleAttributeExclusionTest1 | lv_attributeExclusion_3_2= ruleAttributeExclusionTest2 )
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==21) ) {
                        alt1=1;
                    }
                    else if ( (LA1_0==22) ) {
                        alt1=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 0, input);

                        throw nvae;
                    }
                    switch (alt1) {
                        case 1 :
                            // InternalContextFinderTestLanguage.g:109:7: lv_attributeExclusion_3_1= ruleAttributeExclusionTest1
                            {

                            							newCompositeNode(grammarAccess.getModelAccess().getAttributeExclusionAttributeExclusionTest1ParserRuleCall_1_1_0_0());
                            						
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_attributeExclusion_3_1=ruleAttributeExclusionTest1();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getModelRule());
                            							}
                            							set(
                            								current,
                            								"attributeExclusion",
                            								lv_attributeExclusion_3_1,
                            								"org.eclipse.xtext.serializer.ContextFinderTestLanguage.AttributeExclusionTest1");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;
                        case 2 :
                            // InternalContextFinderTestLanguage.g:125:7: lv_attributeExclusion_3_2= ruleAttributeExclusionTest2
                            {

                            							newCompositeNode(grammarAccess.getModelAccess().getAttributeExclusionAttributeExclusionTest2ParserRuleCall_1_1_0_1());
                            						
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_attributeExclusion_3_2=ruleAttributeExclusionTest2();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getModelRule());
                            							}
                            							set(
                            								current,
                            								"attributeExclusion",
                            								lv_attributeExclusion_3_2,
                            								"org.eclipse.xtext.serializer.ContextFinderTestLanguage.AttributeExclusionTest2");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalContextFinderTestLanguage.g:145:3: (otherlv_4= '#2' ( ( (lv_nestedType_5_1= ruleNestedTypeTest1 | lv_nestedType_5_2= ruleNestedTypeTest2 ) ) ) )
                    {
                    // InternalContextFinderTestLanguage.g:145:3: (otherlv_4= '#2' ( ( (lv_nestedType_5_1= ruleNestedTypeTest1 | lv_nestedType_5_2= ruleNestedTypeTest2 ) ) ) )
                    // InternalContextFinderTestLanguage.g:146:4: otherlv_4= '#2' ( ( (lv_nestedType_5_1= ruleNestedTypeTest1 | lv_nestedType_5_2= ruleNestedTypeTest2 ) ) )
                    {
                    otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getModelAccess().getNumberSignDigitTwoKeyword_2_0());
                    			
                    // InternalContextFinderTestLanguage.g:150:4: ( ( (lv_nestedType_5_1= ruleNestedTypeTest1 | lv_nestedType_5_2= ruleNestedTypeTest2 ) ) )
                    // InternalContextFinderTestLanguage.g:151:5: ( (lv_nestedType_5_1= ruleNestedTypeTest1 | lv_nestedType_5_2= ruleNestedTypeTest2 ) )
                    {
                    // InternalContextFinderTestLanguage.g:151:5: ( (lv_nestedType_5_1= ruleNestedTypeTest1 | lv_nestedType_5_2= ruleNestedTypeTest2 ) )
                    // InternalContextFinderTestLanguage.g:152:6: (lv_nestedType_5_1= ruleNestedTypeTest1 | lv_nestedType_5_2= ruleNestedTypeTest2 )
                    {
                    // InternalContextFinderTestLanguage.g:152:6: (lv_nestedType_5_1= ruleNestedTypeTest1 | lv_nestedType_5_2= ruleNestedTypeTest2 )
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==21) ) {
                        alt2=1;
                    }
                    else if ( (LA2_0==22) ) {
                        alt2=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 0, input);

                        throw nvae;
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalContextFinderTestLanguage.g:153:7: lv_nestedType_5_1= ruleNestedTypeTest1
                            {

                            							newCompositeNode(grammarAccess.getModelAccess().getNestedTypeNestedTypeTest1ParserRuleCall_2_1_0_0());
                            						
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_nestedType_5_1=ruleNestedTypeTest1();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getModelRule());
                            							}
                            							set(
                            								current,
                            								"nestedType",
                            								lv_nestedType_5_1,
                            								"org.eclipse.xtext.serializer.ContextFinderTestLanguage.NestedTypeTest1");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;
                        case 2 :
                            // InternalContextFinderTestLanguage.g:169:7: lv_nestedType_5_2= ruleNestedTypeTest2
                            {

                            							newCompositeNode(grammarAccess.getModelAccess().getNestedTypeNestedTypeTest2ParserRuleCall_2_1_0_1());
                            						
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_nestedType_5_2=ruleNestedTypeTest2();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getModelRule());
                            							}
                            							set(
                            								current,
                            								"nestedType",
                            								lv_nestedType_5_2,
                            								"org.eclipse.xtext.serializer.ContextFinderTestLanguage.NestedTypeTest2");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalContextFinderTestLanguage.g:189:3: (otherlv_6= '#3' ( ( (lv_nestedTypeRecursiveTest2_7_1= ruleNestedTypeRecursiveTest1 | lv_nestedTypeRecursiveTest2_7_2= ruleNestedTypeRecursiveTest2 ) ) ) )
                    {
                    // InternalContextFinderTestLanguage.g:189:3: (otherlv_6= '#3' ( ( (lv_nestedTypeRecursiveTest2_7_1= ruleNestedTypeRecursiveTest1 | lv_nestedTypeRecursiveTest2_7_2= ruleNestedTypeRecursiveTest2 ) ) ) )
                    // InternalContextFinderTestLanguage.g:190:4: otherlv_6= '#3' ( ( (lv_nestedTypeRecursiveTest2_7_1= ruleNestedTypeRecursiveTest1 | lv_nestedTypeRecursiveTest2_7_2= ruleNestedTypeRecursiveTest2 ) ) )
                    {
                    otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getModelAccess().getNumberSignDigitThreeKeyword_3_0());
                    			
                    // InternalContextFinderTestLanguage.g:194:4: ( ( (lv_nestedTypeRecursiveTest2_7_1= ruleNestedTypeRecursiveTest1 | lv_nestedTypeRecursiveTest2_7_2= ruleNestedTypeRecursiveTest2 ) ) )
                    // InternalContextFinderTestLanguage.g:195:5: ( (lv_nestedTypeRecursiveTest2_7_1= ruleNestedTypeRecursiveTest1 | lv_nestedTypeRecursiveTest2_7_2= ruleNestedTypeRecursiveTest2 ) )
                    {
                    // InternalContextFinderTestLanguage.g:195:5: ( (lv_nestedTypeRecursiveTest2_7_1= ruleNestedTypeRecursiveTest1 | lv_nestedTypeRecursiveTest2_7_2= ruleNestedTypeRecursiveTest2 ) )
                    // InternalContextFinderTestLanguage.g:196:6: (lv_nestedTypeRecursiveTest2_7_1= ruleNestedTypeRecursiveTest1 | lv_nestedTypeRecursiveTest2_7_2= ruleNestedTypeRecursiveTest2 )
                    {
                    // InternalContextFinderTestLanguage.g:196:6: (lv_nestedTypeRecursiveTest2_7_1= ruleNestedTypeRecursiveTest1 | lv_nestedTypeRecursiveTest2_7_2= ruleNestedTypeRecursiveTest2 )
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==21) ) {
                        alt3=1;
                    }
                    else if ( (LA3_0==22) ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 0, input);

                        throw nvae;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalContextFinderTestLanguage.g:197:7: lv_nestedTypeRecursiveTest2_7_1= ruleNestedTypeRecursiveTest1
                            {

                            							newCompositeNode(grammarAccess.getModelAccess().getNestedTypeRecursiveTest2NestedTypeRecursiveTest1ParserRuleCall_3_1_0_0());
                            						
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_nestedTypeRecursiveTest2_7_1=ruleNestedTypeRecursiveTest1();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getModelRule());
                            							}
                            							set(
                            								current,
                            								"nestedTypeRecursiveTest2",
                            								lv_nestedTypeRecursiveTest2_7_1,
                            								"org.eclipse.xtext.serializer.ContextFinderTestLanguage.NestedTypeRecursiveTest1");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;
                        case 2 :
                            // InternalContextFinderTestLanguage.g:213:7: lv_nestedTypeRecursiveTest2_7_2= ruleNestedTypeRecursiveTest2
                            {

                            							newCompositeNode(grammarAccess.getModelAccess().getNestedTypeRecursiveTest2NestedTypeRecursiveTest2ParserRuleCall_3_1_0_1());
                            						
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_nestedTypeRecursiveTest2_7_2=ruleNestedTypeRecursiveTest2();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getModelRule());
                            							}
                            							set(
                            								current,
                            								"nestedTypeRecursiveTest2",
                            								lv_nestedTypeRecursiveTest2_7_2,
                            								"org.eclipse.xtext.serializer.ContextFinderTestLanguage.NestedTypeRecursiveTest2");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalContextFinderTestLanguage.g:233:3: (otherlv_8= '#4' ( ( (lv_parentRef_9_1= ruleParentRefTest1 | lv_parentRef_9_2= ruleParentRefTest2 ) ) ) )
                    {
                    // InternalContextFinderTestLanguage.g:233:3: (otherlv_8= '#4' ( ( (lv_parentRef_9_1= ruleParentRefTest1 | lv_parentRef_9_2= ruleParentRefTest2 ) ) ) )
                    // InternalContextFinderTestLanguage.g:234:4: otherlv_8= '#4' ( ( (lv_parentRef_9_1= ruleParentRefTest1 | lv_parentRef_9_2= ruleParentRefTest2 ) ) )
                    {
                    otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getModelAccess().getNumberSignDigitFourKeyword_4_0());
                    			
                    // InternalContextFinderTestLanguage.g:238:4: ( ( (lv_parentRef_9_1= ruleParentRefTest1 | lv_parentRef_9_2= ruleParentRefTest2 ) ) )
                    // InternalContextFinderTestLanguage.g:239:5: ( (lv_parentRef_9_1= ruleParentRefTest1 | lv_parentRef_9_2= ruleParentRefTest2 ) )
                    {
                    // InternalContextFinderTestLanguage.g:239:5: ( (lv_parentRef_9_1= ruleParentRefTest1 | lv_parentRef_9_2= ruleParentRefTest2 ) )
                    // InternalContextFinderTestLanguage.g:240:6: (lv_parentRef_9_1= ruleParentRefTest1 | lv_parentRef_9_2= ruleParentRefTest2 )
                    {
                    // InternalContextFinderTestLanguage.g:240:6: (lv_parentRef_9_1= ruleParentRefTest1 | lv_parentRef_9_2= ruleParentRefTest2 )
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==21) ) {
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
                            // InternalContextFinderTestLanguage.g:241:7: lv_parentRef_9_1= ruleParentRefTest1
                            {

                            							newCompositeNode(grammarAccess.getModelAccess().getParentRefParentRefTest1ParserRuleCall_4_1_0_0());
                            						
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_parentRef_9_1=ruleParentRefTest1();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getModelRule());
                            							}
                            							set(
                            								current,
                            								"parentRef",
                            								lv_parentRef_9_1,
                            								"org.eclipse.xtext.serializer.ContextFinderTestLanguage.ParentRefTest1");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;
                        case 2 :
                            // InternalContextFinderTestLanguage.g:257:7: lv_parentRef_9_2= ruleParentRefTest2
                            {

                            							newCompositeNode(grammarAccess.getModelAccess().getParentRefParentRefTest2ParserRuleCall_4_1_0_1());
                            						
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_parentRef_9_2=ruleParentRefTest2();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getModelRule());
                            							}
                            							set(
                            								current,
                            								"parentRef",
                            								lv_parentRef_9_2,
                            								"org.eclipse.xtext.serializer.ContextFinderTestLanguage.ParentRefTest2");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalContextFinderTestLanguage.g:277:3: (otherlv_10= '#5' ( ( (lv_quantityExclusion_11_1= ruleQuantityExclusionTest1 | lv_quantityExclusion_11_2= ruleQuantityExclusionTest2 ) ) ) )
                    {
                    // InternalContextFinderTestLanguage.g:277:3: (otherlv_10= '#5' ( ( (lv_quantityExclusion_11_1= ruleQuantityExclusionTest1 | lv_quantityExclusion_11_2= ruleQuantityExclusionTest2 ) ) ) )
                    // InternalContextFinderTestLanguage.g:278:4: otherlv_10= '#5' ( ( (lv_quantityExclusion_11_1= ruleQuantityExclusionTest1 | lv_quantityExclusion_11_2= ruleQuantityExclusionTest2 ) ) )
                    {
                    otherlv_10=(Token)match(input,16,FollowSets000.FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getModelAccess().getNumberSignDigitFiveKeyword_5_0());
                    			
                    // InternalContextFinderTestLanguage.g:282:4: ( ( (lv_quantityExclusion_11_1= ruleQuantityExclusionTest1 | lv_quantityExclusion_11_2= ruleQuantityExclusionTest2 ) ) )
                    // InternalContextFinderTestLanguage.g:283:5: ( (lv_quantityExclusion_11_1= ruleQuantityExclusionTest1 | lv_quantityExclusion_11_2= ruleQuantityExclusionTest2 ) )
                    {
                    // InternalContextFinderTestLanguage.g:283:5: ( (lv_quantityExclusion_11_1= ruleQuantityExclusionTest1 | lv_quantityExclusion_11_2= ruleQuantityExclusionTest2 ) )
                    // InternalContextFinderTestLanguage.g:284:6: (lv_quantityExclusion_11_1= ruleQuantityExclusionTest1 | lv_quantityExclusion_11_2= ruleQuantityExclusionTest2 )
                    {
                    // InternalContextFinderTestLanguage.g:284:6: (lv_quantityExclusion_11_1= ruleQuantityExclusionTest1 | lv_quantityExclusion_11_2= ruleQuantityExclusionTest2 )
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==21) ) {
                        alt5=1;
                    }
                    else if ( (LA5_0==22) ) {
                        alt5=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 0, input);

                        throw nvae;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalContextFinderTestLanguage.g:285:7: lv_quantityExclusion_11_1= ruleQuantityExclusionTest1
                            {

                            							newCompositeNode(grammarAccess.getModelAccess().getQuantityExclusionQuantityExclusionTest1ParserRuleCall_5_1_0_0());
                            						
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_quantityExclusion_11_1=ruleQuantityExclusionTest1();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getModelRule());
                            							}
                            							set(
                            								current,
                            								"quantityExclusion",
                            								lv_quantityExclusion_11_1,
                            								"org.eclipse.xtext.serializer.ContextFinderTestLanguage.QuantityExclusionTest1");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;
                        case 2 :
                            // InternalContextFinderTestLanguage.g:301:7: lv_quantityExclusion_11_2= ruleQuantityExclusionTest2
                            {

                            							newCompositeNode(grammarAccess.getModelAccess().getQuantityExclusionQuantityExclusionTest2ParserRuleCall_5_1_0_1());
                            						
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_quantityExclusion_11_2=ruleQuantityExclusionTest2();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getModelRule());
                            							}
                            							set(
                            								current,
                            								"quantityExclusion",
                            								lv_quantityExclusion_11_2,
                            								"org.eclipse.xtext.serializer.ContextFinderTestLanguage.QuantityExclusionTest2");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalContextFinderTestLanguage.g:321:3: (otherlv_12= '#6' ( ( (lv_valueExclusion_13_1= ruleValueExclusionTest1 | lv_valueExclusion_13_2= ruleValueExclusionTest2 ) ) ) )
                    {
                    // InternalContextFinderTestLanguage.g:321:3: (otherlv_12= '#6' ( ( (lv_valueExclusion_13_1= ruleValueExclusionTest1 | lv_valueExclusion_13_2= ruleValueExclusionTest2 ) ) ) )
                    // InternalContextFinderTestLanguage.g:322:4: otherlv_12= '#6' ( ( (lv_valueExclusion_13_1= ruleValueExclusionTest1 | lv_valueExclusion_13_2= ruleValueExclusionTest2 ) ) )
                    {
                    otherlv_12=(Token)match(input,17,FollowSets000.FOLLOW_5); 

                    				newLeafNode(otherlv_12, grammarAccess.getModelAccess().getNumberSignDigitSixKeyword_6_0());
                    			
                    // InternalContextFinderTestLanguage.g:326:4: ( ( (lv_valueExclusion_13_1= ruleValueExclusionTest1 | lv_valueExclusion_13_2= ruleValueExclusionTest2 ) ) )
                    // InternalContextFinderTestLanguage.g:327:5: ( (lv_valueExclusion_13_1= ruleValueExclusionTest1 | lv_valueExclusion_13_2= ruleValueExclusionTest2 ) )
                    {
                    // InternalContextFinderTestLanguage.g:327:5: ( (lv_valueExclusion_13_1= ruleValueExclusionTest1 | lv_valueExclusion_13_2= ruleValueExclusionTest2 ) )
                    // InternalContextFinderTestLanguage.g:328:6: (lv_valueExclusion_13_1= ruleValueExclusionTest1 | lv_valueExclusion_13_2= ruleValueExclusionTest2 )
                    {
                    // InternalContextFinderTestLanguage.g:328:6: (lv_valueExclusion_13_1= ruleValueExclusionTest1 | lv_valueExclusion_13_2= ruleValueExclusionTest2 )
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==25) ) {
                        alt6=1;
                    }
                    else if ( (LA6_0==26) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 0, input);

                        throw nvae;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalContextFinderTestLanguage.g:329:7: lv_valueExclusion_13_1= ruleValueExclusionTest1
                            {

                            							newCompositeNode(grammarAccess.getModelAccess().getValueExclusionValueExclusionTest1ParserRuleCall_6_1_0_0());
                            						
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_valueExclusion_13_1=ruleValueExclusionTest1();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getModelRule());
                            							}
                            							set(
                            								current,
                            								"valueExclusion",
                            								lv_valueExclusion_13_1,
                            								"org.eclipse.xtext.serializer.ContextFinderTestLanguage.ValueExclusionTest1");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;
                        case 2 :
                            // InternalContextFinderTestLanguage.g:345:7: lv_valueExclusion_13_2= ruleValueExclusionTest2
                            {

                            							newCompositeNode(grammarAccess.getModelAccess().getValueExclusionValueExclusionTest2ParserRuleCall_6_1_0_1());
                            						
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_valueExclusion_13_2=ruleValueExclusionTest2();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getModelRule());
                            							}
                            							set(
                            								current,
                            								"valueExclusion",
                            								lv_valueExclusion_13_2,
                            								"org.eclipse.xtext.serializer.ContextFinderTestLanguage.ValueExclusionTest2");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalContextFinderTestLanguage.g:365:3: (otherlv_14= '#7' ( (lv_name_15_0= RULE_STRING ) ) ( ( (lv_nodeExclusion_16_1= ruleNodeExclusion1 | lv_nodeExclusion_16_2= ruleNodeExclusion2 ) ) ) )
                    {
                    // InternalContextFinderTestLanguage.g:365:3: (otherlv_14= '#7' ( (lv_name_15_0= RULE_STRING ) ) ( ( (lv_nodeExclusion_16_1= ruleNodeExclusion1 | lv_nodeExclusion_16_2= ruleNodeExclusion2 ) ) ) )
                    // InternalContextFinderTestLanguage.g:366:4: otherlv_14= '#7' ( (lv_name_15_0= RULE_STRING ) ) ( ( (lv_nodeExclusion_16_1= ruleNodeExclusion1 | lv_nodeExclusion_16_2= ruleNodeExclusion2 ) ) )
                    {
                    otherlv_14=(Token)match(input,18,FollowSets000.FOLLOW_6); 

                    				newLeafNode(otherlv_14, grammarAccess.getModelAccess().getNumberSignDigitSevenKeyword_7_0());
                    			
                    // InternalContextFinderTestLanguage.g:370:4: ( (lv_name_15_0= RULE_STRING ) )
                    // InternalContextFinderTestLanguage.g:371:5: (lv_name_15_0= RULE_STRING )
                    {
                    // InternalContextFinderTestLanguage.g:371:5: (lv_name_15_0= RULE_STRING )
                    // InternalContextFinderTestLanguage.g:372:6: lv_name_15_0= RULE_STRING
                    {
                    lv_name_15_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_7); 

                    						newLeafNode(lv_name_15_0, grammarAccess.getModelAccess().getNameSTRINGTerminalRuleCall_7_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getModelRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_15_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    // InternalContextFinderTestLanguage.g:388:4: ( ( (lv_nodeExclusion_16_1= ruleNodeExclusion1 | lv_nodeExclusion_16_2= ruleNodeExclusion2 ) ) )
                    // InternalContextFinderTestLanguage.g:389:5: ( (lv_nodeExclusion_16_1= ruleNodeExclusion1 | lv_nodeExclusion_16_2= ruleNodeExclusion2 ) )
                    {
                    // InternalContextFinderTestLanguage.g:389:5: ( (lv_nodeExclusion_16_1= ruleNodeExclusion1 | lv_nodeExclusion_16_2= ruleNodeExclusion2 ) )
                    // InternalContextFinderTestLanguage.g:390:6: (lv_nodeExclusion_16_1= ruleNodeExclusion1 | lv_nodeExclusion_16_2= ruleNodeExclusion2 )
                    {
                    // InternalContextFinderTestLanguage.g:390:6: (lv_nodeExclusion_16_1= ruleNodeExclusion1 | lv_nodeExclusion_16_2= ruleNodeExclusion2 )
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==RULE_ID) ) {
                        alt7=1;
                    }
                    else if ( (LA7_0==RULE_STRING) ) {
                        alt7=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 0, input);

                        throw nvae;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalContextFinderTestLanguage.g:391:7: lv_nodeExclusion_16_1= ruleNodeExclusion1
                            {

                            							newCompositeNode(grammarAccess.getModelAccess().getNodeExclusionNodeExclusion1ParserRuleCall_7_2_0_0());
                            						
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_nodeExclusion_16_1=ruleNodeExclusion1();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getModelRule());
                            							}
                            							set(
                            								current,
                            								"nodeExclusion",
                            								lv_nodeExclusion_16_1,
                            								"org.eclipse.xtext.serializer.ContextFinderTestLanguage.NodeExclusion1");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;
                        case 2 :
                            // InternalContextFinderTestLanguage.g:407:7: lv_nodeExclusion_16_2= ruleNodeExclusion2
                            {

                            							newCompositeNode(grammarAccess.getModelAccess().getNodeExclusionNodeExclusion2ParserRuleCall_7_2_0_1());
                            						
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_nodeExclusion_16_2=ruleNodeExclusion2();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getModelRule());
                            							}
                            							set(
                            								current,
                            								"nodeExclusion",
                            								lv_nodeExclusion_16_2,
                            								"org.eclipse.xtext.serializer.ContextFinderTestLanguage.NodeExclusion2");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 9 :
                    // InternalContextFinderTestLanguage.g:427:3: (otherlv_17= '#8' ( (lv_name_18_0= RULE_STRING ) ) ( ( (lv_nodeExclusionList_19_1= ruleNodeExclusion1List | lv_nodeExclusionList_19_2= ruleNodeExclusion2List ) ) ) )
                    {
                    // InternalContextFinderTestLanguage.g:427:3: (otherlv_17= '#8' ( (lv_name_18_0= RULE_STRING ) ) ( ( (lv_nodeExclusionList_19_1= ruleNodeExclusion1List | lv_nodeExclusionList_19_2= ruleNodeExclusion2List ) ) ) )
                    // InternalContextFinderTestLanguage.g:428:4: otherlv_17= '#8' ( (lv_name_18_0= RULE_STRING ) ) ( ( (lv_nodeExclusionList_19_1= ruleNodeExclusion1List | lv_nodeExclusionList_19_2= ruleNodeExclusion2List ) ) )
                    {
                    otherlv_17=(Token)match(input,19,FollowSets000.FOLLOW_6); 

                    				newLeafNode(otherlv_17, grammarAccess.getModelAccess().getNumberSignDigitEightKeyword_8_0());
                    			
                    // InternalContextFinderTestLanguage.g:432:4: ( (lv_name_18_0= RULE_STRING ) )
                    // InternalContextFinderTestLanguage.g:433:5: (lv_name_18_0= RULE_STRING )
                    {
                    // InternalContextFinderTestLanguage.g:433:5: (lv_name_18_0= RULE_STRING )
                    // InternalContextFinderTestLanguage.g:434:6: lv_name_18_0= RULE_STRING
                    {
                    lv_name_18_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_7); 

                    						newLeafNode(lv_name_18_0, grammarAccess.getModelAccess().getNameSTRINGTerminalRuleCall_8_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getModelRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_18_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    // InternalContextFinderTestLanguage.g:450:4: ( ( (lv_nodeExclusionList_19_1= ruleNodeExclusion1List | lv_nodeExclusionList_19_2= ruleNodeExclusion2List ) ) )
                    // InternalContextFinderTestLanguage.g:451:5: ( (lv_nodeExclusionList_19_1= ruleNodeExclusion1List | lv_nodeExclusionList_19_2= ruleNodeExclusion2List ) )
                    {
                    // InternalContextFinderTestLanguage.g:451:5: ( (lv_nodeExclusionList_19_1= ruleNodeExclusion1List | lv_nodeExclusionList_19_2= ruleNodeExclusion2List ) )
                    // InternalContextFinderTestLanguage.g:452:6: (lv_nodeExclusionList_19_1= ruleNodeExclusion1List | lv_nodeExclusionList_19_2= ruleNodeExclusion2List )
                    {
                    // InternalContextFinderTestLanguage.g:452:6: (lv_nodeExclusionList_19_1= ruleNodeExclusion1List | lv_nodeExclusionList_19_2= ruleNodeExclusion2List )
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==RULE_ID) ) {
                        alt8=1;
                    }
                    else if ( (LA8_0==RULE_STRING) ) {
                        alt8=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 0, input);

                        throw nvae;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalContextFinderTestLanguage.g:453:7: lv_nodeExclusionList_19_1= ruleNodeExclusion1List
                            {

                            							newCompositeNode(grammarAccess.getModelAccess().getNodeExclusionListNodeExclusion1ListParserRuleCall_8_2_0_0());
                            						
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_nodeExclusionList_19_1=ruleNodeExclusion1List();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getModelRule());
                            							}
                            							set(
                            								current,
                            								"nodeExclusionList",
                            								lv_nodeExclusionList_19_1,
                            								"org.eclipse.xtext.serializer.ContextFinderTestLanguage.NodeExclusion1List");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;
                        case 2 :
                            // InternalContextFinderTestLanguage.g:469:7: lv_nodeExclusionList_19_2= ruleNodeExclusion2List
                            {

                            							newCompositeNode(grammarAccess.getModelAccess().getNodeExclusionListNodeExclusion2ListParserRuleCall_8_2_0_1());
                            						
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_nodeExclusionList_19_2=ruleNodeExclusion2List();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getModelRule());
                            							}
                            							set(
                            								current,
                            								"nodeExclusionList",
                            								lv_nodeExclusionList_19_2,
                            								"org.eclipse.xtext.serializer.ContextFinderTestLanguage.NodeExclusion2List");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;

                    }


                    }


                    }


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleModel2"
    // InternalContextFinderTestLanguage.g:492:1: entryRuleModel2 returns [EObject current=null] : iv_ruleModel2= ruleModel2 EOF ;
    public final EObject entryRuleModel2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel2 = null;


        try {
            // InternalContextFinderTestLanguage.g:492:47: (iv_ruleModel2= ruleModel2 EOF )
            // InternalContextFinderTestLanguage.g:493:2: iv_ruleModel2= ruleModel2 EOF
            {
             newCompositeNode(grammarAccess.getModel2Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleModel2=ruleModel2();

            state._fsp--;

             current =iv_ruleModel2; 
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
    // $ANTLR end "entryRuleModel2"


    // $ANTLR start "ruleModel2"
    // InternalContextFinderTestLanguage.g:499:1: ruleModel2 returns [EObject current=null] : ( () otherlv_1= 'model' ) ;
    public final EObject ruleModel2() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

        try {
            // InternalContextFinderTestLanguage.g:500:1: ( ( () otherlv_1= 'model' ) )
            // InternalContextFinderTestLanguage.g:501:2: ( () otherlv_1= 'model' )
            {
            // InternalContextFinderTestLanguage.g:501:2: ( () otherlv_1= 'model' )
            // InternalContextFinderTestLanguage.g:502:3: () otherlv_1= 'model'
            {
            // InternalContextFinderTestLanguage.g:502:3: ()
            // InternalContextFinderTestLanguage.g:503:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getModel2Access().getModelAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getModel2Access().getModelKeyword_1());
            		

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
    // $ANTLR end "ruleModel2"


    // $ANTLR start "entryRuleAttributeExclusionTest1"
    // InternalContextFinderTestLanguage.g:517:1: entryRuleAttributeExclusionTest1 returns [EObject current=null] : iv_ruleAttributeExclusionTest1= ruleAttributeExclusionTest1 EOF ;
    public final EObject entryRuleAttributeExclusionTest1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeExclusionTest1 = null;


        try {
            // InternalContextFinderTestLanguage.g:517:64: (iv_ruleAttributeExclusionTest1= ruleAttributeExclusionTest1 EOF )
            // InternalContextFinderTestLanguage.g:518:2: iv_ruleAttributeExclusionTest1= ruleAttributeExclusionTest1 EOF
            {
             newCompositeNode(grammarAccess.getAttributeExclusionTest1Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAttributeExclusionTest1=ruleAttributeExclusionTest1();

            state._fsp--;

             current =iv_ruleAttributeExclusionTest1; 
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
    // $ANTLR end "entryRuleAttributeExclusionTest1"


    // $ANTLR start "ruleAttributeExclusionTest1"
    // InternalContextFinderTestLanguage.g:524:1: ruleAttributeExclusionTest1 returns [EObject current=null] : (otherlv_0= 'kw1' ( (lv_attr1_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAttributeExclusionTest1() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_attr1_1_0=null;

        try {
            // InternalContextFinderTestLanguage.g:525:1: ( (otherlv_0= 'kw1' ( (lv_attr1_1_0= RULE_ID ) ) ) )
            // InternalContextFinderTestLanguage.g:526:2: (otherlv_0= 'kw1' ( (lv_attr1_1_0= RULE_ID ) ) )
            {
            // InternalContextFinderTestLanguage.g:526:2: (otherlv_0= 'kw1' ( (lv_attr1_1_0= RULE_ID ) ) )
            // InternalContextFinderTestLanguage.g:527:3: otherlv_0= 'kw1' ( (lv_attr1_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeExclusionTest1Access().getKw1Keyword_0());
            		
            // InternalContextFinderTestLanguage.g:531:3: ( (lv_attr1_1_0= RULE_ID ) )
            // InternalContextFinderTestLanguage.g:532:4: (lv_attr1_1_0= RULE_ID )
            {
            // InternalContextFinderTestLanguage.g:532:4: (lv_attr1_1_0= RULE_ID )
            // InternalContextFinderTestLanguage.g:533:5: lv_attr1_1_0= RULE_ID
            {
            lv_attr1_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            					newLeafNode(lv_attr1_1_0, grammarAccess.getAttributeExclusionTest1Access().getAttr1IDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeExclusionTest1Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"attr1",
            						lv_attr1_1_0,
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
    // $ANTLR end "ruleAttributeExclusionTest1"


    // $ANTLR start "entryRuleAttributeExclusionTest2"
    // InternalContextFinderTestLanguage.g:553:1: entryRuleAttributeExclusionTest2 returns [EObject current=null] : iv_ruleAttributeExclusionTest2= ruleAttributeExclusionTest2 EOF ;
    public final EObject entryRuleAttributeExclusionTest2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeExclusionTest2 = null;


        try {
            // InternalContextFinderTestLanguage.g:553:64: (iv_ruleAttributeExclusionTest2= ruleAttributeExclusionTest2 EOF )
            // InternalContextFinderTestLanguage.g:554:2: iv_ruleAttributeExclusionTest2= ruleAttributeExclusionTest2 EOF
            {
             newCompositeNode(grammarAccess.getAttributeExclusionTest2Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAttributeExclusionTest2=ruleAttributeExclusionTest2();

            state._fsp--;

             current =iv_ruleAttributeExclusionTest2; 
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
    // $ANTLR end "entryRuleAttributeExclusionTest2"


    // $ANTLR start "ruleAttributeExclusionTest2"
    // InternalContextFinderTestLanguage.g:560:1: ruleAttributeExclusionTest2 returns [EObject current=null] : (otherlv_0= 'kw2' ( (lv_attr2_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAttributeExclusionTest2() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_attr2_1_0=null;

        try {
            // InternalContextFinderTestLanguage.g:561:1: ( (otherlv_0= 'kw2' ( (lv_attr2_1_0= RULE_ID ) ) ) )
            // InternalContextFinderTestLanguage.g:562:2: (otherlv_0= 'kw2' ( (lv_attr2_1_0= RULE_ID ) ) )
            {
            // InternalContextFinderTestLanguage.g:562:2: (otherlv_0= 'kw2' ( (lv_attr2_1_0= RULE_ID ) ) )
            // InternalContextFinderTestLanguage.g:563:3: otherlv_0= 'kw2' ( (lv_attr2_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,22,FollowSets000.FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeExclusionTest2Access().getKw2Keyword_0());
            		
            // InternalContextFinderTestLanguage.g:567:3: ( (lv_attr2_1_0= RULE_ID ) )
            // InternalContextFinderTestLanguage.g:568:4: (lv_attr2_1_0= RULE_ID )
            {
            // InternalContextFinderTestLanguage.g:568:4: (lv_attr2_1_0= RULE_ID )
            // InternalContextFinderTestLanguage.g:569:5: lv_attr2_1_0= RULE_ID
            {
            lv_attr2_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            					newLeafNode(lv_attr2_1_0, grammarAccess.getAttributeExclusionTest2Access().getAttr2IDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeExclusionTest2Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"attr2",
            						lv_attr2_1_0,
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
    // $ANTLR end "ruleAttributeExclusionTest2"


    // $ANTLR start "entryRuleNestedTypeTest1"
    // InternalContextFinderTestLanguage.g:589:1: entryRuleNestedTypeTest1 returns [EObject current=null] : iv_ruleNestedTypeTest1= ruleNestedTypeTest1 EOF ;
    public final EObject entryRuleNestedTypeTest1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedTypeTest1 = null;


        try {
            // InternalContextFinderTestLanguage.g:589:56: (iv_ruleNestedTypeTest1= ruleNestedTypeTest1 EOF )
            // InternalContextFinderTestLanguage.g:590:2: iv_ruleNestedTypeTest1= ruleNestedTypeTest1 EOF
            {
             newCompositeNode(grammarAccess.getNestedTypeTest1Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNestedTypeTest1=ruleNestedTypeTest1();

            state._fsp--;

             current =iv_ruleNestedTypeTest1; 
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
    // $ANTLR end "entryRuleNestedTypeTest1"


    // $ANTLR start "ruleNestedTypeTest1"
    // InternalContextFinderTestLanguage.g:596:1: ruleNestedTypeTest1 returns [EObject current=null] : ( (lv_nested_0_0= ruleNestedTypeChild1 ) ) ;
    public final EObject ruleNestedTypeTest1() throws RecognitionException {
        EObject current = null;

        EObject lv_nested_0_0 = null;


        try {
            // InternalContextFinderTestLanguage.g:597:1: ( ( (lv_nested_0_0= ruleNestedTypeChild1 ) ) )
            // InternalContextFinderTestLanguage.g:598:2: ( (lv_nested_0_0= ruleNestedTypeChild1 ) )
            {
            // InternalContextFinderTestLanguage.g:598:2: ( (lv_nested_0_0= ruleNestedTypeChild1 ) )
            // InternalContextFinderTestLanguage.g:599:3: (lv_nested_0_0= ruleNestedTypeChild1 )
            {
            // InternalContextFinderTestLanguage.g:599:3: (lv_nested_0_0= ruleNestedTypeChild1 )
            // InternalContextFinderTestLanguage.g:600:4: lv_nested_0_0= ruleNestedTypeChild1
            {

            				newCompositeNode(grammarAccess.getNestedTypeTest1Access().getNestedNestedTypeChild1ParserRuleCall_0());
            			
            pushFollow(FollowSets000.FOLLOW_2);
            lv_nested_0_0=ruleNestedTypeChild1();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getNestedTypeTest1Rule());
            				}
            				set(
            					current,
            					"nested",
            					lv_nested_0_0,
            					"org.eclipse.xtext.serializer.ContextFinderTestLanguage.NestedTypeChild1");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleNestedTypeTest1"


    // $ANTLR start "entryRuleNestedTypeTest2"
    // InternalContextFinderTestLanguage.g:620:1: entryRuleNestedTypeTest2 returns [EObject current=null] : iv_ruleNestedTypeTest2= ruleNestedTypeTest2 EOF ;
    public final EObject entryRuleNestedTypeTest2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedTypeTest2 = null;


        try {
            // InternalContextFinderTestLanguage.g:620:56: (iv_ruleNestedTypeTest2= ruleNestedTypeTest2 EOF )
            // InternalContextFinderTestLanguage.g:621:2: iv_ruleNestedTypeTest2= ruleNestedTypeTest2 EOF
            {
             newCompositeNode(grammarAccess.getNestedTypeTest2Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNestedTypeTest2=ruleNestedTypeTest2();

            state._fsp--;

             current =iv_ruleNestedTypeTest2; 
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
    // $ANTLR end "entryRuleNestedTypeTest2"


    // $ANTLR start "ruleNestedTypeTest2"
    // InternalContextFinderTestLanguage.g:627:1: ruleNestedTypeTest2 returns [EObject current=null] : ( (lv_nested_0_0= ruleNestedTypeChild2 ) ) ;
    public final EObject ruleNestedTypeTest2() throws RecognitionException {
        EObject current = null;

        EObject lv_nested_0_0 = null;


        try {
            // InternalContextFinderTestLanguage.g:628:1: ( ( (lv_nested_0_0= ruleNestedTypeChild2 ) ) )
            // InternalContextFinderTestLanguage.g:629:2: ( (lv_nested_0_0= ruleNestedTypeChild2 ) )
            {
            // InternalContextFinderTestLanguage.g:629:2: ( (lv_nested_0_0= ruleNestedTypeChild2 ) )
            // InternalContextFinderTestLanguage.g:630:3: (lv_nested_0_0= ruleNestedTypeChild2 )
            {
            // InternalContextFinderTestLanguage.g:630:3: (lv_nested_0_0= ruleNestedTypeChild2 )
            // InternalContextFinderTestLanguage.g:631:4: lv_nested_0_0= ruleNestedTypeChild2
            {

            				newCompositeNode(grammarAccess.getNestedTypeTest2Access().getNestedNestedTypeChild2ParserRuleCall_0());
            			
            pushFollow(FollowSets000.FOLLOW_2);
            lv_nested_0_0=ruleNestedTypeChild2();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getNestedTypeTest2Rule());
            				}
            				set(
            					current,
            					"nested",
            					lv_nested_0_0,
            					"org.eclipse.xtext.serializer.ContextFinderTestLanguage.NestedTypeChild2");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleNestedTypeTest2"


    // $ANTLR start "entryRuleNestedTypeChild1"
    // InternalContextFinderTestLanguage.g:651:1: entryRuleNestedTypeChild1 returns [EObject current=null] : iv_ruleNestedTypeChild1= ruleNestedTypeChild1 EOF ;
    public final EObject entryRuleNestedTypeChild1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedTypeChild1 = null;


        try {
            // InternalContextFinderTestLanguage.g:651:57: (iv_ruleNestedTypeChild1= ruleNestedTypeChild1 EOF )
            // InternalContextFinderTestLanguage.g:652:2: iv_ruleNestedTypeChild1= ruleNestedTypeChild1 EOF
            {
             newCompositeNode(grammarAccess.getNestedTypeChild1Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNestedTypeChild1=ruleNestedTypeChild1();

            state._fsp--;

             current =iv_ruleNestedTypeChild1; 
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
    // $ANTLR end "entryRuleNestedTypeChild1"


    // $ANTLR start "ruleNestedTypeChild1"
    // InternalContextFinderTestLanguage.g:658:1: ruleNestedTypeChild1 returns [EObject current=null] : (otherlv_0= 'kw1' ( (lv_val_1_0= RULE_ID ) ) ) ;
    public final EObject ruleNestedTypeChild1() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_val_1_0=null;

        try {
            // InternalContextFinderTestLanguage.g:659:1: ( (otherlv_0= 'kw1' ( (lv_val_1_0= RULE_ID ) ) ) )
            // InternalContextFinderTestLanguage.g:660:2: (otherlv_0= 'kw1' ( (lv_val_1_0= RULE_ID ) ) )
            {
            // InternalContextFinderTestLanguage.g:660:2: (otherlv_0= 'kw1' ( (lv_val_1_0= RULE_ID ) ) )
            // InternalContextFinderTestLanguage.g:661:3: otherlv_0= 'kw1' ( (lv_val_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getNestedTypeChild1Access().getKw1Keyword_0());
            		
            // InternalContextFinderTestLanguage.g:665:3: ( (lv_val_1_0= RULE_ID ) )
            // InternalContextFinderTestLanguage.g:666:4: (lv_val_1_0= RULE_ID )
            {
            // InternalContextFinderTestLanguage.g:666:4: (lv_val_1_0= RULE_ID )
            // InternalContextFinderTestLanguage.g:667:5: lv_val_1_0= RULE_ID
            {
            lv_val_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            					newLeafNode(lv_val_1_0, grammarAccess.getNestedTypeChild1Access().getValIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNestedTypeChild1Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"val",
            						lv_val_1_0,
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
    // $ANTLR end "ruleNestedTypeChild1"


    // $ANTLR start "entryRuleNestedTypeChild2"
    // InternalContextFinderTestLanguage.g:687:1: entryRuleNestedTypeChild2 returns [EObject current=null] : iv_ruleNestedTypeChild2= ruleNestedTypeChild2 EOF ;
    public final EObject entryRuleNestedTypeChild2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedTypeChild2 = null;


        try {
            // InternalContextFinderTestLanguage.g:687:57: (iv_ruleNestedTypeChild2= ruleNestedTypeChild2 EOF )
            // InternalContextFinderTestLanguage.g:688:2: iv_ruleNestedTypeChild2= ruleNestedTypeChild2 EOF
            {
             newCompositeNode(grammarAccess.getNestedTypeChild2Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNestedTypeChild2=ruleNestedTypeChild2();

            state._fsp--;

             current =iv_ruleNestedTypeChild2; 
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
    // $ANTLR end "entryRuleNestedTypeChild2"


    // $ANTLR start "ruleNestedTypeChild2"
    // InternalContextFinderTestLanguage.g:694:1: ruleNestedTypeChild2 returns [EObject current=null] : (otherlv_0= 'kw2' ( (lv_val_1_0= RULE_ID ) ) ) ;
    public final EObject ruleNestedTypeChild2() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_val_1_0=null;

        try {
            // InternalContextFinderTestLanguage.g:695:1: ( (otherlv_0= 'kw2' ( (lv_val_1_0= RULE_ID ) ) ) )
            // InternalContextFinderTestLanguage.g:696:2: (otherlv_0= 'kw2' ( (lv_val_1_0= RULE_ID ) ) )
            {
            // InternalContextFinderTestLanguage.g:696:2: (otherlv_0= 'kw2' ( (lv_val_1_0= RULE_ID ) ) )
            // InternalContextFinderTestLanguage.g:697:3: otherlv_0= 'kw2' ( (lv_val_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,22,FollowSets000.FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getNestedTypeChild2Access().getKw2Keyword_0());
            		
            // InternalContextFinderTestLanguage.g:701:3: ( (lv_val_1_0= RULE_ID ) )
            // InternalContextFinderTestLanguage.g:702:4: (lv_val_1_0= RULE_ID )
            {
            // InternalContextFinderTestLanguage.g:702:4: (lv_val_1_0= RULE_ID )
            // InternalContextFinderTestLanguage.g:703:5: lv_val_1_0= RULE_ID
            {
            lv_val_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            					newLeafNode(lv_val_1_0, grammarAccess.getNestedTypeChild2Access().getValIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNestedTypeChild2Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"val",
            						lv_val_1_0,
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
    // $ANTLR end "ruleNestedTypeChild2"


    // $ANTLR start "entryRuleNestedTypeRecursiveTest1"
    // InternalContextFinderTestLanguage.g:723:1: entryRuleNestedTypeRecursiveTest1 returns [EObject current=null] : iv_ruleNestedTypeRecursiveTest1= ruleNestedTypeRecursiveTest1 EOF ;
    public final EObject entryRuleNestedTypeRecursiveTest1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedTypeRecursiveTest1 = null;


        try {
            // InternalContextFinderTestLanguage.g:723:65: (iv_ruleNestedTypeRecursiveTest1= ruleNestedTypeRecursiveTest1 EOF )
            // InternalContextFinderTestLanguage.g:724:2: iv_ruleNestedTypeRecursiveTest1= ruleNestedTypeRecursiveTest1 EOF
            {
             newCompositeNode(grammarAccess.getNestedTypeRecursiveTest1Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNestedTypeRecursiveTest1=ruleNestedTypeRecursiveTest1();

            state._fsp--;

             current =iv_ruleNestedTypeRecursiveTest1; 
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
    // $ANTLR end "entryRuleNestedTypeRecursiveTest1"


    // $ANTLR start "ruleNestedTypeRecursiveTest1"
    // InternalContextFinderTestLanguage.g:730:1: ruleNestedTypeRecursiveTest1 returns [EObject current=null] : ( () otherlv_1= 'kw1' ( () otherlv_3= '.' )+ ) ;
    public final EObject ruleNestedTypeRecursiveTest1() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;

        try {
            // InternalContextFinderTestLanguage.g:731:1: ( ( () otherlv_1= 'kw1' ( () otherlv_3= '.' )+ ) )
            // InternalContextFinderTestLanguage.g:732:2: ( () otherlv_1= 'kw1' ( () otherlv_3= '.' )+ )
            {
            // InternalContextFinderTestLanguage.g:732:2: ( () otherlv_1= 'kw1' ( () otherlv_3= '.' )+ )
            // InternalContextFinderTestLanguage.g:733:3: () otherlv_1= 'kw1' ( () otherlv_3= '.' )+
            {
            // InternalContextFinderTestLanguage.g:733:3: ()
            // InternalContextFinderTestLanguage.g:734:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNestedTypeRecursiveTest1Access().getNestedTypeRecursiveTest1Action_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FollowSets000.FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getNestedTypeRecursiveTest1Access().getKw1Keyword_1());
            		
            // InternalContextFinderTestLanguage.g:744:3: ( () otherlv_3= '.' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==23) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalContextFinderTestLanguage.g:745:4: () otherlv_3= '.'
            	    {
            	    // InternalContextFinderTestLanguage.g:745:4: ()
            	    // InternalContextFinderTestLanguage.g:746:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getNestedTypeRecursiveTest1Access().getNestedTypeRecursiveTestLeftAction_2_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_3=(Token)match(input,23,FollowSets000.FOLLOW_10); 

            	    				newLeafNode(otherlv_3, grammarAccess.getNestedTypeRecursiveTest1Access().getFullStopKeyword_2_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
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
    // $ANTLR end "ruleNestedTypeRecursiveTest1"


    // $ANTLR start "entryRuleNestedTypeRecursiveTest2"
    // InternalContextFinderTestLanguage.g:761:1: entryRuleNestedTypeRecursiveTest2 returns [EObject current=null] : iv_ruleNestedTypeRecursiveTest2= ruleNestedTypeRecursiveTest2 EOF ;
    public final EObject entryRuleNestedTypeRecursiveTest2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedTypeRecursiveTest2 = null;


        try {
            // InternalContextFinderTestLanguage.g:761:65: (iv_ruleNestedTypeRecursiveTest2= ruleNestedTypeRecursiveTest2 EOF )
            // InternalContextFinderTestLanguage.g:762:2: iv_ruleNestedTypeRecursiveTest2= ruleNestedTypeRecursiveTest2 EOF
            {
             newCompositeNode(grammarAccess.getNestedTypeRecursiveTest2Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNestedTypeRecursiveTest2=ruleNestedTypeRecursiveTest2();

            state._fsp--;

             current =iv_ruleNestedTypeRecursiveTest2; 
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
    // $ANTLR end "entryRuleNestedTypeRecursiveTest2"


    // $ANTLR start "ruleNestedTypeRecursiveTest2"
    // InternalContextFinderTestLanguage.g:768:1: ruleNestedTypeRecursiveTest2 returns [EObject current=null] : ( () otherlv_1= 'kw2' ( () otherlv_3= '.' )+ ) ;
    public final EObject ruleNestedTypeRecursiveTest2() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;

        try {
            // InternalContextFinderTestLanguage.g:769:1: ( ( () otherlv_1= 'kw2' ( () otherlv_3= '.' )+ ) )
            // InternalContextFinderTestLanguage.g:770:2: ( () otherlv_1= 'kw2' ( () otherlv_3= '.' )+ )
            {
            // InternalContextFinderTestLanguage.g:770:2: ( () otherlv_1= 'kw2' ( () otherlv_3= '.' )+ )
            // InternalContextFinderTestLanguage.g:771:3: () otherlv_1= 'kw2' ( () otherlv_3= '.' )+
            {
            // InternalContextFinderTestLanguage.g:771:3: ()
            // InternalContextFinderTestLanguage.g:772:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNestedTypeRecursiveTest2Access().getNestedTypeRecursiveTest2Action_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getNestedTypeRecursiveTest2Access().getKw2Keyword_1());
            		
            // InternalContextFinderTestLanguage.g:782:3: ( () otherlv_3= '.' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==23) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalContextFinderTestLanguage.g:783:4: () otherlv_3= '.'
            	    {
            	    // InternalContextFinderTestLanguage.g:783:4: ()
            	    // InternalContextFinderTestLanguage.g:784:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getNestedTypeRecursiveTest2Access().getNestedTypeRecursiveTestLeftAction_2_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_3=(Token)match(input,23,FollowSets000.FOLLOW_10); 

            	    				newLeafNode(otherlv_3, grammarAccess.getNestedTypeRecursiveTest2Access().getFullStopKeyword_2_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
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
    // $ANTLR end "ruleNestedTypeRecursiveTest2"


    // $ANTLR start "entryRuleParentRefTest1"
    // InternalContextFinderTestLanguage.g:799:1: entryRuleParentRefTest1 returns [EObject current=null] : iv_ruleParentRefTest1= ruleParentRefTest1 EOF ;
    public final EObject entryRuleParentRefTest1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParentRefTest1 = null;


        try {
            // InternalContextFinderTestLanguage.g:799:55: (iv_ruleParentRefTest1= ruleParentRefTest1 EOF )
            // InternalContextFinderTestLanguage.g:800:2: iv_ruleParentRefTest1= ruleParentRefTest1 EOF
            {
             newCompositeNode(grammarAccess.getParentRefTest1Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleParentRefTest1=ruleParentRefTest1();

            state._fsp--;

             current =iv_ruleParentRefTest1; 
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
    // $ANTLR end "entryRuleParentRefTest1"


    // $ANTLR start "ruleParentRefTest1"
    // InternalContextFinderTestLanguage.g:806:1: ruleParentRefTest1 returns [EObject current=null] : (otherlv_0= 'kw1' ( (lv_child1_1_0= ruleParentRefTestChild1 ) ) ) ;
    public final EObject ruleParentRefTest1() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_child1_1_0 = null;


        try {
            // InternalContextFinderTestLanguage.g:807:1: ( (otherlv_0= 'kw1' ( (lv_child1_1_0= ruleParentRefTestChild1 ) ) ) )
            // InternalContextFinderTestLanguage.g:808:2: (otherlv_0= 'kw1' ( (lv_child1_1_0= ruleParentRefTestChild1 ) ) )
            {
            // InternalContextFinderTestLanguage.g:808:2: (otherlv_0= 'kw1' ( (lv_child1_1_0= ruleParentRefTestChild1 ) ) )
            // InternalContextFinderTestLanguage.g:809:3: otherlv_0= 'kw1' ( (lv_child1_1_0= ruleParentRefTestChild1 ) )
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getParentRefTest1Access().getKw1Keyword_0());
            		
            // InternalContextFinderTestLanguage.g:813:3: ( (lv_child1_1_0= ruleParentRefTestChild1 ) )
            // InternalContextFinderTestLanguage.g:814:4: (lv_child1_1_0= ruleParentRefTestChild1 )
            {
            // InternalContextFinderTestLanguage.g:814:4: (lv_child1_1_0= ruleParentRefTestChild1 )
            // InternalContextFinderTestLanguage.g:815:5: lv_child1_1_0= ruleParentRefTestChild1
            {

            					newCompositeNode(grammarAccess.getParentRefTest1Access().getChild1ParentRefTestChild1ParserRuleCall_1_0());
            				
            pushFollow(FollowSets000.FOLLOW_2);
            lv_child1_1_0=ruleParentRefTestChild1();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParentRefTest1Rule());
            					}
            					set(
            						current,
            						"child1",
            						lv_child1_1_0,
            						"org.eclipse.xtext.serializer.ContextFinderTestLanguage.ParentRefTestChild1");
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
    // $ANTLR end "ruleParentRefTest1"


    // $ANTLR start "entryRuleParentRefTest2"
    // InternalContextFinderTestLanguage.g:836:1: entryRuleParentRefTest2 returns [EObject current=null] : iv_ruleParentRefTest2= ruleParentRefTest2 EOF ;
    public final EObject entryRuleParentRefTest2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParentRefTest2 = null;


        try {
            // InternalContextFinderTestLanguage.g:836:55: (iv_ruleParentRefTest2= ruleParentRefTest2 EOF )
            // InternalContextFinderTestLanguage.g:837:2: iv_ruleParentRefTest2= ruleParentRefTest2 EOF
            {
             newCompositeNode(grammarAccess.getParentRefTest2Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleParentRefTest2=ruleParentRefTest2();

            state._fsp--;

             current =iv_ruleParentRefTest2; 
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
    // $ANTLR end "entryRuleParentRefTest2"


    // $ANTLR start "ruleParentRefTest2"
    // InternalContextFinderTestLanguage.g:843:1: ruleParentRefTest2 returns [EObject current=null] : (otherlv_0= 'kw2' ( (lv_child2_1_0= ruleParentRefTestChild2 ) ) ) ;
    public final EObject ruleParentRefTest2() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_child2_1_0 = null;


        try {
            // InternalContextFinderTestLanguage.g:844:1: ( (otherlv_0= 'kw2' ( (lv_child2_1_0= ruleParentRefTestChild2 ) ) ) )
            // InternalContextFinderTestLanguage.g:845:2: (otherlv_0= 'kw2' ( (lv_child2_1_0= ruleParentRefTestChild2 ) ) )
            {
            // InternalContextFinderTestLanguage.g:845:2: (otherlv_0= 'kw2' ( (lv_child2_1_0= ruleParentRefTestChild2 ) ) )
            // InternalContextFinderTestLanguage.g:846:3: otherlv_0= 'kw2' ( (lv_child2_1_0= ruleParentRefTestChild2 ) )
            {
            otherlv_0=(Token)match(input,22,FollowSets000.FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getParentRefTest2Access().getKw2Keyword_0());
            		
            // InternalContextFinderTestLanguage.g:850:3: ( (lv_child2_1_0= ruleParentRefTestChild2 ) )
            // InternalContextFinderTestLanguage.g:851:4: (lv_child2_1_0= ruleParentRefTestChild2 )
            {
            // InternalContextFinderTestLanguage.g:851:4: (lv_child2_1_0= ruleParentRefTestChild2 )
            // InternalContextFinderTestLanguage.g:852:5: lv_child2_1_0= ruleParentRefTestChild2
            {

            					newCompositeNode(grammarAccess.getParentRefTest2Access().getChild2ParentRefTestChild2ParserRuleCall_1_0());
            				
            pushFollow(FollowSets000.FOLLOW_2);
            lv_child2_1_0=ruleParentRefTestChild2();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParentRefTest2Rule());
            					}
            					set(
            						current,
            						"child2",
            						lv_child2_1_0,
            						"org.eclipse.xtext.serializer.ContextFinderTestLanguage.ParentRefTestChild2");
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
    // $ANTLR end "ruleParentRefTest2"


    // $ANTLR start "entryRuleParentRefTestChild1"
    // InternalContextFinderTestLanguage.g:873:1: entryRuleParentRefTestChild1 returns [EObject current=null] : iv_ruleParentRefTestChild1= ruleParentRefTestChild1 EOF ;
    public final EObject entryRuleParentRefTestChild1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParentRefTestChild1 = null;


        try {
            // InternalContextFinderTestLanguage.g:873:60: (iv_ruleParentRefTestChild1= ruleParentRefTestChild1 EOF )
            // InternalContextFinderTestLanguage.g:874:2: iv_ruleParentRefTestChild1= ruleParentRefTestChild1 EOF
            {
             newCompositeNode(grammarAccess.getParentRefTestChild1Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleParentRefTestChild1=ruleParentRefTestChild1();

            state._fsp--;

             current =iv_ruleParentRefTestChild1; 
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
    // $ANTLR end "entryRuleParentRefTestChild1"


    // $ANTLR start "ruleParentRefTestChild1"
    // InternalContextFinderTestLanguage.g:880:1: ruleParentRefTestChild1 returns [EObject current=null] : ( () otherlv_1= 'foo' ( (lv_child_2_0= ruleParentRefTestChild1 ) )? ) ;
    public final EObject ruleParentRefTestChild1() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_child_2_0 = null;


        try {
            // InternalContextFinderTestLanguage.g:881:1: ( ( () otherlv_1= 'foo' ( (lv_child_2_0= ruleParentRefTestChild1 ) )? ) )
            // InternalContextFinderTestLanguage.g:882:2: ( () otherlv_1= 'foo' ( (lv_child_2_0= ruleParentRefTestChild1 ) )? )
            {
            // InternalContextFinderTestLanguage.g:882:2: ( () otherlv_1= 'foo' ( (lv_child_2_0= ruleParentRefTestChild1 ) )? )
            // InternalContextFinderTestLanguage.g:883:3: () otherlv_1= 'foo' ( (lv_child_2_0= ruleParentRefTestChild1 ) )?
            {
            // InternalContextFinderTestLanguage.g:883:3: ()
            // InternalContextFinderTestLanguage.g:884:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParentRefTestChild1Access().getParentRefTestChildAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FollowSets000.FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getParentRefTestChild1Access().getFooKeyword_1());
            		
            // InternalContextFinderTestLanguage.g:894:3: ( (lv_child_2_0= ruleParentRefTestChild1 ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalContextFinderTestLanguage.g:895:4: (lv_child_2_0= ruleParentRefTestChild1 )
                    {
                    // InternalContextFinderTestLanguage.g:895:4: (lv_child_2_0= ruleParentRefTestChild1 )
                    // InternalContextFinderTestLanguage.g:896:5: lv_child_2_0= ruleParentRefTestChild1
                    {

                    					newCompositeNode(grammarAccess.getParentRefTestChild1Access().getChildParentRefTestChild1ParserRuleCall_2_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_child_2_0=ruleParentRefTestChild1();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getParentRefTestChild1Rule());
                    					}
                    					set(
                    						current,
                    						"child",
                    						lv_child_2_0,
                    						"org.eclipse.xtext.serializer.ContextFinderTestLanguage.ParentRefTestChild1");
                    					afterParserOrEnumRuleCall();
                    				

                    }


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
    // $ANTLR end "ruleParentRefTestChild1"


    // $ANTLR start "entryRuleParentRefTestChild2"
    // InternalContextFinderTestLanguage.g:917:1: entryRuleParentRefTestChild2 returns [EObject current=null] : iv_ruleParentRefTestChild2= ruleParentRefTestChild2 EOF ;
    public final EObject entryRuleParentRefTestChild2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParentRefTestChild2 = null;


        try {
            // InternalContextFinderTestLanguage.g:917:60: (iv_ruleParentRefTestChild2= ruleParentRefTestChild2 EOF )
            // InternalContextFinderTestLanguage.g:918:2: iv_ruleParentRefTestChild2= ruleParentRefTestChild2 EOF
            {
             newCompositeNode(grammarAccess.getParentRefTestChild2Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleParentRefTestChild2=ruleParentRefTestChild2();

            state._fsp--;

             current =iv_ruleParentRefTestChild2; 
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
    // $ANTLR end "entryRuleParentRefTestChild2"


    // $ANTLR start "ruleParentRefTestChild2"
    // InternalContextFinderTestLanguage.g:924:1: ruleParentRefTestChild2 returns [EObject current=null] : ( () otherlv_1= 'foo' ( (lv_child_2_0= ruleParentRefTestChild2 ) )? ) ;
    public final EObject ruleParentRefTestChild2() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_child_2_0 = null;


        try {
            // InternalContextFinderTestLanguage.g:925:1: ( ( () otherlv_1= 'foo' ( (lv_child_2_0= ruleParentRefTestChild2 ) )? ) )
            // InternalContextFinderTestLanguage.g:926:2: ( () otherlv_1= 'foo' ( (lv_child_2_0= ruleParentRefTestChild2 ) )? )
            {
            // InternalContextFinderTestLanguage.g:926:2: ( () otherlv_1= 'foo' ( (lv_child_2_0= ruleParentRefTestChild2 ) )? )
            // InternalContextFinderTestLanguage.g:927:3: () otherlv_1= 'foo' ( (lv_child_2_0= ruleParentRefTestChild2 ) )?
            {
            // InternalContextFinderTestLanguage.g:927:3: ()
            // InternalContextFinderTestLanguage.g:928:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParentRefTestChild2Access().getParentRefTestChildAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FollowSets000.FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getParentRefTestChild2Access().getFooKeyword_1());
            		
            // InternalContextFinderTestLanguage.g:938:3: ( (lv_child_2_0= ruleParentRefTestChild2 ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalContextFinderTestLanguage.g:939:4: (lv_child_2_0= ruleParentRefTestChild2 )
                    {
                    // InternalContextFinderTestLanguage.g:939:4: (lv_child_2_0= ruleParentRefTestChild2 )
                    // InternalContextFinderTestLanguage.g:940:5: lv_child_2_0= ruleParentRefTestChild2
                    {

                    					newCompositeNode(grammarAccess.getParentRefTestChild2Access().getChildParentRefTestChild2ParserRuleCall_2_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_child_2_0=ruleParentRefTestChild2();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getParentRefTestChild2Rule());
                    					}
                    					set(
                    						current,
                    						"child",
                    						lv_child_2_0,
                    						"org.eclipse.xtext.serializer.ContextFinderTestLanguage.ParentRefTestChild2");
                    					afterParserOrEnumRuleCall();
                    				

                    }


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
    // $ANTLR end "ruleParentRefTestChild2"


    // $ANTLR start "entryRuleQuantityExclusionTest1"
    // InternalContextFinderTestLanguage.g:961:1: entryRuleQuantityExclusionTest1 returns [EObject current=null] : iv_ruleQuantityExclusionTest1= ruleQuantityExclusionTest1 EOF ;
    public final EObject entryRuleQuantityExclusionTest1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuantityExclusionTest1 = null;


        try {
            // InternalContextFinderTestLanguage.g:961:63: (iv_ruleQuantityExclusionTest1= ruleQuantityExclusionTest1 EOF )
            // InternalContextFinderTestLanguage.g:962:2: iv_ruleQuantityExclusionTest1= ruleQuantityExclusionTest1 EOF
            {
             newCompositeNode(grammarAccess.getQuantityExclusionTest1Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleQuantityExclusionTest1=ruleQuantityExclusionTest1();

            state._fsp--;

             current =iv_ruleQuantityExclusionTest1; 
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
    // $ANTLR end "entryRuleQuantityExclusionTest1"


    // $ANTLR start "ruleQuantityExclusionTest1"
    // InternalContextFinderTestLanguage.g:968:1: ruleQuantityExclusionTest1 returns [EObject current=null] : (otherlv_0= 'kw1' ( (lv_attr1_1_0= RULE_ID ) ) ( (lv_attr2_2_0= RULE_ID ) )? ) ;
    public final EObject ruleQuantityExclusionTest1() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_attr1_1_0=null;
        Token lv_attr2_2_0=null;

        try {
            // InternalContextFinderTestLanguage.g:969:1: ( (otherlv_0= 'kw1' ( (lv_attr1_1_0= RULE_ID ) ) ( (lv_attr2_2_0= RULE_ID ) )? ) )
            // InternalContextFinderTestLanguage.g:970:2: (otherlv_0= 'kw1' ( (lv_attr1_1_0= RULE_ID ) ) ( (lv_attr2_2_0= RULE_ID ) )? )
            {
            // InternalContextFinderTestLanguage.g:970:2: (otherlv_0= 'kw1' ( (lv_attr1_1_0= RULE_ID ) ) ( (lv_attr2_2_0= RULE_ID ) )? )
            // InternalContextFinderTestLanguage.g:971:3: otherlv_0= 'kw1' ( (lv_attr1_1_0= RULE_ID ) ) ( (lv_attr2_2_0= RULE_ID ) )?
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getQuantityExclusionTest1Access().getKw1Keyword_0());
            		
            // InternalContextFinderTestLanguage.g:975:3: ( (lv_attr1_1_0= RULE_ID ) )
            // InternalContextFinderTestLanguage.g:976:4: (lv_attr1_1_0= RULE_ID )
            {
            // InternalContextFinderTestLanguage.g:976:4: (lv_attr1_1_0= RULE_ID )
            // InternalContextFinderTestLanguage.g:977:5: lv_attr1_1_0= RULE_ID
            {
            lv_attr1_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_13); 

            					newLeafNode(lv_attr1_1_0, grammarAccess.getQuantityExclusionTest1Access().getAttr1IDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQuantityExclusionTest1Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"attr1",
            						lv_attr1_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalContextFinderTestLanguage.g:993:3: ( (lv_attr2_2_0= RULE_ID ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalContextFinderTestLanguage.g:994:4: (lv_attr2_2_0= RULE_ID )
                    {
                    // InternalContextFinderTestLanguage.g:994:4: (lv_attr2_2_0= RULE_ID )
                    // InternalContextFinderTestLanguage.g:995:5: lv_attr2_2_0= RULE_ID
                    {
                    lv_attr2_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

                    					newLeafNode(lv_attr2_2_0, grammarAccess.getQuantityExclusionTest1Access().getAttr2IDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getQuantityExclusionTest1Rule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"attr2",
                    						lv_attr2_2_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


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
    // $ANTLR end "ruleQuantityExclusionTest1"


    // $ANTLR start "entryRuleQuantityExclusionTest2"
    // InternalContextFinderTestLanguage.g:1015:1: entryRuleQuantityExclusionTest2 returns [EObject current=null] : iv_ruleQuantityExclusionTest2= ruleQuantityExclusionTest2 EOF ;
    public final EObject entryRuleQuantityExclusionTest2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuantityExclusionTest2 = null;


        try {
            // InternalContextFinderTestLanguage.g:1015:63: (iv_ruleQuantityExclusionTest2= ruleQuantityExclusionTest2 EOF )
            // InternalContextFinderTestLanguage.g:1016:2: iv_ruleQuantityExclusionTest2= ruleQuantityExclusionTest2 EOF
            {
             newCompositeNode(grammarAccess.getQuantityExclusionTest2Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleQuantityExclusionTest2=ruleQuantityExclusionTest2();

            state._fsp--;

             current =iv_ruleQuantityExclusionTest2; 
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
    // $ANTLR end "entryRuleQuantityExclusionTest2"


    // $ANTLR start "ruleQuantityExclusionTest2"
    // InternalContextFinderTestLanguage.g:1022:1: ruleQuantityExclusionTest2 returns [EObject current=null] : (otherlv_0= 'kw2' ( (lv_attr1_1_0= RULE_ID ) )? ( (lv_attr2_2_0= RULE_ID ) ) ) ;
    public final EObject ruleQuantityExclusionTest2() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_attr1_1_0=null;
        Token lv_attr2_2_0=null;

        try {
            // InternalContextFinderTestLanguage.g:1023:1: ( (otherlv_0= 'kw2' ( (lv_attr1_1_0= RULE_ID ) )? ( (lv_attr2_2_0= RULE_ID ) ) ) )
            // InternalContextFinderTestLanguage.g:1024:2: (otherlv_0= 'kw2' ( (lv_attr1_1_0= RULE_ID ) )? ( (lv_attr2_2_0= RULE_ID ) ) )
            {
            // InternalContextFinderTestLanguage.g:1024:2: (otherlv_0= 'kw2' ( (lv_attr1_1_0= RULE_ID ) )? ( (lv_attr2_2_0= RULE_ID ) ) )
            // InternalContextFinderTestLanguage.g:1025:3: otherlv_0= 'kw2' ( (lv_attr1_1_0= RULE_ID ) )? ( (lv_attr2_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,22,FollowSets000.FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getQuantityExclusionTest2Access().getKw2Keyword_0());
            		
            // InternalContextFinderTestLanguage.g:1029:3: ( (lv_attr1_1_0= RULE_ID ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==RULE_ID) ) {
                    alt15=1;
                }
            }
            switch (alt15) {
                case 1 :
                    // InternalContextFinderTestLanguage.g:1030:4: (lv_attr1_1_0= RULE_ID )
                    {
                    // InternalContextFinderTestLanguage.g:1030:4: (lv_attr1_1_0= RULE_ID )
                    // InternalContextFinderTestLanguage.g:1031:5: lv_attr1_1_0= RULE_ID
                    {
                    lv_attr1_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_8); 

                    					newLeafNode(lv_attr1_1_0, grammarAccess.getQuantityExclusionTest2Access().getAttr1IDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getQuantityExclusionTest2Rule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"attr1",
                    						lv_attr1_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            // InternalContextFinderTestLanguage.g:1047:3: ( (lv_attr2_2_0= RULE_ID ) )
            // InternalContextFinderTestLanguage.g:1048:4: (lv_attr2_2_0= RULE_ID )
            {
            // InternalContextFinderTestLanguage.g:1048:4: (lv_attr2_2_0= RULE_ID )
            // InternalContextFinderTestLanguage.g:1049:5: lv_attr2_2_0= RULE_ID
            {
            lv_attr2_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            					newLeafNode(lv_attr2_2_0, grammarAccess.getQuantityExclusionTest2Access().getAttr2IDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQuantityExclusionTest2Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"attr2",
            						lv_attr2_2_0,
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
    // $ANTLR end "ruleQuantityExclusionTest2"


    // $ANTLR start "entryRuleValueExclusionTest1"
    // InternalContextFinderTestLanguage.g:1069:1: entryRuleValueExclusionTest1 returns [EObject current=null] : iv_ruleValueExclusionTest1= ruleValueExclusionTest1 EOF ;
    public final EObject entryRuleValueExclusionTest1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueExclusionTest1 = null;


        try {
            // InternalContextFinderTestLanguage.g:1069:60: (iv_ruleValueExclusionTest1= ruleValueExclusionTest1 EOF )
            // InternalContextFinderTestLanguage.g:1070:2: iv_ruleValueExclusionTest1= ruleValueExclusionTest1 EOF
            {
             newCompositeNode(grammarAccess.getValueExclusionTest1Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleValueExclusionTest1=ruleValueExclusionTest1();

            state._fsp--;

             current =iv_ruleValueExclusionTest1; 
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
    // $ANTLR end "entryRuleValueExclusionTest1"


    // $ANTLR start "ruleValueExclusionTest1"
    // InternalContextFinderTestLanguage.g:1076:1: ruleValueExclusionTest1 returns [EObject current=null] : ( (lv_val_0_0= ruleValueExclusionTestEn1 ) ) ;
    public final EObject ruleValueExclusionTest1() throws RecognitionException {
        EObject current = null;

        Enumerator lv_val_0_0 = null;


        try {
            // InternalContextFinderTestLanguage.g:1077:1: ( ( (lv_val_0_0= ruleValueExclusionTestEn1 ) ) )
            // InternalContextFinderTestLanguage.g:1078:2: ( (lv_val_0_0= ruleValueExclusionTestEn1 ) )
            {
            // InternalContextFinderTestLanguage.g:1078:2: ( (lv_val_0_0= ruleValueExclusionTestEn1 ) )
            // InternalContextFinderTestLanguage.g:1079:3: (lv_val_0_0= ruleValueExclusionTestEn1 )
            {
            // InternalContextFinderTestLanguage.g:1079:3: (lv_val_0_0= ruleValueExclusionTestEn1 )
            // InternalContextFinderTestLanguage.g:1080:4: lv_val_0_0= ruleValueExclusionTestEn1
            {

            				newCompositeNode(grammarAccess.getValueExclusionTest1Access().getValValueExclusionTestEn1EnumRuleCall_0());
            			
            pushFollow(FollowSets000.FOLLOW_2);
            lv_val_0_0=ruleValueExclusionTestEn1();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getValueExclusionTest1Rule());
            				}
            				set(
            					current,
            					"val",
            					lv_val_0_0,
            					"org.eclipse.xtext.serializer.ContextFinderTestLanguage.ValueExclusionTestEn1");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleValueExclusionTest1"


    // $ANTLR start "entryRuleValueExclusionTest2"
    // InternalContextFinderTestLanguage.g:1100:1: entryRuleValueExclusionTest2 returns [EObject current=null] : iv_ruleValueExclusionTest2= ruleValueExclusionTest2 EOF ;
    public final EObject entryRuleValueExclusionTest2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueExclusionTest2 = null;


        try {
            // InternalContextFinderTestLanguage.g:1100:60: (iv_ruleValueExclusionTest2= ruleValueExclusionTest2 EOF )
            // InternalContextFinderTestLanguage.g:1101:2: iv_ruleValueExclusionTest2= ruleValueExclusionTest2 EOF
            {
             newCompositeNode(grammarAccess.getValueExclusionTest2Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleValueExclusionTest2=ruleValueExclusionTest2();

            state._fsp--;

             current =iv_ruleValueExclusionTest2; 
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
    // $ANTLR end "entryRuleValueExclusionTest2"


    // $ANTLR start "ruleValueExclusionTest2"
    // InternalContextFinderTestLanguage.g:1107:1: ruleValueExclusionTest2 returns [EObject current=null] : ( (lv_val_0_0= ruleValueExclusionTestEn2 ) ) ;
    public final EObject ruleValueExclusionTest2() throws RecognitionException {
        EObject current = null;

        Enumerator lv_val_0_0 = null;


        try {
            // InternalContextFinderTestLanguage.g:1108:1: ( ( (lv_val_0_0= ruleValueExclusionTestEn2 ) ) )
            // InternalContextFinderTestLanguage.g:1109:2: ( (lv_val_0_0= ruleValueExclusionTestEn2 ) )
            {
            // InternalContextFinderTestLanguage.g:1109:2: ( (lv_val_0_0= ruleValueExclusionTestEn2 ) )
            // InternalContextFinderTestLanguage.g:1110:3: (lv_val_0_0= ruleValueExclusionTestEn2 )
            {
            // InternalContextFinderTestLanguage.g:1110:3: (lv_val_0_0= ruleValueExclusionTestEn2 )
            // InternalContextFinderTestLanguage.g:1111:4: lv_val_0_0= ruleValueExclusionTestEn2
            {

            				newCompositeNode(grammarAccess.getValueExclusionTest2Access().getValValueExclusionTestEn2EnumRuleCall_0());
            			
            pushFollow(FollowSets000.FOLLOW_2);
            lv_val_0_0=ruleValueExclusionTestEn2();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getValueExclusionTest2Rule());
            				}
            				set(
            					current,
            					"val",
            					lv_val_0_0,
            					"org.eclipse.xtext.serializer.ContextFinderTestLanguage.ValueExclusionTestEn2");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleValueExclusionTest2"


    // $ANTLR start "entryRuleNodeExclusion1"
    // InternalContextFinderTestLanguage.g:1131:1: entryRuleNodeExclusion1 returns [EObject current=null] : iv_ruleNodeExclusion1= ruleNodeExclusion1 EOF ;
    public final EObject entryRuleNodeExclusion1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeExclusion1 = null;


        try {
            // InternalContextFinderTestLanguage.g:1131:55: (iv_ruleNodeExclusion1= ruleNodeExclusion1 EOF )
            // InternalContextFinderTestLanguage.g:1132:2: iv_ruleNodeExclusion1= ruleNodeExclusion1 EOF
            {
             newCompositeNode(grammarAccess.getNodeExclusion1Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNodeExclusion1=ruleNodeExclusion1();

            state._fsp--;

             current =iv_ruleNodeExclusion1; 
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
    // $ANTLR end "entryRuleNodeExclusion1"


    // $ANTLR start "ruleNodeExclusion1"
    // InternalContextFinderTestLanguage.g:1138:1: ruleNodeExclusion1 returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleNodeExclusion1() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

        try {
            // InternalContextFinderTestLanguage.g:1139:1: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalContextFinderTestLanguage.g:1140:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalContextFinderTestLanguage.g:1140:2: ( (otherlv_0= RULE_ID ) )
            // InternalContextFinderTestLanguage.g:1141:3: (otherlv_0= RULE_ID )
            {
            // InternalContextFinderTestLanguage.g:1141:3: (otherlv_0= RULE_ID )
            // InternalContextFinderTestLanguage.g:1142:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getNodeExclusion1Rule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getNodeExclusion1Access().getRefModelCrossReference_0());
            			

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
    // $ANTLR end "ruleNodeExclusion1"


    // $ANTLR start "entryRuleNodeExclusion2"
    // InternalContextFinderTestLanguage.g:1156:1: entryRuleNodeExclusion2 returns [EObject current=null] : iv_ruleNodeExclusion2= ruleNodeExclusion2 EOF ;
    public final EObject entryRuleNodeExclusion2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeExclusion2 = null;


        try {
            // InternalContextFinderTestLanguage.g:1156:55: (iv_ruleNodeExclusion2= ruleNodeExclusion2 EOF )
            // InternalContextFinderTestLanguage.g:1157:2: iv_ruleNodeExclusion2= ruleNodeExclusion2 EOF
            {
             newCompositeNode(grammarAccess.getNodeExclusion2Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNodeExclusion2=ruleNodeExclusion2();

            state._fsp--;

             current =iv_ruleNodeExclusion2; 
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
    // $ANTLR end "entryRuleNodeExclusion2"


    // $ANTLR start "ruleNodeExclusion2"
    // InternalContextFinderTestLanguage.g:1163:1: ruleNodeExclusion2 returns [EObject current=null] : ( (otherlv_0= RULE_STRING ) ) ;
    public final EObject ruleNodeExclusion2() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

        try {
            // InternalContextFinderTestLanguage.g:1164:1: ( ( (otherlv_0= RULE_STRING ) ) )
            // InternalContextFinderTestLanguage.g:1165:2: ( (otherlv_0= RULE_STRING ) )
            {
            // InternalContextFinderTestLanguage.g:1165:2: ( (otherlv_0= RULE_STRING ) )
            // InternalContextFinderTestLanguage.g:1166:3: (otherlv_0= RULE_STRING )
            {
            // InternalContextFinderTestLanguage.g:1166:3: (otherlv_0= RULE_STRING )
            // InternalContextFinderTestLanguage.g:1167:4: otherlv_0= RULE_STRING
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getNodeExclusion2Rule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getNodeExclusion2Access().getRefModelCrossReference_0());
            			

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
    // $ANTLR end "ruleNodeExclusion2"


    // $ANTLR start "entryRuleNodeExclusion1List"
    // InternalContextFinderTestLanguage.g:1181:1: entryRuleNodeExclusion1List returns [EObject current=null] : iv_ruleNodeExclusion1List= ruleNodeExclusion1List EOF ;
    public final EObject entryRuleNodeExclusion1List() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeExclusion1List = null;


        try {
            // InternalContextFinderTestLanguage.g:1181:59: (iv_ruleNodeExclusion1List= ruleNodeExclusion1List EOF )
            // InternalContextFinderTestLanguage.g:1182:2: iv_ruleNodeExclusion1List= ruleNodeExclusion1List EOF
            {
             newCompositeNode(grammarAccess.getNodeExclusion1ListRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNodeExclusion1List=ruleNodeExclusion1List();

            state._fsp--;

             current =iv_ruleNodeExclusion1List; 
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
    // $ANTLR end "entryRuleNodeExclusion1List"


    // $ANTLR start "ruleNodeExclusion1List"
    // InternalContextFinderTestLanguage.g:1188:1: ruleNodeExclusion1List returns [EObject current=null] : ( (otherlv_0= RULE_ID ) )+ ;
    public final EObject ruleNodeExclusion1List() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

        try {
            // InternalContextFinderTestLanguage.g:1189:1: ( ( (otherlv_0= RULE_ID ) )+ )
            // InternalContextFinderTestLanguage.g:1190:2: ( (otherlv_0= RULE_ID ) )+
            {
            // InternalContextFinderTestLanguage.g:1190:2: ( (otherlv_0= RULE_ID ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalContextFinderTestLanguage.g:1191:3: (otherlv_0= RULE_ID )
            	    {
            	    // InternalContextFinderTestLanguage.g:1191:3: (otherlv_0= RULE_ID )
            	    // InternalContextFinderTestLanguage.g:1192:4: otherlv_0= RULE_ID
            	    {

            	    				if (current==null) {
            	    					current = createModelElement(grammarAccess.getNodeExclusion1ListRule());
            	    				}
            	    			
            	    otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_13); 

            	    				newLeafNode(otherlv_0, grammarAccess.getNodeExclusion1ListAccess().getRefModelCrossReference_0());
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);


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
    // $ANTLR end "ruleNodeExclusion1List"


    // $ANTLR start "entryRuleNodeExclusion2List"
    // InternalContextFinderTestLanguage.g:1206:1: entryRuleNodeExclusion2List returns [EObject current=null] : iv_ruleNodeExclusion2List= ruleNodeExclusion2List EOF ;
    public final EObject entryRuleNodeExclusion2List() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeExclusion2List = null;


        try {
            // InternalContextFinderTestLanguage.g:1206:59: (iv_ruleNodeExclusion2List= ruleNodeExclusion2List EOF )
            // InternalContextFinderTestLanguage.g:1207:2: iv_ruleNodeExclusion2List= ruleNodeExclusion2List EOF
            {
             newCompositeNode(grammarAccess.getNodeExclusion2ListRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNodeExclusion2List=ruleNodeExclusion2List();

            state._fsp--;

             current =iv_ruleNodeExclusion2List; 
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
    // $ANTLR end "entryRuleNodeExclusion2List"


    // $ANTLR start "ruleNodeExclusion2List"
    // InternalContextFinderTestLanguage.g:1213:1: ruleNodeExclusion2List returns [EObject current=null] : ( (otherlv_0= RULE_STRING ) )+ ;
    public final EObject ruleNodeExclusion2List() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

        try {
            // InternalContextFinderTestLanguage.g:1214:1: ( ( (otherlv_0= RULE_STRING ) )+ )
            // InternalContextFinderTestLanguage.g:1215:2: ( (otherlv_0= RULE_STRING ) )+
            {
            // InternalContextFinderTestLanguage.g:1215:2: ( (otherlv_0= RULE_STRING ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_STRING) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalContextFinderTestLanguage.g:1216:3: (otherlv_0= RULE_STRING )
            	    {
            	    // InternalContextFinderTestLanguage.g:1216:3: (otherlv_0= RULE_STRING )
            	    // InternalContextFinderTestLanguage.g:1217:4: otherlv_0= RULE_STRING
            	    {

            	    				if (current==null) {
            	    					current = createModelElement(grammarAccess.getNodeExclusion2ListRule());
            	    				}
            	    			
            	    otherlv_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_14); 

            	    				newLeafNode(otherlv_0, grammarAccess.getNodeExclusion2ListAccess().getRefModelCrossReference_0());
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);


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
    // $ANTLR end "ruleNodeExclusion2List"


    // $ANTLR start "ruleValueExclusionTestEn1"
    // InternalContextFinderTestLanguage.g:1231:1: ruleValueExclusionTestEn1 returns [Enumerator current=null] : (enumLiteral_0= 'lit1' ) ;
    public final Enumerator ruleValueExclusionTestEn1() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

        try {
            // InternalContextFinderTestLanguage.g:1232:1: ( (enumLiteral_0= 'lit1' ) )
            // InternalContextFinderTestLanguage.g:1233:2: (enumLiteral_0= 'lit1' )
            {
            // InternalContextFinderTestLanguage.g:1233:2: (enumLiteral_0= 'lit1' )
            // InternalContextFinderTestLanguage.g:1234:3: enumLiteral_0= 'lit1'
            {
            enumLiteral_0=(Token)match(input,25,FollowSets000.FOLLOW_2); 

            			current = grammarAccess.getValueExclusionTestEn1Access().getLit1EnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getValueExclusionTestEn1Access().getLit1EnumLiteralDeclaration());
            		

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
    // $ANTLR end "ruleValueExclusionTestEn1"


    // $ANTLR start "ruleValueExclusionTestEn2"
    // InternalContextFinderTestLanguage.g:1243:1: ruleValueExclusionTestEn2 returns [Enumerator current=null] : (enumLiteral_0= 'lit2' ) ;
    public final Enumerator ruleValueExclusionTestEn2() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

        try {
            // InternalContextFinderTestLanguage.g:1244:1: ( (enumLiteral_0= 'lit2' ) )
            // InternalContextFinderTestLanguage.g:1245:2: (enumLiteral_0= 'lit2' )
            {
            // InternalContextFinderTestLanguage.g:1245:2: (enumLiteral_0= 'lit2' )
            // InternalContextFinderTestLanguage.g:1246:3: enumLiteral_0= 'lit2'
            {
            enumLiteral_0=(Token)match(input,26,FollowSets000.FOLLOW_2); 

            			current = grammarAccess.getValueExclusionTestEn2Access().getLit2EnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getValueExclusionTestEn2Access().getLit2EnumLiteralDeclaration());
            		

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
    // $ANTLR end "ruleValueExclusionTestEn2"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000600000L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000006000000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000022L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000012L});
    }


}