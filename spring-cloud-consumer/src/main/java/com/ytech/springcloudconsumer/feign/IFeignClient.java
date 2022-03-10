package com.ytech.springcloudconsumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@FeignClient(value = "spring-cloud-provider" )
public interface IFeignClient {

    @GetMapping(value = "/echo-feign")
    String echoFromProvider();
}
