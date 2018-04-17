package com.hgcode.order.client;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class OrderClientApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(OrderClientApplication.class).web(true).run(args);
    }
}
