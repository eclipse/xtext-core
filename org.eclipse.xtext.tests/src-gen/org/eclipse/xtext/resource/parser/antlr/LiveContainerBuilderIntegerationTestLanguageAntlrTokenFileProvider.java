/*
 * generated by Xtext
 */
package org.eclipse.xtext.resource.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class LiveContainerBuilderIntegerationTestLanguageAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("org/eclipse/xtext/resource/parser/antlr/internal/InternalLiveContainerBuilderIntegerationTestLanguage.tokens");
	}
}
