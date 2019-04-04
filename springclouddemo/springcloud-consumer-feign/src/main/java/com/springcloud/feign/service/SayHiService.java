package com.springcloud.feign.service;

import com.springcloud.feign.service.impl.SayHiServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "springcloud-provide",fallback = SayHiServiceImpl.class)
public interface SayHiService {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    String sayHi(@RequestParam("name") String name);
}
