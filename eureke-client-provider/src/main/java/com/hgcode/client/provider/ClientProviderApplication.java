package com.hgcode.client.provider;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ClientProviderApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ClientProviderApplication.class).web(WebApplicationType.SERVLET).run(args);
    }
}
