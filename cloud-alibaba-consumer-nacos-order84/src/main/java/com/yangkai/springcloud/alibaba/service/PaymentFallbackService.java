package com.yangkai.springcloud.alibaba.service;

import com.yangkai.springcloud.entities.CommonResult;
import com.yangkai.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @author 杨锴
 * @date 2020/4/24 14:25
 * @description：
 */
@Component
public class PaymentFallbackService implements PaymentService{


    @Override
    public CommonResult< Payment > paymentSQL(Long id) {
        return new CommonResult<>(444,"服务降级返回，---PaymentFallbackService",new Payment(id,"ErrorSerial"));
    }
}
