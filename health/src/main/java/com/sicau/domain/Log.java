package com.sicau.domain;


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
    private String logId;
    private Integer logType;
    private String logMsg;
    private Date logTime;
    private String logUser;
}
