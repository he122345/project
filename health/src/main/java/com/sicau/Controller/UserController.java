package com.sicau.Controller;

import com.sicau.Service.UserService;
import com.sicau.Util.MD5Util;
import com.sicau.Util.ValidateCodeUtil;
import com.sicau.common.Log.Log;
import com.sicau.common.Response.ResultBean;
import com.sicau.common.Response.ResultEnum;
import com.sicau.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Objects;

/**
 * @author he
 * @date 2021/9/26
 * @time 19:18
 * @message
 */
@RestController
@RequestMapping("user")
@CrossOrigin(allowCredentials = "true",origins = {"*"})
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("insert")
    public ResultBean insert(@Validated User user, BindingResult bindingResult,HttpServletRequest request){
        if (userService.findById(user.getId()).size()!=0){
            return ResultBean.fail().setResultEnum(ResultEnum.Id_Exist);
        }
        //验证参数是否规范
        if(bindingResult.hasErrors()){
            String errorMsg = Objects.requireNonNull(bindingResult.getFieldError()).getDefaultMessage();
            return ResultBean.fail().msg(errorMsg);
        }
        HttpSession session=request.getSession();
        String code= (String) session.getAttribute("CODE");
        if (!user.getCode().toLowerCase().equals(code)){
            return ResultBean.fail().setResultEnum(ResultEnum.Code_Fail);
        }
        user.setPassword(MD5Util.getSaltMD5(user.getPassword()));
        int msg;
        msg=userService.insert(user);
        if (msg==1) {return ResultBean.success().msg("注册成功");}
        else {return ResultBean.fail().msg("注册失败");}

    }
    @GetMapping("del")
    public String del(int id){
        int msg;
        msg=userService.del(id);
        if (msg==1) {return "删除成功";}
        else {return "删除失败";}
    }
    @PostMapping("update")
    public String update(User user){
        int msg;
        msg=userService.update(user);
        if (msg==1) {return "更新成功";}
        else {return "更新失败";}
    }
    @GetMapping("findById")
    List<User> findById(int id){
        return userService.findById(id);
    }
    @GetMapping("findAll")
    List<User> findAll(){
        return userService.findAll();
    }
    @GetMapping("img")
    public void verify(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("image/png");
        response.setHeader("Cache-Control", "no-cache");
        response.setHeader("Expire", "0");
        response.setHeader("Pragma", "no-cache");
        ValidateCodeUtil validateCodeUtil = new ValidateCodeUtil();
        validateCodeUtil.getRandomCodeImage(request, response);
    }
    @Log(type = 1,msg = "用户登录")
    @PostMapping("login")
    public ResultBean login(@Validated User user,BindingResult bindingResult,HttpServletRequest request){
        if (userService.findById(user.getId()).size()==0){
            return ResultBean.fail().msg("id不存在");
        }
        user.setName("1");
        //验证参数是否规范
        if(bindingResult.hasErrors()){
            String errorMsg = Objects.requireNonNull(bindingResult.getFieldError()).getDefaultMessage();
            if (!"用户名不能为空".equals(errorMsg)){return ResultBean.fail().msg(errorMsg);}
        }
        if(!MD5Util.getSaltverifyMD5(user.getPassword(),userService.login(user.getId()))){
            return ResultBean.fail().msg("密码错误");
        }
        HttpSession session=request.getSession();
        session.setAttribute("user",user);
        return ResultBean.success().msg("登录成功");
    }

}
