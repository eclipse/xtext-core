/**
 * Copyright (c) 2015, 2019 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.jar.Manifest;

import org.eclipse.emf.common.util.URI;

/**
 * @since 2.9
 */
public class XtextVersion {

	private final String version;

	public XtextVersion(String version) {
		this.version = version;
	}

	public static XtextVersion getCurrent() {
		String versionFromManifest = XtextVersion.readVersionFromManifest();
		return new XtextVersion(versionFromManifest != null ? versionFromManifest : "unknown"); 
	}

	public String getXtextGradlePluginVersion() {
		return "2.0.8";
	}

	/**
	 * @noreference
	 */
	public String getMweVersion() {
		return "2.11.1";
	}

	public String getAntlrGeneratorVersion() {
		return "2.1.1";
	}

	public String getXtendGradlePluginVersion() {
		return getXtextGradlePluginVersion();
	}

	/**
	 * @noreference
	 */
	public String getXtendAndroidGradlePluginVersion() {
		return getXtendGradlePluginVersion();
	}

	/**
	 * @return <code>true</code> if the current version ends with '-SNAPSHOT'
	 */
	public boolean isSnapshot() {
		return version.endsWith("-SNAPSHOT");
	}

	/**
	 * @return <code>true</code> if the current version is not a snapshot and
	 * not a release<br>
	 * Release builds must match a following pattern: N.N(.N)+<br>
	 * (N is a digit)<br>
	 * For example 2.9.2 is a release, 2.9.2.beta3 is stable.
	 */
	public boolean isStable() {
		return !isSnapshot() && !version.matches("\\d+\\.\\d+(\\.\\d+)+");
	}

	@Override
	public String toString() {
		return version;
	}

	/**
	 * Tries to read the Xtext version from this bundle's manifest. The method opens the
	 * manifest of org.eclipse.xtext.util and reads the <code>Maven-Version</code> value from
	 * it. In CI scenarios this will be "unspecified", then it continues to read the
	 * <code>Bundle-Version</code> value. If this ends with ".qualifier", it replaces the qualifier
	 * by "-SNAPSHOT". Otherwise it will return the base version without the qualifier.
	 * 
	 * @return Version string in format <code>MAJOR.MINOR.MICRO[-SNAPSHOT]</code>
	 */
	private static String readVersionFromManifest() {
		try {
			URL ownManifestURL = getOwnManifestURL();
			
			try (InputStream is = ownManifestURL.openStream()) {
				Manifest manifest = new Manifest(is);
				String bundleId = manifest.getMainAttributes().getValue("Bundle-SymbolicName");
				if (!"org.eclipse.xtext.util".equals(bundleId)) {
					throw new IllegalStateException("Wrong manifest, Bundle-SymbolicName is: "+bundleId);
				}
				String version = manifest.getMainAttributes().getValue("Maven-Version");
				if ("unspecified".equals(version)) {
					version = manifest.getMainAttributes().getValue("Bundle-Version");
					if (version.endsWith(".qualifier")) {
						return version.replace(".qualifier", "-SNAPSHOT");
					} else {
						return version.substring(0, version.lastIndexOf("."));
					}
				}
				return version;
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * Locates the URL of this bundle's manifest file. This is done by locating the manifest file
	 * relative to the class resource of this class. The location can be either be a file URL in the context
	 * of unit test execution or an archive URL for CI/release bundle.
	 * 
	 * @throws FileNotFoundException When the MANIFEST.MF for org.eclipse.xtext.util was not found
	 */
	private static URL getOwnManifestURL () throws FileNotFoundException {
		// can't use XtextVersion.class.getResource() as it retrieves the first manifest found,
		// not the one for this bundle. Thus we have to search for the right one first.
		// we do this here by locating the class file of XtextVersion from its classloader and locate
		// the manifest relative to the base URI
		try {
			String ownClassAsResourcePath = XtextVersion.class.getName().replace('.', '/')+".class";
			URL ownClassResourceURL = XtextVersion.class.getClassLoader().getResource(ownClassAsResourcePath);
			URI ownClassResourceURI = URI.createURI(ownClassResourceURL.toURI().toString());
			
			// The XtextVersion class has 5 segments. When the class is bundled in a jar the manifest is located 
			// relative to the root.
			// In a unit test the class is located in the build output directory, but the manifest
			// is found relative to the project root. This can be either 1 or 2 levels above (bin/main in Gradle or target in Maven).
			for (int i=5; i<=7; i++) {
				URI ownManifestURI = ownClassResourceURI.trimSegments(i).appendSegments(new String[]{"META-INF", "MANIFEST.MF"});
				URL ownManifestURL = new URL(ownManifestURI.toString());
				try (InputStream is = ownManifestURL.openStream()) {
					// when the URL can be opened, then we found the manifest
					return ownManifestURL;
				} catch (IOException e) {
					continue;
				}
			}
			throw new FileNotFoundException("Could not find MANIFEST.MF for org.eclipse.xtext.util");
		} catch (URISyntaxException | MalformedURLException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public int hashCode() {
		return 31 * 1 + ((this.version== null) ? 0 : this.version.hashCode());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		XtextVersion other = (XtextVersion) obj;
		if (version == null) {
			if (other.version != null) {
				return false;
			}
		} else if (!version.equals(other.version)) {
			return false;
		}
		return true;
	}

	public String getVersion() {
		return version;
	}
}
