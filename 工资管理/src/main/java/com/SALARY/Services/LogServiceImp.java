package com.SALARY.Services;

import com.SALARY.Dao.LogDao;
import com.SALARY.domain.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author he
 * @date 2021/8/1
 * @time 11:35
 * @message
 */
@Service
public class LogServiceImp implements LogService{

    @Autowired
    private LogDao _logDao;
    @Override
    public int insert(Log log){
        return _logDao.insert(log);
    }
}
