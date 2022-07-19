package com.koolean.service.impl;

import com.koolean.payment.facade.HelloService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService(version = "1.0.0")
public class HelloServiceImpl implements HelloService {

    @Override
    public String hello(String name) {
        return "Hello World:"+ name;
    }
}
