package com.yangkai.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 杨锴
 * @date 2020/4/24 14:25
 * @description：
 */
@EnableDiscoveryClient
@SpringBootApplication
public class NacosConfigClientMain {

    public static void main(String[] args) {
        SpringApplication.run(NacosConfigClientMain.class,args);
    }
}
