package com.fpfos.blog.repository;

import com.fpfos.blog.entity.ArticleSearch;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by alvin on 18-9-4.
 */
@Repository
public interface ArticleSearchRepository extends ElasticsearchRepository<ArticleSearch,String> {
}
