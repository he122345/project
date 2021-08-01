package com.SALARY.domain;


import lombok.Data;

import java.util.Date;

/**
 * @author he
 * @date 2021/8/1
 * @time 9:46
 * @message
 */
@Data
public class Log {
    private String log_id;
    private Integer log_type;
    private String log_msg;
    private Date log_time;
    private String log_user;
}
