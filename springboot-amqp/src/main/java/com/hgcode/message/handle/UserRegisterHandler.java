package com.hgcode.message.handle;

import com.hgcode.message.core.Config.QueueConstant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;


/**
* @Package com.hgcode.message.handle
* @Description: 消费处理注册消息
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
    public void process( Message message) {
        System.out.println(new String(message.getBody()));
    }
}
