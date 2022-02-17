package com.example.swagger.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SwaggerTest {

    @GetMapping("/hello")
    public String hello() {
        return "hello, i am your friends";
    }

}
