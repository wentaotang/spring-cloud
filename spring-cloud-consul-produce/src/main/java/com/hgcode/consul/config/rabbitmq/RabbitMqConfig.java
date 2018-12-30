package com.hgcode.consul.config.rabbitmq;


import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.config.SimpleRabbitListenerContainerFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
* @Description: 定义交换器和队列的绑定关系
* @author wentao_tang
* @date 2018/1/19 21:27
* @version V1.0
*/

//@Configuration
public class RabbitMqConfig {


    /**
     * 声明 ex
     * @param queue
     * @param exchange
     * @return
     */
    @Bean
    public Binding binding(@Qualifier("orderQueue") Queue queue,
                           @Qualifier("orderExchange") DirectExchange exchange){
       return BindingBuilder.bind(queue).to(exchange).with("order");
    }


    @Bean
    public SimpleRabbitListenerContainerFactory rabbitListenerContainerFactory(ConnectionFactory connectionFactory) {
        SimpleRabbitListenerContainerFactory factory = new SimpleRabbitListenerContainerFactory();
        factory.setConnectionFactory(connectionFactory);
        factory.setConcurrentConsumers(10);
        factory.setMessageConverter(new Jackson2JsonMessageConverter());
        return factory;
    }


    /**
     * 声明 queue
     * @return
     */
    @Bean(name = "orderQueue")
    public Queue OrderQueue(){
        return new Queue("orderQueue",true);
    }

    /**
     * 声明 exchange
     * @return
     */
    @Bean(name = "orderExchange")
    public DirectExchange OrderExchange() {
        return new DirectExchange("OrderExchange", true, false);
    }
}
