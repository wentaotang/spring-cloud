package com.hgcode.order.consumer.client;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "order-service")
public interface OrderClient {

    @RequestMapping(value = "/save")
    String save();

}
