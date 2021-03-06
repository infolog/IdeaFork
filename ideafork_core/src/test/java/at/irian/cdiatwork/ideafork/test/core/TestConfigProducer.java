package at.irian.cdiatwork.ideafork.test.core;

import at.irian.cdiatwork.ideafork.core.api.config.ApplicationConfig;
import at.irian.cdiatwork.ideafork.core.impl.config.ConfigProducer;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.Specializes;

@Specializes
public class TestConfigProducer extends ConfigProducer {
    //required by the specification
    @Override
    @Produces
    @ApplicationScoped
    public ApplicationConfig exposeConfig() {
        return super.exposeConfig();
    }

    //needed for weld
    @Override
    public void onDispose(@Disposes ApplicationConfig applicationConfig) {
        super.onDispose(applicationConfig);
    }

    @Override
    protected String getConfigBaseName() {
        return "test-" + super.getConfigBaseName();
    }
}
