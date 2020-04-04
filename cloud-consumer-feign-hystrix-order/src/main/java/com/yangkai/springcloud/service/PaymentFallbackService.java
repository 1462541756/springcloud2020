package com.yangkai.springcloud.service;

import org.springframework.stereotype.Component;


/**
 * @author 杨锴
 * @date 2020/3/26 14:39
 * @description：
 */
@Component
public class PaymentFallbackService implements PaymentService {

    @Override
    public String paymentInfo_OK(Integer id) {
        return "----PaymentFallbackService fall back paymentInfo_OK,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_Timeout(Integer id) {
        return "----PaymentFallbackService fall back paymentInfo_Timeout,o(╥﹏╥)o";
    }
}
