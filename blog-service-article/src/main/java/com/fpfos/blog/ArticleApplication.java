package com.fpfos.blog;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import javax.annotation.PostConstruct;

/**
 * Created by Fu Pengfei on 2018/8/29.
 */

@SpringBootApplication
@EnableEurekaClient
public class ArticleApplication {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public static void main(String[] args) {

        SpringApplication.run(ArticleApplication.class, args);
    }

    @PostConstruct
    public void init() {
        String queue = "init";
        rabbitTemplate.convertAndSend(queue, "BLOG-SERVICE-ARTICLE START ... ");
    }
}
