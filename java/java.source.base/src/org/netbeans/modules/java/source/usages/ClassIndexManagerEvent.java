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
package org.netbeans.modules.java.source.usages;

import java.net.URL;
import java.util.EventObject;
import java.util.Set;

/**
 *
 * @author Tomas Zezula
 */
public final class ClassIndexManagerEvent extends EventObject {
    
    private final Set<? extends URL> roots;

    public ClassIndexManagerEvent (final ClassIndexManager source, final Set<? extends URL> roots) {
        super (source);
        assert roots != null;
        this.roots = roots;
    }
       
    
    public Set<? extends URL> getRoots () {
        return this.roots;
    }

    @Override
    public String toString() {
        return String.format(
            "%s[source: %s, roots: %s]",    //NOI18N
            ClassIndexManagerEvent.class.getName(),
            getSource(),
            getRoots());
    }
    
}
