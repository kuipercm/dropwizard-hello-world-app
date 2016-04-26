package nl.bldn.example.dropwizard.helloworld;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class HelloWorldApplication extends Application<AppConfiguration> {
    public static void main(String[] args) throws Exception {
        new HelloWorldApplication().run(args);
    }

    @Override
    public String getName() {
        return "hello-world";
    }

    @Override
    public void initialize(Bootstrap<AppConfiguration> bootstrap) {
        //nothing yet
    }

    @Override
    public void run(AppConfiguration appConfiguration, Environment environment) throws Exception {
        HelloWorldResource helloWorldResource = new HelloWorldResource(appConfiguration.getMessage());
        environment.jersey().register(helloWorldResource);
    }
}
