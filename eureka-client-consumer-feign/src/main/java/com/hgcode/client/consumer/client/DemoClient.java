package com.hgcode.client.consumer.client;

import org.springframework.web.bind.annotation.GetMapping;


public interface DemoClient {


    @GetMapping("/dc")
    String consumer();
}
