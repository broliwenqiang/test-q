package com.lee.testconsumer.controller;

import com.lee.testconsumer.service.DubboConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: liwq
 * @Date: 2018/7/17 18:03
 * @description
 */
@RestController
public class TestController {
    @Autowired
    private DubboConsumer consumer;
    @RequestMapping(value = "test")
    public String test(){
        return consumer.test();
    }
}
