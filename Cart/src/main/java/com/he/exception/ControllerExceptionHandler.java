package com.he.exception;

import com.he.Response.ResultBean;
import org.springframework.dao.DataAccessException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author he
 * @date 2021/11/21
 * @time 17:23
 * @message
 */
@ControllerAdvice
@RestController
public class ControllerExceptionHandler{
    @ExceptionHandler(DataAccessException.class)
    public ResultBean dataAccessException(DataAccessException dataAccessException){
        return ResultBean.fail().setMsg(dataAccessException.getCause().toString());
    }
    @ExceptionHandler(Exception.class)
    public ResultBean exception(Exception exception){
        return ResultBean.fail().setMsg(exception.getMessage());
    }
}
