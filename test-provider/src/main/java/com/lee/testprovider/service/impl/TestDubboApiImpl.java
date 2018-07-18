package com.lee.testprovider.service.impl;

import com.lee.testproviderapi.api.TestDubboApi;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: liwq
 * @Date: 2018/7/17 17:40
 * @description
 */
@Service
public class TestDubboApiImpl implements TestDubboApi{
    private int count = 1;
    @Override
    public String test() {
        try {
            Thread.sleep(6000);
        }catch (Exception ex){
            System.out.println("thread:"+Thread.currentThread().getName()+" sleep");
            ex.printStackTrace();
        }
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:sss").format(new Date())+"---"+count++);
        return "success";
    }
}
