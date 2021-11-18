package com.he.Response;

import lombok.Data;

/**
 * @author he
 * @date 2021/11/18
 * @time 10:30
 * @message
 */
public enum ResultEnum {
    // 商品名字重复
    Name_Exist(1,"商品名重复"),
    // 不存在商品
    Commodity_Null(2,"商品不存在"),
    // 存在外键依赖
    Key_Rely(3,"存在外键依赖"),
    // 商品为空
    Commodity_Empty(4,"无商品"),
    // 数据未更改
    Not_Change(5,"数据未更改");
    private Integer code;
    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public static String getMessage(Integer code){
        for (ResultEnum resultEnum : ResultEnum.values()){
            if (resultEnum.code.equals(code)){
                return resultEnum.msg;
            }
        }
        return null;
    }
}
