package com.yunfan.springcloud.service;

import com.yunfan.springcloud.entities.CommonResult;
import com.yunfan.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @author Administrator
 * @description
 * @create 2021-05-20 17:25
 * @since 1.0.0
 */
@Component
public class PaymentFallbackService implements IPaymentService {
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(444, "服务降级返回,---PaymentFallbackService", new Payment(id,"error"));
    }
}
