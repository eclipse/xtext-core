/*******************************************************************************
 * Copyright (c) 2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.naming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.xtext.util.Strings;

/**
 * @author Sven Efftinge - Initial contribution and API
 */
public class QualifiedName {
	private String name;
	private List<String> segments;
	
	public QualifiedName(String name) {
		this.name = name;
		this.segments = Strings.split(name,".");
	}
	
	public QualifiedName(List<String> segments) {
		this.name = Strings.concat(".", segments);
		this.segments = new ArrayList<String>(segments);
	}

	public List<String> segments() {
		if (hasWildCard())
			return segments.subList(0, segments.size()-1);
		return Collections.unmodifiableList(segments);
	}
	
	public boolean hasWildCard() {
		return segments.get(segments.size()-1).equals("*");
	}
	
	@Override
	public String toString() {
		return name;
	}

	public String lastSegment() {
		return segments.get(segments.size() - (hasWildCard()?2:1));
	}
	
	public QualifiedName replaceWildcard(String fragment) {
		if (!hasWildCard())
			throw new IllegalStateException("No wildcard");
		return new QualifiedName(name.replace("*", fragment));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((segments == null) ? 0 : segments.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		QualifiedName other = (QualifiedName) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (segments == null) {
			if (other.segments != null)
				return false;
		} else if (!segments.equals(other.segments))
			return false;
		return true;
	}
	
}
