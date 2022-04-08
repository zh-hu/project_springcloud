package com.atguigu.springcloud.alibaba.service;

import com.atguigu.springcloud.alibaba.domain.Order;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author zhanghu
 * @create 2022-04-07 20:47
 */
public interface OrderService {
    void create(Order order);
}
