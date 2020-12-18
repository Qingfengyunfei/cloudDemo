package com.yunfan.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Administrator
 * @description
 * @create 2020-12-03 16:55
 * @since 1.0.0
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain9001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain9001.class, args);
    }
}
