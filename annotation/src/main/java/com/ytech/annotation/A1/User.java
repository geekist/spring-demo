package com.ytech.annotation.A1;


import org.springframework.stereotype.Component;

@Component
public class User {

    private String name;
    private String no;

    public User() {
        this.name = "jonbates";
        this.no = "9527";
    }

    public String toString(){
        return this.name + " **   " + this.no;
    }
}
