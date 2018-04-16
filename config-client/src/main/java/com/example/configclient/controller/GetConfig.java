package com.example.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class GetConfig {

    @Value("${foo}")
    private String foo;

    @RequestMapping(value = "/getConfig")
    public String getConfig() {
        return foo;
    }
}
