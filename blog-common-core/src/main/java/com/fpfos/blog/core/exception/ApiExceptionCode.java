package com.fpfos.blog.core.exception;

/**
 * Created by Fu Pengfei on 2018/8/30.
 */

public interface ApiExceptionCode {

    static ApiExceptionCode DATA_CORRUPT() {
        return new ApiExceptionCode() {

            @Override
            public Integer getErrCode() {
                return 1000;
            }

            @Override
            public String getErrMsg() {
                return "数据错误";
            }
        };
    }

    Integer getErrCode();

    String getErrMsg();
}
