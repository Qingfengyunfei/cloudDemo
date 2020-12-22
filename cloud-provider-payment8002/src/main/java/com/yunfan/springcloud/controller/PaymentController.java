package com.yunfan.springcloud.controller;

import com.yunfan.springcloud.entities.CommonResult;
import com.yunfan.springcloud.entities.Payment;
import com.yunfan.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @author Administrator
 * @description
 * @create 2020-12-01 18:26
 * @since 1.0.0
 */
@RestController
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        log.info("===获取数据===："+payment);
        int result = paymentService.create(payment);
        log.info("=====插入结果====：" + result);
        if (result > 0) {
            return new CommonResult(200, "插入成功,serverPort" + serverPort, result);
        } else {
            return new CommonResult(404, "插入失败", null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("=====查询结果====：" + payment);
        if (payment != null) {
            return new CommonResult(200, "查询成功,serverPort" + serverPort, payment);
        } else {
            return new CommonResult(404, "查询失败", null);
        }
    }

}
