package com.koolean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * @author jiwu
 * @date 2022/07/15 16:20
 **/

@SpringBootApplication(scanBasePackages = "com.koolean")
public class PaymentMain {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain.class,args);
    }


}
