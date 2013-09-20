/**
 * Copyright © Microsoft Open Technologies, Inc.
 *
 * All Rights Reserved
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * THIS CODE IS PROVIDED *AS IS* BASIS, WITHOUT WARRANTIES OR CONDITIONS
 * OF ANY KIND, EITHER EXPRESS OR IMPLIED, INCLUDING WITHOUT LIMITATION
 * ANY IMPLIED WARRANTIES OR CONDITIONS OF TITLE, FITNESS FOR A
 * PARTICULAR PURPOSE, MERCHANTABILITY OR NON-INFRINGEMENT.
 *
 * See the Apache License, Version 2.0 for the specific language
 * governing permissions and limitations under the License.
 */
package com.msopentech.odatajclient.engine.communication.response;

import com.msopentech.odatajclient.engine.communication.request.batch.ODataBatchResponseItem;
import java.util.Iterator;

/**
 * This class implements a response to a batch request.
 *
 * @see com.msopentech.odatajclient.engine.communication.request.batch.ODataBatchRequest
 */
public interface ODataBatchResponse extends ODataResponse {

    /**
     * Get all the batch response items.
     *
     * @return an iterator on batch response items.
     */
    Iterator<ODataBatchResponseItem> getBody();
}
