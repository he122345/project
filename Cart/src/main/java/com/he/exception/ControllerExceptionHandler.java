package com.he.exception;

import com.he.Response.ResultBean;
import com.he.Response.ResultEnum;
import com.he.dao.LogDao;
import com.he.log.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.UUID;


/**
 * @author he
 * @date 2021/11/21
 * @time 17:23
 * @message
 */
@ControllerAdvice
@RestController
public class ControllerExceptionHandler{
    @Autowired
    private LogDao logDao;
    @Log(type = "LogException")
    @ExceptionHandler(LogException.class)
    public ResultBean logException(LogException logException){
        return ResultBean.fail().setLogException(logException);
    }
    @ExceptionHandler(Exception.class)
    public ResultBean exception(Exception exception){
        // 完善要插入数据库的对象
        com.he.entity.Log log=new com.he.entity.Log();
        // id
        log.setId(UUID.randomUUID().toString().replaceAll("-",""));
        // 异常类型
        log.setType(exception.getClass().toString());
        // 异常code
        log.setCode(-1);
        // 异常信息
        log.setMessage(exception.getMessage());
        // 产生时间
        log.setTime(LocalDateTime.now().toString());
        logDao.insert(log);
        return ResultBean.fail().setResultEnum(ResultEnum.System_Error);
    }
}
