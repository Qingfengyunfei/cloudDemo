package com.yunfan.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Administrator
 * @description
 * @create 2021-05-18 15:30
 * @since 1.0.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain6001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain6001.class, args);
    }
}
