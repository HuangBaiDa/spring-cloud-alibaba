package com.koolean.service.impl;

import com.koolean.payment.facade.UserService;
import com.koolean.payment.request.User;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * 
 * @author jiwu
 * @date 2022/08/04 11:16
 **/
@DubboService(version = "1.0.0")
public class UserServiceImpl implements UserService {

    @Override
    public User queryUser(int id) {
        User user = new User().setId(9527).setName("凡尘").setAge(18).setAddress("霞飞路七十六号");
        return user;
    }

}
