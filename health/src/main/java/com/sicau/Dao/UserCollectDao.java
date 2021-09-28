package com.sicau.Dao;

import com.sicau.domain.Doctor;
import com.sicau.domain.User;
import com.sicau.domain.UserCollect;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserCollectDao {
    int insert(UserCollect userCollect);
    int del(int id);
    int update(UserCollect userCollect);
    List<UserCollect> findById(int id);
    List<UserCollect> findAll();
    User isExistU(int id);
    Doctor isExistD(int id);
}
