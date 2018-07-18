package com.lee.testprovider.config.dubbo;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @Author: liwq
 * @Date: 2018/7/17 17:39
 * @description
 */
@Configuration
@ImportResource("classpath*:dubbo/*.xml")
public class DubboConfig {
}
