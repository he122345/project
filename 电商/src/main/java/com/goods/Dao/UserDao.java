package com.goods.Dao;

import com.goods.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {
    User login(String UserName);
}
