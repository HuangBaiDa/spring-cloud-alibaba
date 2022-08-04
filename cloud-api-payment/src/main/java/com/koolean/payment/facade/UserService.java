package com.koolean.payment.facade;

import com.koolean.payment.request.User;

/**
 * 用户服务
 *
 * @author jiwu
 * @date 2022/08/04 11:15
 **/
public interface UserService {

    /**
     * 查询用户、测试序列化问题
     * @param id
     * @return
     */
    User queryUser(int id);
}
