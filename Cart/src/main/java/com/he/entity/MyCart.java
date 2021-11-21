package com.he.entity;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;


/**
 * @author he
 * @date 2021/11/17
 * @time 22:05
 * @message
 */
@Data
public class MyCart {
    private String id;
    @NotNull(message = "商品名不能为空")
    private String cartName;
    @Min(value = 0,message = "商品数量应大于0")
    private Integer quantity;
    private Integer version;
}
