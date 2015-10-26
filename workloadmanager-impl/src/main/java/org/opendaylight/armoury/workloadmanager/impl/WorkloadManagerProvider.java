/*
 * Copyright (c) 2015 Inocybe Technologies, Cisco System, Inc., Hewlett-Packard and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.armoury.workloadmanager.impl;

import org.opendaylight.controller.sal.binding.api.BindingAwareBroker.ProviderContext;
import org.opendaylight.controller.sal.binding.api.BindingAwareBroker.RpcRegistration;
import org.opendaylight.controller.sal.binding.api.BindingAwareProvider;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.workloadmanager.rev150918.WorkloadmanagerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WorkloadManagerProvider implements BindingAwareProvider, AutoCloseable {

    private static final Logger LOG = LoggerFactory.getLogger(WorkloadManagerProvider.class);
    private RpcRegistration<WorkloadmanagerService> workloadMangerService;

    @Override
    public void onSessionInitiated(ProviderContext session) {
        LOG.info("WorkloadManagerProvider Session Initiated");

        // Register WorkloadManagerImpl as workloadmanagerService implementation
        this.workloadMangerService = session.addRpcImplementation(WorkloadmanagerService.class,
                new WorkloadManagerImpl());
    }

    @Override
    public void close() throws Exception {
        LOG.info("WorkloadManagerProvider Closed");
        if (workloadMangerService != null) {
            this.workloadMangerService = null;
        }
    }
}