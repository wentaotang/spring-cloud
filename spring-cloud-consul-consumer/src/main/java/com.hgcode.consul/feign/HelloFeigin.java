package com.hgcode.consul.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "service-consul-produce")
public interface HelloFeigin {

    @GetMapping("/hello")
    String hello();

    @GetMapping("/header")
    String header(@RequestHeader(value = "abc")String abc);
}
