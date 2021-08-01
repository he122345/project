package com.SALARY.Dao;

import com.SALARY.domain.Log;

import org.apache.ibatis.annotations.Mapper;



@Mapper
public interface LogDao {
    public int insert(Log log);
}
