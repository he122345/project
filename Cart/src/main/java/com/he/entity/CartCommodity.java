package com.he.entity;

import lombok.Data;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Date;


/**
 * @author he
 * @date 2021/11/17
 * @time 22:04
 * @message
 */
@Data
public class CartCommodity {
    private String id;
    @NotNull(message = "商品名字不能为空")
    private String cartName;
    /**
     * base64图片编码
     */
    @NotNull(message = "图片编码不能为空")
    private String picture;
    @Min(value = 0,message = "价格应大于0")
    private Double price;
    @DecimalMin("库存不能小于0")
    private Integer stock;
    private String description;
    private String createTime;
    private String updateTime;
    private Integer version;
}
