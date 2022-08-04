package com.koolean.payment.request.base;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;

/**
 * 基础视图接口
 * 实现序列化
 * @author wb-hbd
 * @date 2022/06/17 10:42
 **/
public abstract class AbstractBaseDto implements Serializable {

    /**
     * Apache ToString
     * 日志打印对象输出格式
     * @return
     */
    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.DEFAULT_STYLE);
    }
}
