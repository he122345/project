package com.goods.Dao;

import com.goods.domain.Collect;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CollectDao {
    int insert(Collect collect);
    int del(String userName);
    List<Collect> findAll(String userName);
    Collect find(Collect collect);
}
