package com.SALARY.Services;

import com.SALARY.domain.Message;

import java.util.List;

public interface MessageServicce {
    public int insert(Message message);
    public int del(int id);
    public int update(Message message);
    public Message findById(int id);
    public List<Message> findAll();
}
