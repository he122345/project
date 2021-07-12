package com.goods.Controller;

import com.goods.Services.UserService;
import com.goods.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(allowCredentials = "true",origins = {"*"})
public class UserController {
    @Autowired
    private UserService _user;
    @RequestMapping(value = "login",method = {RequestMethod.GET})
    public int login(User user){
        return _user.login(user);
    }
}
