package com.he.Service.Impl;

import com.he.Bean.RolePermission;
import com.he.Dao.RolePermissionDao;
import com.he.Service.Services.RolePermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RolePermissionImpl implements RolePermissionService {
    @Autowired
    private RolePermissionDao rolePermissionDao;
    @Override
    public int insert(RolePermission rolePermission) {
        return rolePermissionDao.insert(rolePermission);
    }

    @Override
    public int del(int id) {
        return rolePermissionDao.del(id);
    }

    @Override
    public int update(RolePermission rolePermission) {
        return rolePermissionDao.update(rolePermission);
    }

    @Override
    public List<RolePermission> findById(int id) {
        return rolePermissionDao.findById(id);
    }

    @Override
    public List<RolePermission> findAll() {
        return rolePermissionDao.findAll();
    }
}
