package com.he.services;

import com.he.response.ResultBean;
import com.he.entity.CartCommodity;

/**
 * @author he
 * @date 2021/11/17
 * @time 23:12
 * @message
 */
public interface CartCommodityServices {
    ResultBean insert(CartCommodity cartCommodity);
    ResultBean del(String cartName);
    ResultBean update(CartCommodity cartCommodityDao);
    ResultBean findByCartName(String cartName);
    ResultBean findAll();
}
