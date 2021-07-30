package com.SALARY.Controller;

import com.SALARY.Services.AttendanceService;
import com.SALARY.domain.Attendance;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("attendance")
@CrossOrigin(allowCredentials = "true",origins = {"*"})
@Api(tags="活跃度")
public class AttendanceController {
    @Autowired
    private AttendanceService _attendance;
    @ApiOperation(value = "插入活跃度",notes = "描述")
    @RequestMapping(value = "insert",method = {RequestMethod.GET})
    public int insert(Attendance attendance) {
        return _attendance.insert(attendance);
    }
    @ApiOperation(value = "删除活跃度",notes = "描述")
    @RequestMapping(value = "del/{id}",method = {RequestMethod.GET})
    public int del(@PathVariable int id) {
        return _attendance.del(id);
    }
    @ApiOperation(value = "更新活跃度",notes = "描述")
    @RequestMapping(value = "update",method = {RequestMethod.GET})
    public int update(Attendance attendance) {
        return _attendance.update(attendance);
    }
    @ApiOperation(value = "寻找所有",notes = "描述")
    @RequestMapping(value = "findAll",method = {RequestMethod.GET})
    public List<Attendance> findAll() {
        return _attendance.findAll();
    }
    @ApiOperation(value = "通过ID查找",notes = "描述")
    @RequestMapping(value = "findById",method = {RequestMethod.GET})
    public List<Attendance> findById(int id) {
        List<Attendance> list=new ArrayList<Attendance>();
        list.add(_attendance.findById(id));
        return list;
    }
}
