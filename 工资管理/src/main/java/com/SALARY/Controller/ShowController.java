package com.SALARY.Controller;

import com.SALARY.Services.ShowService;
import com.SALARY.domain.Show;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("show")
@CrossOrigin(allowCredentials = "true",origins = {"*"})
public class ShowController {
    @Autowired
    private ShowService _show;
    @RequestMapping(value = "findById",method = {RequestMethod.GET})
    public Show findById(int id,int month) {
        return _show.findById(id,month);
    }
    @RequestMapping(value = "findAll",method = {RequestMethod.GET})
    public List<Show> findAll(int page,int limit) {
        System.out.println(page+","+limit);
        return _show.findAll(1);
    }
    @RequestMapping(value = "count",method = {RequestMethod.GET})
    public int count(){
        return _show.count();
    }
}
