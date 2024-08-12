package com.etiya.intern.jpa.service.impl;

import com.etiya.intern.jpa.entity.UserJpaEntity;
import com.etiya.intern.jpa.repository.UserJpaRepository;
import com.etiya.intern.jpa.service.IUserJpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Service
public class UserJpaService implements IUserJpaService {

    @Autowired
    private UserJpaRepository userJpaRepository;


    public List<UserJpaEntity> getAllUserJpa(){
        List<UserJpaEntity> userJpaEntityList = userJpaRepository.findAll();
        if (CollectionUtils.isEmpty(userJpaEntityList)){
            throw new RuntimeException("Emptiy Table");
        }
        return userJpaEntityList;
    }
}
