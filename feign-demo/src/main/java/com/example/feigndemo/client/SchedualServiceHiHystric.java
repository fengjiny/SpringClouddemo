package com.example.feigndemo.client;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements SchedualService{

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry" + name;
    }

    @Override
    public String sayHello(String name) {
        return "sorry" + name;
    }
}
