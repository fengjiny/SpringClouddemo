package com.example.feigndemo.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-hi")
public interface SchedualService {

    @RequestMapping(value = "/hi",method = RequestMethod.POST)
    public String sayHiFromClientOne(@RequestParam(value = "name") String name);

    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    public String sayHello(@RequestParam(value = "name") String name);
}
