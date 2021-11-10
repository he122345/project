package com.he.Dao;


import com.he.Bean.RolePermission;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RolePermissionDao {
    int insert(RolePermission rolePermission);
    int del(int id);
    int update(RolePermission rolePermission);
    List<RolePermission> findById(int id);
    List<RolePermission> findAll();
}
