/*******************************************************************************
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.ide.server

import com.google.inject.Singleton
import java.nio.file.FileSystemNotFoundException
import java.nio.file.Paths
import org.eclipse.emf.common.util.URI
import java.net.URLDecoder
import java.io.File

/**
 * @author kosyakov - Initial contribution and API
 * @since 2.11
 */
@Singleton
class UriExtensions {

	def URI toUri(String pathWithScheme) {
		val javaNetUri = java.net.URI.create(pathWithScheme);
		val path = javaNetUri.toPath
		return URI.createURI(path)
	}

	def String toPath(URI uri) {
		return java.net.URI.create(uri.toString).toPath
	}

	def String toPath(java.net.URI uri) {
		try {
			val path = Paths.get(uri.path)
			return URLDecoder.decode(path.toUri.toString, "UTF-8");
		} catch (FileSystemNotFoundException e) {
			return uri.toString
		}
	}
}
