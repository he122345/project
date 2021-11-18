package com.he.services;

import com.he.Response.ResultBean;
import com.he.entity.MyCart;

/**
 * @author he
 * @date 2021/11/17
 * @time 23:11
 * @message
 */
public interface MyCartServices {
    ResultBean insert(MyCart myCart);
    ResultBean del(String cartName);
    ResultBean update(MyCart myCart);
    ResultBean findByCartName(String cartName);
    ResultBean findAll();
}
