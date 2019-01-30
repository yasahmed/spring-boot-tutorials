package com.tutorial.feigneurekaclientexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FeignEurekaClientExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignEurekaClientExampleApplication.class, args);
    }

}

