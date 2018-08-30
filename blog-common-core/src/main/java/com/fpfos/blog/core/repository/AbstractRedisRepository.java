package com.fpfos.blog.core.repository;

import com.fpfos.blog.core.entity.AbstractEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * Created by Fu Pengfei on 2018/8/2.
 */
@NoRepositoryBean
public interface AbstractRedisRepository<T extends AbstractEntity, ID> extends CrudRepository<T, ID> {


}
