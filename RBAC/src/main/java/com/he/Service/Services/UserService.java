package com.he.Service.Services;

import com.he.Bean.User;
import com.he.Dao.UserDao;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * @author he
 * @date 2021/11/4
 * @time 17:15
 * @message
 */
public interface UserService {
    int insert(User user);
    int del(int id);
    int update(User user);
    List<User> findById(int id);
    List<User> findAll();
}
