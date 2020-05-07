package com.yangkai.springcloud.alibaba.controller;

import com.yangkai.springcloud.alibaba.entity.CommonResult;
import com.yangkai.springcloud.alibaba.entity.Order;
import com.yangkai.springcloud.alibaba.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 杨锴
 * @date 2020/5/7 19:04
 * @description：
 */
@RestController
public class OrderController
{
    @Resource
    private OrderService orderService;


    @GetMapping("/order/create")
    public CommonResult create(Order order)
    {
        orderService.create(order);
        return new CommonResult(200,"订单创建成功");
    }
}
