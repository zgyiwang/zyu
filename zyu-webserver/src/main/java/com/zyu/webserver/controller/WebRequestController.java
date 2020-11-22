package com.zyu.webserver.controller;

import com.alibaba.fastjson.JSON;
import com.zyu.webserver.service.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.zyu.config.ResultVo;

@RestController
public class WebRequestController {
    @Autowired
    private WebService webService;

    @GetMapping("/requestWeb")
    public ResultVo requestWeb() {
        String a = "123";
        JSON.parse(a);
        String s = webService.requestWeb();
        return new ResultVo(s);
    }
}
