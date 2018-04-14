package com.hgcode.order.client.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class OrderController {

    @PostMapping("/save")
    public String save(Map<String,Object> map) {
        return JSON.toJSONString(map);
    }

}
