package com.example.ConsumerService.service;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="HelloService")
@RibbonClient(name="HelloService")
public interface HelloServiceProxy {

    @RequestMapping("/hello")
    public ResponseEntity<String> hello();
}
