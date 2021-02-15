package com.jackson.user.utils;

import org.springframework.http.HttpStatus;

public class ResultUtil<T> {

    /**
     * http状态
     */
    private int code;

    /**
     * 返回信息
     */
    private String msg;

    /**
     * 返回包装类
     */
    private T data;

    public ResultUtil(HttpStatus code) {
        this.code = HttpStatus.OK.value();
    }

    public ResultUtil(HttpStatus code, String msg) {
        this.code = code.value();
        this.msg = msg;
    }

    public ResultUtil(HttpStatus code, T data) {
        this.code = code.value();
        this.data = data;
    }

    public ResultUtil(HttpStatus code, String msg, T data) {
        this.code = code.value();
        this.msg = msg;
        this.data = data;
    }

    public int getCode() {
        int code = this.code;
        return code;
    }

    public void setCode(HttpStatus code) {
        this.code = code.value();
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
