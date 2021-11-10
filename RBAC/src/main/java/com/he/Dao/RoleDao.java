package com.he.Dao;

import com.he.Bean.Role;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RoleDao {
    int insert(Role role);
    int del(int id);
    int update(Role role);
    List<Role> findById(int id);
    List<Role> findAll();
}
