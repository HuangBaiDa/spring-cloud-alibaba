package com.koolean;

import com.alibaba.cloud.dubbo.autoconfigure.DubboServiceRegistrationAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * exclude 不会创建DubboCloudRegistry的注册中心,也不会暴露DubboMetadataService服务
 * Eureka使用@EnableEurekaClient注解，只对Eureka起作用，@EnableDiscoveryClient 对 Eureka、Zookeeper、Consul 等注册中心都有效。
 * @author jiwu
 * @date 2022/07/15 16:20
 **/
//@DubboComponentScan
//exclude = DubboServiceRegistrationAutoConfiguration.class
@RefreshScope
@EnableDiscoveryClient
//@SpringBootApplication(scanBasePackages = "com.koolean",exclude = DubboServiceRegistrationAutoConfiguration.class)
@SpringBootApplication(scanBasePackages = "com.koolean")
public class PaymentMain {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain.class,args);
    }


}
