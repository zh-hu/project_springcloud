package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author zhanghu
 * @create 2022-04-01 17:56
 */
@SpringBootApplication
@EnableFeignClients
public class OrderFeignMain80 {


    public static void main(String[] args) {
        SpringApplication.run(OrderFeignMain80.class,args);
    }
}
