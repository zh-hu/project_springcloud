package com.atguigu.springcloud.alibaba.service;


/**
 * @author zhanghu
 * @create 2022-04-08 10:58
 */
public interface StorageService {

    /**
     * 扣减库存
     * @param productId
     * @param count
     */
    void decrease(Long productId, Integer count);
}
