package com.he.Service.Services;

import com.he.Bean.RolePermission;
import com.he.Dao.RolePermissionDao;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * @author he
 * @date 2021/11/4
 * @time 17:15
 * @message
 */
public interface RolePermissionService {
    int insert(RolePermission rolePermission);
    int del(int id);
    int update(RolePermission rolePermission);
    List<RolePermission> findById(int id);
    List<RolePermission> findAll();
}
