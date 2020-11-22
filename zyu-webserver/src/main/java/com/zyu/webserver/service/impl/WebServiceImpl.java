package com.zyu.webserver.service.impl;


import com.zyu.config.ResultEnum;
import com.zyu.exception.MyException;
import com.zyu.webserver.service.WebService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class WebServiceImpl implements WebService {
    private Logger logger = LoggerFactory.getLogger(WebService.class);


    @Override
    public String requestWeb() {
        boolean status = false;
        if (status) {
            return "success";
        } else {
            throw new MyException(ResultEnum.web_error);
        }
    }
}
