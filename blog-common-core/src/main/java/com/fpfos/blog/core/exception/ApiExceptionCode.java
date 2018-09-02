package com.fpfos.blog.core.exception;

import lombok.Getter;

/**
 * Created by Fu Pengfei on 2018/8/30.
 */

public enum  ApiExceptionCode {

    DATA_CORRUPT(1000, "数据错误"),

    ;

    @Getter
    private final Integer errCode;

    @Getter
    private String errMsg;

    ApiExceptionCode(String errMsg) {
        this.errCode = 9999;
        this.errMsg = errMsg;
    }

    ApiExceptionCode(Integer errCode, String errMsg) {
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

}
