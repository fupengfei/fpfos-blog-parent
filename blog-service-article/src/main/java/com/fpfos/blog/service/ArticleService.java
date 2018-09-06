package com.fpfos.blog.service;

import com.fpfos.blog.bean.ArticleInputBean;
import com.fpfos.blog.core.bean.AbstractInputBean;
import com.fpfos.blog.core.bean.AbstractOutputBean;
import com.fpfos.blog.core.bean.SimpleOutputBean;

/**
 * Created by alvin on 18-9-6.
 */
public interface ArticleService {

    SimpleOutputBean addArticle(ArticleInputBean input);

}
