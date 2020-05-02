package com.yangkai.springcloud.ailibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 杨锴
 * @date 2020/5/2 12:15
 * @description：
 */
@EnableDiscoveryClient
@SpringBootApplication
public class SentinelMain {

    public static void main(String[] args) {
        SpringApplication.run(SentinelMain.class,args);
    }
}
