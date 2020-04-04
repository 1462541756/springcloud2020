package com.yangkai.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author 杨锴
 * @date 2020/3/20 16:40
 * @description：
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
private Long id;
private  String serial;
}
