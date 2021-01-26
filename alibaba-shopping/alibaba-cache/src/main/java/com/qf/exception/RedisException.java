package com.qf.exception;

public class RedisException extends RuntimeException{

    private String message;
    private String code;

    public RedisException(String message, String code) {
        this.message = message;
        this.code = code;
    }

    public RedisException() {
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
