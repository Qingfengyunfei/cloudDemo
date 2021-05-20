package com.yunfan.springcloud.service;

import com.yunfan.springcloud.entities.CommonResult;
import com.yunfan.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Administrator
 * @description
 * @create 2021-05-20 17:23
 * @since 1.0.0
 */

@FeignClient(value = "nacos-payment-provider", fallback = PaymentFallbackService.class)
public interface IPaymentService {
    @GetMapping(value = "/paymentSQL/{id}")
    CommonResult<Payment> paymentSQL(@PathVariable("id") Long id);
}
