package com.ms.commons.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author sam 2021/9/21 12:28.<br>
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CustomException extends Exception {
    private static final long serialVersionUID = 1L;

    /**
     * 异常消息
     */
    private String message;
}

