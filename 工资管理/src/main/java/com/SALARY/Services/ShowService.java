package com.SALARY.Services;

import com.SALARY.domain.Show;

import java.util.List;

public interface ShowService {
    public Show findById(int id,int month);
    public List<Show> findAll(int month);
    public int count();
}
