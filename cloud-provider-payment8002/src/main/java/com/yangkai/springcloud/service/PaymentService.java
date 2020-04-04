package com.yangkai.springcloud.service;

import com.yangkai.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

/**
 * @author 杨锴
 * @date 2020/3/20 17:18
 * @description：
 */
@Service
public interface PaymentService {
    public int create(Payment payment);
    public Payment getPaymentById(@Param("id") Long id);

}
