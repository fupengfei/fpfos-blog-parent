package com.fpfos.blog.bean;

import com.fpfos.blog.core.bean.AbstractInputBean;
import com.fpfos.blog.core.bean.SimpleInputBean;
import com.fpfos.blog.entity.enums.ArticleOrigin;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by alvin on 18-9-6.
 */
@Setter
@Getter
public class ArticleInputBean extends SimpleInputBean{

    /**
     * 标题
     */
    private String title;

    /**
     * 文章内容
     */
    private String articleContent;

    /**
     * 文章外链
     */
    private String articleUrl;

    /**
     * 文章来源
     */
    private ArticleOrigin article_origin;

    /**
     * 作者
     */
    private String author;

    /**
     * 作者外链
     */
    private String authorUrl;

    /**
     * 文章标签
     */
    private String[] label;

}
