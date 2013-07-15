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
package com.msopentech.odatajclient.engine.communication.request.streamed;

import com.msopentech.odatajclient.engine.communication.request.ODataStreamManager;
import com.msopentech.odatajclient.engine.communication.request.batch.ODataBatchableRequest;
import com.msopentech.odatajclient.engine.communication.request.cud.ODataCUDRequestFactory;
import com.msopentech.odatajclient.engine.communication.request.streamed.ODataMediaEntityUpdateRequest.MediaEntityUpdateStreamManager;
import com.msopentech.odatajclient.engine.communication.response.ODataMediaEntityUpdateResponse;
import com.msopentech.odatajclient.engine.communication.response.ODataResponseImpl;
import com.msopentech.odatajclient.engine.data.ODataEntity;
import com.msopentech.odatajclient.engine.data.ODataReader;
import java.io.InputStream;
import java.net.URI;
import java.util.concurrent.TimeUnit;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;

/**
 * This class implements an OData Media Entity create request.
 * Get instance by using ODataCUDRequestFactory.
 *
 * @see ODataCUDRequestFactory#getMediaEntityUpdateRequest(java.net.URI, java.io.InputStream)
 */
public class ODataMediaEntityUpdateRequest
        extends ODataStreamedEntityRequestImpl<ODataMediaEntityUpdateResponse, MediaEntityUpdateStreamManager>
        implements ODataBatchableRequest {

    private final InputStream media;

    /**
     * Constructor.
     *
     * @param method request method.
     * @param editURI edit URI of the entity to be updated.
     * @param media media entity blob to be created.
     */
    ODataMediaEntityUpdateRequest(final Method method, final URI editURI, final InputStream media) {
        super(method, editURI);
        this.media = media;
    }

    /**
     * {@inheritDoc }
     */
    @Override
    protected MediaEntityUpdateStreamManager getStreamManager() {
        if (streamManager == null) {
            streamManager = new MediaEntityUpdateStreamManager(media);
        }
        return (MediaEntityUpdateStreamManager) streamManager;
    }

    /**
     * Media entity payload object.
     */
    public class MediaEntityUpdateStreamManager extends ODataStreamManager<ODataMediaEntityUpdateResponse> {

        /**
         * Private constructor.
         *
         * @param input media stream.
         */
        private MediaEntityUpdateStreamManager(final InputStream input) {
            super(ODataMediaEntityUpdateRequest.this.futureWrapper, input);
        }

        /**
         * {@inheritDoc }
         */
        @Override
        protected ODataMediaEntityUpdateResponse getResponse(final long timeout, final TimeUnit unit) {
            finalizeBody();
            return new ODataMediaEntityUpdateResponseImpl(client, getHttpResponse(timeout, unit));
        }
    }

    private class ODataMediaEntityUpdateResponseImpl extends ODataResponseImpl
            implements ODataMediaEntityUpdateResponse {

        private ODataEntity entity = null;

        private ODataMediaEntityUpdateResponseImpl() {
        }

        private ODataMediaEntityUpdateResponseImpl(final HttpClient client, final HttpResponse res) {
            super(client, res);
        }

        @Override
        public ODataEntity getBody() {
            if (entity == null) {
                try {
                    entity = ODataReader.readEntity(getRawResponse(), getFormat());
                } finally {
                    this.close();
                }
            }
            return entity;
        }
    }
}