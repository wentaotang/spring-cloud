package com.hgcode.consul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;

@EnableBinding(Sink.class)
@SpringBootApplication
@EnableDiscoveryClient
public class ConsulProduceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsulProduceApplication.class, args);
    }


}
