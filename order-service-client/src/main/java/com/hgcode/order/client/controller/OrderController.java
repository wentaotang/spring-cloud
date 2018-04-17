package com.hgcode.order.client.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @RequestMapping("/save")
    public String save() {
        return "ok";
    }

}
