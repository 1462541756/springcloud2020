package com.yangkai.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author 杨锴
 * @Since 2020/3/22 16:25
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClient2Main {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClient2Main.class,args);
    }
}
