/*
 *
 *  * Copyright 2014 NAVER Corp.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *     http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 *
 */

package com.navercorp.pinpoint.web.websocket.message;

import java.util.Map;

/**
 * @Author Taejin Koo
 */
public class RequestMessage extends AbstractPinpointWebSocketMessage {

    private final String command;
    private final Map params;

    public RequestMessage(String command, Map params) {
        this.command = command;
        this.params = params;
    }

    public String getCommand() {
        return command;
    }

    public Map getParams() {
        return params;
    }

    @Override
    public PinpointWebSocketMessageType getType() {
        return PinpointWebSocketMessageType.REQUEST;
    }

}
