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
        if(_goods.findByIdGoods(goods.getId())!=null) return 0;
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
        if(_goods.findByIdGoods(id)==null){
            return new Goods(0,"不存在",0,"不存在");}
        return _goods.findByIdGoods(id);
    }
    @Override
    public List<Goods> findAllGoods(int page,int limit){
        if(page!=0&& limit!=0) return _goods.findAllGoods((page-1)*limit,limit);
        return _goods.findAllGoods(0,0);
    }
    @Override
    public int count(){
        return _goods.count();
    }

}
