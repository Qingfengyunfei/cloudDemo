package com.yunfan.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Administrator
 * @description
 * @create 2020-12-01 18:08
 * @since 1.0.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
    /**
     * 订单id
     */
    private Long id;
    /**
     * 支付流水号
     */
    private String serial;

}
