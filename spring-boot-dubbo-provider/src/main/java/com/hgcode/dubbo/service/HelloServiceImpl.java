package com.hgcode.dubbo.service;

import com.alibaba.dubbo.config.annotation.Service;

@Service
public class HelloServiceImpl implements IHelloService {
    @Override
    public String sayHello(String str) {
        return "Hello, " + str + " (from Dubbo with Spring Boot)";
    }
}
