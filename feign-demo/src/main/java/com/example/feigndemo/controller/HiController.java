package com.example.feigndemo.controller;

import com.example.feigndemo.client.SchedualService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HiController {

    @Autowired
    private SchedualService schedualService;

    @RequestMapping(value = "/hi",method = RequestMethod.POST)
    public String sayHi(@RequestParam String name){
        log.info("调用feign接口");
        return schedualService.sayHiFromClientOne(name);
    }

    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    public String sayHello(@RequestParam(value = "name") String name) {
        log.info("调用hello接口");
        return schedualService.sayHello(name);
    }
}
