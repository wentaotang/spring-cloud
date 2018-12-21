package com.hgcode.consul.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "service-consul-produce")
public interface HelloFeigin {

    @GetMapping("/hello")
    String hello();
}
