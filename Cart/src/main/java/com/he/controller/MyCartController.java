package com.he.controller;

import com.he.Response.ResultBean;
import com.he.Response.ResultEnum;
import com.he.entity.MyCart;
import com.he.services.MyCartServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;


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
    public ResultBean insert(@RequestBody @Validated MyCart myCart, BindingResult bindingResult) {
        //验证参数是否规范
        if(bindingResult.hasErrors()){
            String errorMsg = Objects.requireNonNull(bindingResult.getFieldError()).getDefaultMessage();
            return ResultBean.fail().setMsg(errorMsg);
        }
        return myCartServices.insert(myCart);
    }
    @GetMapping("del")
    public ResultBean del(String cartName) {
        if (cartName == null || "".equals(cartName)){
            return ResultBean.fail().setResultEnum(ResultEnum.Incorrectly_Name);
        }
        return myCartServices.del(cartName);
    }
    @PostMapping("update")
    public ResultBean update(@RequestBody @Validated MyCart myCart, BindingResult bindingResult) {
        //验证参数是否规范
        if(bindingResult.hasErrors()){
            String errorMsg = Objects.requireNonNull(bindingResult.getFieldError()).getDefaultMessage();
            return ResultBean.fail().setMsg(errorMsg);
        }
        return myCartServices.update(myCart);
    }
    @GetMapping("findByCartName")
    public ResultBean findByCartName(String cartName) {
        if (cartName == null || "".equals(cartName)){
            return ResultBean.fail().setResultEnum(ResultEnum.Incorrectly_Name);
        }
        return myCartServices.findByCartName(cartName);
    }
    @GetMapping("findAll")
    public ResultBean findAll() {
        return myCartServices.findAll();
    }
}
