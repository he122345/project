package com.SALARY.Services;

import com.SALARY.Dao.AttendanceDao;
import com.SALARY.domain.Attendance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.regex.Pattern;

@Service
public class AttendanceServiceImp implements AttendanceService {
    @Autowired
    private AttendanceDao _attendance;
    @Override
    public int insert(Attendance attendance) {
        //attendance应为0-31,未根据月份区分天数
        if(attendance.getDays()<0||attendance.getDays()>31){
            System.out.println(1);
            return -1;
        };
        //month应为1-12
        if(attendance.getMonth()<=0||attendance.getMonth()>12){
            System.out.println(1);
            return -1;
        };
        System.out.println(2);
        return _attendance.insert(attendance);
    }

    @Override
    public int del(int id) {
        return _attendance.del(id);
    }

    @Override
    public int update(Attendance attendance) {
        //attendance应为0-31,未根据月份区分天数
        if(attendance.getDays()<0||attendance.getDays()>31){return -1;};
        //month应为1-12
        if(attendance.getMonth()<=0||attendance.getMonth()>12){return -1;};
        return _attendance.update(attendance);
    }

    @Override
    public List<Attendance> findAll() {
        return _attendance.findAll();
    }

    @Override
    public Attendance findById(int id) {
        return _attendance.findById(id);
    }
}
