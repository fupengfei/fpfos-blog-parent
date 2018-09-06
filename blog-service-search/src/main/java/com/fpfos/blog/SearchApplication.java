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

        /**
         * Springboot整合Elasticsearch 在项目启动前设置一下的属性，防止报错
         * 解决netty冲突后初始化client时还会抛出异常
         * java.lang.IllegalStateException: availableProcessors is already set to [4], rejecting [4]
         */
        System.setProperty("es.set.netty.runtime.available.processors", "false");

        // elasticsearchTemplate.putMapping(OperationDocument.class);
        SpringApplication.run(SearchApplication.class, args);
    }

    @PostConstruct
    public void init() {
        String queue = "init";
        rabbitTemplate.convertAndSend(queue, " BLOG-SERVICE-SEARCH START ... ");
    }

}
