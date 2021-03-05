package com.yunfan.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author Administrator
 * @description
 * @create 2021-03-05 14:32
 * @since 1.0.0
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "PaymentFallbackService fallback_paymentInfo_OK method, error";
    }

    @Override
    public String paymentInfo_Timeout(Integer id) {
        return "PaymentFallbackService fallback_paymentInfo_Timeout method, error";
    }
}
