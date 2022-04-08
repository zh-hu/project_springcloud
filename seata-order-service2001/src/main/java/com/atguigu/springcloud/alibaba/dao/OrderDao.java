package com.atguigu.springcloud.alibaba.dao;

import com.atguigu.springcloud.alibaba.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author zhanghu
 * @create 2022-04-07 20:30
 */
@Mapper
public interface OrderDao {
    //1新建订单
    void create(Order order);

    //2.修改订单状态 ，从零改为1
    void update(@Param("userId") Long userId,@Param("status") Integer status);
}
