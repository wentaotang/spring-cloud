package com.hgcode.gateway.api;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


/**
* @package com.hgcode.gateway.api
* @Description: api网关 启动类
* @author wentao_tang
* @date 2018/1/14 11:48
* @version V1.0
*/

@SpringCloudApplication
@EnableZuulProxy
public class ApiGateWayApplicaiton {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ApiGateWayApplicaiton.class).web(true).run(args);
    }

}
