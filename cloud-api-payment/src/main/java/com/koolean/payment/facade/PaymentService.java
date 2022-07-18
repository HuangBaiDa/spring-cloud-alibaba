package com.koolean.payment.facade;

import com.koolean.payment.request.Payment;

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
    Payment queryById(long id);
}

