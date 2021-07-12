package com.goods.Controller;

import com.goods.Services.CollectService;
import com.goods.domain.Collect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(allowCredentials = "true",origins = {"*"})
public class CollectController {
    @Autowired
    private CollectService _collect;
    @RequestMapping(value = "insert",method = {RequestMethod.GET})
    int insert(Collect collect){
        System.out.println(collect);
        return _collect.insert(collect);
    }
    @RequestMapping(value = "del",method = {RequestMethod.GET})
    int del(String userName){
        return _collect.del(userName);
    }
    @RequestMapping(value = "findAll",method = {RequestMethod.GET})
    List<Collect> findAll(String userName){
        return _collect.findAll(userName);
    }
}
