package com.hgcode.consul.consumer;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;

/**
 * 功能描述: 消费rabbitmq 消息
 * @author: wentao_tang
 * @date: 2018-12-30 11:24
 */
@Component
public class RabbitMqHandler {

    protected Logger logger = LoggerFactory.getLogger(RabbitMqHandler.class);

    /**
     * RabbitListener 注解必须写在方法上，否则报错！
     */
    @RabbitListener(queues = "queue-member",containerFactory = "rabbitListenerContainerFactory")
    @RabbitHandler
    public void process(Message message) {
        String body= null;
        try {
            body = new String(message.getBody(),"UTF-8");
        } catch (UnsupportedEncodingException e) {
            logger.warn("转换消息失败",e);
        }
        JSONObject memberMessage= JSON.parseObject(body);
        logger.warn(JSON.toJSONString(memberMessage));
    }
}
