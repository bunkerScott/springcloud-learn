package com.springcloud.feign.controller;

import com.springcloud.feign.service.SayHiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class SayHiController {

    @Autowired
    SayHiService sayHiService;

    @RequestMapping("/hi")
    public String hi(@RequestParam("name") String name){
        return sayHiService.sayHi(name);
    }
}
