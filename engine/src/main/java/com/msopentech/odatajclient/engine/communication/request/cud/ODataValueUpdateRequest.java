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
package com.msopentech.odatajclient.engine.communication.request.cud;

import com.msopentech.odatajclient.engine.client.http.HttpClientException;
import com.msopentech.odatajclient.engine.client.http.HttpMethod;
import com.msopentech.odatajclient.engine.communication.response.ODataResponseImpl;
import com.msopentech.odatajclient.engine.communication.request.ODataBasicRequestImpl;
import com.msopentech.odatajclient.engine.communication.request.batch.ODataBatchableRequest;
import com.msopentech.odatajclient.engine.communication.response.ODataValueUpdateResponse;
import com.msopentech.odatajclient.engine.data.ODataPrimitiveValue;
import com.msopentech.odatajclient.engine.data.ODataValue;
import com.msopentech.odatajclient.engine.data.metadata.edm.EdmSimpleType;
import com.msopentech.odatajclient.engine.format.ODataValueFormat;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.entity.InputStreamEntity;

/**
 * This class implements an OData update entity property value request.
 * Get instance by using ODataCUDRequestFactory.
 *
 * @see ODataCUDRequestFactory#getUpdateValueRequest(com.msopentech.odatajclient.engine.data.ODataURI,
 * com.msopentech.odatajclient.engine.data.ODataValue)
 */
public class ODataValueUpdateRequest extends ODataBasicRequestImpl<ODataValueUpdateResponse, ODataValueFormat>
        implements ODataBatchableRequest {

    /**
     * Value to be created.
     */
    private final ODataValue value;

    /**
     * Constructor.
     *
     * @param method request method.
     * @param targetURI entity set or entity or entity property URI.
     * @param value value to be created.
     */
    ODataValueUpdateRequest(final HttpMethod method, final URI targetURI, final ODataValue value) {
        super(ODataValueFormat.class, method, targetURI);
        // set request body
        this.value = value;
    }

    /**
     * {@inheritDoc }
     */
    @Override
    public ODataValueUpdateResponseImpl execute() {
        final InputStream input = getPayload();
        ((HttpEntityEnclosingRequestBase) request).setEntity(new InputStreamEntity(input, -1));

        try {
            return new ODataValueUpdateResponseImpl(client, doExecute());
        } finally {
            IOUtils.closeQuietly(input);
        }
    }

    /**
     * {@inheritDoc }
     */
    @Override
    protected InputStream getPayload() {
        return IOUtils.toInputStream(value.toString());
    }

    /**
     * Response class about an ODataValueUpdateRequest.
     */
    private class ODataValueUpdateResponseImpl extends ODataResponseImpl implements ODataValueUpdateResponse {

        private ODataValue value = null;

        /**
         * Constructor.
         * <p>
         * Just to create response templates to be initialized from batch.
         */
        private ODataValueUpdateResponseImpl() {
        }

        /**
         * Constructor.
         *
         * @param client HTTP client.
         * @param res HTTP response.
         */
        private ODataValueUpdateResponseImpl(final HttpClient client, final HttpResponse res) {
            super(client, res);
        }

        /**
         * {@inheritDoc }
         */
        @Override
        public ODataValue getBody() {
            if (value == null) {
                final ODataValueFormat format = ODataValueFormat.fromString(getAccept());

                try {
                    value = new ODataPrimitiveValue.Builder().
                            setType(format == ODataValueFormat.TEXT ? EdmSimpleType.String : EdmSimpleType.Stream).
                            setText(IOUtils.toString(getRawResponse())).
                            build();
                } catch (IOException e) {
                    throw new HttpClientException(e);
                } finally {
                    this.close();
                }
            }
            return value;
        }
    }
}
