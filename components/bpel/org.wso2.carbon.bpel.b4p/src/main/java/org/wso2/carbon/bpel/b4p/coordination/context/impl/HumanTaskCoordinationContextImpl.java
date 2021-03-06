/*
 * Copyright (c) WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.carbon.bpel.b4p.coordination.context.impl;

import org.apache.axiom.om.OMElement;
import org.apache.axis2.addressing.EndpointReference;
import org.wso2.carbon.bpel.b4p.coordination.context.AbstractCoordinationContext;
import org.wso2.carbon.bpel.b4p.coordination.context.WSConstants;

/**
 * WS-HumanTask Coordination Context implementation.
 */
public class HumanTaskCoordinationContextImpl extends AbstractCoordinationContext {

    public HumanTaskCoordinationContextImpl(OMElement context) {
        super(context);
    }

    /**
     * Create WS-Coordination context using parameters.
     *
     * @param identifier          message ID
     * @param registrationService EPR of the Registration service
     */
    public HumanTaskCoordinationContextImpl(String identifier, EndpointReference registrationService) {
        super(identifier, WSConstants.WS_HT_COORDINATION_TYPE, registrationService);
    }

}
