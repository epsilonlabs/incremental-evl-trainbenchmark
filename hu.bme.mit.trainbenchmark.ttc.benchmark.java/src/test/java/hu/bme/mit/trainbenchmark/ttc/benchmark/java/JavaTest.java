/*******************************************************************************
 * Copyright (c) 2010-2015, Gabor Szarnyas, Benedek Izso, Istvan Rath and Daniel Varro
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Benedek Izso - initial API and implementation
 *   Gabor Szarnyas - initial API and implementation
 *******************************************************************************/
package hu.bme.mit.trainbenchmark.ttc.benchmark.java;

import hu.bme.mit.trainbenchmark.ttc.benchmark.config.BenchmarkConfig;
import hu.bme.mit.trainbenchmark.ttc.benchmark.config.ChangeSet;
import hu.bme.mit.trainbenchmark.ttc.benchmark.scenarios.AbstractBenchmarkLogic;
import hu.bme.mit.trainbenchmark.ttc.benchmark.test.TrainBenchmarkTest;

import java.io.IOException;

public class JavaTest extends TrainBenchmarkTest {

	@Override
	protected AbstractBenchmarkLogic getBenchmarkLogic(final BenchmarkConfig bc) {
		return new JavaBenchmarkLogic(bc);
	}

	@Override
	public BenchmarkConfig initialize(final String query) throws IOException {
		return new JavaBenchmarkConfig(1, 1, query, 1, ChangeSet.FIXED, 1);
	}

}
