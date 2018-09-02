package com.fpfos.blog.configure;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * Created by alvin on 18-9-2.
 */
@Component
public class RabbitmqConfigure {

    @Bean
    public Queue testQueue(){

        return new Queue("test");
    }

    @Bean
    public Queue articleQueue(){

        return new Queue("article");
    }
}
