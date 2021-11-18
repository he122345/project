package com.he.entity;

import lombok.Data;

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
    private String cartName;
    private String picture;
    private Double price;
    private Integer stock;
    private String description;
    private Date createTime;
    private Date updateTime;
}
