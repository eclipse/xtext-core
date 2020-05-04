package org.eclipse.xtext.parser.keywords.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.parser.keywords.services.KeywordsTestLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalKeywordsTestLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'foo\\\\bar'", "'foo\\\\'", "'\\\\bar'", "'\\\\'", "'\"a\"'", "'\\'b\\''", "'\\'c\\''", "'\"d\"'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=5;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalKeywordsTestLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalKeywordsTestLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalKeywordsTestLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalKeywordsTestLanguage.g"; }



     	private KeywordsTestLanguageGrammarAccess grammarAccess;

        public InternalKeywordsTestLanguageParser(TokenStream input, KeywordsTestLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected KeywordsTestLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalKeywordsTestLanguage.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalKeywordsTestLanguage.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalKeywordsTestLanguage.g:65:2: iv_ruleModel= ruleModel EOF
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
    // InternalKeywordsTestLanguage.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_first_0_0= 'foo\\\\bar' ) ) | ( (lv_second_1_0= 'foo\\\\' ) ) | ( (lv_third_2_0= '\\\\bar' ) ) | ( (lv_forth_3_0= '\\\\' ) ) | ( (lv_fifth_4_0= '\"a\"' ) ) | ( (lv_sixth_5_0= '\\'b\\'' ) ) | ( (lv_seventh_6_0= '\\'c\\'' ) ) | ( (lv_eighth_7_0= '\"d\"' ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token lv_first_0_0=null;
        Token lv_second_1_0=null;
        Token lv_third_2_0=null;
        Token lv_forth_3_0=null;
        Token lv_fifth_4_0=null;
        Token lv_sixth_5_0=null;
        Token lv_seventh_6_0=null;
        Token lv_eighth_7_0=null;


        	enterRule();

        try {
            // InternalKeywordsTestLanguage.g:77:2: ( ( ( (lv_first_0_0= 'foo\\\\bar' ) ) | ( (lv_second_1_0= 'foo\\\\' ) ) | ( (lv_third_2_0= '\\\\bar' ) ) | ( (lv_forth_3_0= '\\\\' ) ) | ( (lv_fifth_4_0= '\"a\"' ) ) | ( (lv_sixth_5_0= '\\'b\\'' ) ) | ( (lv_seventh_6_0= '\\'c\\'' ) ) | ( (lv_eighth_7_0= '\"d\"' ) ) ) )
            // InternalKeywordsTestLanguage.g:78:2: ( ( (lv_first_0_0= 'foo\\\\bar' ) ) | ( (lv_second_1_0= 'foo\\\\' ) ) | ( (lv_third_2_0= '\\\\bar' ) ) | ( (lv_forth_3_0= '\\\\' ) ) | ( (lv_fifth_4_0= '\"a\"' ) ) | ( (lv_sixth_5_0= '\\'b\\'' ) ) | ( (lv_seventh_6_0= '\\'c\\'' ) ) | ( (lv_eighth_7_0= '\"d\"' ) ) )
            {
            // InternalKeywordsTestLanguage.g:78:2: ( ( (lv_first_0_0= 'foo\\\\bar' ) ) | ( (lv_second_1_0= 'foo\\\\' ) ) | ( (lv_third_2_0= '\\\\bar' ) ) | ( (lv_forth_3_0= '\\\\' ) ) | ( (lv_fifth_4_0= '\"a\"' ) ) | ( (lv_sixth_5_0= '\\'b\\'' ) ) | ( (lv_seventh_6_0= '\\'c\\'' ) ) | ( (lv_eighth_7_0= '\"d\"' ) ) )
            int alt1=8;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalKeywordsTestLanguage.g:79:3: ( (lv_first_0_0= 'foo\\\\bar' ) )
                    {
                    // InternalKeywordsTestLanguage.g:79:3: ( (lv_first_0_0= 'foo\\\\bar' ) )
                    // InternalKeywordsTestLanguage.g:80:4: (lv_first_0_0= 'foo\\\\bar' )
                    {
                    // InternalKeywordsTestLanguage.g:80:4: (lv_first_0_0= 'foo\\\\bar' )
                    // InternalKeywordsTestLanguage.g:81:5: lv_first_0_0= 'foo\\\\bar'
                    {
                    lv_first_0_0=(Token)match(input,11,FollowSets000.FOLLOW_2); 

                    					newLeafNode(lv_first_0_0, grammarAccess.getModelAccess().getFirstFooBarKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getModelRule());
                    					}
                    					setWithLastConsumed(current, "first", lv_first_0_0 != null, "foo\\bar");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKeywordsTestLanguage.g:94:3: ( (lv_second_1_0= 'foo\\\\' ) )
                    {
                    // InternalKeywordsTestLanguage.g:94:3: ( (lv_second_1_0= 'foo\\\\' ) )
                    // InternalKeywordsTestLanguage.g:95:4: (lv_second_1_0= 'foo\\\\' )
                    {
                    // InternalKeywordsTestLanguage.g:95:4: (lv_second_1_0= 'foo\\\\' )
                    // InternalKeywordsTestLanguage.g:96:5: lv_second_1_0= 'foo\\\\'
                    {
                    lv_second_1_0=(Token)match(input,12,FollowSets000.FOLLOW_2); 

                    					newLeafNode(lv_second_1_0, grammarAccess.getModelAccess().getSecondFooKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getModelRule());
                    					}
                    					setWithLastConsumed(current, "second", lv_second_1_0 != null, "foo\\");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalKeywordsTestLanguage.g:109:3: ( (lv_third_2_0= '\\\\bar' ) )
                    {
                    // InternalKeywordsTestLanguage.g:109:3: ( (lv_third_2_0= '\\\\bar' ) )
                    // InternalKeywordsTestLanguage.g:110:4: (lv_third_2_0= '\\\\bar' )
                    {
                    // InternalKeywordsTestLanguage.g:110:4: (lv_third_2_0= '\\\\bar' )
                    // InternalKeywordsTestLanguage.g:111:5: lv_third_2_0= '\\\\bar'
                    {
                    lv_third_2_0=(Token)match(input,13,FollowSets000.FOLLOW_2); 

                    					newLeafNode(lv_third_2_0, grammarAccess.getModelAccess().getThirdBarKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getModelRule());
                    					}
                    					setWithLastConsumed(current, "third", lv_third_2_0 != null, "\\bar");
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalKeywordsTestLanguage.g:124:3: ( (lv_forth_3_0= '\\\\' ) )
                    {
                    // InternalKeywordsTestLanguage.g:124:3: ( (lv_forth_3_0= '\\\\' ) )
                    // InternalKeywordsTestLanguage.g:125:4: (lv_forth_3_0= '\\\\' )
                    {
                    // InternalKeywordsTestLanguage.g:125:4: (lv_forth_3_0= '\\\\' )
                    // InternalKeywordsTestLanguage.g:126:5: lv_forth_3_0= '\\\\'
                    {
                    lv_forth_3_0=(Token)match(input,14,FollowSets000.FOLLOW_2); 

                    					newLeafNode(lv_forth_3_0, grammarAccess.getModelAccess().getForthBackslashKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getModelRule());
                    					}
                    					setWithLastConsumed(current, "forth", lv_forth_3_0 != null, "\\");
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalKeywordsTestLanguage.g:139:3: ( (lv_fifth_4_0= '\"a\"' ) )
                    {
                    // InternalKeywordsTestLanguage.g:139:3: ( (lv_fifth_4_0= '\"a\"' ) )
                    // InternalKeywordsTestLanguage.g:140:4: (lv_fifth_4_0= '\"a\"' )
                    {
                    // InternalKeywordsTestLanguage.g:140:4: (lv_fifth_4_0= '\"a\"' )
                    // InternalKeywordsTestLanguage.g:141:5: lv_fifth_4_0= '\"a\"'
                    {
                    lv_fifth_4_0=(Token)match(input,15,FollowSets000.FOLLOW_2); 

                    					newLeafNode(lv_fifth_4_0, grammarAccess.getModelAccess().getFifthAKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getModelRule());
                    					}
                    					setWithLastConsumed(current, "fifth", lv_fifth_4_0 != null, "\"a\"");
                    				

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalKeywordsTestLanguage.g:154:3: ( (lv_sixth_5_0= '\\'b\\'' ) )
                    {
                    // InternalKeywordsTestLanguage.g:154:3: ( (lv_sixth_5_0= '\\'b\\'' ) )
                    // InternalKeywordsTestLanguage.g:155:4: (lv_sixth_5_0= '\\'b\\'' )
                    {
                    // InternalKeywordsTestLanguage.g:155:4: (lv_sixth_5_0= '\\'b\\'' )
                    // InternalKeywordsTestLanguage.g:156:5: lv_sixth_5_0= '\\'b\\''
                    {
                    lv_sixth_5_0=(Token)match(input,16,FollowSets000.FOLLOW_2); 

                    					newLeafNode(lv_sixth_5_0, grammarAccess.getModelAccess().getSixthBKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getModelRule());
                    					}
                    					setWithLastConsumed(current, "sixth", lv_sixth_5_0 != null, "\'b\'");
                    				

                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalKeywordsTestLanguage.g:169:3: ( (lv_seventh_6_0= '\\'c\\'' ) )
                    {
                    // InternalKeywordsTestLanguage.g:169:3: ( (lv_seventh_6_0= '\\'c\\'' ) )
                    // InternalKeywordsTestLanguage.g:170:4: (lv_seventh_6_0= '\\'c\\'' )
                    {
                    // InternalKeywordsTestLanguage.g:170:4: (lv_seventh_6_0= '\\'c\\'' )
                    // InternalKeywordsTestLanguage.g:171:5: lv_seventh_6_0= '\\'c\\''
                    {
                    lv_seventh_6_0=(Token)match(input,17,FollowSets000.FOLLOW_2); 

                    					newLeafNode(lv_seventh_6_0, grammarAccess.getModelAccess().getSeventhCKeyword_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getModelRule());
                    					}
                    					setWithLastConsumed(current, "seventh", lv_seventh_6_0 != null, "\'c\'");
                    				

                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalKeywordsTestLanguage.g:184:3: ( (lv_eighth_7_0= '\"d\"' ) )
                    {
                    // InternalKeywordsTestLanguage.g:184:3: ( (lv_eighth_7_0= '\"d\"' ) )
                    // InternalKeywordsTestLanguage.g:185:4: (lv_eighth_7_0= '\"d\"' )
                    {
                    // InternalKeywordsTestLanguage.g:185:4: (lv_eighth_7_0= '\"d\"' )
                    // InternalKeywordsTestLanguage.g:186:5: lv_eighth_7_0= '\"d\"'
                    {
                    lv_eighth_7_0=(Token)match(input,18,FollowSets000.FOLLOW_2); 

                    					newLeafNode(lv_eighth_7_0, grammarAccess.getModelAccess().getEighthDKeyword_7_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getModelRule());
                    					}
                    					setWithLastConsumed(current, "eighth", lv_eighth_7_0 != null, "\"d\"");
                    				

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
    // $ANTLR end "ruleModel"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    }


}