package com.ytech.annotation.A1;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        //1.初始化Spring容器，通过注解加载
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(FruitBeans.class);
        //2.通过容器获取实例
        User user =  applicationContext.getBean("user", User.class);
        System.out.println(user.toString());
    }
}



