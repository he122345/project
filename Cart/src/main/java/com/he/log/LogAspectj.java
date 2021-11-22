package com.he.log;

import com.he.response.ResultBean;
import com.he.dao.LogDao;
import com.he.exception.LogException;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.time.LocalDateTime;
import java.util.UUID;

/**
 * @author he
 * @date 2021/8/1
 * @time 10:23
 * @message
 */
@Aspect
@Component
public class LogAspectj {
    @Autowired
    private LogDao logDao;
    /**
     * 定义切入点
     */
    @Pointcut("@annotation(com.he.log.Log)")
    public void pointcut(){}

    /**
     * 方法执行后
     */
    @AfterReturning(pointcut = "pointcut()",returning = "resultData")
    public void afterExecute(final JoinPoint joinPoint, ResultBean resultData) {
        // 获得注解
        Signature signature = joinPoint.getSignature();
        MethodSignature methodSignature = (MethodSignature) signature;
        Method method = methodSignature.getMethod();
        Log log = method.getAnnotation(Log.class);
        // 完善要插入数据库的对象
        com.he.entity.Log dbLog = new com.he.entity.Log();
        // id
        dbLog.setId(UUID.randomUUID().toString().replaceAll("-",""));
        // 异常类型
        dbLog.setType(log.type());
        // 异常code
        dbLog.setCode(((LogException) joinPoint.getArgs()[0]).getCode());
        // 异常信息
        dbLog.setMessage(((LogException) joinPoint.getArgs()[0]).getMessage());
        // 产生时间
        dbLog.setTime(LocalDateTime.now().toString());
        logDao.insert(dbLog);
    }

    /*
    // 抛出异常后
    @AfterThrowing(pointcut = "pointcut()",throwing = "e")
    public void afterThrowing(JoinPoint joinPoint,Exception e){
        //获得注解
        Signature signature=joinPoint.getSignature();
        MethodSignature methodSignature=(MethodSignature) signature;
        Method method=methodSignature.getMethod();
        Log log=method.getAnnotation(Log.class);
        // 完善要插入数据库的对象
        com.he.entity.Log dbLog = new com.he.entity.Log();
        // id
        dbLog.setId(UUID.randomUUID().toString().replaceAll("-",""));
        // 异常类型
        dbLog.setType(e.getClass().toString());
        // 异常code
        dbLog.setCode(-1);
        // 异常信息
        dbLog.setMessage(e.getMessage());
        // 产生时间
        dbLog.setTime(LocalDateTime.now().toString());
        logDao.insert(dbLog);
    }
    */

}
