package com.socko.app;

import com.socko.app.SockoAppConfiguration;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class SockoApp extends Application<SockoAppConfiguration> {

    public static void main(String[] args) throws Exception {
        new SockoApp().run(args);
    }

    @Override
    public void run(SockoAppConfiguration configuration, Environment environment) throws Exception {
        System.out.println("Socko app running");
    }
}