/**
 * Copyright (c) 2008 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.xtext.generator.parser.antlr

import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtext.xtext.generator.parser.antlr.splitting.AntlrParserSplitter
import org.eclipse.xtext.xtext.generator.parser.antlr.splitting.PartialClassExtractor
import org.eclipse.xtext.xtext.generator.parser.antlr.splitting.internal.LexerSpecialStateTransitionSplitter

@Accessors
class AntlrOptions {
	boolean backtrack = false
	boolean backtrackLexer = false
	boolean memoize = false
	int k = -1
	boolean ignoreCase = false
	boolean classSplitting = false
	@Accessors(PUBLIC_GETTER)
	int fieldsPerClass = AntlrParserSplitter.FIELDS_PER_CLASS
	@Accessors(PUBLIC_GETTER)
	int methodsPerClass = PartialClassExtractor.METHODS_PER_CLASS
	@Accessors(PUBLIC_GETTER)
	int casesPerSpecialStateSwitch = LexerSpecialStateTransitionSplitter.CASES_PER_SPECIAL_STATE_SWITCH
	boolean skipUnusedRules = false
	boolean optimizeCodeQuality = true
	boolean stripAllComments = false
	String keptBitSetsPattern
	String keptBitSetName

	def void setFieldsPerClass(String fieldsPerClass) {
		this.fieldsPerClass = Integer.parseInt(fieldsPerClass)
	}

	def void setMethodsPerClass(String methodsPerClass) {
		this.methodsPerClass = Integer.parseInt(methodsPerClass)
	}
	
	def void setCasesPerSpecialStateSwitch(String casesPerSpecialStateSwitch) {
		this.casesPerSpecialStateSwitch = Integer.parseInt(casesPerSpecialStateSwitch)
	}
	
	def void setKAsString(String k) {
		this.k = Integer.parseInt(k)
	}

}
