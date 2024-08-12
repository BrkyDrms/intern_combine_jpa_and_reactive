package com.etiya.intern.reactive.service;

import com.etiya.intern.reactive.entitiy.UserReactiveEntity;
import reactor.core.publisher.Flux;

public interface IUserServiceReactive {
    Flux<UserReactiveEntity> getAllUserReactive();
}
