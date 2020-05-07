package com.yangkai.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author 杨锴
 * @date 2020/5/7 19:04
 * @description：
 */
@Configuration
@MapperScan({"com.yangkai.springcloud.alibaba.dao"})
public class MyBatisConfig {
}
