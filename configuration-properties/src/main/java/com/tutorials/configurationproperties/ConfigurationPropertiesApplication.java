package com.tutorials.configurationproperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConfigurationPropertiesApplication implements CommandLineRunner {


    @Autowired
    private SampleProperty sampleProperty;

    public static void main(String[] args) {
        SpringApplication.run(ConfigurationPropertiesApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("holaaayon");
        System.out.println(sampleProperty.getStringProp1());

    }

}

