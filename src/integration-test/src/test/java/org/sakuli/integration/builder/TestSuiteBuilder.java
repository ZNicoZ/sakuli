/*
 * Sakuli - Testing and Monitoring-Tool for Websites and common UIs.
 *
 * Copyright 2013 - 2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.sakuli.integration.builder;

import org.sakuli.datamodel.TestCase;
import org.sakuli.datamodel.TestSuite;
import org.sakuli.datamodel.state.TestSuiteState;

import java.util.Date;

/**
 * @author tschneck
 *         Date: 08.05.2014
 */
public class TestSuiteBuilder {

    public static TestSuite createEmptyTestSuite() {
        TestSuite newTestSuite = new TestSuite();
        newTestSuite.setName("Integration Test Sample Test Suite");
        newTestSuite.setId("IntegrationTest_" + System.nanoTime());
        newTestSuite.setStartDate(new Date());
        newTestSuite.setWarningTime(0);
        newTestSuite.setCriticalTime(0);
        newTestSuite.setState(TestSuiteState.RUNNING);
        newTestSuite.setBrowserInfo("Firefox Test Browser");

        TestCase testCase = TestCaseBuilder.createEmptyTestCase();
        newTestSuite.addTestCase(testCase.getId(), testCase);
        return newTestSuite;
    }
}
