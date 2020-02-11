/**
 * Copyright (c) 2008 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.xtext.generator.parser.antlr;

import org.eclipse.xtend.lib.annotations.AccessorType;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xtext.generator.parser.antlr.splitting.AntlrParserSplitter;
import org.eclipse.xtext.xtext.generator.parser.antlr.splitting.PartialClassExtractor;
import org.eclipse.xtext.xtext.generator.parser.antlr.splitting.internal.LexerSpecialStateTransitionSplitter;

@Accessors
@SuppressWarnings("all")
public class AntlrOptions {
  private boolean backtrack = false;
  
  private boolean backtrackLexer = false;
  
  private boolean memoize = false;
  
  private int k = (-1);
  
  private boolean ignoreCase = false;
  
  private boolean classSplitting = false;
  
  @Accessors(AccessorType.PUBLIC_GETTER)
  private int fieldsPerClass = AntlrParserSplitter.FIELDS_PER_CLASS;
  
  @Accessors(AccessorType.PUBLIC_GETTER)
  private int methodsPerClass = PartialClassExtractor.METHODS_PER_CLASS;
  
  @Accessors(AccessorType.PUBLIC_GETTER)
  private int casesPerSpecialStateSwitch = LexerSpecialStateTransitionSplitter.CASES_PER_SPECIAL_STATE_SWITCH;
  
  private boolean skipUnusedRules = false;
  
  private boolean optimizeCodeQuality = true;
  
  private boolean stripAllComments = false;
  
  private String keptBitSetsPattern;
  
  private String keptBitSetName;
  
  public void setFieldsPerClass(final String fieldsPerClass) {
    this.fieldsPerClass = Integer.parseInt(fieldsPerClass);
  }
  
  public void setMethodsPerClass(final String methodsPerClass) {
    this.methodsPerClass = Integer.parseInt(methodsPerClass);
  }
  
  public void setCasesPerSpecialStateSwitch(final String casesPerSpecialStateSwitch) {
    this.casesPerSpecialStateSwitch = Integer.parseInt(casesPerSpecialStateSwitch);
  }
  
  public void setKAsString(final String k) {
    this.k = Integer.parseInt(k);
  }
  
  @Pure
  public boolean isBacktrack() {
    return this.backtrack;
  }
  
  public void setBacktrack(final boolean backtrack) {
    this.backtrack = backtrack;
  }
  
  @Pure
  public boolean isBacktrackLexer() {
    return this.backtrackLexer;
  }
  
  public void setBacktrackLexer(final boolean backtrackLexer) {
    this.backtrackLexer = backtrackLexer;
  }
  
  @Pure
  public boolean isMemoize() {
    return this.memoize;
  }
  
  public void setMemoize(final boolean memoize) {
    this.memoize = memoize;
  }
  
  @Pure
  public int getK() {
    return this.k;
  }
  
  public void setK(final int k) {
    this.k = k;
  }
  
  @Pure
  public boolean isIgnoreCase() {
    return this.ignoreCase;
  }
  
  public void setIgnoreCase(final boolean ignoreCase) {
    this.ignoreCase = ignoreCase;
  }
  
  @Pure
  public boolean isClassSplitting() {
    return this.classSplitting;
  }
  
  public void setClassSplitting(final boolean classSplitting) {
    this.classSplitting = classSplitting;
  }
  
  @Pure
  public int getFieldsPerClass() {
    return this.fieldsPerClass;
  }
  
  @Pure
  public int getMethodsPerClass() {
    return this.methodsPerClass;
  }
  
  @Pure
  public int getCasesPerSpecialStateSwitch() {
    return this.casesPerSpecialStateSwitch;
  }
  
  @Pure
  public boolean isSkipUnusedRules() {
    return this.skipUnusedRules;
  }
  
  public void setSkipUnusedRules(final boolean skipUnusedRules) {
    this.skipUnusedRules = skipUnusedRules;
  }
  
  @Pure
  public boolean isOptimizeCodeQuality() {
    return this.optimizeCodeQuality;
  }
  
  public void setOptimizeCodeQuality(final boolean optimizeCodeQuality) {
    this.optimizeCodeQuality = optimizeCodeQuality;
  }
  
  @Pure
  public boolean isStripAllComments() {
    return this.stripAllComments;
  }
  
  public void setStripAllComments(final boolean stripAllComments) {
    this.stripAllComments = stripAllComments;
  }
  
  @Pure
  public String getKeptBitSetsPattern() {
    return this.keptBitSetsPattern;
  }
  
  public void setKeptBitSetsPattern(final String keptBitSetsPattern) {
    this.keptBitSetsPattern = keptBitSetsPattern;
  }
  
  @Pure
  public String getKeptBitSetName() {
    return this.keptBitSetName;
  }
  
  public void setKeptBitSetName(final String keptBitSetName) {
    this.keptBitSetName = keptBitSetName;
  }
}
