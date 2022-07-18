package com.koolean.payment.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author jiwu
 * @date 2022/07/15 15:40
 **/

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Payment implements Serializable {

    private static final long serialVersionUID = -4952433529959040160L;

    private Long id;

    /**
     * 微服务 一个服务对应一个数据库，同一个信息可能存在不同的数据库
     */
    private String serial;
}
