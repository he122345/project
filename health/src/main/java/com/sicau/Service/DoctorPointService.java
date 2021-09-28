package com.sicau.Service;

import com.sicau.domain.DoctorPoint;

import java.util.List;

public interface DoctorPointService {
    int insert(DoctorPoint doctorPoint);
    int del(int id);
    int update(DoctorPoint doctorPoint);
    List<DoctorPoint> findById(int id);
    List<DoctorPoint> findAll();
    DoctorPoint isExist(int id);
}
