package com.he.entity;

import lombok.Data;

/**
 * @author he
 * @date 2021/11/22
 * @time 11:31
 * @message
 */
@Data
public class Log {
    private String id;
    private String type;
    private Integer code;
    private String message;
    private String time;
}
