package com.demo.springrabbitmqconsumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQMessageConsumer {
    //@RabbitListener (queues = RabbitMQConfiguration.QUEUE_NAME)   //THIS IS DEFAULT BEAN IMPLEMEMNTATIN THAT'S SEQUENTIAL IN NATURE
    @RabbitListener (queues = RabbitMQConfiguration.QUEUE_NAME, containerFactory = "rabbitListenerContainerFactory")   //THIS IS THREADED - Executor service
    public void consumerListener(Message message) throws InterruptedException {
        //Thread.sleep(1000);
        System.out.println(message);
    }
}

