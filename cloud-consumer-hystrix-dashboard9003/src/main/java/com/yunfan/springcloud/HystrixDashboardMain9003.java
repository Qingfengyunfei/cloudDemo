package com.yunfan.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author Administrator
 * @description
 * @create 2021-03-05 16:20
 * @since 1.0.0
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboardMain9003 {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboardMain9003.class, args);
    }
}
