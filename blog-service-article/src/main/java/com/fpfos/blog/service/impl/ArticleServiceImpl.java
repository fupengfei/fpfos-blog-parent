package com.fpfos.blog.service.impl;

import com.fpfos.blog.bean.ArticleInputBean;
import com.fpfos.blog.core.bean.AbstractInputBean;
import com.fpfos.blog.core.bean.AbstractOutputBean;
import com.fpfos.blog.core.bean.SimpleInputBean;
import com.fpfos.blog.core.bean.SimpleOutputBean;
import com.fpfos.blog.core.entity.EntityFactory;
import com.fpfos.blog.entity.Article;
import com.fpfos.blog.repository.ArticleRepository;
import com.fpfos.blog.service.ArticleService;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by alvin on 18-9-6.
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleRepository articleRepository;
    @Autowired
    private RabbitTemplate rabbitTemplate;
    @Override
    public SimpleOutputBean addArticle(ArticleInputBean input) {

        Article article = EntityFactory.newInstance(Article.class);
        BeanUtils.copyProperties(input, article);

        articleRepository.save(article);

        rabbitTemplate.convertAndSend("article", article);

        return SimpleOutputBean.success();
    }
}
