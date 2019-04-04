package com.provide.scloudprovide;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@RestController
@SpringBootApplication
public class SpringcloudProvideApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudProvideApplication.class, args);
	}

	@RequestMapping("/hello")
	public String hello(String name){
		return "hi I'm spring cloud,wellcome "+name;
	}

}
