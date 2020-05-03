package org.eclipse.xtext.parser.epatch.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.parser.epatch.services.EpatchTestLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEpatchTestLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_FRAGMENT", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'epatch'", "'{'", "'}'", "'import'", "'uri'", "'ns'", "'java'", "'.'", "'extension'", "'::'", "'resource'", "'left'", "';'", "'right'", "'object'", "'='", "'|'", "'['", "','", "']'", "':'", "'null'", "'new'", "'copy'", "'migrate'", "'as'", "'each'", "'('", "')'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_FRAGMENT=6;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalEpatchTestLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEpatchTestLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEpatchTestLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalEpatchTestLanguage.g"; }



     	private EpatchTestLanguageGrammarAccess grammarAccess;

        public InternalEpatchTestLanguageParser(TokenStream input, EpatchTestLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "EPatch";
       	}

       	@Override
       	protected EpatchTestLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleEPatch"
    // InternalEpatchTestLanguage.g:64:1: entryRuleEPatch returns [EObject current=null] : iv_ruleEPatch= ruleEPatch EOF ;
    public final EObject entryRuleEPatch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPatch = null;


        try {
            // InternalEpatchTestLanguage.g:64:47: (iv_ruleEPatch= ruleEPatch EOF )
            // InternalEpatchTestLanguage.g:65:2: iv_ruleEPatch= ruleEPatch EOF
            {
             newCompositeNode(grammarAccess.getEPatchRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEPatch=ruleEPatch();

            state._fsp--;

             current =iv_ruleEPatch; 
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
    // $ANTLR end "entryRuleEPatch"


    // $ANTLR start "ruleEPatch"
    // InternalEpatchTestLanguage.g:71:1: ruleEPatch returns [EObject current=null] : (otherlv_0= 'epatch' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* ( (lv_resources_4_0= ruleNamedResource ) )* ( (lv_objects_5_0= ruleObjectRef ) )* otherlv_6= '}' ) ;
    public final EObject ruleEPatch() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_imports_3_0 = null;

        EObject lv_resources_4_0 = null;

        EObject lv_objects_5_0 = null;


        try {
            // InternalEpatchTestLanguage.g:72:1: ( (otherlv_0= 'epatch' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* ( (lv_resources_4_0= ruleNamedResource ) )* ( (lv_objects_5_0= ruleObjectRef ) )* otherlv_6= '}' ) )
            // InternalEpatchTestLanguage.g:73:2: (otherlv_0= 'epatch' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* ( (lv_resources_4_0= ruleNamedResource ) )* ( (lv_objects_5_0= ruleObjectRef ) )* otherlv_6= '}' )
            {
            // InternalEpatchTestLanguage.g:73:2: (otherlv_0= 'epatch' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* ( (lv_resources_4_0= ruleNamedResource ) )* ( (lv_objects_5_0= ruleObjectRef ) )* otherlv_6= '}' )
            // InternalEpatchTestLanguage.g:74:3: otherlv_0= 'epatch' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* ( (lv_resources_4_0= ruleNamedResource ) )* ( (lv_objects_5_0= ruleObjectRef ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,12,FollowSets000.FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEPatchAccess().getEpatchKeyword_0());
            		
            // InternalEpatchTestLanguage.g:78:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEpatchTestLanguage.g:79:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEpatchTestLanguage.g:79:4: (lv_name_1_0= RULE_ID )
            // InternalEpatchTestLanguage.g:80:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEPatchAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEPatchRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getEPatchAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalEpatchTestLanguage.g:100:3: ( (lv_imports_3_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalEpatchTestLanguage.g:101:4: (lv_imports_3_0= ruleImport )
            	    {
            	    // InternalEpatchTestLanguage.g:101:4: (lv_imports_3_0= ruleImport )
            	    // InternalEpatchTestLanguage.g:102:5: lv_imports_3_0= ruleImport
            	    {

            	    					newCompositeNode(grammarAccess.getEPatchAccess().getImportsImportParserRuleCall_3_0());
            	    				
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_imports_3_0=ruleImport();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEPatchRule());
            	    					}
            	    					add(
            	    						current,
            	    						"imports",
            	    						lv_imports_3_0,
            	    						"org.eclipse.xtext.parser.epatch.EpatchTestLanguage.Import");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalEpatchTestLanguage.g:119:3: ( (lv_resources_4_0= ruleNamedResource ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==22) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalEpatchTestLanguage.g:120:4: (lv_resources_4_0= ruleNamedResource )
            	    {
            	    // InternalEpatchTestLanguage.g:120:4: (lv_resources_4_0= ruleNamedResource )
            	    // InternalEpatchTestLanguage.g:121:5: lv_resources_4_0= ruleNamedResource
            	    {

            	    					newCompositeNode(grammarAccess.getEPatchAccess().getResourcesNamedResourceParserRuleCall_4_0());
            	    				
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    lv_resources_4_0=ruleNamedResource();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEPatchRule());
            	    					}
            	    					add(
            	    						current,
            	    						"resources",
            	    						lv_resources_4_0,
            	    						"org.eclipse.xtext.parser.epatch.EpatchTestLanguage.NamedResource");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalEpatchTestLanguage.g:138:3: ( (lv_objects_5_0= ruleObjectRef ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==26) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalEpatchTestLanguage.g:139:4: (lv_objects_5_0= ruleObjectRef )
            	    {
            	    // InternalEpatchTestLanguage.g:139:4: (lv_objects_5_0= ruleObjectRef )
            	    // InternalEpatchTestLanguage.g:140:5: lv_objects_5_0= ruleObjectRef
            	    {

            	    					newCompositeNode(grammarAccess.getEPatchAccess().getObjectsObjectRefParserRuleCall_5_0());
            	    				
            	    pushFollow(FollowSets000.FOLLOW_7);
            	    lv_objects_5_0=ruleObjectRef();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEPatchRule());
            	    					}
            	    					add(
            	    						current,
            	    						"objects",
            	    						lv_objects_5_0,
            	    						"org.eclipse.xtext.parser.epatch.EpatchTestLanguage.ObjectRef");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getEPatchAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleEPatch"


    // $ANTLR start "entryRuleImport"
    // InternalEpatchTestLanguage.g:165:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalEpatchTestLanguage.g:165:47: (iv_ruleImport= ruleImport EOF )
            // InternalEpatchTestLanguage.g:166:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalEpatchTestLanguage.g:172:1: ruleImport returns [EObject current=null] : (this_ModelImport_0= ruleModelImport | this_JavaImport_1= ruleJavaImport | this_ExtensionImport_2= ruleExtensionImport ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        EObject this_ModelImport_0 = null;

        EObject this_JavaImport_1 = null;

        EObject this_ExtensionImport_2 = null;


        try {
            // InternalEpatchTestLanguage.g:173:1: ( (this_ModelImport_0= ruleModelImport | this_JavaImport_1= ruleJavaImport | this_ExtensionImport_2= ruleExtensionImport ) )
            // InternalEpatchTestLanguage.g:174:2: (this_ModelImport_0= ruleModelImport | this_JavaImport_1= ruleJavaImport | this_ExtensionImport_2= ruleExtensionImport )
            {
            // InternalEpatchTestLanguage.g:174:2: (this_ModelImport_0= ruleModelImport | this_JavaImport_1= ruleJavaImport | this_ExtensionImport_2= ruleExtensionImport )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                switch ( input.LA(2) ) {
                case RULE_ID:
                    {
                    alt4=1;
                    }
                    break;
                case 18:
                    {
                    alt4=2;
                    }
                    break;
                case 20:
                    {
                    alt4=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalEpatchTestLanguage.g:175:3: this_ModelImport_0= ruleModelImport
                    {

                    			newCompositeNode(grammarAccess.getImportAccess().getModelImportParserRuleCall_0());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ModelImport_0=ruleModelImport();

                    state._fsp--;


                    			current = this_ModelImport_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalEpatchTestLanguage.g:184:3: this_JavaImport_1= ruleJavaImport
                    {

                    			newCompositeNode(grammarAccess.getImportAccess().getJavaImportParserRuleCall_1());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_JavaImport_1=ruleJavaImport();

                    state._fsp--;


                    			current = this_JavaImport_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalEpatchTestLanguage.g:193:3: this_ExtensionImport_2= ruleExtensionImport
                    {

                    			newCompositeNode(grammarAccess.getImportAccess().getExtensionImportParserRuleCall_2());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ExtensionImport_2=ruleExtensionImport();

                    state._fsp--;


                    			current = this_ExtensionImport_2;
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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleModelImport"
    // InternalEpatchTestLanguage.g:205:1: entryRuleModelImport returns [EObject current=null] : iv_ruleModelImport= ruleModelImport EOF ;
    public final EObject entryRuleModelImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelImport = null;


        try {
            // InternalEpatchTestLanguage.g:205:52: (iv_ruleModelImport= ruleModelImport EOF )
            // InternalEpatchTestLanguage.g:206:2: iv_ruleModelImport= ruleModelImport EOF
            {
             newCompositeNode(grammarAccess.getModelImportRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleModelImport=ruleModelImport();

            state._fsp--;

             current =iv_ruleModelImport; 
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
    // $ANTLR end "entryRuleModelImport"


    // $ANTLR start "ruleModelImport"
    // InternalEpatchTestLanguage.g:212:1: ruleModelImport returns [EObject current=null] : (this_ResourceImport_0= ruleResourceImport | this_EPackageImport_1= ruleEPackageImport ) ;
    public final EObject ruleModelImport() throws RecognitionException {
        EObject current = null;

        EObject this_ResourceImport_0 = null;

        EObject this_EPackageImport_1 = null;


        try {
            // InternalEpatchTestLanguage.g:213:1: ( (this_ResourceImport_0= ruleResourceImport | this_EPackageImport_1= ruleEPackageImport ) )
            // InternalEpatchTestLanguage.g:214:2: (this_ResourceImport_0= ruleResourceImport | this_EPackageImport_1= ruleEPackageImport )
            {
            // InternalEpatchTestLanguage.g:214:2: (this_ResourceImport_0= ruleResourceImport | this_EPackageImport_1= ruleEPackageImport )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==RULE_ID) ) {
                    int LA5_2 = input.LA(3);

                    if ( (LA5_2==17) ) {
                        alt5=2;
                    }
                    else if ( (LA5_2==16) ) {
                        alt5=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalEpatchTestLanguage.g:215:3: this_ResourceImport_0= ruleResourceImport
                    {

                    			newCompositeNode(grammarAccess.getModelImportAccess().getResourceImportParserRuleCall_0());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ResourceImport_0=ruleResourceImport();

                    state._fsp--;


                    			current = this_ResourceImport_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalEpatchTestLanguage.g:224:3: this_EPackageImport_1= ruleEPackageImport
                    {

                    			newCompositeNode(grammarAccess.getModelImportAccess().getEPackageImportParserRuleCall_1());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_EPackageImport_1=ruleEPackageImport();

                    state._fsp--;


                    			current = this_EPackageImport_1;
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
    // $ANTLR end "ruleModelImport"


    // $ANTLR start "entryRuleResourceImport"
    // InternalEpatchTestLanguage.g:236:1: entryRuleResourceImport returns [EObject current=null] : iv_ruleResourceImport= ruleResourceImport EOF ;
    public final EObject entryRuleResourceImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceImport = null;


        try {
            // InternalEpatchTestLanguage.g:236:55: (iv_ruleResourceImport= ruleResourceImport EOF )
            // InternalEpatchTestLanguage.g:237:2: iv_ruleResourceImport= ruleResourceImport EOF
            {
             newCompositeNode(grammarAccess.getResourceImportRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleResourceImport=ruleResourceImport();

            state._fsp--;

             current =iv_ruleResourceImport; 
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
    // $ANTLR end "entryRuleResourceImport"


    // $ANTLR start "ruleResourceImport"
    // InternalEpatchTestLanguage.g:243:1: ruleResourceImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'uri' ( (lv_uri_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleResourceImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_uri_3_0=null;

        try {
            // InternalEpatchTestLanguage.g:244:1: ( (otherlv_0= 'import' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'uri' ( (lv_uri_3_0= RULE_STRING ) ) ) )
            // InternalEpatchTestLanguage.g:245:2: (otherlv_0= 'import' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'uri' ( (lv_uri_3_0= RULE_STRING ) ) )
            {
            // InternalEpatchTestLanguage.g:245:2: (otherlv_0= 'import' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'uri' ( (lv_uri_3_0= RULE_STRING ) ) )
            // InternalEpatchTestLanguage.g:246:3: otherlv_0= 'import' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'uri' ( (lv_uri_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getResourceImportAccess().getImportKeyword_0());
            		
            // InternalEpatchTestLanguage.g:250:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEpatchTestLanguage.g:251:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEpatchTestLanguage.g:251:4: (lv_name_1_0= RULE_ID )
            // InternalEpatchTestLanguage.g:252:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getResourceImportAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getResourceImportRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getResourceImportAccess().getUriKeyword_2());
            		
            // InternalEpatchTestLanguage.g:272:3: ( (lv_uri_3_0= RULE_STRING ) )
            // InternalEpatchTestLanguage.g:273:4: (lv_uri_3_0= RULE_STRING )
            {
            // InternalEpatchTestLanguage.g:273:4: (lv_uri_3_0= RULE_STRING )
            // InternalEpatchTestLanguage.g:274:5: lv_uri_3_0= RULE_STRING
            {
            lv_uri_3_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); 

            					newLeafNode(lv_uri_3_0, grammarAccess.getResourceImportAccess().getUriSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getResourceImportRule());
            					}
            					setWithLastConsumed(
            						current,
            						"uri",
            						lv_uri_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleResourceImport"


    // $ANTLR start "entryRuleEPackageImport"
    // InternalEpatchTestLanguage.g:294:1: entryRuleEPackageImport returns [EObject current=null] : iv_ruleEPackageImport= ruleEPackageImport EOF ;
    public final EObject entryRuleEPackageImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPackageImport = null;


        try {
            // InternalEpatchTestLanguage.g:294:55: (iv_ruleEPackageImport= ruleEPackageImport EOF )
            // InternalEpatchTestLanguage.g:295:2: iv_ruleEPackageImport= ruleEPackageImport EOF
            {
             newCompositeNode(grammarAccess.getEPackageImportRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEPackageImport=ruleEPackageImport();

            state._fsp--;

             current =iv_ruleEPackageImport; 
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
    // $ANTLR end "entryRuleEPackageImport"


    // $ANTLR start "ruleEPackageImport"
    // InternalEpatchTestLanguage.g:301:1: ruleEPackageImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ns' ( (lv_nsURI_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleEPackageImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_nsURI_3_0=null;

        try {
            // InternalEpatchTestLanguage.g:302:1: ( (otherlv_0= 'import' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ns' ( (lv_nsURI_3_0= RULE_STRING ) ) ) )
            // InternalEpatchTestLanguage.g:303:2: (otherlv_0= 'import' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ns' ( (lv_nsURI_3_0= RULE_STRING ) ) )
            {
            // InternalEpatchTestLanguage.g:303:2: (otherlv_0= 'import' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ns' ( (lv_nsURI_3_0= RULE_STRING ) ) )
            // InternalEpatchTestLanguage.g:304:3: otherlv_0= 'import' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ns' ( (lv_nsURI_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEPackageImportAccess().getImportKeyword_0());
            		
            // InternalEpatchTestLanguage.g:308:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEpatchTestLanguage.g:309:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEpatchTestLanguage.g:309:4: (lv_name_1_0= RULE_ID )
            // InternalEpatchTestLanguage.g:310:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEPackageImportAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEPackageImportRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getEPackageImportAccess().getNsKeyword_2());
            		
            // InternalEpatchTestLanguage.g:330:3: ( (lv_nsURI_3_0= RULE_STRING ) )
            // InternalEpatchTestLanguage.g:331:4: (lv_nsURI_3_0= RULE_STRING )
            {
            // InternalEpatchTestLanguage.g:331:4: (lv_nsURI_3_0= RULE_STRING )
            // InternalEpatchTestLanguage.g:332:5: lv_nsURI_3_0= RULE_STRING
            {
            lv_nsURI_3_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); 

            					newLeafNode(lv_nsURI_3_0, grammarAccess.getEPackageImportAccess().getNsURISTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEPackageImportRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nsURI",
            						lv_nsURI_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleEPackageImport"


    // $ANTLR start "entryRuleJavaImport"
    // InternalEpatchTestLanguage.g:352:1: entryRuleJavaImport returns [EObject current=null] : iv_ruleJavaImport= ruleJavaImport EOF ;
    public final EObject entryRuleJavaImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJavaImport = null;


        try {
            // InternalEpatchTestLanguage.g:352:51: (iv_ruleJavaImport= ruleJavaImport EOF )
            // InternalEpatchTestLanguage.g:353:2: iv_ruleJavaImport= ruleJavaImport EOF
            {
             newCompositeNode(grammarAccess.getJavaImportRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleJavaImport=ruleJavaImport();

            state._fsp--;

             current =iv_ruleJavaImport; 
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
    // $ANTLR end "entryRuleJavaImport"


    // $ANTLR start "ruleJavaImport"
    // InternalEpatchTestLanguage.g:359:1: ruleJavaImport returns [EObject current=null] : (otherlv_0= 'import' otherlv_1= 'java' ( (lv_path_2_0= RULE_ID ) ) (otherlv_3= '.' ( (lv_path_4_0= RULE_ID ) ) )* ) ;
    public final EObject ruleJavaImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_path_2_0=null;
        Token otherlv_3=null;
        Token lv_path_4_0=null;

        try {
            // InternalEpatchTestLanguage.g:360:1: ( (otherlv_0= 'import' otherlv_1= 'java' ( (lv_path_2_0= RULE_ID ) ) (otherlv_3= '.' ( (lv_path_4_0= RULE_ID ) ) )* ) )
            // InternalEpatchTestLanguage.g:361:2: (otherlv_0= 'import' otherlv_1= 'java' ( (lv_path_2_0= RULE_ID ) ) (otherlv_3= '.' ( (lv_path_4_0= RULE_ID ) ) )* )
            {
            // InternalEpatchTestLanguage.g:361:2: (otherlv_0= 'import' otherlv_1= 'java' ( (lv_path_2_0= RULE_ID ) ) (otherlv_3= '.' ( (lv_path_4_0= RULE_ID ) ) )* )
            // InternalEpatchTestLanguage.g:362:3: otherlv_0= 'import' otherlv_1= 'java' ( (lv_path_2_0= RULE_ID ) ) (otherlv_3= '.' ( (lv_path_4_0= RULE_ID ) ) )*
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getJavaImportAccess().getImportKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getJavaImportAccess().getJavaKeyword_1());
            		
            // InternalEpatchTestLanguage.g:370:3: ( (lv_path_2_0= RULE_ID ) )
            // InternalEpatchTestLanguage.g:371:4: (lv_path_2_0= RULE_ID )
            {
            // InternalEpatchTestLanguage.g:371:4: (lv_path_2_0= RULE_ID )
            // InternalEpatchTestLanguage.g:372:5: lv_path_2_0= RULE_ID
            {
            lv_path_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_12); 

            					newLeafNode(lv_path_2_0, grammarAccess.getJavaImportAccess().getPathIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJavaImportRule());
            					}
            					addWithLastConsumed(
            						current,
            						"path",
            						lv_path_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalEpatchTestLanguage.g:388:3: (otherlv_3= '.' ( (lv_path_4_0= RULE_ID ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalEpatchTestLanguage.g:389:4: otherlv_3= '.' ( (lv_path_4_0= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_3); 

            	    				newLeafNode(otherlv_3, grammarAccess.getJavaImportAccess().getFullStopKeyword_3_0());
            	    			
            	    // InternalEpatchTestLanguage.g:393:4: ( (lv_path_4_0= RULE_ID ) )
            	    // InternalEpatchTestLanguage.g:394:5: (lv_path_4_0= RULE_ID )
            	    {
            	    // InternalEpatchTestLanguage.g:394:5: (lv_path_4_0= RULE_ID )
            	    // InternalEpatchTestLanguage.g:395:6: lv_path_4_0= RULE_ID
            	    {
            	    lv_path_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_12); 

            	    						newLeafNode(lv_path_4_0, grammarAccess.getJavaImportAccess().getPathIDTerminalRuleCall_3_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getJavaImportRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"path",
            	    							lv_path_4_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // $ANTLR end "ruleJavaImport"


    // $ANTLR start "entryRuleExtensionImport"
    // InternalEpatchTestLanguage.g:416:1: entryRuleExtensionImport returns [EObject current=null] : iv_ruleExtensionImport= ruleExtensionImport EOF ;
    public final EObject entryRuleExtensionImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtensionImport = null;


        try {
            // InternalEpatchTestLanguage.g:416:56: (iv_ruleExtensionImport= ruleExtensionImport EOF )
            // InternalEpatchTestLanguage.g:417:2: iv_ruleExtensionImport= ruleExtensionImport EOF
            {
             newCompositeNode(grammarAccess.getExtensionImportRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleExtensionImport=ruleExtensionImport();

            state._fsp--;

             current =iv_ruleExtensionImport; 
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
    // $ANTLR end "entryRuleExtensionImport"


    // $ANTLR start "ruleExtensionImport"
    // InternalEpatchTestLanguage.g:423:1: ruleExtensionImport returns [EObject current=null] : (otherlv_0= 'import' otherlv_1= 'extension' ( (lv_path_2_0= RULE_ID ) ) (otherlv_3= '::' ( (lv_path_4_0= RULE_ID ) ) )* ) ;
    public final EObject ruleExtensionImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_path_2_0=null;
        Token otherlv_3=null;
        Token lv_path_4_0=null;

        try {
            // InternalEpatchTestLanguage.g:424:1: ( (otherlv_0= 'import' otherlv_1= 'extension' ( (lv_path_2_0= RULE_ID ) ) (otherlv_3= '::' ( (lv_path_4_0= RULE_ID ) ) )* ) )
            // InternalEpatchTestLanguage.g:425:2: (otherlv_0= 'import' otherlv_1= 'extension' ( (lv_path_2_0= RULE_ID ) ) (otherlv_3= '::' ( (lv_path_4_0= RULE_ID ) ) )* )
            {
            // InternalEpatchTestLanguage.g:425:2: (otherlv_0= 'import' otherlv_1= 'extension' ( (lv_path_2_0= RULE_ID ) ) (otherlv_3= '::' ( (lv_path_4_0= RULE_ID ) ) )* )
            // InternalEpatchTestLanguage.g:426:3: otherlv_0= 'import' otherlv_1= 'extension' ( (lv_path_2_0= RULE_ID ) ) (otherlv_3= '::' ( (lv_path_4_0= RULE_ID ) ) )*
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getExtensionImportAccess().getImportKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FollowSets000.FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getExtensionImportAccess().getExtensionKeyword_1());
            		
            // InternalEpatchTestLanguage.g:434:3: ( (lv_path_2_0= RULE_ID ) )
            // InternalEpatchTestLanguage.g:435:4: (lv_path_2_0= RULE_ID )
            {
            // InternalEpatchTestLanguage.g:435:4: (lv_path_2_0= RULE_ID )
            // InternalEpatchTestLanguage.g:436:5: lv_path_2_0= RULE_ID
            {
            lv_path_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_14); 

            					newLeafNode(lv_path_2_0, grammarAccess.getExtensionImportAccess().getPathIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExtensionImportRule());
            					}
            					addWithLastConsumed(
            						current,
            						"path",
            						lv_path_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalEpatchTestLanguage.g:452:3: (otherlv_3= '::' ( (lv_path_4_0= RULE_ID ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==21) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalEpatchTestLanguage.g:453:4: otherlv_3= '::' ( (lv_path_4_0= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,21,FollowSets000.FOLLOW_3); 

            	    				newLeafNode(otherlv_3, grammarAccess.getExtensionImportAccess().getColonColonKeyword_3_0());
            	    			
            	    // InternalEpatchTestLanguage.g:457:4: ( (lv_path_4_0= RULE_ID ) )
            	    // InternalEpatchTestLanguage.g:458:5: (lv_path_4_0= RULE_ID )
            	    {
            	    // InternalEpatchTestLanguage.g:458:5: (lv_path_4_0= RULE_ID )
            	    // InternalEpatchTestLanguage.g:459:6: lv_path_4_0= RULE_ID
            	    {
            	    lv_path_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_14); 

            	    						newLeafNode(lv_path_4_0, grammarAccess.getExtensionImportAccess().getPathIDTerminalRuleCall_3_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getExtensionImportRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"path",
            	    							lv_path_4_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // $ANTLR end "ruleExtensionImport"


    // $ANTLR start "entryRuleNamedResource"
    // InternalEpatchTestLanguage.g:480:1: entryRuleNamedResource returns [EObject current=null] : iv_ruleNamedResource= ruleNamedResource EOF ;
    public final EObject entryRuleNamedResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedResource = null;


        try {
            // InternalEpatchTestLanguage.g:480:54: (iv_ruleNamedResource= ruleNamedResource EOF )
            // InternalEpatchTestLanguage.g:481:2: iv_ruleNamedResource= ruleNamedResource EOF
            {
             newCompositeNode(grammarAccess.getNamedResourceRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNamedResource=ruleNamedResource();

            state._fsp--;

             current =iv_ruleNamedResource; 
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
    // $ANTLR end "entryRuleNamedResource"


    // $ANTLR start "ruleNamedResource"
    // InternalEpatchTestLanguage.g:487:1: ruleNamedResource returns [EObject current=null] : (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'left' ( (otherlv_4= 'uri' ( (lv_leftUri_5_0= RULE_STRING ) ) ) | ( (lv_leftRoot_6_0= ruleCreatedObject ) ) ) otherlv_7= ';' otherlv_8= 'right' ( (otherlv_9= 'uri' ( (lv_rightUri_10_0= RULE_STRING ) ) ) | ( (lv_rightRoot_11_0= ruleCreatedObject ) ) ) otherlv_12= ';' otherlv_13= '}' ) ;
    public final EObject ruleNamedResource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_leftUri_5_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_rightUri_10_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject lv_leftRoot_6_0 = null;

        EObject lv_rightRoot_11_0 = null;


        try {
            // InternalEpatchTestLanguage.g:488:1: ( (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'left' ( (otherlv_4= 'uri' ( (lv_leftUri_5_0= RULE_STRING ) ) ) | ( (lv_leftRoot_6_0= ruleCreatedObject ) ) ) otherlv_7= ';' otherlv_8= 'right' ( (otherlv_9= 'uri' ( (lv_rightUri_10_0= RULE_STRING ) ) ) | ( (lv_rightRoot_11_0= ruleCreatedObject ) ) ) otherlv_12= ';' otherlv_13= '}' ) )
            // InternalEpatchTestLanguage.g:489:2: (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'left' ( (otherlv_4= 'uri' ( (lv_leftUri_5_0= RULE_STRING ) ) ) | ( (lv_leftRoot_6_0= ruleCreatedObject ) ) ) otherlv_7= ';' otherlv_8= 'right' ( (otherlv_9= 'uri' ( (lv_rightUri_10_0= RULE_STRING ) ) ) | ( (lv_rightRoot_11_0= ruleCreatedObject ) ) ) otherlv_12= ';' otherlv_13= '}' )
            {
            // InternalEpatchTestLanguage.g:489:2: (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'left' ( (otherlv_4= 'uri' ( (lv_leftUri_5_0= RULE_STRING ) ) ) | ( (lv_leftRoot_6_0= ruleCreatedObject ) ) ) otherlv_7= ';' otherlv_8= 'right' ( (otherlv_9= 'uri' ( (lv_rightUri_10_0= RULE_STRING ) ) ) | ( (lv_rightRoot_11_0= ruleCreatedObject ) ) ) otherlv_12= ';' otherlv_13= '}' )
            // InternalEpatchTestLanguage.g:490:3: otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'left' ( (otherlv_4= 'uri' ( (lv_leftUri_5_0= RULE_STRING ) ) ) | ( (lv_leftRoot_6_0= ruleCreatedObject ) ) ) otherlv_7= ';' otherlv_8= 'right' ( (otherlv_9= 'uri' ( (lv_rightUri_10_0= RULE_STRING ) ) ) | ( (lv_rightRoot_11_0= ruleCreatedObject ) ) ) otherlv_12= ';' otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,22,FollowSets000.FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getNamedResourceAccess().getResourceKeyword_0());
            		
            // InternalEpatchTestLanguage.g:494:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEpatchTestLanguage.g:495:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEpatchTestLanguage.g:495:4: (lv_name_1_0= RULE_ID )
            // InternalEpatchTestLanguage.g:496:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getNamedResourceAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNamedResourceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getNamedResourceAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,23,FollowSets000.FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getNamedResourceAccess().getLeftKeyword_3());
            		
            // InternalEpatchTestLanguage.g:520:3: ( (otherlv_4= 'uri' ( (lv_leftUri_5_0= RULE_STRING ) ) ) | ( (lv_leftRoot_6_0= ruleCreatedObject ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            else if ( ((LA8_0>=34 && LA8_0<=35)) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalEpatchTestLanguage.g:521:4: (otherlv_4= 'uri' ( (lv_leftUri_5_0= RULE_STRING ) ) )
                    {
                    // InternalEpatchTestLanguage.g:521:4: (otherlv_4= 'uri' ( (lv_leftUri_5_0= RULE_STRING ) ) )
                    // InternalEpatchTestLanguage.g:522:5: otherlv_4= 'uri' ( (lv_leftUri_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_9); 

                    					newLeafNode(otherlv_4, grammarAccess.getNamedResourceAccess().getUriKeyword_4_0_0());
                    				
                    // InternalEpatchTestLanguage.g:526:5: ( (lv_leftUri_5_0= RULE_STRING ) )
                    // InternalEpatchTestLanguage.g:527:6: (lv_leftUri_5_0= RULE_STRING )
                    {
                    // InternalEpatchTestLanguage.g:527:6: (lv_leftUri_5_0= RULE_STRING )
                    // InternalEpatchTestLanguage.g:528:7: lv_leftUri_5_0= RULE_STRING
                    {
                    lv_leftUri_5_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_17); 

                    							newLeafNode(lv_leftUri_5_0, grammarAccess.getNamedResourceAccess().getLeftUriSTRINGTerminalRuleCall_4_0_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getNamedResourceRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"leftUri",
                    								lv_leftUri_5_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEpatchTestLanguage.g:546:4: ( (lv_leftRoot_6_0= ruleCreatedObject ) )
                    {
                    // InternalEpatchTestLanguage.g:546:4: ( (lv_leftRoot_6_0= ruleCreatedObject ) )
                    // InternalEpatchTestLanguage.g:547:5: (lv_leftRoot_6_0= ruleCreatedObject )
                    {
                    // InternalEpatchTestLanguage.g:547:5: (lv_leftRoot_6_0= ruleCreatedObject )
                    // InternalEpatchTestLanguage.g:548:6: lv_leftRoot_6_0= ruleCreatedObject
                    {

                    						newCompositeNode(grammarAccess.getNamedResourceAccess().getLeftRootCreatedObjectParserRuleCall_4_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_17);
                    lv_leftRoot_6_0=ruleCreatedObject();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNamedResourceRule());
                    						}
                    						set(
                    							current,
                    							"leftRoot",
                    							lv_leftRoot_6_0,
                    							"org.eclipse.xtext.parser.epatch.EpatchTestLanguage.CreatedObject");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,24,FollowSets000.FOLLOW_18); 

            			newLeafNode(otherlv_7, grammarAccess.getNamedResourceAccess().getSemicolonKeyword_5());
            		
            otherlv_8=(Token)match(input,25,FollowSets000.FOLLOW_16); 

            			newLeafNode(otherlv_8, grammarAccess.getNamedResourceAccess().getRightKeyword_6());
            		
            // InternalEpatchTestLanguage.g:574:3: ( (otherlv_9= 'uri' ( (lv_rightUri_10_0= RULE_STRING ) ) ) | ( (lv_rightRoot_11_0= ruleCreatedObject ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            else if ( ((LA9_0>=34 && LA9_0<=35)) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalEpatchTestLanguage.g:575:4: (otherlv_9= 'uri' ( (lv_rightUri_10_0= RULE_STRING ) ) )
                    {
                    // InternalEpatchTestLanguage.g:575:4: (otherlv_9= 'uri' ( (lv_rightUri_10_0= RULE_STRING ) ) )
                    // InternalEpatchTestLanguage.g:576:5: otherlv_9= 'uri' ( (lv_rightUri_10_0= RULE_STRING ) )
                    {
                    otherlv_9=(Token)match(input,16,FollowSets000.FOLLOW_9); 

                    					newLeafNode(otherlv_9, grammarAccess.getNamedResourceAccess().getUriKeyword_7_0_0());
                    				
                    // InternalEpatchTestLanguage.g:580:5: ( (lv_rightUri_10_0= RULE_STRING ) )
                    // InternalEpatchTestLanguage.g:581:6: (lv_rightUri_10_0= RULE_STRING )
                    {
                    // InternalEpatchTestLanguage.g:581:6: (lv_rightUri_10_0= RULE_STRING )
                    // InternalEpatchTestLanguage.g:582:7: lv_rightUri_10_0= RULE_STRING
                    {
                    lv_rightUri_10_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_17); 

                    							newLeafNode(lv_rightUri_10_0, grammarAccess.getNamedResourceAccess().getRightUriSTRINGTerminalRuleCall_7_0_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getNamedResourceRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"rightUri",
                    								lv_rightUri_10_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEpatchTestLanguage.g:600:4: ( (lv_rightRoot_11_0= ruleCreatedObject ) )
                    {
                    // InternalEpatchTestLanguage.g:600:4: ( (lv_rightRoot_11_0= ruleCreatedObject ) )
                    // InternalEpatchTestLanguage.g:601:5: (lv_rightRoot_11_0= ruleCreatedObject )
                    {
                    // InternalEpatchTestLanguage.g:601:5: (lv_rightRoot_11_0= ruleCreatedObject )
                    // InternalEpatchTestLanguage.g:602:6: lv_rightRoot_11_0= ruleCreatedObject
                    {

                    						newCompositeNode(grammarAccess.getNamedResourceAccess().getRightRootCreatedObjectParserRuleCall_7_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_17);
                    lv_rightRoot_11_0=ruleCreatedObject();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNamedResourceRule());
                    						}
                    						set(
                    							current,
                    							"rightRoot",
                    							lv_rightRoot_11_0,
                    							"org.eclipse.xtext.parser.epatch.EpatchTestLanguage.CreatedObject");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,24,FollowSets000.FOLLOW_19); 

            			newLeafNode(otherlv_12, grammarAccess.getNamedResourceAccess().getSemicolonKeyword_8());
            		
            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getNamedResourceAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleNamedResource"


    // $ANTLR start "entryRuleObjectRef"
    // InternalEpatchTestLanguage.g:632:1: entryRuleObjectRef returns [EObject current=null] : iv_ruleObjectRef= ruleObjectRef EOF ;
    public final EObject entryRuleObjectRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectRef = null;


        try {
            // InternalEpatchTestLanguage.g:632:50: (iv_ruleObjectRef= ruleObjectRef EOF )
            // InternalEpatchTestLanguage.g:633:2: iv_ruleObjectRef= ruleObjectRef EOF
            {
             newCompositeNode(grammarAccess.getObjectRefRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleObjectRef=ruleObjectRef();

            state._fsp--;

             current =iv_ruleObjectRef; 
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
    // $ANTLR end "entryRuleObjectRef"


    // $ANTLR start "ruleObjectRef"
    // InternalEpatchTestLanguage.g:639:1: ruleObjectRef returns [EObject current=null] : (otherlv_0= 'object' ( (lv_name_1_0= RULE_ID ) )? ( ( ( (otherlv_2= RULE_ID ) ) ( (lv_leftFrag_3_0= RULE_FRAGMENT ) ) ) | (otherlv_4= 'left' ( (otherlv_5= RULE_ID ) ) ( (lv_leftFrag_6_0= RULE_FRAGMENT ) ) otherlv_7= 'right' ( (otherlv_8= RULE_ID ) ) ( (lv_rightFrag_9_0= RULE_FRAGMENT ) ) ) ) (otherlv_10= '{' ( ( (lv_assignments_11_0= ruleBiSingleAssignment ) ) | ( (lv_assignments_12_0= ruleBiListAssignment ) ) )+ (otherlv_13= 'left' ( (lv_leftMig_14_0= ruleMigration ) ) )? (otherlv_15= 'right' ( (lv_rightMig_16_0= ruleMigration ) ) )? otherlv_17= '}' )? ) ;
    public final EObject ruleObjectRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_leftFrag_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_leftFrag_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_rightFrag_9_0=null;
        Token otherlv_10=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        EObject lv_assignments_11_0 = null;

        EObject lv_assignments_12_0 = null;

        EObject lv_leftMig_14_0 = null;

        EObject lv_rightMig_16_0 = null;


        try {
            // InternalEpatchTestLanguage.g:640:1: ( (otherlv_0= 'object' ( (lv_name_1_0= RULE_ID ) )? ( ( ( (otherlv_2= RULE_ID ) ) ( (lv_leftFrag_3_0= RULE_FRAGMENT ) ) ) | (otherlv_4= 'left' ( (otherlv_5= RULE_ID ) ) ( (lv_leftFrag_6_0= RULE_FRAGMENT ) ) otherlv_7= 'right' ( (otherlv_8= RULE_ID ) ) ( (lv_rightFrag_9_0= RULE_FRAGMENT ) ) ) ) (otherlv_10= '{' ( ( (lv_assignments_11_0= ruleBiSingleAssignment ) ) | ( (lv_assignments_12_0= ruleBiListAssignment ) ) )+ (otherlv_13= 'left' ( (lv_leftMig_14_0= ruleMigration ) ) )? (otherlv_15= 'right' ( (lv_rightMig_16_0= ruleMigration ) ) )? otherlv_17= '}' )? ) )
            // InternalEpatchTestLanguage.g:641:2: (otherlv_0= 'object' ( (lv_name_1_0= RULE_ID ) )? ( ( ( (otherlv_2= RULE_ID ) ) ( (lv_leftFrag_3_0= RULE_FRAGMENT ) ) ) | (otherlv_4= 'left' ( (otherlv_5= RULE_ID ) ) ( (lv_leftFrag_6_0= RULE_FRAGMENT ) ) otherlv_7= 'right' ( (otherlv_8= RULE_ID ) ) ( (lv_rightFrag_9_0= RULE_FRAGMENT ) ) ) ) (otherlv_10= '{' ( ( (lv_assignments_11_0= ruleBiSingleAssignment ) ) | ( (lv_assignments_12_0= ruleBiListAssignment ) ) )+ (otherlv_13= 'left' ( (lv_leftMig_14_0= ruleMigration ) ) )? (otherlv_15= 'right' ( (lv_rightMig_16_0= ruleMigration ) ) )? otherlv_17= '}' )? )
            {
            // InternalEpatchTestLanguage.g:641:2: (otherlv_0= 'object' ( (lv_name_1_0= RULE_ID ) )? ( ( ( (otherlv_2= RULE_ID ) ) ( (lv_leftFrag_3_0= RULE_FRAGMENT ) ) ) | (otherlv_4= 'left' ( (otherlv_5= RULE_ID ) ) ( (lv_leftFrag_6_0= RULE_FRAGMENT ) ) otherlv_7= 'right' ( (otherlv_8= RULE_ID ) ) ( (lv_rightFrag_9_0= RULE_FRAGMENT ) ) ) ) (otherlv_10= '{' ( ( (lv_assignments_11_0= ruleBiSingleAssignment ) ) | ( (lv_assignments_12_0= ruleBiListAssignment ) ) )+ (otherlv_13= 'left' ( (lv_leftMig_14_0= ruleMigration ) ) )? (otherlv_15= 'right' ( (lv_rightMig_16_0= ruleMigration ) ) )? otherlv_17= '}' )? )
            // InternalEpatchTestLanguage.g:642:3: otherlv_0= 'object' ( (lv_name_1_0= RULE_ID ) )? ( ( ( (otherlv_2= RULE_ID ) ) ( (lv_leftFrag_3_0= RULE_FRAGMENT ) ) ) | (otherlv_4= 'left' ( (otherlv_5= RULE_ID ) ) ( (lv_leftFrag_6_0= RULE_FRAGMENT ) ) otherlv_7= 'right' ( (otherlv_8= RULE_ID ) ) ( (lv_rightFrag_9_0= RULE_FRAGMENT ) ) ) ) (otherlv_10= '{' ( ( (lv_assignments_11_0= ruleBiSingleAssignment ) ) | ( (lv_assignments_12_0= ruleBiListAssignment ) ) )+ (otherlv_13= 'left' ( (lv_leftMig_14_0= ruleMigration ) ) )? (otherlv_15= 'right' ( (lv_rightMig_16_0= ruleMigration ) ) )? otherlv_17= '}' )?
            {
            otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getObjectRefAccess().getObjectKeyword_0());
            		
            // InternalEpatchTestLanguage.g:646:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==RULE_ID||LA10_1==23) ) {
                    alt10=1;
                }
            }
            switch (alt10) {
                case 1 :
                    // InternalEpatchTestLanguage.g:647:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalEpatchTestLanguage.g:647:4: (lv_name_1_0= RULE_ID )
                    // InternalEpatchTestLanguage.g:648:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_20); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getObjectRefAccess().getNameIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getObjectRefRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            // InternalEpatchTestLanguage.g:664:3: ( ( ( (otherlv_2= RULE_ID ) ) ( (lv_leftFrag_3_0= RULE_FRAGMENT ) ) ) | (otherlv_4= 'left' ( (otherlv_5= RULE_ID ) ) ( (lv_leftFrag_6_0= RULE_FRAGMENT ) ) otherlv_7= 'right' ( (otherlv_8= RULE_ID ) ) ( (lv_rightFrag_9_0= RULE_FRAGMENT ) ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            else if ( (LA11_0==23) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalEpatchTestLanguage.g:665:4: ( ( (otherlv_2= RULE_ID ) ) ( (lv_leftFrag_3_0= RULE_FRAGMENT ) ) )
                    {
                    // InternalEpatchTestLanguage.g:665:4: ( ( (otherlv_2= RULE_ID ) ) ( (lv_leftFrag_3_0= RULE_FRAGMENT ) ) )
                    // InternalEpatchTestLanguage.g:666:5: ( (otherlv_2= RULE_ID ) ) ( (lv_leftFrag_3_0= RULE_FRAGMENT ) )
                    {
                    // InternalEpatchTestLanguage.g:666:5: ( (otherlv_2= RULE_ID ) )
                    // InternalEpatchTestLanguage.g:667:6: (otherlv_2= RULE_ID )
                    {
                    // InternalEpatchTestLanguage.g:667:6: (otherlv_2= RULE_ID )
                    // InternalEpatchTestLanguage.g:668:7: otherlv_2= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getObjectRefRule());
                    							}
                    						
                    otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_21); 

                    							newLeafNode(otherlv_2, grammarAccess.getObjectRefAccess().getLeftResNamedResourceCrossReference_2_0_0_0());
                    						

                    }


                    }

                    // InternalEpatchTestLanguage.g:679:5: ( (lv_leftFrag_3_0= RULE_FRAGMENT ) )
                    // InternalEpatchTestLanguage.g:680:6: (lv_leftFrag_3_0= RULE_FRAGMENT )
                    {
                    // InternalEpatchTestLanguage.g:680:6: (lv_leftFrag_3_0= RULE_FRAGMENT )
                    // InternalEpatchTestLanguage.g:681:7: lv_leftFrag_3_0= RULE_FRAGMENT
                    {
                    lv_leftFrag_3_0=(Token)match(input,RULE_FRAGMENT,FollowSets000.FOLLOW_22); 

                    							newLeafNode(lv_leftFrag_3_0, grammarAccess.getObjectRefAccess().getLeftFragFRAGMENTTerminalRuleCall_2_0_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getObjectRefRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"leftFrag",
                    								lv_leftFrag_3_0,
                    								"org.eclipse.xtext.parser.epatch.EpatchTestLanguage.FRAGMENT");
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEpatchTestLanguage.g:699:4: (otherlv_4= 'left' ( (otherlv_5= RULE_ID ) ) ( (lv_leftFrag_6_0= RULE_FRAGMENT ) ) otherlv_7= 'right' ( (otherlv_8= RULE_ID ) ) ( (lv_rightFrag_9_0= RULE_FRAGMENT ) ) )
                    {
                    // InternalEpatchTestLanguage.g:699:4: (otherlv_4= 'left' ( (otherlv_5= RULE_ID ) ) ( (lv_leftFrag_6_0= RULE_FRAGMENT ) ) otherlv_7= 'right' ( (otherlv_8= RULE_ID ) ) ( (lv_rightFrag_9_0= RULE_FRAGMENT ) ) )
                    // InternalEpatchTestLanguage.g:700:5: otherlv_4= 'left' ( (otherlv_5= RULE_ID ) ) ( (lv_leftFrag_6_0= RULE_FRAGMENT ) ) otherlv_7= 'right' ( (otherlv_8= RULE_ID ) ) ( (lv_rightFrag_9_0= RULE_FRAGMENT ) )
                    {
                    otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_3); 

                    					newLeafNode(otherlv_4, grammarAccess.getObjectRefAccess().getLeftKeyword_2_1_0());
                    				
                    // InternalEpatchTestLanguage.g:704:5: ( (otherlv_5= RULE_ID ) )
                    // InternalEpatchTestLanguage.g:705:6: (otherlv_5= RULE_ID )
                    {
                    // InternalEpatchTestLanguage.g:705:6: (otherlv_5= RULE_ID )
                    // InternalEpatchTestLanguage.g:706:7: otherlv_5= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getObjectRefRule());
                    							}
                    						
                    otherlv_5=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_21); 

                    							newLeafNode(otherlv_5, grammarAccess.getObjectRefAccess().getLeftResNamedResourceCrossReference_2_1_1_0());
                    						

                    }


                    }

                    // InternalEpatchTestLanguage.g:717:5: ( (lv_leftFrag_6_0= RULE_FRAGMENT ) )
                    // InternalEpatchTestLanguage.g:718:6: (lv_leftFrag_6_0= RULE_FRAGMENT )
                    {
                    // InternalEpatchTestLanguage.g:718:6: (lv_leftFrag_6_0= RULE_FRAGMENT )
                    // InternalEpatchTestLanguage.g:719:7: lv_leftFrag_6_0= RULE_FRAGMENT
                    {
                    lv_leftFrag_6_0=(Token)match(input,RULE_FRAGMENT,FollowSets000.FOLLOW_18); 

                    							newLeafNode(lv_leftFrag_6_0, grammarAccess.getObjectRefAccess().getLeftFragFRAGMENTTerminalRuleCall_2_1_2_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getObjectRefRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"leftFrag",
                    								lv_leftFrag_6_0,
                    								"org.eclipse.xtext.parser.epatch.EpatchTestLanguage.FRAGMENT");
                    						

                    }


                    }

                    otherlv_7=(Token)match(input,25,FollowSets000.FOLLOW_3); 

                    					newLeafNode(otherlv_7, grammarAccess.getObjectRefAccess().getRightKeyword_2_1_3());
                    				
                    // InternalEpatchTestLanguage.g:739:5: ( (otherlv_8= RULE_ID ) )
                    // InternalEpatchTestLanguage.g:740:6: (otherlv_8= RULE_ID )
                    {
                    // InternalEpatchTestLanguage.g:740:6: (otherlv_8= RULE_ID )
                    // InternalEpatchTestLanguage.g:741:7: otherlv_8= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getObjectRefRule());
                    							}
                    						
                    otherlv_8=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_21); 

                    							newLeafNode(otherlv_8, grammarAccess.getObjectRefAccess().getRightResNamedResourceCrossReference_2_1_4_0());
                    						

                    }


                    }

                    // InternalEpatchTestLanguage.g:752:5: ( (lv_rightFrag_9_0= RULE_FRAGMENT ) )
                    // InternalEpatchTestLanguage.g:753:6: (lv_rightFrag_9_0= RULE_FRAGMENT )
                    {
                    // InternalEpatchTestLanguage.g:753:6: (lv_rightFrag_9_0= RULE_FRAGMENT )
                    // InternalEpatchTestLanguage.g:754:7: lv_rightFrag_9_0= RULE_FRAGMENT
                    {
                    lv_rightFrag_9_0=(Token)match(input,RULE_FRAGMENT,FollowSets000.FOLLOW_22); 

                    							newLeafNode(lv_rightFrag_9_0, grammarAccess.getObjectRefAccess().getRightFragFRAGMENTTerminalRuleCall_2_1_5_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getObjectRefRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"rightFrag",
                    								lv_rightFrag_9_0,
                    								"org.eclipse.xtext.parser.epatch.EpatchTestLanguage.FRAGMENT");
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalEpatchTestLanguage.g:772:3: (otherlv_10= '{' ( ( (lv_assignments_11_0= ruleBiSingleAssignment ) ) | ( (lv_assignments_12_0= ruleBiListAssignment ) ) )+ (otherlv_13= 'left' ( (lv_leftMig_14_0= ruleMigration ) ) )? (otherlv_15= 'right' ( (lv_rightMig_16_0= ruleMigration ) ) )? otherlv_17= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==13) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalEpatchTestLanguage.g:773:4: otherlv_10= '{' ( ( (lv_assignments_11_0= ruleBiSingleAssignment ) ) | ( (lv_assignments_12_0= ruleBiListAssignment ) ) )+ (otherlv_13= 'left' ( (lv_leftMig_14_0= ruleMigration ) ) )? (otherlv_15= 'right' ( (lv_rightMig_16_0= ruleMigration ) ) )? otherlv_17= '}'
                    {
                    otherlv_10=(Token)match(input,13,FollowSets000.FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getObjectRefAccess().getLeftCurlyBracketKeyword_3_0());
                    			
                    // InternalEpatchTestLanguage.g:777:4: ( ( (lv_assignments_11_0= ruleBiSingleAssignment ) ) | ( (lv_assignments_12_0= ruleBiListAssignment ) ) )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=3;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==RULE_ID) ) {
                            int LA12_2 = input.LA(2);

                            if ( (LA12_2==27) ) {
                                int LA12_3 = input.LA(3);

                                if ( ((LA12_3>=RULE_ID && LA12_3<=RULE_STRING)||(LA12_3>=33 && LA12_3<=35)) ) {
                                    alt12=1;
                                }
                                else if ( (LA12_3==29) ) {
                                    alt12=2;
                                }


                            }


                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalEpatchTestLanguage.g:778:5: ( (lv_assignments_11_0= ruleBiSingleAssignment ) )
                    	    {
                    	    // InternalEpatchTestLanguage.g:778:5: ( (lv_assignments_11_0= ruleBiSingleAssignment ) )
                    	    // InternalEpatchTestLanguage.g:779:6: (lv_assignments_11_0= ruleBiSingleAssignment )
                    	    {
                    	    // InternalEpatchTestLanguage.g:779:6: (lv_assignments_11_0= ruleBiSingleAssignment )
                    	    // InternalEpatchTestLanguage.g:780:7: lv_assignments_11_0= ruleBiSingleAssignment
                    	    {

                    	    							newCompositeNode(grammarAccess.getObjectRefAccess().getAssignmentsBiSingleAssignmentParserRuleCall_3_1_0_0());
                    	    						
                    	    pushFollow(FollowSets000.FOLLOW_23);
                    	    lv_assignments_11_0=ruleBiSingleAssignment();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getObjectRefRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"assignments",
                    	    								lv_assignments_11_0,
                    	    								"org.eclipse.xtext.parser.epatch.EpatchTestLanguage.BiSingleAssignment");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalEpatchTestLanguage.g:798:5: ( (lv_assignments_12_0= ruleBiListAssignment ) )
                    	    {
                    	    // InternalEpatchTestLanguage.g:798:5: ( (lv_assignments_12_0= ruleBiListAssignment ) )
                    	    // InternalEpatchTestLanguage.g:799:6: (lv_assignments_12_0= ruleBiListAssignment )
                    	    {
                    	    // InternalEpatchTestLanguage.g:799:6: (lv_assignments_12_0= ruleBiListAssignment )
                    	    // InternalEpatchTestLanguage.g:800:7: lv_assignments_12_0= ruleBiListAssignment
                    	    {

                    	    							newCompositeNode(grammarAccess.getObjectRefAccess().getAssignmentsBiListAssignmentParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FollowSets000.FOLLOW_23);
                    	    lv_assignments_12_0=ruleBiListAssignment();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getObjectRefRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"assignments",
                    	    								lv_assignments_12_0,
                    	    								"org.eclipse.xtext.parser.epatch.EpatchTestLanguage.BiListAssignment");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt12 >= 1 ) break loop12;
                                EarlyExitException eee =
                                    new EarlyExitException(12, input);
                                throw eee;
                        }
                        cnt12++;
                    } while (true);

                    // InternalEpatchTestLanguage.g:818:4: (otherlv_13= 'left' ( (lv_leftMig_14_0= ruleMigration ) ) )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==23) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalEpatchTestLanguage.g:819:5: otherlv_13= 'left' ( (lv_leftMig_14_0= ruleMigration ) )
                            {
                            otherlv_13=(Token)match(input,23,FollowSets000.FOLLOW_24); 

                            					newLeafNode(otherlv_13, grammarAccess.getObjectRefAccess().getLeftKeyword_3_2_0());
                            				
                            // InternalEpatchTestLanguage.g:823:5: ( (lv_leftMig_14_0= ruleMigration ) )
                            // InternalEpatchTestLanguage.g:824:6: (lv_leftMig_14_0= ruleMigration )
                            {
                            // InternalEpatchTestLanguage.g:824:6: (lv_leftMig_14_0= ruleMigration )
                            // InternalEpatchTestLanguage.g:825:7: lv_leftMig_14_0= ruleMigration
                            {

                            							newCompositeNode(grammarAccess.getObjectRefAccess().getLeftMigMigrationParserRuleCall_3_2_1_0());
                            						
                            pushFollow(FollowSets000.FOLLOW_25);
                            lv_leftMig_14_0=ruleMigration();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getObjectRefRule());
                            							}
                            							set(
                            								current,
                            								"leftMig",
                            								lv_leftMig_14_0,
                            								"org.eclipse.xtext.parser.epatch.EpatchTestLanguage.Migration");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalEpatchTestLanguage.g:843:4: (otherlv_15= 'right' ( (lv_rightMig_16_0= ruleMigration ) ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==25) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalEpatchTestLanguage.g:844:5: otherlv_15= 'right' ( (lv_rightMig_16_0= ruleMigration ) )
                            {
                            otherlv_15=(Token)match(input,25,FollowSets000.FOLLOW_24); 

                            					newLeafNode(otherlv_15, grammarAccess.getObjectRefAccess().getRightKeyword_3_3_0());
                            				
                            // InternalEpatchTestLanguage.g:848:5: ( (lv_rightMig_16_0= ruleMigration ) )
                            // InternalEpatchTestLanguage.g:849:6: (lv_rightMig_16_0= ruleMigration )
                            {
                            // InternalEpatchTestLanguage.g:849:6: (lv_rightMig_16_0= ruleMigration )
                            // InternalEpatchTestLanguage.g:850:7: lv_rightMig_16_0= ruleMigration
                            {

                            							newCompositeNode(grammarAccess.getObjectRefAccess().getRightMigMigrationParserRuleCall_3_3_1_0());
                            						
                            pushFollow(FollowSets000.FOLLOW_19);
                            lv_rightMig_16_0=ruleMigration();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getObjectRefRule());
                            							}
                            							set(
                            								current,
                            								"rightMig",
                            								lv_rightMig_16_0,
                            								"org.eclipse.xtext.parser.epatch.EpatchTestLanguage.Migration");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_2); 

                    				newLeafNode(otherlv_17, grammarAccess.getObjectRefAccess().getRightCurlyBracketKeyword_3_4());
                    			

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
    // $ANTLR end "ruleObjectRef"


    // $ANTLR start "entryRuleBiSingleAssignment"
    // InternalEpatchTestLanguage.g:877:1: entryRuleBiSingleAssignment returns [EObject current=null] : iv_ruleBiSingleAssignment= ruleBiSingleAssignment EOF ;
    public final EObject entryRuleBiSingleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBiSingleAssignment = null;


        try {
            // InternalEpatchTestLanguage.g:877:59: (iv_ruleBiSingleAssignment= ruleBiSingleAssignment EOF )
            // InternalEpatchTestLanguage.g:878:2: iv_ruleBiSingleAssignment= ruleBiSingleAssignment EOF
            {
             newCompositeNode(grammarAccess.getBiSingleAssignmentRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBiSingleAssignment=ruleBiSingleAssignment();

            state._fsp--;

             current =iv_ruleBiSingleAssignment; 
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
    // $ANTLR end "entryRuleBiSingleAssignment"


    // $ANTLR start "ruleBiSingleAssignment"
    // InternalEpatchTestLanguage.g:884:1: ruleBiSingleAssignment returns [EObject current=null] : ( ( (lv_feature_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_leftValue_2_0= ruleSingleAssignmentValue ) ) otherlv_3= '|' ( (lv_rightValue_4_0= ruleSingleAssignmentValue ) ) otherlv_5= ';' ) ;
    public final EObject ruleBiSingleAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_feature_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_leftValue_2_0 = null;

        EObject lv_rightValue_4_0 = null;


        try {
            // InternalEpatchTestLanguage.g:885:1: ( ( ( (lv_feature_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_leftValue_2_0= ruleSingleAssignmentValue ) ) otherlv_3= '|' ( (lv_rightValue_4_0= ruleSingleAssignmentValue ) ) otherlv_5= ';' ) )
            // InternalEpatchTestLanguage.g:886:2: ( ( (lv_feature_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_leftValue_2_0= ruleSingleAssignmentValue ) ) otherlv_3= '|' ( (lv_rightValue_4_0= ruleSingleAssignmentValue ) ) otherlv_5= ';' )
            {
            // InternalEpatchTestLanguage.g:886:2: ( ( (lv_feature_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_leftValue_2_0= ruleSingleAssignmentValue ) ) otherlv_3= '|' ( (lv_rightValue_4_0= ruleSingleAssignmentValue ) ) otherlv_5= ';' )
            // InternalEpatchTestLanguage.g:887:3: ( (lv_feature_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_leftValue_2_0= ruleSingleAssignmentValue ) ) otherlv_3= '|' ( (lv_rightValue_4_0= ruleSingleAssignmentValue ) ) otherlv_5= ';'
            {
            // InternalEpatchTestLanguage.g:887:3: ( (lv_feature_0_0= RULE_ID ) )
            // InternalEpatchTestLanguage.g:888:4: (lv_feature_0_0= RULE_ID )
            {
            // InternalEpatchTestLanguage.g:888:4: (lv_feature_0_0= RULE_ID )
            // InternalEpatchTestLanguage.g:889:5: lv_feature_0_0= RULE_ID
            {
            lv_feature_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_26); 

            					newLeafNode(lv_feature_0_0, grammarAccess.getBiSingleAssignmentAccess().getFeatureIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBiSingleAssignmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"feature",
            						lv_feature_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getBiSingleAssignmentAccess().getEqualsSignKeyword_1());
            		
            // InternalEpatchTestLanguage.g:909:3: ( (lv_leftValue_2_0= ruleSingleAssignmentValue ) )
            // InternalEpatchTestLanguage.g:910:4: (lv_leftValue_2_0= ruleSingleAssignmentValue )
            {
            // InternalEpatchTestLanguage.g:910:4: (lv_leftValue_2_0= ruleSingleAssignmentValue )
            // InternalEpatchTestLanguage.g:911:5: lv_leftValue_2_0= ruleSingleAssignmentValue
            {

            					newCompositeNode(grammarAccess.getBiSingleAssignmentAccess().getLeftValueSingleAssignmentValueParserRuleCall_2_0());
            				
            pushFollow(FollowSets000.FOLLOW_28);
            lv_leftValue_2_0=ruleSingleAssignmentValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBiSingleAssignmentRule());
            					}
            					set(
            						current,
            						"leftValue",
            						lv_leftValue_2_0,
            						"org.eclipse.xtext.parser.epatch.EpatchTestLanguage.SingleAssignmentValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,28,FollowSets000.FOLLOW_27); 

            			newLeafNode(otherlv_3, grammarAccess.getBiSingleAssignmentAccess().getVerticalLineKeyword_3());
            		
            // InternalEpatchTestLanguage.g:932:3: ( (lv_rightValue_4_0= ruleSingleAssignmentValue ) )
            // InternalEpatchTestLanguage.g:933:4: (lv_rightValue_4_0= ruleSingleAssignmentValue )
            {
            // InternalEpatchTestLanguage.g:933:4: (lv_rightValue_4_0= ruleSingleAssignmentValue )
            // InternalEpatchTestLanguage.g:934:5: lv_rightValue_4_0= ruleSingleAssignmentValue
            {

            					newCompositeNode(grammarAccess.getBiSingleAssignmentAccess().getRightValueSingleAssignmentValueParserRuleCall_4_0());
            				
            pushFollow(FollowSets000.FOLLOW_17);
            lv_rightValue_4_0=ruleSingleAssignmentValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBiSingleAssignmentRule());
            					}
            					set(
            						current,
            						"rightValue",
            						lv_rightValue_4_0,
            						"org.eclipse.xtext.parser.epatch.EpatchTestLanguage.SingleAssignmentValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,24,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getBiSingleAssignmentAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "ruleBiSingleAssignment"


    // $ANTLR start "entryRuleBiListAssignment"
    // InternalEpatchTestLanguage.g:959:1: entryRuleBiListAssignment returns [EObject current=null] : iv_ruleBiListAssignment= ruleBiListAssignment EOF ;
    public final EObject entryRuleBiListAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBiListAssignment = null;


        try {
            // InternalEpatchTestLanguage.g:959:57: (iv_ruleBiListAssignment= ruleBiListAssignment EOF )
            // InternalEpatchTestLanguage.g:960:2: iv_ruleBiListAssignment= ruleBiListAssignment EOF
            {
             newCompositeNode(grammarAccess.getBiListAssignmentRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBiListAssignment=ruleBiListAssignment();

            state._fsp--;

             current =iv_ruleBiListAssignment; 
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
    // $ANTLR end "entryRuleBiListAssignment"


    // $ANTLR start "ruleBiListAssignment"
    // InternalEpatchTestLanguage.g:966:1: ruleBiListAssignment returns [EObject current=null] : ( ( (lv_feature_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '[' ( ( (lv_leftValues_3_0= ruleListAssignmentValue ) ) (otherlv_4= ',' ( (lv_leftValues_5_0= ruleListAssignmentValue ) ) )* )? otherlv_6= '|' ( ( (lv_rightValues_7_0= ruleListAssignmentValue ) ) (otherlv_8= ',' ( (lv_rightValues_9_0= ruleListAssignmentValue ) ) )* )? otherlv_10= ']' otherlv_11= ';' ) ;
    public final EObject ruleBiListAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_feature_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_leftValues_3_0 = null;

        EObject lv_leftValues_5_0 = null;

        EObject lv_rightValues_7_0 = null;

        EObject lv_rightValues_9_0 = null;


        try {
            // InternalEpatchTestLanguage.g:967:1: ( ( ( (lv_feature_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '[' ( ( (lv_leftValues_3_0= ruleListAssignmentValue ) ) (otherlv_4= ',' ( (lv_leftValues_5_0= ruleListAssignmentValue ) ) )* )? otherlv_6= '|' ( ( (lv_rightValues_7_0= ruleListAssignmentValue ) ) (otherlv_8= ',' ( (lv_rightValues_9_0= ruleListAssignmentValue ) ) )* )? otherlv_10= ']' otherlv_11= ';' ) )
            // InternalEpatchTestLanguage.g:968:2: ( ( (lv_feature_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '[' ( ( (lv_leftValues_3_0= ruleListAssignmentValue ) ) (otherlv_4= ',' ( (lv_leftValues_5_0= ruleListAssignmentValue ) ) )* )? otherlv_6= '|' ( ( (lv_rightValues_7_0= ruleListAssignmentValue ) ) (otherlv_8= ',' ( (lv_rightValues_9_0= ruleListAssignmentValue ) ) )* )? otherlv_10= ']' otherlv_11= ';' )
            {
            // InternalEpatchTestLanguage.g:968:2: ( ( (lv_feature_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '[' ( ( (lv_leftValues_3_0= ruleListAssignmentValue ) ) (otherlv_4= ',' ( (lv_leftValues_5_0= ruleListAssignmentValue ) ) )* )? otherlv_6= '|' ( ( (lv_rightValues_7_0= ruleListAssignmentValue ) ) (otherlv_8= ',' ( (lv_rightValues_9_0= ruleListAssignmentValue ) ) )* )? otherlv_10= ']' otherlv_11= ';' )
            // InternalEpatchTestLanguage.g:969:3: ( (lv_feature_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '[' ( ( (lv_leftValues_3_0= ruleListAssignmentValue ) ) (otherlv_4= ',' ( (lv_leftValues_5_0= ruleListAssignmentValue ) ) )* )? otherlv_6= '|' ( ( (lv_rightValues_7_0= ruleListAssignmentValue ) ) (otherlv_8= ',' ( (lv_rightValues_9_0= ruleListAssignmentValue ) ) )* )? otherlv_10= ']' otherlv_11= ';'
            {
            // InternalEpatchTestLanguage.g:969:3: ( (lv_feature_0_0= RULE_ID ) )
            // InternalEpatchTestLanguage.g:970:4: (lv_feature_0_0= RULE_ID )
            {
            // InternalEpatchTestLanguage.g:970:4: (lv_feature_0_0= RULE_ID )
            // InternalEpatchTestLanguage.g:971:5: lv_feature_0_0= RULE_ID
            {
            lv_feature_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_26); 

            					newLeafNode(lv_feature_0_0, grammarAccess.getBiListAssignmentAccess().getFeatureIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBiListAssignmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"feature",
            						lv_feature_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getBiListAssignmentAccess().getEqualsSignKeyword_1());
            		
            otherlv_2=(Token)match(input,29,FollowSets000.FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getBiListAssignmentAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalEpatchTestLanguage.g:995:3: ( ( (lv_leftValues_3_0= ruleListAssignmentValue ) ) (otherlv_4= ',' ( (lv_leftValues_5_0= ruleListAssignmentValue ) ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_INT) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalEpatchTestLanguage.g:996:4: ( (lv_leftValues_3_0= ruleListAssignmentValue ) ) (otherlv_4= ',' ( (lv_leftValues_5_0= ruleListAssignmentValue ) ) )*
                    {
                    // InternalEpatchTestLanguage.g:996:4: ( (lv_leftValues_3_0= ruleListAssignmentValue ) )
                    // InternalEpatchTestLanguage.g:997:5: (lv_leftValues_3_0= ruleListAssignmentValue )
                    {
                    // InternalEpatchTestLanguage.g:997:5: (lv_leftValues_3_0= ruleListAssignmentValue )
                    // InternalEpatchTestLanguage.g:998:6: lv_leftValues_3_0= ruleListAssignmentValue
                    {

                    						newCompositeNode(grammarAccess.getBiListAssignmentAccess().getLeftValuesListAssignmentValueParserRuleCall_3_0_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_31);
                    lv_leftValues_3_0=ruleListAssignmentValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBiListAssignmentRule());
                    						}
                    						add(
                    							current,
                    							"leftValues",
                    							lv_leftValues_3_0,
                    							"org.eclipse.xtext.parser.epatch.EpatchTestLanguage.ListAssignmentValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEpatchTestLanguage.g:1015:4: (otherlv_4= ',' ( (lv_leftValues_5_0= ruleListAssignmentValue ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==30) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalEpatchTestLanguage.g:1016:5: otherlv_4= ',' ( (lv_leftValues_5_0= ruleListAssignmentValue ) )
                    	    {
                    	    otherlv_4=(Token)match(input,30,FollowSets000.FOLLOW_32); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getBiListAssignmentAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalEpatchTestLanguage.g:1020:5: ( (lv_leftValues_5_0= ruleListAssignmentValue ) )
                    	    // InternalEpatchTestLanguage.g:1021:6: (lv_leftValues_5_0= ruleListAssignmentValue )
                    	    {
                    	    // InternalEpatchTestLanguage.g:1021:6: (lv_leftValues_5_0= ruleListAssignmentValue )
                    	    // InternalEpatchTestLanguage.g:1022:7: lv_leftValues_5_0= ruleListAssignmentValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getBiListAssignmentAccess().getLeftValuesListAssignmentValueParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FollowSets000.FOLLOW_31);
                    	    lv_leftValues_5_0=ruleListAssignmentValue();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBiListAssignmentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"leftValues",
                    	    								lv_leftValues_5_0,
                    	    								"org.eclipse.xtext.parser.epatch.EpatchTestLanguage.ListAssignmentValue");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,28,FollowSets000.FOLLOW_33); 

            			newLeafNode(otherlv_6, grammarAccess.getBiListAssignmentAccess().getVerticalLineKeyword_4());
            		
            // InternalEpatchTestLanguage.g:1045:3: ( ( (lv_rightValues_7_0= ruleListAssignmentValue ) ) (otherlv_8= ',' ( (lv_rightValues_9_0= ruleListAssignmentValue ) ) )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_INT) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalEpatchTestLanguage.g:1046:4: ( (lv_rightValues_7_0= ruleListAssignmentValue ) ) (otherlv_8= ',' ( (lv_rightValues_9_0= ruleListAssignmentValue ) ) )*
                    {
                    // InternalEpatchTestLanguage.g:1046:4: ( (lv_rightValues_7_0= ruleListAssignmentValue ) )
                    // InternalEpatchTestLanguage.g:1047:5: (lv_rightValues_7_0= ruleListAssignmentValue )
                    {
                    // InternalEpatchTestLanguage.g:1047:5: (lv_rightValues_7_0= ruleListAssignmentValue )
                    // InternalEpatchTestLanguage.g:1048:6: lv_rightValues_7_0= ruleListAssignmentValue
                    {

                    						newCompositeNode(grammarAccess.getBiListAssignmentAccess().getRightValuesListAssignmentValueParserRuleCall_5_0_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_34);
                    lv_rightValues_7_0=ruleListAssignmentValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBiListAssignmentRule());
                    						}
                    						add(
                    							current,
                    							"rightValues",
                    							lv_rightValues_7_0,
                    							"org.eclipse.xtext.parser.epatch.EpatchTestLanguage.ListAssignmentValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEpatchTestLanguage.g:1065:4: (otherlv_8= ',' ( (lv_rightValues_9_0= ruleListAssignmentValue ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==30) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalEpatchTestLanguage.g:1066:5: otherlv_8= ',' ( (lv_rightValues_9_0= ruleListAssignmentValue ) )
                    	    {
                    	    otherlv_8=(Token)match(input,30,FollowSets000.FOLLOW_32); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getBiListAssignmentAccess().getCommaKeyword_5_1_0());
                    	    				
                    	    // InternalEpatchTestLanguage.g:1070:5: ( (lv_rightValues_9_0= ruleListAssignmentValue ) )
                    	    // InternalEpatchTestLanguage.g:1071:6: (lv_rightValues_9_0= ruleListAssignmentValue )
                    	    {
                    	    // InternalEpatchTestLanguage.g:1071:6: (lv_rightValues_9_0= ruleListAssignmentValue )
                    	    // InternalEpatchTestLanguage.g:1072:7: lv_rightValues_9_0= ruleListAssignmentValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getBiListAssignmentAccess().getRightValuesListAssignmentValueParserRuleCall_5_1_1_0());
                    	    						
                    	    pushFollow(FollowSets000.FOLLOW_34);
                    	    lv_rightValues_9_0=ruleListAssignmentValue();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBiListAssignmentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"rightValues",
                    	    								lv_rightValues_9_0,
                    	    								"org.eclipse.xtext.parser.epatch.EpatchTestLanguage.ListAssignmentValue");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,31,FollowSets000.FOLLOW_17); 

            			newLeafNode(otherlv_10, grammarAccess.getBiListAssignmentAccess().getRightSquareBracketKeyword_6());
            		
            otherlv_11=(Token)match(input,24,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getBiListAssignmentAccess().getSemicolonKeyword_7());
            		

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
    // $ANTLR end "ruleBiListAssignment"


    // $ANTLR start "entryRuleMonoSingleAssignment"
    // InternalEpatchTestLanguage.g:1103:1: entryRuleMonoSingleAssignment returns [EObject current=null] : iv_ruleMonoSingleAssignment= ruleMonoSingleAssignment EOF ;
    public final EObject entryRuleMonoSingleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMonoSingleAssignment = null;


        try {
            // InternalEpatchTestLanguage.g:1103:61: (iv_ruleMonoSingleAssignment= ruleMonoSingleAssignment EOF )
            // InternalEpatchTestLanguage.g:1104:2: iv_ruleMonoSingleAssignment= ruleMonoSingleAssignment EOF
            {
             newCompositeNode(grammarAccess.getMonoSingleAssignmentRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMonoSingleAssignment=ruleMonoSingleAssignment();

            state._fsp--;

             current =iv_ruleMonoSingleAssignment; 
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
    // $ANTLR end "entryRuleMonoSingleAssignment"


    // $ANTLR start "ruleMonoSingleAssignment"
    // InternalEpatchTestLanguage.g:1110:1: ruleMonoSingleAssignment returns [EObject current=null] : ( ( (lv_feature_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_leftValue_2_0= ruleSingleAssignmentValue ) ) otherlv_3= ';' ) ;
    public final EObject ruleMonoSingleAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_feature_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_leftValue_2_0 = null;


        try {
            // InternalEpatchTestLanguage.g:1111:1: ( ( ( (lv_feature_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_leftValue_2_0= ruleSingleAssignmentValue ) ) otherlv_3= ';' ) )
            // InternalEpatchTestLanguage.g:1112:2: ( ( (lv_feature_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_leftValue_2_0= ruleSingleAssignmentValue ) ) otherlv_3= ';' )
            {
            // InternalEpatchTestLanguage.g:1112:2: ( ( (lv_feature_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_leftValue_2_0= ruleSingleAssignmentValue ) ) otherlv_3= ';' )
            // InternalEpatchTestLanguage.g:1113:3: ( (lv_feature_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_leftValue_2_0= ruleSingleAssignmentValue ) ) otherlv_3= ';'
            {
            // InternalEpatchTestLanguage.g:1113:3: ( (lv_feature_0_0= RULE_ID ) )
            // InternalEpatchTestLanguage.g:1114:4: (lv_feature_0_0= RULE_ID )
            {
            // InternalEpatchTestLanguage.g:1114:4: (lv_feature_0_0= RULE_ID )
            // InternalEpatchTestLanguage.g:1115:5: lv_feature_0_0= RULE_ID
            {
            lv_feature_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_26); 

            					newLeafNode(lv_feature_0_0, grammarAccess.getMonoSingleAssignmentAccess().getFeatureIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMonoSingleAssignmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"feature",
            						lv_feature_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getMonoSingleAssignmentAccess().getEqualsSignKeyword_1());
            		
            // InternalEpatchTestLanguage.g:1135:3: ( (lv_leftValue_2_0= ruleSingleAssignmentValue ) )
            // InternalEpatchTestLanguage.g:1136:4: (lv_leftValue_2_0= ruleSingleAssignmentValue )
            {
            // InternalEpatchTestLanguage.g:1136:4: (lv_leftValue_2_0= ruleSingleAssignmentValue )
            // InternalEpatchTestLanguage.g:1137:5: lv_leftValue_2_0= ruleSingleAssignmentValue
            {

            					newCompositeNode(grammarAccess.getMonoSingleAssignmentAccess().getLeftValueSingleAssignmentValueParserRuleCall_2_0());
            				
            pushFollow(FollowSets000.FOLLOW_17);
            lv_leftValue_2_0=ruleSingleAssignmentValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMonoSingleAssignmentRule());
            					}
            					set(
            						current,
            						"leftValue",
            						lv_leftValue_2_0,
            						"org.eclipse.xtext.parser.epatch.EpatchTestLanguage.SingleAssignmentValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,24,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getMonoSingleAssignmentAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleMonoSingleAssignment"


    // $ANTLR start "entryRuleMonoListAssignment"
    // InternalEpatchTestLanguage.g:1162:1: entryRuleMonoListAssignment returns [EObject current=null] : iv_ruleMonoListAssignment= ruleMonoListAssignment EOF ;
    public final EObject entryRuleMonoListAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMonoListAssignment = null;


        try {
            // InternalEpatchTestLanguage.g:1162:59: (iv_ruleMonoListAssignment= ruleMonoListAssignment EOF )
            // InternalEpatchTestLanguage.g:1163:2: iv_ruleMonoListAssignment= ruleMonoListAssignment EOF
            {
             newCompositeNode(grammarAccess.getMonoListAssignmentRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMonoListAssignment=ruleMonoListAssignment();

            state._fsp--;

             current =iv_ruleMonoListAssignment; 
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
    // $ANTLR end "entryRuleMonoListAssignment"


    // $ANTLR start "ruleMonoListAssignment"
    // InternalEpatchTestLanguage.g:1169:1: ruleMonoListAssignment returns [EObject current=null] : ( ( (lv_feature_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '[' ( ( (lv_leftValues_3_0= ruleAssignmentValue ) ) (otherlv_4= ',' ( (lv_leftValues_5_0= ruleAssignmentValue ) ) )* )? otherlv_6= ']' otherlv_7= ';' ) ;
    public final EObject ruleMonoListAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_feature_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_leftValues_3_0 = null;

        EObject lv_leftValues_5_0 = null;


        try {
            // InternalEpatchTestLanguage.g:1170:1: ( ( ( (lv_feature_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '[' ( ( (lv_leftValues_3_0= ruleAssignmentValue ) ) (otherlv_4= ',' ( (lv_leftValues_5_0= ruleAssignmentValue ) ) )* )? otherlv_6= ']' otherlv_7= ';' ) )
            // InternalEpatchTestLanguage.g:1171:2: ( ( (lv_feature_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '[' ( ( (lv_leftValues_3_0= ruleAssignmentValue ) ) (otherlv_4= ',' ( (lv_leftValues_5_0= ruleAssignmentValue ) ) )* )? otherlv_6= ']' otherlv_7= ';' )
            {
            // InternalEpatchTestLanguage.g:1171:2: ( ( (lv_feature_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '[' ( ( (lv_leftValues_3_0= ruleAssignmentValue ) ) (otherlv_4= ',' ( (lv_leftValues_5_0= ruleAssignmentValue ) ) )* )? otherlv_6= ']' otherlv_7= ';' )
            // InternalEpatchTestLanguage.g:1172:3: ( (lv_feature_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '[' ( ( (lv_leftValues_3_0= ruleAssignmentValue ) ) (otherlv_4= ',' ( (lv_leftValues_5_0= ruleAssignmentValue ) ) )* )? otherlv_6= ']' otherlv_7= ';'
            {
            // InternalEpatchTestLanguage.g:1172:3: ( (lv_feature_0_0= RULE_ID ) )
            // InternalEpatchTestLanguage.g:1173:4: (lv_feature_0_0= RULE_ID )
            {
            // InternalEpatchTestLanguage.g:1173:4: (lv_feature_0_0= RULE_ID )
            // InternalEpatchTestLanguage.g:1174:5: lv_feature_0_0= RULE_ID
            {
            lv_feature_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_26); 

            					newLeafNode(lv_feature_0_0, grammarAccess.getMonoListAssignmentAccess().getFeatureIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMonoListAssignmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"feature",
            						lv_feature_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getMonoListAssignmentAccess().getEqualsSignKeyword_1());
            		
            otherlv_2=(Token)match(input,29,FollowSets000.FOLLOW_35); 

            			newLeafNode(otherlv_2, grammarAccess.getMonoListAssignmentAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalEpatchTestLanguage.g:1198:3: ( ( (lv_leftValues_3_0= ruleAssignmentValue ) ) (otherlv_4= ',' ( (lv_leftValues_5_0= ruleAssignmentValue ) ) )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=RULE_ID && LA21_0<=RULE_STRING)||(LA21_0>=34 && LA21_0<=35)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalEpatchTestLanguage.g:1199:4: ( (lv_leftValues_3_0= ruleAssignmentValue ) ) (otherlv_4= ',' ( (lv_leftValues_5_0= ruleAssignmentValue ) ) )*
                    {
                    // InternalEpatchTestLanguage.g:1199:4: ( (lv_leftValues_3_0= ruleAssignmentValue ) )
                    // InternalEpatchTestLanguage.g:1200:5: (lv_leftValues_3_0= ruleAssignmentValue )
                    {
                    // InternalEpatchTestLanguage.g:1200:5: (lv_leftValues_3_0= ruleAssignmentValue )
                    // InternalEpatchTestLanguage.g:1201:6: lv_leftValues_3_0= ruleAssignmentValue
                    {

                    						newCompositeNode(grammarAccess.getMonoListAssignmentAccess().getLeftValuesAssignmentValueParserRuleCall_3_0_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_34);
                    lv_leftValues_3_0=ruleAssignmentValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMonoListAssignmentRule());
                    						}
                    						add(
                    							current,
                    							"leftValues",
                    							lv_leftValues_3_0,
                    							"org.eclipse.xtext.parser.epatch.EpatchTestLanguage.AssignmentValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEpatchTestLanguage.g:1218:4: (otherlv_4= ',' ( (lv_leftValues_5_0= ruleAssignmentValue ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==30) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalEpatchTestLanguage.g:1219:5: otherlv_4= ',' ( (lv_leftValues_5_0= ruleAssignmentValue ) )
                    	    {
                    	    otherlv_4=(Token)match(input,30,FollowSets000.FOLLOW_36); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getMonoListAssignmentAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalEpatchTestLanguage.g:1223:5: ( (lv_leftValues_5_0= ruleAssignmentValue ) )
                    	    // InternalEpatchTestLanguage.g:1224:6: (lv_leftValues_5_0= ruleAssignmentValue )
                    	    {
                    	    // InternalEpatchTestLanguage.g:1224:6: (lv_leftValues_5_0= ruleAssignmentValue )
                    	    // InternalEpatchTestLanguage.g:1225:7: lv_leftValues_5_0= ruleAssignmentValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getMonoListAssignmentAccess().getLeftValuesAssignmentValueParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FollowSets000.FOLLOW_34);
                    	    lv_leftValues_5_0=ruleAssignmentValue();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMonoListAssignmentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"leftValues",
                    	    								lv_leftValues_5_0,
                    	    								"org.eclipse.xtext.parser.epatch.EpatchTestLanguage.AssignmentValue");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,31,FollowSets000.FOLLOW_17); 

            			newLeafNode(otherlv_6, grammarAccess.getMonoListAssignmentAccess().getRightSquareBracketKeyword_4());
            		
            otherlv_7=(Token)match(input,24,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getMonoListAssignmentAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "ruleMonoListAssignment"


    // $ANTLR start "entryRuleAssignmentValue"
    // InternalEpatchTestLanguage.g:1256:1: entryRuleAssignmentValue returns [EObject current=null] : iv_ruleAssignmentValue= ruleAssignmentValue EOF ;
    public final EObject entryRuleAssignmentValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignmentValue = null;


        try {
            // InternalEpatchTestLanguage.g:1256:56: (iv_ruleAssignmentValue= ruleAssignmentValue EOF )
            // InternalEpatchTestLanguage.g:1257:2: iv_ruleAssignmentValue= ruleAssignmentValue EOF
            {
             newCompositeNode(grammarAccess.getAssignmentValueRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAssignmentValue=ruleAssignmentValue();

            state._fsp--;

             current =iv_ruleAssignmentValue; 
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
    // $ANTLR end "entryRuleAssignmentValue"


    // $ANTLR start "ruleAssignmentValue"
    // InternalEpatchTestLanguage.g:1263:1: ruleAssignmentValue returns [EObject current=null] : ( ( (lv_value_0_0= RULE_STRING ) ) | ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= '.' ( (lv_refFeature_3_0= RULE_ID ) ) (otherlv_4= '[' ( (lv_refIndex_5_0= RULE_INT ) ) otherlv_6= ']' )? )? ) | ( (lv_newObject_7_0= ruleCreatedObject ) ) | ( ( (otherlv_8= RULE_ID ) ) ( (lv_impFrag_9_0= RULE_FRAGMENT ) ) ) ) ;
    public final EObject ruleAssignmentValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_refFeature_3_0=null;
        Token otherlv_4=null;
        Token lv_refIndex_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_impFrag_9_0=null;
        EObject lv_newObject_7_0 = null;


        try {
            // InternalEpatchTestLanguage.g:1264:1: ( ( ( (lv_value_0_0= RULE_STRING ) ) | ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= '.' ( (lv_refFeature_3_0= RULE_ID ) ) (otherlv_4= '[' ( (lv_refIndex_5_0= RULE_INT ) ) otherlv_6= ']' )? )? ) | ( (lv_newObject_7_0= ruleCreatedObject ) ) | ( ( (otherlv_8= RULE_ID ) ) ( (lv_impFrag_9_0= RULE_FRAGMENT ) ) ) ) )
            // InternalEpatchTestLanguage.g:1265:2: ( ( (lv_value_0_0= RULE_STRING ) ) | ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= '.' ( (lv_refFeature_3_0= RULE_ID ) ) (otherlv_4= '[' ( (lv_refIndex_5_0= RULE_INT ) ) otherlv_6= ']' )? )? ) | ( (lv_newObject_7_0= ruleCreatedObject ) ) | ( ( (otherlv_8= RULE_ID ) ) ( (lv_impFrag_9_0= RULE_FRAGMENT ) ) ) )
            {
            // InternalEpatchTestLanguage.g:1265:2: ( ( (lv_value_0_0= RULE_STRING ) ) | ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= '.' ( (lv_refFeature_3_0= RULE_ID ) ) (otherlv_4= '[' ( (lv_refIndex_5_0= RULE_INT ) ) otherlv_6= ']' )? )? ) | ( (lv_newObject_7_0= ruleCreatedObject ) ) | ( ( (otherlv_8= RULE_ID ) ) ( (lv_impFrag_9_0= RULE_FRAGMENT ) ) ) )
            int alt24=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt24=1;
                }
                break;
            case RULE_ID:
                {
                int LA24_2 = input.LA(2);

                if ( (LA24_2==RULE_FRAGMENT) ) {
                    alt24=4;
                }
                else if ( (LA24_2==EOF||LA24_2==19||(LA24_2>=30 && LA24_2<=31)) ) {
                    alt24=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 2, input);

                    throw nvae;
                }
                }
                break;
            case 34:
            case 35:
                {
                alt24=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalEpatchTestLanguage.g:1266:3: ( (lv_value_0_0= RULE_STRING ) )
                    {
                    // InternalEpatchTestLanguage.g:1266:3: ( (lv_value_0_0= RULE_STRING ) )
                    // InternalEpatchTestLanguage.g:1267:4: (lv_value_0_0= RULE_STRING )
                    {
                    // InternalEpatchTestLanguage.g:1267:4: (lv_value_0_0= RULE_STRING )
                    // InternalEpatchTestLanguage.g:1268:5: lv_value_0_0= RULE_STRING
                    {
                    lv_value_0_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); 

                    					newLeafNode(lv_value_0_0, grammarAccess.getAssignmentValueAccess().getValueSTRINGTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAssignmentValueRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"value",
                    						lv_value_0_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEpatchTestLanguage.g:1285:3: ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= '.' ( (lv_refFeature_3_0= RULE_ID ) ) (otherlv_4= '[' ( (lv_refIndex_5_0= RULE_INT ) ) otherlv_6= ']' )? )? )
                    {
                    // InternalEpatchTestLanguage.g:1285:3: ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= '.' ( (lv_refFeature_3_0= RULE_ID ) ) (otherlv_4= '[' ( (lv_refIndex_5_0= RULE_INT ) ) otherlv_6= ']' )? )? )
                    // InternalEpatchTestLanguage.g:1286:4: ( (otherlv_1= RULE_ID ) ) (otherlv_2= '.' ( (lv_refFeature_3_0= RULE_ID ) ) (otherlv_4= '[' ( (lv_refIndex_5_0= RULE_INT ) ) otherlv_6= ']' )? )?
                    {
                    // InternalEpatchTestLanguage.g:1286:4: ( (otherlv_1= RULE_ID ) )
                    // InternalEpatchTestLanguage.g:1287:5: (otherlv_1= RULE_ID )
                    {
                    // InternalEpatchTestLanguage.g:1287:5: (otherlv_1= RULE_ID )
                    // InternalEpatchTestLanguage.g:1288:6: otherlv_1= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAssignmentValueRule());
                    						}
                    					
                    otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_12); 

                    						newLeafNode(otherlv_1, grammarAccess.getAssignmentValueAccess().getRefObjectNamedObjectCrossReference_1_0_0());
                    					

                    }


                    }

                    // InternalEpatchTestLanguage.g:1299:4: (otherlv_2= '.' ( (lv_refFeature_3_0= RULE_ID ) ) (otherlv_4= '[' ( (lv_refIndex_5_0= RULE_INT ) ) otherlv_6= ']' )? )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==19) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalEpatchTestLanguage.g:1300:5: otherlv_2= '.' ( (lv_refFeature_3_0= RULE_ID ) ) (otherlv_4= '[' ( (lv_refIndex_5_0= RULE_INT ) ) otherlv_6= ']' )?
                            {
                            otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_3); 

                            					newLeafNode(otherlv_2, grammarAccess.getAssignmentValueAccess().getFullStopKeyword_1_1_0());
                            				
                            // InternalEpatchTestLanguage.g:1304:5: ( (lv_refFeature_3_0= RULE_ID ) )
                            // InternalEpatchTestLanguage.g:1305:6: (lv_refFeature_3_0= RULE_ID )
                            {
                            // InternalEpatchTestLanguage.g:1305:6: (lv_refFeature_3_0= RULE_ID )
                            // InternalEpatchTestLanguage.g:1306:7: lv_refFeature_3_0= RULE_ID
                            {
                            lv_refFeature_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_37); 

                            							newLeafNode(lv_refFeature_3_0, grammarAccess.getAssignmentValueAccess().getRefFeatureIDTerminalRuleCall_1_1_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getAssignmentValueRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"refFeature",
                            								lv_refFeature_3_0,
                            								"org.eclipse.xtext.common.Terminals.ID");
                            						

                            }


                            }

                            // InternalEpatchTestLanguage.g:1322:5: (otherlv_4= '[' ( (lv_refIndex_5_0= RULE_INT ) ) otherlv_6= ']' )?
                            int alt22=2;
                            int LA22_0 = input.LA(1);

                            if ( (LA22_0==29) ) {
                                alt22=1;
                            }
                            switch (alt22) {
                                case 1 :
                                    // InternalEpatchTestLanguage.g:1323:6: otherlv_4= '[' ( (lv_refIndex_5_0= RULE_INT ) ) otherlv_6= ']'
                                    {
                                    otherlv_4=(Token)match(input,29,FollowSets000.FOLLOW_32); 

                                    						newLeafNode(otherlv_4, grammarAccess.getAssignmentValueAccess().getLeftSquareBracketKeyword_1_1_2_0());
                                    					
                                    // InternalEpatchTestLanguage.g:1327:6: ( (lv_refIndex_5_0= RULE_INT ) )
                                    // InternalEpatchTestLanguage.g:1328:7: (lv_refIndex_5_0= RULE_INT )
                                    {
                                    // InternalEpatchTestLanguage.g:1328:7: (lv_refIndex_5_0= RULE_INT )
                                    // InternalEpatchTestLanguage.g:1329:8: lv_refIndex_5_0= RULE_INT
                                    {
                                    lv_refIndex_5_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_38); 

                                    								newLeafNode(lv_refIndex_5_0, grammarAccess.getAssignmentValueAccess().getRefIndexINTTerminalRuleCall_1_1_2_1_0());
                                    							

                                    								if (current==null) {
                                    									current = createModelElement(grammarAccess.getAssignmentValueRule());
                                    								}
                                    								setWithLastConsumed(
                                    									current,
                                    									"refIndex",
                                    									lv_refIndex_5_0,
                                    									"org.eclipse.xtext.common.Terminals.INT");
                                    							

                                    }


                                    }

                                    otherlv_6=(Token)match(input,31,FollowSets000.FOLLOW_2); 

                                    						newLeafNode(otherlv_6, grammarAccess.getAssignmentValueAccess().getRightSquareBracketKeyword_1_1_2_2());
                                    					

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalEpatchTestLanguage.g:1353:3: ( (lv_newObject_7_0= ruleCreatedObject ) )
                    {
                    // InternalEpatchTestLanguage.g:1353:3: ( (lv_newObject_7_0= ruleCreatedObject ) )
                    // InternalEpatchTestLanguage.g:1354:4: (lv_newObject_7_0= ruleCreatedObject )
                    {
                    // InternalEpatchTestLanguage.g:1354:4: (lv_newObject_7_0= ruleCreatedObject )
                    // InternalEpatchTestLanguage.g:1355:5: lv_newObject_7_0= ruleCreatedObject
                    {

                    					newCompositeNode(grammarAccess.getAssignmentValueAccess().getNewObjectCreatedObjectParserRuleCall_2_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_newObject_7_0=ruleCreatedObject();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAssignmentValueRule());
                    					}
                    					set(
                    						current,
                    						"newObject",
                    						lv_newObject_7_0,
                    						"org.eclipse.xtext.parser.epatch.EpatchTestLanguage.CreatedObject");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalEpatchTestLanguage.g:1373:3: ( ( (otherlv_8= RULE_ID ) ) ( (lv_impFrag_9_0= RULE_FRAGMENT ) ) )
                    {
                    // InternalEpatchTestLanguage.g:1373:3: ( ( (otherlv_8= RULE_ID ) ) ( (lv_impFrag_9_0= RULE_FRAGMENT ) ) )
                    // InternalEpatchTestLanguage.g:1374:4: ( (otherlv_8= RULE_ID ) ) ( (lv_impFrag_9_0= RULE_FRAGMENT ) )
                    {
                    // InternalEpatchTestLanguage.g:1374:4: ( (otherlv_8= RULE_ID ) )
                    // InternalEpatchTestLanguage.g:1375:5: (otherlv_8= RULE_ID )
                    {
                    // InternalEpatchTestLanguage.g:1375:5: (otherlv_8= RULE_ID )
                    // InternalEpatchTestLanguage.g:1376:6: otherlv_8= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAssignmentValueRule());
                    						}
                    					
                    otherlv_8=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_21); 

                    						newLeafNode(otherlv_8, grammarAccess.getAssignmentValueAccess().getImportImportCrossReference_3_0_0());
                    					

                    }


                    }

                    // InternalEpatchTestLanguage.g:1387:4: ( (lv_impFrag_9_0= RULE_FRAGMENT ) )
                    // InternalEpatchTestLanguage.g:1388:5: (lv_impFrag_9_0= RULE_FRAGMENT )
                    {
                    // InternalEpatchTestLanguage.g:1388:5: (lv_impFrag_9_0= RULE_FRAGMENT )
                    // InternalEpatchTestLanguage.g:1389:6: lv_impFrag_9_0= RULE_FRAGMENT
                    {
                    lv_impFrag_9_0=(Token)match(input,RULE_FRAGMENT,FollowSets000.FOLLOW_2); 

                    						newLeafNode(lv_impFrag_9_0, grammarAccess.getAssignmentValueAccess().getImpFragFRAGMENTTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAssignmentValueRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"impFrag",
                    							lv_impFrag_9_0,
                    							"org.eclipse.xtext.parser.epatch.EpatchTestLanguage.FRAGMENT");
                    					

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
    // $ANTLR end "ruleAssignmentValue"


    // $ANTLR start "entryRuleListAssignmentValue"
    // InternalEpatchTestLanguage.g:1410:1: entryRuleListAssignmentValue returns [EObject current=null] : iv_ruleListAssignmentValue= ruleListAssignmentValue EOF ;
    public final EObject entryRuleListAssignmentValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListAssignmentValue = null;


        try {
            // InternalEpatchTestLanguage.g:1410:60: (iv_ruleListAssignmentValue= ruleListAssignmentValue EOF )
            // InternalEpatchTestLanguage.g:1411:2: iv_ruleListAssignmentValue= ruleListAssignmentValue EOF
            {
             newCompositeNode(grammarAccess.getListAssignmentValueRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleListAssignmentValue=ruleListAssignmentValue();

            state._fsp--;

             current =iv_ruleListAssignmentValue; 
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
    // $ANTLR end "entryRuleListAssignmentValue"


    // $ANTLR start "ruleListAssignmentValue"
    // InternalEpatchTestLanguage.g:1417:1: ruleListAssignmentValue returns [EObject current=null] : ( ( (lv_index_0_0= RULE_INT ) ) otherlv_1= ':' ( (otherlv_2= '[' ( (lv_refIndex_3_0= RULE_INT ) ) otherlv_4= ']' ) | ( (lv_value_5_0= RULE_STRING ) ) | ( ( (otherlv_6= RULE_ID ) ) (otherlv_7= '.' ( (lv_refFeature_8_0= RULE_ID ) ) (otherlv_9= '[' ( (lv_refIndex_10_0= RULE_INT ) ) otherlv_11= ']' )? )? ) | ( (lv_newObject_12_0= ruleCreatedObject ) ) | ( ( (otherlv_13= RULE_ID ) ) ( (lv_impFrag_14_0= RULE_FRAGMENT ) ) ) ) ) ;
    public final EObject ruleListAssignmentValue() throws RecognitionException {
        EObject current = null;

        Token lv_index_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_refIndex_3_0=null;
        Token otherlv_4=null;
        Token lv_value_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_refFeature_8_0=null;
        Token otherlv_9=null;
        Token lv_refIndex_10_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token lv_impFrag_14_0=null;
        EObject lv_newObject_12_0 = null;


        try {
            // InternalEpatchTestLanguage.g:1418:1: ( ( ( (lv_index_0_0= RULE_INT ) ) otherlv_1= ':' ( (otherlv_2= '[' ( (lv_refIndex_3_0= RULE_INT ) ) otherlv_4= ']' ) | ( (lv_value_5_0= RULE_STRING ) ) | ( ( (otherlv_6= RULE_ID ) ) (otherlv_7= '.' ( (lv_refFeature_8_0= RULE_ID ) ) (otherlv_9= '[' ( (lv_refIndex_10_0= RULE_INT ) ) otherlv_11= ']' )? )? ) | ( (lv_newObject_12_0= ruleCreatedObject ) ) | ( ( (otherlv_13= RULE_ID ) ) ( (lv_impFrag_14_0= RULE_FRAGMENT ) ) ) ) ) )
            // InternalEpatchTestLanguage.g:1419:2: ( ( (lv_index_0_0= RULE_INT ) ) otherlv_1= ':' ( (otherlv_2= '[' ( (lv_refIndex_3_0= RULE_INT ) ) otherlv_4= ']' ) | ( (lv_value_5_0= RULE_STRING ) ) | ( ( (otherlv_6= RULE_ID ) ) (otherlv_7= '.' ( (lv_refFeature_8_0= RULE_ID ) ) (otherlv_9= '[' ( (lv_refIndex_10_0= RULE_INT ) ) otherlv_11= ']' )? )? ) | ( (lv_newObject_12_0= ruleCreatedObject ) ) | ( ( (otherlv_13= RULE_ID ) ) ( (lv_impFrag_14_0= RULE_FRAGMENT ) ) ) ) )
            {
            // InternalEpatchTestLanguage.g:1419:2: ( ( (lv_index_0_0= RULE_INT ) ) otherlv_1= ':' ( (otherlv_2= '[' ( (lv_refIndex_3_0= RULE_INT ) ) otherlv_4= ']' ) | ( (lv_value_5_0= RULE_STRING ) ) | ( ( (otherlv_6= RULE_ID ) ) (otherlv_7= '.' ( (lv_refFeature_8_0= RULE_ID ) ) (otherlv_9= '[' ( (lv_refIndex_10_0= RULE_INT ) ) otherlv_11= ']' )? )? ) | ( (lv_newObject_12_0= ruleCreatedObject ) ) | ( ( (otherlv_13= RULE_ID ) ) ( (lv_impFrag_14_0= RULE_FRAGMENT ) ) ) ) )
            // InternalEpatchTestLanguage.g:1420:3: ( (lv_index_0_0= RULE_INT ) ) otherlv_1= ':' ( (otherlv_2= '[' ( (lv_refIndex_3_0= RULE_INT ) ) otherlv_4= ']' ) | ( (lv_value_5_0= RULE_STRING ) ) | ( ( (otherlv_6= RULE_ID ) ) (otherlv_7= '.' ( (lv_refFeature_8_0= RULE_ID ) ) (otherlv_9= '[' ( (lv_refIndex_10_0= RULE_INT ) ) otherlv_11= ']' )? )? ) | ( (lv_newObject_12_0= ruleCreatedObject ) ) | ( ( (otherlv_13= RULE_ID ) ) ( (lv_impFrag_14_0= RULE_FRAGMENT ) ) ) )
            {
            // InternalEpatchTestLanguage.g:1420:3: ( (lv_index_0_0= RULE_INT ) )
            // InternalEpatchTestLanguage.g:1421:4: (lv_index_0_0= RULE_INT )
            {
            // InternalEpatchTestLanguage.g:1421:4: (lv_index_0_0= RULE_INT )
            // InternalEpatchTestLanguage.g:1422:5: lv_index_0_0= RULE_INT
            {
            lv_index_0_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_39); 

            					newLeafNode(lv_index_0_0, grammarAccess.getListAssignmentValueAccess().getIndexINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getListAssignmentValueRule());
            					}
            					setWithLastConsumed(
            						current,
            						"index",
            						lv_index_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_1=(Token)match(input,32,FollowSets000.FOLLOW_40); 

            			newLeafNode(otherlv_1, grammarAccess.getListAssignmentValueAccess().getColonKeyword_1());
            		
            // InternalEpatchTestLanguage.g:1442:3: ( (otherlv_2= '[' ( (lv_refIndex_3_0= RULE_INT ) ) otherlv_4= ']' ) | ( (lv_value_5_0= RULE_STRING ) ) | ( ( (otherlv_6= RULE_ID ) ) (otherlv_7= '.' ( (lv_refFeature_8_0= RULE_ID ) ) (otherlv_9= '[' ( (lv_refIndex_10_0= RULE_INT ) ) otherlv_11= ']' )? )? ) | ( (lv_newObject_12_0= ruleCreatedObject ) ) | ( ( (otherlv_13= RULE_ID ) ) ( (lv_impFrag_14_0= RULE_FRAGMENT ) ) ) )
            int alt27=5;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt27=1;
                }
                break;
            case RULE_STRING:
                {
                alt27=2;
                }
                break;
            case RULE_ID:
                {
                int LA27_3 = input.LA(2);

                if ( (LA27_3==EOF||LA27_3==19||LA27_3==28||(LA27_3>=30 && LA27_3<=31)) ) {
                    alt27=3;
                }
                else if ( (LA27_3==RULE_FRAGMENT) ) {
                    alt27=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 3, input);

                    throw nvae;
                }
                }
                break;
            case 34:
            case 35:
                {
                alt27=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalEpatchTestLanguage.g:1443:4: (otherlv_2= '[' ( (lv_refIndex_3_0= RULE_INT ) ) otherlv_4= ']' )
                    {
                    // InternalEpatchTestLanguage.g:1443:4: (otherlv_2= '[' ( (lv_refIndex_3_0= RULE_INT ) ) otherlv_4= ']' )
                    // InternalEpatchTestLanguage.g:1444:5: otherlv_2= '[' ( (lv_refIndex_3_0= RULE_INT ) ) otherlv_4= ']'
                    {
                    otherlv_2=(Token)match(input,29,FollowSets000.FOLLOW_32); 

                    					newLeafNode(otherlv_2, grammarAccess.getListAssignmentValueAccess().getLeftSquareBracketKeyword_2_0_0());
                    				
                    // InternalEpatchTestLanguage.g:1448:5: ( (lv_refIndex_3_0= RULE_INT ) )
                    // InternalEpatchTestLanguage.g:1449:6: (lv_refIndex_3_0= RULE_INT )
                    {
                    // InternalEpatchTestLanguage.g:1449:6: (lv_refIndex_3_0= RULE_INT )
                    // InternalEpatchTestLanguage.g:1450:7: lv_refIndex_3_0= RULE_INT
                    {
                    lv_refIndex_3_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_38); 

                    							newLeafNode(lv_refIndex_3_0, grammarAccess.getListAssignmentValueAccess().getRefIndexINTTerminalRuleCall_2_0_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getListAssignmentValueRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"refIndex",
                    								lv_refIndex_3_0,
                    								"org.eclipse.xtext.common.Terminals.INT");
                    						

                    }


                    }

                    otherlv_4=(Token)match(input,31,FollowSets000.FOLLOW_2); 

                    					newLeafNode(otherlv_4, grammarAccess.getListAssignmentValueAccess().getRightSquareBracketKeyword_2_0_2());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalEpatchTestLanguage.g:1472:4: ( (lv_value_5_0= RULE_STRING ) )
                    {
                    // InternalEpatchTestLanguage.g:1472:4: ( (lv_value_5_0= RULE_STRING ) )
                    // InternalEpatchTestLanguage.g:1473:5: (lv_value_5_0= RULE_STRING )
                    {
                    // InternalEpatchTestLanguage.g:1473:5: (lv_value_5_0= RULE_STRING )
                    // InternalEpatchTestLanguage.g:1474:6: lv_value_5_0= RULE_STRING
                    {
                    lv_value_5_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); 

                    						newLeafNode(lv_value_5_0, grammarAccess.getListAssignmentValueAccess().getValueSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getListAssignmentValueRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalEpatchTestLanguage.g:1491:4: ( ( (otherlv_6= RULE_ID ) ) (otherlv_7= '.' ( (lv_refFeature_8_0= RULE_ID ) ) (otherlv_9= '[' ( (lv_refIndex_10_0= RULE_INT ) ) otherlv_11= ']' )? )? )
                    {
                    // InternalEpatchTestLanguage.g:1491:4: ( ( (otherlv_6= RULE_ID ) ) (otherlv_7= '.' ( (lv_refFeature_8_0= RULE_ID ) ) (otherlv_9= '[' ( (lv_refIndex_10_0= RULE_INT ) ) otherlv_11= ']' )? )? )
                    // InternalEpatchTestLanguage.g:1492:5: ( (otherlv_6= RULE_ID ) ) (otherlv_7= '.' ( (lv_refFeature_8_0= RULE_ID ) ) (otherlv_9= '[' ( (lv_refIndex_10_0= RULE_INT ) ) otherlv_11= ']' )? )?
                    {
                    // InternalEpatchTestLanguage.g:1492:5: ( (otherlv_6= RULE_ID ) )
                    // InternalEpatchTestLanguage.g:1493:6: (otherlv_6= RULE_ID )
                    {
                    // InternalEpatchTestLanguage.g:1493:6: (otherlv_6= RULE_ID )
                    // InternalEpatchTestLanguage.g:1494:7: otherlv_6= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getListAssignmentValueRule());
                    							}
                    						
                    otherlv_6=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_12); 

                    							newLeafNode(otherlv_6, grammarAccess.getListAssignmentValueAccess().getRefObjectNamedObjectCrossReference_2_2_0_0());
                    						

                    }


                    }

                    // InternalEpatchTestLanguage.g:1505:5: (otherlv_7= '.' ( (lv_refFeature_8_0= RULE_ID ) ) (otherlv_9= '[' ( (lv_refIndex_10_0= RULE_INT ) ) otherlv_11= ']' )? )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==19) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalEpatchTestLanguage.g:1506:6: otherlv_7= '.' ( (lv_refFeature_8_0= RULE_ID ) ) (otherlv_9= '[' ( (lv_refIndex_10_0= RULE_INT ) ) otherlv_11= ']' )?
                            {
                            otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_3); 

                            						newLeafNode(otherlv_7, grammarAccess.getListAssignmentValueAccess().getFullStopKeyword_2_2_1_0());
                            					
                            // InternalEpatchTestLanguage.g:1510:6: ( (lv_refFeature_8_0= RULE_ID ) )
                            // InternalEpatchTestLanguage.g:1511:7: (lv_refFeature_8_0= RULE_ID )
                            {
                            // InternalEpatchTestLanguage.g:1511:7: (lv_refFeature_8_0= RULE_ID )
                            // InternalEpatchTestLanguage.g:1512:8: lv_refFeature_8_0= RULE_ID
                            {
                            lv_refFeature_8_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_37); 

                            								newLeafNode(lv_refFeature_8_0, grammarAccess.getListAssignmentValueAccess().getRefFeatureIDTerminalRuleCall_2_2_1_1_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getListAssignmentValueRule());
                            								}
                            								setWithLastConsumed(
                            									current,
                            									"refFeature",
                            									lv_refFeature_8_0,
                            									"org.eclipse.xtext.common.Terminals.ID");
                            							

                            }


                            }

                            // InternalEpatchTestLanguage.g:1528:6: (otherlv_9= '[' ( (lv_refIndex_10_0= RULE_INT ) ) otherlv_11= ']' )?
                            int alt25=2;
                            int LA25_0 = input.LA(1);

                            if ( (LA25_0==29) ) {
                                alt25=1;
                            }
                            switch (alt25) {
                                case 1 :
                                    // InternalEpatchTestLanguage.g:1529:7: otherlv_9= '[' ( (lv_refIndex_10_0= RULE_INT ) ) otherlv_11= ']'
                                    {
                                    otherlv_9=(Token)match(input,29,FollowSets000.FOLLOW_32); 

                                    							newLeafNode(otherlv_9, grammarAccess.getListAssignmentValueAccess().getLeftSquareBracketKeyword_2_2_1_2_0());
                                    						
                                    // InternalEpatchTestLanguage.g:1533:7: ( (lv_refIndex_10_0= RULE_INT ) )
                                    // InternalEpatchTestLanguage.g:1534:8: (lv_refIndex_10_0= RULE_INT )
                                    {
                                    // InternalEpatchTestLanguage.g:1534:8: (lv_refIndex_10_0= RULE_INT )
                                    // InternalEpatchTestLanguage.g:1535:9: lv_refIndex_10_0= RULE_INT
                                    {
                                    lv_refIndex_10_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_38); 

                                    									newLeafNode(lv_refIndex_10_0, grammarAccess.getListAssignmentValueAccess().getRefIndexINTTerminalRuleCall_2_2_1_2_1_0());
                                    								

                                    									if (current==null) {
                                    										current = createModelElement(grammarAccess.getListAssignmentValueRule());
                                    									}
                                    									setWithLastConsumed(
                                    										current,
                                    										"refIndex",
                                    										lv_refIndex_10_0,
                                    										"org.eclipse.xtext.common.Terminals.INT");
                                    								

                                    }


                                    }

                                    otherlv_11=(Token)match(input,31,FollowSets000.FOLLOW_2); 

                                    							newLeafNode(otherlv_11, grammarAccess.getListAssignmentValueAccess().getRightSquareBracketKeyword_2_2_1_2_2());
                                    						

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalEpatchTestLanguage.g:1559:4: ( (lv_newObject_12_0= ruleCreatedObject ) )
                    {
                    // InternalEpatchTestLanguage.g:1559:4: ( (lv_newObject_12_0= ruleCreatedObject ) )
                    // InternalEpatchTestLanguage.g:1560:5: (lv_newObject_12_0= ruleCreatedObject )
                    {
                    // InternalEpatchTestLanguage.g:1560:5: (lv_newObject_12_0= ruleCreatedObject )
                    // InternalEpatchTestLanguage.g:1561:6: lv_newObject_12_0= ruleCreatedObject
                    {

                    						newCompositeNode(grammarAccess.getListAssignmentValueAccess().getNewObjectCreatedObjectParserRuleCall_2_3_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_newObject_12_0=ruleCreatedObject();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getListAssignmentValueRule());
                    						}
                    						set(
                    							current,
                    							"newObject",
                    							lv_newObject_12_0,
                    							"org.eclipse.xtext.parser.epatch.EpatchTestLanguage.CreatedObject");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalEpatchTestLanguage.g:1579:4: ( ( (otherlv_13= RULE_ID ) ) ( (lv_impFrag_14_0= RULE_FRAGMENT ) ) )
                    {
                    // InternalEpatchTestLanguage.g:1579:4: ( ( (otherlv_13= RULE_ID ) ) ( (lv_impFrag_14_0= RULE_FRAGMENT ) ) )
                    // InternalEpatchTestLanguage.g:1580:5: ( (otherlv_13= RULE_ID ) ) ( (lv_impFrag_14_0= RULE_FRAGMENT ) )
                    {
                    // InternalEpatchTestLanguage.g:1580:5: ( (otherlv_13= RULE_ID ) )
                    // InternalEpatchTestLanguage.g:1581:6: (otherlv_13= RULE_ID )
                    {
                    // InternalEpatchTestLanguage.g:1581:6: (otherlv_13= RULE_ID )
                    // InternalEpatchTestLanguage.g:1582:7: otherlv_13= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getListAssignmentValueRule());
                    							}
                    						
                    otherlv_13=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_21); 

                    							newLeafNode(otherlv_13, grammarAccess.getListAssignmentValueAccess().getImportImportCrossReference_2_4_0_0());
                    						

                    }


                    }

                    // InternalEpatchTestLanguage.g:1593:5: ( (lv_impFrag_14_0= RULE_FRAGMENT ) )
                    // InternalEpatchTestLanguage.g:1594:6: (lv_impFrag_14_0= RULE_FRAGMENT )
                    {
                    // InternalEpatchTestLanguage.g:1594:6: (lv_impFrag_14_0= RULE_FRAGMENT )
                    // InternalEpatchTestLanguage.g:1595:7: lv_impFrag_14_0= RULE_FRAGMENT
                    {
                    lv_impFrag_14_0=(Token)match(input,RULE_FRAGMENT,FollowSets000.FOLLOW_2); 

                    							newLeafNode(lv_impFrag_14_0, grammarAccess.getListAssignmentValueAccess().getImpFragFRAGMENTTerminalRuleCall_2_4_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getListAssignmentValueRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"impFrag",
                    								lv_impFrag_14_0,
                    								"org.eclipse.xtext.parser.epatch.EpatchTestLanguage.FRAGMENT");
                    						

                    }


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
    // $ANTLR end "ruleListAssignmentValue"


    // $ANTLR start "entryRuleSingleAssignmentValue"
    // InternalEpatchTestLanguage.g:1617:1: entryRuleSingleAssignmentValue returns [EObject current=null] : iv_ruleSingleAssignmentValue= ruleSingleAssignmentValue EOF ;
    public final EObject entryRuleSingleAssignmentValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleAssignmentValue = null;


        try {
            // InternalEpatchTestLanguage.g:1617:62: (iv_ruleSingleAssignmentValue= ruleSingleAssignmentValue EOF )
            // InternalEpatchTestLanguage.g:1618:2: iv_ruleSingleAssignmentValue= ruleSingleAssignmentValue EOF
            {
             newCompositeNode(grammarAccess.getSingleAssignmentValueRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSingleAssignmentValue=ruleSingleAssignmentValue();

            state._fsp--;

             current =iv_ruleSingleAssignmentValue; 
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
    // $ANTLR end "entryRuleSingleAssignmentValue"


    // $ANTLR start "ruleSingleAssignmentValue"
    // InternalEpatchTestLanguage.g:1624:1: ruleSingleAssignmentValue returns [EObject current=null] : ( ( (lv_keyword_0_0= 'null' ) ) | ( (lv_value_1_0= RULE_STRING ) ) | ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= '.' ( (lv_refFeature_4_0= RULE_ID ) ) (otherlv_5= '[' ( (lv_refIndex_6_0= RULE_INT ) ) otherlv_7= ']' )? )? ) | ( (lv_newObject_8_0= ruleCreatedObject ) ) | ( ( (otherlv_9= RULE_ID ) ) ( (lv_impFrag_10_0= RULE_FRAGMENT ) ) ) ) ;
    public final EObject ruleSingleAssignmentValue() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_0_0=null;
        Token lv_value_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_refFeature_4_0=null;
        Token otherlv_5=null;
        Token lv_refIndex_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token lv_impFrag_10_0=null;
        EObject lv_newObject_8_0 = null;


        try {
            // InternalEpatchTestLanguage.g:1625:1: ( ( ( (lv_keyword_0_0= 'null' ) ) | ( (lv_value_1_0= RULE_STRING ) ) | ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= '.' ( (lv_refFeature_4_0= RULE_ID ) ) (otherlv_5= '[' ( (lv_refIndex_6_0= RULE_INT ) ) otherlv_7= ']' )? )? ) | ( (lv_newObject_8_0= ruleCreatedObject ) ) | ( ( (otherlv_9= RULE_ID ) ) ( (lv_impFrag_10_0= RULE_FRAGMENT ) ) ) ) )
            // InternalEpatchTestLanguage.g:1626:2: ( ( (lv_keyword_0_0= 'null' ) ) | ( (lv_value_1_0= RULE_STRING ) ) | ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= '.' ( (lv_refFeature_4_0= RULE_ID ) ) (otherlv_5= '[' ( (lv_refIndex_6_0= RULE_INT ) ) otherlv_7= ']' )? )? ) | ( (lv_newObject_8_0= ruleCreatedObject ) ) | ( ( (otherlv_9= RULE_ID ) ) ( (lv_impFrag_10_0= RULE_FRAGMENT ) ) ) )
            {
            // InternalEpatchTestLanguage.g:1626:2: ( ( (lv_keyword_0_0= 'null' ) ) | ( (lv_value_1_0= RULE_STRING ) ) | ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= '.' ( (lv_refFeature_4_0= RULE_ID ) ) (otherlv_5= '[' ( (lv_refIndex_6_0= RULE_INT ) ) otherlv_7= ']' )? )? ) | ( (lv_newObject_8_0= ruleCreatedObject ) ) | ( ( (otherlv_9= RULE_ID ) ) ( (lv_impFrag_10_0= RULE_FRAGMENT ) ) ) )
            int alt30=5;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt30=1;
                }
                break;
            case RULE_STRING:
                {
                alt30=2;
                }
                break;
            case RULE_ID:
                {
                int LA30_3 = input.LA(2);

                if ( (LA30_3==RULE_FRAGMENT) ) {
                    alt30=5;
                }
                else if ( (LA30_3==EOF||LA30_3==19||LA30_3==24||LA30_3==28) ) {
                    alt30=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 3, input);

                    throw nvae;
                }
                }
                break;
            case 34:
            case 35:
                {
                alt30=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalEpatchTestLanguage.g:1627:3: ( (lv_keyword_0_0= 'null' ) )
                    {
                    // InternalEpatchTestLanguage.g:1627:3: ( (lv_keyword_0_0= 'null' ) )
                    // InternalEpatchTestLanguage.g:1628:4: (lv_keyword_0_0= 'null' )
                    {
                    // InternalEpatchTestLanguage.g:1628:4: (lv_keyword_0_0= 'null' )
                    // InternalEpatchTestLanguage.g:1629:5: lv_keyword_0_0= 'null'
                    {
                    lv_keyword_0_0=(Token)match(input,33,FollowSets000.FOLLOW_2); 

                    					newLeafNode(lv_keyword_0_0, grammarAccess.getSingleAssignmentValueAccess().getKeywordNullKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSingleAssignmentValueRule());
                    					}
                    					setWithLastConsumed(current, "keyword", lv_keyword_0_0, "null");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEpatchTestLanguage.g:1642:3: ( (lv_value_1_0= RULE_STRING ) )
                    {
                    // InternalEpatchTestLanguage.g:1642:3: ( (lv_value_1_0= RULE_STRING ) )
                    // InternalEpatchTestLanguage.g:1643:4: (lv_value_1_0= RULE_STRING )
                    {
                    // InternalEpatchTestLanguage.g:1643:4: (lv_value_1_0= RULE_STRING )
                    // InternalEpatchTestLanguage.g:1644:5: lv_value_1_0= RULE_STRING
                    {
                    lv_value_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); 

                    					newLeafNode(lv_value_1_0, grammarAccess.getSingleAssignmentValueAccess().getValueSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSingleAssignmentValueRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"value",
                    						lv_value_1_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalEpatchTestLanguage.g:1661:3: ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= '.' ( (lv_refFeature_4_0= RULE_ID ) ) (otherlv_5= '[' ( (lv_refIndex_6_0= RULE_INT ) ) otherlv_7= ']' )? )? )
                    {
                    // InternalEpatchTestLanguage.g:1661:3: ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= '.' ( (lv_refFeature_4_0= RULE_ID ) ) (otherlv_5= '[' ( (lv_refIndex_6_0= RULE_INT ) ) otherlv_7= ']' )? )? )
                    // InternalEpatchTestLanguage.g:1662:4: ( (otherlv_2= RULE_ID ) ) (otherlv_3= '.' ( (lv_refFeature_4_0= RULE_ID ) ) (otherlv_5= '[' ( (lv_refIndex_6_0= RULE_INT ) ) otherlv_7= ']' )? )?
                    {
                    // InternalEpatchTestLanguage.g:1662:4: ( (otherlv_2= RULE_ID ) )
                    // InternalEpatchTestLanguage.g:1663:5: (otherlv_2= RULE_ID )
                    {
                    // InternalEpatchTestLanguage.g:1663:5: (otherlv_2= RULE_ID )
                    // InternalEpatchTestLanguage.g:1664:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSingleAssignmentValueRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_12); 

                    						newLeafNode(otherlv_2, grammarAccess.getSingleAssignmentValueAccess().getRefObjectNamedObjectCrossReference_2_0_0());
                    					

                    }


                    }

                    // InternalEpatchTestLanguage.g:1675:4: (otherlv_3= '.' ( (lv_refFeature_4_0= RULE_ID ) ) (otherlv_5= '[' ( (lv_refIndex_6_0= RULE_INT ) ) otherlv_7= ']' )? )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==19) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalEpatchTestLanguage.g:1676:5: otherlv_3= '.' ( (lv_refFeature_4_0= RULE_ID ) ) (otherlv_5= '[' ( (lv_refIndex_6_0= RULE_INT ) ) otherlv_7= ']' )?
                            {
                            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_3); 

                            					newLeafNode(otherlv_3, grammarAccess.getSingleAssignmentValueAccess().getFullStopKeyword_2_1_0());
                            				
                            // InternalEpatchTestLanguage.g:1680:5: ( (lv_refFeature_4_0= RULE_ID ) )
                            // InternalEpatchTestLanguage.g:1681:6: (lv_refFeature_4_0= RULE_ID )
                            {
                            // InternalEpatchTestLanguage.g:1681:6: (lv_refFeature_4_0= RULE_ID )
                            // InternalEpatchTestLanguage.g:1682:7: lv_refFeature_4_0= RULE_ID
                            {
                            lv_refFeature_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_37); 

                            							newLeafNode(lv_refFeature_4_0, grammarAccess.getSingleAssignmentValueAccess().getRefFeatureIDTerminalRuleCall_2_1_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSingleAssignmentValueRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"refFeature",
                            								lv_refFeature_4_0,
                            								"org.eclipse.xtext.common.Terminals.ID");
                            						

                            }


                            }

                            // InternalEpatchTestLanguage.g:1698:5: (otherlv_5= '[' ( (lv_refIndex_6_0= RULE_INT ) ) otherlv_7= ']' )?
                            int alt28=2;
                            int LA28_0 = input.LA(1);

                            if ( (LA28_0==29) ) {
                                alt28=1;
                            }
                            switch (alt28) {
                                case 1 :
                                    // InternalEpatchTestLanguage.g:1699:6: otherlv_5= '[' ( (lv_refIndex_6_0= RULE_INT ) ) otherlv_7= ']'
                                    {
                                    otherlv_5=(Token)match(input,29,FollowSets000.FOLLOW_32); 

                                    						newLeafNode(otherlv_5, grammarAccess.getSingleAssignmentValueAccess().getLeftSquareBracketKeyword_2_1_2_0());
                                    					
                                    // InternalEpatchTestLanguage.g:1703:6: ( (lv_refIndex_6_0= RULE_INT ) )
                                    // InternalEpatchTestLanguage.g:1704:7: (lv_refIndex_6_0= RULE_INT )
                                    {
                                    // InternalEpatchTestLanguage.g:1704:7: (lv_refIndex_6_0= RULE_INT )
                                    // InternalEpatchTestLanguage.g:1705:8: lv_refIndex_6_0= RULE_INT
                                    {
                                    lv_refIndex_6_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_38); 

                                    								newLeafNode(lv_refIndex_6_0, grammarAccess.getSingleAssignmentValueAccess().getRefIndexINTTerminalRuleCall_2_1_2_1_0());
                                    							

                                    								if (current==null) {
                                    									current = createModelElement(grammarAccess.getSingleAssignmentValueRule());
                                    								}
                                    								setWithLastConsumed(
                                    									current,
                                    									"refIndex",
                                    									lv_refIndex_6_0,
                                    									"org.eclipse.xtext.common.Terminals.INT");
                                    							

                                    }


                                    }

                                    otherlv_7=(Token)match(input,31,FollowSets000.FOLLOW_2); 

                                    						newLeafNode(otherlv_7, grammarAccess.getSingleAssignmentValueAccess().getRightSquareBracketKeyword_2_1_2_2());
                                    					

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalEpatchTestLanguage.g:1729:3: ( (lv_newObject_8_0= ruleCreatedObject ) )
                    {
                    // InternalEpatchTestLanguage.g:1729:3: ( (lv_newObject_8_0= ruleCreatedObject ) )
                    // InternalEpatchTestLanguage.g:1730:4: (lv_newObject_8_0= ruleCreatedObject )
                    {
                    // InternalEpatchTestLanguage.g:1730:4: (lv_newObject_8_0= ruleCreatedObject )
                    // InternalEpatchTestLanguage.g:1731:5: lv_newObject_8_0= ruleCreatedObject
                    {

                    					newCompositeNode(grammarAccess.getSingleAssignmentValueAccess().getNewObjectCreatedObjectParserRuleCall_3_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_newObject_8_0=ruleCreatedObject();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSingleAssignmentValueRule());
                    					}
                    					set(
                    						current,
                    						"newObject",
                    						lv_newObject_8_0,
                    						"org.eclipse.xtext.parser.epatch.EpatchTestLanguage.CreatedObject");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalEpatchTestLanguage.g:1749:3: ( ( (otherlv_9= RULE_ID ) ) ( (lv_impFrag_10_0= RULE_FRAGMENT ) ) )
                    {
                    // InternalEpatchTestLanguage.g:1749:3: ( ( (otherlv_9= RULE_ID ) ) ( (lv_impFrag_10_0= RULE_FRAGMENT ) ) )
                    // InternalEpatchTestLanguage.g:1750:4: ( (otherlv_9= RULE_ID ) ) ( (lv_impFrag_10_0= RULE_FRAGMENT ) )
                    {
                    // InternalEpatchTestLanguage.g:1750:4: ( (otherlv_9= RULE_ID ) )
                    // InternalEpatchTestLanguage.g:1751:5: (otherlv_9= RULE_ID )
                    {
                    // InternalEpatchTestLanguage.g:1751:5: (otherlv_9= RULE_ID )
                    // InternalEpatchTestLanguage.g:1752:6: otherlv_9= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSingleAssignmentValueRule());
                    						}
                    					
                    otherlv_9=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_21); 

                    						newLeafNode(otherlv_9, grammarAccess.getSingleAssignmentValueAccess().getImportImportCrossReference_4_0_0());
                    					

                    }


                    }

                    // InternalEpatchTestLanguage.g:1763:4: ( (lv_impFrag_10_0= RULE_FRAGMENT ) )
                    // InternalEpatchTestLanguage.g:1764:5: (lv_impFrag_10_0= RULE_FRAGMENT )
                    {
                    // InternalEpatchTestLanguage.g:1764:5: (lv_impFrag_10_0= RULE_FRAGMENT )
                    // InternalEpatchTestLanguage.g:1765:6: lv_impFrag_10_0= RULE_FRAGMENT
                    {
                    lv_impFrag_10_0=(Token)match(input,RULE_FRAGMENT,FollowSets000.FOLLOW_2); 

                    						newLeafNode(lv_impFrag_10_0, grammarAccess.getSingleAssignmentValueAccess().getImpFragFRAGMENTTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSingleAssignmentValueRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"impFrag",
                    							lv_impFrag_10_0,
                    							"org.eclipse.xtext.parser.epatch.EpatchTestLanguage.FRAGMENT");
                    					

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
    // $ANTLR end "ruleSingleAssignmentValue"


    // $ANTLR start "entryRuleCreatedObject"
    // InternalEpatchTestLanguage.g:1786:1: entryRuleCreatedObject returns [EObject current=null] : iv_ruleCreatedObject= ruleCreatedObject EOF ;
    public final EObject entryRuleCreatedObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreatedObject = null;


        try {
            // InternalEpatchTestLanguage.g:1786:54: (iv_ruleCreatedObject= ruleCreatedObject EOF )
            // InternalEpatchTestLanguage.g:1787:2: iv_ruleCreatedObject= ruleCreatedObject EOF
            {
             newCompositeNode(grammarAccess.getCreatedObjectRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCreatedObject=ruleCreatedObject();

            state._fsp--;

             current =iv_ruleCreatedObject; 
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
    // $ANTLR end "entryRuleCreatedObject"


    // $ANTLR start "ruleCreatedObject"
    // InternalEpatchTestLanguage.g:1793:1: ruleCreatedObject returns [EObject current=null] : ( (this_ObjectNew_0= ruleObjectNew | this_ObjectCopy_1= ruleObjectCopy ) ( (lv_name_2_0= RULE_ID ) )? (otherlv_3= '{' ( ( (lv_assignments_4_0= ruleMonoSingleAssignment ) ) | ( (lv_assignments_5_0= ruleMonoListAssignment ) ) )+ ( (lv_leftMig_6_0= ruleMigration ) )? otherlv_7= '}' )? ) ;
    public final EObject ruleCreatedObject() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_7=null;
        EObject this_ObjectNew_0 = null;

        EObject this_ObjectCopy_1 = null;

        EObject lv_assignments_4_0 = null;

        EObject lv_assignments_5_0 = null;

        EObject lv_leftMig_6_0 = null;


        try {
            // InternalEpatchTestLanguage.g:1794:1: ( ( (this_ObjectNew_0= ruleObjectNew | this_ObjectCopy_1= ruleObjectCopy ) ( (lv_name_2_0= RULE_ID ) )? (otherlv_3= '{' ( ( (lv_assignments_4_0= ruleMonoSingleAssignment ) ) | ( (lv_assignments_5_0= ruleMonoListAssignment ) ) )+ ( (lv_leftMig_6_0= ruleMigration ) )? otherlv_7= '}' )? ) )
            // InternalEpatchTestLanguage.g:1795:2: ( (this_ObjectNew_0= ruleObjectNew | this_ObjectCopy_1= ruleObjectCopy ) ( (lv_name_2_0= RULE_ID ) )? (otherlv_3= '{' ( ( (lv_assignments_4_0= ruleMonoSingleAssignment ) ) | ( (lv_assignments_5_0= ruleMonoListAssignment ) ) )+ ( (lv_leftMig_6_0= ruleMigration ) )? otherlv_7= '}' )? )
            {
            // InternalEpatchTestLanguage.g:1795:2: ( (this_ObjectNew_0= ruleObjectNew | this_ObjectCopy_1= ruleObjectCopy ) ( (lv_name_2_0= RULE_ID ) )? (otherlv_3= '{' ( ( (lv_assignments_4_0= ruleMonoSingleAssignment ) ) | ( (lv_assignments_5_0= ruleMonoListAssignment ) ) )+ ( (lv_leftMig_6_0= ruleMigration ) )? otherlv_7= '}' )? )
            // InternalEpatchTestLanguage.g:1796:3: (this_ObjectNew_0= ruleObjectNew | this_ObjectCopy_1= ruleObjectCopy ) ( (lv_name_2_0= RULE_ID ) )? (otherlv_3= '{' ( ( (lv_assignments_4_0= ruleMonoSingleAssignment ) ) | ( (lv_assignments_5_0= ruleMonoListAssignment ) ) )+ ( (lv_leftMig_6_0= ruleMigration ) )? otherlv_7= '}' )?
            {
            // InternalEpatchTestLanguage.g:1796:3: (this_ObjectNew_0= ruleObjectNew | this_ObjectCopy_1= ruleObjectCopy )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==34) ) {
                alt31=1;
            }
            else if ( (LA31_0==35) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalEpatchTestLanguage.g:1797:4: this_ObjectNew_0= ruleObjectNew
                    {

                    				newCompositeNode(grammarAccess.getCreatedObjectAccess().getObjectNewParserRuleCall_0_0());
                    			
                    pushFollow(FollowSets000.FOLLOW_41);
                    this_ObjectNew_0=ruleObjectNew();

                    state._fsp--;


                    				current = this_ObjectNew_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalEpatchTestLanguage.g:1806:4: this_ObjectCopy_1= ruleObjectCopy
                    {

                    				newCompositeNode(grammarAccess.getCreatedObjectAccess().getObjectCopyParserRuleCall_0_1());
                    			
                    pushFollow(FollowSets000.FOLLOW_41);
                    this_ObjectCopy_1=ruleObjectCopy();

                    state._fsp--;


                    				current = this_ObjectCopy_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalEpatchTestLanguage.g:1815:3: ( (lv_name_2_0= RULE_ID ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_ID) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalEpatchTestLanguage.g:1816:4: (lv_name_2_0= RULE_ID )
                    {
                    // InternalEpatchTestLanguage.g:1816:4: (lv_name_2_0= RULE_ID )
                    // InternalEpatchTestLanguage.g:1817:5: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_22); 

                    					newLeafNode(lv_name_2_0, grammarAccess.getCreatedObjectAccess().getNameIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCreatedObjectRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_2_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            // InternalEpatchTestLanguage.g:1833:3: (otherlv_3= '{' ( ( (lv_assignments_4_0= ruleMonoSingleAssignment ) ) | ( (lv_assignments_5_0= ruleMonoListAssignment ) ) )+ ( (lv_leftMig_6_0= ruleMigration ) )? otherlv_7= '}' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==13) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalEpatchTestLanguage.g:1834:4: otherlv_3= '{' ( ( (lv_assignments_4_0= ruleMonoSingleAssignment ) ) | ( (lv_assignments_5_0= ruleMonoListAssignment ) ) )+ ( (lv_leftMig_6_0= ruleMigration ) )? otherlv_7= '}'
                    {
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getCreatedObjectAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    // InternalEpatchTestLanguage.g:1838:4: ( ( (lv_assignments_4_0= ruleMonoSingleAssignment ) ) | ( (lv_assignments_5_0= ruleMonoListAssignment ) ) )+
                    int cnt33=0;
                    loop33:
                    do {
                        int alt33=3;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==RULE_ID) ) {
                            int LA33_2 = input.LA(2);

                            if ( (LA33_2==27) ) {
                                int LA33_3 = input.LA(3);

                                if ( (LA33_3==29) ) {
                                    alt33=2;
                                }
                                else if ( ((LA33_3>=RULE_ID && LA33_3<=RULE_STRING)||(LA33_3>=33 && LA33_3<=35)) ) {
                                    alt33=1;
                                }


                            }


                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalEpatchTestLanguage.g:1839:5: ( (lv_assignments_4_0= ruleMonoSingleAssignment ) )
                    	    {
                    	    // InternalEpatchTestLanguage.g:1839:5: ( (lv_assignments_4_0= ruleMonoSingleAssignment ) )
                    	    // InternalEpatchTestLanguage.g:1840:6: (lv_assignments_4_0= ruleMonoSingleAssignment )
                    	    {
                    	    // InternalEpatchTestLanguage.g:1840:6: (lv_assignments_4_0= ruleMonoSingleAssignment )
                    	    // InternalEpatchTestLanguage.g:1841:7: lv_assignments_4_0= ruleMonoSingleAssignment
                    	    {

                    	    							newCompositeNode(grammarAccess.getCreatedObjectAccess().getAssignmentsMonoSingleAssignmentParserRuleCall_2_1_0_0());
                    	    						
                    	    pushFollow(FollowSets000.FOLLOW_42);
                    	    lv_assignments_4_0=ruleMonoSingleAssignment();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCreatedObjectRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"assignments",
                    	    								lv_assignments_4_0,
                    	    								"org.eclipse.xtext.parser.epatch.EpatchTestLanguage.MonoSingleAssignment");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalEpatchTestLanguage.g:1859:5: ( (lv_assignments_5_0= ruleMonoListAssignment ) )
                    	    {
                    	    // InternalEpatchTestLanguage.g:1859:5: ( (lv_assignments_5_0= ruleMonoListAssignment ) )
                    	    // InternalEpatchTestLanguage.g:1860:6: (lv_assignments_5_0= ruleMonoListAssignment )
                    	    {
                    	    // InternalEpatchTestLanguage.g:1860:6: (lv_assignments_5_0= ruleMonoListAssignment )
                    	    // InternalEpatchTestLanguage.g:1861:7: lv_assignments_5_0= ruleMonoListAssignment
                    	    {

                    	    							newCompositeNode(grammarAccess.getCreatedObjectAccess().getAssignmentsMonoListAssignmentParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FollowSets000.FOLLOW_42);
                    	    lv_assignments_5_0=ruleMonoListAssignment();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCreatedObjectRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"assignments",
                    	    								lv_assignments_5_0,
                    	    								"org.eclipse.xtext.parser.epatch.EpatchTestLanguage.MonoListAssignment");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt33 >= 1 ) break loop33;
                                EarlyExitException eee =
                                    new EarlyExitException(33, input);
                                throw eee;
                        }
                        cnt33++;
                    } while (true);

                    // InternalEpatchTestLanguage.g:1879:4: ( (lv_leftMig_6_0= ruleMigration ) )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==36) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // InternalEpatchTestLanguage.g:1880:5: (lv_leftMig_6_0= ruleMigration )
                            {
                            // InternalEpatchTestLanguage.g:1880:5: (lv_leftMig_6_0= ruleMigration )
                            // InternalEpatchTestLanguage.g:1881:6: lv_leftMig_6_0= ruleMigration
                            {

                            						newCompositeNode(grammarAccess.getCreatedObjectAccess().getLeftMigMigrationParserRuleCall_2_2_0());
                            					
                            pushFollow(FollowSets000.FOLLOW_19);
                            lv_leftMig_6_0=ruleMigration();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getCreatedObjectRule());
                            						}
                            						set(
                            							current,
                            							"leftMig",
                            							lv_leftMig_6_0,
                            							"org.eclipse.xtext.parser.epatch.EpatchTestLanguage.Migration");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getCreatedObjectAccess().getRightCurlyBracketKeyword_2_3());
                    			

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
    // $ANTLR end "ruleCreatedObject"


    // $ANTLR start "entryRuleObjectNew"
    // InternalEpatchTestLanguage.g:1907:1: entryRuleObjectNew returns [EObject current=null] : iv_ruleObjectNew= ruleObjectNew EOF ;
    public final EObject entryRuleObjectNew() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectNew = null;


        try {
            // InternalEpatchTestLanguage.g:1907:50: (iv_ruleObjectNew= ruleObjectNew EOF )
            // InternalEpatchTestLanguage.g:1908:2: iv_ruleObjectNew= ruleObjectNew EOF
            {
             newCompositeNode(grammarAccess.getObjectNewRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleObjectNew=ruleObjectNew();

            state._fsp--;

             current =iv_ruleObjectNew; 
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
    // $ANTLR end "entryRuleObjectNew"


    // $ANTLR start "ruleObjectNew"
    // InternalEpatchTestLanguage.g:1914:1: ruleObjectNew returns [EObject current=null] : (otherlv_0= 'new' ( (otherlv_1= RULE_ID ) ) ( (lv_impFrag_2_0= RULE_FRAGMENT ) ) ) ;
    public final EObject ruleObjectNew() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_impFrag_2_0=null;

        try {
            // InternalEpatchTestLanguage.g:1915:1: ( (otherlv_0= 'new' ( (otherlv_1= RULE_ID ) ) ( (lv_impFrag_2_0= RULE_FRAGMENT ) ) ) )
            // InternalEpatchTestLanguage.g:1916:2: (otherlv_0= 'new' ( (otherlv_1= RULE_ID ) ) ( (lv_impFrag_2_0= RULE_FRAGMENT ) ) )
            {
            // InternalEpatchTestLanguage.g:1916:2: (otherlv_0= 'new' ( (otherlv_1= RULE_ID ) ) ( (lv_impFrag_2_0= RULE_FRAGMENT ) ) )
            // InternalEpatchTestLanguage.g:1917:3: otherlv_0= 'new' ( (otherlv_1= RULE_ID ) ) ( (lv_impFrag_2_0= RULE_FRAGMENT ) )
            {
            otherlv_0=(Token)match(input,34,FollowSets000.FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getObjectNewAccess().getNewKeyword_0());
            		
            // InternalEpatchTestLanguage.g:1921:3: ( (otherlv_1= RULE_ID ) )
            // InternalEpatchTestLanguage.g:1922:4: (otherlv_1= RULE_ID )
            {
            // InternalEpatchTestLanguage.g:1922:4: (otherlv_1= RULE_ID )
            // InternalEpatchTestLanguage.g:1923:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjectNewRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_21); 

            					newLeafNode(otherlv_1, grammarAccess.getObjectNewAccess().getImportImportCrossReference_1_0());
            				

            }


            }

            // InternalEpatchTestLanguage.g:1934:3: ( (lv_impFrag_2_0= RULE_FRAGMENT ) )
            // InternalEpatchTestLanguage.g:1935:4: (lv_impFrag_2_0= RULE_FRAGMENT )
            {
            // InternalEpatchTestLanguage.g:1935:4: (lv_impFrag_2_0= RULE_FRAGMENT )
            // InternalEpatchTestLanguage.g:1936:5: lv_impFrag_2_0= RULE_FRAGMENT
            {
            lv_impFrag_2_0=(Token)match(input,RULE_FRAGMENT,FollowSets000.FOLLOW_2); 

            					newLeafNode(lv_impFrag_2_0, grammarAccess.getObjectNewAccess().getImpFragFRAGMENTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjectNewRule());
            					}
            					setWithLastConsumed(
            						current,
            						"impFrag",
            						lv_impFrag_2_0,
            						"org.eclipse.xtext.parser.epatch.EpatchTestLanguage.FRAGMENT");
            				

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
    // $ANTLR end "ruleObjectNew"


    // $ANTLR start "entryRuleObjectCopy"
    // InternalEpatchTestLanguage.g:1956:1: entryRuleObjectCopy returns [EObject current=null] : iv_ruleObjectCopy= ruleObjectCopy EOF ;
    public final EObject entryRuleObjectCopy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectCopy = null;


        try {
            // InternalEpatchTestLanguage.g:1956:51: (iv_ruleObjectCopy= ruleObjectCopy EOF )
            // InternalEpatchTestLanguage.g:1957:2: iv_ruleObjectCopy= ruleObjectCopy EOF
            {
             newCompositeNode(grammarAccess.getObjectCopyRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleObjectCopy=ruleObjectCopy();

            state._fsp--;

             current =iv_ruleObjectCopy; 
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
    // $ANTLR end "entryRuleObjectCopy"


    // $ANTLR start "ruleObjectCopy"
    // InternalEpatchTestLanguage.g:1963:1: ruleObjectCopy returns [EObject current=null] : (otherlv_0= 'copy' ( (otherlv_1= RULE_ID ) ) ( (lv_fragment_2_0= RULE_FRAGMENT ) ) ) ;
    public final EObject ruleObjectCopy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_fragment_2_0=null;

        try {
            // InternalEpatchTestLanguage.g:1964:1: ( (otherlv_0= 'copy' ( (otherlv_1= RULE_ID ) ) ( (lv_fragment_2_0= RULE_FRAGMENT ) ) ) )
            // InternalEpatchTestLanguage.g:1965:2: (otherlv_0= 'copy' ( (otherlv_1= RULE_ID ) ) ( (lv_fragment_2_0= RULE_FRAGMENT ) ) )
            {
            // InternalEpatchTestLanguage.g:1965:2: (otherlv_0= 'copy' ( (otherlv_1= RULE_ID ) ) ( (lv_fragment_2_0= RULE_FRAGMENT ) ) )
            // InternalEpatchTestLanguage.g:1966:3: otherlv_0= 'copy' ( (otherlv_1= RULE_ID ) ) ( (lv_fragment_2_0= RULE_FRAGMENT ) )
            {
            otherlv_0=(Token)match(input,35,FollowSets000.FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getObjectCopyAccess().getCopyKeyword_0());
            		
            // InternalEpatchTestLanguage.g:1970:3: ( (otherlv_1= RULE_ID ) )
            // InternalEpatchTestLanguage.g:1971:4: (otherlv_1= RULE_ID )
            {
            // InternalEpatchTestLanguage.g:1971:4: (otherlv_1= RULE_ID )
            // InternalEpatchTestLanguage.g:1972:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjectCopyRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_21); 

            					newLeafNode(otherlv_1, grammarAccess.getObjectCopyAccess().getResourceNamedResourceCrossReference_1_0());
            				

            }


            }

            // InternalEpatchTestLanguage.g:1983:3: ( (lv_fragment_2_0= RULE_FRAGMENT ) )
            // InternalEpatchTestLanguage.g:1984:4: (lv_fragment_2_0= RULE_FRAGMENT )
            {
            // InternalEpatchTestLanguage.g:1984:4: (lv_fragment_2_0= RULE_FRAGMENT )
            // InternalEpatchTestLanguage.g:1985:5: lv_fragment_2_0= RULE_FRAGMENT
            {
            lv_fragment_2_0=(Token)match(input,RULE_FRAGMENT,FollowSets000.FOLLOW_2); 

            					newLeafNode(lv_fragment_2_0, grammarAccess.getObjectCopyAccess().getFragmentFRAGMENTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjectCopyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"fragment",
            						lv_fragment_2_0,
            						"org.eclipse.xtext.parser.epatch.EpatchTestLanguage.FRAGMENT");
            				

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
    // $ANTLR end "ruleObjectCopy"


    // $ANTLR start "entryRuleMigration"
    // InternalEpatchTestLanguage.g:2005:1: entryRuleMigration returns [EObject current=null] : iv_ruleMigration= ruleMigration EOF ;
    public final EObject entryRuleMigration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMigration = null;


        try {
            // InternalEpatchTestLanguage.g:2005:50: (iv_ruleMigration= ruleMigration EOF )
            // InternalEpatchTestLanguage.g:2006:2: iv_ruleMigration= ruleMigration EOF
            {
             newCompositeNode(grammarAccess.getMigrationRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMigration=ruleMigration();

            state._fsp--;

             current =iv_ruleMigration; 
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
    // $ANTLR end "entryRuleMigration"


    // $ANTLR start "ruleMigration"
    // InternalEpatchTestLanguage.g:2012:1: ruleMigration returns [EObject current=null] : ( () otherlv_1= 'migrate' ( (lv_first_2_0= ruleExecutable ) )? ( (otherlv_3= 'as' ( (lv_asOp_4_0= ruleExecutable ) ) ) | (otherlv_5= 'each' ( (lv_eachOp_6_0= ruleExecutable ) ) ) )? otherlv_7= ';' ) ;
    public final EObject ruleMigration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_first_2_0 = null;

        EObject lv_asOp_4_0 = null;

        EObject lv_eachOp_6_0 = null;


        try {
            // InternalEpatchTestLanguage.g:2013:1: ( ( () otherlv_1= 'migrate' ( (lv_first_2_0= ruleExecutable ) )? ( (otherlv_3= 'as' ( (lv_asOp_4_0= ruleExecutable ) ) ) | (otherlv_5= 'each' ( (lv_eachOp_6_0= ruleExecutable ) ) ) )? otherlv_7= ';' ) )
            // InternalEpatchTestLanguage.g:2014:2: ( () otherlv_1= 'migrate' ( (lv_first_2_0= ruleExecutable ) )? ( (otherlv_3= 'as' ( (lv_asOp_4_0= ruleExecutable ) ) ) | (otherlv_5= 'each' ( (lv_eachOp_6_0= ruleExecutable ) ) ) )? otherlv_7= ';' )
            {
            // InternalEpatchTestLanguage.g:2014:2: ( () otherlv_1= 'migrate' ( (lv_first_2_0= ruleExecutable ) )? ( (otherlv_3= 'as' ( (lv_asOp_4_0= ruleExecutable ) ) ) | (otherlv_5= 'each' ( (lv_eachOp_6_0= ruleExecutable ) ) ) )? otherlv_7= ';' )
            // InternalEpatchTestLanguage.g:2015:3: () otherlv_1= 'migrate' ( (lv_first_2_0= ruleExecutable ) )? ( (otherlv_3= 'as' ( (lv_asOp_4_0= ruleExecutable ) ) ) | (otherlv_5= 'each' ( (lv_eachOp_6_0= ruleExecutable ) ) ) )? otherlv_7= ';'
            {
            // InternalEpatchTestLanguage.g:2015:3: ()
            // InternalEpatchTestLanguage.g:2016:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMigrationAccess().getMigrationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FollowSets000.FOLLOW_43); 

            			newLeafNode(otherlv_1, grammarAccess.getMigrationAccess().getMigrateKeyword_1());
            		
            // InternalEpatchTestLanguage.g:2026:3: ( (lv_first_2_0= ruleExecutable ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_STRING||LA36_0==18) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalEpatchTestLanguage.g:2027:4: (lv_first_2_0= ruleExecutable )
                    {
                    // InternalEpatchTestLanguage.g:2027:4: (lv_first_2_0= ruleExecutable )
                    // InternalEpatchTestLanguage.g:2028:5: lv_first_2_0= ruleExecutable
                    {

                    					newCompositeNode(grammarAccess.getMigrationAccess().getFirstExecutableParserRuleCall_2_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_44);
                    lv_first_2_0=ruleExecutable();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMigrationRule());
                    					}
                    					set(
                    						current,
                    						"first",
                    						lv_first_2_0,
                    						"org.eclipse.xtext.parser.epatch.EpatchTestLanguage.Executable");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalEpatchTestLanguage.g:2045:3: ( (otherlv_3= 'as' ( (lv_asOp_4_0= ruleExecutable ) ) ) | (otherlv_5= 'each' ( (lv_eachOp_6_0= ruleExecutable ) ) ) )?
            int alt37=3;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==37) ) {
                alt37=1;
            }
            else if ( (LA37_0==38) ) {
                alt37=2;
            }
            switch (alt37) {
                case 1 :
                    // InternalEpatchTestLanguage.g:2046:4: (otherlv_3= 'as' ( (lv_asOp_4_0= ruleExecutable ) ) )
                    {
                    // InternalEpatchTestLanguage.g:2046:4: (otherlv_3= 'as' ( (lv_asOp_4_0= ruleExecutable ) ) )
                    // InternalEpatchTestLanguage.g:2047:5: otherlv_3= 'as' ( (lv_asOp_4_0= ruleExecutable ) )
                    {
                    otherlv_3=(Token)match(input,37,FollowSets000.FOLLOW_45); 

                    					newLeafNode(otherlv_3, grammarAccess.getMigrationAccess().getAsKeyword_3_0_0());
                    				
                    // InternalEpatchTestLanguage.g:2051:5: ( (lv_asOp_4_0= ruleExecutable ) )
                    // InternalEpatchTestLanguage.g:2052:6: (lv_asOp_4_0= ruleExecutable )
                    {
                    // InternalEpatchTestLanguage.g:2052:6: (lv_asOp_4_0= ruleExecutable )
                    // InternalEpatchTestLanguage.g:2053:7: lv_asOp_4_0= ruleExecutable
                    {

                    							newCompositeNode(grammarAccess.getMigrationAccess().getAsOpExecutableParserRuleCall_3_0_1_0());
                    						
                    pushFollow(FollowSets000.FOLLOW_17);
                    lv_asOp_4_0=ruleExecutable();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getMigrationRule());
                    							}
                    							set(
                    								current,
                    								"asOp",
                    								lv_asOp_4_0,
                    								"org.eclipse.xtext.parser.epatch.EpatchTestLanguage.Executable");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEpatchTestLanguage.g:2072:4: (otherlv_5= 'each' ( (lv_eachOp_6_0= ruleExecutable ) ) )
                    {
                    // InternalEpatchTestLanguage.g:2072:4: (otherlv_5= 'each' ( (lv_eachOp_6_0= ruleExecutable ) ) )
                    // InternalEpatchTestLanguage.g:2073:5: otherlv_5= 'each' ( (lv_eachOp_6_0= ruleExecutable ) )
                    {
                    otherlv_5=(Token)match(input,38,FollowSets000.FOLLOW_45); 

                    					newLeafNode(otherlv_5, grammarAccess.getMigrationAccess().getEachKeyword_3_1_0());
                    				
                    // InternalEpatchTestLanguage.g:2077:5: ( (lv_eachOp_6_0= ruleExecutable ) )
                    // InternalEpatchTestLanguage.g:2078:6: (lv_eachOp_6_0= ruleExecutable )
                    {
                    // InternalEpatchTestLanguage.g:2078:6: (lv_eachOp_6_0= ruleExecutable )
                    // InternalEpatchTestLanguage.g:2079:7: lv_eachOp_6_0= ruleExecutable
                    {

                    							newCompositeNode(grammarAccess.getMigrationAccess().getEachOpExecutableParserRuleCall_3_1_1_0());
                    						
                    pushFollow(FollowSets000.FOLLOW_17);
                    lv_eachOp_6_0=ruleExecutable();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getMigrationRule());
                    							}
                    							set(
                    								current,
                    								"eachOp",
                    								lv_eachOp_6_0,
                    								"org.eclipse.xtext.parser.epatch.EpatchTestLanguage.Executable");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,24,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getMigrationAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleMigration"


    // $ANTLR start "entryRuleExecutable"
    // InternalEpatchTestLanguage.g:2106:1: entryRuleExecutable returns [EObject current=null] : iv_ruleExecutable= ruleExecutable EOF ;
    public final EObject entryRuleExecutable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExecutable = null;


        try {
            // InternalEpatchTestLanguage.g:2106:51: (iv_ruleExecutable= ruleExecutable EOF )
            // InternalEpatchTestLanguage.g:2107:2: iv_ruleExecutable= ruleExecutable EOF
            {
             newCompositeNode(grammarAccess.getExecutableRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleExecutable=ruleExecutable();

            state._fsp--;

             current =iv_ruleExecutable; 
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
    // $ANTLR end "entryRuleExecutable"


    // $ANTLR start "ruleExecutable"
    // InternalEpatchTestLanguage.g:2113:1: ruleExecutable returns [EObject current=null] : (this_JavaExecutable_0= ruleJavaExecutable | this_ExpressionExecutable_1= ruleExpressionExecutable ) ;
    public final EObject ruleExecutable() throws RecognitionException {
        EObject current = null;

        EObject this_JavaExecutable_0 = null;

        EObject this_ExpressionExecutable_1 = null;


        try {
            // InternalEpatchTestLanguage.g:2114:1: ( (this_JavaExecutable_0= ruleJavaExecutable | this_ExpressionExecutable_1= ruleExpressionExecutable ) )
            // InternalEpatchTestLanguage.g:2115:2: (this_JavaExecutable_0= ruleJavaExecutable | this_ExpressionExecutable_1= ruleExpressionExecutable )
            {
            // InternalEpatchTestLanguage.g:2115:2: (this_JavaExecutable_0= ruleJavaExecutable | this_ExpressionExecutable_1= ruleExpressionExecutable )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==18) ) {
                alt38=1;
            }
            else if ( (LA38_0==RULE_STRING) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalEpatchTestLanguage.g:2116:3: this_JavaExecutable_0= ruleJavaExecutable
                    {

                    			newCompositeNode(grammarAccess.getExecutableAccess().getJavaExecutableParserRuleCall_0());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_JavaExecutable_0=ruleJavaExecutable();

                    state._fsp--;


                    			current = this_JavaExecutable_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalEpatchTestLanguage.g:2125:3: this_ExpressionExecutable_1= ruleExpressionExecutable
                    {

                    			newCompositeNode(grammarAccess.getExecutableAccess().getExpressionExecutableParserRuleCall_1());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ExpressionExecutable_1=ruleExpressionExecutable();

                    state._fsp--;


                    			current = this_ExpressionExecutable_1;
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
    // $ANTLR end "ruleExecutable"


    // $ANTLR start "entryRuleJavaExecutable"
    // InternalEpatchTestLanguage.g:2137:1: entryRuleJavaExecutable returns [EObject current=null] : iv_ruleJavaExecutable= ruleJavaExecutable EOF ;
    public final EObject entryRuleJavaExecutable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJavaExecutable = null;


        try {
            // InternalEpatchTestLanguage.g:2137:55: (iv_ruleJavaExecutable= ruleJavaExecutable EOF )
            // InternalEpatchTestLanguage.g:2138:2: iv_ruleJavaExecutable= ruleJavaExecutable EOF
            {
             newCompositeNode(grammarAccess.getJavaExecutableRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleJavaExecutable=ruleJavaExecutable();

            state._fsp--;

             current =iv_ruleJavaExecutable; 
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
    // $ANTLR end "entryRuleJavaExecutable"


    // $ANTLR start "ruleJavaExecutable"
    // InternalEpatchTestLanguage.g:2144:1: ruleJavaExecutable returns [EObject current=null] : (otherlv_0= 'java' ( (lv_method_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' ) ;
    public final EObject ruleJavaExecutable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_method_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

        try {
            // InternalEpatchTestLanguage.g:2145:1: ( (otherlv_0= 'java' ( (lv_method_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' ) )
            // InternalEpatchTestLanguage.g:2146:2: (otherlv_0= 'java' ( (lv_method_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' )
            {
            // InternalEpatchTestLanguage.g:2146:2: (otherlv_0= 'java' ( (lv_method_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' )
            // InternalEpatchTestLanguage.g:2147:3: otherlv_0= 'java' ( (lv_method_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,18,FollowSets000.FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getJavaExecutableAccess().getJavaKeyword_0());
            		
            // InternalEpatchTestLanguage.g:2151:3: ( (lv_method_1_0= RULE_ID ) )
            // InternalEpatchTestLanguage.g:2152:4: (lv_method_1_0= RULE_ID )
            {
            // InternalEpatchTestLanguage.g:2152:4: (lv_method_1_0= RULE_ID )
            // InternalEpatchTestLanguage.g:2153:5: lv_method_1_0= RULE_ID
            {
            lv_method_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_46); 

            					newLeafNode(lv_method_1_0, grammarAccess.getJavaExecutableAccess().getMethodIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJavaExecutableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"method",
            						lv_method_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,39,FollowSets000.FOLLOW_47); 

            			newLeafNode(otherlv_2, grammarAccess.getJavaExecutableAccess().getLeftParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,40,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getJavaExecutableAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleJavaExecutable"


    // $ANTLR start "entryRuleExpressionExecutable"
    // InternalEpatchTestLanguage.g:2181:1: entryRuleExpressionExecutable returns [EObject current=null] : iv_ruleExpressionExecutable= ruleExpressionExecutable EOF ;
    public final EObject entryRuleExpressionExecutable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionExecutable = null;


        try {
            // InternalEpatchTestLanguage.g:2181:61: (iv_ruleExpressionExecutable= ruleExpressionExecutable EOF )
            // InternalEpatchTestLanguage.g:2182:2: iv_ruleExpressionExecutable= ruleExpressionExecutable EOF
            {
             newCompositeNode(grammarAccess.getExpressionExecutableRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleExpressionExecutable=ruleExpressionExecutable();

            state._fsp--;

             current =iv_ruleExpressionExecutable; 
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
    // $ANTLR end "entryRuleExpressionExecutable"


    // $ANTLR start "ruleExpressionExecutable"
    // InternalEpatchTestLanguage.g:2188:1: ruleExpressionExecutable returns [EObject current=null] : ( (lv_exprstr_0_0= RULE_STRING ) ) ;
    public final EObject ruleExpressionExecutable() throws RecognitionException {
        EObject current = null;

        Token lv_exprstr_0_0=null;

        try {
            // InternalEpatchTestLanguage.g:2189:1: ( ( (lv_exprstr_0_0= RULE_STRING ) ) )
            // InternalEpatchTestLanguage.g:2190:2: ( (lv_exprstr_0_0= RULE_STRING ) )
            {
            // InternalEpatchTestLanguage.g:2190:2: ( (lv_exprstr_0_0= RULE_STRING ) )
            // InternalEpatchTestLanguage.g:2191:3: (lv_exprstr_0_0= RULE_STRING )
            {
            // InternalEpatchTestLanguage.g:2191:3: (lv_exprstr_0_0= RULE_STRING )
            // InternalEpatchTestLanguage.g:2192:4: lv_exprstr_0_0= RULE_STRING
            {
            lv_exprstr_0_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); 

            				newLeafNode(lv_exprstr_0_0, grammarAccess.getExpressionExecutableAccess().getExprstrSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getExpressionExecutableRule());
            				}
            				setWithLastConsumed(
            					current,
            					"exprstr",
            					lv_exprstr_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // $ANTLR end "ruleExpressionExecutable"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000440C000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000004404000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000004004000L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000C00010000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800010L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002804010L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000002004000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000E00010030L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000010000080L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000050000000L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000080000080L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00000000C0000000L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000C80010030L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000C00010030L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000C20010030L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000002012L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000001000004010L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000006001040020L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000006001000000L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000040020L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000010000000000L});
    }


}