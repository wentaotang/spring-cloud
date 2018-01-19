package com.hgcode.message.config;

import com.hgcode.message.core.config.ExchangeConstant;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

/**
* @Description: 定义交换器配置
* @author wentao_tang
* @date 2018/1/19 21:25
* @version V1.0
*/

@Configurable
public class ExchangeConfig {

    @Bean
    public DirectExchange memberExchange() {
        return new DirectExchange(ExchangeConstant.EXCHANGE_NAME, true, false);
    }
}
