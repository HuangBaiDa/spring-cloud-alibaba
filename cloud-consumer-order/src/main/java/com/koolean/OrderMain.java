package com.koolean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class OrderMain {

    @Value("${koolean.test:hello koolean}")
    String myTag;

    @PostConstruct
    public void init() {
        System.out.println("从nacos 读取配置 :"+myTag);
    }
    public static void main(String[] args) {
        SpringApplication.run(OrderMain.class, args);
    }

}