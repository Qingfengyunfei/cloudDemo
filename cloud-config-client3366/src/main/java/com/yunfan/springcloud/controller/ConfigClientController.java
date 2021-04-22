package com.yunfan.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @description
 * @create 2021-04-22 17:25
 * @since 1.0.0
 */
@RestController
@RefreshScope
public class ConfigClientController {

    @Value("${server.port}")
    private String serverPort;

    @Value("${config.datasource.username}")
    private String username;

    @GetMapping("/username")
    public String getUsername() {
        return "serverPort: " + serverPort + "\n username: " + username;
    }

}
