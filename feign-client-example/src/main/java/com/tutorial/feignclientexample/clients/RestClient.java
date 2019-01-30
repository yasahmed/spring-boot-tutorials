package com.tutorial.feignclientexample.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("rest-app") //rest-app is the Micro-Service name
public interface RestClient {
    @RequestMapping("/version") //target micro-service client with '/version' route
    String getVersion();
}
