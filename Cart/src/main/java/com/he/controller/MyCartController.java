package com.he.controller;

import com.he.Response.ResultBean;
import com.he.entity.MyCart;
import com.he.services.MyCartServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * @author he
 * @date 2021/11/17
 * @time 23:29
 * @message
 */
@RestController
@RequestMapping("cart")
@CrossOrigin(allowCredentials = "true", origins = {"*"})
public class MyCartController {
    @Autowired
    private MyCartServices myCartServices;
    @PostMapping("insert")
    public ResultBean insert(@RequestBody MyCart myCart) {
        return myCartServices.insert(myCart);
    }
    @GetMapping("del")
    public ResultBean del(String cartName) {
        return myCartServices.del(cartName);
    }
    @PostMapping("update")
    public ResultBean update(@RequestBody MyCart myCart) {
        return myCartServices.update(myCart);
    }
    @GetMapping("findByCartName")
    public ResultBean findByCartName(String cartName) {
        return myCartServices.findByCartName(cartName);
    }
    @GetMapping("findAll")
    public ResultBean findAll() {
        return myCartServices.findAll();
    }
}
