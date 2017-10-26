package com.sofast.application.exception;

/**
 * 功能说明：程序中无法处理的异常，例如一些RuntimeException，统一抛出AppException
 * 典型用法：
 * 特殊用法：
 * 创建者：lihong
 * 创建时间：十二月 11, 2015
 * 版本：1.0
 */
public class AppException extends RuntimeException {
    private String errorCode;

    /**
     * @param errorCode the error code
     * @author lihong
     * @date 十二月 11, 2015
     * Instantiates a new App exception.
     */
    public AppException(String errorCode) {
        super();
        this.errorCode = errorCode;
    }

    /**
     * @param errorCode the error code
     * @param message   the message
     * @author lihong
     * @date 十二月 11, 2015
     * Instantiates a new App exception.
     */
    public AppException(String errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    /**
     * @param errorCode the error code
     * @param message   the message
     * @param cause     the cause
     * @author lihong
     * @date 十二月 11, 2015
     * Instantiates a new App exception.
     */
    public AppException(String errorCode, String message, Throwable cause) {
        super(message, cause);
        this.errorCode = errorCode;
    }

    /**
     * @return the error code
     * @author lihong
     * @date 十二月 11, 2015
     * Gets error code.
     */
    public String getErrorCode() {
        return errorCode;
    }
}
