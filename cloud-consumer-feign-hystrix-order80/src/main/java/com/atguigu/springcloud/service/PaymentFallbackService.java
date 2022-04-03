package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author zhanghu
 * @create 2022-04-02 10:45
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService{
    @Override
    public String paymentInfo_OK(Integer id) {
        return "PaymentHystrixService fall back-paymentInfo_ok ,/(ㄒoㄒ)/~~";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "PaymentHystrixService fall back-paymentInfo_TimeOut ,/(ㄒoㄒ)/~~";
    }
}
