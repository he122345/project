package com.SALARY.Controller;

import com.SALARY.Services.SalaryService;
import com.SALARY.common.Log;
import com.SALARY.domain.Salary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("salary")
@CrossOrigin(allowCredentials = "true",origins = {"*"})
public class SalaryController {
    @Autowired
    private SalaryService _salary;

    @RequestMapping(value = "insert",method = {RequestMethod.GET})
    @Log(type = 32,msg = "插入月工资")
    public int insert(Salary salary) {
        return _salary.insert(salary);
    }
    @RequestMapping(value = "update",method = {RequestMethod.GET})
    @Log(type = 42,msg = "更新月工资")
    public int update(Salary salary) {

        return _salary.update(salary);
    }
    @RequestMapping(value = "del/{id}",method = {RequestMethod.GET})
    @Log(type = 52,msg = "删除月工资")
    public int del(@PathVariable int id) {
        return _salary.del(id);
    }
    @RequestMapping(value = "findById",method = {RequestMethod.GET})
    public List<Salary> findById(int id,int month) {
        List<Salary> list=new ArrayList<Salary>();
        if(_salary.findById(id,month)==null){list.add(new Salary());}
        else {
            list.add(_salary.findById(id,month));
        }
        return list;
    }
    @RequestMapping(value = "findAll",method = {RequestMethod.GET})
    public List<Salary> findAll() {
        return _salary.findAll();
    }
}
