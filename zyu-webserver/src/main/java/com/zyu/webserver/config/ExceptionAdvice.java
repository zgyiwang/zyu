package com.zyu.webserver.config;

import com.zyu.config.ResultVo;
import com.zyu.exception.MyException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import static com.zyu.config.ResultEnum.web_error;

@ControllerAdvice
@ResponseBody
public class ExceptionAdvice {
    @ExceptionHandler(MyException.class)
    public ResultVo myException(MyException myException) {
        return new ResultVo(myException);
    }

    @ExceptionHandler(Exception.class)
    public ResultVo exceptionError() {
        return new ResultVo(web_error);
    }
}
