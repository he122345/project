package com.he.Service.Impl;

import com.he.Bean.UserRole;
import com.he.Dao.UserDao;
import com.he.Dao.UserRoleDao;
import com.he.Service.Services.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserRoleImpl implements UserRoleService {
    @Autowired
    private UserRoleDao userRoleDao;
    @Override
    public int insert(UserRole userRole) {
        return userRoleDao.insert(userRole);
    }

    @Override
    public int del(int id) {
        return userRoleDao.del(id);
    }

    @Override
    public int update(UserRole userRole) {
        return userRoleDao.update(userRole);
    }

    @Override
    public List<UserRole> findById(int id) {
        return userRoleDao.findById(id);
    }

    @Override
    public List<UserRole> findAll() {
        return userRoleDao.findAll();
    }
}
