package com.etiya.intern.reactive.repository;

import com.etiya.intern.reactive.entitiy.UserReactiveEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserReactiveRepository extends ReactiveCrudRepository<UserReactiveEntity,Long> {
}
