package com.tutorial.feignclientexample.api;

import com.tutorial.feignclientexample.clients.RestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    final RestClient restClient;

    @Autowired
    HomeController(RestClient restClient) {
        this.restClient = restClient;
    }

    @GetMapping("/rest-version")
    public String gtVersion()
    {
        return restClient.getVersion();
    }


}
