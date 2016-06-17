package org.eclipse.xtext.testlanguages.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.testlanguages.services.PartialParserTestLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPartialParserTestLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'container'", "'{'", "'}'", "'nested'", "'children'", "','", "'->'", "'C'", "'('", "')'", "'abstract children'", "'F'", "'S'"
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


        public InternalPartialParserTestLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPartialParserTestLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPartialParserTestLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPartialParserTestLanguage.g"; }



     	private PartialParserTestLanguageGrammarAccess grammarAccess;
     	
        public InternalPartialParserTestLanguageParser(TokenStream input, PartialParserTestLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "SomeContainer";	
       	}
       	
       	@Override
       	protected PartialParserTestLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleSomeContainer"
    // InternalPartialParserTestLanguage.g:67:1: entryRuleSomeContainer returns [EObject current=null] : iv_ruleSomeContainer= ruleSomeContainer EOF ;
    public final EObject entryRuleSomeContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSomeContainer = null;


        try {
            // InternalPartialParserTestLanguage.g:68:2: (iv_ruleSomeContainer= ruleSomeContainer EOF )
            // InternalPartialParserTestLanguage.g:69:2: iv_ruleSomeContainer= ruleSomeContainer EOF
            {
             newCompositeNode(grammarAccess.getSomeContainerRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSomeContainer=ruleSomeContainer();

            state._fsp--;

             current =iv_ruleSomeContainer; 
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
    // $ANTLR end "entryRuleSomeContainer"


    // $ANTLR start "ruleSomeContainer"
    // InternalPartialParserTestLanguage.g:76:1: ruleSomeContainer returns [EObject current=null] : (otherlv_0= 'container' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_nested_3_0= ruleNested ) ) | ( (lv_content_4_0= ruleContent ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleSomeContainer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_nested_3_0 = null;

        EObject lv_content_4_0 = null;


         enterRule(); 
            
        try {
            // InternalPartialParserTestLanguage.g:79:28: ( (otherlv_0= 'container' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_nested_3_0= ruleNested ) ) | ( (lv_content_4_0= ruleContent ) ) )* otherlv_5= '}' ) )
            // InternalPartialParserTestLanguage.g:80:1: (otherlv_0= 'container' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_nested_3_0= ruleNested ) ) | ( (lv_content_4_0= ruleContent ) ) )* otherlv_5= '}' )
            {
            // InternalPartialParserTestLanguage.g:80:1: (otherlv_0= 'container' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_nested_3_0= ruleNested ) ) | ( (lv_content_4_0= ruleContent ) ) )* otherlv_5= '}' )
            // InternalPartialParserTestLanguage.g:80:3: otherlv_0= 'container' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_nested_3_0= ruleNested ) ) | ( (lv_content_4_0= ruleContent ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getSomeContainerAccess().getContainerKeyword_0());
                
            // InternalPartialParserTestLanguage.g:84:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalPartialParserTestLanguage.g:85:1: (lv_name_1_0= RULE_ID )
            {
            // InternalPartialParserTestLanguage.g:85:1: (lv_name_1_0= RULE_ID )
            // InternalPartialParserTestLanguage.g:86:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_4); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSomeContainerAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSomeContainerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_5); 

                	newLeafNode(otherlv_2, grammarAccess.getSomeContainerAccess().getLeftCurlyBracketKeyword_2());
                
            // InternalPartialParserTestLanguage.g:106:1: ( ( (lv_nested_3_0= ruleNested ) ) | ( (lv_content_4_0= ruleContent ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }
                else if ( (LA1_0==15||LA1_0==21) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPartialParserTestLanguage.g:106:2: ( (lv_nested_3_0= ruleNested ) )
            	    {
            	    // InternalPartialParserTestLanguage.g:106:2: ( (lv_nested_3_0= ruleNested ) )
            	    // InternalPartialParserTestLanguage.g:107:1: (lv_nested_3_0= ruleNested )
            	    {
            	    // InternalPartialParserTestLanguage.g:107:1: (lv_nested_3_0= ruleNested )
            	    // InternalPartialParserTestLanguage.g:108:3: lv_nested_3_0= ruleNested
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSomeContainerAccess().getNestedNestedParserRuleCall_3_0_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_nested_3_0=ruleNested();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSomeContainerRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"nested",
            	            		lv_nested_3_0, 
            	            		"org.eclipse.xtext.testlanguages.PartialParserTestLanguage.Nested");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalPartialParserTestLanguage.g:125:6: ( (lv_content_4_0= ruleContent ) )
            	    {
            	    // InternalPartialParserTestLanguage.g:125:6: ( (lv_content_4_0= ruleContent ) )
            	    // InternalPartialParserTestLanguage.g:126:1: (lv_content_4_0= ruleContent )
            	    {
            	    // InternalPartialParserTestLanguage.g:126:1: (lv_content_4_0= ruleContent )
            	    // InternalPartialParserTestLanguage.g:127:3: lv_content_4_0= ruleContent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSomeContainerAccess().getContentContentParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_content_4_0=ruleContent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSomeContainerRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"content",
            	            		lv_content_4_0, 
            	            		"org.eclipse.xtext.testlanguages.PartialParserTestLanguage.Content");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_5, grammarAccess.getSomeContainerAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleSomeContainer"


    // $ANTLR start "entryRuleNested"
    // InternalPartialParserTestLanguage.g:155:1: entryRuleNested returns [EObject current=null] : iv_ruleNested= ruleNested EOF ;
    public final EObject entryRuleNested() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNested = null;


        try {
            // InternalPartialParserTestLanguage.g:156:2: (iv_ruleNested= ruleNested EOF )
            // InternalPartialParserTestLanguage.g:157:2: iv_ruleNested= ruleNested EOF
            {
             newCompositeNode(grammarAccess.getNestedRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNested=ruleNested();

            state._fsp--;

             current =iv_ruleNested; 
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
    // $ANTLR end "entryRuleNested"


    // $ANTLR start "ruleNested"
    // InternalPartialParserTestLanguage.g:164:1: ruleNested returns [EObject current=null] : (otherlv_0= 'nested' otherlv_1= '{' ( (lv_nested_2_0= ruleSomeContainer ) )+ otherlv_3= '}' ) ;
    public final EObject ruleNested() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_nested_2_0 = null;


         enterRule(); 
            
        try {
            // InternalPartialParserTestLanguage.g:167:28: ( (otherlv_0= 'nested' otherlv_1= '{' ( (lv_nested_2_0= ruleSomeContainer ) )+ otherlv_3= '}' ) )
            // InternalPartialParserTestLanguage.g:168:1: (otherlv_0= 'nested' otherlv_1= '{' ( (lv_nested_2_0= ruleSomeContainer ) )+ otherlv_3= '}' )
            {
            // InternalPartialParserTestLanguage.g:168:1: (otherlv_0= 'nested' otherlv_1= '{' ( (lv_nested_2_0= ruleSomeContainer ) )+ otherlv_3= '}' )
            // InternalPartialParserTestLanguage.g:168:3: otherlv_0= 'nested' otherlv_1= '{' ( (lv_nested_2_0= ruleSomeContainer ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,14,FollowSets000.FOLLOW_4); 

                	newLeafNode(otherlv_0, grammarAccess.getNestedAccess().getNestedKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_6); 

                	newLeafNode(otherlv_1, grammarAccess.getNestedAccess().getLeftCurlyBracketKeyword_1());
                
            // InternalPartialParserTestLanguage.g:176:1: ( (lv_nested_2_0= ruleSomeContainer ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalPartialParserTestLanguage.g:177:1: (lv_nested_2_0= ruleSomeContainer )
            	    {
            	    // InternalPartialParserTestLanguage.g:177:1: (lv_nested_2_0= ruleSomeContainer )
            	    // InternalPartialParserTestLanguage.g:178:3: lv_nested_2_0= ruleSomeContainer
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNestedAccess().getNestedSomeContainerParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_7);
            	    lv_nested_2_0=ruleSomeContainer();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNestedRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"nested",
            	            		lv_nested_2_0, 
            	            		"org.eclipse.xtext.testlanguages.PartialParserTestLanguage.SomeContainer");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_3, grammarAccess.getNestedAccess().getRightCurlyBracketKeyword_3());
                

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
    // $ANTLR end "ruleNested"


    // $ANTLR start "entryRuleContent"
    // InternalPartialParserTestLanguage.g:206:1: entryRuleContent returns [EObject current=null] : iv_ruleContent= ruleContent EOF ;
    public final EObject entryRuleContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContent = null;


        try {
            // InternalPartialParserTestLanguage.g:207:2: (iv_ruleContent= ruleContent EOF )
            // InternalPartialParserTestLanguage.g:208:2: iv_ruleContent= ruleContent EOF
            {
             newCompositeNode(grammarAccess.getContentRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleContent=ruleContent();

            state._fsp--;

             current =iv_ruleContent; 
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
    // $ANTLR end "entryRuleContent"


    // $ANTLR start "ruleContent"
    // InternalPartialParserTestLanguage.g:215:1: ruleContent returns [EObject current=null] : (this_Children_0= ruleChildren | this_AbstractChildren_1= ruleAbstractChildren ) ;
    public final EObject ruleContent() throws RecognitionException {
        EObject current = null;

        EObject this_Children_0 = null;

        EObject this_AbstractChildren_1 = null;


         enterRule(); 
            
        try {
            // InternalPartialParserTestLanguage.g:218:28: ( (this_Children_0= ruleChildren | this_AbstractChildren_1= ruleAbstractChildren ) )
            // InternalPartialParserTestLanguage.g:219:1: (this_Children_0= ruleChildren | this_AbstractChildren_1= ruleAbstractChildren )
            {
            // InternalPartialParserTestLanguage.g:219:1: (this_Children_0= ruleChildren | this_AbstractChildren_1= ruleAbstractChildren )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            else if ( (LA3_0==21) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalPartialParserTestLanguage.g:220:5: this_Children_0= ruleChildren
                    {
                     
                            newCompositeNode(grammarAccess.getContentAccess().getChildrenParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Children_0=ruleChildren();

                    state._fsp--;

                     
                            current = this_Children_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalPartialParserTestLanguage.g:230:5: this_AbstractChildren_1= ruleAbstractChildren
                    {
                     
                            newCompositeNode(grammarAccess.getContentAccess().getAbstractChildrenParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_AbstractChildren_1=ruleAbstractChildren();

                    state._fsp--;

                     
                            current = this_AbstractChildren_1; 
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
    // $ANTLR end "ruleContent"


    // $ANTLR start "entryRuleChildren"
    // InternalPartialParserTestLanguage.g:246:1: entryRuleChildren returns [EObject current=null] : iv_ruleChildren= ruleChildren EOF ;
    public final EObject entryRuleChildren() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChildren = null;


        try {
            // InternalPartialParserTestLanguage.g:247:2: (iv_ruleChildren= ruleChildren EOF )
            // InternalPartialParserTestLanguage.g:248:2: iv_ruleChildren= ruleChildren EOF
            {
             newCompositeNode(grammarAccess.getChildrenRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleChildren=ruleChildren();

            state._fsp--;

             current =iv_ruleChildren; 
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
    // $ANTLR end "entryRuleChildren"


    // $ANTLR start "ruleChildren"
    // InternalPartialParserTestLanguage.g:255:1: ruleChildren returns [EObject current=null] : (otherlv_0= 'children' otherlv_1= '{' ( (lv_children_2_0= ruleChild ) ) (otherlv_3= ',' ( (lv_children_4_0= ruleChild ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleChildren() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_children_2_0 = null;

        EObject lv_children_4_0 = null;


         enterRule(); 
            
        try {
            // InternalPartialParserTestLanguage.g:258:28: ( (otherlv_0= 'children' otherlv_1= '{' ( (lv_children_2_0= ruleChild ) ) (otherlv_3= ',' ( (lv_children_4_0= ruleChild ) ) )* otherlv_5= '}' ) )
            // InternalPartialParserTestLanguage.g:259:1: (otherlv_0= 'children' otherlv_1= '{' ( (lv_children_2_0= ruleChild ) ) (otherlv_3= ',' ( (lv_children_4_0= ruleChild ) ) )* otherlv_5= '}' )
            {
            // InternalPartialParserTestLanguage.g:259:1: (otherlv_0= 'children' otherlv_1= '{' ( (lv_children_2_0= ruleChild ) ) (otherlv_3= ',' ( (lv_children_4_0= ruleChild ) ) )* otherlv_5= '}' )
            // InternalPartialParserTestLanguage.g:259:3: otherlv_0= 'children' otherlv_1= '{' ( (lv_children_2_0= ruleChild ) ) (otherlv_3= ',' ( (lv_children_4_0= ruleChild ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_4); 

                	newLeafNode(otherlv_0, grammarAccess.getChildrenAccess().getChildrenKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_8); 

                	newLeafNode(otherlv_1, grammarAccess.getChildrenAccess().getLeftCurlyBracketKeyword_1());
                
            // InternalPartialParserTestLanguage.g:267:1: ( (lv_children_2_0= ruleChild ) )
            // InternalPartialParserTestLanguage.g:268:1: (lv_children_2_0= ruleChild )
            {
            // InternalPartialParserTestLanguage.g:268:1: (lv_children_2_0= ruleChild )
            // InternalPartialParserTestLanguage.g:269:3: lv_children_2_0= ruleChild
            {
             
            	        newCompositeNode(grammarAccess.getChildrenAccess().getChildrenChildParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_9);
            lv_children_2_0=ruleChild();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getChildrenRule());
            	        }
                   		add(
                   			current, 
                   			"children",
                    		lv_children_2_0, 
                    		"org.eclipse.xtext.testlanguages.PartialParserTestLanguage.Child");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalPartialParserTestLanguage.g:285:2: (otherlv_3= ',' ( (lv_children_4_0= ruleChild ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalPartialParserTestLanguage.g:285:4: otherlv_3= ',' ( (lv_children_4_0= ruleChild ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_8); 

            	        	newLeafNode(otherlv_3, grammarAccess.getChildrenAccess().getCommaKeyword_3_0());
            	        
            	    // InternalPartialParserTestLanguage.g:289:1: ( (lv_children_4_0= ruleChild ) )
            	    // InternalPartialParserTestLanguage.g:290:1: (lv_children_4_0= ruleChild )
            	    {
            	    // InternalPartialParserTestLanguage.g:290:1: (lv_children_4_0= ruleChild )
            	    // InternalPartialParserTestLanguage.g:291:3: lv_children_4_0= ruleChild
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getChildrenAccess().getChildrenChildParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_9);
            	    lv_children_4_0=ruleChild();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getChildrenRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"children",
            	            		lv_children_4_0, 
            	            		"org.eclipse.xtext.testlanguages.PartialParserTestLanguage.Child");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_5, grammarAccess.getChildrenAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleChildren"


    // $ANTLR start "entryRuleChild"
    // InternalPartialParserTestLanguage.g:319:1: entryRuleChild returns [EObject current=null] : iv_ruleChild= ruleChild EOF ;
    public final EObject entryRuleChild() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChild = null;


        try {
            // InternalPartialParserTestLanguage.g:320:2: (iv_ruleChild= ruleChild EOF )
            // InternalPartialParserTestLanguage.g:321:2: iv_ruleChild= ruleChild EOF
            {
             newCompositeNode(grammarAccess.getChildRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleChild=ruleChild();

            state._fsp--;

             current =iv_ruleChild; 
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
    // $ANTLR end "entryRuleChild"


    // $ANTLR start "ruleChild"
    // InternalPartialParserTestLanguage.g:328:1: ruleChild returns [EObject current=null] : (otherlv_0= '->' otherlv_1= 'C' otherlv_2= '(' ( (lv_value_3_0= ruleNamed ) ) otherlv_4= ')' ) ;
    public final EObject ruleChild() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // InternalPartialParserTestLanguage.g:331:28: ( (otherlv_0= '->' otherlv_1= 'C' otherlv_2= '(' ( (lv_value_3_0= ruleNamed ) ) otherlv_4= ')' ) )
            // InternalPartialParserTestLanguage.g:332:1: (otherlv_0= '->' otherlv_1= 'C' otherlv_2= '(' ( (lv_value_3_0= ruleNamed ) ) otherlv_4= ')' )
            {
            // InternalPartialParserTestLanguage.g:332:1: (otherlv_0= '->' otherlv_1= 'C' otherlv_2= '(' ( (lv_value_3_0= ruleNamed ) ) otherlv_4= ')' )
            // InternalPartialParserTestLanguage.g:332:3: otherlv_0= '->' otherlv_1= 'C' otherlv_2= '(' ( (lv_value_3_0= ruleNamed ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_10); 

                	newLeafNode(otherlv_0, grammarAccess.getChildAccess().getHyphenMinusGreaterThanSignKeyword_0());
                
            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_11); 

                	newLeafNode(otherlv_1, grammarAccess.getChildAccess().getCKeyword_1());
                
            otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_2, grammarAccess.getChildAccess().getLeftParenthesisKeyword_2());
                
            // InternalPartialParserTestLanguage.g:344:1: ( (lv_value_3_0= ruleNamed ) )
            // InternalPartialParserTestLanguage.g:345:1: (lv_value_3_0= ruleNamed )
            {
            // InternalPartialParserTestLanguage.g:345:1: (lv_value_3_0= ruleNamed )
            // InternalPartialParserTestLanguage.g:346:3: lv_value_3_0= ruleNamed
            {
             
            	        newCompositeNode(grammarAccess.getChildAccess().getValueNamedParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_12);
            lv_value_3_0=ruleNamed();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getChildRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_3_0, 
                    		"org.eclipse.xtext.testlanguages.PartialParserTestLanguage.Named");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,20,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_4, grammarAccess.getChildAccess().getRightParenthesisKeyword_4());
                

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
    // $ANTLR end "ruleChild"


    // $ANTLR start "entryRuleAbstractChildren"
    // InternalPartialParserTestLanguage.g:374:1: entryRuleAbstractChildren returns [EObject current=null] : iv_ruleAbstractChildren= ruleAbstractChildren EOF ;
    public final EObject entryRuleAbstractChildren() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractChildren = null;


        try {
            // InternalPartialParserTestLanguage.g:375:2: (iv_ruleAbstractChildren= ruleAbstractChildren EOF )
            // InternalPartialParserTestLanguage.g:376:2: iv_ruleAbstractChildren= ruleAbstractChildren EOF
            {
             newCompositeNode(grammarAccess.getAbstractChildrenRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAbstractChildren=ruleAbstractChildren();

            state._fsp--;

             current =iv_ruleAbstractChildren; 
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
    // $ANTLR end "entryRuleAbstractChildren"


    // $ANTLR start "ruleAbstractChildren"
    // InternalPartialParserTestLanguage.g:383:1: ruleAbstractChildren returns [EObject current=null] : (otherlv_0= 'abstract children' otherlv_1= '{' ( (lv_abstractChildren_2_0= ruleAbstractChild ) )+ otherlv_3= '}' ) ;
    public final EObject ruleAbstractChildren() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_abstractChildren_2_0 = null;


         enterRule(); 
            
        try {
            // InternalPartialParserTestLanguage.g:386:28: ( (otherlv_0= 'abstract children' otherlv_1= '{' ( (lv_abstractChildren_2_0= ruleAbstractChild ) )+ otherlv_3= '}' ) )
            // InternalPartialParserTestLanguage.g:387:1: (otherlv_0= 'abstract children' otherlv_1= '{' ( (lv_abstractChildren_2_0= ruleAbstractChild ) )+ otherlv_3= '}' )
            {
            // InternalPartialParserTestLanguage.g:387:1: (otherlv_0= 'abstract children' otherlv_1= '{' ( (lv_abstractChildren_2_0= ruleAbstractChild ) )+ otherlv_3= '}' )
            // InternalPartialParserTestLanguage.g:387:3: otherlv_0= 'abstract children' otherlv_1= '{' ( (lv_abstractChildren_2_0= ruleAbstractChild ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_4); 

                	newLeafNode(otherlv_0, grammarAccess.getAbstractChildrenAccess().getAbstractChildrenKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_8); 

                	newLeafNode(otherlv_1, grammarAccess.getAbstractChildrenAccess().getLeftCurlyBracketKeyword_1());
                
            // InternalPartialParserTestLanguage.g:395:1: ( (lv_abstractChildren_2_0= ruleAbstractChild ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalPartialParserTestLanguage.g:396:1: (lv_abstractChildren_2_0= ruleAbstractChild )
            	    {
            	    // InternalPartialParserTestLanguage.g:396:1: (lv_abstractChildren_2_0= ruleAbstractChild )
            	    // InternalPartialParserTestLanguage.g:397:3: lv_abstractChildren_2_0= ruleAbstractChild
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAbstractChildrenAccess().getAbstractChildrenAbstractChildParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_13);
            	    lv_abstractChildren_2_0=ruleAbstractChild();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAbstractChildrenRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"abstractChildren",
            	            		lv_abstractChildren_2_0, 
            	            		"org.eclipse.xtext.testlanguages.PartialParserTestLanguage.AbstractChild");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_3, grammarAccess.getAbstractChildrenAccess().getRightCurlyBracketKeyword_3());
                

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
    // $ANTLR end "ruleAbstractChildren"


    // $ANTLR start "entryRuleAbstractChild"
    // InternalPartialParserTestLanguage.g:425:1: entryRuleAbstractChild returns [EObject current=null] : iv_ruleAbstractChild= ruleAbstractChild EOF ;
    public final EObject entryRuleAbstractChild() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractChild = null;


        try {
            // InternalPartialParserTestLanguage.g:426:2: (iv_ruleAbstractChild= ruleAbstractChild EOF )
            // InternalPartialParserTestLanguage.g:427:2: iv_ruleAbstractChild= ruleAbstractChild EOF
            {
             newCompositeNode(grammarAccess.getAbstractChildRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAbstractChild=ruleAbstractChild();

            state._fsp--;

             current =iv_ruleAbstractChild; 
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
    // $ANTLR end "entryRuleAbstractChild"


    // $ANTLR start "ruleAbstractChild"
    // InternalPartialParserTestLanguage.g:434:1: ruleAbstractChild returns [EObject current=null] : (this_FirstConcrete_0= ruleFirstConcrete | this_SecondConcrete_1= ruleSecondConcrete ) ;
    public final EObject ruleAbstractChild() throws RecognitionException {
        EObject current = null;

        EObject this_FirstConcrete_0 = null;

        EObject this_SecondConcrete_1 = null;


         enterRule(); 
            
        try {
            // InternalPartialParserTestLanguage.g:437:28: ( (this_FirstConcrete_0= ruleFirstConcrete | this_SecondConcrete_1= ruleSecondConcrete ) )
            // InternalPartialParserTestLanguage.g:438:1: (this_FirstConcrete_0= ruleFirstConcrete | this_SecondConcrete_1= ruleSecondConcrete )
            {
            // InternalPartialParserTestLanguage.g:438:1: (this_FirstConcrete_0= ruleFirstConcrete | this_SecondConcrete_1= ruleSecondConcrete )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==22) ) {
                    int LA6_2 = input.LA(3);

                    if ( (LA6_2==19) ) {
                        alt6=1;
                    }
                    else if ( (LA6_2==23) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalPartialParserTestLanguage.g:439:5: this_FirstConcrete_0= ruleFirstConcrete
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractChildAccess().getFirstConcreteParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_FirstConcrete_0=ruleFirstConcrete();

                    state._fsp--;

                     
                            current = this_FirstConcrete_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalPartialParserTestLanguage.g:449:5: this_SecondConcrete_1= ruleSecondConcrete
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractChildAccess().getSecondConcreteParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_SecondConcrete_1=ruleSecondConcrete();

                    state._fsp--;

                     
                            current = this_SecondConcrete_1; 
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
    // $ANTLR end "ruleAbstractChild"


    // $ANTLR start "entryRuleFirstConcrete"
    // InternalPartialParserTestLanguage.g:465:1: entryRuleFirstConcrete returns [EObject current=null] : iv_ruleFirstConcrete= ruleFirstConcrete EOF ;
    public final EObject entryRuleFirstConcrete() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFirstConcrete = null;


        try {
            // InternalPartialParserTestLanguage.g:466:2: (iv_ruleFirstConcrete= ruleFirstConcrete EOF )
            // InternalPartialParserTestLanguage.g:467:2: iv_ruleFirstConcrete= ruleFirstConcrete EOF
            {
             newCompositeNode(grammarAccess.getFirstConcreteRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleFirstConcrete=ruleFirstConcrete();

            state._fsp--;

             current =iv_ruleFirstConcrete; 
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
    // $ANTLR end "entryRuleFirstConcrete"


    // $ANTLR start "ruleFirstConcrete"
    // InternalPartialParserTestLanguage.g:474:1: ruleFirstConcrete returns [EObject current=null] : (otherlv_0= '->' otherlv_1= 'F' otherlv_2= '(' ( (lv_value_3_0= ruleNamed ) ) ( (otherlv_4= RULE_ID ) )? otherlv_5= ')' ) ;
    public final EObject ruleFirstConcrete() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // InternalPartialParserTestLanguage.g:477:28: ( (otherlv_0= '->' otherlv_1= 'F' otherlv_2= '(' ( (lv_value_3_0= ruleNamed ) ) ( (otherlv_4= RULE_ID ) )? otherlv_5= ')' ) )
            // InternalPartialParserTestLanguage.g:478:1: (otherlv_0= '->' otherlv_1= 'F' otherlv_2= '(' ( (lv_value_3_0= ruleNamed ) ) ( (otherlv_4= RULE_ID ) )? otherlv_5= ')' )
            {
            // InternalPartialParserTestLanguage.g:478:1: (otherlv_0= '->' otherlv_1= 'F' otherlv_2= '(' ( (lv_value_3_0= ruleNamed ) ) ( (otherlv_4= RULE_ID ) )? otherlv_5= ')' )
            // InternalPartialParserTestLanguage.g:478:3: otherlv_0= '->' otherlv_1= 'F' otherlv_2= '(' ( (lv_value_3_0= ruleNamed ) ) ( (otherlv_4= RULE_ID ) )? otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_14); 

                	newLeafNode(otherlv_0, grammarAccess.getFirstConcreteAccess().getHyphenMinusGreaterThanSignKeyword_0());
                
            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_11); 

                	newLeafNode(otherlv_1, grammarAccess.getFirstConcreteAccess().getFKeyword_1());
                
            otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_2, grammarAccess.getFirstConcreteAccess().getLeftParenthesisKeyword_2());
                
            // InternalPartialParserTestLanguage.g:490:1: ( (lv_value_3_0= ruleNamed ) )
            // InternalPartialParserTestLanguage.g:491:1: (lv_value_3_0= ruleNamed )
            {
            // InternalPartialParserTestLanguage.g:491:1: (lv_value_3_0= ruleNamed )
            // InternalPartialParserTestLanguage.g:492:3: lv_value_3_0= ruleNamed
            {
             
            	        newCompositeNode(grammarAccess.getFirstConcreteAccess().getValueNamedParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_15);
            lv_value_3_0=ruleNamed();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFirstConcreteRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_3_0, 
                    		"org.eclipse.xtext.testlanguages.PartialParserTestLanguage.Named");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalPartialParserTestLanguage.g:508:2: ( (otherlv_4= RULE_ID ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalPartialParserTestLanguage.g:509:1: (otherlv_4= RULE_ID )
                    {
                    // InternalPartialParserTestLanguage.g:509:1: (otherlv_4= RULE_ID )
                    // InternalPartialParserTestLanguage.g:510:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getFirstConcreteRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_12); 

                    		newLeafNode(otherlv_4, grammarAccess.getFirstConcreteAccess().getReferencedContainerSomeContainerCrossReference_4_0()); 
                    	

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,20,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_5, grammarAccess.getFirstConcreteAccess().getRightParenthesisKeyword_5());
                

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
    // $ANTLR end "ruleFirstConcrete"


    // $ANTLR start "entryRuleSecondConcrete"
    // InternalPartialParserTestLanguage.g:533:1: entryRuleSecondConcrete returns [EObject current=null] : iv_ruleSecondConcrete= ruleSecondConcrete EOF ;
    public final EObject entryRuleSecondConcrete() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecondConcrete = null;


        try {
            // InternalPartialParserTestLanguage.g:534:2: (iv_ruleSecondConcrete= ruleSecondConcrete EOF )
            // InternalPartialParserTestLanguage.g:535:2: iv_ruleSecondConcrete= ruleSecondConcrete EOF
            {
             newCompositeNode(grammarAccess.getSecondConcreteRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSecondConcrete=ruleSecondConcrete();

            state._fsp--;

             current =iv_ruleSecondConcrete; 
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
    // $ANTLR end "entryRuleSecondConcrete"


    // $ANTLR start "ruleSecondConcrete"
    // InternalPartialParserTestLanguage.g:542:1: ruleSecondConcrete returns [EObject current=null] : (otherlv_0= '->' otherlv_1= 'F' otherlv_2= 'S' otherlv_3= '(' ( (lv_value_4_0= ruleNamed ) ) ( (otherlv_5= RULE_ID ) )? otherlv_6= ')' ) ;
    public final EObject ruleSecondConcrete() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_value_4_0 = null;


         enterRule(); 
            
        try {
            // InternalPartialParserTestLanguage.g:545:28: ( (otherlv_0= '->' otherlv_1= 'F' otherlv_2= 'S' otherlv_3= '(' ( (lv_value_4_0= ruleNamed ) ) ( (otherlv_5= RULE_ID ) )? otherlv_6= ')' ) )
            // InternalPartialParserTestLanguage.g:546:1: (otherlv_0= '->' otherlv_1= 'F' otherlv_2= 'S' otherlv_3= '(' ( (lv_value_4_0= ruleNamed ) ) ( (otherlv_5= RULE_ID ) )? otherlv_6= ')' )
            {
            // InternalPartialParserTestLanguage.g:546:1: (otherlv_0= '->' otherlv_1= 'F' otherlv_2= 'S' otherlv_3= '(' ( (lv_value_4_0= ruleNamed ) ) ( (otherlv_5= RULE_ID ) )? otherlv_6= ')' )
            // InternalPartialParserTestLanguage.g:546:3: otherlv_0= '->' otherlv_1= 'F' otherlv_2= 'S' otherlv_3= '(' ( (lv_value_4_0= ruleNamed ) ) ( (otherlv_5= RULE_ID ) )? otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_14); 

                	newLeafNode(otherlv_0, grammarAccess.getSecondConcreteAccess().getHyphenMinusGreaterThanSignKeyword_0());
                
            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_16); 

                	newLeafNode(otherlv_1, grammarAccess.getSecondConcreteAccess().getFKeyword_1());
                
            otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_11); 

                	newLeafNode(otherlv_2, grammarAccess.getSecondConcreteAccess().getSKeyword_2());
                
            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_3, grammarAccess.getSecondConcreteAccess().getLeftParenthesisKeyword_3());
                
            // InternalPartialParserTestLanguage.g:562:1: ( (lv_value_4_0= ruleNamed ) )
            // InternalPartialParserTestLanguage.g:563:1: (lv_value_4_0= ruleNamed )
            {
            // InternalPartialParserTestLanguage.g:563:1: (lv_value_4_0= ruleNamed )
            // InternalPartialParserTestLanguage.g:564:3: lv_value_4_0= ruleNamed
            {
             
            	        newCompositeNode(grammarAccess.getSecondConcreteAccess().getValueNamedParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_15);
            lv_value_4_0=ruleNamed();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSecondConcreteRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_4_0, 
                    		"org.eclipse.xtext.testlanguages.PartialParserTestLanguage.Named");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalPartialParserTestLanguage.g:580:2: ( (otherlv_5= RULE_ID ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalPartialParserTestLanguage.g:581:1: (otherlv_5= RULE_ID )
                    {
                    // InternalPartialParserTestLanguage.g:581:1: (otherlv_5= RULE_ID )
                    // InternalPartialParserTestLanguage.g:582:3: otherlv_5= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSecondConcreteRule());
                    	        }
                            
                    otherlv_5=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_12); 

                    		newLeafNode(otherlv_5, grammarAccess.getSecondConcreteAccess().getReferencedChildrenChildCrossReference_5_0()); 
                    	

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,20,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_6, grammarAccess.getSecondConcreteAccess().getRightParenthesisKeyword_6());
                

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
    // $ANTLR end "ruleSecondConcrete"


    // $ANTLR start "entryRuleNamed"
    // InternalPartialParserTestLanguage.g:605:1: entryRuleNamed returns [EObject current=null] : iv_ruleNamed= ruleNamed EOF ;
    public final EObject entryRuleNamed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamed = null;


        try {
            // InternalPartialParserTestLanguage.g:606:2: (iv_ruleNamed= ruleNamed EOF )
            // InternalPartialParserTestLanguage.g:607:2: iv_ruleNamed= ruleNamed EOF
            {
             newCompositeNode(grammarAccess.getNamedRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNamed=ruleNamed();

            state._fsp--;

             current =iv_ruleNamed; 
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
    // $ANTLR end "entryRuleNamed"


    // $ANTLR start "ruleNamed"
    // InternalPartialParserTestLanguage.g:614:1: ruleNamed returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleNamed() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // InternalPartialParserTestLanguage.g:617:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalPartialParserTestLanguage.g:618:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalPartialParserTestLanguage.g:618:1: ( (lv_name_0_0= RULE_ID ) )
            // InternalPartialParserTestLanguage.g:619:1: (lv_name_0_0= RULE_ID )
            {
            // InternalPartialParserTestLanguage.g:619:1: (lv_name_0_0= RULE_ID )
            // InternalPartialParserTestLanguage.g:620:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            			newLeafNode(lv_name_0_0, grammarAccess.getNamedAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNamedRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

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
    // $ANTLR end "ruleNamed"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000020E000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002800L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000012000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000022000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100010L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    }


}