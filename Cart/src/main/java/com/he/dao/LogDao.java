package com.he.dao;

import com.he.entity.Log;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author he
 * @date 2021/11/22
 * @time 11:38
 * @message
 */
@Mapper
public interface LogDao {
    int insert(Log log);
}
