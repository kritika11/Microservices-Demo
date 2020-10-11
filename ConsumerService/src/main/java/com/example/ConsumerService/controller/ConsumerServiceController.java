package com.example.ConsumerService.controller;

import com.example.ConsumerService.service.HelloServiceProxy;
import com.example.ConsumerService.service.UserServiceProxy;
import com.example.ConsumerService.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RefreshScope
@RestController("/feign")
public class ConsumerServiceController {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    HelloServiceProxy helloServiceProxy;
    @Autowired
    UserServiceProxy userServiceProxy;

    @RequestMapping("/hello")
    public ResponseEntity<String> hello(){
        return helloServiceProxy.hello();
    }

    @RequestMapping("/username")
    public String postUser(@RequestBody User user){
        String name = userServiceProxy.postUser(user);
        String hello = hello().getBody();
        return hello + " " + name;
    }
}
