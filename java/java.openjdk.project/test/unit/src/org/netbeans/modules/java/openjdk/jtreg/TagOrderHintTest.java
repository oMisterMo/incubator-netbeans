/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.netbeans.modules.java.openjdk.jtreg;

import org.junit.Test;
import org.netbeans.modules.java.hints.test.api.HintTest;

public class TagOrderHintTest {

    @Test
    public void testFixOrder() throws Exception {
        HintTest.create()
                .input("/*@test\n" +
                       " *@modules\n" +
                       " *@summary\n" +
                       " *@build\n" +
                       " *@run main\n" +
                       " */\n" +
                       "class Test {\n" +
                       "}\n")
                .run(TagOrderHint.class)
                .findWarning("0:2-0:7:verifier:" + Bundle.ERR_TagOrderHint())
                .applyFix()
                .assertVerbatimOutput("/*@test\n" +
                                      " *@summary\n" +
                                      " *@modules\n" +
                                      " *@build\n" +
                                      " *@run main\n" +
                                      " */\n" +
                                      "class Test {\n" +
                                      "}\n");
    }

    @Test
    public void testOrderCorrect() throws Exception {
        HintTest.create().
                input("/*@test\n" +
                      " *@summary\n" +
                      " *@modules\n" +
                      " *@build\n" +
                      " *@run main\n" +
                      " */\n" +
                      "class Test {\n" +
                      "}\n").
                run(TagOrderHint.class).
                assertWarnings();
    }

}
