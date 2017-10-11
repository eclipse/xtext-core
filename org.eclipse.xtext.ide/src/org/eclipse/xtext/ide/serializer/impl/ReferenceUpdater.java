/*******************************************************************************
 * Copyright (c) 2017 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.ide.serializer.impl;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.formatting2.regionaccess.IEObjectRegion;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;
import org.eclipse.xtext.formatting2.regionaccess.ITextRegionDiffBuilder;
import org.eclipse.xtext.ide.serializer.hooks.IReferenceSnapshot;
import org.eclipse.xtext.ide.serializer.hooks.IReferenceUpdater;
import org.eclipse.xtext.ide.serializer.hooks.IReferenceUpdaterContext;
import org.eclipse.xtext.ide.serializer.hooks.IUpdatableReference;
import org.eclipse.xtext.ide.serializer.impl.EObjectDescriptionDeltaProvider.Delta;
import org.eclipse.xtext.ide.serializer.impl.EObjectDescriptionDeltaProvider.Deltas;
import org.eclipse.xtext.ide.serializer.impl.RelatedResourcesProvider.RelatedResource;
import org.eclipse.xtext.linking.impl.LinkingHelper;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.IScopeProvider;

import com.google.common.base.Objects;
import com.google.inject.Inject;

/**
 * @author Moritz Eysholdt - Initial contribution and API
 */
public class ReferenceUpdater implements IReferenceUpdater {

	@Inject
	private IQualifiedNameConverter converter;

	@Inject
	private LinkingHelper linkingHelper;

	@Inject
	private IQualifiedNameConverter nameConverter;

	@Inject
	private IScopeProvider scopeProvider;

	@Inject
	private IValueConverterService valueConverter;

	protected boolean containsReferenceText(Delta delta, QualifiedName exp) {
		DESC: for (IEObjectDescription desc : delta.getDescriptions()) {
			QualifiedName cand = desc.getQualifiedName();
			if (cand.getSegmentCount() >= exp.getSegmentCount()) {
				for (int i = 1; i <= exp.getSegmentCount(); i++) {
					String expSeg = exp.getSegment(exp.getSegmentCount() - i);
					String candSeg = cand.getSegment(cand.getSegmentCount() - i);
					if (!expSeg.equals(candSeg)) {
						continue DESC;
					}
				}
			}
			return true;
		}
		return false;
	}

	protected IUpdatableReference createUpdatableReference(ISemanticRegion current) {
		EReference ref = (EReference) current.getContainingFeature();
		CrossReference crossRef = GrammarUtil.containingCrossReference(current.getGrammarElement());
		EObject owner = current.getContainingRegion().getSemanticElement();
		Object value = owner.eGet(ref);
		if (value instanceof List<?>) {
			List<?> targets = (List<?>) value;
			int i = current.getIndexInContainingFeature();
			EObject t = (EObject) targets.get(i);
			return new UpdatableReference(owner, ref, i, t, crossRef, current);
		} else if (value instanceof EObject) {
			return new UpdatableReference(owner, ref, -1, (EObject) value, crossRef, current);
		} else {
			throw new IllegalStateException();
		}
	}

	public Delta findContainingDelta(Deltas deltas, EObject obj) {
		EObject current = obj;
		while (current != null) {
			Delta delta = deltas.getDelta(current);
			if (delta != null && delta.hasSimpleNameOrUserdataChanged()) {
				return delta;
			}
			current = current.eContainer();
		}
		return null;
	}

	protected String findValidName(IUpdatableReference updatable, IScope scope) {
		Iterable<IEObjectDescription> elements = scope.getElements(updatable.getTargetEObject());
		String ruleName = linkingHelper.getRuleNameFrom(updatable.getCrossReference());
		for (IEObjectDescription desc : elements) {
			try {
				String unconverted = nameConverter.toString(desc.getName());
				String string = valueConverter.toString(unconverted, ruleName);
				return string;
			} catch (ValueConverterException e) {
				// do nothing
			}
		}
		return null;
	}

	protected QualifiedName getQualifiedName(IUpdatableReference updatable) {
		String text = updatable.getReferenceRegion().getText();
		String ruleName = linkingHelper.getRuleNameFrom(updatable.getCrossReference());
		try {
			Object converted = valueConverter.toValue(text, ruleName, null);
			if (converted != null) {
				return converter.toQualifiedName(converted.toString());
			}
		} catch (ValueConverterException e) {
			// do nothing
		}
		return null;
	}

	@Override
	public boolean isAffected(Deltas deltas, RelatedResource resource) {
		for (IReferenceSnapshot ref : resource.outgoingReferences) {
			Delta delta = deltas.getDelta(ref.getTarget().getObject());
			if (delta != null) {
				return true;
			}
		}
		return false;
	}

	protected boolean needsUpdating(IReferenceUpdaterContext context, IUpdatableReference ref) {
		QualifiedName fqn = getQualifiedName(ref);
		if (fqn == null) {
			return false;
		}
		EObject target = ref.getTargetEObject();
		Deltas deltas = context.getEObjectDescriptionDeltas();
		Delta delta = deltas.getDelta(target);
		if (delta != null && !containsReferenceText(delta, fqn)) {
			return true;
		}
		Delta targetDelta = findContainingDelta(deltas, target);
		if (targetDelta != null && targetDelta.getObject() == target) {
			return true;
		}
		Delta sourceDelta = findContainingDelta(deltas, ref.getSourceEObject());
		return !Objects.equal(sourceDelta, targetDelta);
	}

	@Override
	public void update(IReferenceUpdaterContext context) {
		IEObjectRegion root = context.getModifyableDocument().getOriginalTextRegionAccess().regionForRootEObject();
		ISemanticRegion current = root.getPreviousHiddenRegion().getNextSemanticRegion();
		while (current != null) {
			EStructuralFeature feature = current.getContainingFeature();
			if (feature instanceof EReference && !((EReference) feature).isContainment()) {
				IUpdatableReference updatable = createUpdatableReference(current);
				if (needsUpdating(context, updatable)) {
					context.updateReference(updatable);
				}
			}
			current = current.getNextSemanticRegion();
		}
	}

	@Override
	public void updateReference(ITextRegionDiffBuilder rewriter, IUpdatableReference upd) {
		IUpdatableReference updatable = upd;
		if (rewriter.isModified(updatable.getReferenceRegion())) {
			return;
		}
		IScope scope = scopeProvider.getScope(updatable.getSourceEObject(), updatable.getEReference());
		ISemanticRegion region = updatable.getReferenceRegion();
		QualifiedName oldName = nameConverter.toQualifiedName(region.getText());
		IEObjectDescription oldDesc = scope.getSingleElement(oldName);
		if (oldDesc != null && oldDesc.getEObjectOrProxy() == updatable.getTargetEObject()) {
			return;
		}
		String newName = findValidName(updatable, scope);
		rewriter.replace(region, newName);
	}
}
