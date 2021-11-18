package com.he.dao;

import com.he.entity.CartCommodity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author he
 * @date 2021/11/17
 * @time 23:06
 * @message
 */
@Mapper
public interface CartCommodityDao {
    int insert(CartCommodity cartCommodity);
    int del(String cartName);
    int update(CartCommodity cartCommodity);
    List<CartCommodity> findByCartName(String cartName);
    List<CartCommodity> findAll();
}
