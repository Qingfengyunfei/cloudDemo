package com.yunfan.springcloud.service;

/**
 * @author Administrator
 * @description
 * @create 2021-03-05 12:15
 * @since 1.0.0
 */
public interface PaymentService {

    /**
     * 正常访问方法 OK
     * @param id
     * @return
     */
    String paymentInfo_OK(Integer id);

    /**
     * 异常访问方法 Timeout
     * @param id
     * @return
     */
    String paymentInfo_Timeout(Integer id);
}
