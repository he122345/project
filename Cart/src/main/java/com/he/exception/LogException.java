package com.he.exception;

import com.he.response.ResultBean;
import com.he.response.ResultEnum;
import lombok.Getter;

/**
 * @author he
 * @date 2021/11/22
 * @time 10:49
 * @message
 */
public class LogException extends RuntimeException{
    @Getter
    private final Integer code;
    @Getter
    private final String message;

    public LogException(ResultBean resultBean){
        super(resultBean.getMessage());
        this.code=resultBean.getCode();
        this.message=resultBean.getMessage();
    }
    public LogException(ResultEnum resultEnum){
        super(resultEnum.getMsg());
        this.code=resultEnum.getCode();
        this.message=resultEnum.getMsg();
    }

    public LogException(Integer code, String msg) {
        super(msg);
        this.code=code;
        this.message=msg;
    }
}
