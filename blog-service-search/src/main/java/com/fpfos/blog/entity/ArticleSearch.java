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
    private String primary_code;

    //    @Field(type = FieldType.Text, searchAnalyzer = "ik_smart", analyzer = "ik_smart")
    private String title;

    //    @Field(type = FieldType.Text, searchAnalyzer = "ik_smart", analyzer = "ik_smart")
    private String article_content;

    //    @Field(type = FieldType.Keyword)
    private String author;

    //    @Field(type = FieldType.Keyword, searchAnalyzer = "ik_smart", analyzer = "ik_smart")
    private String[] label;

    //    @Field(type = FieldType.Date,format = DateFormat.custom, pattern = "dd.MM.yyyy hh:mm")
    private Date create_date;

    private String search_all;
}
