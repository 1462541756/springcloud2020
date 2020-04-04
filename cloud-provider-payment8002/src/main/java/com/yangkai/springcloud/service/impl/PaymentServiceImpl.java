package com.yangkai.springcloud.service.impl;

import com.yangkai.springcloud.dao.PaymentDao;
import com.yangkai.springcloud.entities.Payment;
import com.yangkai.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 杨锴
 * @date 2020/3/20 17:20
 * @description：
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;
    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
