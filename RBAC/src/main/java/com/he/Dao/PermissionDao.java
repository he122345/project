package com.he.Dao;

import com.he.Bean.Permission;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PermissionDao {
    int insert(Permission permission);
    int del(int id);
    int update(Permission permission);
    List<Permission> findById(int id);
    List<Permission> findAll();
}
