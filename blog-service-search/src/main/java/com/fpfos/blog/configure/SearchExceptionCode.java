package com.fpfos.blog.configure;

import com.fpfos.blog.core.exception.ApiExceptionCode;

/**
 * Created by alvin on 18-9-5.
 */
public enum  SearchExceptionCode implements ApiExceptionCode {
    A(1001,"错误");

    private Integer errCode;
    private String errMsg;

    SearchExceptionCode(Integer errCode, String errMsg){
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    @Override
    public Integer getErrCode() {
        return errCode;
    }

    @Override
    public String getErrMsg() {
        return errMsg;
    }
}
