package com.yunfan.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @description
 * @create 2021-05-18 16:19
 * @since 1.0.0
 */
@RestController
@RefreshScope //支持Nacos的动态刷新功能
public class ConfigClientController {

    @Value("${config.datasource.username}")
    private String username;

    @GetMapping("/username")
    public String getUsername() {
        return username;
    }
}
