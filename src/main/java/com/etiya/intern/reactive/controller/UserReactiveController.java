package com.etiya.intern.reactive.controller;

import com.etiya.intern.reactive.entitiy.UserReactiveEntity;
import com.etiya.intern.reactive.service.impl.UserServiceReactive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RequestMapping(value = "/api/reactive")
@RestController
public class UserReactiveController {

    @Autowired
    private UserServiceReactive userServiceReactive;

    @GetMapping("/users")
    public Flux<UserReactiveEntity>getAllUsersReactive(){
       return userServiceReactive.getAllUserReactive();
    }
}
