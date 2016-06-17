package org.eclipse.xtext.serializer.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSequencerTestLanguageLexer extends Lexer {
    public static final int T__50=50;
    public static final int RULE_ID1=5;
    public static final int RULE_ID2=6;
    public static final int RULE_ID3=7;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=9;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalSequencerTestLanguageLexer() {;} 
    public InternalSequencerTestLanguageLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalSequencerTestLanguageLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalSequencerTestLanguage.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSequencerTestLanguage.g:11:7: ( '#1' )
            // InternalSequencerTestLanguage.g:11:9: '#1'
            {
            match("#1"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSequencerTestLanguage.g:12:7: ( '#2' )
            // InternalSequencerTestLanguage.g:12:9: '#2'
            {
            match("#2"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSequencerTestLanguage.g:13:7: ( 'kw1' )
            // InternalSequencerTestLanguage.g:13:9: 'kw1'
            {
            match("kw1"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSequencerTestLanguage.g:14:7: ( 'kw2' )
            // InternalSequencerTestLanguage.g:14:9: 'kw2'
            {
            match("kw2"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSequencerTestLanguage.g:15:7: ( '#3' )
            // InternalSequencerTestLanguage.g:15:9: '#3'
            {
            match("#3"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSequencerTestLanguage.g:16:7: ( 'kw3' )
            // InternalSequencerTestLanguage.g:16:9: 'kw3'
            {
            match("kw3"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSequencerTestLanguage.g:17:7: ( '#4' )
            // InternalSequencerTestLanguage.g:17:9: '#4'
            {
            match("#4"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSequencerTestLanguage.g:18:7: ( '#5' )
            // InternalSequencerTestLanguage.g:18:9: '#5'
            {
            match("#5"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSequencerTestLanguage.g:19:7: ( 'kw4' )
            // InternalSequencerTestLanguage.g:19:9: 'kw4'
            {
            match("kw4"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSequencerTestLanguage.g:20:7: ( 'kw5' )
            // InternalSequencerTestLanguage.g:20:9: 'kw5'
            {
            match("kw5"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSequencerTestLanguage.g:21:7: ( '#6' )
            // InternalSequencerTestLanguage.g:21:9: '#6'
            {
            match("#6"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSequencerTestLanguage.g:22:7: ( ',' )
            // InternalSequencerTestLanguage.g:22:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSequencerTestLanguage.g:23:7: ( '#7' )
            // InternalSequencerTestLanguage.g:23:9: '#7'
            {
            match("#7"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSequencerTestLanguage.g:24:7: ( '#8' )
            // InternalSequencerTestLanguage.g:24:9: '#8'
            {
            match("#8"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSequencerTestLanguage.g:25:7: ( '#9' )
            // InternalSequencerTestLanguage.g:25:9: '#9'
            {
            match("#9"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSequencerTestLanguage.g:26:7: ( 'kw' )
            // InternalSequencerTestLanguage.g:26:9: 'kw'
            {
            match("kw"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSequencerTestLanguage.g:27:7: ( '#10' )
            // InternalSequencerTestLanguage.g:27:9: '#10'
            {
            match("#10"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSequencerTestLanguage.g:28:7: ( '#11' )
            // InternalSequencerTestLanguage.g:28:9: '#11'
            {
            match("#11"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSequencerTestLanguage.g:29:7: ( '#12' )
            // InternalSequencerTestLanguage.g:29:9: '#12'
            {
            match("#12"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSequencerTestLanguage.g:30:7: ( '#13' )
            // InternalSequencerTestLanguage.g:30:9: '#13'
            {
            match("#13"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSequencerTestLanguage.g:31:7: ( '#14' )
            // InternalSequencerTestLanguage.g:31:9: '#14'
            {
            match("#14"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSequencerTestLanguage.g:32:7: ( '#15' )
            // InternalSequencerTestLanguage.g:32:9: '#15'
            {
            match("#15"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSequencerTestLanguage.g:33:7: ( '#16' )
            // InternalSequencerTestLanguage.g:33:9: '#16'
            {
            match("#16"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSequencerTestLanguage.g:34:7: ( '#17' )
            // InternalSequencerTestLanguage.g:34:9: '#17'
            {
            match("#17"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSequencerTestLanguage.g:35:7: ( '#18' )
            // InternalSequencerTestLanguage.g:35:9: '#18'
            {
            match("#18"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSequencerTestLanguage.g:36:7: ( '#19' )
            // InternalSequencerTestLanguage.g:36:9: '#19'
            {
            match("#19"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSequencerTestLanguage.g:37:7: ( '#20' )
            // InternalSequencerTestLanguage.g:37:9: '#20'
            {
            match("#20"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSequencerTestLanguage.g:38:7: ( '#21' )
            // InternalSequencerTestLanguage.g:38:9: '#21'
            {
            match("#21"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSequencerTestLanguage.g:39:7: ( '#22' )
            // InternalSequencerTestLanguage.g:39:9: '#22'
            {
            match("#22"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSequencerTestLanguage.g:40:7: ( 'Bye' )
            // InternalSequencerTestLanguage.g:40:9: 'Bye'
            {
            match("Bye"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSequencerTestLanguage.g:41:7: ( '#23' )
            // InternalSequencerTestLanguage.g:41:9: '#23'
            {
            match("#23"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSequencerTestLanguage.g:42:7: ( '#24' )
            // InternalSequencerTestLanguage.g:42:9: '#24'
            {
            match("#24"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSequencerTestLanguage.g:43:7: ( '#25' )
            // InternalSequencerTestLanguage.g:43:9: '#25'
            {
            match("#25"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSequencerTestLanguage.g:44:7: ( '#26' )
            // InternalSequencerTestLanguage.g:44:9: '#26'
            {
            match("#26"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSequencerTestLanguage.g:45:7: ( '#27' )
            // InternalSequencerTestLanguage.g:45:9: '#27'
            {
            match("#27"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSequencerTestLanguage.g:46:7: ( 'kw6' )
            // InternalSequencerTestLanguage.g:46:9: 'kw6'
            {
            match("kw6"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSequencerTestLanguage.g:47:7: ( '#28' )
            // InternalSequencerTestLanguage.g:47:9: '#28'
            {
            match("#28"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSequencerTestLanguage.g:48:7: ( '.' )
            // InternalSequencerTestLanguage.g:48:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSequencerTestLanguage.g:49:7: ( '#29' )
            // InternalSequencerTestLanguage.g:49:9: '#29'
            {
            match("#29"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSequencerTestLanguage.g:50:7: ( '#30' )
            // InternalSequencerTestLanguage.g:50:9: '#30'
            {
            match("#30"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSequencerTestLanguage.g:51:7: ( '#31' )
            // InternalSequencerTestLanguage.g:51:9: '#31'
            {
            match("#31"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSequencerTestLanguage.g:52:7: ( '#32' )
            // InternalSequencerTestLanguage.g:52:9: '#32'
            {
            match("#32"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSequencerTestLanguage.g:53:7: ( '#33' )
            // InternalSequencerTestLanguage.g:53:9: '#33'
            {
            match("#33"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSequencerTestLanguage.g:54:7: ( '#34' )
            // InternalSequencerTestLanguage.g:54:9: '#34'
            {
            match("#34"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSequencerTestLanguage.g:55:7: ( 'kwp2' )
            // InternalSequencerTestLanguage.g:55:9: 'kwp2'
            {
            match("kwp2"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSequencerTestLanguage.g:56:7: ( 'kwp1' )
            // InternalSequencerTestLanguage.g:56:9: 'kwp1'
            {
            match("kwp1"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSequencerTestLanguage.g:57:7: ( 'kwp3' )
            // InternalSequencerTestLanguage.g:57:9: 'kwp3'
            {
            match("kwp3"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSequencerTestLanguage.g:58:7: ( '#35' )
            // InternalSequencerTestLanguage.g:58:9: '#35'
            {
            match("#35"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSequencerTestLanguage.g:59:7: ( 'kwd' )
            // InternalSequencerTestLanguage.g:59:9: 'kwd'
            {
            match("kwd"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "RULE_ID1"
    public final void mRULE_ID1() throws RecognitionException {
        try {
            int _type = RULE_ID1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSequencerTestLanguage.g:4755:10: ( '$1' RULE_ID )
            // InternalSequencerTestLanguage.g:4755:12: '$1' RULE_ID
            {
            match("$1"); 

            mRULE_ID(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID1"

    // $ANTLR start "RULE_ID2"
    public final void mRULE_ID2() throws RecognitionException {
        try {
            int _type = RULE_ID2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSequencerTestLanguage.g:4757:10: ( '$2' RULE_ID )
            // InternalSequencerTestLanguage.g:4757:12: '$2' RULE_ID
            {
            match("$2"); 

            mRULE_ID(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID2"

    // $ANTLR start "RULE_ID3"
    public final void mRULE_ID3() throws RecognitionException {
        try {
            int _type = RULE_ID3;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSequencerTestLanguage.g:4759:10: ( '$3' RULE_ID )
            // InternalSequencerTestLanguage.g:4759:12: '$3' RULE_ID
            {
            match("$3"); 

            mRULE_ID(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID3"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSequencerTestLanguage.g:4761:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalSequencerTestLanguage.g:4761:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalSequencerTestLanguage.g:4761:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalSequencerTestLanguage.g:4761:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalSequencerTestLanguage.g:4761:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSequencerTestLanguage.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSequencerTestLanguage.g:4763:10: ( ( '0' .. '9' )+ )
            // InternalSequencerTestLanguage.g:4763:12: ( '0' .. '9' )+
            {
            // InternalSequencerTestLanguage.g:4763:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSequencerTestLanguage.g:4763:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSequencerTestLanguage.g:4765:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalSequencerTestLanguage.g:4765:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalSequencerTestLanguage.g:4765:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalSequencerTestLanguage.g:4765:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalSequencerTestLanguage.g:4765:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalSequencerTestLanguage.g:4765:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSequencerTestLanguage.g:4765:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalSequencerTestLanguage.g:4765:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalSequencerTestLanguage.g:4765:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalSequencerTestLanguage.g:4765:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSequencerTestLanguage.g:4765:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSequencerTestLanguage.g:4767:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalSequencerTestLanguage.g:4767:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalSequencerTestLanguage.g:4767:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSequencerTestLanguage.g:4767:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSequencerTestLanguage.g:4769:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalSequencerTestLanguage.g:4769:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalSequencerTestLanguage.g:4769:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSequencerTestLanguage.g:4769:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalSequencerTestLanguage.g:4769:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSequencerTestLanguage.g:4769:41: ( '\\r' )? '\\n'
                    {
                    // InternalSequencerTestLanguage.g:4769:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalSequencerTestLanguage.g:4769:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSequencerTestLanguage.g:4771:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalSequencerTestLanguage.g:4771:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalSequencerTestLanguage.g:4771:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSequencerTestLanguage.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSequencerTestLanguage.g:4773:16: ( . )
            // InternalSequencerTestLanguage.g:4773:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalSequencerTestLanguage.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | RULE_ID1 | RULE_ID2 | RULE_ID3 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=59;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalSequencerTestLanguage.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // InternalSequencerTestLanguage.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // InternalSequencerTestLanguage.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // InternalSequencerTestLanguage.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // InternalSequencerTestLanguage.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // InternalSequencerTestLanguage.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // InternalSequencerTestLanguage.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // InternalSequencerTestLanguage.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // InternalSequencerTestLanguage.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // InternalSequencerTestLanguage.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // InternalSequencerTestLanguage.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // InternalSequencerTestLanguage.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // InternalSequencerTestLanguage.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // InternalSequencerTestLanguage.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // InternalSequencerTestLanguage.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // InternalSequencerTestLanguage.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // InternalSequencerTestLanguage.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // InternalSequencerTestLanguage.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // InternalSequencerTestLanguage.g:1:118: T__32
                {
                mT__32(); 

                }
                break;
            case 20 :
                // InternalSequencerTestLanguage.g:1:124: T__33
                {
                mT__33(); 

                }
                break;
            case 21 :
                // InternalSequencerTestLanguage.g:1:130: T__34
                {
                mT__34(); 

                }
                break;
            case 22 :
                // InternalSequencerTestLanguage.g:1:136: T__35
                {
                mT__35(); 

                }
                break;
            case 23 :
                // InternalSequencerTestLanguage.g:1:142: T__36
                {
                mT__36(); 

                }
                break;
            case 24 :
                // InternalSequencerTestLanguage.g:1:148: T__37
                {
                mT__37(); 

                }
                break;
            case 25 :
                // InternalSequencerTestLanguage.g:1:154: T__38
                {
                mT__38(); 

                }
                break;
            case 26 :
                // InternalSequencerTestLanguage.g:1:160: T__39
                {
                mT__39(); 

                }
                break;
            case 27 :
                // InternalSequencerTestLanguage.g:1:166: T__40
                {
                mT__40(); 

                }
                break;
            case 28 :
                // InternalSequencerTestLanguage.g:1:172: T__41
                {
                mT__41(); 

                }
                break;
            case 29 :
                // InternalSequencerTestLanguage.g:1:178: T__42
                {
                mT__42(); 

                }
                break;
            case 30 :
                // InternalSequencerTestLanguage.g:1:184: T__43
                {
                mT__43(); 

                }
                break;
            case 31 :
                // InternalSequencerTestLanguage.g:1:190: T__44
                {
                mT__44(); 

                }
                break;
            case 32 :
                // InternalSequencerTestLanguage.g:1:196: T__45
                {
                mT__45(); 

                }
                break;
            case 33 :
                // InternalSequencerTestLanguage.g:1:202: T__46
                {
                mT__46(); 

                }
                break;
            case 34 :
                // InternalSequencerTestLanguage.g:1:208: T__47
                {
                mT__47(); 

                }
                break;
            case 35 :
                // InternalSequencerTestLanguage.g:1:214: T__48
                {
                mT__48(); 

                }
                break;
            case 36 :
                // InternalSequencerTestLanguage.g:1:220: T__49
                {
                mT__49(); 

                }
                break;
            case 37 :
                // InternalSequencerTestLanguage.g:1:226: T__50
                {
                mT__50(); 

                }
                break;
            case 38 :
                // InternalSequencerTestLanguage.g:1:232: T__51
                {
                mT__51(); 

                }
                break;
            case 39 :
                // InternalSequencerTestLanguage.g:1:238: T__52
                {
                mT__52(); 

                }
                break;
            case 40 :
                // InternalSequencerTestLanguage.g:1:244: T__53
                {
                mT__53(); 

                }
                break;
            case 41 :
                // InternalSequencerTestLanguage.g:1:250: T__54
                {
                mT__54(); 

                }
                break;
            case 42 :
                // InternalSequencerTestLanguage.g:1:256: T__55
                {
                mT__55(); 

                }
                break;
            case 43 :
                // InternalSequencerTestLanguage.g:1:262: T__56
                {
                mT__56(); 

                }
                break;
            case 44 :
                // InternalSequencerTestLanguage.g:1:268: T__57
                {
                mT__57(); 

                }
                break;
            case 45 :
                // InternalSequencerTestLanguage.g:1:274: T__58
                {
                mT__58(); 

                }
                break;
            case 46 :
                // InternalSequencerTestLanguage.g:1:280: T__59
                {
                mT__59(); 

                }
                break;
            case 47 :
                // InternalSequencerTestLanguage.g:1:286: T__60
                {
                mT__60(); 

                }
                break;
            case 48 :
                // InternalSequencerTestLanguage.g:1:292: T__61
                {
                mT__61(); 

                }
                break;
            case 49 :
                // InternalSequencerTestLanguage.g:1:298: T__62
                {
                mT__62(); 

                }
                break;
            case 50 :
                // InternalSequencerTestLanguage.g:1:304: RULE_ID1
                {
                mRULE_ID1(); 

                }
                break;
            case 51 :
                // InternalSequencerTestLanguage.g:1:313: RULE_ID2
                {
                mRULE_ID2(); 

                }
                break;
            case 52 :
                // InternalSequencerTestLanguage.g:1:322: RULE_ID3
                {
                mRULE_ID3(); 

                }
                break;
            case 53 :
                // InternalSequencerTestLanguage.g:1:331: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 54 :
                // InternalSequencerTestLanguage.g:1:339: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 55 :
                // InternalSequencerTestLanguage.g:1:348: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 56 :
                // InternalSequencerTestLanguage.g:1:360: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 57 :
                // InternalSequencerTestLanguage.g:1:376: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 58 :
                // InternalSequencerTestLanguage.g:1:392: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 59 :
                // InternalSequencerTestLanguage.g:1:400: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\1\16\1\31\1\uffff\1\31\1\uffff\2\16\2\uffff\3\16\2\uffff\1\57\1\72\1\101\6\uffff\1\112\2\uffff\1\31\46\uffff\1\114\1\115\1\116\1\117\1\120\1\121\1\31\1\125\1\uffff\1\126\6\uffff\1\127\1\130\1\131\5\uffff";
    static final String DFA12_eofS =
        "\132\uffff";
    static final String DFA12_minS =
        "\1\0\1\61\1\167\1\uffff\1\171\1\uffff\1\61\1\101\2\uffff\2\0\1\52\2\uffff\3\60\6\uffff\1\60\2\uffff\1\145\46\uffff\6\60\1\61\1\60\1\uffff\1\60\6\uffff\3\60\5\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\71\1\167\1\uffff\1\171\1\uffff\1\63\1\172\2\uffff\2\uffff\1\57\2\uffff\2\71\1\65\6\uffff\1\172\2\uffff\1\145\46\uffff\6\172\1\63\1\172\1\uffff\1\172\6\uffff\3\172\5\uffff";
    static final String DFA12_acceptS =
        "\3\uffff\1\14\1\uffff\1\46\2\uffff\1\65\1\66\3\uffff\1\72\1\73\3\uffff\1\7\1\10\1\13\1\15\1\16\1\17\1\uffff\1\65\1\14\1\uffff\1\46\1\62\1\63\1\64\1\66\1\67\1\70\1\71\1\72\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\1\1\33\1\34\1\35\1\37\1\40\1\41\1\42\1\43\1\45\1\47\1\2\1\50\1\51\1\52\1\53\1\54\1\60\1\5\10\uffff\1\20\1\uffff\1\3\1\4\1\6\1\11\1\12\1\44\3\uffff\1\61\1\36\1\55\1\56\1\57";
    static final String DFA12_specialS =
        "\1\1\11\uffff\1\2\1\0\116\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\16\2\15\2\16\1\15\22\16\1\15\1\16\1\12\1\1\1\6\2\16\1\13\4\16\1\3\1\16\1\5\1\14\12\11\7\16\1\10\1\4\30\10\3\16\1\7\1\10\1\16\12\10\1\2\17\10\uff85\16",
            "\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27",
            "\1\30",
            "",
            "\1\33",
            "",
            "\1\35\1\36\1\37",
            "\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "",
            "\0\41",
            "\0\41",
            "\1\42\4\uffff\1\43",
            "",
            "",
            "\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56",
            "\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71",
            "\1\73\1\74\1\75\1\76\1\77\1\100",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\31\1\102\1\103\1\104\1\105\1\106\1\107\3\31\7\uffff\32\31\4\uffff\1\31\1\uffff\3\31\1\111\13\31\1\110\12\31",
            "",
            "",
            "\1\113",
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
            "",
            "",
            "",
            "",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\123\1\122\1\124",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    static class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | RULE_ID1 | RULE_ID2 | RULE_ID3 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_11 = input.LA(1);

                        s = -1;
                        if ( ((LA12_11>='\u0000' && LA12_11<='\uFFFF')) ) {s = 33;}

                        else s = 14;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='#') ) {s = 1;}

                        else if ( (LA12_0=='k') ) {s = 2;}

                        else if ( (LA12_0==',') ) {s = 3;}

                        else if ( (LA12_0=='B') ) {s = 4;}

                        else if ( (LA12_0=='.') ) {s = 5;}

                        else if ( (LA12_0=='$') ) {s = 6;}

                        else if ( (LA12_0=='^') ) {s = 7;}

                        else if ( (LA12_0=='A'||(LA12_0>='C' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='j')||(LA12_0>='l' && LA12_0<='z')) ) {s = 8;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 9;}

                        else if ( (LA12_0=='\"') ) {s = 10;}

                        else if ( (LA12_0=='\'') ) {s = 11;}

                        else if ( (LA12_0=='/') ) {s = 12;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 13;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='%' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='+')||LA12_0=='-'||(LA12_0>=':' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||(LA12_0>='{' && LA12_0<='\uFFFF')) ) {s = 14;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_10 = input.LA(1);

                        s = -1;
                        if ( ((LA12_10>='\u0000' && LA12_10<='\uFFFF')) ) {s = 33;}

                        else s = 14;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}