package com.hgcode.redis.receiver;

import org.springframework.stereotype.Component;

@Component
public class SignReceiver {

    public void receive(String message) {
        System.out.println(message);
    }
}
