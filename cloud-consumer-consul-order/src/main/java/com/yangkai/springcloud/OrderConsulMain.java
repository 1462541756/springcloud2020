package com.yangkai.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 杨锴
 * @date 2020/3/22 22:48
 * @description：
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderConsulMain {
    public static void main(String[] args) {
        SpringApplication.run(OrderConsulMain.class,args);
    }
}
