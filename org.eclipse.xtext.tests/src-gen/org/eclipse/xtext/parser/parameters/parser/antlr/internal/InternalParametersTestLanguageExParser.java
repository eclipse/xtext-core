package org.eclipse.xtext.parser.parameters.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.parser.parameters.services.ParametersTestLanguageExGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalParametersTestLanguageExParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'#1'", "'#2'", "'#3'", "'#4'", "'#5'", "'#6'", "'#7'", "'#8'", "'#9'", "'keyword'", "'#10'", "'#11'", "'#12'"
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalParametersTestLanguageExParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalParametersTestLanguageExParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalParametersTestLanguageExParser.tokenNames; }
    public String getGrammarFileName() { return "InternalParametersTestLanguageEx.g"; }



     	private ParametersTestLanguageExGrammarAccess grammarAccess;

        public InternalParametersTestLanguageExParser(TokenStream input, ParametersTestLanguageExGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ParserRuleParameters";
       	}

       	@Override
       	protected ParametersTestLanguageExGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleParserRuleParameters"
    // InternalParametersTestLanguageEx.g:64:1: entryRuleParserRuleParameters returns [EObject current=null] : iv_ruleParserRuleParameters= ruleParserRuleParameters EOF ;
    public final EObject entryRuleParserRuleParameters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParserRuleParameters = null;


        try {
            // InternalParametersTestLanguageEx.g:64:61: (iv_ruleParserRuleParameters= ruleParserRuleParameters EOF )
            // InternalParametersTestLanguageEx.g:65:2: iv_ruleParserRuleParameters= ruleParserRuleParameters EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParserRuleParametersRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleParserRuleParameters=ruleParserRuleParameters();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParserRuleParameters; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleParserRuleParameters"


    // $ANTLR start "ruleParserRuleParameters"
    // InternalParametersTestLanguageEx.g:71:1: ruleParserRuleParameters returns [EObject current=null] : this_ParserRuleParameters_0= superParserRuleParameters ;
    public final EObject ruleParserRuleParameters() throws RecognitionException {
        EObject current = null;

        EObject this_ParserRuleParameters_0 = null;


        try {
            // InternalParametersTestLanguageEx.g:72:1: (this_ParserRuleParameters_0= superParserRuleParameters )
            // InternalParametersTestLanguageEx.g:73:2: this_ParserRuleParameters_0= superParserRuleParameters
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getParserRuleParametersAccess().getParserRuleParametersParserRuleCall());
              	
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_ParserRuleParameters_0=superParserRuleParameters();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_ParserRuleParameters_0;
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
    // $ANTLR end "ruleParserRuleParameters"


    // $ANTLR start "entryRuleScenario1"
    // InternalParametersTestLanguageEx.g:84:1: entryRuleScenario1 returns [EObject current=null] : iv_ruleScenario1= ruleScenario1 EOF ;
    public final EObject entryRuleScenario1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario1 = null;


        try {
            // InternalParametersTestLanguageEx.g:84:50: (iv_ruleScenario1= ruleScenario1 EOF )
            // InternalParametersTestLanguageEx.g:85:2: iv_ruleScenario1= ruleScenario1 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getScenario1Rule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleScenario1=ruleScenario1();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleScenario1; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleScenario1"


    // $ANTLR start "ruleScenario1"
    // InternalParametersTestLanguageEx.g:91:1: ruleScenario1 returns [EObject current=null] : this_Scenario1_0= superScenario1 ;
    public final EObject ruleScenario1() throws RecognitionException {
        EObject current = null;

        EObject this_Scenario1_0 = null;


        try {
            // InternalParametersTestLanguageEx.g:92:1: (this_Scenario1_0= superScenario1 )
            // InternalParametersTestLanguageEx.g:93:2: this_Scenario1_0= superScenario1
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getScenario1Access().getScenario1ParserRuleCall());
              	
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_Scenario1_0=superScenario1();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_Scenario1_0;
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
    // $ANTLR end "ruleScenario1"


    // $ANTLR start "norm1_Scenario1"
    // InternalParametersTestLanguageEx.g:105:1: norm1_Scenario1 returns [EObject current=null] : this_Scenario1_0= normSuper1_Scenario1 ;
    public final EObject norm1_Scenario1() throws RecognitionException {
        EObject current = null;

        EObject this_Scenario1_0 = null;


        try {
            // InternalParametersTestLanguageEx.g:106:1: (this_Scenario1_0= normSuper1_Scenario1 )
            // InternalParametersTestLanguageEx.g:107:2: this_Scenario1_0= normSuper1_Scenario1
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getScenario1Access().getScenario1ParserRuleCall());
              	
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_Scenario1_0=normSuper1_Scenario1();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_Scenario1_0;
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
    // $ANTLR end "norm1_Scenario1"


    // $ANTLR start "entrySuperParserRuleParameters"
    // InternalParametersTestLanguageEx.g:118:1: entrySuperParserRuleParameters returns [EObject current=null] : iv_superParserRuleParameters= superParserRuleParameters EOF ;
    public final EObject entrySuperParserRuleParameters() throws RecognitionException {
        EObject current = null;

        EObject iv_superParserRuleParameters = null;


        try {
            // InternalParametersTestLanguageEx.g:118:62: (iv_superParserRuleParameters= superParserRuleParameters EOF )
            // InternalParametersTestLanguageEx.g:119:2: iv_superParserRuleParameters= superParserRuleParameters EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParametersTestLanguageParserRuleParametersRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_superParserRuleParameters=superParserRuleParameters();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_superParserRuleParameters; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entrySuperParserRuleParameters"


    // $ANTLR start "superParserRuleParameters"
    // InternalParametersTestLanguageEx.g:125:1: superParserRuleParameters returns [EObject current=null] : ( () ( (otherlv_1= '#1' ( (lv_scenario_2_0= norm1_Scenario1 ) ) ) | (otherlv_3= '#2' ( (lv_scenario_4_0= ruleScenario1 ) ) ) | (otherlv_5= '#3' ( (lv_scenario_6_0= norm1_Scenario2 ) ) ) | (otherlv_7= '#4' ( (lv_scenario_8_0= ruleScenario2 ) ) ) | ( ( ( '#5' ( ( norm1_Scenario2 ) ) ) )=> (otherlv_9= '#5' ( (lv_scenario_10_0= norm1_Scenario2 ) ) ) ) | ( ( ( '#6' ( ( ruleScenario2 ) ) ) )=> (otherlv_11= '#6' ( (lv_scenario_12_0= ruleScenario2 ) ) ) ) | (otherlv_13= '#7' ( (lv_scenario_14_0= norm1_Scenario3 ) ) ) | (otherlv_15= '#8' ( (lv_scenario_16_0= ruleScenario3 ) ) ) | (otherlv_17= '#9' ( ( ( ( norm1_IdOrKeyword ) )=> (lv_scenario_18_0= norm1_Scenario4 ) ) | ( ( (lv_scenario_19_0= norm1_Scenario2 ) ) (otherlv_20= 'keyword' )? ) ) ) | (otherlv_21= '#10' ( ( ( ( norm1_IdOrKeyword ) )=> (lv_scenario_22_0= norm1_Scenario4 ) ) | ( ( (lv_scenario_23_0= ruleScenario2 ) ) (otherlv_24= 'keyword' )? ) ) ) | (otherlv_25= '#11' ( ( ( ( ruleIdOrKeyword ) )=> (lv_scenario_26_0= ruleScenario4 ) ) | ( ( (lv_scenario_27_0= norm1_Scenario2 ) ) (otherlv_28= 'keyword' )? ) ) ) | (otherlv_29= '#12' ( ( ( ( ruleIdOrKeyword ) )=> (lv_scenario_30_0= ruleScenario4 ) ) | ( ( (lv_scenario_31_0= ruleScenario2 ) ) (otherlv_32= 'keyword' )? ) ) ) ) ) ;
    public final EObject superParserRuleParameters() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_32=null;
        EObject lv_scenario_2_0 = null;

        EObject lv_scenario_4_0 = null;

        EObject lv_scenario_6_0 = null;

        EObject lv_scenario_8_0 = null;

        EObject lv_scenario_10_0 = null;

        EObject lv_scenario_12_0 = null;

        EObject lv_scenario_14_0 = null;

        EObject lv_scenario_16_0 = null;

        EObject lv_scenario_18_0 = null;

        EObject lv_scenario_19_0 = null;

        EObject lv_scenario_22_0 = null;

        EObject lv_scenario_23_0 = null;

        EObject lv_scenario_26_0 = null;

        EObject lv_scenario_27_0 = null;

        EObject lv_scenario_30_0 = null;

        EObject lv_scenario_31_0 = null;


        try {
            // InternalParametersTestLanguageEx.g:126:1: ( ( () ( (otherlv_1= '#1' ( (lv_scenario_2_0= norm1_Scenario1 ) ) ) | (otherlv_3= '#2' ( (lv_scenario_4_0= ruleScenario1 ) ) ) | (otherlv_5= '#3' ( (lv_scenario_6_0= norm1_Scenario2 ) ) ) | (otherlv_7= '#4' ( (lv_scenario_8_0= ruleScenario2 ) ) ) | ( ( ( '#5' ( ( norm1_Scenario2 ) ) ) )=> (otherlv_9= '#5' ( (lv_scenario_10_0= norm1_Scenario2 ) ) ) ) | ( ( ( '#6' ( ( ruleScenario2 ) ) ) )=> (otherlv_11= '#6' ( (lv_scenario_12_0= ruleScenario2 ) ) ) ) | (otherlv_13= '#7' ( (lv_scenario_14_0= norm1_Scenario3 ) ) ) | (otherlv_15= '#8' ( (lv_scenario_16_0= ruleScenario3 ) ) ) | (otherlv_17= '#9' ( ( ( ( norm1_IdOrKeyword ) )=> (lv_scenario_18_0= norm1_Scenario4 ) ) | ( ( (lv_scenario_19_0= norm1_Scenario2 ) ) (otherlv_20= 'keyword' )? ) ) ) | (otherlv_21= '#10' ( ( ( ( norm1_IdOrKeyword ) )=> (lv_scenario_22_0= norm1_Scenario4 ) ) | ( ( (lv_scenario_23_0= ruleScenario2 ) ) (otherlv_24= 'keyword' )? ) ) ) | (otherlv_25= '#11' ( ( ( ( ruleIdOrKeyword ) )=> (lv_scenario_26_0= ruleScenario4 ) ) | ( ( (lv_scenario_27_0= norm1_Scenario2 ) ) (otherlv_28= 'keyword' )? ) ) ) | (otherlv_29= '#12' ( ( ( ( ruleIdOrKeyword ) )=> (lv_scenario_30_0= ruleScenario4 ) ) | ( ( (lv_scenario_31_0= ruleScenario2 ) ) (otherlv_32= 'keyword' )? ) ) ) ) ) )
            // InternalParametersTestLanguageEx.g:127:2: ( () ( (otherlv_1= '#1' ( (lv_scenario_2_0= norm1_Scenario1 ) ) ) | (otherlv_3= '#2' ( (lv_scenario_4_0= ruleScenario1 ) ) ) | (otherlv_5= '#3' ( (lv_scenario_6_0= norm1_Scenario2 ) ) ) | (otherlv_7= '#4' ( (lv_scenario_8_0= ruleScenario2 ) ) ) | ( ( ( '#5' ( ( norm1_Scenario2 ) ) ) )=> (otherlv_9= '#5' ( (lv_scenario_10_0= norm1_Scenario2 ) ) ) ) | ( ( ( '#6' ( ( ruleScenario2 ) ) ) )=> (otherlv_11= '#6' ( (lv_scenario_12_0= ruleScenario2 ) ) ) ) | (otherlv_13= '#7' ( (lv_scenario_14_0= norm1_Scenario3 ) ) ) | (otherlv_15= '#8' ( (lv_scenario_16_0= ruleScenario3 ) ) ) | (otherlv_17= '#9' ( ( ( ( norm1_IdOrKeyword ) )=> (lv_scenario_18_0= norm1_Scenario4 ) ) | ( ( (lv_scenario_19_0= norm1_Scenario2 ) ) (otherlv_20= 'keyword' )? ) ) ) | (otherlv_21= '#10' ( ( ( ( norm1_IdOrKeyword ) )=> (lv_scenario_22_0= norm1_Scenario4 ) ) | ( ( (lv_scenario_23_0= ruleScenario2 ) ) (otherlv_24= 'keyword' )? ) ) ) | (otherlv_25= '#11' ( ( ( ( ruleIdOrKeyword ) )=> (lv_scenario_26_0= ruleScenario4 ) ) | ( ( (lv_scenario_27_0= norm1_Scenario2 ) ) (otherlv_28= 'keyword' )? ) ) ) | (otherlv_29= '#12' ( ( ( ( ruleIdOrKeyword ) )=> (lv_scenario_30_0= ruleScenario4 ) ) | ( ( (lv_scenario_31_0= ruleScenario2 ) ) (otherlv_32= 'keyword' )? ) ) ) ) )
            {
            // InternalParametersTestLanguageEx.g:127:2: ( () ( (otherlv_1= '#1' ( (lv_scenario_2_0= norm1_Scenario1 ) ) ) | (otherlv_3= '#2' ( (lv_scenario_4_0= ruleScenario1 ) ) ) | (otherlv_5= '#3' ( (lv_scenario_6_0= norm1_Scenario2 ) ) ) | (otherlv_7= '#4' ( (lv_scenario_8_0= ruleScenario2 ) ) ) | ( ( ( '#5' ( ( norm1_Scenario2 ) ) ) )=> (otherlv_9= '#5' ( (lv_scenario_10_0= norm1_Scenario2 ) ) ) ) | ( ( ( '#6' ( ( ruleScenario2 ) ) ) )=> (otherlv_11= '#6' ( (lv_scenario_12_0= ruleScenario2 ) ) ) ) | (otherlv_13= '#7' ( (lv_scenario_14_0= norm1_Scenario3 ) ) ) | (otherlv_15= '#8' ( (lv_scenario_16_0= ruleScenario3 ) ) ) | (otherlv_17= '#9' ( ( ( ( norm1_IdOrKeyword ) )=> (lv_scenario_18_0= norm1_Scenario4 ) ) | ( ( (lv_scenario_19_0= norm1_Scenario2 ) ) (otherlv_20= 'keyword' )? ) ) ) | (otherlv_21= '#10' ( ( ( ( norm1_IdOrKeyword ) )=> (lv_scenario_22_0= norm1_Scenario4 ) ) | ( ( (lv_scenario_23_0= ruleScenario2 ) ) (otherlv_24= 'keyword' )? ) ) ) | (otherlv_25= '#11' ( ( ( ( ruleIdOrKeyword ) )=> (lv_scenario_26_0= ruleScenario4 ) ) | ( ( (lv_scenario_27_0= norm1_Scenario2 ) ) (otherlv_28= 'keyword' )? ) ) ) | (otherlv_29= '#12' ( ( ( ( ruleIdOrKeyword ) )=> (lv_scenario_30_0= ruleScenario4 ) ) | ( ( (lv_scenario_31_0= ruleScenario2 ) ) (otherlv_32= 'keyword' )? ) ) ) ) )
            // InternalParametersTestLanguageEx.g:128:3: () ( (otherlv_1= '#1' ( (lv_scenario_2_0= norm1_Scenario1 ) ) ) | (otherlv_3= '#2' ( (lv_scenario_4_0= ruleScenario1 ) ) ) | (otherlv_5= '#3' ( (lv_scenario_6_0= norm1_Scenario2 ) ) ) | (otherlv_7= '#4' ( (lv_scenario_8_0= ruleScenario2 ) ) ) | ( ( ( '#5' ( ( norm1_Scenario2 ) ) ) )=> (otherlv_9= '#5' ( (lv_scenario_10_0= norm1_Scenario2 ) ) ) ) | ( ( ( '#6' ( ( ruleScenario2 ) ) ) )=> (otherlv_11= '#6' ( (lv_scenario_12_0= ruleScenario2 ) ) ) ) | (otherlv_13= '#7' ( (lv_scenario_14_0= norm1_Scenario3 ) ) ) | (otherlv_15= '#8' ( (lv_scenario_16_0= ruleScenario3 ) ) ) | (otherlv_17= '#9' ( ( ( ( norm1_IdOrKeyword ) )=> (lv_scenario_18_0= norm1_Scenario4 ) ) | ( ( (lv_scenario_19_0= norm1_Scenario2 ) ) (otherlv_20= 'keyword' )? ) ) ) | (otherlv_21= '#10' ( ( ( ( norm1_IdOrKeyword ) )=> (lv_scenario_22_0= norm1_Scenario4 ) ) | ( ( (lv_scenario_23_0= ruleScenario2 ) ) (otherlv_24= 'keyword' )? ) ) ) | (otherlv_25= '#11' ( ( ( ( ruleIdOrKeyword ) )=> (lv_scenario_26_0= ruleScenario4 ) ) | ( ( (lv_scenario_27_0= norm1_Scenario2 ) ) (otherlv_28= 'keyword' )? ) ) ) | (otherlv_29= '#12' ( ( ( ( ruleIdOrKeyword ) )=> (lv_scenario_30_0= ruleScenario4 ) ) | ( ( (lv_scenario_31_0= ruleScenario2 ) ) (otherlv_32= 'keyword' )? ) ) ) )
            {
            // InternalParametersTestLanguageEx.g:128:3: ()
            // InternalParametersTestLanguageEx.g:129:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getParametersTestLanguageParserRuleParametersAccess().getParserRuleParametersAction_0(),
              					current);
              			
            }

            }

            // InternalParametersTestLanguageEx.g:135:3: ( (otherlv_1= '#1' ( (lv_scenario_2_0= norm1_Scenario1 ) ) ) | (otherlv_3= '#2' ( (lv_scenario_4_0= ruleScenario1 ) ) ) | (otherlv_5= '#3' ( (lv_scenario_6_0= norm1_Scenario2 ) ) ) | (otherlv_7= '#4' ( (lv_scenario_8_0= ruleScenario2 ) ) ) | ( ( ( '#5' ( ( norm1_Scenario2 ) ) ) )=> (otherlv_9= '#5' ( (lv_scenario_10_0= norm1_Scenario2 ) ) ) ) | ( ( ( '#6' ( ( ruleScenario2 ) ) ) )=> (otherlv_11= '#6' ( (lv_scenario_12_0= ruleScenario2 ) ) ) ) | (otherlv_13= '#7' ( (lv_scenario_14_0= norm1_Scenario3 ) ) ) | (otherlv_15= '#8' ( (lv_scenario_16_0= ruleScenario3 ) ) ) | (otherlv_17= '#9' ( ( ( ( norm1_IdOrKeyword ) )=> (lv_scenario_18_0= norm1_Scenario4 ) ) | ( ( (lv_scenario_19_0= norm1_Scenario2 ) ) (otherlv_20= 'keyword' )? ) ) ) | (otherlv_21= '#10' ( ( ( ( norm1_IdOrKeyword ) )=> (lv_scenario_22_0= norm1_Scenario4 ) ) | ( ( (lv_scenario_23_0= ruleScenario2 ) ) (otherlv_24= 'keyword' )? ) ) ) | (otherlv_25= '#11' ( ( ( ( ruleIdOrKeyword ) )=> (lv_scenario_26_0= ruleScenario4 ) ) | ( ( (lv_scenario_27_0= norm1_Scenario2 ) ) (otherlv_28= 'keyword' )? ) ) ) | (otherlv_29= '#12' ( ( ( ( ruleIdOrKeyword ) )=> (lv_scenario_30_0= ruleScenario4 ) ) | ( ( (lv_scenario_31_0= ruleScenario2 ) ) (otherlv_32= 'keyword' )? ) ) ) )
            int alt9=12;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalParametersTestLanguageEx.g:136:4: (otherlv_1= '#1' ( (lv_scenario_2_0= norm1_Scenario1 ) ) )
                    {
                    // InternalParametersTestLanguageEx.g:136:4: (otherlv_1= '#1' ( (lv_scenario_2_0= norm1_Scenario1 ) ) )
                    // InternalParametersTestLanguageEx.g:137:5: otherlv_1= '#1' ( (lv_scenario_2_0= norm1_Scenario1 ) )
                    {
                    otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getParametersTestLanguageParserRuleParametersAccess().getNumberSignDigitOneKeyword_1_0_0());
                      				
                    }
                    // InternalParametersTestLanguageEx.g:141:5: ( (lv_scenario_2_0= norm1_Scenario1 ) )
                    // InternalParametersTestLanguageEx.g:142:6: (lv_scenario_2_0= norm1_Scenario1 )
                    {
                    // InternalParametersTestLanguageEx.g:142:6: (lv_scenario_2_0= norm1_Scenario1 )
                    // InternalParametersTestLanguageEx.g:143:7: lv_scenario_2_0= norm1_Scenario1
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getParametersTestLanguageParserRuleParametersAccess().getScenarioScenario1ParserRuleCall_1_0_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_scenario_2_0=norm1_Scenario1();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getParametersTestLanguageParserRuleParametersRule());
                      							}
                      							set(
                      								current,
                      								"scenario",
                      								lv_scenario_2_0,
                      								"org.eclipse.xtext.parser.parameters.ParametersTestLanguageEx.Scenario1");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalParametersTestLanguageEx.g:162:4: (otherlv_3= '#2' ( (lv_scenario_4_0= ruleScenario1 ) ) )
                    {
                    // InternalParametersTestLanguageEx.g:162:4: (otherlv_3= '#2' ( (lv_scenario_4_0= ruleScenario1 ) ) )
                    // InternalParametersTestLanguageEx.g:163:5: otherlv_3= '#2' ( (lv_scenario_4_0= ruleScenario1 ) )
                    {
                    otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getParametersTestLanguageParserRuleParametersAccess().getNumberSignDigitTwoKeyword_1_1_0());
                      				
                    }
                    // InternalParametersTestLanguageEx.g:167:5: ( (lv_scenario_4_0= ruleScenario1 ) )
                    // InternalParametersTestLanguageEx.g:168:6: (lv_scenario_4_0= ruleScenario1 )
                    {
                    // InternalParametersTestLanguageEx.g:168:6: (lv_scenario_4_0= ruleScenario1 )
                    // InternalParametersTestLanguageEx.g:169:7: lv_scenario_4_0= ruleScenario1
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getParametersTestLanguageParserRuleParametersAccess().getScenarioScenario1ParserRuleCall_1_1_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_scenario_4_0=ruleScenario1();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getParametersTestLanguageParserRuleParametersRule());
                      							}
                      							set(
                      								current,
                      								"scenario",
                      								lv_scenario_4_0,
                      								"org.eclipse.xtext.parser.parameters.ParametersTestLanguageEx.Scenario1");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalParametersTestLanguageEx.g:188:4: (otherlv_5= '#3' ( (lv_scenario_6_0= norm1_Scenario2 ) ) )
                    {
                    // InternalParametersTestLanguageEx.g:188:4: (otherlv_5= '#3' ( (lv_scenario_6_0= norm1_Scenario2 ) ) )
                    // InternalParametersTestLanguageEx.g:189:5: otherlv_5= '#3' ( (lv_scenario_6_0= norm1_Scenario2 ) )
                    {
                    otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getParametersTestLanguageParserRuleParametersAccess().getNumberSignDigitThreeKeyword_1_2_0());
                      				
                    }
                    // InternalParametersTestLanguageEx.g:193:5: ( (lv_scenario_6_0= norm1_Scenario2 ) )
                    // InternalParametersTestLanguageEx.g:194:6: (lv_scenario_6_0= norm1_Scenario2 )
                    {
                    // InternalParametersTestLanguageEx.g:194:6: (lv_scenario_6_0= norm1_Scenario2 )
                    // InternalParametersTestLanguageEx.g:195:7: lv_scenario_6_0= norm1_Scenario2
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getParametersTestLanguageParserRuleParametersAccess().getScenarioScenario2ParserRuleCall_1_2_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_scenario_6_0=norm1_Scenario2();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getParametersTestLanguageParserRuleParametersRule());
                      							}
                      							set(
                      								current,
                      								"scenario",
                      								lv_scenario_6_0,
                      								"org.eclipse.xtext.parser.parameters.ParametersTestLanguage.Scenario2");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalParametersTestLanguageEx.g:214:4: (otherlv_7= '#4' ( (lv_scenario_8_0= ruleScenario2 ) ) )
                    {
                    // InternalParametersTestLanguageEx.g:214:4: (otherlv_7= '#4' ( (lv_scenario_8_0= ruleScenario2 ) ) )
                    // InternalParametersTestLanguageEx.g:215:5: otherlv_7= '#4' ( (lv_scenario_8_0= ruleScenario2 ) )
                    {
                    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_7, grammarAccess.getParametersTestLanguageParserRuleParametersAccess().getNumberSignDigitFourKeyword_1_3_0());
                      				
                    }
                    // InternalParametersTestLanguageEx.g:219:5: ( (lv_scenario_8_0= ruleScenario2 ) )
                    // InternalParametersTestLanguageEx.g:220:6: (lv_scenario_8_0= ruleScenario2 )
                    {
                    // InternalParametersTestLanguageEx.g:220:6: (lv_scenario_8_0= ruleScenario2 )
                    // InternalParametersTestLanguageEx.g:221:7: lv_scenario_8_0= ruleScenario2
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getParametersTestLanguageParserRuleParametersAccess().getScenarioScenario2ParserRuleCall_1_3_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_scenario_8_0=ruleScenario2();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getParametersTestLanguageParserRuleParametersRule());
                      							}
                      							set(
                      								current,
                      								"scenario",
                      								lv_scenario_8_0,
                      								"org.eclipse.xtext.parser.parameters.ParametersTestLanguage.Scenario2");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalParametersTestLanguageEx.g:240:4: ( ( ( '#5' ( ( norm1_Scenario2 ) ) ) )=> (otherlv_9= '#5' ( (lv_scenario_10_0= norm1_Scenario2 ) ) ) )
                    {
                    // InternalParametersTestLanguageEx.g:240:4: ( ( ( '#5' ( ( norm1_Scenario2 ) ) ) )=> (otherlv_9= '#5' ( (lv_scenario_10_0= norm1_Scenario2 ) ) ) )
                    // InternalParametersTestLanguageEx.g:241:5: ( ( '#5' ( ( norm1_Scenario2 ) ) ) )=> (otherlv_9= '#5' ( (lv_scenario_10_0= norm1_Scenario2 ) ) )
                    {
                    // InternalParametersTestLanguageEx.g:250:5: (otherlv_9= '#5' ( (lv_scenario_10_0= norm1_Scenario2 ) ) )
                    // InternalParametersTestLanguageEx.g:251:6: otherlv_9= '#5' ( (lv_scenario_10_0= norm1_Scenario2 ) )
                    {
                    otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_9, grammarAccess.getParametersTestLanguageParserRuleParametersAccess().getNumberSignDigitFiveKeyword_1_4_0_0());
                      					
                    }
                    // InternalParametersTestLanguageEx.g:255:6: ( (lv_scenario_10_0= norm1_Scenario2 ) )
                    // InternalParametersTestLanguageEx.g:256:7: (lv_scenario_10_0= norm1_Scenario2 )
                    {
                    // InternalParametersTestLanguageEx.g:256:7: (lv_scenario_10_0= norm1_Scenario2 )
                    // InternalParametersTestLanguageEx.g:257:8: lv_scenario_10_0= norm1_Scenario2
                    {
                    if ( state.backtracking==0 ) {

                      								newCompositeNode(grammarAccess.getParametersTestLanguageParserRuleParametersAccess().getScenarioScenario2ParserRuleCall_1_4_0_1_0());
                      							
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_scenario_10_0=norm1_Scenario2();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      								if (current==null) {
                      									current = createModelElementForParent(grammarAccess.getParametersTestLanguageParserRuleParametersRule());
                      								}
                      								set(
                      									current,
                      									"scenario",
                      									lv_scenario_10_0,
                      									"org.eclipse.xtext.parser.parameters.ParametersTestLanguage.Scenario2");
                      								afterParserOrEnumRuleCall();
                      							
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalParametersTestLanguageEx.g:277:4: ( ( ( '#6' ( ( ruleScenario2 ) ) ) )=> (otherlv_11= '#6' ( (lv_scenario_12_0= ruleScenario2 ) ) ) )
                    {
                    // InternalParametersTestLanguageEx.g:277:4: ( ( ( '#6' ( ( ruleScenario2 ) ) ) )=> (otherlv_11= '#6' ( (lv_scenario_12_0= ruleScenario2 ) ) ) )
                    // InternalParametersTestLanguageEx.g:278:5: ( ( '#6' ( ( ruleScenario2 ) ) ) )=> (otherlv_11= '#6' ( (lv_scenario_12_0= ruleScenario2 ) ) )
                    {
                    // InternalParametersTestLanguageEx.g:287:5: (otherlv_11= '#6' ( (lv_scenario_12_0= ruleScenario2 ) ) )
                    // InternalParametersTestLanguageEx.g:288:6: otherlv_11= '#6' ( (lv_scenario_12_0= ruleScenario2 ) )
                    {
                    otherlv_11=(Token)match(input,16,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_11, grammarAccess.getParametersTestLanguageParserRuleParametersAccess().getNumberSignDigitSixKeyword_1_5_0_0());
                      					
                    }
                    // InternalParametersTestLanguageEx.g:292:6: ( (lv_scenario_12_0= ruleScenario2 ) )
                    // InternalParametersTestLanguageEx.g:293:7: (lv_scenario_12_0= ruleScenario2 )
                    {
                    // InternalParametersTestLanguageEx.g:293:7: (lv_scenario_12_0= ruleScenario2 )
                    // InternalParametersTestLanguageEx.g:294:8: lv_scenario_12_0= ruleScenario2
                    {
                    if ( state.backtracking==0 ) {

                      								newCompositeNode(grammarAccess.getParametersTestLanguageParserRuleParametersAccess().getScenarioScenario2ParserRuleCall_1_5_0_1_0());
                      							
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_scenario_12_0=ruleScenario2();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      								if (current==null) {
                      									current = createModelElementForParent(grammarAccess.getParametersTestLanguageParserRuleParametersRule());
                      								}
                      								set(
                      									current,
                      									"scenario",
                      									lv_scenario_12_0,
                      									"org.eclipse.xtext.parser.parameters.ParametersTestLanguage.Scenario2");
                      								afterParserOrEnumRuleCall();
                      							
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalParametersTestLanguageEx.g:314:4: (otherlv_13= '#7' ( (lv_scenario_14_0= norm1_Scenario3 ) ) )
                    {
                    // InternalParametersTestLanguageEx.g:314:4: (otherlv_13= '#7' ( (lv_scenario_14_0= norm1_Scenario3 ) ) )
                    // InternalParametersTestLanguageEx.g:315:5: otherlv_13= '#7' ( (lv_scenario_14_0= norm1_Scenario3 ) )
                    {
                    otherlv_13=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_13, grammarAccess.getParametersTestLanguageParserRuleParametersAccess().getNumberSignDigitSevenKeyword_1_6_0());
                      				
                    }
                    // InternalParametersTestLanguageEx.g:319:5: ( (lv_scenario_14_0= norm1_Scenario3 ) )
                    // InternalParametersTestLanguageEx.g:320:6: (lv_scenario_14_0= norm1_Scenario3 )
                    {
                    // InternalParametersTestLanguageEx.g:320:6: (lv_scenario_14_0= norm1_Scenario3 )
                    // InternalParametersTestLanguageEx.g:321:7: lv_scenario_14_0= norm1_Scenario3
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getParametersTestLanguageParserRuleParametersAccess().getScenarioScenario3ParserRuleCall_1_6_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_scenario_14_0=norm1_Scenario3();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getParametersTestLanguageParserRuleParametersRule());
                      							}
                      							set(
                      								current,
                      								"scenario",
                      								lv_scenario_14_0,
                      								"org.eclipse.xtext.parser.parameters.ParametersTestLanguage.Scenario3");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalParametersTestLanguageEx.g:340:4: (otherlv_15= '#8' ( (lv_scenario_16_0= ruleScenario3 ) ) )
                    {
                    // InternalParametersTestLanguageEx.g:340:4: (otherlv_15= '#8' ( (lv_scenario_16_0= ruleScenario3 ) ) )
                    // InternalParametersTestLanguageEx.g:341:5: otherlv_15= '#8' ( (lv_scenario_16_0= ruleScenario3 ) )
                    {
                    otherlv_15=(Token)match(input,18,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_15, grammarAccess.getParametersTestLanguageParserRuleParametersAccess().getNumberSignDigitEightKeyword_1_7_0());
                      				
                    }
                    // InternalParametersTestLanguageEx.g:345:5: ( (lv_scenario_16_0= ruleScenario3 ) )
                    // InternalParametersTestLanguageEx.g:346:6: (lv_scenario_16_0= ruleScenario3 )
                    {
                    // InternalParametersTestLanguageEx.g:346:6: (lv_scenario_16_0= ruleScenario3 )
                    // InternalParametersTestLanguageEx.g:347:7: lv_scenario_16_0= ruleScenario3
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getParametersTestLanguageParserRuleParametersAccess().getScenarioScenario3ParserRuleCall_1_7_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_scenario_16_0=ruleScenario3();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getParametersTestLanguageParserRuleParametersRule());
                      							}
                      							set(
                      								current,
                      								"scenario",
                      								lv_scenario_16_0,
                      								"org.eclipse.xtext.parser.parameters.ParametersTestLanguage.Scenario3");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 9 :
                    // InternalParametersTestLanguageEx.g:366:4: (otherlv_17= '#9' ( ( ( ( norm1_IdOrKeyword ) )=> (lv_scenario_18_0= norm1_Scenario4 ) ) | ( ( (lv_scenario_19_0= norm1_Scenario2 ) ) (otherlv_20= 'keyword' )? ) ) )
                    {
                    // InternalParametersTestLanguageEx.g:366:4: (otherlv_17= '#9' ( ( ( ( norm1_IdOrKeyword ) )=> (lv_scenario_18_0= norm1_Scenario4 ) ) | ( ( (lv_scenario_19_0= norm1_Scenario2 ) ) (otherlv_20= 'keyword' )? ) ) )
                    // InternalParametersTestLanguageEx.g:367:5: otherlv_17= '#9' ( ( ( ( norm1_IdOrKeyword ) )=> (lv_scenario_18_0= norm1_Scenario4 ) ) | ( ( (lv_scenario_19_0= norm1_Scenario2 ) ) (otherlv_20= 'keyword' )? ) )
                    {
                    otherlv_17=(Token)match(input,19,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_17, grammarAccess.getParametersTestLanguageParserRuleParametersAccess().getNumberSignDigitNineKeyword_1_8_0());
                      				
                    }
                    // InternalParametersTestLanguageEx.g:371:5: ( ( ( ( norm1_IdOrKeyword ) )=> (lv_scenario_18_0= norm1_Scenario4 ) ) | ( ( (lv_scenario_19_0= norm1_Scenario2 ) ) (otherlv_20= 'keyword' )? ) )
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==20) ) {
                        int LA2_1 = input.LA(2);

                        if ( (LA2_1==20) ) {
                            int LA2_3 = input.LA(3);

                            if ( (synpred3_InternalParametersTestLanguageEx()) ) {
                                alt2=1;
                            }
                            else if ( (true) ) {
                                alt2=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 2, 3, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA2_1==EOF) ) {
                            alt2=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 1, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA2_0==RULE_ID) ) {
                        int LA2_2 = input.LA(2);

                        if ( (LA2_2==20) ) {
                            int LA2_3 = input.LA(3);

                            if ( (synpred3_InternalParametersTestLanguageEx()) ) {
                                alt2=1;
                            }
                            else if ( (true) ) {
                                alt2=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 2, 3, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA2_2==EOF) ) {
                            alt2=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 2, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 0, input);

                        throw nvae;
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalParametersTestLanguageEx.g:372:6: ( ( ( norm1_IdOrKeyword ) )=> (lv_scenario_18_0= norm1_Scenario4 ) )
                            {
                            // InternalParametersTestLanguageEx.g:372:6: ( ( ( norm1_IdOrKeyword ) )=> (lv_scenario_18_0= norm1_Scenario4 ) )
                            // InternalParametersTestLanguageEx.g:373:7: ( ( norm1_IdOrKeyword ) )=> (lv_scenario_18_0= norm1_Scenario4 )
                            {
                            // InternalParametersTestLanguageEx.g:377:7: (lv_scenario_18_0= norm1_Scenario4 )
                            // InternalParametersTestLanguageEx.g:378:8: lv_scenario_18_0= norm1_Scenario4
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getParametersTestLanguageParserRuleParametersAccess().getScenarioScenario4ParserRuleCall_1_8_1_0_0());
                              							
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_scenario_18_0=norm1_Scenario4();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getParametersTestLanguageParserRuleParametersRule());
                              								}
                              								set(
                              									current,
                              									"scenario",
                              									lv_scenario_18_0,
                              									"org.eclipse.xtext.parser.parameters.ParametersTestLanguage.Scenario4");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalParametersTestLanguageEx.g:396:6: ( ( (lv_scenario_19_0= norm1_Scenario2 ) ) (otherlv_20= 'keyword' )? )
                            {
                            // InternalParametersTestLanguageEx.g:396:6: ( ( (lv_scenario_19_0= norm1_Scenario2 ) ) (otherlv_20= 'keyword' )? )
                            // InternalParametersTestLanguageEx.g:397:7: ( (lv_scenario_19_0= norm1_Scenario2 ) ) (otherlv_20= 'keyword' )?
                            {
                            // InternalParametersTestLanguageEx.g:397:7: ( (lv_scenario_19_0= norm1_Scenario2 ) )
                            // InternalParametersTestLanguageEx.g:398:8: (lv_scenario_19_0= norm1_Scenario2 )
                            {
                            // InternalParametersTestLanguageEx.g:398:8: (lv_scenario_19_0= norm1_Scenario2 )
                            // InternalParametersTestLanguageEx.g:399:9: lv_scenario_19_0= norm1_Scenario2
                            {
                            if ( state.backtracking==0 ) {

                              									newCompositeNode(grammarAccess.getParametersTestLanguageParserRuleParametersAccess().getScenarioScenario2ParserRuleCall_1_8_1_1_0_0());
                              								
                            }
                            pushFollow(FollowSets000.FOLLOW_5);
                            lv_scenario_19_0=norm1_Scenario2();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              									if (current==null) {
                              										current = createModelElementForParent(grammarAccess.getParametersTestLanguageParserRuleParametersRule());
                              									}
                              									set(
                              										current,
                              										"scenario",
                              										lv_scenario_19_0,
                              										"org.eclipse.xtext.parser.parameters.ParametersTestLanguage.Scenario2");
                              									afterParserOrEnumRuleCall();
                              								
                            }

                            }


                            }

                            // InternalParametersTestLanguageEx.g:416:7: (otherlv_20= 'keyword' )?
                            int alt1=2;
                            int LA1_0 = input.LA(1);

                            if ( (LA1_0==20) ) {
                                alt1=1;
                            }
                            switch (alt1) {
                                case 1 :
                                    // InternalParametersTestLanguageEx.g:417:8: otherlv_20= 'keyword'
                                    {
                                    otherlv_20=(Token)match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      								newLeafNode(otherlv_20, grammarAccess.getParametersTestLanguageParserRuleParametersAccess().getKeywordKeyword_1_8_1_1_1());
                                      							
                                    }

                                    }
                                    break;

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 10 :
                    // InternalParametersTestLanguageEx.g:426:4: (otherlv_21= '#10' ( ( ( ( norm1_IdOrKeyword ) )=> (lv_scenario_22_0= norm1_Scenario4 ) ) | ( ( (lv_scenario_23_0= ruleScenario2 ) ) (otherlv_24= 'keyword' )? ) ) )
                    {
                    // InternalParametersTestLanguageEx.g:426:4: (otherlv_21= '#10' ( ( ( ( norm1_IdOrKeyword ) )=> (lv_scenario_22_0= norm1_Scenario4 ) ) | ( ( (lv_scenario_23_0= ruleScenario2 ) ) (otherlv_24= 'keyword' )? ) ) )
                    // InternalParametersTestLanguageEx.g:427:5: otherlv_21= '#10' ( ( ( ( norm1_IdOrKeyword ) )=> (lv_scenario_22_0= norm1_Scenario4 ) ) | ( ( (lv_scenario_23_0= ruleScenario2 ) ) (otherlv_24= 'keyword' )? ) )
                    {
                    otherlv_21=(Token)match(input,21,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_21, grammarAccess.getParametersTestLanguageParserRuleParametersAccess().getNumberSignDigitOneDigitZeroKeyword_1_9_0());
                      				
                    }
                    // InternalParametersTestLanguageEx.g:431:5: ( ( ( ( norm1_IdOrKeyword ) )=> (lv_scenario_22_0= norm1_Scenario4 ) ) | ( ( (lv_scenario_23_0= ruleScenario2 ) ) (otherlv_24= 'keyword' )? ) )
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==20) && (synpred4_InternalParametersTestLanguageEx())) {
                        alt4=1;
                    }
                    else if ( (LA4_0==RULE_ID) ) {
                        int LA4_2 = input.LA(2);

                        if ( (LA4_2==20) ) {
                            int LA4_3 = input.LA(3);

                            if ( (synpred4_InternalParametersTestLanguageEx()) ) {
                                alt4=1;
                            }
                            else if ( (true) ) {
                                alt4=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 4, 3, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA4_2==EOF) ) {
                            alt4=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 2, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 0, input);

                        throw nvae;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalParametersTestLanguageEx.g:432:6: ( ( ( norm1_IdOrKeyword ) )=> (lv_scenario_22_0= norm1_Scenario4 ) )
                            {
                            // InternalParametersTestLanguageEx.g:432:6: ( ( ( norm1_IdOrKeyword ) )=> (lv_scenario_22_0= norm1_Scenario4 ) )
                            // InternalParametersTestLanguageEx.g:433:7: ( ( norm1_IdOrKeyword ) )=> (lv_scenario_22_0= norm1_Scenario4 )
                            {
                            // InternalParametersTestLanguageEx.g:437:7: (lv_scenario_22_0= norm1_Scenario4 )
                            // InternalParametersTestLanguageEx.g:438:8: lv_scenario_22_0= norm1_Scenario4
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getParametersTestLanguageParserRuleParametersAccess().getScenarioScenario4ParserRuleCall_1_9_1_0_0());
                              							
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_scenario_22_0=norm1_Scenario4();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getParametersTestLanguageParserRuleParametersRule());
                              								}
                              								set(
                              									current,
                              									"scenario",
                              									lv_scenario_22_0,
                              									"org.eclipse.xtext.parser.parameters.ParametersTestLanguage.Scenario4");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalParametersTestLanguageEx.g:456:6: ( ( (lv_scenario_23_0= ruleScenario2 ) ) (otherlv_24= 'keyword' )? )
                            {
                            // InternalParametersTestLanguageEx.g:456:6: ( ( (lv_scenario_23_0= ruleScenario2 ) ) (otherlv_24= 'keyword' )? )
                            // InternalParametersTestLanguageEx.g:457:7: ( (lv_scenario_23_0= ruleScenario2 ) ) (otherlv_24= 'keyword' )?
                            {
                            // InternalParametersTestLanguageEx.g:457:7: ( (lv_scenario_23_0= ruleScenario2 ) )
                            // InternalParametersTestLanguageEx.g:458:8: (lv_scenario_23_0= ruleScenario2 )
                            {
                            // InternalParametersTestLanguageEx.g:458:8: (lv_scenario_23_0= ruleScenario2 )
                            // InternalParametersTestLanguageEx.g:459:9: lv_scenario_23_0= ruleScenario2
                            {
                            if ( state.backtracking==0 ) {

                              									newCompositeNode(grammarAccess.getParametersTestLanguageParserRuleParametersAccess().getScenarioScenario2ParserRuleCall_1_9_1_1_0_0());
                              								
                            }
                            pushFollow(FollowSets000.FOLLOW_5);
                            lv_scenario_23_0=ruleScenario2();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              									if (current==null) {
                              										current = createModelElementForParent(grammarAccess.getParametersTestLanguageParserRuleParametersRule());
                              									}
                              									set(
                              										current,
                              										"scenario",
                              										lv_scenario_23_0,
                              										"org.eclipse.xtext.parser.parameters.ParametersTestLanguage.Scenario2");
                              									afterParserOrEnumRuleCall();
                              								
                            }

                            }


                            }

                            // InternalParametersTestLanguageEx.g:476:7: (otherlv_24= 'keyword' )?
                            int alt3=2;
                            int LA3_0 = input.LA(1);

                            if ( (LA3_0==20) ) {
                                alt3=1;
                            }
                            switch (alt3) {
                                case 1 :
                                    // InternalParametersTestLanguageEx.g:477:8: otherlv_24= 'keyword'
                                    {
                                    otherlv_24=(Token)match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      								newLeafNode(otherlv_24, grammarAccess.getParametersTestLanguageParserRuleParametersAccess().getKeywordKeyword_1_9_1_1_1());
                                      							
                                    }

                                    }
                                    break;

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 11 :
                    // InternalParametersTestLanguageEx.g:486:4: (otherlv_25= '#11' ( ( ( ( ruleIdOrKeyword ) )=> (lv_scenario_26_0= ruleScenario4 ) ) | ( ( (lv_scenario_27_0= norm1_Scenario2 ) ) (otherlv_28= 'keyword' )? ) ) )
                    {
                    // InternalParametersTestLanguageEx.g:486:4: (otherlv_25= '#11' ( ( ( ( ruleIdOrKeyword ) )=> (lv_scenario_26_0= ruleScenario4 ) ) | ( ( (lv_scenario_27_0= norm1_Scenario2 ) ) (otherlv_28= 'keyword' )? ) ) )
                    // InternalParametersTestLanguageEx.g:487:5: otherlv_25= '#11' ( ( ( ( ruleIdOrKeyword ) )=> (lv_scenario_26_0= ruleScenario4 ) ) | ( ( (lv_scenario_27_0= norm1_Scenario2 ) ) (otherlv_28= 'keyword' )? ) )
                    {
                    otherlv_25=(Token)match(input,22,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_25, grammarAccess.getParametersTestLanguageParserRuleParametersAccess().getNumberSignDigitOneDigitOneKeyword_1_10_0());
                      				
                    }
                    // InternalParametersTestLanguageEx.g:491:5: ( ( ( ( ruleIdOrKeyword ) )=> (lv_scenario_26_0= ruleScenario4 ) ) | ( ( (lv_scenario_27_0= norm1_Scenario2 ) ) (otherlv_28= 'keyword' )? ) )
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==RULE_ID) ) {
                        int LA6_1 = input.LA(2);

                        if ( (LA6_1==20) ) {
                            int LA6_3 = input.LA(3);

                            if ( (synpred5_InternalParametersTestLanguageEx()) ) {
                                alt6=1;
                            }
                            else if ( (true) ) {
                                alt6=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 6, 3, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA6_1==EOF) ) {
                            alt6=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 1, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA6_0==20) ) {
                        alt6=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 0, input);

                        throw nvae;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalParametersTestLanguageEx.g:492:6: ( ( ( ruleIdOrKeyword ) )=> (lv_scenario_26_0= ruleScenario4 ) )
                            {
                            // InternalParametersTestLanguageEx.g:492:6: ( ( ( ruleIdOrKeyword ) )=> (lv_scenario_26_0= ruleScenario4 ) )
                            // InternalParametersTestLanguageEx.g:493:7: ( ( ruleIdOrKeyword ) )=> (lv_scenario_26_0= ruleScenario4 )
                            {
                            // InternalParametersTestLanguageEx.g:497:7: (lv_scenario_26_0= ruleScenario4 )
                            // InternalParametersTestLanguageEx.g:498:8: lv_scenario_26_0= ruleScenario4
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getParametersTestLanguageParserRuleParametersAccess().getScenarioScenario4ParserRuleCall_1_10_1_0_0());
                              							
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_scenario_26_0=ruleScenario4();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getParametersTestLanguageParserRuleParametersRule());
                              								}
                              								set(
                              									current,
                              									"scenario",
                              									lv_scenario_26_0,
                              									"org.eclipse.xtext.parser.parameters.ParametersTestLanguage.Scenario4");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalParametersTestLanguageEx.g:516:6: ( ( (lv_scenario_27_0= norm1_Scenario2 ) ) (otherlv_28= 'keyword' )? )
                            {
                            // InternalParametersTestLanguageEx.g:516:6: ( ( (lv_scenario_27_0= norm1_Scenario2 ) ) (otherlv_28= 'keyword' )? )
                            // InternalParametersTestLanguageEx.g:517:7: ( (lv_scenario_27_0= norm1_Scenario2 ) ) (otherlv_28= 'keyword' )?
                            {
                            // InternalParametersTestLanguageEx.g:517:7: ( (lv_scenario_27_0= norm1_Scenario2 ) )
                            // InternalParametersTestLanguageEx.g:518:8: (lv_scenario_27_0= norm1_Scenario2 )
                            {
                            // InternalParametersTestLanguageEx.g:518:8: (lv_scenario_27_0= norm1_Scenario2 )
                            // InternalParametersTestLanguageEx.g:519:9: lv_scenario_27_0= norm1_Scenario2
                            {
                            if ( state.backtracking==0 ) {

                              									newCompositeNode(grammarAccess.getParametersTestLanguageParserRuleParametersAccess().getScenarioScenario2ParserRuleCall_1_10_1_1_0_0());
                              								
                            }
                            pushFollow(FollowSets000.FOLLOW_5);
                            lv_scenario_27_0=norm1_Scenario2();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              									if (current==null) {
                              										current = createModelElementForParent(grammarAccess.getParametersTestLanguageParserRuleParametersRule());
                              									}
                              									set(
                              										current,
                              										"scenario",
                              										lv_scenario_27_0,
                              										"org.eclipse.xtext.parser.parameters.ParametersTestLanguage.Scenario2");
                              									afterParserOrEnumRuleCall();
                              								
                            }

                            }


                            }

                            // InternalParametersTestLanguageEx.g:536:7: (otherlv_28= 'keyword' )?
                            int alt5=2;
                            int LA5_0 = input.LA(1);

                            if ( (LA5_0==20) ) {
                                alt5=1;
                            }
                            switch (alt5) {
                                case 1 :
                                    // InternalParametersTestLanguageEx.g:537:8: otherlv_28= 'keyword'
                                    {
                                    otherlv_28=(Token)match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      								newLeafNode(otherlv_28, grammarAccess.getParametersTestLanguageParserRuleParametersAccess().getKeywordKeyword_1_10_1_1_1());
                                      							
                                    }

                                    }
                                    break;

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 12 :
                    // InternalParametersTestLanguageEx.g:546:4: (otherlv_29= '#12' ( ( ( ( ruleIdOrKeyword ) )=> (lv_scenario_30_0= ruleScenario4 ) ) | ( ( (lv_scenario_31_0= ruleScenario2 ) ) (otherlv_32= 'keyword' )? ) ) )
                    {
                    // InternalParametersTestLanguageEx.g:546:4: (otherlv_29= '#12' ( ( ( ( ruleIdOrKeyword ) )=> (lv_scenario_30_0= ruleScenario4 ) ) | ( ( (lv_scenario_31_0= ruleScenario2 ) ) (otherlv_32= 'keyword' )? ) ) )
                    // InternalParametersTestLanguageEx.g:547:5: otherlv_29= '#12' ( ( ( ( ruleIdOrKeyword ) )=> (lv_scenario_30_0= ruleScenario4 ) ) | ( ( (lv_scenario_31_0= ruleScenario2 ) ) (otherlv_32= 'keyword' )? ) )
                    {
                    otherlv_29=(Token)match(input,23,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_29, grammarAccess.getParametersTestLanguageParserRuleParametersAccess().getNumberSignDigitOneDigitTwoKeyword_1_11_0());
                      				
                    }
                    // InternalParametersTestLanguageEx.g:551:5: ( ( ( ( ruleIdOrKeyword ) )=> (lv_scenario_30_0= ruleScenario4 ) ) | ( ( (lv_scenario_31_0= ruleScenario2 ) ) (otherlv_32= 'keyword' )? ) )
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==RULE_ID) ) {
                        int LA8_1 = input.LA(2);

                        if ( (LA8_1==20) ) {
                            int LA8_2 = input.LA(3);

                            if ( (synpred6_InternalParametersTestLanguageEx()) ) {
                                alt8=1;
                            }
                            else if ( (true) ) {
                                alt8=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 8, 2, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA8_1==EOF) ) {
                            alt8=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 8, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 0, input);

                        throw nvae;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalParametersTestLanguageEx.g:552:6: ( ( ( ruleIdOrKeyword ) )=> (lv_scenario_30_0= ruleScenario4 ) )
                            {
                            // InternalParametersTestLanguageEx.g:552:6: ( ( ( ruleIdOrKeyword ) )=> (lv_scenario_30_0= ruleScenario4 ) )
                            // InternalParametersTestLanguageEx.g:553:7: ( ( ruleIdOrKeyword ) )=> (lv_scenario_30_0= ruleScenario4 )
                            {
                            // InternalParametersTestLanguageEx.g:557:7: (lv_scenario_30_0= ruleScenario4 )
                            // InternalParametersTestLanguageEx.g:558:8: lv_scenario_30_0= ruleScenario4
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getParametersTestLanguageParserRuleParametersAccess().getScenarioScenario4ParserRuleCall_1_11_1_0_0());
                              							
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_scenario_30_0=ruleScenario4();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getParametersTestLanguageParserRuleParametersRule());
                              								}
                              								set(
                              									current,
                              									"scenario",
                              									lv_scenario_30_0,
                              									"org.eclipse.xtext.parser.parameters.ParametersTestLanguage.Scenario4");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalParametersTestLanguageEx.g:576:6: ( ( (lv_scenario_31_0= ruleScenario2 ) ) (otherlv_32= 'keyword' )? )
                            {
                            // InternalParametersTestLanguageEx.g:576:6: ( ( (lv_scenario_31_0= ruleScenario2 ) ) (otherlv_32= 'keyword' )? )
                            // InternalParametersTestLanguageEx.g:577:7: ( (lv_scenario_31_0= ruleScenario2 ) ) (otherlv_32= 'keyword' )?
                            {
                            // InternalParametersTestLanguageEx.g:577:7: ( (lv_scenario_31_0= ruleScenario2 ) )
                            // InternalParametersTestLanguageEx.g:578:8: (lv_scenario_31_0= ruleScenario2 )
                            {
                            // InternalParametersTestLanguageEx.g:578:8: (lv_scenario_31_0= ruleScenario2 )
                            // InternalParametersTestLanguageEx.g:579:9: lv_scenario_31_0= ruleScenario2
                            {
                            if ( state.backtracking==0 ) {

                              									newCompositeNode(grammarAccess.getParametersTestLanguageParserRuleParametersAccess().getScenarioScenario2ParserRuleCall_1_11_1_1_0_0());
                              								
                            }
                            pushFollow(FollowSets000.FOLLOW_5);
                            lv_scenario_31_0=ruleScenario2();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              									if (current==null) {
                              										current = createModelElementForParent(grammarAccess.getParametersTestLanguageParserRuleParametersRule());
                              									}
                              									set(
                              										current,
                              										"scenario",
                              										lv_scenario_31_0,
                              										"org.eclipse.xtext.parser.parameters.ParametersTestLanguage.Scenario2");
                              									afterParserOrEnumRuleCall();
                              								
                            }

                            }


                            }

                            // InternalParametersTestLanguageEx.g:596:7: (otherlv_32= 'keyword' )?
                            int alt7=2;
                            int LA7_0 = input.LA(1);

                            if ( (LA7_0==20) ) {
                                alt7=1;
                            }
                            switch (alt7) {
                                case 1 :
                                    // InternalParametersTestLanguageEx.g:597:8: otherlv_32= 'keyword'
                                    {
                                    otherlv_32=(Token)match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      								newLeafNode(otherlv_32, grammarAccess.getParametersTestLanguageParserRuleParametersAccess().getKeywordKeyword_1_11_1_1_1());
                                      							
                                    }

                                    }
                                    break;

                            }


                            }


                            }
                            break;

                    }


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
    // $ANTLR end "superParserRuleParameters"


    // $ANTLR start "entrySuperScenario1"
    // InternalParametersTestLanguageEx.g:610:1: entrySuperScenario1 returns [EObject current=null] : iv_superScenario1= superScenario1 EOF ;
    public final EObject entrySuperScenario1() throws RecognitionException {
        EObject current = null;

        EObject iv_superScenario1 = null;


        try {
            // InternalParametersTestLanguageEx.g:610:51: (iv_superScenario1= superScenario1 EOF )
            // InternalParametersTestLanguageEx.g:611:2: iv_superScenario1= superScenario1 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParametersTestLanguageScenario1Rule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_superScenario1=superScenario1();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_superScenario1; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entrySuperScenario1"


    // $ANTLR start "superScenario1"
    // InternalParametersTestLanguageEx.g:617:1: superScenario1 returns [EObject current=null] : ( (lv_second_0_0= RULE_ID ) ) ;
    public final EObject superScenario1() throws RecognitionException {
        EObject current = null;

        Token lv_second_0_0=null;

        try {
            // InternalParametersTestLanguageEx.g:618:1: ( ( (lv_second_0_0= RULE_ID ) ) )
            // InternalParametersTestLanguageEx.g:619:2: ( (lv_second_0_0= RULE_ID ) )
            {
            // InternalParametersTestLanguageEx.g:619:2: ( (lv_second_0_0= RULE_ID ) )
            // InternalParametersTestLanguageEx.g:620:3: (lv_second_0_0= RULE_ID )
            {
            // InternalParametersTestLanguageEx.g:620:3: (lv_second_0_0= RULE_ID )
            // InternalParametersTestLanguageEx.g:621:4: lv_second_0_0= RULE_ID
            {
            lv_second_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_second_0_0, grammarAccess.getParametersTestLanguageScenario1Access().getSecondIDTerminalRuleCall_1_0_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getParametersTestLanguageScenario1Rule());
              				}
              				setWithLastConsumed(
              					current,
              					"second",
              					lv_second_0_0,
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
    // $ANTLR end "superScenario1"


    // $ANTLR start "normSuper1_Scenario1"
    // InternalParametersTestLanguageEx.g:641:1: normSuper1_Scenario1 returns [EObject current=null] : ( (lv_first_0_0= RULE_ID ) ) ;
    public final EObject normSuper1_Scenario1() throws RecognitionException {
        EObject current = null;

        Token lv_first_0_0=null;

        try {
            // InternalParametersTestLanguageEx.g:642:1: ( ( (lv_first_0_0= RULE_ID ) ) )
            // InternalParametersTestLanguageEx.g:643:2: ( (lv_first_0_0= RULE_ID ) )
            {
            // InternalParametersTestLanguageEx.g:643:2: ( (lv_first_0_0= RULE_ID ) )
            // InternalParametersTestLanguageEx.g:644:3: (lv_first_0_0= RULE_ID )
            {
            // InternalParametersTestLanguageEx.g:644:3: (lv_first_0_0= RULE_ID )
            // InternalParametersTestLanguageEx.g:645:4: lv_first_0_0= RULE_ID
            {
            lv_first_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_first_0_0, grammarAccess.getParametersTestLanguageScenario1Access().getFirstIDTerminalRuleCall_0_0_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getParametersTestLanguageScenario1Rule());
              				}
              				setWithLastConsumed(
              					current,
              					"first",
              					lv_first_0_0,
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
    // $ANTLR end "normSuper1_Scenario1"


    // $ANTLR start "entryRuleScenario2"
    // InternalParametersTestLanguageEx.g:664:1: entryRuleScenario2 returns [EObject current=null] : iv_ruleScenario2= ruleScenario2 EOF ;
    public final EObject entryRuleScenario2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario2 = null;


        try {
            // InternalParametersTestLanguageEx.g:664:50: (iv_ruleScenario2= ruleScenario2 EOF )
            // InternalParametersTestLanguageEx.g:665:2: iv_ruleScenario2= ruleScenario2 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getScenario2Rule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleScenario2=ruleScenario2();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleScenario2; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleScenario2"


    // $ANTLR start "ruleScenario2"
    // InternalParametersTestLanguageEx.g:671:1: ruleScenario2 returns [EObject current=null] : ( (lv_first_0_0= ruleIdOrKeyword ) ) ;
    public final EObject ruleScenario2() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_first_0_0 = null;


        try {
            // InternalParametersTestLanguageEx.g:672:1: ( ( (lv_first_0_0= ruleIdOrKeyword ) ) )
            // InternalParametersTestLanguageEx.g:673:2: ( (lv_first_0_0= ruleIdOrKeyword ) )
            {
            // InternalParametersTestLanguageEx.g:673:2: ( (lv_first_0_0= ruleIdOrKeyword ) )
            // InternalParametersTestLanguageEx.g:674:3: (lv_first_0_0= ruleIdOrKeyword )
            {
            // InternalParametersTestLanguageEx.g:674:3: (lv_first_0_0= ruleIdOrKeyword )
            // InternalParametersTestLanguageEx.g:675:4: lv_first_0_0= ruleIdOrKeyword
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getScenario2Access().getFirstIdOrKeywordParserRuleCall_0());
              			
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_first_0_0=ruleIdOrKeyword();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getScenario2Rule());
              				}
              				set(
              					current,
              					"first",
              					lv_first_0_0,
              					"org.eclipse.xtext.parser.parameters.ParametersTestLanguage.IdOrKeyword");
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
    // $ANTLR end "ruleScenario2"


    // $ANTLR start "norm1_Scenario2"
    // InternalParametersTestLanguageEx.g:696:1: norm1_Scenario2 returns [EObject current=null] : ( (lv_first_0_0= norm1_IdOrKeyword ) ) ;
    public final EObject norm1_Scenario2() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_first_0_0 = null;


        try {
            // InternalParametersTestLanguageEx.g:697:1: ( ( (lv_first_0_0= norm1_IdOrKeyword ) ) )
            // InternalParametersTestLanguageEx.g:698:2: ( (lv_first_0_0= norm1_IdOrKeyword ) )
            {
            // InternalParametersTestLanguageEx.g:698:2: ( (lv_first_0_0= norm1_IdOrKeyword ) )
            // InternalParametersTestLanguageEx.g:699:3: (lv_first_0_0= norm1_IdOrKeyword )
            {
            // InternalParametersTestLanguageEx.g:699:3: (lv_first_0_0= norm1_IdOrKeyword )
            // InternalParametersTestLanguageEx.g:700:4: lv_first_0_0= norm1_IdOrKeyword
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getScenario2Access().getFirstIdOrKeywordParserRuleCall_0());
              			
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_first_0_0=norm1_IdOrKeyword();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getScenario2Rule());
              				}
              				set(
              					current,
              					"first",
              					lv_first_0_0,
              					"org.eclipse.xtext.parser.parameters.ParametersTestLanguage.IdOrKeyword");
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
    // $ANTLR end "norm1_Scenario2"


    // $ANTLR start "entryRuleScenario3"
    // InternalParametersTestLanguageEx.g:720:1: entryRuleScenario3 returns [EObject current=null] : iv_ruleScenario3= ruleScenario3 EOF ;
    public final EObject entryRuleScenario3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario3 = null;


        try {
            // InternalParametersTestLanguageEx.g:720:50: (iv_ruleScenario3= ruleScenario3 EOF )
            // InternalParametersTestLanguageEx.g:721:2: iv_ruleScenario3= ruleScenario3 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getScenario3Rule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleScenario3=ruleScenario3();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleScenario3; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleScenario3"


    // $ANTLR start "ruleScenario3"
    // InternalParametersTestLanguageEx.g:727:1: ruleScenario3 returns [EObject current=null] : ( ( ( ( ruleIdOrKeyword ) )=> (lv_first_0_0= ruleIdOrKeyword ) ) | ( (lv_second_1_0= 'keyword' ) ) ) ;
    public final EObject ruleScenario3() throws RecognitionException {
        EObject current = null;

        Token lv_second_1_0=null;
        AntlrDatatypeRuleToken lv_first_0_0 = null;


        try {
            // InternalParametersTestLanguageEx.g:728:1: ( ( ( ( ( ruleIdOrKeyword ) )=> (lv_first_0_0= ruleIdOrKeyword ) ) | ( (lv_second_1_0= 'keyword' ) ) ) )
            // InternalParametersTestLanguageEx.g:729:2: ( ( ( ( ruleIdOrKeyword ) )=> (lv_first_0_0= ruleIdOrKeyword ) ) | ( (lv_second_1_0= 'keyword' ) ) )
            {
            // InternalParametersTestLanguageEx.g:729:2: ( ( ( ( ruleIdOrKeyword ) )=> (lv_first_0_0= ruleIdOrKeyword ) ) | ( (lv_second_1_0= 'keyword' ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) && (synpred7_InternalParametersTestLanguageEx())) {
                alt10=1;
            }
            else if ( (LA10_0==20) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalParametersTestLanguageEx.g:730:3: ( ( ( ruleIdOrKeyword ) )=> (lv_first_0_0= ruleIdOrKeyword ) )
                    {
                    // InternalParametersTestLanguageEx.g:730:3: ( ( ( ruleIdOrKeyword ) )=> (lv_first_0_0= ruleIdOrKeyword ) )
                    // InternalParametersTestLanguageEx.g:731:4: ( ( ruleIdOrKeyword ) )=> (lv_first_0_0= ruleIdOrKeyword )
                    {
                    // InternalParametersTestLanguageEx.g:735:4: (lv_first_0_0= ruleIdOrKeyword )
                    // InternalParametersTestLanguageEx.g:736:5: lv_first_0_0= ruleIdOrKeyword
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getScenario3Access().getFirstIdOrKeywordParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_first_0_0=ruleIdOrKeyword();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getScenario3Rule());
                      					}
                      					set(
                      						current,
                      						"first",
                      						lv_first_0_0,
                      						"org.eclipse.xtext.parser.parameters.ParametersTestLanguage.IdOrKeyword");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalParametersTestLanguageEx.g:754:3: ( (lv_second_1_0= 'keyword' ) )
                    {
                    // InternalParametersTestLanguageEx.g:754:3: ( (lv_second_1_0= 'keyword' ) )
                    // InternalParametersTestLanguageEx.g:755:4: (lv_second_1_0= 'keyword' )
                    {
                    // InternalParametersTestLanguageEx.g:755:4: (lv_second_1_0= 'keyword' )
                    // InternalParametersTestLanguageEx.g:756:5: lv_second_1_0= 'keyword'
                    {
                    lv_second_1_0=(Token)match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_second_1_0, grammarAccess.getScenario3Access().getSecondKeywordKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getScenario3Rule());
                      					}
                      					setWithLastConsumed(current, "second", lv_second_1_0, "keyword");
                      				
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
    // $ANTLR end "ruleScenario3"


    // $ANTLR start "norm1_Scenario3"
    // InternalParametersTestLanguageEx.g:773:1: norm1_Scenario3 returns [EObject current=null] : ( ( ( ( norm1_IdOrKeyword ) )=> (lv_first_0_0= norm1_IdOrKeyword ) ) | ( (lv_second_1_0= 'keyword' ) ) ) ;
    public final EObject norm1_Scenario3() throws RecognitionException {
        EObject current = null;

        Token lv_second_1_0=null;
        AntlrDatatypeRuleToken lv_first_0_0 = null;


        try {
            // InternalParametersTestLanguageEx.g:774:1: ( ( ( ( ( norm1_IdOrKeyword ) )=> (lv_first_0_0= norm1_IdOrKeyword ) ) | ( (lv_second_1_0= 'keyword' ) ) ) )
            // InternalParametersTestLanguageEx.g:775:2: ( ( ( ( norm1_IdOrKeyword ) )=> (lv_first_0_0= norm1_IdOrKeyword ) ) | ( (lv_second_1_0= 'keyword' ) ) )
            {
            // InternalParametersTestLanguageEx.g:775:2: ( ( ( ( norm1_IdOrKeyword ) )=> (lv_first_0_0= norm1_IdOrKeyword ) ) | ( (lv_second_1_0= 'keyword' ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                int LA11_1 = input.LA(2);

                if ( (synpred8_InternalParametersTestLanguageEx()) ) {
                    alt11=1;
                }
                else if ( (true) ) {
                    alt11=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA11_0==RULE_ID) && (synpred8_InternalParametersTestLanguageEx())) {
                alt11=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalParametersTestLanguageEx.g:776:3: ( ( ( norm1_IdOrKeyword ) )=> (lv_first_0_0= norm1_IdOrKeyword ) )
                    {
                    // InternalParametersTestLanguageEx.g:776:3: ( ( ( norm1_IdOrKeyword ) )=> (lv_first_0_0= norm1_IdOrKeyword ) )
                    // InternalParametersTestLanguageEx.g:777:4: ( ( norm1_IdOrKeyword ) )=> (lv_first_0_0= norm1_IdOrKeyword )
                    {
                    // InternalParametersTestLanguageEx.g:781:4: (lv_first_0_0= norm1_IdOrKeyword )
                    // InternalParametersTestLanguageEx.g:782:5: lv_first_0_0= norm1_IdOrKeyword
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getScenario3Access().getFirstIdOrKeywordParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_first_0_0=norm1_IdOrKeyword();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getScenario3Rule());
                      					}
                      					set(
                      						current,
                      						"first",
                      						lv_first_0_0,
                      						"org.eclipse.xtext.parser.parameters.ParametersTestLanguage.IdOrKeyword");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalParametersTestLanguageEx.g:800:3: ( (lv_second_1_0= 'keyword' ) )
                    {
                    // InternalParametersTestLanguageEx.g:800:3: ( (lv_second_1_0= 'keyword' ) )
                    // InternalParametersTestLanguageEx.g:801:4: (lv_second_1_0= 'keyword' )
                    {
                    // InternalParametersTestLanguageEx.g:801:4: (lv_second_1_0= 'keyword' )
                    // InternalParametersTestLanguageEx.g:802:5: lv_second_1_0= 'keyword'
                    {
                    lv_second_1_0=(Token)match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_second_1_0, grammarAccess.getScenario3Access().getSecondKeywordKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getScenario3Rule());
                      					}
                      					setWithLastConsumed(current, "second", lv_second_1_0, "keyword");
                      				
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
    // $ANTLR end "norm1_Scenario3"


    // $ANTLR start "entryRuleScenario4"
    // InternalParametersTestLanguageEx.g:818:1: entryRuleScenario4 returns [EObject current=null] : iv_ruleScenario4= ruleScenario4 EOF ;
    public final EObject entryRuleScenario4() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario4 = null;


        try {
            // InternalParametersTestLanguageEx.g:818:50: (iv_ruleScenario4= ruleScenario4 EOF )
            // InternalParametersTestLanguageEx.g:819:2: iv_ruleScenario4= ruleScenario4 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getScenario4Rule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleScenario4=ruleScenario4();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleScenario4; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleScenario4"


    // $ANTLR start "ruleScenario4"
    // InternalParametersTestLanguageEx.g:825:1: ruleScenario4 returns [EObject current=null] : ( ( ( ( ruleIdOrKeyword ) )=> (lv_second_0_0= ruleIdOrKeyword ) ) otherlv_1= 'keyword' ) ;
    public final EObject ruleScenario4() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_second_0_0 = null;


        try {
            // InternalParametersTestLanguageEx.g:826:1: ( ( ( ( ( ruleIdOrKeyword ) )=> (lv_second_0_0= ruleIdOrKeyword ) ) otherlv_1= 'keyword' ) )
            // InternalParametersTestLanguageEx.g:827:2: ( ( ( ( ruleIdOrKeyword ) )=> (lv_second_0_0= ruleIdOrKeyword ) ) otherlv_1= 'keyword' )
            {
            // InternalParametersTestLanguageEx.g:827:2: ( ( ( ( ruleIdOrKeyword ) )=> (lv_second_0_0= ruleIdOrKeyword ) ) otherlv_1= 'keyword' )
            // InternalParametersTestLanguageEx.g:828:3: ( ( ( ruleIdOrKeyword ) )=> (lv_second_0_0= ruleIdOrKeyword ) ) otherlv_1= 'keyword'
            {
            // InternalParametersTestLanguageEx.g:828:3: ( ( ( ruleIdOrKeyword ) )=> (lv_second_0_0= ruleIdOrKeyword ) )
            // InternalParametersTestLanguageEx.g:829:4: ( ( ruleIdOrKeyword ) )=> (lv_second_0_0= ruleIdOrKeyword )
            {
            // InternalParametersTestLanguageEx.g:833:4: (lv_second_0_0= ruleIdOrKeyword )
            // InternalParametersTestLanguageEx.g:834:5: lv_second_0_0= ruleIdOrKeyword
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getScenario4Access().getSecondIdOrKeywordParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_second_0_0=ruleIdOrKeyword();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getScenario4Rule());
              					}
              					set(
              						current,
              						"second",
              						lv_second_0_0,
              						"org.eclipse.xtext.parser.parameters.ParametersTestLanguage.IdOrKeyword");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getScenario4Access().getKeywordKeyword_1());
              		
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
    // $ANTLR end "ruleScenario4"


    // $ANTLR start "norm1_Scenario4"
    // InternalParametersTestLanguageEx.g:860:1: norm1_Scenario4 returns [EObject current=null] : ( ( ( ( norm1_IdOrKeyword ) )=> (lv_second_0_0= norm1_IdOrKeyword ) ) otherlv_1= 'keyword' ) ;
    public final EObject norm1_Scenario4() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_second_0_0 = null;


        try {
            // InternalParametersTestLanguageEx.g:861:1: ( ( ( ( ( norm1_IdOrKeyword ) )=> (lv_second_0_0= norm1_IdOrKeyword ) ) otherlv_1= 'keyword' ) )
            // InternalParametersTestLanguageEx.g:862:2: ( ( ( ( norm1_IdOrKeyword ) )=> (lv_second_0_0= norm1_IdOrKeyword ) ) otherlv_1= 'keyword' )
            {
            // InternalParametersTestLanguageEx.g:862:2: ( ( ( ( norm1_IdOrKeyword ) )=> (lv_second_0_0= norm1_IdOrKeyword ) ) otherlv_1= 'keyword' )
            // InternalParametersTestLanguageEx.g:863:3: ( ( ( norm1_IdOrKeyword ) )=> (lv_second_0_0= norm1_IdOrKeyword ) ) otherlv_1= 'keyword'
            {
            // InternalParametersTestLanguageEx.g:863:3: ( ( ( norm1_IdOrKeyword ) )=> (lv_second_0_0= norm1_IdOrKeyword ) )
            // InternalParametersTestLanguageEx.g:864:4: ( ( norm1_IdOrKeyword ) )=> (lv_second_0_0= norm1_IdOrKeyword )
            {
            // InternalParametersTestLanguageEx.g:868:4: (lv_second_0_0= norm1_IdOrKeyword )
            // InternalParametersTestLanguageEx.g:869:5: lv_second_0_0= norm1_IdOrKeyword
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getScenario4Access().getSecondIdOrKeywordParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_second_0_0=norm1_IdOrKeyword();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getScenario4Rule());
              					}
              					set(
              						current,
              						"second",
              						lv_second_0_0,
              						"org.eclipse.xtext.parser.parameters.ParametersTestLanguage.IdOrKeyword");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getScenario4Access().getKeywordKeyword_1());
              		
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
    // $ANTLR end "norm1_Scenario4"


    // $ANTLR start "entryRuleIdOrKeyword"
    // InternalParametersTestLanguageEx.g:894:1: entryRuleIdOrKeyword returns [String current=null] : iv_ruleIdOrKeyword= ruleIdOrKeyword EOF ;
    public final String entryRuleIdOrKeyword() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrKeyword = null;


        try {
            // InternalParametersTestLanguageEx.g:894:51: (iv_ruleIdOrKeyword= ruleIdOrKeyword EOF )
            // InternalParametersTestLanguageEx.g:895:2: iv_ruleIdOrKeyword= ruleIdOrKeyword EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrKeywordRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleIdOrKeyword=ruleIdOrKeyword();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrKeyword.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIdOrKeyword"


    // $ANTLR start "ruleIdOrKeyword"
    // InternalParametersTestLanguageEx.g:901:1: ruleIdOrKeyword returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleIdOrKeyword() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

        try {
            // InternalParametersTestLanguageEx.g:902:1: (this_ID_0= RULE_ID )
            // InternalParametersTestLanguageEx.g:903:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_ID_0, grammarAccess.getIdOrKeywordAccess().getIDTerminalRuleCall_1());
              	
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
    // $ANTLR end "ruleIdOrKeyword"


    // $ANTLR start "norm1_IdOrKeyword"
    // InternalParametersTestLanguageEx.g:914:1: norm1_IdOrKeyword returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'keyword' | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken norm1_IdOrKeyword() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;

        try {
            // InternalParametersTestLanguageEx.g:915:1: ( (kw= 'keyword' | this_ID_1= RULE_ID ) )
            // InternalParametersTestLanguageEx.g:916:2: (kw= 'keyword' | this_ID_1= RULE_ID )
            {
            // InternalParametersTestLanguageEx.g:916:2: (kw= 'keyword' | this_ID_1= RULE_ID )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_ID) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalParametersTestLanguageEx.g:917:3: kw= 'keyword'
                    {
                    kw=(Token)match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getIdOrKeywordAccess().getKeywordKeyword_0_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalParametersTestLanguageEx.g:923:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ID_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_ID_1, grammarAccess.getIdOrKeywordAccess().getIDTerminalRuleCall_1());
                      		
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
    // $ANTLR end "norm1_IdOrKeyword"

    // $ANTLR start synpred1_InternalParametersTestLanguageEx
    public final void synpred1_InternalParametersTestLanguageEx_fragment() throws RecognitionException {   
        // InternalParametersTestLanguageEx.g:241:5: ( ( '#5' ( ( norm1_Scenario2 ) ) ) )
        // InternalParametersTestLanguageEx.g:241:6: ( '#5' ( ( norm1_Scenario2 ) ) )
        {
        // InternalParametersTestLanguageEx.g:241:6: ( '#5' ( ( norm1_Scenario2 ) ) )
        // InternalParametersTestLanguageEx.g:242:6: '#5' ( ( norm1_Scenario2 ) )
        {
        match(input,15,FollowSets000.FOLLOW_4); if (state.failed) return ;
        // InternalParametersTestLanguageEx.g:243:6: ( ( norm1_Scenario2 ) )
        // InternalParametersTestLanguageEx.g:244:7: ( norm1_Scenario2 )
        {
        // InternalParametersTestLanguageEx.g:244:7: ( norm1_Scenario2 )
        // InternalParametersTestLanguageEx.g:245:8: norm1_Scenario2
        {
        pushFollow(FollowSets000.FOLLOW_2);
        norm1_Scenario2();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred1_InternalParametersTestLanguageEx

    // $ANTLR start synpred2_InternalParametersTestLanguageEx
    public final void synpred2_InternalParametersTestLanguageEx_fragment() throws RecognitionException {   
        // InternalParametersTestLanguageEx.g:278:5: ( ( '#6' ( ( ruleScenario2 ) ) ) )
        // InternalParametersTestLanguageEx.g:278:6: ( '#6' ( ( ruleScenario2 ) ) )
        {
        // InternalParametersTestLanguageEx.g:278:6: ( '#6' ( ( ruleScenario2 ) ) )
        // InternalParametersTestLanguageEx.g:279:6: '#6' ( ( ruleScenario2 ) )
        {
        match(input,16,FollowSets000.FOLLOW_3); if (state.failed) return ;
        // InternalParametersTestLanguageEx.g:280:6: ( ( ruleScenario2 ) )
        // InternalParametersTestLanguageEx.g:281:7: ( ruleScenario2 )
        {
        // InternalParametersTestLanguageEx.g:281:7: ( ruleScenario2 )
        // InternalParametersTestLanguageEx.g:282:8: ruleScenario2
        {
        pushFollow(FollowSets000.FOLLOW_2);
        ruleScenario2();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalParametersTestLanguageEx

    // $ANTLR start synpred3_InternalParametersTestLanguageEx
    public final void synpred3_InternalParametersTestLanguageEx_fragment() throws RecognitionException {   
        // InternalParametersTestLanguageEx.g:373:7: ( ( norm1_IdOrKeyword ) )
        // InternalParametersTestLanguageEx.g:373:8: ( norm1_IdOrKeyword )
        {
        // InternalParametersTestLanguageEx.g:373:8: ( norm1_IdOrKeyword )
        // InternalParametersTestLanguageEx.g:374:8: norm1_IdOrKeyword
        {
        pushFollow(FollowSets000.FOLLOW_2);
        norm1_IdOrKeyword();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred3_InternalParametersTestLanguageEx

    // $ANTLR start synpred4_InternalParametersTestLanguageEx
    public final void synpred4_InternalParametersTestLanguageEx_fragment() throws RecognitionException {   
        // InternalParametersTestLanguageEx.g:433:7: ( ( norm1_IdOrKeyword ) )
        // InternalParametersTestLanguageEx.g:433:8: ( norm1_IdOrKeyword )
        {
        // InternalParametersTestLanguageEx.g:433:8: ( norm1_IdOrKeyword )
        // InternalParametersTestLanguageEx.g:434:8: norm1_IdOrKeyword
        {
        pushFollow(FollowSets000.FOLLOW_2);
        norm1_IdOrKeyword();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred4_InternalParametersTestLanguageEx

    // $ANTLR start synpred5_InternalParametersTestLanguageEx
    public final void synpred5_InternalParametersTestLanguageEx_fragment() throws RecognitionException {   
        // InternalParametersTestLanguageEx.g:493:7: ( ( ruleIdOrKeyword ) )
        // InternalParametersTestLanguageEx.g:493:8: ( ruleIdOrKeyword )
        {
        // InternalParametersTestLanguageEx.g:493:8: ( ruleIdOrKeyword )
        // InternalParametersTestLanguageEx.g:494:8: ruleIdOrKeyword
        {
        pushFollow(FollowSets000.FOLLOW_2);
        ruleIdOrKeyword();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalParametersTestLanguageEx

    // $ANTLR start synpred6_InternalParametersTestLanguageEx
    public final void synpred6_InternalParametersTestLanguageEx_fragment() throws RecognitionException {   
        // InternalParametersTestLanguageEx.g:553:7: ( ( ruleIdOrKeyword ) )
        // InternalParametersTestLanguageEx.g:553:8: ( ruleIdOrKeyword )
        {
        // InternalParametersTestLanguageEx.g:553:8: ( ruleIdOrKeyword )
        // InternalParametersTestLanguageEx.g:554:8: ruleIdOrKeyword
        {
        pushFollow(FollowSets000.FOLLOW_2);
        ruleIdOrKeyword();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred6_InternalParametersTestLanguageEx

    // $ANTLR start synpred7_InternalParametersTestLanguageEx
    public final void synpred7_InternalParametersTestLanguageEx_fragment() throws RecognitionException {   
        // InternalParametersTestLanguageEx.g:731:4: ( ( ruleIdOrKeyword ) )
        // InternalParametersTestLanguageEx.g:731:5: ( ruleIdOrKeyword )
        {
        // InternalParametersTestLanguageEx.g:731:5: ( ruleIdOrKeyword )
        // InternalParametersTestLanguageEx.g:732:5: ruleIdOrKeyword
        {
        pushFollow(FollowSets000.FOLLOW_2);
        ruleIdOrKeyword();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred7_InternalParametersTestLanguageEx

    // $ANTLR start synpred8_InternalParametersTestLanguageEx
    public final void synpred8_InternalParametersTestLanguageEx_fragment() throws RecognitionException {   
        // InternalParametersTestLanguageEx.g:777:4: ( ( norm1_IdOrKeyword ) )
        // InternalParametersTestLanguageEx.g:777:5: ( norm1_IdOrKeyword )
        {
        // InternalParametersTestLanguageEx.g:777:5: ( norm1_IdOrKeyword )
        // InternalParametersTestLanguageEx.g:778:5: norm1_IdOrKeyword
        {
        pushFollow(FollowSets000.FOLLOW_2);
        norm1_IdOrKeyword();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred8_InternalParametersTestLanguageEx

    // Delegated rules

    public final boolean synpred7_InternalParametersTestLanguageEx() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalParametersTestLanguageEx_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalParametersTestLanguageEx() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalParametersTestLanguageEx_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalParametersTestLanguageEx() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalParametersTestLanguageEx_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalParametersTestLanguageEx() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalParametersTestLanguageEx_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalParametersTestLanguageEx() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalParametersTestLanguageEx_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalParametersTestLanguageEx() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalParametersTestLanguageEx_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalParametersTestLanguageEx() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalParametersTestLanguageEx_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalParametersTestLanguageEx() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalParametersTestLanguageEx_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA9 dfa9 = new DFA9(this);
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\1\13\14\uffff";
    static final String dfa_3s = "\1\27\14\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14";
    static final String dfa_5s = "\1\0\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\uffff\1\12\1\13\1\14",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "135:3: ( (otherlv_1= '#1' ( (lv_scenario_2_0= norm1_Scenario1 ) ) ) | (otherlv_3= '#2' ( (lv_scenario_4_0= ruleScenario1 ) ) ) | (otherlv_5= '#3' ( (lv_scenario_6_0= norm1_Scenario2 ) ) ) | (otherlv_7= '#4' ( (lv_scenario_8_0= ruleScenario2 ) ) ) | ( ( ( '#5' ( ( norm1_Scenario2 ) ) ) )=> (otherlv_9= '#5' ( (lv_scenario_10_0= norm1_Scenario2 ) ) ) ) | ( ( ( '#6' ( ( ruleScenario2 ) ) ) )=> (otherlv_11= '#6' ( (lv_scenario_12_0= ruleScenario2 ) ) ) ) | (otherlv_13= '#7' ( (lv_scenario_14_0= norm1_Scenario3 ) ) ) | (otherlv_15= '#8' ( (lv_scenario_16_0= ruleScenario3 ) ) ) | (otherlv_17= '#9' ( ( ( ( norm1_IdOrKeyword ) )=> (lv_scenario_18_0= norm1_Scenario4 ) ) | ( ( (lv_scenario_19_0= norm1_Scenario2 ) ) (otherlv_20= 'keyword' )? ) ) ) | (otherlv_21= '#10' ( ( ( ( norm1_IdOrKeyword ) )=> (lv_scenario_22_0= norm1_Scenario4 ) ) | ( ( (lv_scenario_23_0= ruleScenario2 ) ) (otherlv_24= 'keyword' )? ) ) ) | (otherlv_25= '#11' ( ( ( ( ruleIdOrKeyword ) )=> (lv_scenario_26_0= ruleScenario4 ) ) | ( ( (lv_scenario_27_0= norm1_Scenario2 ) ) (otherlv_28= 'keyword' )? ) ) ) | (otherlv_29= '#12' ( ( ( ( ruleIdOrKeyword ) )=> (lv_scenario_30_0= ruleScenario4 ) ) | ( ( (lv_scenario_31_0= ruleScenario2 ) ) (otherlv_32= 'keyword' )? ) ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA9_0 = input.LA(1);

                         
                        int index9_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_0==11) ) {s = 1;}

                        else if ( (LA9_0==12) ) {s = 2;}

                        else if ( (LA9_0==13) ) {s = 3;}

                        else if ( (LA9_0==14) ) {s = 4;}

                        else if ( (LA9_0==15) && (synpred1_InternalParametersTestLanguageEx())) {s = 5;}

                        else if ( (LA9_0==16) && (synpred2_InternalParametersTestLanguageEx())) {s = 6;}

                        else if ( (LA9_0==17) ) {s = 7;}

                        else if ( (LA9_0==18) ) {s = 8;}

                        else if ( (LA9_0==19) ) {s = 9;}

                        else if ( (LA9_0==21) ) {s = 10;}

                        else if ( (LA9_0==22) ) {s = 11;}

                        else if ( (LA9_0==23) ) {s = 12;}

                         
                        input.seek(index9_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 9, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000100010L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100000L});
    }


}