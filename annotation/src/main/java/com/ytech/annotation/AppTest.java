package com.ytech.annotation;

import com.ytech.annotation.scan.MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext2 = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] definitionNames = applicationContext2.getBeanDefinitionNames();
        for (String name : definitionNames) {
            System.out.println(name);
        }

    }
}
