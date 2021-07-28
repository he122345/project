package com.SALARY.Controller;

import com.SALARY.Services.TypeService;
import com.SALARY.domain.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("type")
@CrossOrigin(allowCredentials = "true",origins = {"*"})
public class TypeController {
    @Autowired
    private TypeService _type;
    @RequestMapping(value = "insert",method = {RequestMethod.GET})
    public int insert(Type type) {
        return _type.insert(type);
    }
    @RequestMapping(value = "update",method = {RequestMethod.GET})
    public int update(Type type) {
        return _type.update(type);
    }

    @RequestMapping(value = "del/{id}",method = {RequestMethod.GET})
    public int del(@PathVariable int id) {
        return _type.del(id);
    }

    @RequestMapping(value = "findById",method = {RequestMethod.GET})
    public List<Type> findById(int id) {
        List<Type> list=new ArrayList<Type>();
        list.add(_type.findById(id));
        return list;
    }

    @RequestMapping(value = "findAll",method = {RequestMethod.GET})
    public List<Type> findAll() {
        return _type.findAll();
    }
}
