package com.goods.Services;

import com.goods.Dao.GoodsDao;
import com.goods.domain.Goods;
import com.goods.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GoodsServiceImp implements GoodsService {
    @Autowired
    private GoodsDao _goods;
    @Override
    public int insertGoods(Goods goods){
        return _goods.insertGoods(goods);
    }
    @Override
    public int deleteGoods(int id){
        return _goods.deleteGoods(id);
    }
    @Override
    public int updateGoods(Goods goods){
        return _goods.updateGoods(goods);
    }
    @Override
    public Goods findByIdGoods(int id){
        return _goods.findByIdGoods(id);
    }
    @Override
    public List<Goods> findAllGoods(){
        return _goods.findAllGoods();
    }

}
