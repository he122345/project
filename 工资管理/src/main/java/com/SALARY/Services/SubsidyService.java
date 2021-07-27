package com.SALARY.Services;

import com.SALARY.domain.Salary;
import com.SALARY.domain.Subsidy;

import java.util.List;

public interface SubsidyService {
    public int insert(Subsidy subsidy);
    public int update(Subsidy subsidy);
    public int del(int id);
    public Salary findById(int id);
    public List<Salary> findAll();
}
