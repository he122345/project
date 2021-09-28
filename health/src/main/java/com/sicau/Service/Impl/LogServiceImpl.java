package com.sicau.Service.Impl;

import com.sicau.Dao.LogDao;
import com.sicau.Service.LogService;
import com.sicau.domain.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author he
 * @date 2021/8/1
 * @time 11:35
 * @message
 */
@Service
public class LogServiceImpl implements LogService {
    @Autowired
    private LogDao logDao;

    @Override
    public int insert(Log log) {
        return logDao.insert(log);
    }
}
