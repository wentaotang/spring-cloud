package com.hgcode.message.config;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

/**
* @Description:  队列定义配置
* @author wentao_tang
* @date 2018/1/19 21:26
* @version V1.0
*/
@Configurable
public class QueueConfig {

    @Bean
    public Queue userRegisterQueue(){
        return new Queue("member-queue",true);
    }
}
