package com.yangkai.myrule;

/**
 * @author 杨锴
 * @date 2020/3/24 14:25
 * @description：
 */

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/***
 *Ribbon自定义规则
 * 不要放在@ComponentScan扫描包下
 * */
@Configuration
public class MyselfRule {
    @Bean
    public IRule myRule(){
        return new RandomRule();
    }
}
