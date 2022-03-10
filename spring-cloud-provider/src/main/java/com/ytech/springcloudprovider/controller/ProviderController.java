package com.ytech.springcloudprovider.controller;

import com.ytech.springcloudprovider.Service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ProviderController {

    @Autowired
    ProviderService providerService;

    @GetMapping("/echo-feign")
    public String echo(){
        return providerService.echo("just a test from provider");
    }
}
