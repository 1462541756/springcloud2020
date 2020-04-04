package com.yangkai.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author 杨锴
 * @date 2020/3/24 14:25
 * @description：
 */
@SpringBootApplication
@EnableFeignClients
public class OrderFeignMain {

    public static void main(String[] args) {
        SpringApplication.run(OrderFeignMain.class,args);
    }
}
