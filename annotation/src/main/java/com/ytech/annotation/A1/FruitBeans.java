package com.ytech.annotation.A1;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@ComponentScan("com.ytech.annotation.A1")
@Configuration
public class FruitBeans {

    @Bean
    String getApple(){
        return "Apple";
    }

    @Bean
    String getBanana() {
        return "Banana";
    }

    @Bean
    public User user() {
        return new User();
    }
}
