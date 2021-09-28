package com.sicau.Dao;

import com.sicau.domain.Log;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface LogDao {
    public int insert(Log log);
}
