package com.sicau.Service.Impl;

import com.sicau.Dao.UserCollectDao;
import com.sicau.Service.UserCollectService;
import com.sicau.domain.Doctor;
import com.sicau.domain.User;
import com.sicau.domain.UserCollect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author he
 * @date 2021/9/26
 * @time 18:55
 * @message
 */
@Service
public class UserCollectServiceImpl implements UserCollectService {
    @Autowired
    private UserCollectDao userCollectDao;
    @Override
    public int insert(UserCollect userCollect) {
        return userCollectDao.insert(userCollect);
    }

    @Override
    public int del(int id) {
        return userCollectDao.del(id);
    }

    @Override
    public int update(UserCollect userCollect) {
        return userCollectDao.update(userCollect);
    }

    @Override
    public List<UserCollect> findById(int id) {
        return userCollectDao.findById(id);
    }

    @Override
    public List<UserCollect> findAll() {
        return userCollectDao.findAll();
    }
    @Override
    public User isExistU(int id){
        return userCollectDao.isExistU(id);
    }
    @Override
    public Doctor isExistD(int id){
        return userCollectDao.isExistD(id);
    }
}
