/*
 * Copyright 2013 MS OpenTech.
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
package com.msopentech.odatajclient.engine.communication.request.retrieve;

import com.msopentech.odatajclient.engine.communication.response.ODataQueryResponse;
import com.msopentech.odatajclient.engine.types.ODataMediaFormat;
import java.io.InputStream;
import java.net.URI;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * This class implements an OData media query request.
 * Get instance by using ODataRetrieveRequestFactory.
 *
 * @see ODataRetrieveRequestFactory#getMediaRequest(java.net.URI)
 */
public class ODataMediaRequest extends ODataQueryRequest<InputStream, ODataMediaFormat> {

    /**
     * Private constructor.
     *
     * @param query query to be executed.
     */
    ODataMediaRequest(final URI query) {
        super(query);
        setAccept(MediaType.APPLICATION_OCTET_STREAM);
        setContentType(MediaType.APPLICATION_OCTET_STREAM);
    }

    /**
     * {@inheritDoc }
     */
    @Override
    public ODataQueryResponse<InputStream> execute() {
        final Response res = client.accept(getContentType()).get();
        return new ODataMediaResponseImpl(res);
    }

    protected class ODataMediaResponseImpl extends ODataQueryResponseImpl {

        private ODataMediaResponseImpl(final Response res) {
            super(res);
        }

        @Override
        public InputStream getBody() {
            return res.readEntity(InputStream.class);
        }
    }
}
