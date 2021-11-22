package com.he.log;

import java.lang.annotation.*;

/**
 * @author 11691
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Log {
    // 错误类型
    String type();
}