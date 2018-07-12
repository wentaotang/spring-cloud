package com.hgcode.springboot;

import com.hgcode.springboot.staticread.StaticProperties2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
        System.out.println(StaticProperties2.CUSTOM_NAME);
    }
}
