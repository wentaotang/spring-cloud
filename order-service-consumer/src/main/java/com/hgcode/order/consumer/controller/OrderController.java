package com.hgcode.order.consumer.controller;

import com.hgcode.order.consumer.client.OrderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class OrderController {

    @Autowired
    OrderClient orderClient;


    @PostMapping(value = "/save")
    public String save(@RequestBody  Map<String,Object> map) {
        return orderClient.save(map);
    }
}
