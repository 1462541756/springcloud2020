package com.yangkai.springcloud.ailibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 杨锴
 * @date 2020/4/24 14:25
 * @description：
 */
@SpringBootApplication
@EnableDiscoveryClient
public class AlibabaPaymentMain4 {

    public static void main(String[] args) {
        SpringApplication.run(AlibabaPaymentMain4.class,args);
    }
}
