package com.yunfan.springcloud.service;

import com.yunfan.springcloud.entities.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Administrator
 * @date 2021-03-04
 */
@Component
@FeignClient(value = "cloud-payment-service")
public interface PaymentFeignService {
    /**
     * 按照订单id查询
     * @param id
     * @return
     */
    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id);
}
