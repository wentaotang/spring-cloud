package com.hgcode.client.consumer.controller;

import com.hgcode.client.consumer.client.DemoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DemoController {

    @Autowired
    DemoClient demoClient;


    @GetMapping("/consumer")
    public String dc() {
        return demoClient.consumer();
    }
}
