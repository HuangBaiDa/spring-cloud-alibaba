package com.koolean.dao;

import com.koolean.payment.request.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author jiwu
 * @date 2022/07/15 19:00
 **/

@Mapper
@Repository
public interface PaymentDao {

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
    Payment queryById(@Param("id")long id);
}
