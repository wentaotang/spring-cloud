package com.hgcode.order.consumer.controller;

import com.hgcode.order.consumer.client.OrderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.Map;

@RestController
public class OrderController {

    @Resource
    OrderClient orderClient;

    @Autowired
    LoadBalancerClient loadBalancerClient;
    @Autowired
    RestTemplate restTemplate;


    @PostMapping(value = "/save")
    public String save(@RequestBody  Map<String,Object> map) {
        return orderClient.save();
    }


    @PostMapping(value = "/test")
    public String test() {
       // return restTemplate.getForObject("http://order-service/save", String.class);
        return orderClient.save();
    }
}
