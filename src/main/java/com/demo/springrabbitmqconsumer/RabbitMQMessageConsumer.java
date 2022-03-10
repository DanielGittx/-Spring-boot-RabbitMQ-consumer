package com.demo.springrabbitmqconsumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQMessageConsumer {

    @RabbitListener (queues = RabbitMQConfiguration.QUEUE_NAME)
    public  void consumerListener (Message message)
    {
        System.out.println(message);
    }
}

