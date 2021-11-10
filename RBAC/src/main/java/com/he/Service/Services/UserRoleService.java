package com.he.Service.Services;

import com.he.Bean.UserRole;
import com.he.Dao.UserDao;
import com.he.Dao.UserRoleDao;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * @author he
 * @date 2021/11/4
 * @time 17:15
 * @message
 */
public interface UserRoleService {
    int insert(UserRole userRole);
    int del(int id);
    int update(UserRole userRole);
    List<UserRole> findById(int id);
    List<UserRole> findAll();
}
