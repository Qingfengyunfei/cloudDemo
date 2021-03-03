package com.yunfan.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Administrator
 * @description 自定义负载规则
 * @create 2021-03-03 16:07
 * @since 1.0.0
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule() {
        // 定义为随机
        return new RandomRule();
    }
}
