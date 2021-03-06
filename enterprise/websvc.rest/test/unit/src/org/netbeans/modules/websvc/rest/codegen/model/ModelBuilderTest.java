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

package org.netbeans.modules.websvc.rest.codegen.model;

import java.util.ArrayList;
import java.util.List;
import org.netbeans.modules.websvc.rest.codegen.TestBase;

/**
 *
 * @author nam
 */
public class ModelBuilderTest extends TestBase {
    
    public ModelBuilderTest(String name) {
        super(name);
    }

    public void setUp() throws Exception {
    }

    public void tearDown() throws Exception {
    }

    public void testBuildModel() throws Exception {
        /*ModelBuilder mb = new ModelBuilder(getEntities());
        ResourceBeanModel model = mb.build();
        assertEquals(14, model.getResourceBeans().size());
        ResourceBean container = model.getContainerResourceBean("com.acme.Customer");
        ResourceBean item = model.getItemResourceBean("com.acme.Customer");
        assertEquals(1, container.getSubResources().size());
        assertEquals("Customer", container.getSubResources().iterator().next().getResourceBean().getName());
        assertEquals(2, item.getSubResources().size());
        List<RelatedResource> subResources = new ArrayList<RelatedResource>(item.getSubResources());
        assertEquals("DiscountCode", subResources.get(0).getResourceBean().getName());*/
    }
}
