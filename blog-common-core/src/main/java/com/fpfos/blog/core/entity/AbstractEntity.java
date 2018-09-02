package com.fpfos.blog.core.entity;

import com.fpfos.blog.core.JsonBaseObject;
import com.fpfos.blog.core.configure.RedisMapping;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Fu Pengfei on 2018/7/31.
 */

@Getter
@MappedSuperclass
public abstract class AbstractEntity extends JsonBaseObject implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @RedisMapping
    @org.springframework.data.annotation.Id
    @Setter
    @Column(name = "primary_code", updatable = false , nullable = false)
    private String primaryCode;

    @Setter
    @Column(name = "create_date" , updatable = false , nullable = false)
    private Long createDate;

    @RedisMapping
    @Column(name = "last_modify_time")
    private Date lastModifyTime;

    @Setter
    @Column(name = "meta_info")
    private String metaInfo;

}
