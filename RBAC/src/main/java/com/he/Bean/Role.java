package com.he.Bean;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

/**
 * @author he
 * @date 2021/11/4
 * @time 16:58
 * @message
 */
@Data
public class Role {
    @NotNull(message = "id不能为空")
    @Length(min = 1,max=10,message = "id应为1-10位数字")
    private int id;
    @NotNull(message = "名字不能为空")
    @Length(min = 1,max=10,message = "名字应为1-10位字符")
    private String name;
}
