package com.SALARY.Services;

import com.SALARY.Dao.MessageDao;
import com.SALARY.domain.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServiceImp implements MessageServicce{
    @Autowired
    private MessageDao _message;
    @Override
    public int insert(Message message) {
        return _message.insert(message);
    }

    @Override
    public int del(int id) {
        return _message.del(id);
    }

    @Override
    public int update(Message message) {
        return _message.update(message);
    }

    @Override
    public Message findById(int id) {
        return _message.findById(id);
    }

    @Override
    public List<Message> findAll() {
        return _message.findAll();
    }
}
