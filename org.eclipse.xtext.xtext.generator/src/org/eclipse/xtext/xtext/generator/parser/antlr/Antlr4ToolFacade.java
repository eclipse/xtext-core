/*******************************************************************************
 * Copyright (c) 2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.xtext.generator.parser.antlr;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.WrappedException;

public class Antlr4ToolFacade {

	private final static Logger log = Logger.getLogger(Antlr4ToolFacade.class);

	public final static String className = "org.antlr.v4.Tool";

	private ClassLoader loader = Antlr4ToolFacade.class.getClassLoader();

	public void setLoader(ClassLoader loader) {
		this.loader = loader;
	}

	private String downloadURL = "http://www.antlr.org/download/antlr-4.7-complete.jar";
	private boolean askBeforeDownload = true;

	public void setAskBeforeDownload(boolean shouldAsk) {
		this.askBeforeDownload = shouldAsk;
	}

	public void setDownloadFrom(String downloadURL) {
		this.downloadURL = downloadURL;
	}

	private String downloadTo = "./antlr-4.7-complete.jar";

	public void setDownloadTo(String path) {
		this.downloadTo = path;
	}

	protected File file() {
		return new File(downloadTo);
	}

	/**
	 * @noreference This method is not intended to be referenced by clients.
	 * @since 2.4
	 */
	protected String getToolRunnerClassName() {
		return className;
	}

	protected ClassLoader initializedClassLoader() {
		try {
			loader.loadClass(getToolRunnerClassName());
			return loader;
		} catch (ClassNotFoundException e) {
			if (!file().exists()) {
				if (!download())
					return null;
			}
			if (file().exists()) {
				try {
					URL url = file().toURI().toURL();
					loader = new URLClassLoader(new URL[] { url }, null);

					return loader;

				} catch (MalformedURLException e1) {
					log.error(e1.getMessage(), e1);
				}
			}
			return null;
		}
	}

	public boolean download() {
		try {
			if (askBeforeDownload) {
				boolean ok = false;
				while (!ok) {
					System.err.print(
							"\n*ATTENTION*\nIt is recommended to use the ANTLR 4 parser generator (BSD licence - http://www.antlr.org/license.html).\nDo you agree to download it (size 1MB) from '"
									+ downloadURL + "'? (type 'y' or 'n' and hit enter)");
					int read = System.in.read();
					if (read == 'n') {
						return false;
					} else if (read == 'y') {
						ok = true;
					}
				}
			}
			log.info("downloading file from '" + downloadURL + "' ...");
			BufferedInputStream in = new BufferedInputStream(new URL(downloadURL).openStream());
			try {
				FileOutputStream out = new FileOutputStream(file());
				try {
					byte[] buffer = new byte[2048];
					int readBytes = -1;
					while ((readBytes = in.read(buffer)) != -1) {
						out.write(buffer, 0, readBytes);
					}
				} finally {
					out.close();
				}
			} finally {
				in.close();
			}
			log.info("finished downloading.");
		} catch (IOException e) {
			System.err.println("Downloading ANTLR4 parser generator failed: " + e.getMessage());
			return false;
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			return false;
		}
		if (initializedClassLoader() == null) {
			log.error("Loaded jar doesn't contain " + className);
			return false;
		}
		return true;
	}

	private IllegalStateException getNoClassFoundException() {
		return new IllegalStateException("Couldn't find ANTLR generator on class path. Please download manually from '"
				+ downloadURL + "' and put it on the classpath.");
	}

	public void runWithEncodingAndParams(String grammarFullPath, String explicitEncoding) {
		ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
		try {
			ClassLoader myLoader = initializedClassLoader();
			Thread.currentThread().setContextClassLoader(myLoader);
			Class<?> class1 = myLoader.loadClass(className);
			
			if (class1 == null)
				throw getNoClassFoundException();

			Object[] args = new Object[] { new String[] { grammarFullPath } };
			Constructor<?> constructor = class1.getConstructor(new Class[] { String[].class });
			Object newInstance = constructor.newInstance(args);
			Method loadGrammar = class1.getMethod("loadGrammar", new Class[] { String.class });
			Object grammar = loadGrammar.invoke(newInstance, grammarFullPath);
			Method process = class1.getMethod("process", new Class[] { grammar.getClass(), boolean.class });
			process.invoke(newInstance, grammar, true);

		} catch (Exception e) {
			throw new WrappedException(e);
		} finally {
			Thread.currentThread().setContextClassLoader(contextClassLoader);
		}
	}

	public boolean isWorkable() {
		return initializedClassLoader() != null;
	}
}
