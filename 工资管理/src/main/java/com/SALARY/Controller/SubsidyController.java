package com.SALARY.Controller;

import com.SALARY.Services.SubsidyService;
import com.SALARY.common.Log;
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
    @Log(type = 34,msg = "插入津贴")
    public int insert(Subsidy subsidy) {
        return _subsidy.insert(subsidy);
    }
    @RequestMapping(value = "update",method = {RequestMethod.GET})
    @Log(type = 44,msg = "更新津贴")
    public int update(Subsidy subsidy) {
        return _subsidy.update(subsidy);
    }

    @RequestMapping(value = "del/{id}",method = {RequestMethod.GET})
    @Log(type = 54,msg = "删除津贴")
    public int del(@PathVariable int id) {
        return _subsidy.del(id);
    }

    @RequestMapping(value = "findById",method = {RequestMethod.GET})
    public List<Subsidy> findById(int id) {
        List<Subsidy> list=new ArrayList<Subsidy>();
        list.add(_subsidy.findById(id));
        return list;
    }

    @RequestMapping(value = "findAll",method = {RequestMethod.GET})
    public List<Subsidy> findAll() {
        return _subsidy.findAll();
    }
}
