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
/*
 * PropertyElement.java
 *
 * Created on November 18, 2004, 10:45 AM
 */

package org.netbeans.modules.j2ee.sun.dd.api.common;

/**
 *
 * @author  Nitya Doraisamy
 */
public interface PropertyElement extends org.netbeans.modules.j2ee.sun.dd.api.CommonDDBean {

     public static final String NAME = "Name";	// NOI18N
     public static final String VALUE = "Value";	// NOI18N
     public static final String DESCRIPTION = "Description";	// NOI18N

    /** Setter for name property
     * @param value property value
     */
    public void setName(java.lang.String value);
    /** Getter for name property.
     * @return property value
     */
    public java.lang.String getName();
    /** Setter for value property
     * @param value property value
     */
    public void setValue(java.lang.String value);
    /** Getter for value property.
     * @return property value
     */
    public java.lang.String getValue();
}
