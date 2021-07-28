package com.SALARY.Services;

import com.SALARY.domain.Show;

import java.util.List;

public interface ShowService {
    public Show findById(int month,int id,int page,int limit);
    public List<Show> findAll(int month,int page,int limit);
    public int count();
}
