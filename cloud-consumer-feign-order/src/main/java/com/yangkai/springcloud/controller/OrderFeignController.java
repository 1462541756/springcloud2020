package com.yangkai.springcloud.controller;

import com.yangkai.springcloud.service.PaymentFeignService;
import com.yangkai.springcloud.entities.CommonResult;
import com.yangkai.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 杨锴
 * @date 2020/3/24 14:25
 * @description：
 */
@RestController
@Slf4j
@RequestMapping(value = "/consumer")
public class OrderFeignController {

    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping(value="/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id")  Long id) {
        return  paymentFeignService.getPaymentById(id);
    }

    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout() {
        //openfeign-ribbon 客户端默认等待1S
        return  paymentFeignService.paymentFeignTimeout();
    }
}
