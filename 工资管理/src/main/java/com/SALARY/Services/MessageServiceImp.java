package com.SALARY.Services;

import com.SALARY.Dao.MessageDao;
import com.SALARY.domain.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class MessageServiceImp implements MessageServicce{
    @Autowired
    private MessageDao _message;
    @Override
    public int insert(Message message) {
        String pattern="(\\d{11})|(\\d{0})";
        Pattern r=Pattern.compile(pattern);
        boolean isMatch=Pattern.matches(pattern,message.getPhone());
        //查询编号是否已经存在
        if(_message.findById(message.getId())!=null){
            return 0;
        }
        //检查编号是否合法
        else if(message.getId()>=99999&&message.getId()<=0){
            return 0;
        }
        //检查年龄是否合法
        else if(message.getAge()>=100&&message.getAge()<=0){
            return 0;
        }
        //检查电话号码是否合法
        else if (!isMatch){
            return 0;
        }
        //不合法
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
