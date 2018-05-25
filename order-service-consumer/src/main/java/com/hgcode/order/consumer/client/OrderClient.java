package com.hgcode.order.consumer.client;


import com.hgcode.order.consumer.hystrix.OrderClientHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.Map;

@FeignClient(name = "order-service",fallback = OrderClientHystrix.class)
public interface OrderClient{

    @PostMapping(value = "/save")
    String save(@RequestBody Map<String,Object> map);


}
