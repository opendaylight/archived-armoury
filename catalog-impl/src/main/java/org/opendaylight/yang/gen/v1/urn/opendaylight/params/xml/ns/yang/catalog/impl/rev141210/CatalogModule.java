package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.catalog.impl.rev141210;

import org.opendaylight.armoury.impl.CatalogProvider;

public class CatalogModule extends org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.catalog.impl.rev141210.AbstractCatalogModule {
    public CatalogModule(org.opendaylight.controller.config.api.ModuleIdentifier identifier, org.opendaylight.controller.config.api.DependencyResolver dependencyResolver) {
        super(identifier, dependencyResolver);
    }

    public CatalogModule(org.opendaylight.controller.config.api.ModuleIdentifier identifier, org.opendaylight.controller.config.api.DependencyResolver dependencyResolver, org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.catalog.impl.rev141210.CatalogModule oldModule, java.lang.AutoCloseable oldInstance) {
        super(identifier, dependencyResolver, oldModule, oldInstance);
    }

    @Override
    public void customValidation() {
        // add custom validation form module attributes here.
    }

    @Override
    public java.lang.AutoCloseable createInstance() {
        return new CatalogProvider();
    }

}
