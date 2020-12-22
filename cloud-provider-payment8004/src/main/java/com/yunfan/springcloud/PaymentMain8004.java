package com.yunfan.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Administrator
 * @description
 * @create 2020-12-01 17:54
 * @since 1.0.0
 */
@SpringBootApplication
@EnableDiscoveryClient //该注解用于向使用consul 或者 zookeeper作为注册中心时注册服务
public class PaymentMain8004 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8004.class, args);
    }
}
