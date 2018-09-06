package com.fpfos.blog.entity;

import com.fpfos.blog.core.configure.RedisMapping;
import com.fpfos.blog.core.entity.AbstractEntity;
import com.fpfos.blog.core.entity.convert.StringArrayConvert;
import com.fpfos.blog.entity.enums.ArticleOrigin;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by alvin on 18-9-6.
 */
@Table(name = "article")
@Entity
public class Article extends AbstractEntity {

    /**
     * 标题
     */
    @RedisMapping
    @Column(name = "title")
    private String title;

    /**
     * 文章内容
     */
    @RedisMapping
    @Column(name = "article_content")
    private String articleContent;

    /**
     * 文章外链
     */
    @RedisMapping
    @Column(name = "article_url")
    private String articleUrl;

    /**
     * 文章来源
     */
    @RedisMapping
    @Column(name = "articleOrigin")
    private ArticleOrigin article_origin;

    /**
     * 作者
     */
    @RedisMapping
    @Column(name = "author")
    private String author;

    /**
     * 作者外链
     */
    @RedisMapping
    @Column(name = "author_url")
    private String authorUrl;

    /**
     * 文章标签
     */
    @RedisMapping
    @Column(name = "label")
    @Convert(converter = StringArrayConvert.class)
    private String[] label;

    /**
     * 阅读量，从redis获取
     */
    private Long readingVol;

    /**
     * 点赞量，从redis获取
     */
    private Long likeVol;
}
