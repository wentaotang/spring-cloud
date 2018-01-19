package com.hgcode.message.config;


import com.hgcode.message.core.Config.ExchangeConstant;
import com.hgcode.message.core.Config.QueueConstant;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.config.SimpleRabbitListenerContainerFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

@Configurable
public class RabbitMqConfig {

    @Bean
    public Queue  userRegisterQueue(){
        return new Queue(QueueConstant.QUEUE_NAME,true);
    }


    @Bean
    public DirectExchange memberExchange() {
        return new DirectExchange(ExchangeConstant.EXCHANGE_NAME, true, false);
    }


    @Bean
    public Binding binding(Queue userRegisterQueue, DirectExchange memberExchange){
        return BindingBuilder.bind(userRegisterQueue).to(memberExchange).with("member");
    }

   /* @Bean
    public RabbitTemplate rabbitTemplate(ConnectionFactory connectionFactory) {
        RabbitTemplate template = new RabbitTemplate(connectionFactory);
        template.setMessageConverter(new Jackson2JsonMessageConverter());
        return template;
    }*/


    @Bean
    public SimpleRabbitListenerContainerFactory rabbitListenerContainerFactory(ConnectionFactory connectionFactory) {
        SimpleRabbitListenerContainerFactory factory = new SimpleRabbitListenerContainerFactory();
        factory.setConnectionFactory(connectionFactory);
        factory.setMessageConverter(new Jackson2JsonMessageConverter());
        return factory;
    }
}
