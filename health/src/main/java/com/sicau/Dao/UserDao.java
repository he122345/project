package com.sicau.Dao;


import com.sicau.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserDao {
    int insert(User user);
    int del(int id);
    int update(User user);
    List<User> findById(int id);
    List<User> findAll();
    String login(int id);
}
