package com.he.Bean;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

/**
 * @author he
 * @date 2021/11/4
 * @time 16:52
 * @message
 */
@Data
public class User {
    @NotNull(message = "id不能为空")
    @Length(min = 6,max=10,message = "id应为6-10位数字")
    private int id;
    @NotNull(message = "密码不能为空")
    @Length(min = 6,max=10,message = "密码应为6-10位字符")
    private String password;
}
