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
    public Show findById(int month,int id,int page,int limit) {
        return _show.findById(month,id,page,limit);
    }
    @Override
    public List<Show> findAll(int month,int page,int limit) {
        if(page!=0&& limit!=0) {
            return _show.findAll(month,(page-1)*limit,limit);
        }
        return _show.findAll(month,0,0);
    }

    @Override
    public int count() {
        return _show.count();
    }

}
