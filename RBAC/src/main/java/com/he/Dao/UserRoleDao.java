package com.he.Dao;

import com.he.Bean.UserRole;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserRoleDao {
    int insert(UserRole userRole);
    int del(int id);
    int update(UserRole userRole);
    List<UserRole> findById(int id);
    List<UserRole> findAll();
}
