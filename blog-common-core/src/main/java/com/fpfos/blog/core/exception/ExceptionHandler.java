package com.fpfos.blog.core.exception;

import com.fpfos.blog.core.bean.AbstractOutputBean;
import com.fpfos.blog.core.bean.SimpleOutputBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;
import java.util.Calendar;

/**
 * Created by Fu Pengfei on 2018/8/30.
 */
@ControllerAdvice
public class ExceptionHandler {

    private static final Logger logger = LoggerFactory.getLogger(ExceptionHandler.class);


    @org.springframework.web.bind.annotation.ExceptionHandler(value = ApiException.class)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<SimpleOutputBean> handleApiException(ApiException apiex) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        SimpleOutputBean output = new SimpleOutputBean();

        output.setCode(apiex.getErrCode());
        output.setErrorMsg(apiex.getErrMsg());
        output.setTimestamp(String.valueOf(Calendar.getInstance().getTimeInMillis()));

        logger.info("Exception message:\n{}", output.toString());

        return new ResponseEntity<SimpleOutputBean>(output, headers, HttpStatus.OK);
    }
}
