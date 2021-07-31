package com.SALARY.Services;

import com.SALARY.Dao.TypeDao;
import com.SALARY.domain.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeServiceImp implements TypeService{
    @Autowired
    private TypeDao _type;
    @Override
    public int insert(Type type) {
        //基本工资限定
        if(type.getBasic_salary()>100000||type.getBasic_salary()<0){
            return -1;
        }
        return _type.insert(type);
    }
    @Override
    public int update(Type type) {
        return _type.update(type);
    }

    @Override
    public int del(int id) {
        return _type.del(id);
    }

    @Override
    public Type findById(int id) {
        return _type.findById(id);
    }

    @Override
    public List<Type> findAll() {
        return _type.findAll();
    }
}
