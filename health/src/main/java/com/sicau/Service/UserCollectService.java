package com.sicau.Service;

import com.sicau.domain.Doctor;
import com.sicau.domain.User;
import com.sicau.domain.UserCollect;

import java.util.List;

/**
 * @author he
 * @date 2021/9/26
 * @time 18:55
 * @message
 */
public interface UserCollectService {
    int insert(UserCollect userCollect);
    int del(UserCollect userCollect);
    int update(UserCollect userCollect);
    List<UserCollect> findById(int id);
    List<UserCollect> findAll();
    User isExistU(int id);
    Doctor isExistD(int id);
}
