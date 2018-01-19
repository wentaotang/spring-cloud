package com.hgcode.message;

import com.hgcode.message.core.Config.ExchangeConstant;
import com.hgcode.message.core.Config.MemberMessage;
import com.hgcode.message.core.Config.QueueConstant;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;

/**
* @Package com.hgcode.message
* @Description: 消息处理中心
* @author wentao_tang
* @date 2018/1/16 23:16
* @version V1.0
*/

@SpringBootApplication
public class MessageApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(MessageApplication.class).web(true).run(args);
    }
}
