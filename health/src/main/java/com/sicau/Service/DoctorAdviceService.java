package com.sicau.Service;

import com.sicau.domain.Doctor;

import java.util.List;

public interface DoctorAdviceService {
    int insert(Doctor doctor);
    int del(int id);
    int update(Doctor doctor);
    List<Doctor> findById(int id);
    List<Doctor> findAll();
    Double point(int id);
}
