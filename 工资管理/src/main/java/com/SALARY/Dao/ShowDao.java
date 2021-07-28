package com.SALARY.Dao;

import com.SALARY.domain.Show;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface ShowDao {
    public Show findById(@Param("month") int month,@Param("id") int id, @Param("page") int page, @Param("limit") int limit);
    public List<Show> findAll(int month,int page,int limit);
    public int count();
}
