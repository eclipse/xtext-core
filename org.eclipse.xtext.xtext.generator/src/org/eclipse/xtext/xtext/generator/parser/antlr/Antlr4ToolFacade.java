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
import java.io.FilenameFilter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.WrappedException;

import com.google.common.collect.Lists;
import com.google.common.io.Files;

public class Antlr4ToolFacade {

	private static final String TARGETTOCOPYTOKENSTO = "/org/antlr/codebuff/";

	private static final String SRC_GEN = "/src-gen/";

	private static final String ORG_ANTLR_CODEBUFF = "org.antlr.codebuff";

	private final static Logger log = Logger.getLogger(Antlr4ToolFacade.class);

	public final static String className = "org.antlr.v4.Tool";

	private ClassLoader loader = Antlr4ToolFacade.class.getClassLoader();

	public void setLoader(ClassLoader loader) {
		this.loader = loader;
	}

	private String downloadURL = "https://www.antlr.org/download/antlr-4.5.3-complete.jar";
	private boolean askBeforeDownload = false;
	
	public static final String ANTLR4GEN = "antlr4gen";
	public static final String TARGETFOLDER = ANTLR4GEN + "/target/";
	
	public void setAskBeforeDownload(boolean shouldAsk) {
		this.askBeforeDownload = shouldAsk;
	}

	public void setDownloadFrom(String downloadURL) {
		this.downloadURL = downloadURL;
	}

	private String downloadTo = "./antlr-4.5.3-complete.jar";

	public void setDownloadTo(String path) {
		this.downloadTo = path;
	}

	protected File file() {
		return new File(downloadTo);
	}

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

			Object[] args = new Object[] { new String[] { grammarFullPath, "-o", ANTLR4GEN + SRC_GEN, "-package", ORG_ANTLR_CODEBUFF } };
			Constructor<?> constructor = class1.getConstructor(new Class[] { String[].class });
			Object newInstance = constructor.newInstance(args);
			log.info("Loading AntLR 4 grammar.");
			Method loadGrammar = class1.getMethod("loadGrammar", new Class[] { String.class });
			Object grammar = loadGrammar.invoke(newInstance, grammarFullPath);
			//Method process = class1.getMethod("process", new Class[] { grammar.getClass(), boolean.class });
			Method process = class1.getMethod("processGrammarsOnCommandLine");
			
			log.info("Generate AntLR 4 parser.");
			//process.invoke(newInstance, grammar, true);
			process.invoke(newInstance);
			// Compile to code to target folder!
			JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
			File src_gen_folder = new File("./" + ANTLR4GEN + SRC_GEN);
			ArrayList<File> filesToCompile = Lists.newArrayList();
			for (File child : src_gen_folder.listFiles(new FilenameFilter() {

				@Override
				public boolean accept(File dir, String name) {
					return name.endsWith("java");
				}
			})) {
				filesToCompile.add(child);
			}
			StandardJavaFileManager fileManager = compiler.getStandardFileManager(null, null, null);
			Iterable<? extends JavaFileObject> javaFileObjectsFromFiles = fileManager
					.getJavaFileObjectsFromFiles(filesToCompile);
			List<String> optionList = new ArrayList<String>();
			// set compiler's classpath to be same as the runtime's
			optionList.addAll(Arrays.asList("-classpath",
					System.getProperty("java.class.path") + ":" + file().getAbsolutePath(), "-d", TARGETFOLDER));
			log.info("Compile AntLR 4 Parser.");
			compiler.getTask(null, fileManager, null, optionList, null, javaFileObjectsFromFiles).call();
			fileManager.close();
			for( File child : src_gen_folder.listFiles(new FilenameFilter() {

				@Override
				public boolean accept(File dir, String name) {
					return name.endsWith("tokens");
				}
			})) {
				Files.copy(child, new File(TARGETFOLDER + TARGETTOCOPYTOKENSTO + child.getName()));
			}
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
