/*******************************************************************************
 * Copyright (c) 2015, 2019 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.ide.labels

import com.google.common.collect.ImmutableList
import java.util.List
import org.eclipse.xtend.lib.annotations.Data

/**
 * Describes an image in a platform independent way.
 * Subclasses should implement {@link Object#equals(Object)} and {@link Object#hashCode()}.
 * 
 * @author Jan Koehnlein - Initial contribution and API
 * @noimplement
 * @noextend
 */
interface IImageDescription {
	val DEFAULT = new SimpleImageDescription('default')	
}

@Data
class SimpleImageDescription implements IImageDescription {
	String imageID
}

@Data 
class AlternativeImageDescription implements IImageDescription {
	List<String> imageIDs
	
	new(Iterable<String> imageIDs) {
		this.imageIDs = ImmutableList.copyOf(imageIDs)
	}
}

@Data
class DecoratedImageDescription implements IImageDescription {
	IImageDescription baseImage
	
	List<IImageDescription> decorators	
	
	new(IImageDescription baseImage, IImageDescription... decorators) {
		this.baseImage = baseImage
		this.decorators = ImmutableList.copyOf(decorators)
	}
}