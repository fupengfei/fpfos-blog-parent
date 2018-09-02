package com.fpfos.blog;

import com.fpfos.blog.core.utils.FpfosUtils;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import javax.annotation.PostConstruct;

/**
 * Created by Fu Pengfei on 2018/8/29.
 */

//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@SpringBootApplication
@EnableEurekaClient
public class SearchApplication {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public static void main(String[] args) {
        SpringApplication.run(SearchApplication.class, args);
    }

    @PostConstruct
    public void init() {
        String queue = "test";
        rabbitTemplate.convertAndSend(queue, FpfosUtils.UUID());
    }

}
