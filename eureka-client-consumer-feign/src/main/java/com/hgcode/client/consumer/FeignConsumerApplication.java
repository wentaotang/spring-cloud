package com.hgcode.client.consumer;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class FeignConsumerApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(FeignConsumerApplication.class).web(true).run(args);
    }
}
