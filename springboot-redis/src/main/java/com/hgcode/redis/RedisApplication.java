package com.hgcode.redis;


import com.hgcode.redis.config.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.data.redis.core.StringRedisTemplate;

@SpringBootApplication
public class RedisApplication {



    public static void main(String[] args) {
        //new SpringApplicationBuilder(RedisApplication.class).web(true).run(args);

        ApplicationContext ctx = SpringApplication.run(RedisApplication.class, args);
        StringRedisTemplate stringRedisTemplate=ctx.getBean(StringRedisTemplate.class);

        stringRedisTemplate.convertAndSend(Constants.PDF_TOPIC,"hello world");
    }
}
