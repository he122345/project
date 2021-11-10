package com.he.Service.Impl;

import com.he.Bean.Role;
import com.he.Dao.RoleDao;
import com.he.Service.Services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoleImpl implements RoleService {
    @Autowired
    private RoleDao roleDao;
    @Override
    public int insert(Role role) {
        return roleDao.insert(role);
    }

    @Override
    public int del(int id) {
        return roleDao.del(id);
    }

    @Override
    public int update(Role role) {
        return roleDao.update(role);
    }

    @Override
    public List<Role> findById(int id) {
        return roleDao.findById(id);
    }

    @Override
    public List<Role> findAll() {
        return roleDao.findAll();
    }
}
