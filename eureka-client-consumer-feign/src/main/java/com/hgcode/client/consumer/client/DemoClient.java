package com.hgcode.client.consumer.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("eureka-client-provider")
public interface DemoClient {


    @GetMapping("/dc")
    String consumer();
}
