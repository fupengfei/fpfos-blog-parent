package com.fpfos.blog.mqreceive.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by alvin on 18-9-2.
 */
@Component
public class Receive {

    @RabbitListener(queues = "test")
    public void testReceive(String test){

        System.out.println(" rabbitmq test receive message : " + test);
    }

    @RabbitListener(queues = "article")
    public void articleReceive(Object article){

        // TODO: 18-9-2 save redis

        // TODO: 18-9-2 save elsearch
    }
}
