package com.sicau.common.Log;

import java.lang.annotation.*;

/**
 * @author 11691
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Log {
    //日志类型
    int type();
    //日志信息
    String msg();

}