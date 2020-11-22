package com.zyu.exception;


import com.zyu.config.ResultEnum;

public class MyException extends RuntimeException{
    private ResultEnum resultEnum;

    public MyException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.resultEnum = resultEnum;
    }

    public ResultEnum getExceptionEnum() {
        return resultEnum;
    }

    public void setExceptionEnum(ResultEnum resultEnum) {
        this.resultEnum = resultEnum;
    }
}
