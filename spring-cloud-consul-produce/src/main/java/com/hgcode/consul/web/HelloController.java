package com.hgcode.consul.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "helle consul";
    }


    @RequestMapping("/header")
    public String header(HttpServletRequest request) {
        String header = request.getHeader("abc");
        return header + " hello world";
    }

}
