package com.SALARY.Dao;

import com.SALARY.domain.Attendance;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AttendanceDao {
    public int insert(Attendance attendance);
    public int del(int id);
    public int update(Attendance attendance);
    public List<Attendance> findAll();
    public Attendance findById(int id);
}
