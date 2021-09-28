package com.sicau.Service.Impl;

import com.sicau.Dao.UserDao;
import com.sicau.Service.UserService;
import com.sicau.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author he
 * @date 2021/9/26
 * @time 18:51
 * @message
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public int insert(User user) {
        return userDao.insert(user);
    }

    @Override
    public int del(int id) {
        return userDao.del(id);
    }

    @Override
    public int update(User user) {
        return userDao.update(user);
    }

    @Override
    public List<User> findById(int id) {
        return userDao.findById(id);
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
    @Override
    public String login(int id){
        return userDao.login(id);
    }
}
