package com.he.Service.Services;

import com.he.Bean.Permission;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * @author he
 * @date 2021/11/4
 * @time 17:15
 * @message
 */
public interface PermissionService {
    int insert(Permission permission);
    int del(int id);
    int update(Permission permission);
    List<Permission> findById(int id);
    List<Permission> findAll();
}
