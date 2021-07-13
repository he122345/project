package com.goods.Dao;

import com.goods.domain.Goods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface GoodsDao {
    int insertGoods(Goods goods);
    int deleteGoods(int id);
    int updateGoods(Goods goods);
    Goods findByIdGoods(int id);
    List<Goods> findAllGoods(int start,int mount);
    int count();
}
