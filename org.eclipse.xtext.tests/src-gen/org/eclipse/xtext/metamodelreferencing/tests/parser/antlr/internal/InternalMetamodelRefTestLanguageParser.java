package org.eclipse.xtext.metamodelreferencing.tests.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.metamodelreferencing.tests.services.MetamodelRefTestLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMetamodelRefTestLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalMetamodelRefTestLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMetamodelRefTestLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMetamodelRefTestLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMetamodelRefTestLanguage.g"; }



     	private MetamodelRefTestLanguageGrammarAccess grammarAccess;
     	
        public InternalMetamodelRefTestLanguageParser(TokenStream input, MetamodelRefTestLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Foo";	
       	}
       	
       	@Override
       	protected MetamodelRefTestLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleFoo"
    // InternalMetamodelRefTestLanguage.g:67:1: entryRuleFoo returns [EObject current=null] : iv_ruleFoo= ruleFoo EOF ;
    public final EObject entryRuleFoo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFoo = null;


        try {
            // InternalMetamodelRefTestLanguage.g:68:2: (iv_ruleFoo= ruleFoo EOF )
            // InternalMetamodelRefTestLanguage.g:69:2: iv_ruleFoo= ruleFoo EOF
            {
             newCompositeNode(grammarAccess.getFooRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleFoo=ruleFoo();

            state._fsp--;

             current =iv_ruleFoo; 
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
    // $ANTLR end "entryRuleFoo"


    // $ANTLR start "ruleFoo"
    // InternalMetamodelRefTestLanguage.g:76:1: ruleFoo returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_nameRefs_1_0= ruleNameRef ) )* ) ;
    public final EObject ruleFoo() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_nameRefs_1_0 = null;


         enterRule(); 
            
        try {
            // InternalMetamodelRefTestLanguage.g:79:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_nameRefs_1_0= ruleNameRef ) )* ) )
            // InternalMetamodelRefTestLanguage.g:80:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_nameRefs_1_0= ruleNameRef ) )* )
            {
            // InternalMetamodelRefTestLanguage.g:80:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_nameRefs_1_0= ruleNameRef ) )* )
            // InternalMetamodelRefTestLanguage.g:80:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_nameRefs_1_0= ruleNameRef ) )*
            {
            // InternalMetamodelRefTestLanguage.g:80:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMetamodelRefTestLanguage.g:81:1: (lv_name_0_0= RULE_ID )
            {
            // InternalMetamodelRefTestLanguage.g:81:1: (lv_name_0_0= RULE_ID )
            // InternalMetamodelRefTestLanguage.g:82:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_3); 

            			newLeafNode(lv_name_0_0, grammarAccess.getFooAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFooRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalMetamodelRefTestLanguage.g:98:2: ( (lv_nameRefs_1_0= ruleNameRef ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMetamodelRefTestLanguage.g:99:1: (lv_nameRefs_1_0= ruleNameRef )
            	    {
            	    // InternalMetamodelRefTestLanguage.g:99:1: (lv_nameRefs_1_0= ruleNameRef )
            	    // InternalMetamodelRefTestLanguage.g:100:3: lv_nameRefs_1_0= ruleNameRef
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFooAccess().getNameRefsNameRefParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_3);
            	    lv_nameRefs_1_0=ruleNameRef();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFooRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"nameRefs",
            	            		lv_nameRefs_1_0, 
            	            		"org.eclipse.xtext.metamodelreferencing.tests.MetamodelRefTestLanguage.NameRef");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleFoo"


    // $ANTLR start "entryRuleNameRef"
    // InternalMetamodelRefTestLanguage.g:124:1: entryRuleNameRef returns [EObject current=null] : iv_ruleNameRef= ruleNameRef EOF ;
    public final EObject entryRuleNameRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameRef = null;


        try {
            // InternalMetamodelRefTestLanguage.g:125:2: (iv_ruleNameRef= ruleNameRef EOF )
            // InternalMetamodelRefTestLanguage.g:126:2: iv_ruleNameRef= ruleNameRef EOF
            {
             newCompositeNode(grammarAccess.getNameRefRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNameRef=ruleNameRef();

            state._fsp--;

             current =iv_ruleNameRef; 
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
    // $ANTLR end "entryRuleNameRef"


    // $ANTLR start "ruleNameRef"
    // InternalMetamodelRefTestLanguage.g:133:1: ruleNameRef returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleNameRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // InternalMetamodelRefTestLanguage.g:136:28: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalMetamodelRefTestLanguage.g:137:1: ( (otherlv_0= RULE_ID ) )
            {
            // InternalMetamodelRefTestLanguage.g:137:1: ( (otherlv_0= RULE_ID ) )
            // InternalMetamodelRefTestLanguage.g:138:1: (otherlv_0= RULE_ID )
            {
            // InternalMetamodelRefTestLanguage.g:138:1: (otherlv_0= RULE_ID )
            // InternalMetamodelRefTestLanguage.g:139:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getNameRefRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            		newLeafNode(otherlv_0, grammarAccess.getNameRefAccess().getRuleParserRuleCrossReference_0()); 
            	

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
    // $ANTLR end "ruleNameRef"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000012L});
    }


}