package com.fpfos.blog.core.bean;

/**
 * Created by alvin on 18-9-6.
 */
public class SimpleOutputBean  extends AbstractOutputBean {

    public static SimpleOutputBean success(){

        SimpleOutputBean output = new SimpleOutputBean();
        output.setCode(0);
        return output;
    }
}
