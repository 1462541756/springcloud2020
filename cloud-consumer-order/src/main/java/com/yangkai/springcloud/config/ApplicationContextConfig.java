package com.yangkai.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author 杨锴
 * @date 2020/3/20 21:00
 * @description：
 */
@Configuration
public class ApplicationContextConfig {
    //开启负载均衡，默认规则为轮询
    @LoadBalanced
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
