package com.he.controller;

import com.he.Response.ResultBean;
import com.he.Response.ResultEnum;
import com.he.entity.CartCommodity;
import com.he.exception.LogException;
import com.he.services.CartCommodityServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.Objects;


/**
 * @author he
 * @date 2021/11/18
 * @time 0:10
 * @message
 */
@RestController
@RequestMapping("commodity")
@CrossOrigin(allowCredentials = "true", origins = {"*"})
public class CartCommodityController{
    @Autowired
    private CartCommodityServices cartCommodityServices;
    @PostMapping("insert")
    public ResultBean insert(@RequestBody @Validated CartCommodity cartCommodity, BindingResult bindingResult) {
        //验证参数是否规范
        if(bindingResult.hasErrors()){
            String errorMsg = Objects.requireNonNull(bindingResult.getFieldError()).getDefaultMessage();
            throw new LogException(ResultEnum.Illegal_Arguments.getCode(),ResultEnum.Illegal_Arguments.getMsg()+":"+errorMsg);
        }
        return cartCommodityServices.insert(cartCommodity);
    }
    @GetMapping("del")
    public ResultBean del(String cartName) {
        if (cartName == null || "".equals(cartName)){
            throw new LogException(ResultEnum.Incorrectly_Name);
        }
        return cartCommodityServices.del(cartName);
    }
    @PostMapping("update")
    public ResultBean update(@RequestBody @Validated CartCommodity cartCommodity,BindingResult bindingResult) {
        //验证参数是否规范
        if(bindingResult.hasErrors()){
            String errorMsg = Objects.requireNonNull(bindingResult.getFieldError()).getDefaultMessage();
            throw new LogException(ResultEnum.Illegal_Arguments.getCode(),ResultEnum.Illegal_Arguments.getMsg()+":"+errorMsg);
        }
        return cartCommodityServices.update(cartCommodity);
    }
    @GetMapping("findByCartName")
    public ResultBean findByCartName(String cartName) throws SQLException {
        if (cartName == null || "".equals(cartName)){
            throw new LogException(ResultEnum.Incorrectly_Name);
        }
        return cartCommodityServices.findByCartName(cartName);
    }
    @GetMapping("findAll")
    public ResultBean findAll() {
        return cartCommodityServices.findAll();
    }
}
