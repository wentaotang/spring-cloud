package com.hgcode.message.handle;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hgcode.message.core.config.QueueConstant;
import com.hgcode.message.core.vo.MemberMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;


/**
* @Package com.hgcode.message.handle
* @Description: 消费者处理消息
* @author wentao_tang
* @date 2018/1/16 23:40
* @version V1.0
*/

@Component
public class UserRegisterHandler {

    protected Logger logger = LoggerFactory.getLogger(UserRegisterHandler.class);

    /**
    * RabbitListener 注解必须写在方法上，否则报错！
    */
    @RabbitListener(queues = QueueConstant.QUEUE_NAME,containerFactory = "rabbitListenerContainerFactory")
    @RabbitHandler
    public void process(Message message) {
        MemberMessage memberMessage=JSON.parseObject(message.getBody(),MemberMessage.class);
        logger.warn(memberMessage.toString());
    }
}
