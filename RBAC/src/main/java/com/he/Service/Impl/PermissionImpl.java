package com.he.Service.Impl;

import com.he.Bean.Permission;
import com.he.Dao.PermissionDao;
import com.he.Service.Services.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PermissionImpl implements PermissionService {
    @Autowired
    private PermissionDao permissionDao;
    @Override
    public int insert(Permission permission) {
        return permissionDao.insert(permission);
    }

    @Override
    public int del(int id) {
        return permissionDao.del(id);
    }

    @Override
    public int update(Permission permission) {
        return permissionDao.update(permission);
    }

    @Override
    public List<Permission> findById(int id) {
        return permissionDao.findById(id);
    }

    @Override
    public List<Permission> findAll() {
        return permissionDao.findAll();
    }
}
