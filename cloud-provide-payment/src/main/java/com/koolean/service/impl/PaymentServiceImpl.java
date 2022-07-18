package com.koolean.service.impl;

import com.koolean.payment.request.Payment;
import com.koolean.dao.PaymentDao;
import com.koolean.payment.facade.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author jiwu
 * @date 2022/07/15 19:03
 **/
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment queryById(long id) {
        return paymentDao.queryById(id);
    }
}
