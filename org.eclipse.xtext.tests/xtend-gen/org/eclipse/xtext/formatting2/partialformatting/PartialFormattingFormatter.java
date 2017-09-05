/**
 * Copyright (c) 2017 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.formatting2.partialformatting;

import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.IHiddenRegionFormatter;
import org.eclipse.xtext.formatting2.partialformatting.partialformattingtestlanguage.Attribute;
import org.eclipse.xtext.formatting2.partialformatting.partialformattingtestlanguage.Entity;
import org.eclipse.xtext.formatting2.partialformatting.partialformattingtestlanguage.Model;
import org.eclipse.xtext.formatting2.partialformatting.partialformattingtestlanguage.Property;
import org.eclipse.xtext.formatting2.partialformatting.partialformattingtestlanguage.Reference;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

/**
 * @author cwehrheim - Initial contribution and API
 */
@SuppressWarnings("all")
public class PartialFormattingFormatter extends AbstractFormatter2 {
  protected void _format(final Model model, @Extension final IFormattableDocument document) {
    EList<Entity> _entities = model.getEntities();
    for (final Entity entities : _entities) {
      document.<Entity>format(entities);
    }
  }
  
  protected void _format(final Entity entity, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(this.textRegionExtensions.regionFor(entity).keyword("entity"), _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.append(this.textRegionExtensions.regionFor(entity).keyword("{"), _function_1);
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(this.textRegionExtensions.regionFor(entity).keyword("}"), _function_2);
    final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
      it.indent();
    };
    document.<ISemanticRegion, ISemanticRegion>interior(
      this.textRegionExtensions.regionFor(entity).keyword("{"), 
      this.textRegionExtensions.regionFor(entity).keyword("}"), _function_3);
    EList<Property> _properties = entity.getProperties();
    for (final Property properties : _properties) {
      document.<Property>format(properties);
    }
  }
  
  protected void _format(final Attribute attr, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(this.textRegionExtensions.regionFor(attr).keyword("attr"), _function);
  }
  
  protected void _format(final Reference ref, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(this.textRegionExtensions.regionFor(ref).keyword("ref"), _function);
  }
  
  public void format(final Object attr, final IFormattableDocument document) {
    if (attr instanceof XtextResource) {
      _format((XtextResource)attr, document);
      return;
    } else if (attr instanceof Attribute) {
      _format((Attribute)attr, document);
      return;
    } else if (attr instanceof Reference) {
      _format((Reference)attr, document);
      return;
    } else if (attr instanceof Entity) {
      _format((Entity)attr, document);
      return;
    } else if (attr instanceof Model) {
      _format((Model)attr, document);
      return;
    } else if (attr instanceof EObject) {
      _format((EObject)attr, document);
      return;
    } else if (attr == null) {
      _format((Void)null, document);
      return;
    } else if (attr != null) {
      _format(attr, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(attr, document).toString());
    }
  }
}
