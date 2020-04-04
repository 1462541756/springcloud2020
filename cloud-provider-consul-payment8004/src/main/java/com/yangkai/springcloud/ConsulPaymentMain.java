package com.yangkai.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 杨锴
 * @date 2020/3/22 22:32
 * @description：
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsulPaymentMain {
    public static void main(String[] args) {
        SpringApplication.run(ConsulPaymentMain.class,args);
    }
}
