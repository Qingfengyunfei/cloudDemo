package com.yunfan.springcloud.controller;

import ch.qos.logback.core.util.TimeUtil;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @author Administrator
 * @description
 * @create 2021-05-20 10:02
 * @since 1.0.0
 */
@Slf4j
@RestController
public class FlowLimitController {

    @GetMapping(value = "/testA")
    public String testA() {
        log.info(Thread.currentThread().getName()+"\t ....testA");
        return "_____testA";
    }

    @GetMapping(value = "/testB")
    public String testB() {
        return "_____testB";
    }

    /**
     * 模拟RT降级
     * @return
     */
    @GetMapping(value = "testC")
    public String testC() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("testC 测试RT");
        return "_____testC";
    }

    /**
     * 模拟异常比例
     * @return
     */
    @GetMapping(value = "testD")
    public String testD() {
        log.info("testD 测试异常比例");
        int age = 10/0;
        return "_____testD";
    }

    /**
     * 模拟异常数
     * @return
     */
    @GetMapping(value = "testE")
    public String testE() {
        log.info("testE 测试异常数");
        int age = 10/0;
        return "_____testE";
    }

    /**
     * 模拟热点限流规则
     * @return
     */
    @GetMapping(value = "/testHotKey")
    @SentinelResource(value = "testHotKey", blockHandler = "deal_testHotKey")
    public String testHotKey(@RequestParam(value = "p1", required = false) String p1,
                             @RequestParam(value = "p2", required = false) String p2) {
        return "_____testHotKey";
    }

    /**
     * blockHandler指定的兜底方法
     * @param p1
     * @param p2
     * @param e
     * @return
     */
    public String deal_testHotKey(String p1, String p2, BlockException e) {
        // 系统默认Blocked by Sentinel (flow limiting)
        return "---deal_testHotKey---";
    }
}
