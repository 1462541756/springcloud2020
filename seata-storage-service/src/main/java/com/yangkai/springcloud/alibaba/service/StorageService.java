package com.yangkai.springcloud.alibaba.service;

/**
 * @author 杨锴
 * @date 2020/5/7 19:04
 * @description：
 */
public interface StorageService {
    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}
