package com.goods.Services;

import com.goods.Dao.CollectDao;
import com.goods.domain.Collect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollectServiceImp implements CollectService{
    @Autowired
    private CollectDao _collect;
    @Override
    public int insert(Collect collect){
        System.out.println(_collect.find(collect));
        if(_collect.find(collect)!=null) return 0;
        else return _collect.insert(collect);


    }
    @Override
    public int del(String userName){
        return _collect.del(userName);
    }
    @Override
    public List<Collect> findAll(String userName){
        return _collect.findAll(userName);
    }
}
