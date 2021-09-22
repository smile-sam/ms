package com.ms.commons.handler;

import com.ms.commons.response.R;
import org.springframework.core.convert.ConversionFailedException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * OpenApi会解析@RestControllerAdvice注解的类，在response中会显示这些异常定义：400/404/500
 *
 * create by sam on 2021/9/21 12:29.<br>
 */
@RestControllerAdvice
public class GlobalControllerExceptionHandler {

    @ExceptionHandler(ConversionFailedException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public R handleConnversion(RuntimeException ex) {
        R resp = new R()
                .code(HttpStatus.BAD_REQUEST)
                .message(ex.getMessage());
        return resp;
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public R handleException(Exception ex) {
        R resp = new R()
                .code(HttpStatus.INTERNAL_SERVER_ERROR)
                .message(ex.getMessage());
        return resp;
    }

  /**
   * @Description: 
   * @Param: 
   * @return: 
   * @Author: 我的名字
   * @Date: 2021/9/21
   */  
  
    public R handleBookNotFound(RuntimeException ex) {
        R resp = new R()
                .code(HttpStatus.NOT_FOUND)
                .message(ex.getMessage());
        return resp;
    }
}