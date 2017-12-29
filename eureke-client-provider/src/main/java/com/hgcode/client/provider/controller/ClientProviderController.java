package com.hgcode.client.provider.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientProviderController {

    @GetMapping("/dc")
    public String dc() {
        System.out.println("hello world");
        return "ok";
    }
}
