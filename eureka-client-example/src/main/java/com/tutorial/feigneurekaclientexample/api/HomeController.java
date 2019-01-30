package com.tutorial.feigneurekaclientexample.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/version")
    public String getVersion()
    {
        return "\"version\":1.0";
    }
}
