package com.SALARY.common;

import com.SALARY.Dao.LogDao;
import com.SALARY.Services.LogService;
import org.apache.shiro.SecurityUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Date;

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
    private LogService logService;
    //定义切入点
    @Pointcut("@annotation(com.SALARY.common.Log)")
    public void pointcut(){

    }


    //处理完成之后执行
    @AfterReturning(pointcut = "pointcut()",returning = "resultData")
    public void afterExecute(final JoinPoint joinPoint,Object resultData){
        //获得注解
        Signature signature=joinPoint.getSignature();
        MethodSignature methodSignature=(MethodSignature) signature;
        Method method=methodSignature.getMethod();
        Log log=method.getAnnotation(Log.class);
        //完善要插入数据库的对象
        com.SALARY.domain.Log dbLog=new com.SALARY.domain.Log();
        //id
        dbLog.setLog_id(String.valueOf(Math.random()));
        //日志类型
        dbLog.setLog_type(log.type());
        //日志信息
        dbLog.setLog_msg(log.msg()+"内容:"+ Arrays.toString(joinPoint.getArgs()));
        //日志产生时间
        Date date=new Date();
        dbLog.setLog_time(date);
        //谁产生的日志
        String user="未知";
        dbLog.setLog_user(user);
        //插入数据库
        logService.insert(dbLog);
    }
//    //抛出异常后
//    @AfterThrowing(pointcut = "pointcut()",throwing = "e")
//    public void afterThrowing(JoinPoint joinPoint,Exception e){
//        //获得注解
//        Signature signature=joinPoint.getSignature();
//        MethodSignature methodSignature=(MethodSignature) signature;
//        Method method=methodSignature.getMethod();
//        Log log=method.getAnnotation(Log.class);
//    }

}
