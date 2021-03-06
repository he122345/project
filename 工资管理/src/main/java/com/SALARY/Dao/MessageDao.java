package com.SALARY.Dao;

import com.SALARY.domain.Message;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MessageDao {
    public int insert(Message message);
    public int del(int id);
    public int update(Message message);
    public Message findById(int id);
    public List<Message> findAll();
}
