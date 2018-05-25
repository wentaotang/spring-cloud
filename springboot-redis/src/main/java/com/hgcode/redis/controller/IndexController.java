package com.hgcode.redis.controller;

import com.hgcode.redis.config.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @RequestMapping("/put")
    public String test(){
        stringRedisTemplate.convertAndSend(Constants.PDF_TOPIC,"hello world pdf");
        stringRedisTemplate.convertAndSend(Constants.SIGN_TOPIC,"hello world sign");
        return "success";
    }
}
