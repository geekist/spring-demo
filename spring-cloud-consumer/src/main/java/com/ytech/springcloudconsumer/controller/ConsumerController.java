package com.ytech.springcloudconsumer.controller;

import com.ytech.springcloudconsumer.Service.ConsumerService;
import com.ytech.springcloudconsumer.feign.IFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ConsumerController {

    @Autowired
    ConsumerService providerService;

    @Autowired
    IFeignClient feignClient;

    @GetMapping("/echo")
    public String echo(){
        return providerService.echo("just a test for consumer");
    }

    @GetMapping("/echo-feign")
    public String echoFeign(){
        return feignClient.echoFromProvider();
    }
}
