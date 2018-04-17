package com.hgcode.order.consumer.client;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.Map;

@FeignClient(name = "order-service")
public interface OrderClient {

    @PostMapping(value = "/save")
    String save(@RequestBody Map<String,Object> map);

}
