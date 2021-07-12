package com.goods.Services;

import com.goods.domain.Collect;


import java.util.List;


public interface CollectService {
    int insert(Collect collect);
    int del(String userName);
    List<Collect> findAll(String userName);
}
