package com.fpfos.blog.mqreceive.rabbitmq;

import com.fpfos.blog.entity.ArticleSearch;
import com.fpfos.blog.service.ArticleServer;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by alvin on 18-9-2.
 */
@Component
public class Receive {

    @Autowired
    private ArticleServer articleServer;

    @RabbitListener(queues = "init")
    public void initReceive(String test){

        System.out.println(" rabbitmq [queue:init] receive message :  " + test);
    }

    @RabbitListener(queues = "article")
    public void articleReceive(ArticleSearch article){

        System.out.println(" rabbitmq [queue:article] receive message : \n " + article.toString() );

        articleServer.addArticle(article);
    }
}
