package com.etiya.intern.jpa.entity.dto;

public class UserJpaDataTransfer {
    private String name;

    public String getName(){
        return  name;
    }
    public void setName(String name){
        this.name = name;
    }
    public UserJpaDataTransfer(String name){
        this.name = name;
    }
}
