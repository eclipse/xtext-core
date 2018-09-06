package org.eclipse.xtext.ide.tests.testlanguage.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.ide.tests.testlanguage.services.Core861_ContentAssistLookAheadTestLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalCore861_ContentAssistLookAheadTestLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'private'", "'public'", "'='", "';'", "'('", "')'", "'{'", "'}'", "'int'", "'.'", "'return'", "'@'", "','"
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


        public InternalCore861_ContentAssistLookAheadTestLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCore861_ContentAssistLookAheadTestLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCore861_ContentAssistLookAheadTestLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCore861_ContentAssistLookAheadTestLanguage.g"; }



     	private Core861_ContentAssistLookAheadTestLanguageGrammarAccess grammarAccess;

        public InternalCore861_ContentAssistLookAheadTestLanguageParser(TokenStream input, Core861_ContentAssistLookAheadTestLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Member";
       	}

       	@Override
       	protected Core861_ContentAssistLookAheadTestLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMember"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:68:1: entryRuleMember returns [EObject current=null] : iv_ruleMember= ruleMember EOF ;
    public final EObject entryRuleMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMember = null;


        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:68:47: (iv_ruleMember= ruleMember EOF )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:69:2: iv_ruleMember= ruleMember EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMemberRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMember=ruleMember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMember; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMember"


    // $ANTLR start "ruleMember"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:75:1: ruleMember returns [EObject current=null] : (this_FieldDecl_0= ruleFieldDecl | this_MethodDecl_1= ruleMethodDecl ) ;
    public final EObject ruleMember() throws RecognitionException {
        EObject current = null;

        EObject this_FieldDecl_0 = null;

        EObject this_MethodDecl_1 = null;



        	enterRule();

        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:81:2: ( (this_FieldDecl_0= ruleFieldDecl | this_MethodDecl_1= ruleMethodDecl ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:82:2: (this_FieldDecl_0= ruleFieldDecl | this_MethodDecl_1= ruleMethodDecl )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:82:2: (this_FieldDecl_0= ruleFieldDecl | this_MethodDecl_1= ruleMethodDecl )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:83:3: this_FieldDecl_0= ruleFieldDecl
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMemberAccess().getFieldDeclParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FieldDecl_0=ruleFieldDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_FieldDecl_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:92:3: this_MethodDecl_1= ruleMethodDecl
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMemberAccess().getMethodDeclParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MethodDecl_1=ruleMethodDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MethodDecl_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMember"


    // $ANTLR start "entryRuleFieldDecl"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:104:1: entryRuleFieldDecl returns [EObject current=null] : iv_ruleFieldDecl= ruleFieldDecl EOF ;
    public final EObject entryRuleFieldDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldDecl = null;


        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:104:50: (iv_ruleFieldDecl= ruleFieldDecl EOF )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:105:2: iv_ruleFieldDecl= ruleFieldDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFieldDecl=ruleFieldDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFieldDecl; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFieldDecl"


    // $ANTLR start "ruleFieldDecl"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:111:1: ruleFieldDecl returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( (lv_modifier_1_1= 'private' | lv_modifier_1_2= 'public' ) ) )? ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_initVal_5_0= RULE_INT ) ) )? otherlv_6= ';' ) ;
    public final EObject ruleFieldDecl() throws RecognitionException {
        EObject current = null;

        Token lv_modifier_1_1=null;
        Token lv_modifier_1_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token lv_initVal_5_0=null;
        Token otherlv_6=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:117:2: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( (lv_modifier_1_1= 'private' | lv_modifier_1_2= 'public' ) ) )? ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_initVal_5_0= RULE_INT ) ) )? otherlv_6= ';' ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:118:2: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( (lv_modifier_1_1= 'private' | lv_modifier_1_2= 'public' ) ) )? ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_initVal_5_0= RULE_INT ) ) )? otherlv_6= ';' )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:118:2: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( (lv_modifier_1_1= 'private' | lv_modifier_1_2= 'public' ) ) )? ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_initVal_5_0= RULE_INT ) ) )? otherlv_6= ';' )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:119:3: ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( (lv_modifier_1_1= 'private' | lv_modifier_1_2= 'public' ) ) )? ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_initVal_5_0= RULE_INT ) ) )? otherlv_6= ';'
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:119:3: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==22) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalCore861_ContentAssistLookAheadTestLanguage.g:120:4: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalCore861_ContentAssistLookAheadTestLanguage.g:120:4: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalCore861_ContentAssistLookAheadTestLanguage.g:121:5: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getFieldDeclAccess().getAnnotationsAnnotationParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getFieldDeclRule());
            	      					}
            	      					add(
            	      						current,
            	      						"annotations",
            	      						lv_annotations_0_0,
            	      						"org.eclipse.xtext.ide.tests.testlanguage.Core861_ContentAssistLookAheadTestLanguage.Annotation");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalCore861_ContentAssistLookAheadTestLanguage.g:138:3: ( ( (lv_modifier_1_1= 'private' | lv_modifier_1_2= 'public' ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=11 && LA4_0<=12)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:139:4: ( (lv_modifier_1_1= 'private' | lv_modifier_1_2= 'public' ) )
                    {
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:139:4: ( (lv_modifier_1_1= 'private' | lv_modifier_1_2= 'public' ) )
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:140:5: (lv_modifier_1_1= 'private' | lv_modifier_1_2= 'public' )
                    {
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:140:5: (lv_modifier_1_1= 'private' | lv_modifier_1_2= 'public' )
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==11) ) {
                        alt3=1;
                    }
                    else if ( (LA3_0==12) ) {
                        alt3=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 0, input);

                        throw nvae;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalCore861_ContentAssistLookAheadTestLanguage.g:141:6: lv_modifier_1_1= 'private'
                            {
                            lv_modifier_1_1=(Token)match(input,11,FOLLOW_4); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_modifier_1_1, grammarAccess.getFieldDeclAccess().getModifierPrivateKeyword_1_0_0());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getFieldDeclRule());
                              						}
                              						setWithLastConsumed(current, "modifier", lv_modifier_1_1, null);
                              					
                            }

                            }
                            break;
                        case 2 :
                            // InternalCore861_ContentAssistLookAheadTestLanguage.g:152:6: lv_modifier_1_2= 'public'
                            {
                            lv_modifier_1_2=(Token)match(input,12,FOLLOW_4); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_modifier_1_2, grammarAccess.getFieldDeclAccess().getModifierPublicKeyword_1_0_1());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getFieldDeclRule());
                              						}
                              						setWithLastConsumed(current, "modifier", lv_modifier_1_2, null);
                              					
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // InternalCore861_ContentAssistLookAheadTestLanguage.g:165:3: ( (lv_type_2_0= ruleType ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:166:4: (lv_type_2_0= ruleType )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:166:4: (lv_type_2_0= ruleType )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:167:5: lv_type_2_0= ruleType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFieldDeclAccess().getTypeTypeParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_type_2_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFieldDeclRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_2_0,
              						"org.eclipse.xtext.ide.tests.testlanguage.Core861_ContentAssistLookAheadTestLanguage.Type");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCore861_ContentAssistLookAheadTestLanguage.g:184:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:185:4: (lv_name_3_0= RULE_ID )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:185:4: (lv_name_3_0= RULE_ID )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:186:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_3_0, grammarAccess.getFieldDeclAccess().getNameIDTerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFieldDeclRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_3_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalCore861_ContentAssistLookAheadTestLanguage.g:202:3: (otherlv_4= '=' ( (lv_initVal_5_0= RULE_INT ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:203:4: otherlv_4= '=' ( (lv_initVal_5_0= RULE_INT ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getFieldDeclAccess().getEqualsSignKeyword_4_0());
                      			
                    }
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:207:4: ( (lv_initVal_5_0= RULE_INT ) )
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:208:5: (lv_initVal_5_0= RULE_INT )
                    {
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:208:5: (lv_initVal_5_0= RULE_INT )
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:209:6: lv_initVal_5_0= RULE_INT
                    {
                    lv_initVal_5_0=(Token)match(input,RULE_INT,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_initVal_5_0, grammarAccess.getFieldDeclAccess().getInitValINTTerminalRuleCall_4_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getFieldDeclRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"initVal",
                      							lv_initVal_5_0,
                      							"org.eclipse.xtext.common.Terminals.INT");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getFieldDeclAccess().getSemicolonKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFieldDecl"


    // $ANTLR start "entryRuleMethodDecl"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:234:1: entryRuleMethodDecl returns [EObject current=null] : iv_ruleMethodDecl= ruleMethodDecl EOF ;
    public final EObject entryRuleMethodDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodDecl = null;


        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:234:51: (iv_ruleMethodDecl= ruleMethodDecl EOF )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:235:2: iv_ruleMethodDecl= ruleMethodDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethodDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMethodDecl=ruleMethodDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMethodDecl; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMethodDecl"


    // $ANTLR start "ruleMethodDecl"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:241:1: ruleMethodDecl returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( (lv_modifier_1_1= 'private' | lv_modifier_1_2= 'public' ) ) )? ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' otherlv_5= ')' otherlv_6= '{' ( (lv_decls_7_0= ruleFieldDecl ) )* ( (lv_statements_8_0= ruleStatement ) )* otherlv_9= '}' ) ;
    public final EObject ruleMethodDecl() throws RecognitionException {
        EObject current = null;

        Token lv_modifier_1_1=null;
        Token lv_modifier_1_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_type_2_0 = null;

        EObject lv_decls_7_0 = null;

        EObject lv_statements_8_0 = null;



        	enterRule();

        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:247:2: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( (lv_modifier_1_1= 'private' | lv_modifier_1_2= 'public' ) ) )? ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' otherlv_5= ')' otherlv_6= '{' ( (lv_decls_7_0= ruleFieldDecl ) )* ( (lv_statements_8_0= ruleStatement ) )* otherlv_9= '}' ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:248:2: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( (lv_modifier_1_1= 'private' | lv_modifier_1_2= 'public' ) ) )? ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' otherlv_5= ')' otherlv_6= '{' ( (lv_decls_7_0= ruleFieldDecl ) )* ( (lv_statements_8_0= ruleStatement ) )* otherlv_9= '}' )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:248:2: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( (lv_modifier_1_1= 'private' | lv_modifier_1_2= 'public' ) ) )? ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' otherlv_5= ')' otherlv_6= '{' ( (lv_decls_7_0= ruleFieldDecl ) )* ( (lv_statements_8_0= ruleStatement ) )* otherlv_9= '}' )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:249:3: ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( (lv_modifier_1_1= 'private' | lv_modifier_1_2= 'public' ) ) )? ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' otherlv_5= ')' otherlv_6= '{' ( (lv_decls_7_0= ruleFieldDecl ) )* ( (lv_statements_8_0= ruleStatement ) )* otherlv_9= '}'
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:249:3: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==22) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalCore861_ContentAssistLookAheadTestLanguage.g:250:4: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalCore861_ContentAssistLookAheadTestLanguage.g:250:4: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalCore861_ContentAssistLookAheadTestLanguage.g:251:5: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getMethodDeclAccess().getAnnotationsAnnotationParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getMethodDeclRule());
            	      					}
            	      					add(
            	      						current,
            	      						"annotations",
            	      						lv_annotations_0_0,
            	      						"org.eclipse.xtext.ide.tests.testlanguage.Core861_ContentAssistLookAheadTestLanguage.Annotation");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalCore861_ContentAssistLookAheadTestLanguage.g:268:3: ( ( (lv_modifier_1_1= 'private' | lv_modifier_1_2= 'public' ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=11 && LA8_0<=12)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:269:4: ( (lv_modifier_1_1= 'private' | lv_modifier_1_2= 'public' ) )
                    {
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:269:4: ( (lv_modifier_1_1= 'private' | lv_modifier_1_2= 'public' ) )
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:270:5: (lv_modifier_1_1= 'private' | lv_modifier_1_2= 'public' )
                    {
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:270:5: (lv_modifier_1_1= 'private' | lv_modifier_1_2= 'public' )
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==11) ) {
                        alt7=1;
                    }
                    else if ( (LA7_0==12) ) {
                        alt7=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 0, input);

                        throw nvae;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalCore861_ContentAssistLookAheadTestLanguage.g:271:6: lv_modifier_1_1= 'private'
                            {
                            lv_modifier_1_1=(Token)match(input,11,FOLLOW_4); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_modifier_1_1, grammarAccess.getMethodDeclAccess().getModifierPrivateKeyword_1_0_0());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getMethodDeclRule());
                              						}
                              						setWithLastConsumed(current, "modifier", lv_modifier_1_1, null);
                              					
                            }

                            }
                            break;
                        case 2 :
                            // InternalCore861_ContentAssistLookAheadTestLanguage.g:282:6: lv_modifier_1_2= 'public'
                            {
                            lv_modifier_1_2=(Token)match(input,12,FOLLOW_4); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_modifier_1_2, grammarAccess.getMethodDeclAccess().getModifierPublicKeyword_1_0_1());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getMethodDeclRule());
                              						}
                              						setWithLastConsumed(current, "modifier", lv_modifier_1_2, null);
                              					
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // InternalCore861_ContentAssistLookAheadTestLanguage.g:295:3: ( (lv_type_2_0= ruleType ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:296:4: (lv_type_2_0= ruleType )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:296:4: (lv_type_2_0= ruleType )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:297:5: lv_type_2_0= ruleType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMethodDeclAccess().getTypeTypeParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_type_2_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMethodDeclRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_2_0,
              						"org.eclipse.xtext.ide.tests.testlanguage.Core861_ContentAssistLookAheadTestLanguage.Type");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCore861_ContentAssistLookAheadTestLanguage.g:314:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:315:4: (lv_name_3_0= RULE_ID )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:315:4: (lv_name_3_0= RULE_ID )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:316:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_3_0, grammarAccess.getMethodDeclAccess().getNameIDTerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMethodDeclRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_3_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getMethodDeclAccess().getLeftParenthesisKeyword_4());
              		
            }
            otherlv_5=(Token)match(input,16,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getMethodDeclAccess().getRightParenthesisKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,17,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getMethodDeclAccess().getLeftCurlyBracketKeyword_6());
              		
            }
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:344:3: ( (lv_decls_7_0= ruleFieldDecl ) )*
            loop9:
            do {
                int alt9=2;
                alt9 = dfa9.predict(input);
                switch (alt9) {
            	case 1 :
            	    // InternalCore861_ContentAssistLookAheadTestLanguage.g:345:4: (lv_decls_7_0= ruleFieldDecl )
            	    {
            	    // InternalCore861_ContentAssistLookAheadTestLanguage.g:345:4: (lv_decls_7_0= ruleFieldDecl )
            	    // InternalCore861_ContentAssistLookAheadTestLanguage.g:346:5: lv_decls_7_0= ruleFieldDecl
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getMethodDeclAccess().getDeclsFieldDeclParserRuleCall_7_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_12);
            	    lv_decls_7_0=ruleFieldDecl();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getMethodDeclRule());
            	      					}
            	      					add(
            	      						current,
            	      						"decls",
            	      						lv_decls_7_0,
            	      						"org.eclipse.xtext.ide.tests.testlanguage.Core861_ContentAssistLookAheadTestLanguage.FieldDecl");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalCore861_ContentAssistLookAheadTestLanguage.g:363:3: ( (lv_statements_8_0= ruleStatement ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||LA10_0==21) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalCore861_ContentAssistLookAheadTestLanguage.g:364:4: (lv_statements_8_0= ruleStatement )
            	    {
            	    // InternalCore861_ContentAssistLookAheadTestLanguage.g:364:4: (lv_statements_8_0= ruleStatement )
            	    // InternalCore861_ContentAssistLookAheadTestLanguage.g:365:5: lv_statements_8_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getMethodDeclAccess().getStatementsStatementParserRuleCall_8_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_13);
            	    lv_statements_8_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getMethodDeclRule());
            	      					}
            	      					add(
            	      						current,
            	      						"statements",
            	      						lv_statements_8_0,
            	      						"org.eclipse.xtext.ide.tests.testlanguage.Core861_ContentAssistLookAheadTestLanguage.Statement");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_9=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getMethodDeclAccess().getRightCurlyBracketKeyword_9());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMethodDecl"


    // $ANTLR start "entryRuleType"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:390:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:390:45: (iv_ruleType= ruleType EOF )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:391:2: iv_ruleType= ruleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:397:1: ruleType returns [EObject current=null] : ( ( () otherlv_1= 'int' ) | ( () ( ( ruleQualifiedName ) ) ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:403:2: ( ( ( () otherlv_1= 'int' ) | ( () ( ( ruleQualifiedName ) ) ) ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:404:2: ( ( () otherlv_1= 'int' ) | ( () ( ( ruleQualifiedName ) ) ) )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:404:2: ( ( () otherlv_1= 'int' ) | ( () ( ( ruleQualifiedName ) ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:405:3: ( () otherlv_1= 'int' )
                    {
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:405:3: ( () otherlv_1= 'int' )
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:406:4: () otherlv_1= 'int'
                    {
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:406:4: ()
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:407:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTypeAccess().getIntTypeAction_0_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_1=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getTypeAccess().getIntKeyword_0_1());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:419:3: ( () ( ( ruleQualifiedName ) ) )
                    {
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:419:3: ( () ( ( ruleQualifiedName ) ) )
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:420:4: () ( ( ruleQualifiedName ) )
                    {
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:420:4: ()
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:421:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTypeAccess().getTypeRefAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:427:4: ( ( ruleQualifiedName ) )
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:428:5: ( ruleQualifiedName )
                    {
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:428:5: ( ruleQualifiedName )
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:429:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTypeRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTypeAccess().getTypeTypeCrossReference_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:448:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:448:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:449:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:455:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:461:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:462:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:462:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:463:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:470:3: (kw= '.' this_ID_2= RULE_ID )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==20) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalCore861_ContentAssistLookAheadTestLanguage.g:471:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,20,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleStatement"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:488:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:488:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:489:2: iv_ruleStatement= ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:495:1: ruleStatement returns [EObject current=null] : (this_AssignmentStatement_0= ruleAssignmentStatement | ( () otherlv_2= 'return' otherlv_3= ';' ) ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_AssignmentStatement_0 = null;



        	enterRule();

        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:501:2: ( (this_AssignmentStatement_0= ruleAssignmentStatement | ( () otherlv_2= 'return' otherlv_3= ';' ) ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:502:2: (this_AssignmentStatement_0= ruleAssignmentStatement | ( () otherlv_2= 'return' otherlv_3= ';' ) )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:502:2: (this_AssignmentStatement_0= ruleAssignmentStatement | ( () otherlv_2= 'return' otherlv_3= ';' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            else if ( (LA13_0==21) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:503:3: this_AssignmentStatement_0= ruleAssignmentStatement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getAssignmentStatementParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AssignmentStatement_0=ruleAssignmentStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AssignmentStatement_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:512:3: ( () otherlv_2= 'return' otherlv_3= ';' )
                    {
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:512:3: ( () otherlv_2= 'return' otherlv_3= ';' )
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:513:4: () otherlv_2= 'return' otherlv_3= ';'
                    {
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:513:4: ()
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:514:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getStatementAccess().getReturnAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_2=(Token)match(input,21,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getStatementAccess().getReturnKeyword_1_1());
                      			
                    }
                    otherlv_3=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getStatementAccess().getSemicolonKeyword_1_2());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleAssignmentStatement"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:533:1: entryRuleAssignmentStatement returns [EObject current=null] : iv_ruleAssignmentStatement= ruleAssignmentStatement EOF ;
    public final EObject entryRuleAssignmentStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignmentStatement = null;


        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:533:60: (iv_ruleAssignmentStatement= ruleAssignmentStatement EOF )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:534:2: iv_ruleAssignmentStatement= ruleAssignmentStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAssignmentStatement=ruleAssignmentStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignmentStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAssignmentStatement"


    // $ANTLR start "ruleAssignmentStatement"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:540:1: ruleAssignmentStatement returns [EObject current=null] : (this_FeatureCall_0= ruleFeatureCall ( () otherlv_2= '=' ( (lv_rhs_3_0= RULE_INT ) ) )? otherlv_4= ';' ) ;
    public final EObject ruleAssignmentStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_rhs_3_0=null;
        Token otherlv_4=null;
        EObject this_FeatureCall_0 = null;



        	enterRule();

        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:546:2: ( (this_FeatureCall_0= ruleFeatureCall ( () otherlv_2= '=' ( (lv_rhs_3_0= RULE_INT ) ) )? otherlv_4= ';' ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:547:2: (this_FeatureCall_0= ruleFeatureCall ( () otherlv_2= '=' ( (lv_rhs_3_0= RULE_INT ) ) )? otherlv_4= ';' )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:547:2: (this_FeatureCall_0= ruleFeatureCall ( () otherlv_2= '=' ( (lv_rhs_3_0= RULE_INT ) ) )? otherlv_4= ';' )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:548:3: this_FeatureCall_0= ruleFeatureCall ( () otherlv_2= '=' ( (lv_rhs_3_0= RULE_INT ) ) )? otherlv_4= ';'
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAssignmentStatementAccess().getFeatureCallParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_6);
            this_FeatureCall_0=ruleFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_FeatureCall_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:556:3: ( () otherlv_2= '=' ( (lv_rhs_3_0= RULE_INT ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==13) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:557:4: () otherlv_2= '=' ( (lv_rhs_3_0= RULE_INT ) )
                    {
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:557:4: ()
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:558:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndSet(
                      						grammarAccess.getAssignmentStatementAccess().getAssignmentFeatureAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_2=(Token)match(input,13,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getAssignmentStatementAccess().getEqualsSignKeyword_1_1());
                      			
                    }
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:568:4: ( (lv_rhs_3_0= RULE_INT ) )
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:569:5: (lv_rhs_3_0= RULE_INT )
                    {
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:569:5: (lv_rhs_3_0= RULE_INT )
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:570:6: lv_rhs_3_0= RULE_INT
                    {
                    lv_rhs_3_0=(Token)match(input,RULE_INT,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_rhs_3_0, grammarAccess.getAssignmentStatementAccess().getRhsINTTerminalRuleCall_1_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAssignmentStatementRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"rhs",
                      							lv_rhs_3_0,
                      							"org.eclipse.xtext.common.Terminals.INT");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getAssignmentStatementAccess().getSemicolonKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAssignmentStatement"


    // $ANTLR start "entryRuleFeatureCall"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:595:1: entryRuleFeatureCall returns [EObject current=null] : iv_ruleFeatureCall= ruleFeatureCall EOF ;
    public final EObject entryRuleFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureCall = null;


        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:595:52: (iv_ruleFeatureCall= ruleFeatureCall EOF )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:596:2: iv_ruleFeatureCall= ruleFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureCallRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFeatureCall=ruleFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeatureCall; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFeatureCall"


    // $ANTLR start "ruleFeatureCall"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:602:1: ruleFeatureCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( () ( ( '.' )=>otherlv_2= '.' ) ( (otherlv_3= RULE_ID ) ) )* ) ;
    public final EObject ruleFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:608:2: ( ( ( (otherlv_0= RULE_ID ) ) ( () ( ( '.' )=>otherlv_2= '.' ) ( (otherlv_3= RULE_ID ) ) )* ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:609:2: ( ( (otherlv_0= RULE_ID ) ) ( () ( ( '.' )=>otherlv_2= '.' ) ( (otherlv_3= RULE_ID ) ) )* )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:609:2: ( ( (otherlv_0= RULE_ID ) ) ( () ( ( '.' )=>otherlv_2= '.' ) ( (otherlv_3= RULE_ID ) ) )* )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:610:3: ( (otherlv_0= RULE_ID ) ) ( () ( ( '.' )=>otherlv_2= '.' ) ( (otherlv_3= RULE_ID ) ) )*
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:610:3: ( (otherlv_0= RULE_ID ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:611:4: (otherlv_0= RULE_ID )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:611:4: (otherlv_0= RULE_ID )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:612:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFeatureCallRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getFeatureCallAccess().getFeatureMemberCrossReference_0_0());
              				
            }

            }


            }

            // InternalCore861_ContentAssistLookAheadTestLanguage.g:623:3: ( () ( ( '.' )=>otherlv_2= '.' ) ( (otherlv_3= RULE_ID ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==20) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalCore861_ContentAssistLookAheadTestLanguage.g:624:4: () ( ( '.' )=>otherlv_2= '.' ) ( (otherlv_3= RULE_ID ) )
            	    {
            	    // InternalCore861_ContentAssistLookAheadTestLanguage.g:624:4: ()
            	    // InternalCore861_ContentAssistLookAheadTestLanguage.g:625:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getFeatureCallAccess().getMemberCallOwnerAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalCore861_ContentAssistLookAheadTestLanguage.g:631:4: ( ( '.' )=>otherlv_2= '.' )
            	    // InternalCore861_ContentAssistLookAheadTestLanguage.g:632:5: ( '.' )=>otherlv_2= '.'
            	    {
            	    otherlv_2=(Token)match(input,20,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_2, grammarAccess.getFeatureCallAccess().getFullStopKeyword_1_1());
            	      				
            	    }

            	    }

            	    // InternalCore861_ContentAssistLookAheadTestLanguage.g:638:4: ( (otherlv_3= RULE_ID ) )
            	    // InternalCore861_ContentAssistLookAheadTestLanguage.g:639:5: (otherlv_3= RULE_ID )
            	    {
            	    // InternalCore861_ContentAssistLookAheadTestLanguage.g:639:5: (otherlv_3= RULE_ID )
            	    // InternalCore861_ContentAssistLookAheadTestLanguage.g:640:6: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getFeatureCallRule());
            	      						}
            	      					
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_3, grammarAccess.getFeatureCallAccess().getMemberMemberCrossReference_1_2_0());
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFeatureCall"


    // $ANTLR start "entryRuleAnnotation"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:656:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:656:51: (iv_ruleAnnotation= ruleAnnotation EOF )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:657:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:663:1: ruleAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_key_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_values_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_STRING ) ) )* otherlv_6= ')' )? ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_key_1_0=null;
        Token otherlv_2=null;
        Token lv_values_3_0=null;
        Token otherlv_4=null;
        Token lv_values_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:669:2: ( (otherlv_0= '@' ( (lv_key_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_values_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_STRING ) ) )* otherlv_6= ')' )? ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:670:2: (otherlv_0= '@' ( (lv_key_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_values_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_STRING ) ) )* otherlv_6= ')' )? )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:670:2: (otherlv_0= '@' ( (lv_key_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_values_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_STRING ) ) )* otherlv_6= ')' )? )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:671:3: otherlv_0= '@' ( (lv_key_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_values_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_STRING ) ) )* otherlv_6= ')' )?
            {
            otherlv_0=(Token)match(input,22,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0());
              		
            }
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:675:3: ( (lv_key_1_0= RULE_ID ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:676:4: (lv_key_1_0= RULE_ID )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:676:4: (lv_key_1_0= RULE_ID )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:677:5: lv_key_1_0= RULE_ID
            {
            lv_key_1_0=(Token)match(input,RULE_ID,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_key_1_0, grammarAccess.getAnnotationAccess().getKeyIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAnnotationRule());
              					}
              					setWithLastConsumed(
              						current,
              						"key",
              						lv_key_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalCore861_ContentAssistLookAheadTestLanguage.g:693:3: (otherlv_2= '(' ( (lv_values_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_STRING ) ) )* otherlv_6= ')' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==15) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:694:4: otherlv_2= '(' ( (lv_values_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_STRING ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_2_0());
                      			
                    }
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:698:4: ( (lv_values_3_0= RULE_STRING ) )
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:699:5: (lv_values_3_0= RULE_STRING )
                    {
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:699:5: (lv_values_3_0= RULE_STRING )
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:700:6: lv_values_3_0= RULE_STRING
                    {
                    lv_values_3_0=(Token)match(input,RULE_STRING,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_values_3_0, grammarAccess.getAnnotationAccess().getValuesSTRINGTerminalRuleCall_2_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAnnotationRule());
                      						}
                      						addWithLastConsumed(
                      							current,
                      							"values",
                      							lv_values_3_0,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }


                    }

                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:716:4: (otherlv_4= ',' ( (lv_values_5_0= RULE_STRING ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==23) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalCore861_ContentAssistLookAheadTestLanguage.g:717:5: otherlv_4= ',' ( (lv_values_5_0= RULE_STRING ) )
                    	    {
                    	    otherlv_4=(Token)match(input,23,FOLLOW_16); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getAnnotationAccess().getCommaKeyword_2_2_0());
                    	      				
                    	    }
                    	    // InternalCore861_ContentAssistLookAheadTestLanguage.g:721:5: ( (lv_values_5_0= RULE_STRING ) )
                    	    // InternalCore861_ContentAssistLookAheadTestLanguage.g:722:6: (lv_values_5_0= RULE_STRING )
                    	    {
                    	    // InternalCore861_ContentAssistLookAheadTestLanguage.g:722:6: (lv_values_5_0= RULE_STRING )
                    	    // InternalCore861_ContentAssistLookAheadTestLanguage.g:723:7: lv_values_5_0= RULE_STRING
                    	    {
                    	    lv_values_5_0=(Token)match(input,RULE_STRING,FOLLOW_17); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							newLeafNode(lv_values_5_0, grammarAccess.getAnnotationAccess().getValuesSTRINGTerminalRuleCall_2_2_1_0());
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getAnnotationRule());
                    	      							}
                    	      							addWithLastConsumed(
                    	      								current,
                    	      								"values",
                    	      								lv_values_5_0,
                    	      								"org.eclipse.xtext.common.Terminals.STRING");
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getAnnotationAccess().getRightParenthesisKeyword_2_3());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAnnotation"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA9 dfa9 = new DFA9(this);
    static final String dfa_1s = "\21\uffff";
    static final String dfa_2s = "\7\4\1\15\1\4\1\6\2\uffff\1\4\1\20\1\6\1\4\1\20";
    static final String dfa_3s = "\1\26\1\4\2\23\1\4\1\24\1\26\1\17\1\4\1\6\2\uffff\1\24\1\27\1\6\1\26\1\27";
    static final String dfa_4s = "\12\uffff\1\1\1\2\5\uffff";
    static final String dfa_5s = "\21\uffff}>";
    static final String[] dfa_6s = {
            "\1\5\6\uffff\1\2\1\3\6\uffff\1\4\2\uffff\1\1",
            "\1\6",
            "\1\5\16\uffff\1\4",
            "\1\5\16\uffff\1\4",
            "\1\7",
            "\1\7\17\uffff\1\10",
            "\1\5\6\uffff\1\2\1\3\2\uffff\1\11\3\uffff\1\4\2\uffff\1\1",
            "\2\12\1\13",
            "\1\14",
            "\1\15",
            "",
            "",
            "\1\7\17\uffff\1\10",
            "\1\17\6\uffff\1\16",
            "\1\20",
            "\1\5\6\uffff\1\2\1\3\6\uffff\1\4\2\uffff\1\1",
            "\1\17\6\uffff\1\16"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "82:2: (this_FieldDecl_0= ruleFieldDecl | this_MethodDecl_1= ruleMethodDecl )";
        }
    }
    static final String dfa_7s = "\6\uffff";
    static final String dfa_8s = "\2\4\2\uffff\2\4";
    static final String dfa_9s = "\1\26\1\24\2\uffff\1\4\1\24";
    static final String dfa_10s = "\2\uffff\1\2\1\1\2\uffff";
    static final String dfa_11s = "\6\uffff}>";
    static final String[] dfa_12s = {
            "\1\1\6\uffff\2\3\5\uffff\1\2\1\3\1\uffff\1\2\1\3",
            "\1\3\10\uffff\2\2\5\uffff\1\4",
            "",
            "",
            "\1\5",
            "\1\3\10\uffff\2\2\5\uffff\1\4"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "()* loopback of 344:3: ( (lv_decls_7_0= ruleFieldDecl ) )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000481810L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000081810L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000006C1810L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000240010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000810000L});

}