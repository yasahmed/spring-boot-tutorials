package com.tutorial.feigneurekaserverexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FeignEurekaServerExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignEurekaServerExampleApplication.class, args);
    }

}

