package com.sicau.Service;

import com.sicau.domain.User;

import java.util.List;

public interface UserService {
    int insert(User user);
    int del(int id);
    int update(User user);
    List<User> findById(int id);
    List<User> findAll();
    String login(int id);
}
