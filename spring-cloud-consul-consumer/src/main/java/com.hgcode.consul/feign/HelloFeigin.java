package com.hgcode.consul.feign;

import feign.Logger;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "service-consul-produce")
public interface HelloFeigin {

    @GetMapping("/hello")
    String hello();

    @GetMapping("/header")
    String header(@RequestHeader(value = "abc")String abc);


    class FeignConfigConfiguration {
        @Bean
        public Logger.Level logger() {
            return Logger.Level.FULL;
        }
    }
}
