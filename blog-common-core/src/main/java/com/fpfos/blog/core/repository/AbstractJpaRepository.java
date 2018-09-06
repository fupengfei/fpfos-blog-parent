package com.fpfos.blog.core.repository;

import com.fpfos.blog.core.entity.AbstractEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * Created by Fu Pengfei on 2018/8/2.
 */
@NoRepositoryBean
public interface AbstractJpaRepository<T extends AbstractEntity> extends JpaRepository<T, Long> {

    T findByPrimaryCode(String primaryCode);
}
