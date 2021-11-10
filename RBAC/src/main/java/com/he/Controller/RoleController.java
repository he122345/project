package com.he.Controller;

import com.he.Bean.Role;
import com.he.Service.Services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author he
 * @date 2021/11/4
 * @time 17:13
 * @message
 */
@RestController
@RequestMapping("role")
@CrossOrigin(allowCredentials = "true",origins = {"*"})
public class RoleController {
    @Autowired
    private RoleService roleService;
    @PostMapping("insert")
    public int insert(Role role) {
        return roleService.insert(role);
    }
    @GetMapping("del")
    public int del(int id) {
        return roleService.del(id);
    }
    @PostMapping("update")
    public int update(Role role) {
        return roleService.update(role);
    }
    @GetMapping("findById")
    public List<Role> findById(int id) {
        return roleService.findById(id);
    }
    @GetMapping("findAll")
    public List<Role> findAll() {
        return roleService.findAll();
    }
}
