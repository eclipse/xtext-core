/*
 * generated by Xtext
 */
package org.eclipse.xtext.serializer.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class HiddenTokenSequencerTestLanguageAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("org/eclipse/xtext/serializer/parser/antlr/internal/InternalHiddenTokenSequencerTestLanguage.tokens");
	}
}
