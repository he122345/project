package com.sicau.Dao;


import com.sicau.domain.DoctorPoint;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface DoctorPointDao {
    int insert(DoctorPoint doctorPoint);
    int del(int id);
    int update(DoctorPoint doctorPoint);
    List<DoctorPoint> findById(int id);
    List<DoctorPoint> findAll();
    DoctorPoint isExist(int id);
}
