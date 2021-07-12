package com.goods.Services;

import com.goods.Dao.UserDao;
import com.goods.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService{
    @Autowired
    private UserDao _user;
    @Override
    public int login(User user){
        if(user.equals(_user.login(user.getUserName()))) return 1;
        else return 0;
    }

}
