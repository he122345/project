package com.SALARY.Services;

import com.SALARY.Dao.SalaryDao;
import com.SALARY.domain.Salary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaryServiceImp implements SalaryService{
    @Autowired
    private SalaryDao _salary;
    @Override
    public int insert(Salary salary) {
        return _salary.insert(salary);
    }

    @Override
    public int del(int id) {
        return _salary.del(id);
    }

    @Override
    public int update(Salary salary) {
        return _salary.update(salary);
    }

    @Override
    public Salary findById(int id) {
        return _salary.findById(id);
    }

    @Override
    public List<Salary> findAll() {
        return _salary.findAll();
    }
}
