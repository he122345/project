package com.sicau.Service.Impl;

import com.sicau.Dao.HealthAdviceDao;
import com.sicau.Service.HealthAdviceService;
import com.sicau.domain.HealthAdvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author he
 * @date 2021/9/26
 * @time 18:46
 * @message
 */
@Service
public class HealthAdviceServiceImpl implements HealthAdviceService {
    @Autowired
    private HealthAdviceDao healthAdviceDao;
    @Override
    public int insert(HealthAdvice healthAdvice) {
        return healthAdviceDao.insert(healthAdvice);
    }

    @Override
    public int del(int id) {
        return healthAdviceDao.del(id);
    }

    @Override
    public int update(HealthAdvice healthAdvice) {
        return healthAdviceDao.update(healthAdvice);
    }

    @Override
    public List<HealthAdvice> findById(int id) {
        return healthAdviceDao.findById(id);
    }

    @Override
    public List<HealthAdvice> findAll() {
        return healthAdviceDao.findAll();
    }
}
