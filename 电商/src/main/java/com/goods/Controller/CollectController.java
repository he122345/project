package com.goods.Controller;

import com.goods.Services.CollectService;
import com.goods.domain.Collect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(allowCredentials = "true",origins = {"*"})
public class CollectController {
    @Autowired
    private CollectService _collect;
    @RequestMapping(value = "insert",method = {RequestMethod.GET})
    int insert(Collect collect){
        return _collect.insert(collect);
    }
    @RequestMapping(value = "del",method = {RequestMethod.GET})
    int del(Collect collect){
        return _collect.del(collect);
    }
    @RequestMapping(value = "findAll/{userName}",method = {RequestMethod.GET})
    List<Collect> findAll(@PathVariable String userName){
        return _collect.findAll(userName);
    }
}
