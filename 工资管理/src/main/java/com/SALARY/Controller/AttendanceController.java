package com.SALARY.Controller;

import com.SALARY.Services.AttendanceService;
import com.SALARY.domain.Attendance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("attendance")
@CrossOrigin(allowCredentials = "true",origins = {"*"})
public class AttendanceController {
    @Autowired
    private AttendanceService _attendance;
    @RequestMapping(value = "insert",method = {RequestMethod.GET})
    public int insert(Attendance attendance) {
        return _attendance.insert(attendance);
    }
    @RequestMapping(value = "del",method = {RequestMethod.GET})
    public int del(int id) {
        return _attendance.del(id);
    }
    @RequestMapping(value = "update",method = {RequestMethod.GET})
    public int update(Attendance attendance) {
        return _attendance.update(attendance);
    }
    @RequestMapping(value = "findAll",method = {RequestMethod.GET})
    public List<Attendance> findAll() {
        return _attendance.findAll();
    }
    @RequestMapping(value = "findById",method = {RequestMethod.GET})
    public List<Attendance> findById(int id) {
        List<Attendance> list=new ArrayList<Attendance>();
        list.add(_attendance.findById(id));
        return list;
    }
}
