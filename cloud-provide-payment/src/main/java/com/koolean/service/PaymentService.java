package com.koolean.service;

import com.koolean.common.pojo.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author jiwu
 * @date 2022/07/15 19:02
 **/
public interface PaymentService {

    /**
     * 新增
     * @param payment
     * @return
     */
    int create(Payment payment);

    /**
     * 根据ID查询
     * @param id
     * @return
     */
    Payment queryById(@Param("id") long id);
}

