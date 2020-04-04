package com.yangkai.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author 杨锴
 * @date 2020/4/4 22:32
 * @description：
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigCenterMain {

    public static void main(String[] args) {
        SpringApplication.run(ConfigCenterMain.class,args);
    }
}