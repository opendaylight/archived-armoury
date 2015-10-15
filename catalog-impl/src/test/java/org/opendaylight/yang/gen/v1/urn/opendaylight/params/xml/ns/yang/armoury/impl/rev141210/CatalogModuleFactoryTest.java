/*
 * Copyright (c) 2015 Inocybe Technologies, Cisco System, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.armoury.impl.rev141210;

import org.junit.Test;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.catalog.impl.rev141210.CatalogModuleFactory;

public class CatalogModuleFactoryTest {
    @Test
    public void testFactoryConstructor() {
        // ensure no exceptions on construction
        new CatalogModuleFactory();
    }
}
