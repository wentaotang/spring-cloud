package com.hgcode.util.consul.config.rabbitmq;

import com.alibaba.fastjson.JSON;
import com.hgcode.util.consul.entity.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.stereotype.Component;


/**
 * 功能描述: 消费者
 * @author: wentao_tang
 * @date: 2019-01-04 23:48
 */
@Component
public class SinkReceiver {

    private static Logger logger = LoggerFactory.getLogger(SinkReceiver.class);

    @StreamListener(Sink.INPUT)
    public void processVote(Order vote) {
       logger.warn(JSON.toJSONString(vote));
    }

}
