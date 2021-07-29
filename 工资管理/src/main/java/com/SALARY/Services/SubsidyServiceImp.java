package com.SALARY.Services;

import com.SALARY.Dao.SubsidyDao;
import com.SALARY.domain.Subsidy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubsidyServiceImp implements SubsidyService{
    @Autowired
    private SubsidyDao _subsidy;
    @Override
    public int insert(Subsidy subsidy) {
        return _subsidy.insert(subsidy);
    }

    @Override
    public int update(Subsidy subsidy) {

        return _subsidy.update(subsidy);
    }

    @Override
    public int del(int id) {
        return _subsidy.del(id);
    }

    @Override
    public Subsidy findById(int id) {
        return _subsidy.findById(id);
    }

    @Override
    public List<Subsidy> findAll() {
        return _subsidy.findAll();
    }
}
