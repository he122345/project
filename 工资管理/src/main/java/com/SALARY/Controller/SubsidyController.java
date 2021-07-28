package com.SALARY.Controller;

import com.SALARY.Services.SubsidyService;
import com.SALARY.domain.Salary;
import com.SALARY.domain.Subsidy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("subsidy")
@CrossOrigin(allowCredentials = "true",origins = {"*"})
public class SubsidyController {
    @Autowired
    private SubsidyService _subsidy;
    @RequestMapping(value = "insert",method = {RequestMethod.GET})
    public int insert(Subsidy subsidy) {
        return _subsidy.insert(subsidy);
    }
    @RequestMapping(value = "update",method = {RequestMethod.GET})
    public int update(Subsidy subsidy) {
        return _subsidy.update(subsidy);
    }

    @RequestMapping(value = "del/{id}",method = {RequestMethod.GET})
    public int del(@PathVariable int id) {
        return _subsidy.del(id);
    }

    @RequestMapping(value = "findById",method = {RequestMethod.GET})
    public List<Salary> findById(int id) {
        List<Salary> list=new ArrayList<Salary>();
        list.add(_subsidy.findById(id));
        return list;
    }

    @RequestMapping(value = "findAll",method = {RequestMethod.GET})
    public List<Salary> findAll() {
        return _subsidy.findAll();
    }
}
