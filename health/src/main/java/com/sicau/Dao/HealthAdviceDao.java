package com.sicau.Dao;

import com.sicau.domain.HealthAdvice;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author he
 * @date 2021/9/26
 * @time 18:42
 * @message
 */
@Mapper
public interface HealthAdviceDao {
    int insert(HealthAdvice healthAdvice);
    int del(int id);
    int update(HealthAdvice healthAdvice);
    List<HealthAdvice> findById(int id);
    List<HealthAdvice> findAll();
}
