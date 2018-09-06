package com.fpfos.blog.repository;

import com.fpfos.blog.core.repository.AbstractJpaRepository;
import com.fpfos.blog.entity.Article;
import org.springframework.stereotype.Repository;

/**
 * Created by alvin on 18-9-6.
 */
@Repository
public interface ArticleRepository extends AbstractJpaRepository<Article> {

}
