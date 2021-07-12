package com.goods.Services;

import com.goods.domain.Goods;

import java.util.List;

public interface GoodsService {
    int insertGoods(Goods goods);
    int deleteGoods(int id);
    int updateGoods(Goods goods);
    Goods findByIdGoods(int id);
    List<Goods> findAllGoods();
}
