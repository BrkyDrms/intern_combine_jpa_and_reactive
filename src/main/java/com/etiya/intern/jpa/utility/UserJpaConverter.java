package com.etiya.intern.jpa.utility;

import com.etiya.intern.jpa.entity.UserJpaEntity;
import com.etiya.intern.reactive.entitiy.dto.UserReactiveDataTransfer;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserJpaConverter {

    public List<UserReactiveDataTransfer> userEntityListConvertToUserDataTransferList(List<UserJpaEntity> userJpaEntityList){
        List<UserReactiveDataTransfer> userDataTransferList = new ArrayList<>();
        for (UserJpaEntity userJpaEntity : userJpaEntityList){
            UserReactiveDataTransfer userDataTransfer = new UserReactiveDataTransfer(userJpaEntity.getName());
            userDataTransferList.add(userDataTransfer);
        }
        return userDataTransferList;
    }
}
