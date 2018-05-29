package com.hgcode.crawler;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableScheduling
@MapperScan(basePackages = "com.hgcode.crawler.repository")
@EnableTransactionManagement
public class InfoScrapyApplication {

    public static void main(String[] args) {
        SpringApplication.run(InfoScrapyApplication.class, args);
    }
}
