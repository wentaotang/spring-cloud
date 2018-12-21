package com.hgcode.consul.web;

import com.hgcode.consul.feign.HelloFeigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloController {
    @Resource
    private HelloFeigin helloFeigin;

    @RequestMapping("/consumer/hello")
    public String hello(){
        return helloFeigin.hello();
    }
}
