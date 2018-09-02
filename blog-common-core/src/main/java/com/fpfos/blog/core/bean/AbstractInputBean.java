package com.fpfos.blog.core.bean;

import com.fpfos.blog.core.JsonBaseObject;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * Created by Fu Pengfei on 2018/8/30.
 */

@Setter
@Getter
public abstract class AbstractInputBean extends JsonBaseObject implements Serializable{

    private String ip;

    private String token;

    private String uuid;

    private String version;

}
