/*
 * Copyright (c) 2016, 2017 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.ide.tests.testlanguage.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.tests.testlanguage.ide.contentassist.antlr.internal.InternalCore861_ContentAssistLookAheadTestLanguageParser;
import org.eclipse.xtext.ide.tests.testlanguage.services.Core861_ContentAssistLookAheadTestLanguageGrammarAccess;

public class Core861_ContentAssistLookAheadTestLanguageParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(Core861_ContentAssistLookAheadTestLanguageGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, Core861_ContentAssistLookAheadTestLanguageGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getMemberAccess().getAlternatives(), "rule__Member__Alternatives");
			builder.put(grammarAccess.getFieldDeclAccess().getModifierAlternatives_1_0(), "rule__FieldDecl__ModifierAlternatives_1_0");
			builder.put(grammarAccess.getMethodDeclAccess().getModifierAlternatives_1_0(), "rule__MethodDecl__ModifierAlternatives_1_0");
			builder.put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
			builder.put(grammarAccess.getStatementAccess().getAlternatives(), "rule__Statement__Alternatives");
			builder.put(grammarAccess.getFieldDeclAccess().getGroup(), "rule__FieldDecl__Group__0");
			builder.put(grammarAccess.getFieldDeclAccess().getGroup_4(), "rule__FieldDecl__Group_4__0");
			builder.put(grammarAccess.getMethodDeclAccess().getGroup(), "rule__MethodDecl__Group__0");
			builder.put(grammarAccess.getTypeAccess().getGroup_0(), "rule__Type__Group_0__0");
			builder.put(grammarAccess.getTypeAccess().getGroup_1(), "rule__Type__Group_1__0");
			builder.put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
			builder.put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
			builder.put(grammarAccess.getStatementAccess().getGroup_1(), "rule__Statement__Group_1__0");
			builder.put(grammarAccess.getAssignmentStatementAccess().getGroup(), "rule__AssignmentStatement__Group__0");
			builder.put(grammarAccess.getAssignmentStatementAccess().getGroup_1(), "rule__AssignmentStatement__Group_1__0");
			builder.put(grammarAccess.getFeatureCallAccess().getGroup(), "rule__FeatureCall__Group__0");
			builder.put(grammarAccess.getFeatureCallAccess().getGroup_1(), "rule__FeatureCall__Group_1__0");
			builder.put(grammarAccess.getAnnotationAccess().getGroup(), "rule__Annotation__Group__0");
			builder.put(grammarAccess.getAnnotationAccess().getGroup_2(), "rule__Annotation__Group_2__0");
			builder.put(grammarAccess.getAnnotationAccess().getGroup_2_2(), "rule__Annotation__Group_2_2__0");
			builder.put(grammarAccess.getFieldDeclAccess().getAnnotationsAssignment_0(), "rule__FieldDecl__AnnotationsAssignment_0");
			builder.put(grammarAccess.getFieldDeclAccess().getModifierAssignment_1(), "rule__FieldDecl__ModifierAssignment_1");
			builder.put(grammarAccess.getFieldDeclAccess().getTypeAssignment_2(), "rule__FieldDecl__TypeAssignment_2");
			builder.put(grammarAccess.getFieldDeclAccess().getNameAssignment_3(), "rule__FieldDecl__NameAssignment_3");
			builder.put(grammarAccess.getFieldDeclAccess().getInitValAssignment_4_1(), "rule__FieldDecl__InitValAssignment_4_1");
			builder.put(grammarAccess.getMethodDeclAccess().getAnnotationsAssignment_0(), "rule__MethodDecl__AnnotationsAssignment_0");
			builder.put(grammarAccess.getMethodDeclAccess().getModifierAssignment_1(), "rule__MethodDecl__ModifierAssignment_1");
			builder.put(grammarAccess.getMethodDeclAccess().getTypeAssignment_2(), "rule__MethodDecl__TypeAssignment_2");
			builder.put(grammarAccess.getMethodDeclAccess().getNameAssignment_3(), "rule__MethodDecl__NameAssignment_3");
			builder.put(grammarAccess.getMethodDeclAccess().getDeclsAssignment_7(), "rule__MethodDecl__DeclsAssignment_7");
			builder.put(grammarAccess.getMethodDeclAccess().getStatementsAssignment_8(), "rule__MethodDecl__StatementsAssignment_8");
			builder.put(grammarAccess.getTypeAccess().getTypeAssignment_1_1(), "rule__Type__TypeAssignment_1_1");
			builder.put(grammarAccess.getAssignmentStatementAccess().getRhsAssignment_1_2(), "rule__AssignmentStatement__RhsAssignment_1_2");
			builder.put(grammarAccess.getFeatureCallAccess().getFeatureAssignment_0(), "rule__FeatureCall__FeatureAssignment_0");
			builder.put(grammarAccess.getFeatureCallAccess().getMemberAssignment_1_2(), "rule__FeatureCall__MemberAssignment_1_2");
			builder.put(grammarAccess.getAnnotationAccess().getKeyAssignment_1(), "rule__Annotation__KeyAssignment_1");
			builder.put(grammarAccess.getAnnotationAccess().getValuesAssignment_2_1(), "rule__Annotation__ValuesAssignment_2_1");
			builder.put(grammarAccess.getAnnotationAccess().getValuesAssignment_2_2_1(), "rule__Annotation__ValuesAssignment_2_2_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private Core861_ContentAssistLookAheadTestLanguageGrammarAccess grammarAccess;

	@Override
	protected InternalCore861_ContentAssistLookAheadTestLanguageParser createParser() {
		InternalCore861_ContentAssistLookAheadTestLanguageParser result = new InternalCore861_ContentAssistLookAheadTestLanguageParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public Core861_ContentAssistLookAheadTestLanguageGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(Core861_ContentAssistLookAheadTestLanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
