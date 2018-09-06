package com.fpfos.blog.controller;

import com.fpfos.blog.bean.ArticleInputBean;
import com.fpfos.blog.core.bean.SimpleOutputBean;
import com.fpfos.blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by alvin on 18-9-6.
 */
@RestController
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @PostMapping("article")
    public SimpleOutputBean article(ArticleInputBean input){

        articleService.addArticle(input);

        return SimpleOutputBean.success();
    }
}
