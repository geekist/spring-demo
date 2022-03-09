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

    @RequestMapping("/api/echo-consumer")
    public String echo(){
        return providerService.echo("just a test for consumer");
    }

    @RequestMapping("/api/echo-feign")
    public String echo_feign(){
        return feignClient.echoFromProvider();
    }
}
