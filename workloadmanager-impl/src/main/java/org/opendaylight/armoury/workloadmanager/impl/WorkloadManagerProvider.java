/*
 * Copyright (c) 2015 Inocybe Technologies, Cisco System, Inc., Hewlett-Packard and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.armoury.workloadmanager.impl;

import java.util.concurrent.Future;

import org.opendaylight.controller.sal.binding.api.BindingAwareBroker.ProviderContext;
import org.opendaylight.controller.sal.binding.api.BindingAwareBroker.RpcRegistration;
import org.opendaylight.controller.sal.binding.api.BindingAwareProvider;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.workloadmanager.rev150918.CreateInput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.workloadmanager.rev150918.CreateOutput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.workloadmanager.rev150918.DeleteInput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.workloadmanager.rev150918.ResumeInput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.workloadmanager.rev150918.StartInput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.workloadmanager.rev150918.StopInput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.workloadmanager.rev150918.SuspendInput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.workloadmanager.rev150918.WorkloadmanagerService;
import org.opendaylight.yangtools.yang.common.RpcResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WorkloadManagerProvider implements BindingAwareProvider, AutoCloseable, WorkloadmanagerService {

    private static final Logger LOG = LoggerFactory.getLogger(WorkloadManagerProvider.class);
    private RpcRegistration<WorkloadmanagerService> workloadMangerService;

    @Override
    public void onSessionInitiated(ProviderContext session) {
        LOG.info("WorkloadManagerProvider Session Initiated");

        // Register this class as workloadmanagerService implementation.
        this.workloadMangerService = session.addRpcImplementation(WorkloadmanagerService.class, this);
    }

    @Override
    public void close() throws Exception {
        LOG.info("WorkloadManagerProvider Closed");
        if (workloadMangerService != null) {
            this.workloadMangerService = null;
        }
    }

    @Override
    public Future<RpcResult<Void>> stop(StopInput input) {
        // TODO: Method need to be implemented.
        LOG.info("stop called, input {}", input);
        return null;
    }

    @Override
    public Future<RpcResult<Void>> start(StartInput input) {
        // TODO: Method need to be implemented.
        LOG.info("start called, input {}", input);
        return null;
    }

    @Override
    public Future<RpcResult<Void>> resume(ResumeInput input) {
        // TODO: Method need to be implemented.
        LOG.info("resume called, input {}", input);
        return null;
    }

    @Override
    public Future<RpcResult<Void>> delete(DeleteInput input) {
        // TODO: Method need to be implemented.
        LOG.info("delete called, input {}", input);
        return null;
    }

    @Override
    public Future<RpcResult<CreateOutput>> create(CreateInput input) {
        // TODO: Method need to be implemented.
        LOG.info("create called, input {}", input);
        return null;
    }

    @Override
    public Future<RpcResult<Void>> suspend(SuspendInput input) {
        // TODO: Method need to be implemented.
        LOG.info("suspend called, input {}", input);
        return null;
    }
}