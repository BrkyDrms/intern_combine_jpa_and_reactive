package com.etiya.intern.reactive.utility;

import com.etiya.intern.reactive.entitiy.dto.UserReactiveDataTransfer;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

@Component
public class UserReactiveConverter {
    public Flux<UserReactiveDataTransfer> userEntityListConvertToUserDataTransferFlux(Flux<UserReactiveDataTransfer> userEntityFlux){
        return userEntityFlux.map(userEntity -> new UserReactiveDataTransfer(userEntity.getName()));
    }
}
