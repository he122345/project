package com.SALARY.Dao;

import com.SALARY.domain.Salary;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SalaryDao {
    public int insert(Salary salary);
    public int del(int id);
    public int update(Salary salary);
    public Salary findById(int id);
    public List<Salary> findAll();
}
