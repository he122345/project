package com.goods.Services;

import com.goods.domain.Collect;


import java.util.List;


public interface CollectService {
    int insert(Collect collect);
    int del(Collect collect);
    List<Collect> findAll(String userName);
}
