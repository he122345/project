package com.he.controller;

import com.he.Response.ResultBean;
import com.he.entity.CartCommodity;
import com.he.services.CartCommodityServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * @author he
 * @date 2021/11/18
 * @time 0:10
 * @message
 */
@RestController
@RequestMapping("commodity")
@CrossOrigin(allowCredentials = "true", origins = {"*"})
public class CartCommodityController {
    @Autowired
    private CartCommodityServices cartCommodityServices;
    @PostMapping("insert")
    public ResultBean insert(@RequestBody CartCommodity cartCommodity) {
        return cartCommodityServices.insert(cartCommodity);
    }
    @GetMapping("del")
    public ResultBean del(String cartName) {
        return cartCommodityServices.del(cartName);
    }
    @PostMapping("update")
    public ResultBean update(@RequestBody CartCommodity cartCommodity) {
        return cartCommodityServices.update(cartCommodity);
    }
    @GetMapping("findByCartName")
    public ResultBean findByCartName(String cartName) {
        return cartCommodityServices.findByCartName(cartName);
    }
    @GetMapping("findAll")
    public ResultBean findAll() {
        return cartCommodityServices.findAll();
    }
}
