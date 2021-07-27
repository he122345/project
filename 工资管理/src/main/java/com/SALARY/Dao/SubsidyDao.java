package com.SALARY.Dao;

import com.SALARY.domain.Salary;
import com.SALARY.domain.Subsidy;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SubsidyDao {
    public int insert(Subsidy subsidy);
    public int update(Subsidy subsidy);
    public int del(int id);
    public Salary findById(int id);
    public List<Salary> findAll();
}
