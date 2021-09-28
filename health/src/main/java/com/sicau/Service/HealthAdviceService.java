package com.sicau.Service;

import com.sicau.domain.HealthAdvice;

import java.util.List;

public interface HealthAdviceService {
    int insert(HealthAdvice healthAdvice);
    int del(int id);
    int update(HealthAdvice healthAdvice);
    List<HealthAdvice> findById(int id);
    List<HealthAdvice> findAll();
}
