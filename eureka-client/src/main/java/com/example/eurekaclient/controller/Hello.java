package com.example.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "/hello",method = RequestMethod.POST)
    public String hello(@RequestParam(value = "name") String name) {
        return "hello "+name+",i am from port:" +port;
    }
}
