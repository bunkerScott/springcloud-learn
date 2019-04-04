package com.springcloud.feign.service.impl;

import com.springcloud.feign.service.SayHiService;
import org.springframework.stereotype.Service;

@Service
public class SayHiServiceImpl implements SayHiService {
    @Override
    public String sayHi(String name) {
        return "hello "+name+" service is down ,wait a seconds";
    }
}
