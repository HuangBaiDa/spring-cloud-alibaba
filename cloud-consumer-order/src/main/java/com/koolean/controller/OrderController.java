package com.koolean.controller;


import com.koolean.common.pojo.CommonResult;
import com.koolean.common.pojo.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
public class OrderController {
    /**
     * 调用支付订单服务端的ip+端口号
     */
    public static final String PAYMENT_URL = "http://localhost:8001";

    /**
     * 以服务名的方式访问
     */
    public static final  String PAYMENT_URL2 = "http://cloud-provide-payment";

    @Autowired
    private RestTemplate restTemplate;

//    /**
//     * 创建支付订单的接口
//     * @param payment
//     * @return
//     */
//    @GetMapping("/consumer/payment/create")
//    public CommonResult<Payment> create(Payment payment) {
//        return restTemplate.postForObject(PAYMENT_URL2 + "/payment/create", payment, CommonResult.class);
//    }
//
//    /**
//     * 根据id获取支付订单
//     * @param id
//     * @return
//     */
//    @GetMapping("/consumer/payment/get/{id}")
//    public CommonResult<Payment> getPayment(@PathVariable("id") Long id) {
//        return restTemplate.getForObject(PAYMENT_URL2 + "/payment/get/" + id, CommonResult.class);
//    }
}
