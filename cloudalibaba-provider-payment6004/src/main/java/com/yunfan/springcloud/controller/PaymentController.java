package com.yunfan.springcloud.controller;

import com.yunfan.springcloud.entities.CommonResult;
import com.yunfan.springcloud.entities.Payment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @author Administrator
 * @description
 * @create 2021-05-20 16:33
 * @since 1.0.0
 */
@RestController
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    public static HashMap<Long, Payment> hashMap = new HashMap<>();

    static {
        hashMap.put(1L, new Payment(1L, "558AE54DE8AD5EA18"));
        hashMap.put(2L, new Payment(2L, "DFDDFDDDE8AD5EA45"));
        hashMap.put(3L, new Payment(3L, "34DFSDFSFSEEEEE12"));
    }

    @GetMapping(value = "/paymentSQL/{id}")
    public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id) {
        Payment payment = hashMap.get(id);
        CommonResult<Payment> result = new CommonResult<>(200, "QUERY SUCCESS, serverPort:" + serverPort, payment);
        return result;
    }
}
