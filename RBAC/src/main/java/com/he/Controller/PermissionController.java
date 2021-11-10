package com.he.Controller;

import com.he.Bean.Permission;
import com.he.Service.Services.PermissionService;
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
@RequestMapping("permission")
@CrossOrigin(allowCredentials = "true",origins = {"*"})
public class PermissionController {
    @Autowired
    private PermissionService permissionService;
    @PostMapping("insert")
    public int insert(Permission permission) {
        return permissionService.insert(permission);
    }
    @GetMapping("del")
    public int del(int id) {
        return permissionService.del(id);
    }
    @PostMapping("update")
    public int update(Permission permission) {
        return permissionService.update(permission);
    }
    @GetMapping("findById")
    public List<Permission> findById(int id) {
        return permissionService.findById(id);
    }
    @GetMapping("findAll")
    public List<Permission> findAll() {
        return permissionService.findAll();
    }
}
