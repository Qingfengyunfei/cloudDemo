package com.yunfan.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author Administrator
 * @description
 * @create 2020-12-02 17:42
 * @since 1.0.0
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
//    @LoadBalanced //使用@LoadBalanced 注解赋予RestTemplate负载均衡能力
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
