package com.example.UserService.controller;

import com.example.UserService.service.UserServiceImpl;
import com.example.UserService.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Level;

@RestController
public class UserController {

    private static final Logger LOG = LoggerFactory.getLogger(UserController.class);

    @PostMapping("/postuser")
    public String postUser(@RequestBody User user){
        String concatName = user.getFirstName() + " " + user.getLastName();
        LOG.info("postuser({})", concatName);
        return concatName;
    }


}
