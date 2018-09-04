package com.fpfos.blog.service;

import com.fpfos.blog.configure.SearchExceptionCode;
import com.fpfos.blog.core.exception.ApiException;
import com.fpfos.blog.core.exception.ApiExceptionCode;
import com.fpfos.blog.core.utils.FpfosUtils;
import com.fpfos.blog.entity.ArticleSearch;
import com.fpfos.blog.repository.ArticleSearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by alvin on 18-9-4.
 */
@Service
public class ArticleServer {

    @Autowired
    private ArticleSearchRepository articleSearchRepository;

    public void addArticle(ArticleSearch article) {

        if (null == article) {
            throw new ApiException(ApiExceptionCode.DATA_CORRUPT());
        }

        articleSearchRepository.save(article);
    }

}
