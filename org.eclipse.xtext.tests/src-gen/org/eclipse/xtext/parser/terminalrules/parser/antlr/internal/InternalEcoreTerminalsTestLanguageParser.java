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
import org.eclipse.xtext.parser.terminalrules.services.EcoreTerminalsTestLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEcoreTerminalsTestLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_EINT", "RULE_EDOUBLE", "RULE_EDATE", "RULE_WS", "'int'", "'double'", "'date'"
    };
    public static final int T__9=9;
    public static final int T__8=8;
    public static final int RULE_WS=7;
    public static final int RULE_EDOUBLE=5;
    public static final int RULE_EINT=4;
    public static final int EOF=-1;
    public static final int T__10=10;
    public static final int RULE_EDATE=6;

    // delegates
    // delegators


        public InternalEcoreTerminalsTestLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEcoreTerminalsTestLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEcoreTerminalsTestLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalEcoreTerminalsTestLanguage.g"; }



     	private EcoreTerminalsTestLanguageGrammarAccess grammarAccess;

        public InternalEcoreTerminalsTestLanguageParser(TokenStream input, EcoreTerminalsTestLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected EcoreTerminalsTestLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalEcoreTerminalsTestLanguage.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalEcoreTerminalsTestLanguage.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalEcoreTerminalsTestLanguage.g:65:2: iv_ruleModel= ruleModel EOF
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
    // InternalEcoreTerminalsTestLanguage.g:71:1: ruleModel returns [EObject current=null] : ( (otherlv_0= 'int' ( (lv_intValues_1_0= RULE_EINT ) ) ) | (otherlv_2= 'double' ( (lv_doubleValues_3_0= RULE_EDOUBLE ) ) ) | (otherlv_4= 'date' ( (lv_dateValues_5_0= RULE_EDATE ) ) ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_intValues_1_0=null;
        Token otherlv_2=null;
        Token lv_doubleValues_3_0=null;
        Token otherlv_4=null;
        Token lv_dateValues_5_0=null;

        try {
            // InternalEcoreTerminalsTestLanguage.g:72:1: ( ( (otherlv_0= 'int' ( (lv_intValues_1_0= RULE_EINT ) ) ) | (otherlv_2= 'double' ( (lv_doubleValues_3_0= RULE_EDOUBLE ) ) ) | (otherlv_4= 'date' ( (lv_dateValues_5_0= RULE_EDATE ) ) ) )* )
            // InternalEcoreTerminalsTestLanguage.g:73:2: ( (otherlv_0= 'int' ( (lv_intValues_1_0= RULE_EINT ) ) ) | (otherlv_2= 'double' ( (lv_doubleValues_3_0= RULE_EDOUBLE ) ) ) | (otherlv_4= 'date' ( (lv_dateValues_5_0= RULE_EDATE ) ) ) )*
            {
            // InternalEcoreTerminalsTestLanguage.g:73:2: ( (otherlv_0= 'int' ( (lv_intValues_1_0= RULE_EINT ) ) ) | (otherlv_2= 'double' ( (lv_doubleValues_3_0= RULE_EDOUBLE ) ) ) | (otherlv_4= 'date' ( (lv_dateValues_5_0= RULE_EDATE ) ) ) )*
            loop1:
            do {
                int alt1=4;
                switch ( input.LA(1) ) {
                case 8:
                    {
                    alt1=1;
                    }
                    break;
                case 9:
                    {
                    alt1=2;
                    }
                    break;
                case 10:
                    {
                    alt1=3;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // InternalEcoreTerminalsTestLanguage.g:74:3: (otherlv_0= 'int' ( (lv_intValues_1_0= RULE_EINT ) ) )
            	    {
            	    // InternalEcoreTerminalsTestLanguage.g:74:3: (otherlv_0= 'int' ( (lv_intValues_1_0= RULE_EINT ) ) )
            	    // InternalEcoreTerminalsTestLanguage.g:75:4: otherlv_0= 'int' ( (lv_intValues_1_0= RULE_EINT ) )
            	    {
            	    otherlv_0=(Token)match(input,8,FollowSets000.FOLLOW_3); 

            	    				newLeafNode(otherlv_0, grammarAccess.getModelAccess().getIntKeyword_0_0());
            	    			
            	    // InternalEcoreTerminalsTestLanguage.g:79:4: ( (lv_intValues_1_0= RULE_EINT ) )
            	    // InternalEcoreTerminalsTestLanguage.g:80:5: (lv_intValues_1_0= RULE_EINT )
            	    {
            	    // InternalEcoreTerminalsTestLanguage.g:80:5: (lv_intValues_1_0= RULE_EINT )
            	    // InternalEcoreTerminalsTestLanguage.g:81:6: lv_intValues_1_0= RULE_EINT
            	    {
            	    lv_intValues_1_0=(Token)match(input,RULE_EINT,FollowSets000.FOLLOW_4); 

            	    						newLeafNode(lv_intValues_1_0, grammarAccess.getModelAccess().getIntValuesEINTTerminalRuleCall_0_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getModelRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"intValues",
            	    							lv_intValues_1_0,
            	    							"org.eclipse.xtext.parser.terminalrules.EcoreTerminalsTestLanguage.EINT");
            	    					

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalEcoreTerminalsTestLanguage.g:99:3: (otherlv_2= 'double' ( (lv_doubleValues_3_0= RULE_EDOUBLE ) ) )
            	    {
            	    // InternalEcoreTerminalsTestLanguage.g:99:3: (otherlv_2= 'double' ( (lv_doubleValues_3_0= RULE_EDOUBLE ) ) )
            	    // InternalEcoreTerminalsTestLanguage.g:100:4: otherlv_2= 'double' ( (lv_doubleValues_3_0= RULE_EDOUBLE ) )
            	    {
            	    otherlv_2=(Token)match(input,9,FollowSets000.FOLLOW_5); 

            	    				newLeafNode(otherlv_2, grammarAccess.getModelAccess().getDoubleKeyword_1_0());
            	    			
            	    // InternalEcoreTerminalsTestLanguage.g:104:4: ( (lv_doubleValues_3_0= RULE_EDOUBLE ) )
            	    // InternalEcoreTerminalsTestLanguage.g:105:5: (lv_doubleValues_3_0= RULE_EDOUBLE )
            	    {
            	    // InternalEcoreTerminalsTestLanguage.g:105:5: (lv_doubleValues_3_0= RULE_EDOUBLE )
            	    // InternalEcoreTerminalsTestLanguage.g:106:6: lv_doubleValues_3_0= RULE_EDOUBLE
            	    {
            	    lv_doubleValues_3_0=(Token)match(input,RULE_EDOUBLE,FollowSets000.FOLLOW_4); 

            	    						newLeafNode(lv_doubleValues_3_0, grammarAccess.getModelAccess().getDoubleValuesEDOUBLETerminalRuleCall_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getModelRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"doubleValues",
            	    							lv_doubleValues_3_0,
            	    							"org.eclipse.xtext.parser.terminalrules.EcoreTerminalsTestLanguage.EDOUBLE");
            	    					

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalEcoreTerminalsTestLanguage.g:124:3: (otherlv_4= 'date' ( (lv_dateValues_5_0= RULE_EDATE ) ) )
            	    {
            	    // InternalEcoreTerminalsTestLanguage.g:124:3: (otherlv_4= 'date' ( (lv_dateValues_5_0= RULE_EDATE ) ) )
            	    // InternalEcoreTerminalsTestLanguage.g:125:4: otherlv_4= 'date' ( (lv_dateValues_5_0= RULE_EDATE ) )
            	    {
            	    otherlv_4=(Token)match(input,10,FollowSets000.FOLLOW_6); 

            	    				newLeafNode(otherlv_4, grammarAccess.getModelAccess().getDateKeyword_2_0());
            	    			
            	    // InternalEcoreTerminalsTestLanguage.g:129:4: ( (lv_dateValues_5_0= RULE_EDATE ) )
            	    // InternalEcoreTerminalsTestLanguage.g:130:5: (lv_dateValues_5_0= RULE_EDATE )
            	    {
            	    // InternalEcoreTerminalsTestLanguage.g:130:5: (lv_dateValues_5_0= RULE_EDATE )
            	    // InternalEcoreTerminalsTestLanguage.g:131:6: lv_dateValues_5_0= RULE_EDATE
            	    {
            	    lv_dateValues_5_0=(Token)match(input,RULE_EDATE,FollowSets000.FOLLOW_4); 

            	    						newLeafNode(lv_dateValues_5_0, grammarAccess.getModelAccess().getDateValuesEDATETerminalRuleCall_2_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getModelRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"dateValues",
            	    							lv_dateValues_5_0,
            	    							"org.eclipse.xtext.parser.terminalrules.EcoreTerminalsTestLanguage.EDATE");
            	    					

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
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
    // $ANTLR end "ruleModel"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000702L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000040L});
    }


}