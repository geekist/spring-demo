package com.ytech.springcloudprovider.Service.impl;

import com.ytech.springcloudprovider.Service.ProviderService;
import org.springframework.stereotype.Service;

@Service
public class ProviderServiceImpl implements ProviderService {

    @Override
    public String echo(String name) {
        return "I am from provider " + name ;
    }
}
