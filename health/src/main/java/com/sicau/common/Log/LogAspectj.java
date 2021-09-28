package com.sicau.common.Log;

import com.sicau.Dao.UserDao;
import com.sicau.Service.Impl.UserServiceImpl;
import com.sicau.Service.LogService;
import com.sicau.Service.UserService;
import com.sicau.common.Response.ResultBean;
import com.sicau.domain.User;
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
    private final UserServiceImpl userService=new UserServiceImpl();
    //定义切入点
    @Pointcut("@annotation(com.sicau.common.Log.Log)")
    public void pointcut(){

    }
    //处理完成之后执行
    @AfterReturning(pointcut = "pointcut()",returning = "resultData")
    public void afterExecute(final JoinPoint joinPoint, ResultBean resultData) {
        if (resultData.getState() == 1) {
        //获得注解
            Signature signature = joinPoint.getSignature();
            MethodSignature methodSignature = (MethodSignature) signature;
            Method method = methodSignature.getMethod();
            Log log = method.getAnnotation(Log.class);
            //完善要插入数据库的对象
            com.sicau.domain.Log dbLog = new com.sicau.domain.Log();
            //id
            dbLog.setLogId(String.valueOf(Math.random()).substring(2));
            //日志类型
            dbLog.setLogType(log.type());
            //日志信息
            dbLog.setLogMsg(log.msg());
            //日志产生时间
            Date date = new Date();
            dbLog.setLogTime(date);
            //谁产生的日志
            //String user=joinPoint.getArgs();
            int user = ((User) joinPoint.getArgs()[0]).getId();
            dbLog.setLogUser("id=" + user);
            //插入数据库
            logService.insert(dbLog);
        }
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
