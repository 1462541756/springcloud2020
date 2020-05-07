package com.yangkai.springcloud.alibaba.entity;

import lombok.Data;

/**
 * @author 杨锴
 * @date 2020/5/7 19:04
 * @description：
 */
@Data
public class Storage {

    private Long id;

    /**
     * 产品id
     */
    private Long productId;

    /**
     * 总库存
     */
    private Integer total;

    /**
     * 已用库存
     */
    private Integer used;

    /**
     * 剩余库存
     */
    private Integer residue;
}
