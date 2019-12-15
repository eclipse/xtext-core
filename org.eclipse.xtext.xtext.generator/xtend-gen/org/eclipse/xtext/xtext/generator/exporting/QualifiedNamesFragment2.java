/**
 * Copyright (c) 2015, 2019 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.xtext.generator.exporting;

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.xtext.generator.AbstractXtextGeneratorFragment;
import org.eclipse.xtext.xtext.generator.model.GuiceModuleAccess;
import org.eclipse.xtext.xtext.generator.model.TypeReference;

@SuppressWarnings("all")
public class QualifiedNamesFragment2 extends AbstractXtextGeneratorFragment {
  @Override
  public void generate() {
    new GuiceModuleAccess.BindingFactory().addTypeToType(TypeReference.typeRef(IQualifiedNameProvider.class), TypeReference.typeRef(DefaultDeclarativeQualifiedNameProvider.class)).contributeTo(this.getLanguage().getRuntimeGenModule());
    new GuiceModuleAccess.BindingFactory().addTypeToType(TypeReference.typeRef("org.eclipse.xtext.ui.editor.contentassist.PrefixMatcher"), 
      TypeReference.typeRef("org.eclipse.xtext.ui.editor.contentassist.FQNPrefixMatcher")).addTypeToType(TypeReference.typeRef("org.eclipse.xtext.ui.refactoring.IDependentElementsCalculator"), 
      TypeReference.typeRef("org.eclipse.xtext.ui.refactoring.impl.DefaultDependentElementsCalculator")).contributeTo(this.getLanguage().getEclipsePluginGenModule());
    new GuiceModuleAccess.BindingFactory().addTypeToType(TypeReference.typeRef("org.eclipse.xtext.ide.editor.contentassist.IPrefixMatcher"), 
      TypeReference.typeRef("org.eclipse.xtext.ide.editor.contentassist.FQNPrefixMatcher")).contributeTo(this.getLanguage().getIdeGenModule());
  }
}
