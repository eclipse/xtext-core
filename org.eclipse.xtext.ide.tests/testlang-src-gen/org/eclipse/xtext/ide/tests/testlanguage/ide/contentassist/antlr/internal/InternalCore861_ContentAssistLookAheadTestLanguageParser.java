package org.eclipse.xtext.ide.tests.testlanguage.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.eclipse.xtext.ide.tests.testlanguage.services.Core861_ContentAssistLookAheadTestLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalCore861_ContentAssistLookAheadTestLanguageParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'private'", "'public'", "';'", "'='", "'('", "')'", "'{'", "'}'", "'int'", "'.'", "'return'", "'@'", "','"
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

    	public void setGrammarAccess(Core861_ContentAssistLookAheadTestLanguageGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleMember"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:58:1: entryRuleMember : ruleMember EOF ;
    public final void entryRuleMember() throws RecognitionException {
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:59:1: ( ruleMember EOF )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:60:1: ruleMember EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMemberRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMember();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMemberRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMember"


    // $ANTLR start "ruleMember"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:67:1: ruleMember : ( ( rule__Member__Alternatives ) ) ;
    public final void ruleMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:71:2: ( ( ( rule__Member__Alternatives ) ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:72:2: ( ( rule__Member__Alternatives ) )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:72:2: ( ( rule__Member__Alternatives ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:73:3: ( rule__Member__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMemberAccess().getAlternatives()); 
            }
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:74:3: ( rule__Member__Alternatives )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:74:4: rule__Member__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Member__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMemberAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMember"


    // $ANTLR start "entryRuleFieldDecl"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:83:1: entryRuleFieldDecl : ruleFieldDecl EOF ;
    public final void entryRuleFieldDecl() throws RecognitionException {
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:84:1: ( ruleFieldDecl EOF )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:85:1: ruleFieldDecl EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleFieldDecl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldDeclRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFieldDecl"


    // $ANTLR start "ruleFieldDecl"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:92:1: ruleFieldDecl : ( ( rule__FieldDecl__Group__0 ) ) ;
    public final void ruleFieldDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:96:2: ( ( ( rule__FieldDecl__Group__0 ) ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:97:2: ( ( rule__FieldDecl__Group__0 ) )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:97:2: ( ( rule__FieldDecl__Group__0 ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:98:3: ( rule__FieldDecl__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldDeclAccess().getGroup()); 
            }
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:99:3: ( rule__FieldDecl__Group__0 )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:99:4: rule__FieldDecl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FieldDecl__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldDeclAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFieldDecl"


    // $ANTLR start "entryRuleMethodDecl"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:108:1: entryRuleMethodDecl : ruleMethodDecl EOF ;
    public final void entryRuleMethodDecl() throws RecognitionException {
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:109:1: ( ruleMethodDecl EOF )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:110:1: ruleMethodDecl EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMethodDecl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodDeclRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMethodDecl"


    // $ANTLR start "ruleMethodDecl"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:117:1: ruleMethodDecl : ( ( rule__MethodDecl__Group__0 ) ) ;
    public final void ruleMethodDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:121:2: ( ( ( rule__MethodDecl__Group__0 ) ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:122:2: ( ( rule__MethodDecl__Group__0 ) )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:122:2: ( ( rule__MethodDecl__Group__0 ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:123:3: ( rule__MethodDecl__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodDeclAccess().getGroup()); 
            }
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:124:3: ( rule__MethodDecl__Group__0 )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:124:4: rule__MethodDecl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MethodDecl__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodDeclAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMethodDecl"


    // $ANTLR start "entryRuleType"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:133:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:134:1: ( ruleType EOF )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:135:1: ruleType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:142:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:146:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:147:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:147:2: ( ( rule__Type__Alternatives ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:148:3: ( rule__Type__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getAlternatives()); 
            }
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:149:3: ( rule__Type__Alternatives )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:149:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:158:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:159:1: ( ruleQualifiedName EOF )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:160:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:167:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:171:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:172:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:172:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:173:3: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:174:3: ( rule__QualifiedName__Group__0 )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:174:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleStatement"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:183:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:184:1: ( ruleStatement EOF )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:185:1: ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:192:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:196:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:197:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:197:2: ( ( rule__Statement__Alternatives ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:198:3: ( rule__Statement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getAlternatives()); 
            }
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:199:3: ( rule__Statement__Alternatives )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:199:4: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleAssignmentStatement"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:208:1: entryRuleAssignmentStatement : ruleAssignmentStatement EOF ;
    public final void entryRuleAssignmentStatement() throws RecognitionException {
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:209:1: ( ruleAssignmentStatement EOF )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:210:1: ruleAssignmentStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAssignmentStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentStatementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAssignmentStatement"


    // $ANTLR start "ruleAssignmentStatement"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:217:1: ruleAssignmentStatement : ( ( rule__AssignmentStatement__Group__0 ) ) ;
    public final void ruleAssignmentStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:221:2: ( ( ( rule__AssignmentStatement__Group__0 ) ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:222:2: ( ( rule__AssignmentStatement__Group__0 ) )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:222:2: ( ( rule__AssignmentStatement__Group__0 ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:223:3: ( rule__AssignmentStatement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentStatementAccess().getGroup()); 
            }
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:224:3: ( rule__AssignmentStatement__Group__0 )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:224:4: rule__AssignmentStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AssignmentStatement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentStatementAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssignmentStatement"


    // $ANTLR start "entryRuleFeatureCall"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:233:1: entryRuleFeatureCall : ruleFeatureCall EOF ;
    public final void entryRuleFeatureCall() throws RecognitionException {
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:234:1: ( ruleFeatureCall EOF )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:235:1: ruleFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureCallRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleFeatureCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureCallRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFeatureCall"


    // $ANTLR start "ruleFeatureCall"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:242:1: ruleFeatureCall : ( ( rule__FeatureCall__Group__0 ) ) ;
    public final void ruleFeatureCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:246:2: ( ( ( rule__FeatureCall__Group__0 ) ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:247:2: ( ( rule__FeatureCall__Group__0 ) )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:247:2: ( ( rule__FeatureCall__Group__0 ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:248:3: ( rule__FeatureCall__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureCallAccess().getGroup()); 
            }
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:249:3: ( rule__FeatureCall__Group__0 )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:249:4: rule__FeatureCall__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FeatureCall__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureCallAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeatureCall"


    // $ANTLR start "entryRuleAnnotation"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:258:1: entryRuleAnnotation : ruleAnnotation EOF ;
    public final void entryRuleAnnotation() throws RecognitionException {
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:259:1: ( ruleAnnotation EOF )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:260:1: ruleAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:267:1: ruleAnnotation : ( ( rule__Annotation__Group__0 ) ) ;
    public final void ruleAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:271:2: ( ( ( rule__Annotation__Group__0 ) ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:272:2: ( ( rule__Annotation__Group__0 ) )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:272:2: ( ( rule__Annotation__Group__0 ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:273:3: ( rule__Annotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getGroup()); 
            }
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:274:3: ( rule__Annotation__Group__0 )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:274:4: rule__Annotation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Annotation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "rule__Member__Alternatives"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:282:1: rule__Member__Alternatives : ( ( ruleFieldDecl ) | ( ruleMethodDecl ) );
    public final void rule__Member__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:286:1: ( ( ruleFieldDecl ) | ( ruleMethodDecl ) )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:287:2: ( ruleFieldDecl )
                    {
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:287:2: ( ruleFieldDecl )
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:288:3: ruleFieldDecl
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMemberAccess().getFieldDeclParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleFieldDecl();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMemberAccess().getFieldDeclParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:293:2: ( ruleMethodDecl )
                    {
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:293:2: ( ruleMethodDecl )
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:294:3: ruleMethodDecl
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMemberAccess().getMethodDeclParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleMethodDecl();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMemberAccess().getMethodDeclParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__Alternatives"


    // $ANTLR start "rule__FieldDecl__ModifierAlternatives_1_0"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:303:1: rule__FieldDecl__ModifierAlternatives_1_0 : ( ( 'private' ) | ( 'public' ) );
    public final void rule__FieldDecl__ModifierAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:307:1: ( ( 'private' ) | ( 'public' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:308:2: ( 'private' )
                    {
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:308:2: ( 'private' )
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:309:3: 'private'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFieldDeclAccess().getModifierPrivateKeyword_1_0_0()); 
                    }
                    match(input,11,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFieldDeclAccess().getModifierPrivateKeyword_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:314:2: ( 'public' )
                    {
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:314:2: ( 'public' )
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:315:3: 'public'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFieldDeclAccess().getModifierPublicKeyword_1_0_1()); 
                    }
                    match(input,12,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFieldDeclAccess().getModifierPublicKeyword_1_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDecl__ModifierAlternatives_1_0"


    // $ANTLR start "rule__MethodDecl__ModifierAlternatives_1_0"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:324:1: rule__MethodDecl__ModifierAlternatives_1_0 : ( ( 'private' ) | ( 'public' ) );
    public final void rule__MethodDecl__ModifierAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:328:1: ( ( 'private' ) | ( 'public' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:329:2: ( 'private' )
                    {
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:329:2: ( 'private' )
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:330:3: 'private'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMethodDeclAccess().getModifierPrivateKeyword_1_0_0()); 
                    }
                    match(input,11,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMethodDeclAccess().getModifierPrivateKeyword_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:335:2: ( 'public' )
                    {
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:335:2: ( 'public' )
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:336:3: 'public'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMethodDeclAccess().getModifierPublicKeyword_1_0_1()); 
                    }
                    match(input,12,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMethodDeclAccess().getModifierPublicKeyword_1_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDecl__ModifierAlternatives_1_0"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:345:1: rule__Type__Alternatives : ( ( ( rule__Type__Group_0__0 ) ) | ( ( rule__Type__Group_1__0 ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:349:1: ( ( ( rule__Type__Group_0__0 ) ) | ( ( rule__Type__Group_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:350:2: ( ( rule__Type__Group_0__0 ) )
                    {
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:350:2: ( ( rule__Type__Group_0__0 ) )
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:351:3: ( rule__Type__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getGroup_0()); 
                    }
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:352:3: ( rule__Type__Group_0__0 )
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:352:4: rule__Type__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:356:2: ( ( rule__Type__Group_1__0 ) )
                    {
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:356:2: ( ( rule__Type__Group_1__0 ) )
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:357:3: ( rule__Type__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getGroup_1()); 
                    }
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:358:3: ( rule__Type__Group_1__0 )
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:358:4: rule__Type__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:366:1: rule__Statement__Alternatives : ( ( ruleAssignmentStatement ) | ( ( rule__Statement__Group_1__0 ) ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:370:1: ( ( ruleAssignmentStatement ) | ( ( rule__Statement__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==21) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:371:2: ( ruleAssignmentStatement )
                    {
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:371:2: ( ruleAssignmentStatement )
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:372:3: ruleAssignmentStatement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getAssignmentStatementParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleAssignmentStatement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getAssignmentStatementParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:377:2: ( ( rule__Statement__Group_1__0 ) )
                    {
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:377:2: ( ( rule__Statement__Group_1__0 ) )
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:378:3: ( rule__Statement__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroup_1()); 
                    }
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:379:3: ( rule__Statement__Group_1__0 )
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:379:4: rule__Statement__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__FieldDecl__Group__0"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:387:1: rule__FieldDecl__Group__0 : rule__FieldDecl__Group__0__Impl rule__FieldDecl__Group__1 ;
    public final void rule__FieldDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:391:1: ( rule__FieldDecl__Group__0__Impl rule__FieldDecl__Group__1 )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:392:2: rule__FieldDecl__Group__0__Impl rule__FieldDecl__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__FieldDecl__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FieldDecl__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDecl__Group__0"


    // $ANTLR start "rule__FieldDecl__Group__0__Impl"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:399:1: rule__FieldDecl__Group__0__Impl : ( ( rule__FieldDecl__AnnotationsAssignment_0 )* ) ;
    public final void rule__FieldDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:403:1: ( ( ( rule__FieldDecl__AnnotationsAssignment_0 )* ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:404:1: ( ( rule__FieldDecl__AnnotationsAssignment_0 )* )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:404:1: ( ( rule__FieldDecl__AnnotationsAssignment_0 )* )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:405:2: ( rule__FieldDecl__AnnotationsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldDeclAccess().getAnnotationsAssignment_0()); 
            }
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:406:2: ( rule__FieldDecl__AnnotationsAssignment_0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==22) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalCore861_ContentAssistLookAheadTestLanguage.g:406:3: rule__FieldDecl__AnnotationsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__FieldDecl__AnnotationsAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldDeclAccess().getAnnotationsAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDecl__Group__0__Impl"


    // $ANTLR start "rule__FieldDecl__Group__1"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:414:1: rule__FieldDecl__Group__1 : rule__FieldDecl__Group__1__Impl rule__FieldDecl__Group__2 ;
    public final void rule__FieldDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:418:1: ( rule__FieldDecl__Group__1__Impl rule__FieldDecl__Group__2 )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:419:2: rule__FieldDecl__Group__1__Impl rule__FieldDecl__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__FieldDecl__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FieldDecl__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDecl__Group__1"


    // $ANTLR start "rule__FieldDecl__Group__1__Impl"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:426:1: rule__FieldDecl__Group__1__Impl : ( ( rule__FieldDecl__ModifierAssignment_1 )? ) ;
    public final void rule__FieldDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:430:1: ( ( ( rule__FieldDecl__ModifierAssignment_1 )? ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:431:1: ( ( rule__FieldDecl__ModifierAssignment_1 )? )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:431:1: ( ( rule__FieldDecl__ModifierAssignment_1 )? )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:432:2: ( rule__FieldDecl__ModifierAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldDeclAccess().getModifierAssignment_1()); 
            }
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:433:2: ( rule__FieldDecl__ModifierAssignment_1 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=11 && LA7_0<=12)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:433:3: rule__FieldDecl__ModifierAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldDecl__ModifierAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldDeclAccess().getModifierAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDecl__Group__1__Impl"


    // $ANTLR start "rule__FieldDecl__Group__2"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:441:1: rule__FieldDecl__Group__2 : rule__FieldDecl__Group__2__Impl rule__FieldDecl__Group__3 ;
    public final void rule__FieldDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:445:1: ( rule__FieldDecl__Group__2__Impl rule__FieldDecl__Group__3 )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:446:2: rule__FieldDecl__Group__2__Impl rule__FieldDecl__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__FieldDecl__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FieldDecl__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDecl__Group__2"


    // $ANTLR start "rule__FieldDecl__Group__2__Impl"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:453:1: rule__FieldDecl__Group__2__Impl : ( ( rule__FieldDecl__TypeAssignment_2 ) ) ;
    public final void rule__FieldDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:457:1: ( ( ( rule__FieldDecl__TypeAssignment_2 ) ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:458:1: ( ( rule__FieldDecl__TypeAssignment_2 ) )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:458:1: ( ( rule__FieldDecl__TypeAssignment_2 ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:459:2: ( rule__FieldDecl__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldDeclAccess().getTypeAssignment_2()); 
            }
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:460:2: ( rule__FieldDecl__TypeAssignment_2 )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:460:3: rule__FieldDecl__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FieldDecl__TypeAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldDeclAccess().getTypeAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDecl__Group__2__Impl"


    // $ANTLR start "rule__FieldDecl__Group__3"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:468:1: rule__FieldDecl__Group__3 : rule__FieldDecl__Group__3__Impl rule__FieldDecl__Group__4 ;
    public final void rule__FieldDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:472:1: ( rule__FieldDecl__Group__3__Impl rule__FieldDecl__Group__4 )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:473:2: rule__FieldDecl__Group__3__Impl rule__FieldDecl__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__FieldDecl__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FieldDecl__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDecl__Group__3"


    // $ANTLR start "rule__FieldDecl__Group__3__Impl"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:480:1: rule__FieldDecl__Group__3__Impl : ( ( rule__FieldDecl__NameAssignment_3 ) ) ;
    public final void rule__FieldDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:484:1: ( ( ( rule__FieldDecl__NameAssignment_3 ) ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:485:1: ( ( rule__FieldDecl__NameAssignment_3 ) )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:485:1: ( ( rule__FieldDecl__NameAssignment_3 ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:486:2: ( rule__FieldDecl__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldDeclAccess().getNameAssignment_3()); 
            }
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:487:2: ( rule__FieldDecl__NameAssignment_3 )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:487:3: rule__FieldDecl__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__FieldDecl__NameAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldDeclAccess().getNameAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDecl__Group__3__Impl"


    // $ANTLR start "rule__FieldDecl__Group__4"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:495:1: rule__FieldDecl__Group__4 : rule__FieldDecl__Group__4__Impl rule__FieldDecl__Group__5 ;
    public final void rule__FieldDecl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:499:1: ( rule__FieldDecl__Group__4__Impl rule__FieldDecl__Group__5 )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:500:2: rule__FieldDecl__Group__4__Impl rule__FieldDecl__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__FieldDecl__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FieldDecl__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDecl__Group__4"


    // $ANTLR start "rule__FieldDecl__Group__4__Impl"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:507:1: rule__FieldDecl__Group__4__Impl : ( ( rule__FieldDecl__Group_4__0 )? ) ;
    public final void rule__FieldDecl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:511:1: ( ( ( rule__FieldDecl__Group_4__0 )? ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:512:1: ( ( rule__FieldDecl__Group_4__0 )? )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:512:1: ( ( rule__FieldDecl__Group_4__0 )? )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:513:2: ( rule__FieldDecl__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldDeclAccess().getGroup_4()); 
            }
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:514:2: ( rule__FieldDecl__Group_4__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==14) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:514:3: rule__FieldDecl__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldDecl__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldDeclAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDecl__Group__4__Impl"


    // $ANTLR start "rule__FieldDecl__Group__5"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:522:1: rule__FieldDecl__Group__5 : rule__FieldDecl__Group__5__Impl ;
    public final void rule__FieldDecl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:526:1: ( rule__FieldDecl__Group__5__Impl )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:527:2: rule__FieldDecl__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FieldDecl__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDecl__Group__5"


    // $ANTLR start "rule__FieldDecl__Group__5__Impl"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:533:1: rule__FieldDecl__Group__5__Impl : ( ';' ) ;
    public final void rule__FieldDecl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:537:1: ( ( ';' ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:538:1: ( ';' )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:538:1: ( ';' )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:539:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldDeclAccess().getSemicolonKeyword_5()); 
            }
            match(input,13,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldDeclAccess().getSemicolonKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDecl__Group__5__Impl"


    // $ANTLR start "rule__FieldDecl__Group_4__0"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:549:1: rule__FieldDecl__Group_4__0 : rule__FieldDecl__Group_4__0__Impl rule__FieldDecl__Group_4__1 ;
    public final void rule__FieldDecl__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:553:1: ( rule__FieldDecl__Group_4__0__Impl rule__FieldDecl__Group_4__1 )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:554:2: rule__FieldDecl__Group_4__0__Impl rule__FieldDecl__Group_4__1
            {
            pushFollow(FOLLOW_7);
            rule__FieldDecl__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FieldDecl__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDecl__Group_4__0"


    // $ANTLR start "rule__FieldDecl__Group_4__0__Impl"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:561:1: rule__FieldDecl__Group_4__0__Impl : ( '=' ) ;
    public final void rule__FieldDecl__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:565:1: ( ( '=' ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:566:1: ( '=' )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:566:1: ( '=' )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:567:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldDeclAccess().getEqualsSignKeyword_4_0()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldDeclAccess().getEqualsSignKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDecl__Group_4__0__Impl"


    // $ANTLR start "rule__FieldDecl__Group_4__1"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:576:1: rule__FieldDecl__Group_4__1 : rule__FieldDecl__Group_4__1__Impl ;
    public final void rule__FieldDecl__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:580:1: ( rule__FieldDecl__Group_4__1__Impl )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:581:2: rule__FieldDecl__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FieldDecl__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDecl__Group_4__1"


    // $ANTLR start "rule__FieldDecl__Group_4__1__Impl"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:587:1: rule__FieldDecl__Group_4__1__Impl : ( ( rule__FieldDecl__InitValAssignment_4_1 ) ) ;
    public final void rule__FieldDecl__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:591:1: ( ( ( rule__FieldDecl__InitValAssignment_4_1 ) ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:592:1: ( ( rule__FieldDecl__InitValAssignment_4_1 ) )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:592:1: ( ( rule__FieldDecl__InitValAssignment_4_1 ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:593:2: ( rule__FieldDecl__InitValAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldDeclAccess().getInitValAssignment_4_1()); 
            }
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:594:2: ( rule__FieldDecl__InitValAssignment_4_1 )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:594:3: rule__FieldDecl__InitValAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__FieldDecl__InitValAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldDeclAccess().getInitValAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDecl__Group_4__1__Impl"


    // $ANTLR start "rule__MethodDecl__Group__0"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:603:1: rule__MethodDecl__Group__0 : rule__MethodDecl__Group__0__Impl rule__MethodDecl__Group__1 ;
    public final void rule__MethodDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:607:1: ( rule__MethodDecl__Group__0__Impl rule__MethodDecl__Group__1 )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:608:2: rule__MethodDecl__Group__0__Impl rule__MethodDecl__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__MethodDecl__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MethodDecl__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDecl__Group__0"


    // $ANTLR start "rule__MethodDecl__Group__0__Impl"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:615:1: rule__MethodDecl__Group__0__Impl : ( ( rule__MethodDecl__AnnotationsAssignment_0 )* ) ;
    public final void rule__MethodDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:619:1: ( ( ( rule__MethodDecl__AnnotationsAssignment_0 )* ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:620:1: ( ( rule__MethodDecl__AnnotationsAssignment_0 )* )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:620:1: ( ( rule__MethodDecl__AnnotationsAssignment_0 )* )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:621:2: ( rule__MethodDecl__AnnotationsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodDeclAccess().getAnnotationsAssignment_0()); 
            }
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:622:2: ( rule__MethodDecl__AnnotationsAssignment_0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==22) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalCore861_ContentAssistLookAheadTestLanguage.g:622:3: rule__MethodDecl__AnnotationsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__MethodDecl__AnnotationsAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodDeclAccess().getAnnotationsAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDecl__Group__0__Impl"


    // $ANTLR start "rule__MethodDecl__Group__1"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:630:1: rule__MethodDecl__Group__1 : rule__MethodDecl__Group__1__Impl rule__MethodDecl__Group__2 ;
    public final void rule__MethodDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:634:1: ( rule__MethodDecl__Group__1__Impl rule__MethodDecl__Group__2 )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:635:2: rule__MethodDecl__Group__1__Impl rule__MethodDecl__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__MethodDecl__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MethodDecl__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDecl__Group__1"


    // $ANTLR start "rule__MethodDecl__Group__1__Impl"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:642:1: rule__MethodDecl__Group__1__Impl : ( ( rule__MethodDecl__ModifierAssignment_1 )? ) ;
    public final void rule__MethodDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:646:1: ( ( ( rule__MethodDecl__ModifierAssignment_1 )? ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:647:1: ( ( rule__MethodDecl__ModifierAssignment_1 )? )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:647:1: ( ( rule__MethodDecl__ModifierAssignment_1 )? )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:648:2: ( rule__MethodDecl__ModifierAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodDeclAccess().getModifierAssignment_1()); 
            }
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:649:2: ( rule__MethodDecl__ModifierAssignment_1 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=11 && LA10_0<=12)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:649:3: rule__MethodDecl__ModifierAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__MethodDecl__ModifierAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodDeclAccess().getModifierAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDecl__Group__1__Impl"


    // $ANTLR start "rule__MethodDecl__Group__2"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:657:1: rule__MethodDecl__Group__2 : rule__MethodDecl__Group__2__Impl rule__MethodDecl__Group__3 ;
    public final void rule__MethodDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:661:1: ( rule__MethodDecl__Group__2__Impl rule__MethodDecl__Group__3 )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:662:2: rule__MethodDecl__Group__2__Impl rule__MethodDecl__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__MethodDecl__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MethodDecl__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDecl__Group__2"


    // $ANTLR start "rule__MethodDecl__Group__2__Impl"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:669:1: rule__MethodDecl__Group__2__Impl : ( ( rule__MethodDecl__TypeAssignment_2 ) ) ;
    public final void rule__MethodDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:673:1: ( ( ( rule__MethodDecl__TypeAssignment_2 ) ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:674:1: ( ( rule__MethodDecl__TypeAssignment_2 ) )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:674:1: ( ( rule__MethodDecl__TypeAssignment_2 ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:675:2: ( rule__MethodDecl__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodDeclAccess().getTypeAssignment_2()); 
            }
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:676:2: ( rule__MethodDecl__TypeAssignment_2 )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:676:3: rule__MethodDecl__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MethodDecl__TypeAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodDeclAccess().getTypeAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDecl__Group__2__Impl"


    // $ANTLR start "rule__MethodDecl__Group__3"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:684:1: rule__MethodDecl__Group__3 : rule__MethodDecl__Group__3__Impl rule__MethodDecl__Group__4 ;
    public final void rule__MethodDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:688:1: ( rule__MethodDecl__Group__3__Impl rule__MethodDecl__Group__4 )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:689:2: rule__MethodDecl__Group__3__Impl rule__MethodDecl__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__MethodDecl__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MethodDecl__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDecl__Group__3"


    // $ANTLR start "rule__MethodDecl__Group__3__Impl"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:696:1: rule__MethodDecl__Group__3__Impl : ( ( rule__MethodDecl__NameAssignment_3 ) ) ;
    public final void rule__MethodDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:700:1: ( ( ( rule__MethodDecl__NameAssignment_3 ) ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:701:1: ( ( rule__MethodDecl__NameAssignment_3 ) )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:701:1: ( ( rule__MethodDecl__NameAssignment_3 ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:702:2: ( rule__MethodDecl__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodDeclAccess().getNameAssignment_3()); 
            }
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:703:2: ( rule__MethodDecl__NameAssignment_3 )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:703:3: rule__MethodDecl__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MethodDecl__NameAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodDeclAccess().getNameAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDecl__Group__3__Impl"


    // $ANTLR start "rule__MethodDecl__Group__4"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:711:1: rule__MethodDecl__Group__4 : rule__MethodDecl__Group__4__Impl rule__MethodDecl__Group__5 ;
    public final void rule__MethodDecl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:715:1: ( rule__MethodDecl__Group__4__Impl rule__MethodDecl__Group__5 )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:716:2: rule__MethodDecl__Group__4__Impl rule__MethodDecl__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__MethodDecl__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MethodDecl__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDecl__Group__4"


    // $ANTLR start "rule__MethodDecl__Group__4__Impl"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:723:1: rule__MethodDecl__Group__4__Impl : ( '(' ) ;
    public final void rule__MethodDecl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:727:1: ( ( '(' ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:728:1: ( '(' )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:728:1: ( '(' )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:729:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodDeclAccess().getLeftParenthesisKeyword_4()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodDeclAccess().getLeftParenthesisKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDecl__Group__4__Impl"


    // $ANTLR start "rule__MethodDecl__Group__5"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:738:1: rule__MethodDecl__Group__5 : rule__MethodDecl__Group__5__Impl rule__MethodDecl__Group__6 ;
    public final void rule__MethodDecl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:742:1: ( rule__MethodDecl__Group__5__Impl rule__MethodDecl__Group__6 )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:743:2: rule__MethodDecl__Group__5__Impl rule__MethodDecl__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__MethodDecl__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MethodDecl__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDecl__Group__5"


    // $ANTLR start "rule__MethodDecl__Group__5__Impl"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:750:1: rule__MethodDecl__Group__5__Impl : ( ')' ) ;
    public final void rule__MethodDecl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:754:1: ( ( ')' ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:755:1: ( ')' )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:755:1: ( ')' )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:756:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodDeclAccess().getRightParenthesisKeyword_5()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodDeclAccess().getRightParenthesisKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDecl__Group__5__Impl"


    // $ANTLR start "rule__MethodDecl__Group__6"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:765:1: rule__MethodDecl__Group__6 : rule__MethodDecl__Group__6__Impl rule__MethodDecl__Group__7 ;
    public final void rule__MethodDecl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:769:1: ( rule__MethodDecl__Group__6__Impl rule__MethodDecl__Group__7 )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:770:2: rule__MethodDecl__Group__6__Impl rule__MethodDecl__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__MethodDecl__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MethodDecl__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDecl__Group__6"


    // $ANTLR start "rule__MethodDecl__Group__6__Impl"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:777:1: rule__MethodDecl__Group__6__Impl : ( '{' ) ;
    public final void rule__MethodDecl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:781:1: ( ( '{' ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:782:1: ( '{' )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:782:1: ( '{' )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:783:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodDeclAccess().getLeftCurlyBracketKeyword_6()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodDeclAccess().getLeftCurlyBracketKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDecl__Group__6__Impl"


    // $ANTLR start "rule__MethodDecl__Group__7"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:792:1: rule__MethodDecl__Group__7 : rule__MethodDecl__Group__7__Impl rule__MethodDecl__Group__8 ;
    public final void rule__MethodDecl__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:796:1: ( rule__MethodDecl__Group__7__Impl rule__MethodDecl__Group__8 )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:797:2: rule__MethodDecl__Group__7__Impl rule__MethodDecl__Group__8
            {
            pushFollow(FOLLOW_11);
            rule__MethodDecl__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MethodDecl__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDecl__Group__7"


    // $ANTLR start "rule__MethodDecl__Group__7__Impl"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:804:1: rule__MethodDecl__Group__7__Impl : ( ( rule__MethodDecl__DeclsAssignment_7 )* ) ;
    public final void rule__MethodDecl__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:808:1: ( ( ( rule__MethodDecl__DeclsAssignment_7 )* ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:809:1: ( ( rule__MethodDecl__DeclsAssignment_7 )* )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:809:1: ( ( rule__MethodDecl__DeclsAssignment_7 )* )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:810:2: ( rule__MethodDecl__DeclsAssignment_7 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodDeclAccess().getDeclsAssignment_7()); 
            }
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:811:2: ( rule__MethodDecl__DeclsAssignment_7 )*
            loop11:
            do {
                int alt11=2;
                alt11 = dfa11.predict(input);
                switch (alt11) {
            	case 1 :
            	    // InternalCore861_ContentAssistLookAheadTestLanguage.g:811:3: rule__MethodDecl__DeclsAssignment_7
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__MethodDecl__DeclsAssignment_7();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodDeclAccess().getDeclsAssignment_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDecl__Group__7__Impl"


    // $ANTLR start "rule__MethodDecl__Group__8"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:819:1: rule__MethodDecl__Group__8 : rule__MethodDecl__Group__8__Impl rule__MethodDecl__Group__9 ;
    public final void rule__MethodDecl__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:823:1: ( rule__MethodDecl__Group__8__Impl rule__MethodDecl__Group__9 )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:824:2: rule__MethodDecl__Group__8__Impl rule__MethodDecl__Group__9
            {
            pushFollow(FOLLOW_11);
            rule__MethodDecl__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MethodDecl__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDecl__Group__8"


    // $ANTLR start "rule__MethodDecl__Group__8__Impl"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:831:1: rule__MethodDecl__Group__8__Impl : ( ( rule__MethodDecl__StatementsAssignment_8 )* ) ;
    public final void rule__MethodDecl__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:835:1: ( ( ( rule__MethodDecl__StatementsAssignment_8 )* ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:836:1: ( ( rule__MethodDecl__StatementsAssignment_8 )* )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:836:1: ( ( rule__MethodDecl__StatementsAssignment_8 )* )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:837:2: ( rule__MethodDecl__StatementsAssignment_8 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodDeclAccess().getStatementsAssignment_8()); 
            }
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:838:2: ( rule__MethodDecl__StatementsAssignment_8 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID||LA12_0==21) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalCore861_ContentAssistLookAheadTestLanguage.g:838:3: rule__MethodDecl__StatementsAssignment_8
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__MethodDecl__StatementsAssignment_8();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodDeclAccess().getStatementsAssignment_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDecl__Group__8__Impl"


    // $ANTLR start "rule__MethodDecl__Group__9"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:846:1: rule__MethodDecl__Group__9 : rule__MethodDecl__Group__9__Impl ;
    public final void rule__MethodDecl__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:850:1: ( rule__MethodDecl__Group__9__Impl )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:851:2: rule__MethodDecl__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MethodDecl__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDecl__Group__9"


    // $ANTLR start "rule__MethodDecl__Group__9__Impl"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:857:1: rule__MethodDecl__Group__9__Impl : ( '}' ) ;
    public final void rule__MethodDecl__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:861:1: ( ( '}' ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:862:1: ( '}' )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:862:1: ( '}' )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:863:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodDeclAccess().getRightCurlyBracketKeyword_9()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodDeclAccess().getRightCurlyBracketKeyword_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDecl__Group__9__Impl"


    // $ANTLR start "rule__Type__Group_0__0"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:873:1: rule__Type__Group_0__0 : rule__Type__Group_0__0__Impl rule__Type__Group_0__1 ;
    public final void rule__Type__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:877:1: ( rule__Type__Group_0__0__Impl rule__Type__Group_0__1 )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:878:2: rule__Type__Group_0__0__Impl rule__Type__Group_0__1
            {
            pushFollow(FOLLOW_13);
            rule__Type__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Type__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0__0"


    // $ANTLR start "rule__Type__Group_0__0__Impl"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:885:1: rule__Type__Group_0__0__Impl : ( () ) ;
    public final void rule__Type__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:889:1: ( ( () ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:890:1: ( () )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:890:1: ( () )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:891:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getIntTypeAction_0_0()); 
            }
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:892:2: ()
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:892:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getIntTypeAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0__0__Impl"


    // $ANTLR start "rule__Type__Group_0__1"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:900:1: rule__Type__Group_0__1 : rule__Type__Group_0__1__Impl ;
    public final void rule__Type__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:904:1: ( rule__Type__Group_0__1__Impl )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:905:2: rule__Type__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0__1"


    // $ANTLR start "rule__Type__Group_0__1__Impl"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:911:1: rule__Type__Group_0__1__Impl : ( 'int' ) ;
    public final void rule__Type__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:915:1: ( ( 'int' ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:916:1: ( 'int' )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:916:1: ( 'int' )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:917:2: 'int'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getIntKeyword_0_1()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getIntKeyword_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0__1__Impl"


    // $ANTLR start "rule__Type__Group_1__0"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:927:1: rule__Type__Group_1__0 : rule__Type__Group_1__0__Impl rule__Type__Group_1__1 ;
    public final void rule__Type__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:931:1: ( rule__Type__Group_1__0__Impl rule__Type__Group_1__1 )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:932:2: rule__Type__Group_1__0__Impl rule__Type__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Type__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Type__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__0"


    // $ANTLR start "rule__Type__Group_1__0__Impl"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:939:1: rule__Type__Group_1__0__Impl : ( () ) ;
    public final void rule__Type__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:943:1: ( ( () ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:944:1: ( () )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:944:1: ( () )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:945:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getTypeRefAction_1_0()); 
            }
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:946:2: ()
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:946:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getTypeRefAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__0__Impl"


    // $ANTLR start "rule__Type__Group_1__1"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:954:1: rule__Type__Group_1__1 : rule__Type__Group_1__1__Impl ;
    public final void rule__Type__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:958:1: ( rule__Type__Group_1__1__Impl )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:959:2: rule__Type__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__1"


    // $ANTLR start "rule__Type__Group_1__1__Impl"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:965:1: rule__Type__Group_1__1__Impl : ( ( rule__Type__TypeAssignment_1_1 ) ) ;
    public final void rule__Type__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:969:1: ( ( ( rule__Type__TypeAssignment_1_1 ) ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:970:1: ( ( rule__Type__TypeAssignment_1_1 ) )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:970:1: ( ( rule__Type__TypeAssignment_1_1 ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:971:2: ( rule__Type__TypeAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getTypeAssignment_1_1()); 
            }
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:972:2: ( rule__Type__TypeAssignment_1_1 )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:972:3: rule__Type__TypeAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Type__TypeAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getTypeAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:981:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:985:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:986:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:993:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:997:1: ( ( RULE_ID ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:998:1: ( RULE_ID )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:998:1: ( RULE_ID )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:999:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:1008:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1012:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1013:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:1019:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1023:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1024:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1024:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1025:2: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1026:2: ( rule__QualifiedName__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==20) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalCore861_ContentAssistLookAheadTestLanguage.g:1026:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:1035:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1039:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1040:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:1047:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1051:1: ( ( '.' ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1052:1: ( '.' )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1052:1: ( '.' )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1053:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:1062:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1066:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1067:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:1073:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1077:1: ( ( RULE_ID ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1078:1: ( RULE_ID )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1078:1: ( RULE_ID )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1079:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__Statement__Group_1__0"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:1089:1: rule__Statement__Group_1__0 : rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1 ;
    public final void rule__Statement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1093:1: ( rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1 )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1094:2: rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1
            {
            pushFollow(FOLLOW_16);
            rule__Statement__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Statement__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_1__0"


    // $ANTLR start "rule__Statement__Group_1__0__Impl"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:1101:1: rule__Statement__Group_1__0__Impl : ( () ) ;
    public final void rule__Statement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1105:1: ( ( () ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1106:1: ( () )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1106:1: ( () )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1107:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getReturnAction_1_0()); 
            }
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1108:2: ()
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1108:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getReturnAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_1__0__Impl"


    // $ANTLR start "rule__Statement__Group_1__1"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:1116:1: rule__Statement__Group_1__1 : rule__Statement__Group_1__1__Impl rule__Statement__Group_1__2 ;
    public final void rule__Statement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1120:1: ( rule__Statement__Group_1__1__Impl rule__Statement__Group_1__2 )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1121:2: rule__Statement__Group_1__1__Impl rule__Statement__Group_1__2
            {
            pushFollow(FOLLOW_17);
            rule__Statement__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Statement__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_1__1"


    // $ANTLR start "rule__Statement__Group_1__1__Impl"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:1128:1: rule__Statement__Group_1__1__Impl : ( 'return' ) ;
    public final void rule__Statement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1132:1: ( ( 'return' ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1133:1: ( 'return' )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1133:1: ( 'return' )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1134:2: 'return'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getReturnKeyword_1_1()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getReturnKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_1__1__Impl"


    // $ANTLR start "rule__Statement__Group_1__2"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:1143:1: rule__Statement__Group_1__2 : rule__Statement__Group_1__2__Impl ;
    public final void rule__Statement__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1147:1: ( rule__Statement__Group_1__2__Impl )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1148:2: rule__Statement__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_1__2"


    // $ANTLR start "rule__Statement__Group_1__2__Impl"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:1154:1: rule__Statement__Group_1__2__Impl : ( ';' ) ;
    public final void rule__Statement__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1158:1: ( ( ';' ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1159:1: ( ';' )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1159:1: ( ';' )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1160:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getSemicolonKeyword_1_2()); 
            }
            match(input,13,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getSemicolonKeyword_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_1__2__Impl"


    // $ANTLR start "rule__AssignmentStatement__Group__0"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:1170:1: rule__AssignmentStatement__Group__0 : rule__AssignmentStatement__Group__0__Impl rule__AssignmentStatement__Group__1 ;
    public final void rule__AssignmentStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1174:1: ( rule__AssignmentStatement__Group__0__Impl rule__AssignmentStatement__Group__1 )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1175:2: rule__AssignmentStatement__Group__0__Impl rule__AssignmentStatement__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__AssignmentStatement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AssignmentStatement__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignmentStatement__Group__0"


    // $ANTLR start "rule__AssignmentStatement__Group__0__Impl"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:1182:1: rule__AssignmentStatement__Group__0__Impl : ( ruleFeatureCall ) ;
    public final void rule__AssignmentStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1186:1: ( ( ruleFeatureCall ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1187:1: ( ruleFeatureCall )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1187:1: ( ruleFeatureCall )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1188:2: ruleFeatureCall
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentStatementAccess().getFeatureCallParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFeatureCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentStatementAccess().getFeatureCallParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignmentStatement__Group__0__Impl"


    // $ANTLR start "rule__AssignmentStatement__Group__1"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:1197:1: rule__AssignmentStatement__Group__1 : rule__AssignmentStatement__Group__1__Impl rule__AssignmentStatement__Group__2 ;
    public final void rule__AssignmentStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1201:1: ( rule__AssignmentStatement__Group__1__Impl rule__AssignmentStatement__Group__2 )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1202:2: rule__AssignmentStatement__Group__1__Impl rule__AssignmentStatement__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__AssignmentStatement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AssignmentStatement__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignmentStatement__Group__1"


    // $ANTLR start "rule__AssignmentStatement__Group__1__Impl"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:1209:1: rule__AssignmentStatement__Group__1__Impl : ( ( rule__AssignmentStatement__Group_1__0 )? ) ;
    public final void rule__AssignmentStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1213:1: ( ( ( rule__AssignmentStatement__Group_1__0 )? ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1214:1: ( ( rule__AssignmentStatement__Group_1__0 )? )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1214:1: ( ( rule__AssignmentStatement__Group_1__0 )? )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1215:2: ( rule__AssignmentStatement__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentStatementAccess().getGroup_1()); 
            }
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1216:2: ( rule__AssignmentStatement__Group_1__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==14) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:1216:3: rule__AssignmentStatement__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AssignmentStatement__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentStatementAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignmentStatement__Group__1__Impl"


    // $ANTLR start "rule__AssignmentStatement__Group__2"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:1224:1: rule__AssignmentStatement__Group__2 : rule__AssignmentStatement__Group__2__Impl ;
    public final void rule__AssignmentStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1228:1: ( rule__AssignmentStatement__Group__2__Impl )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1229:2: rule__AssignmentStatement__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssignmentStatement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignmentStatement__Group__2"


    // $ANTLR start "rule__AssignmentStatement__Group__2__Impl"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:1235:1: rule__AssignmentStatement__Group__2__Impl : ( ';' ) ;
    public final void rule__AssignmentStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1239:1: ( ( ';' ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1240:1: ( ';' )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1240:1: ( ';' )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1241:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentStatementAccess().getSemicolonKeyword_2()); 
            }
            match(input,13,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentStatementAccess().getSemicolonKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignmentStatement__Group__2__Impl"


    // $ANTLR start "rule__AssignmentStatement__Group_1__0"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:1251:1: rule__AssignmentStatement__Group_1__0 : rule__AssignmentStatement__Group_1__0__Impl rule__AssignmentStatement__Group_1__1 ;
    public final void rule__AssignmentStatement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1255:1: ( rule__AssignmentStatement__Group_1__0__Impl rule__AssignmentStatement__Group_1__1 )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1256:2: rule__AssignmentStatement__Group_1__0__Impl rule__AssignmentStatement__Group_1__1
            {
            pushFollow(FOLLOW_18);
            rule__AssignmentStatement__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AssignmentStatement__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignmentStatement__Group_1__0"


    // $ANTLR start "rule__AssignmentStatement__Group_1__0__Impl"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:1263:1: rule__AssignmentStatement__Group_1__0__Impl : ( () ) ;
    public final void rule__AssignmentStatement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1267:1: ( ( () ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1268:1: ( () )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1268:1: ( () )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1269:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentStatementAccess().getAssignmentFeatureAction_1_0()); 
            }
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1270:2: ()
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1270:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentStatementAccess().getAssignmentFeatureAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignmentStatement__Group_1__0__Impl"


    // $ANTLR start "rule__AssignmentStatement__Group_1__1"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:1278:1: rule__AssignmentStatement__Group_1__1 : rule__AssignmentStatement__Group_1__1__Impl rule__AssignmentStatement__Group_1__2 ;
    public final void rule__AssignmentStatement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1282:1: ( rule__AssignmentStatement__Group_1__1__Impl rule__AssignmentStatement__Group_1__2 )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1283:2: rule__AssignmentStatement__Group_1__1__Impl rule__AssignmentStatement__Group_1__2
            {
            pushFollow(FOLLOW_7);
            rule__AssignmentStatement__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AssignmentStatement__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignmentStatement__Group_1__1"


    // $ANTLR start "rule__AssignmentStatement__Group_1__1__Impl"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:1290:1: rule__AssignmentStatement__Group_1__1__Impl : ( '=' ) ;
    public final void rule__AssignmentStatement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1294:1: ( ( '=' ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1295:1: ( '=' )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1295:1: ( '=' )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1296:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentStatementAccess().getEqualsSignKeyword_1_1()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentStatementAccess().getEqualsSignKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignmentStatement__Group_1__1__Impl"


    // $ANTLR start "rule__AssignmentStatement__Group_1__2"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:1305:1: rule__AssignmentStatement__Group_1__2 : rule__AssignmentStatement__Group_1__2__Impl ;
    public final void rule__AssignmentStatement__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1309:1: ( rule__AssignmentStatement__Group_1__2__Impl )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1310:2: rule__AssignmentStatement__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssignmentStatement__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignmentStatement__Group_1__2"


    // $ANTLR start "rule__AssignmentStatement__Group_1__2__Impl"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:1316:1: rule__AssignmentStatement__Group_1__2__Impl : ( ( rule__AssignmentStatement__RhsAssignment_1_2 ) ) ;
    public final void rule__AssignmentStatement__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1320:1: ( ( ( rule__AssignmentStatement__RhsAssignment_1_2 ) ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1321:1: ( ( rule__AssignmentStatement__RhsAssignment_1_2 ) )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1321:1: ( ( rule__AssignmentStatement__RhsAssignment_1_2 ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1322:2: ( rule__AssignmentStatement__RhsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentStatementAccess().getRhsAssignment_1_2()); 
            }
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1323:2: ( rule__AssignmentStatement__RhsAssignment_1_2 )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1323:3: rule__AssignmentStatement__RhsAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__AssignmentStatement__RhsAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentStatementAccess().getRhsAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignmentStatement__Group_1__2__Impl"


    // $ANTLR start "rule__FeatureCall__Group__0"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:1332:1: rule__FeatureCall__Group__0 : rule__FeatureCall__Group__0__Impl rule__FeatureCall__Group__1 ;
    public final void rule__FeatureCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1336:1: ( rule__FeatureCall__Group__0__Impl rule__FeatureCall__Group__1 )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1337:2: rule__FeatureCall__Group__0__Impl rule__FeatureCall__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__FeatureCall__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FeatureCall__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCall__Group__0"


    // $ANTLR start "rule__FeatureCall__Group__0__Impl"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:1344:1: rule__FeatureCall__Group__0__Impl : ( ( rule__FeatureCall__FeatureAssignment_0 ) ) ;
    public final void rule__FeatureCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1348:1: ( ( ( rule__FeatureCall__FeatureAssignment_0 ) ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1349:1: ( ( rule__FeatureCall__FeatureAssignment_0 ) )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1349:1: ( ( rule__FeatureCall__FeatureAssignment_0 ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1350:2: ( rule__FeatureCall__FeatureAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureCallAccess().getFeatureAssignment_0()); 
            }
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1351:2: ( rule__FeatureCall__FeatureAssignment_0 )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1351:3: rule__FeatureCall__FeatureAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__FeatureCall__FeatureAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureCallAccess().getFeatureAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCall__Group__0__Impl"


    // $ANTLR start "rule__FeatureCall__Group__1"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:1359:1: rule__FeatureCall__Group__1 : rule__FeatureCall__Group__1__Impl ;
    public final void rule__FeatureCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1363:1: ( rule__FeatureCall__Group__1__Impl )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1364:2: rule__FeatureCall__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureCall__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCall__Group__1"


    // $ANTLR start "rule__FeatureCall__Group__1__Impl"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:1370:1: rule__FeatureCall__Group__1__Impl : ( ( rule__FeatureCall__Group_1__0 )* ) ;
    public final void rule__FeatureCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1374:1: ( ( ( rule__FeatureCall__Group_1__0 )* ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1375:1: ( ( rule__FeatureCall__Group_1__0 )* )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1375:1: ( ( rule__FeatureCall__Group_1__0 )* )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1376:2: ( rule__FeatureCall__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureCallAccess().getGroup_1()); 
            }
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1377:2: ( rule__FeatureCall__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==20) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalCore861_ContentAssistLookAheadTestLanguage.g:1377:3: rule__FeatureCall__Group_1__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__FeatureCall__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureCallAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCall__Group__1__Impl"


    // $ANTLR start "rule__FeatureCall__Group_1__0"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:1386:1: rule__FeatureCall__Group_1__0 : rule__FeatureCall__Group_1__0__Impl rule__FeatureCall__Group_1__1 ;
    public final void rule__FeatureCall__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1390:1: ( rule__FeatureCall__Group_1__0__Impl rule__FeatureCall__Group_1__1 )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1391:2: rule__FeatureCall__Group_1__0__Impl rule__FeatureCall__Group_1__1
            {
            pushFollow(FOLLOW_14);
            rule__FeatureCall__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FeatureCall__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCall__Group_1__0"


    // $ANTLR start "rule__FeatureCall__Group_1__0__Impl"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:1398:1: rule__FeatureCall__Group_1__0__Impl : ( () ) ;
    public final void rule__FeatureCall__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1402:1: ( ( () ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1403:1: ( () )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1403:1: ( () )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1404:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureCallAccess().getMemberCallOwnerAction_1_0()); 
            }
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1405:2: ()
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1405:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureCallAccess().getMemberCallOwnerAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCall__Group_1__0__Impl"


    // $ANTLR start "rule__FeatureCall__Group_1__1"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:1413:1: rule__FeatureCall__Group_1__1 : rule__FeatureCall__Group_1__1__Impl rule__FeatureCall__Group_1__2 ;
    public final void rule__FeatureCall__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1417:1: ( rule__FeatureCall__Group_1__1__Impl rule__FeatureCall__Group_1__2 )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1418:2: rule__FeatureCall__Group_1__1__Impl rule__FeatureCall__Group_1__2
            {
            pushFollow(FOLLOW_5);
            rule__FeatureCall__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FeatureCall__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCall__Group_1__1"


    // $ANTLR start "rule__FeatureCall__Group_1__1__Impl"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:1425:1: rule__FeatureCall__Group_1__1__Impl : ( ( '.' ) ) ;
    public final void rule__FeatureCall__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1429:1: ( ( ( '.' ) ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1430:1: ( ( '.' ) )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1430:1: ( ( '.' ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1431:2: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureCallAccess().getFullStopKeyword_1_1()); 
            }
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1432:2: ( '.' )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1432:3: '.'
            {
            match(input,20,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureCallAccess().getFullStopKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCall__Group_1__1__Impl"


    // $ANTLR start "rule__FeatureCall__Group_1__2"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:1440:1: rule__FeatureCall__Group_1__2 : rule__FeatureCall__Group_1__2__Impl ;
    public final void rule__FeatureCall__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1444:1: ( rule__FeatureCall__Group_1__2__Impl )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1445:2: rule__FeatureCall__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureCall__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCall__Group_1__2"


    // $ANTLR start "rule__FeatureCall__Group_1__2__Impl"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:1451:1: rule__FeatureCall__Group_1__2__Impl : ( ( rule__FeatureCall__MemberAssignment_1_2 ) ) ;
    public final void rule__FeatureCall__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1455:1: ( ( ( rule__FeatureCall__MemberAssignment_1_2 ) ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1456:1: ( ( rule__FeatureCall__MemberAssignment_1_2 ) )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1456:1: ( ( rule__FeatureCall__MemberAssignment_1_2 ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1457:2: ( rule__FeatureCall__MemberAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureCallAccess().getMemberAssignment_1_2()); 
            }
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1458:2: ( rule__FeatureCall__MemberAssignment_1_2 )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1458:3: rule__FeatureCall__MemberAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__FeatureCall__MemberAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureCallAccess().getMemberAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCall__Group_1__2__Impl"


    // $ANTLR start "rule__Annotation__Group__0"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:1467:1: rule__Annotation__Group__0 : rule__Annotation__Group__0__Impl rule__Annotation__Group__1 ;
    public final void rule__Annotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1471:1: ( rule__Annotation__Group__0__Impl rule__Annotation__Group__1 )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1472:2: rule__Annotation__Group__0__Impl rule__Annotation__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Annotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Annotation__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__0"


    // $ANTLR start "rule__Annotation__Group__0__Impl"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:1479:1: rule__Annotation__Group__0__Impl : ( '@' ) ;
    public final void rule__Annotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1483:1: ( ( '@' ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1484:1: ( '@' )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1484:1: ( '@' )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1485:2: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__0__Impl"


    // $ANTLR start "rule__Annotation__Group__1"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:1494:1: rule__Annotation__Group__1 : rule__Annotation__Group__1__Impl rule__Annotation__Group__2 ;
    public final void rule__Annotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1498:1: ( rule__Annotation__Group__1__Impl rule__Annotation__Group__2 )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1499:2: rule__Annotation__Group__1__Impl rule__Annotation__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Annotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Annotation__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__1"


    // $ANTLR start "rule__Annotation__Group__1__Impl"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:1506:1: rule__Annotation__Group__1__Impl : ( ( rule__Annotation__KeyAssignment_1 ) ) ;
    public final void rule__Annotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1510:1: ( ( ( rule__Annotation__KeyAssignment_1 ) ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1511:1: ( ( rule__Annotation__KeyAssignment_1 ) )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1511:1: ( ( rule__Annotation__KeyAssignment_1 ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1512:2: ( rule__Annotation__KeyAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getKeyAssignment_1()); 
            }
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1513:2: ( rule__Annotation__KeyAssignment_1 )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1513:3: rule__Annotation__KeyAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Annotation__KeyAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getKeyAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__1__Impl"


    // $ANTLR start "rule__Annotation__Group__2"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:1521:1: rule__Annotation__Group__2 : rule__Annotation__Group__2__Impl ;
    public final void rule__Annotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1525:1: ( rule__Annotation__Group__2__Impl )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1526:2: rule__Annotation__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Annotation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__2"


    // $ANTLR start "rule__Annotation__Group__2__Impl"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:1532:1: rule__Annotation__Group__2__Impl : ( ( rule__Annotation__Group_2__0 )? ) ;
    public final void rule__Annotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1536:1: ( ( ( rule__Annotation__Group_2__0 )? ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1537:1: ( ( rule__Annotation__Group_2__0 )? )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1537:1: ( ( rule__Annotation__Group_2__0 )? )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1538:2: ( rule__Annotation__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getGroup_2()); 
            }
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1539:2: ( rule__Annotation__Group_2__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==15) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalCore861_ContentAssistLookAheadTestLanguage.g:1539:3: rule__Annotation__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Annotation__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__2__Impl"


    // $ANTLR start "rule__Annotation__Group_2__0"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:1548:1: rule__Annotation__Group_2__0 : rule__Annotation__Group_2__0__Impl rule__Annotation__Group_2__1 ;
    public final void rule__Annotation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1552:1: ( rule__Annotation__Group_2__0__Impl rule__Annotation__Group_2__1 )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1553:2: rule__Annotation__Group_2__0__Impl rule__Annotation__Group_2__1
            {
            pushFollow(FOLLOW_19);
            rule__Annotation__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Annotation__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group_2__0"


    // $ANTLR start "rule__Annotation__Group_2__0__Impl"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:1560:1: rule__Annotation__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Annotation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1564:1: ( ( '(' ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1565:1: ( '(' )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1565:1: ( '(' )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1566:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group_2__0__Impl"


    // $ANTLR start "rule__Annotation__Group_2__1"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:1575:1: rule__Annotation__Group_2__1 : rule__Annotation__Group_2__1__Impl rule__Annotation__Group_2__2 ;
    public final void rule__Annotation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1579:1: ( rule__Annotation__Group_2__1__Impl rule__Annotation__Group_2__2 )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1580:2: rule__Annotation__Group_2__1__Impl rule__Annotation__Group_2__2
            {
            pushFollow(FOLLOW_20);
            rule__Annotation__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Annotation__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group_2__1"


    // $ANTLR start "rule__Annotation__Group_2__1__Impl"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:1587:1: rule__Annotation__Group_2__1__Impl : ( ( rule__Annotation__ValuesAssignment_2_1 ) ) ;
    public final void rule__Annotation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1591:1: ( ( ( rule__Annotation__ValuesAssignment_2_1 ) ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1592:1: ( ( rule__Annotation__ValuesAssignment_2_1 ) )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1592:1: ( ( rule__Annotation__ValuesAssignment_2_1 ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1593:2: ( rule__Annotation__ValuesAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getValuesAssignment_2_1()); 
            }
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1594:2: ( rule__Annotation__ValuesAssignment_2_1 )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1594:3: rule__Annotation__ValuesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Annotation__ValuesAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getValuesAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group_2__1__Impl"


    // $ANTLR start "rule__Annotation__Group_2__2"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:1602:1: rule__Annotation__Group_2__2 : rule__Annotation__Group_2__2__Impl rule__Annotation__Group_2__3 ;
    public final void rule__Annotation__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1606:1: ( rule__Annotation__Group_2__2__Impl rule__Annotation__Group_2__3 )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1607:2: rule__Annotation__Group_2__2__Impl rule__Annotation__Group_2__3
            {
            pushFollow(FOLLOW_20);
            rule__Annotation__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Annotation__Group_2__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group_2__2"


    // $ANTLR start "rule__Annotation__Group_2__2__Impl"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:1614:1: rule__Annotation__Group_2__2__Impl : ( ( rule__Annotation__Group_2_2__0 )* ) ;
    public final void rule__Annotation__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1618:1: ( ( ( rule__Annotation__Group_2_2__0 )* ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1619:1: ( ( rule__Annotation__Group_2_2__0 )* )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1619:1: ( ( rule__Annotation__Group_2_2__0 )* )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1620:2: ( rule__Annotation__Group_2_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getGroup_2_2()); 
            }
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1621:2: ( rule__Annotation__Group_2_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==23) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalCore861_ContentAssistLookAheadTestLanguage.g:1621:3: rule__Annotation__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Annotation__Group_2_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getGroup_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group_2__2__Impl"


    // $ANTLR start "rule__Annotation__Group_2__3"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:1629:1: rule__Annotation__Group_2__3 : rule__Annotation__Group_2__3__Impl ;
    public final void rule__Annotation__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1633:1: ( rule__Annotation__Group_2__3__Impl )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1634:2: rule__Annotation__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Annotation__Group_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group_2__3"


    // $ANTLR start "rule__Annotation__Group_2__3__Impl"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:1640:1: rule__Annotation__Group_2__3__Impl : ( ')' ) ;
    public final void rule__Annotation__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1644:1: ( ( ')' ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1645:1: ( ')' )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1645:1: ( ')' )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1646:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getRightParenthesisKeyword_2_3()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getRightParenthesisKeyword_2_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group_2__3__Impl"


    // $ANTLR start "rule__Annotation__Group_2_2__0"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:1656:1: rule__Annotation__Group_2_2__0 : rule__Annotation__Group_2_2__0__Impl rule__Annotation__Group_2_2__1 ;
    public final void rule__Annotation__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1660:1: ( rule__Annotation__Group_2_2__0__Impl rule__Annotation__Group_2_2__1 )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1661:2: rule__Annotation__Group_2_2__0__Impl rule__Annotation__Group_2_2__1
            {
            pushFollow(FOLLOW_19);
            rule__Annotation__Group_2_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Annotation__Group_2_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group_2_2__0"


    // $ANTLR start "rule__Annotation__Group_2_2__0__Impl"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:1668:1: rule__Annotation__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__Annotation__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1672:1: ( ( ',' ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1673:1: ( ',' )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1673:1: ( ',' )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1674:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getCommaKeyword_2_2_0()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getCommaKeyword_2_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group_2_2__0__Impl"


    // $ANTLR start "rule__Annotation__Group_2_2__1"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:1683:1: rule__Annotation__Group_2_2__1 : rule__Annotation__Group_2_2__1__Impl ;
    public final void rule__Annotation__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1687:1: ( rule__Annotation__Group_2_2__1__Impl )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1688:2: rule__Annotation__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Annotation__Group_2_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group_2_2__1"


    // $ANTLR start "rule__Annotation__Group_2_2__1__Impl"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:1694:1: rule__Annotation__Group_2_2__1__Impl : ( ( rule__Annotation__ValuesAssignment_2_2_1 ) ) ;
    public final void rule__Annotation__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1698:1: ( ( ( rule__Annotation__ValuesAssignment_2_2_1 ) ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1699:1: ( ( rule__Annotation__ValuesAssignment_2_2_1 ) )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1699:1: ( ( rule__Annotation__ValuesAssignment_2_2_1 ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1700:2: ( rule__Annotation__ValuesAssignment_2_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getValuesAssignment_2_2_1()); 
            }
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1701:2: ( rule__Annotation__ValuesAssignment_2_2_1 )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1701:3: rule__Annotation__ValuesAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Annotation__ValuesAssignment_2_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getValuesAssignment_2_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group_2_2__1__Impl"


    // $ANTLR start "rule__FieldDecl__AnnotationsAssignment_0"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:1710:1: rule__FieldDecl__AnnotationsAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__FieldDecl__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1714:1: ( ( ruleAnnotation ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1715:2: ( ruleAnnotation )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1715:2: ( ruleAnnotation )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1716:3: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldDeclAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldDeclAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDecl__AnnotationsAssignment_0"


    // $ANTLR start "rule__FieldDecl__ModifierAssignment_1"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:1725:1: rule__FieldDecl__ModifierAssignment_1 : ( ( rule__FieldDecl__ModifierAlternatives_1_0 ) ) ;
    public final void rule__FieldDecl__ModifierAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1729:1: ( ( ( rule__FieldDecl__ModifierAlternatives_1_0 ) ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1730:2: ( ( rule__FieldDecl__ModifierAlternatives_1_0 ) )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1730:2: ( ( rule__FieldDecl__ModifierAlternatives_1_0 ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1731:3: ( rule__FieldDecl__ModifierAlternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldDeclAccess().getModifierAlternatives_1_0()); 
            }
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1732:3: ( rule__FieldDecl__ModifierAlternatives_1_0 )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1732:4: rule__FieldDecl__ModifierAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__FieldDecl__ModifierAlternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldDeclAccess().getModifierAlternatives_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDecl__ModifierAssignment_1"


    // $ANTLR start "rule__FieldDecl__TypeAssignment_2"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:1740:1: rule__FieldDecl__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__FieldDecl__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1744:1: ( ( ruleType ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1745:2: ( ruleType )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1745:2: ( ruleType )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1746:3: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldDeclAccess().getTypeTypeParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldDeclAccess().getTypeTypeParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDecl__TypeAssignment_2"


    // $ANTLR start "rule__FieldDecl__NameAssignment_3"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:1755:1: rule__FieldDecl__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__FieldDecl__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1759:1: ( ( RULE_ID ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1760:2: ( RULE_ID )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1760:2: ( RULE_ID )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1761:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldDeclAccess().getNameIDTerminalRuleCall_3_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldDeclAccess().getNameIDTerminalRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDecl__NameAssignment_3"


    // $ANTLR start "rule__FieldDecl__InitValAssignment_4_1"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:1770:1: rule__FieldDecl__InitValAssignment_4_1 : ( RULE_INT ) ;
    public final void rule__FieldDecl__InitValAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1774:1: ( ( RULE_INT ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1775:2: ( RULE_INT )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1775:2: ( RULE_INT )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1776:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldDeclAccess().getInitValINTTerminalRuleCall_4_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldDeclAccess().getInitValINTTerminalRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDecl__InitValAssignment_4_1"


    // $ANTLR start "rule__MethodDecl__AnnotationsAssignment_0"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:1785:1: rule__MethodDecl__AnnotationsAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__MethodDecl__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1789:1: ( ( ruleAnnotation ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1790:2: ( ruleAnnotation )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1790:2: ( ruleAnnotation )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1791:3: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodDeclAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodDeclAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDecl__AnnotationsAssignment_0"


    // $ANTLR start "rule__MethodDecl__ModifierAssignment_1"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:1800:1: rule__MethodDecl__ModifierAssignment_1 : ( ( rule__MethodDecl__ModifierAlternatives_1_0 ) ) ;
    public final void rule__MethodDecl__ModifierAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1804:1: ( ( ( rule__MethodDecl__ModifierAlternatives_1_0 ) ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1805:2: ( ( rule__MethodDecl__ModifierAlternatives_1_0 ) )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1805:2: ( ( rule__MethodDecl__ModifierAlternatives_1_0 ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1806:3: ( rule__MethodDecl__ModifierAlternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodDeclAccess().getModifierAlternatives_1_0()); 
            }
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1807:3: ( rule__MethodDecl__ModifierAlternatives_1_0 )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1807:4: rule__MethodDecl__ModifierAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__MethodDecl__ModifierAlternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodDeclAccess().getModifierAlternatives_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDecl__ModifierAssignment_1"


    // $ANTLR start "rule__MethodDecl__TypeAssignment_2"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:1815:1: rule__MethodDecl__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__MethodDecl__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1819:1: ( ( ruleType ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1820:2: ( ruleType )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1820:2: ( ruleType )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1821:3: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodDeclAccess().getTypeTypeParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodDeclAccess().getTypeTypeParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDecl__TypeAssignment_2"


    // $ANTLR start "rule__MethodDecl__NameAssignment_3"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:1830:1: rule__MethodDecl__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__MethodDecl__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1834:1: ( ( RULE_ID ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1835:2: ( RULE_ID )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1835:2: ( RULE_ID )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1836:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodDeclAccess().getNameIDTerminalRuleCall_3_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodDeclAccess().getNameIDTerminalRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDecl__NameAssignment_3"


    // $ANTLR start "rule__MethodDecl__DeclsAssignment_7"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:1845:1: rule__MethodDecl__DeclsAssignment_7 : ( ruleFieldDecl ) ;
    public final void rule__MethodDecl__DeclsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1849:1: ( ( ruleFieldDecl ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1850:2: ( ruleFieldDecl )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1850:2: ( ruleFieldDecl )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1851:3: ruleFieldDecl
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodDeclAccess().getDeclsFieldDeclParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFieldDecl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodDeclAccess().getDeclsFieldDeclParserRuleCall_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDecl__DeclsAssignment_7"


    // $ANTLR start "rule__MethodDecl__StatementsAssignment_8"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:1860:1: rule__MethodDecl__StatementsAssignment_8 : ( ruleStatement ) ;
    public final void rule__MethodDecl__StatementsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1864:1: ( ( ruleStatement ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1865:2: ( ruleStatement )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1865:2: ( ruleStatement )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1866:3: ruleStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodDeclAccess().getStatementsStatementParserRuleCall_8_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodDeclAccess().getStatementsStatementParserRuleCall_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDecl__StatementsAssignment_8"


    // $ANTLR start "rule__Type__TypeAssignment_1_1"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:1875:1: rule__Type__TypeAssignment_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Type__TypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1879:1: ( ( ( ruleQualifiedName ) ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1880:2: ( ( ruleQualifiedName ) )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1880:2: ( ( ruleQualifiedName ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1881:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getTypeTypeCrossReference_1_1_0()); 
            }
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1882:3: ( ruleQualifiedName )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1883:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getTypeTypeQualifiedNameParserRuleCall_1_1_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getTypeTypeQualifiedNameParserRuleCall_1_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getTypeTypeCrossReference_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__TypeAssignment_1_1"


    // $ANTLR start "rule__AssignmentStatement__RhsAssignment_1_2"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:1894:1: rule__AssignmentStatement__RhsAssignment_1_2 : ( RULE_INT ) ;
    public final void rule__AssignmentStatement__RhsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1898:1: ( ( RULE_INT ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1899:2: ( RULE_INT )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1899:2: ( RULE_INT )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1900:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentStatementAccess().getRhsINTTerminalRuleCall_1_2_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentStatementAccess().getRhsINTTerminalRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignmentStatement__RhsAssignment_1_2"


    // $ANTLR start "rule__FeatureCall__FeatureAssignment_0"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:1909:1: rule__FeatureCall__FeatureAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__FeatureCall__FeatureAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1913:1: ( ( ( RULE_ID ) ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1914:2: ( ( RULE_ID ) )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1914:2: ( ( RULE_ID ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1915:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureCallAccess().getFeatureMemberCrossReference_0_0()); 
            }
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1916:3: ( RULE_ID )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1917:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureCallAccess().getFeatureMemberIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureCallAccess().getFeatureMemberIDTerminalRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureCallAccess().getFeatureMemberCrossReference_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCall__FeatureAssignment_0"


    // $ANTLR start "rule__FeatureCall__MemberAssignment_1_2"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:1928:1: rule__FeatureCall__MemberAssignment_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__FeatureCall__MemberAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1932:1: ( ( ( RULE_ID ) ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1933:2: ( ( RULE_ID ) )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1933:2: ( ( RULE_ID ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1934:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureCallAccess().getMemberMemberCrossReference_1_2_0()); 
            }
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1935:3: ( RULE_ID )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1936:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureCallAccess().getMemberMemberIDTerminalRuleCall_1_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureCallAccess().getMemberMemberIDTerminalRuleCall_1_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureCallAccess().getMemberMemberCrossReference_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCall__MemberAssignment_1_2"


    // $ANTLR start "rule__Annotation__KeyAssignment_1"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:1947:1: rule__Annotation__KeyAssignment_1 : ( RULE_ID ) ;
    public final void rule__Annotation__KeyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1951:1: ( ( RULE_ID ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1952:2: ( RULE_ID )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1952:2: ( RULE_ID )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1953:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getKeyIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getKeyIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__KeyAssignment_1"


    // $ANTLR start "rule__Annotation__ValuesAssignment_2_1"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:1962:1: rule__Annotation__ValuesAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Annotation__ValuesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1966:1: ( ( RULE_STRING ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1967:2: ( RULE_STRING )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1967:2: ( RULE_STRING )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1968:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getValuesSTRINGTerminalRuleCall_2_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getValuesSTRINGTerminalRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__ValuesAssignment_2_1"


    // $ANTLR start "rule__Annotation__ValuesAssignment_2_2_1"
    // InternalCore861_ContentAssistLookAheadTestLanguage.g:1977:1: rule__Annotation__ValuesAssignment_2_2_1 : ( RULE_STRING ) ;
    public final void rule__Annotation__ValuesAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1981:1: ( ( RULE_STRING ) )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1982:2: ( RULE_STRING )
            {
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1982:2: ( RULE_STRING )
            // InternalCore861_ContentAssistLookAheadTestLanguage.g:1983:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getValuesSTRINGTerminalRuleCall_2_2_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getValuesSTRINGTerminalRuleCall_2_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__ValuesAssignment_2_2_1"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA11 dfa11 = new DFA11(this);
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
            return "282:1: rule__Member__Alternatives : ( ( ruleFieldDecl ) | ( ruleMethodDecl ) );";
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

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "()* loopback of 811:2: ( rule__MethodDecl__DeclsAssignment_7 )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000081810L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000640010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200012L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000800002L});

}