package com.hgcode.order.consumer;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;


@EnableFeignClients
@SpringCloudApplication
public class OrderConsumerApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(OrderConsumerApplication.class).web(true).run(args);
    }
}
