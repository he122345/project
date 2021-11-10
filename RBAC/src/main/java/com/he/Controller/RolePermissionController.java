package com.he.Controller;

import com.he.Bean.RolePermission;
import com.he.Service.Services.RolePermissionService;
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
@RequestMapping("rolePermission")
@CrossOrigin(allowCredentials = "true",origins = {"*"})
public class RolePermissionController {
    @Autowired
    private RolePermissionService rolePermissionService;
    @PostMapping("insert")
    public int insert(RolePermission rolePermission) {
        return rolePermissionService.insert(rolePermission);
    }
    @GetMapping("del")
    public int del(int id) {
        return rolePermissionService.del(id);
    }
    @PostMapping("update")
    public int update(RolePermission rolePermission) {
        return rolePermissionService.update(rolePermission);
    }
    @GetMapping("findById")
    public List<RolePermission> findById(int id) {
        return rolePermissionService.findById(id);
    }
    @GetMapping("findAll")
    public List<RolePermission> findAll() {
        return rolePermissionService.findAll();
    }
}
