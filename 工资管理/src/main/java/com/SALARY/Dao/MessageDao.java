package com.SALARY.Dao;

import com.SALARY.domain.Message;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MessageDao {
    public int insert(Message message);
    public int del(int id);
    public int update(Message message);
}
