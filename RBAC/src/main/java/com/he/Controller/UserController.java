package com.he.Controller;

import com.he.Bean.User;
import com.he.Service.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author he
 * @date 2021/11/4
 * @time 17:14
 * @message
 */
@RestController
@RequestMapping("user")
@CrossOrigin(allowCredentials = "true",origins = {"*"})
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("insert")
    public int insert(User user) {
        return userService.insert(user);
    }
    @GetMapping("del")
    public int del(int id) {
        return userService.del(id);
    }
    @PostMapping("update")
    public int update(User user) {
        return userService.update(user);
    }
    @GetMapping("findById")
    public List<User> findById(int id) {
        return userService.findById(id);
    }
    @GetMapping("findAll")
    public List<User> findAll() {
        return userService.findAll();
    }
}
