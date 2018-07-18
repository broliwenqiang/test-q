package com.lee.testconsumer.service;

import com.lee.testproviderapi.api.TestDubboApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: liwq
 * @Date: 2018/7/17 18:00
 * @description
 */
@Service
public class DubboConsumer {
    @Autowired
    private TestDubboApi dubboApi;
    public String test(){
        String s = dubboApi.test();
        System.out.println(s);
        return s;
    }

}
