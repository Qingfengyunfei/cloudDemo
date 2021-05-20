package com.yunfan.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.yunfan.springcloud.entities.CommonResult;
import com.yunfan.springcloud.entities.Payment;

/**
 * @author Administrator
 * @description
 * @create 2021-05-20 16:16
 * @since 1.0.0
 */
public class CustomerBlockHandler {

    public static CommonResult handlerException1(BlockException e) {
        return new CommonResult(444, "按照客户自定义, global handlerException --1");
    }

    public static CommonResult handlerException2(BlockException e) {
        return new CommonResult(444, "按照客户自定义, global handlerException --2");
    }
}
