package com.zyu.config;


import com.zyu.exception.MyException;

import static com.zyu.config.ResultEnum.web_success;

public class ResultVo<T> {
    private String code;
    private String message;
    private boolean status;
    private T data;

    public ResultVo(T data) {
        this(web_success, data);
    }

    public ResultVo(MyException exception) {
        this(exception.getExceptionEnum());
    }
    public ResultVo(ResultEnum resultEnum) {
        this(resultEnum, null);
    }


    public ResultVo(ResultEnum resultEnum, T data) {
        this(resultEnum.getCode(), resultEnum.getMessage(), resultEnum.getStatus(), data);
    }

    public ResultVo(String code, String message, boolean status, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
