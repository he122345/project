package com.SALARY.Controller;

import com.SALARY.Services.MessageServicce;
import com.SALARY.domain.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("message")
@CrossOrigin(allowCredentials = "true",origins = {"*"})
public class MessageController {
    @Autowired
    private MessageServicce _message;
    @RequestMapping(value = "insert",method = {RequestMethod.POST})
    public int insert(Message message) {
        return _message.insert(message);
    }
    @RequestMapping(value = "del",method = {RequestMethod.GET})
    public int del(int id) {
        return _message.del(id);
    }
    @RequestMapping(value = "update",method = {RequestMethod.POST})
    public int update(Message message) {
        return _message.update(message);
    }
    @RequestMapping(value = "findById",method = {RequestMethod.GET})
    public List<Message> findById(int id) {
        List<Message> list=new ArrayList<Message>();
        list.add(_message.findById(id));
        return list;
    }

    @RequestMapping(value = "findAll",method = {RequestMethod.GET})
    public List<Message> findAll() {
        return _message.findAll();
    }
}
