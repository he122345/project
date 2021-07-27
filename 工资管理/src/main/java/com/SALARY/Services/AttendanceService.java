package com.SALARY.Services;

import com.SALARY.domain.Attendance;

import java.util.List;

public interface AttendanceService {
    public int insert(Attendance attendance);
    public int del(int id);
    public int update(Attendance attendance);
    public List<Attendance> findAll();
    public Attendance findById(int id);
}
