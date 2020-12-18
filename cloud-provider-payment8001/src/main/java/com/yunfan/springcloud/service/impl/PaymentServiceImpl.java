package com.yunfan.springcloud.service.impl;

import com.yunfan.springcloud.dao.PaymentDao;
import com.yunfan.springcloud.entities.Payment;
import com.yunfan.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Administrator
 * @description
 * @create 2020-12-01 18:24
 * @since 1.0.0
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
