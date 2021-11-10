package com.he.Controller;

import com.he.Bean.UserRole;
import com.he.Service.Services.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author he
 * @date 2021/11/4
 * @time 17:15
 * @message
 */
@RestController
@RequestMapping("userRole")
@CrossOrigin(allowCredentials = "true",origins = {"*"})
public class UserRoleController {
    @Autowired
    private UserRoleService userRoleService;
    @PostMapping("insert")
    public int insert(UserRole userRole) {
        return userRoleService.insert(userRole);
    }
    @GetMapping("del")
    public int del(int id) {
        return userRoleService.del(id);
    }
    @PostMapping("update")
    public int update(UserRole userRole) {
        return userRoleService.update(userRole);
    }
    @GetMapping("findById")
    public List<UserRole> findById(int id) {
        return userRoleService.findById(id);
    }
    @GetMapping("findAll")
    public List<UserRole> findAll() {
        return userRoleService.findAll();
    }
}
