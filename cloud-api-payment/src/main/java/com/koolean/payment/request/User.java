package com.koolean.payment.request;

import com.koolean.payment.request.base.AbstractBaseDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * 测试用户
 * @author jiwu
 * @date 2022/08/04 11:14
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class User extends AbstractBaseDto {
    private int id;

    private String name;

    private int age;

    private String address;
}
