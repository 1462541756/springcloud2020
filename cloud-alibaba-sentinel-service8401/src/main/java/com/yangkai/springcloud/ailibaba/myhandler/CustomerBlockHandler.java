package com.yangkai.springcloud.ailibaba.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.yangkai.springcloud.entities.CommonResult;
import com.yangkai.springcloud.entities.Payment;

/**
 * @author 杨锴
 * @date 2020/5/2 12:15
 * @description：
 */
public class CustomerBlockHandler {

    public static CommonResult handlerException(BlockException exception) {
        return  new CommonResult(444,"按照客户自定义的Glogal 全局异常处理 ---- 1",new Payment(2020L,"serial003"));
    }

    public static CommonResult handlerException2(BlockException exception) {
        return  new CommonResult(444,"按照客户自定义的Glogal 全局异常处理 ---- 2",new Payment(2020L,"serial003"));
    }
}
