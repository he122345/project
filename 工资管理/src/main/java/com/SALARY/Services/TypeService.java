package com.SALARY.Services;

import com.SALARY.domain.Type;

import java.util.List;

public interface TypeService {
    public int insert(Type type);
    public int update(Type type);
    public int del(int id);
    public Type findById(int id);
    public List<Type> findAll();
}
