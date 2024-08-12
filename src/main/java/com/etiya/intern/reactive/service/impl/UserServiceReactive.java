package com.etiya.intern.reactive.service.impl;

import com.etiya.intern.reactive.entitiy.UserReactiveEntity;
import com.etiya.intern.reactive.repository.UserReactiveRepository;
import com.etiya.intern.reactive.service.IUserServiceReactive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StopWatch;
import reactor.core.publisher.Flux;

import java.util.Objects;
@Service
public class UserServiceReactive implements IUserServiceReactive {


    @Autowired
    private UserReactiveRepository repositoryReactive;


    @Override
    public Flux<UserReactiveEntity> getAllUserReactive() {
        Flux<UserReactiveEntity>userEntityFlux=repositoryReactive.findAll().filter(Objects::nonNull);
        return userEntityFlux;
    }
}
