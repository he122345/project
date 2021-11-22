package com.he.Response;

import com.he.exception.LogException;
import lombok.Data;

/**
 * @author he
 * @date 2021/11/18
 * @time 10:29
 * @message
 */
@Data
public class ResultBean<T> {
    private ResultBean(){};
    private Integer state;
    private String tip;
    private Integer code;
    private String message;
    private T data;
    public static ResultBean success(){
        ResultBean result=new ResultBean();
        result.state=1;
        result.code=200;
        result.tip="SUCCESS";
        return  result;
    }
    public static ResultBean fail(){
        ResultBean result=new ResultBean();
        result.state=0;
        result.code=400;
        result.tip="FAIL";
        return  result;
    }
    public ResultBean<T> setResultEnum(ResultEnum resultEnum) {
        this.code = resultEnum.getCode();
        this.message = resultEnum.getMsg();
        return this;
    }
    public ResultBean<T> setMsg(String msg){
        this.message=msg;
        return this;
    }
    public ResultBean<T> data(T data){
        this.data = data;
        return this;
    }
    public ResultBean<T> setLogException(LogException logException){
        this.code= logException.getCode();
        this.message= logException.getMessage();
        return this;
    }
    public ResultBean<T> setCodeMessage(Integer code,String message){
        this.code=code;
        this.message=message;
        return this;
    }
}
