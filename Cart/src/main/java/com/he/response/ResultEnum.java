package com.he.response;


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
    Not_Change(5,"数据未更改"),
    // 数据已过期
    Data_Overdue(6,"数据已过期"),
    // 商品名不正确
    Incorrectly_Name(7,"商品名不正确"),
    // 未知错误
    Unknown_Error(8,"未知错误"),
    // 参数异常
    Illegal_Arguments(9,"参数格式错误"),
    // 系统异常
    System_Error(10,"系统异常");
    private Integer code;
    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public ResultEnum setCode(Integer code) {
        this.code = code;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public ResultEnum setMsg(String msg) {
        this.msg = msg;
        return this;
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
