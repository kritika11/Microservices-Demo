package com.example.ConsumerService.service;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.ConsumerService.model.User;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="UserService")
@RibbonClient(name="UserService")
public interface UserServiceProxy {

    @RequestMapping("/postuser")
    public String postUser(@RequestBody User user);
}
