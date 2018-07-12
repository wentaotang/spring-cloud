package com.hgcode.springboot.staticread;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StaticProperties2 {

    public static String CUSTOM_NAME;

    @Value("${custom.name}")
    public void setCustomName(String customName) {
        CUSTOM_NAME = customName;
    }
}
