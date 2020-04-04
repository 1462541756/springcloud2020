package com.yangkai.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 杨锴
 * @date 2020/4/4 20:07
 * @description：
 */
@SpringBootApplication
@EnableEurekaClient
public class Gateway {
    public static void main(String[] args) {
        SpringApplication.run(Gateway.class,args);
    }
}
