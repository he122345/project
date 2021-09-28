package com.sicau.domain;

import lombok.Data;

/**
 * @author he
 * @date 2021/9/26
 * @time 14:32
 * @message
 */

@Data
public class Doctor {
    private int id;
    private String photo;
    private String name;
    private String sex;
    private String department;
    private double point=-1.0;
}
