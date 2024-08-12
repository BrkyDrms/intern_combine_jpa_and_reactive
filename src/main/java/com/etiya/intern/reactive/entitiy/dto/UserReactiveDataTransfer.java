package com.etiya.intern.reactive.entitiy.dto;

public class UserReactiveDataTransfer {
    private String name;

    public String getName(){
        return  name;
    }
    public void setName(String name){
        this.name = name;
    }
    public UserReactiveDataTransfer(String name){
        this.name = name;
    }
}
