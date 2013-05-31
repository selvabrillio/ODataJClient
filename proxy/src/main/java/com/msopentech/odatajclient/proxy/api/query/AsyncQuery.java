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
package com.msopentech.odatajclient.proxy.api.query;

import java.io.Serializable;
import java.util.List;
import java.util.concurrent.Future;

/**
 * Abstract class to control asynchronous query execution.
 */
public abstract class AsyncQuery implements Query {

    private static final long serialVersionUID = -1384992773012007320L;

    /**
     * {@inheritDoc}
     *
     * @throws UnsupportedOperationException at any invocation, use <tt>asyncGetSingleResult()</tt> instead.
     */
    @Override
    public Serializable getSingleResult() throws NoResultException, NonUniqueResultException {
        throw new UnsupportedOperationException("Synchronous operations not supported");
    }

    /**
     * Asynchronous variant of <tt>getSingleResult()</tt>.
     *
     * @see Query#getSingleResult()
     */
    public abstract Future<Serializable> asyncGetSingleResult() throws NoResultException, NonUniqueResultException;

    /**
     * {@inheritDoc}
     *
     * @throws UnsupportedOperationException at any invocation, use <tt>asyncGetResultList()</tt> instead.
     */
    @Override
    public List<? extends Serializable> getResultList() {
        throw new UnsupportedOperationException("Synchronous operations not supported");
    }

    /**
     * Asynchronous variant of <tt>getResultList()</tt>.
     *
     * @see Query#getResultList()
     */
    public abstract Future<List<? extends Serializable>> asyncGetResultList();
}