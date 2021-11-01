package com.sicau.Service.Impl;

import com.sicau.Service.DoctorAdviceService;
import com.sicau.domain.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @author he
 * @date 2021/9/26
 * @time 14:35
 * @message
 */
@Service
public class DoctorAdviceServiceImpl implements DoctorAdviceService {
    @Autowired
    private com.sicau.Dao.DoctorAdviceDao doctorAdviceDao;

    @Override
    public int insert(Doctor doctor) {
        return doctorAdviceDao.insert(doctor);
    }

    @Override
    public int del(int id) {
        return doctorAdviceDao.del(id);
    }

    @Override
    public int update(Doctor doctor) {
        return doctorAdviceDao.update(doctor);
    }

    @Override
    public List<Doctor> findById(int id) {
        List<Doctor> list=doctorAdviceDao.findById(id);
        if (list.size()==0){
            return list;
        }
        Doctor doctor=list.get(0);
        if (doctorAdviceDao.point(id)==null){
            return list;
        }
        doctor.setPoint(doctorAdviceDao.point(id));

        return list;
    }

    @Override
    public List<Doctor> findAll() {
        List<Doctor> list=doctorAdviceDao.findAll();
        if (list.size()==0){
            return list;
        }
        for (Doctor doctor:list){
            if (doctorAdviceDao.point(doctor.getId())==null){
                continue;
            }
            doctor.setPoint(doctorAdviceDao.point(doctor.getId()));
        }
        list.sort(new Comparator<Doctor>() {
            @Override
            public int compare(Doctor o2, Doctor o1) {
                if (o1.getDepartment().equals(o2.getDepartment())) {
                    double a = o1.getPoint() - o2.getPoint();
                    return a > 0 ? 1 : -1;
                }
                return -1;
            }
        });
        return list;
    }

    @Override
    public Double point(int id){
        return doctorAdviceDao.point(id);
    }
}
