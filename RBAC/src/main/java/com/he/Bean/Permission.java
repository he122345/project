package com.he.Bean;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

/**
 * @author he
 * @date 2021/11/4
 * @time 17:01
 * @message
 */
@Data
public class Permission {
    @NotNull(message = "id不能为空")
    @Length(min = 1,max=10,message = "id应为1-10位数字")
    private int id;
    @NotNull(message = "权限名不能为空")
    @Length(min = 1,max=10,message = "权限名应为1-10位字符")
    private String power;
}
