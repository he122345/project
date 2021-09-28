package com.sicau.Service.Impl;

import com.sicau.Dao.DoctorPointDao;
import com.sicau.Service.DoctorPointService;
import com.sicau.domain.DoctorPoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author he
 * @date 2021/9/26
 * @time 17:31
 * @message
 */
@Service
public class DoctorPointServiceImpl implements DoctorPointService {
    @Autowired
    private DoctorPointDao doctorPointDao;

    @Override
    public int insert(DoctorPoint doctorPoint) {
        return doctorPointDao.insert(doctorPoint);
    }

    @Override
    public int del(int id) {
        return doctorPointDao.del(id);
    }

    @Override
    public int update(DoctorPoint doctorPoint) {
        return doctorPointDao.update(doctorPoint);
    }

    @Override
    public List<DoctorPoint> findById(int id) {
        return doctorPointDao.findById(id);
    }

    @Override
    public List<DoctorPoint> findAll() {
        return doctorPointDao.findAll();
    }
    @Override
    public DoctorPoint isExist(int id){
        return doctorPointDao.isExist(id);
    }

}
