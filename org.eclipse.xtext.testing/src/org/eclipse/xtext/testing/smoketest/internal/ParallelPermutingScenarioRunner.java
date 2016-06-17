/*******************************************************************************
 * Copyright (c) 2014 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.testing.smoketest.internal;

import org.eclipse.xtext.testing.smoketest.Scenario;
import org.eclipse.xtext.testing.smoketest.ScenarioProcessor;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;

import com.google.common.annotations.Beta;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
@Beta
public class ParallelPermutingScenarioRunner extends AbstractParallelScenarioRunner {

	private final Scenario scenario;
	
	public ParallelPermutingScenarioRunner(Class<?> klass, Scenario scenario, Class<? extends ScenarioProcessor> processorClass) throws InitializationError {
		super(klass, processorClass);
		this.scenario = scenario;
	}
	
	@Override
	protected String getName() {
		return getTestClass().getJavaClass().getSimpleName() + " [" + getProcessorName() + "]";
	}
	
	@Override
	protected String testName(FrameworkMethod method) {
		return super.testName(method) + " [" + scenario.toString() + "][" + getProcessorName() + "]";
	}
	
	@Override
	protected void doProcess(String data, ScenarioProcessor processor) throws Exception {
		scenario.processInput(data, processor);
	}
	
}
