package com.atguigu.springcloud.alibaba.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;

/**
 * @author zhanghu
 * @create 2022-04-07 13:51
 */
public class CustomerBlockHandler {

    public static CommonResult handleException(BlockException exception){
        return new CommonResult(4444,"按客户自定义的限流处理信息......CustomerBlockHandler1");
    }

    public static CommonResult handleException2(BlockException exception){
        return new CommonResult(4444,"按客户自定义的限流处理信息......CustomerBlockHandler2");
    }

}
