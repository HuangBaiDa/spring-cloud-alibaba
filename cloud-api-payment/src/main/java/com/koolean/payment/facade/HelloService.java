package com.koolean.payment.facade;

/**
 * dubbo暴露接口
 */
public interface HelloService {

    /**
     * dubbo接口
     * @param name
     * @return
     */
    String hello(String name);
}
