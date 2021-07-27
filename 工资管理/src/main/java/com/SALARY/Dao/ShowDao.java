package com.SALARY.Dao;

import com.SALARY.domain.Show;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ShowDao {
    public Show findById(int id,int month);
    public List<Show> findAll(int month);
    public int count();
}
