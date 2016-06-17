/*******************************************************************************
 * Copyright (c) 2014 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.testing.smoketest;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.google.common.annotations.Beta;

/**
 * Mandatory annotation for smoke test suites. Points to the class
 * that processes a given input string.
 * 
 * @author Sebastian Zarnekow - Initial contribution and API
 * @since 2.7
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
@Documented
@Beta
public @interface ProcessedBy {
	
	/**
	 * The processor for this smoke test.
	 */
	Class<? extends ScenarioProcessor> value();
	
	/**
	 * If set to true, no permutations will be applied to the test data.
	 */
	boolean processCompleteInput() default false;
	
	/**
	 * If set to true, the methods of the test class will be processed in parallel
	 */
	boolean processInParallel() default false;
}