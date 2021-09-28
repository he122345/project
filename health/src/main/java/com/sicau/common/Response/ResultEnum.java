package com.sicau.common.Response;

public enum ResultEnum {
    Param_NotBlank(1, "参数不能为空"),
    Email_FormatError(2, "邮箱格式不对"),
    Email_NotFound(3, "邮箱未注册"),
    Login_Success(4, "登录成功"),
    Login_Failure(5, "登录失败"),
    Register_Success(6, "注册成功"),
    Register_Fail(7, "注册失败"),
    Email_Enable(8, "邮箱可用"),
    Email_Disable(9, "邮箱已被注册"),
    Nickname_Enable(10, "昵称可用"),
    Nickname_Disable(11, "昵称已被注册"),
    Param_Error(12, "参数错误"),
    Not_Data(13, "没有数据"),
    Update_Success(14, "更新成功"),
    Update_Fail(15, "更新失败"),
    Delete_Success(16, "删除成功"),
    Delete_Fail(17, "删除失败"),
    Not_Login(18, "当前未登录"),
    Emil_Send_Success(19, "激活邮件已发送，请去邮箱查看"),
    Out_Success(20, "退出成功"),
    Out_Failure(21, "退出失败"),
    Permission_Denied(22,"权限不足"),
    Id_Exist(23,"id已存在"),
    Code_Fail(24,"验证码输入错误");
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

    public String getMsg1() {
        return this.code + "_" + this.getMsg();
    }

    ResultEnum(Integer code) {
        this.code = code;
    }

    public static String getMsg(Integer code) {
        for (ResultEnum resultEnum : ResultEnum.values()) {
            if (resultEnum.code.equals(code)) {
                return resultEnum.msg;
            }
        }
        return null;
    }

}
