package com.socko.app;

import com.socko.app.SockoAppConfiguration;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class SockoApp extends Application<SockoAppConfiguration> {
//  SockoApp has characteristics of the application SockoAppConfiguration along with info below
    public static void main(String[] args) throws Exception {
        new SockoApp().run(args);
    }

    @Override
    //Instructs the compiler that you intend to override a method (SockoAppConfiguration) in the superclass
    public void run(SockoAppConfiguration configuration, Environment environment) throws Exception {
        System.out.println("Socko app running");
    }
}
