package com.hgcode.message.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SysConfig {

    @Value("${user.name}")
    private String name;
    @Value("${user.pwd}")
    private String pwd;

    public String getName() {
        return name;
    }

    public String getPwd() {
        return pwd;
    }
}
