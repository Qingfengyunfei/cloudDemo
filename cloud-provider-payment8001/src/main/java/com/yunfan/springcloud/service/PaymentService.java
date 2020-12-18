package com.yunfan.springcloud.service;

import com.yunfan.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author Administrator
 * @description
 * @create 2020-12-01 18:24
 * @since 1.0.0
 */
public interface PaymentService {
    /**
     * 新增订单
     * @param payment
     * @return
     */
    int create(Payment payment);

    /**
     * 按照订单id查询
     * @param id
     * @return
     */
    Payment getPaymentById(@Param("id") Long id);
}
