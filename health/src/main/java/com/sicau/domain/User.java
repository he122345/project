package com.sicau.domain;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

/**
 * @author he
 * @date 2021/9/26
 * @time 18:50
 * @message
 */
@Data
public class User {
    @NotNull(message = "id不能为空")
    private int id;
    @NotNull(message = "用户名不能为空")
    @Length(min = 1,max=10,message = "用户名在1-10位之间")
    private String name;
    @NotNull(message = "密码不能为空")
    @Length(min = 1,max=10,message = "密码在1-10位之间")
    private String password;
    private String code;
}
