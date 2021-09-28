package com.sicau.Dao;


import com.sicau.domain.Doctor;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DoctorAdviceDao {
    int insert(Doctor doctor);
    int del(int id);
    int update(Doctor doctor);
    List<Doctor> findById(int id);
    List<Doctor> findAll();
    Double point(int id);
}
