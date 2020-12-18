package com.yunfan.springcloud.dao;

import com.yunfan.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author Administrator
 * @description
 * @create 2020-12-01 18:12
 * @since 1.0.0
 */
@Mapper
public interface PaymentDao {
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
