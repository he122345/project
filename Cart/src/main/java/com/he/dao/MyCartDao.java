package com.he.dao;

import com.he.entity.MyCart;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author he
 * @date 2021/11/17
 * @time 23:06
 * @message
 */
@Mapper
public interface MyCartDao {
    int insert(MyCart myCart);
    int del(String cartName);
    int update(MyCart myCart);
    List<MyCart> findByCartName(String cartName);
    List<MyCart> findAll();
}
