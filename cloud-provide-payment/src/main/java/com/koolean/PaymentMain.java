package com.koolean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 *
 * Eureka使用@EnableEurekaClient注解，只对Eureka起作用，@EnableDiscoveryClient 对 Eureka、Zookeeper、Consul 等注册中心都有效。
 * @author jiwu
 * @date 2022/07/15 16:20
 **/
//@DubboComponentScan
@RefreshScope
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = "com.koolean")
public class PaymentMain {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain.class,args);
    }


}
