package com.SALARY.Controller;

import com.SALARY.Services.ShowService;
import com.SALARY.domain.Show;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("show")
@CrossOrigin(allowCredentials = "true",origins = {"*"})
public class ShowController {
    @Autowired
    private ShowService _show;
    @RequestMapping(value = "findById/{month}/{id}",method = {RequestMethod.GET})
    public List<Show> findById(@PathVariable int month,@PathVariable int id,int page,int limit) {
        List<Show> list=new ArrayList<Show>();
        System.out.println(month+","+id+","+page+","+limit);
        if(_show.findById(month,id,page,limit)!=null){
            list.add(_show.findById(month,id,page,limit));
        }
        else {
            list.add(new Show());
        }
        return list;
    }
    @RequestMapping(value = "findAll/{month}",method = {RequestMethod.GET})
    public List<Show> findAll(@PathVariable int month,int page,int limit) {
        return _show.findAll(month,page,limit);
    }
    @RequestMapping(value = "count",method = {RequestMethod.GET})
    public int count(){
        return _show.count();
    }
}
