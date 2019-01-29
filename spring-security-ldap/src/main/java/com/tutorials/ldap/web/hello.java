package com.tutorials.ldap.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/hello")
public class hello {

    @GetMapping("/check")
    public String check() {

        return "Check Worked";
    }
}