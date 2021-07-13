package com.goods.Services;

import com.goods.domain.Goods;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface GoodsService {
    int insertGoods(Goods goods);
    int deleteGoods(int id);
    int updateGoods(Goods goods);
    Goods findByIdGoods(int id);
    List<Goods> findAllGoods(int page,int limit);
    int count();
}
