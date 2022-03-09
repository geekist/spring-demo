package com.ytech.springcloudconsumer.Service.impl;

import com.ytech.springcloudconsumer.Service.ConsumerService;
import org.springframework.stereotype.Service;

@Service
public class ConsumerServiceImpl implements ConsumerService {

    @Override
    public String echo(String name) {
        return "I am from provider " + name ;
    }
}
