package com.fpfos.blog.entity;

import com.fpfos.blog.core.JsonBaseObject;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Mapping;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by alvin on 18-9-4.
 */

@Setter
@Getter
@Document(indexName = "fpfos-blog", type = "articles", shards = 1)
@Mapping(mappingPath = "es-mapping/ArticleSearchMapping.json")
public class ArticleSearch extends JsonBaseObject implements Serializable {

    @Id
    private String primaryCode;

    private String title;

    private String articleContent;

    private String author;

    private String[] label;

    private Date createDate;

    private String search_all;
}
