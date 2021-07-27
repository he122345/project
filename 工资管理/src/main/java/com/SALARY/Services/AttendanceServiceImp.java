package com.SALARY.Services;

import com.SALARY.Dao.AttendanceDao;
import com.SALARY.domain.Attendance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttendanceServiceImp implements AttendanceService {
    @Autowired
    private AttendanceDao _attendance;
    @Override
    public int insert(Attendance attendance) {
        return _attendance.insert(attendance);
    }

    @Override
    public int del(int id) {
        return _attendance.del(id);
    }

    @Override
    public int update(Attendance attendance) {
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
