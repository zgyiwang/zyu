package com.zyu.webserver.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class webRequestController {
    @RequestMapping
    public void ak1() {
        String a = "";
        JSON.parse(a);
    }
}