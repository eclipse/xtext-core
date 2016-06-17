/*******************************************************************************
 * Copyright (c) 2014 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.testing.smoketest;

import org.eclipse.xtext.testing.smoketest.internal.RunnerBuilder;
import org.junit.runners.Suite;
import org.junit.runners.model.InitializationError;

import com.google.common.annotations.Beta;

/**
 * Use this runner on a class that is annotated with {@link Suite.SuiteClasses}
 * to test the input documents that are used in that test class for exceptions
 * by using a {@link ScenarioProcessor}. The suite has to be annotated with {@link ProcessedBy}
 * to find the processor instance and the parameters.
 * 
 * Clients use inheritance to turn a conventional test suite into a smoke test suite, e.g
 * the smoke test suite can simple extend the other suite and use the {@link org.junit.runner.RunWith}
 * annotation with the {@link XtextSmokeTestRunner}.
 * 
 * If the original test suite contains test classes or test methods that should be skipped
 * by the smoke test, annotate those with {@link IgnoredBySmokeTest}.
 * 
 * @author Sebastian Zarnekow - Initial contribution and API
 * @since 2.7
 */
@Beta
public class XtextSmokeTestRunner extends Suite {

	public XtextSmokeTestRunner(Class<?> klass) throws InitializationError {
		super(klass, new RunnerBuilder(klass));
	}

}
