package com.SALARY.Dao;

import com.SALARY.domain.Salary;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SalaryDao {
    public int insert(Salary salary);
    public int del(int id);
    public int update(Salary salary);
    public Salary findById(@Param("id") int id,@Param("month") int month);
    public List<Salary> findAll();
}
