package com.SALARY.Dao;

import com.SALARY.domain.Type;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TypeDao {
    public int insert(Type type);
    public int update(Type type);
    public int del(int id);
    public Type findById(int id);
    public List<Type> findAll();
}
