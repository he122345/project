package com.SALARY.Services;

import com.SALARY.Dao.ShowDao;
import com.SALARY.domain.Show;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShowServiceImp implements ShowService{
    @Autowired
    private ShowDao _show;
    @Override
    public Show findById(int id,int month) {
        return _show.findById(id,month);
    }
    @Override
    public List<Show> findAll(int month) {
        return _show.findAll(month);
    }

    @Override
    public int count() {
        return _show.count();
    }

}
