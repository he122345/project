package com.SALARY.Services;

import com.SALARY.domain.Salary;

import java.util.List;

public interface SalaryService {
    public int insert(Salary salary);
    public int del(int id);
    public int update(Salary salary);
    public Salary findById(int id);
    public List<Salary> findAll();
}
