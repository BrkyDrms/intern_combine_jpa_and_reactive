package com.etiya.intern.reactive.repository.impl;

import com.etiya.intern.reactive.entitiy.UserReactiveEntity;
import com.etiya.intern.reactive.repository.UserReactiveRepository;
import org.reactivestreams.Publisher;
import org.springframework.data.r2dbc.core.R2dbcEntityOperations;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class UserReactiveRepositoryImpl implements UserReactiveRepository {

    private final R2dbcEntityOperations r2dbcEntityOperations;

    public UserReactiveRepositoryImpl(R2dbcEntityOperations r2dbcEntityOperations) {
        this.r2dbcEntityOperations = r2dbcEntityOperations;
    }

    @Override
    public <S extends UserReactiveEntity> Mono<S> save(S entity) {
        return null;
    }

    @Override
    public <S extends UserReactiveEntity> Flux<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public <S extends UserReactiveEntity> Flux<S> saveAll(Publisher<S> entityStream) {
        return null;
    }

    @Override
    public Mono<UserReactiveEntity> findById(Long aLong) {
        return null;
    }

    @Override
    public Mono<UserReactiveEntity> findById(Publisher<Long> id) {
        return null;
    }

    @Override
    public Mono<Boolean> existsById(Long aLong) {
        return null;
    }

    @Override
    public Mono<Boolean> existsById(Publisher<Long> id) {
        return null;
    }

    @Override
    public Flux<UserReactiveEntity> findAll() {
        return null;
    }

    @Override
    public Flux<UserReactiveEntity> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public Flux<UserReactiveEntity> findAllById(Publisher<Long> idStream) {
        return null;
    }

    @Override
    public Mono<Long> count() {
        return null;
    }

    @Override
    public Mono<Void> deleteById(Long aLong) {
        return null;
    }

    @Override
    public Mono<Void> deleteById(Publisher<Long> id) {
        return null;
    }

    @Override
    public Mono<Void> delete(UserReactiveEntity entity) {
        return null;
    }

    @Override
    public Mono<Void> deleteAllById(Iterable<? extends Long> longs) {
        return null;
    }

    @Override
    public Mono<Void> deleteAll(Iterable<? extends UserReactiveEntity> entities) {
        return null;
    }

    @Override
    public Mono<Void> deleteAll(Publisher<? extends UserReactiveEntity> entityStream) {
        return null;
    }

    @Override
    public Mono<Void> deleteAll() {
        return null;
    }
}
