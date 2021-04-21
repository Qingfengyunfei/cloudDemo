package com.yunfan.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @description
 * @create 2021-04-21 11:08
 * @since 1.0.0
 */
@RestController
public class ConfigClientController {

    @Value("${config.datasource.username}")
    private String username;

    @GetMapping("/username")
    public String getUsername() {
        return username;
    }
}
