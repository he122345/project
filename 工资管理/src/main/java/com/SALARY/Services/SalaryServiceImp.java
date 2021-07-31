package com.SALARY.Services;

import com.SALARY.Dao.AttendanceDao;
import com.SALARY.Dao.SalaryDao;
import com.SALARY.Dao.SubsidyDao;
import com.SALARY.Dao.TypeDao;
import com.SALARY.domain.Attendance;
import com.SALARY.domain.Salary;
import com.SALARY.domain.Subsidy;
import com.SALARY.domain.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaryServiceImp implements SalaryService{
    @Autowired
    private SalaryDao _salary;
    private SubsidyDao _subsidy;
    private TypeDao _type;
    private AttendanceDao _attendance;
    @Override
    public int insert(Salary salary) {
        //工资不为负数
        if (salary.getSalary()<0){
            salary.setSalary(0);
        }
        return _salary.insert(salary);
    }

    @Override
    public int del(int id) {
        return _salary.del(id);
    }

    @Override
    public int update(Salary salary) {
        //工资不为负数
        if (salary.getSalary()<0){
            salary.setSalary(0);
        }
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
