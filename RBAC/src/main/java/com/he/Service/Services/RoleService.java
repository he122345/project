package com.he.Service.Services;

import com.he.Bean.Role;
import com.he.Dao.RoleDao;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * @author he
 * @date 2021/11/4
 * @time 17:15
 * @message
 */
public interface RoleService {
    int insert(Role role);
    int del(int id);
    int update(Role role);
    List<Role> findById(int id);
    List<Role> findAll();
}
