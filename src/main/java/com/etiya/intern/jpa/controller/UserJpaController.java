package com.etiya.intern.jpa.controller;

import com.etiya.intern.jpa.entity.UserJpaEntity;
import com.etiya.intern.jpa.service.IUserJpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "/api")
@RestController
public class UserJpaController {

    @Autowired
    private IUserJpaService userService;

    @GetMapping("/users")
    public List<UserJpaEntity> getAllUsers() {
        return userService.getAllUserJpa();
    }
}
