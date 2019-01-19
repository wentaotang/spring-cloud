package com.hgcode.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class GateWayApiApplication {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("path_route", r -> r.path("/get")
                        .uri("http://httpbin.org")).build();
    }


   /* @Bean
    RedisRateLimiter redisRateLimiter() {
        return new RedisRateLimiter(1, 2);
    }*/

    public static void main(String[] args) {
        SpringApplication.run(GateWayApiApplication.class, args);
    }

}
