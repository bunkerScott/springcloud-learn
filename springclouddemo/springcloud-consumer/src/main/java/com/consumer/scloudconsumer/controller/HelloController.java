package com.consumer.scloudconsumer.controller;

import com.consumer.scloudconsumer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("sayhi")
    public String hello(String name){
        return helloService.helloService(name);
    }
}
