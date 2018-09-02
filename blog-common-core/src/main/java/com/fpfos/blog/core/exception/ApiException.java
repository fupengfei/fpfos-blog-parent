package com.fpfos.blog.core.exception;

/**
 * Created by Fu Pengfei on 2018/8/30.
 */
public final class ApiException extends RuntimeException {

    private ApiExceptionCode code;

    public ApiException(ApiExceptionCode code) {
        super();
        this.code = code;
    }

    public Integer getErrCode() {
        return code.getErrCode();
    }

    public String getErrMsg() {
        return code.getErrMsg();
    }

}
